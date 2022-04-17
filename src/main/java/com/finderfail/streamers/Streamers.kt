package com.finderfail.streamers

import org.bukkit.plugin.java.JavaPlugin
import com.finderfail.streamers.strlist

class Streamers : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        val commands = strlist()
        server.pluginManager.registerEvents(strlist(), this)
        getCommand("streamers")!!.setExecutor(commands)
        getCommand("links")!!.setExecutor(commands)
        getCommand("info")!!.setExecutor(commands)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}