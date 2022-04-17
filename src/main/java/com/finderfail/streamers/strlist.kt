package com.finderfail.streamers

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.Listener

class strlist : CommandExecutor, Listener {
    override fun onCommand(sender: CommandSender, nbtfix: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            return true
        }
        val player = sender
        if (nbtfix.name.equals("streamers", ignoreCase = true)) {
            player.sendMessage("[Streamers] Official streamers:")
            player.sendMessage("[Streamers] Twitch - finderfailOFF")
            player.sendMessage("[Streamers] YouTube -  Finderfail")
        }
        if (nbtfix.name.equals("links", ignoreCase = true)) {
            player.sendMessage("[Streamers] Official streamer links:")
            player.sendMessage("[Streamers] finderfailOFF https://twitch.tv/finderfailoff")
            player.sendMessage("[Streamers] Finderfail https://youtube.com/c/finderfail")
        }
        if (nbtfix.name.equals("info", ignoreCase = true)) {
            player.sendMessage("[Streamers] Abount this plugin:")
            player.sendMessage("[Streamers] Developed by finderfailoff")
            player.sendMessage("[Streamers] Use Kotlin")
            player.sendMessage("[Streamers] Builded by Maven")
        }
        return true
    }
}
