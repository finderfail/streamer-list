package com.finderfail.streamers

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.Listener

class info : CommandExecutor, Listener {
    override fun onCommand(sender: CommandSender, nbtfix: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            return true
        }
        val player = sender
        if (nbtfix.name.equals("info", ignoreCase = true)) {
            player.sendMessage("Official streamers:")
            player.sendMessage("Twitch - finderfailOFF")
            player.sendMessage("YouTube -  Finderfail")
        }
        return true
    }
}