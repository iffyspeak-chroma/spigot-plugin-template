package com.iffyspeak;

import com.iffyspeak.commands.SampleCommand;
import com.iffyspeak.commands.SampleCommandTab;
import com.iffyspeak.listeners.EventListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AllChats extends JavaPlugin {

	
    @Override
    public void onEnable() {
    	Bukkit.getLogger().info("AllChat has been enabled.");
        //getCommand("sample").setExecutor(new SampleCommand());
        //getCommand("sample").setTabCompleter(new SampleCommandTab());
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }


    @Override
    public void onDisable() {
    	Bukkit.getLogger().info("AllChat has been disabled.");
    }
}
