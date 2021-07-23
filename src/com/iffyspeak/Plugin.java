package com.iffyspeak;

import com.iffyspeak.commands.SampleCommand;
import com.iffyspeak.commands.SampleCommandTab;
import com.iffyspeak.listeners.EventListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * <h1>Example-Plugin</h1>
 * This project marks an example for spigot-beginners.
 * Please take a look at all of the files and interpret it like you want 
 * to, instead of only copying reasonless stuff.
 * 
 * 
 * @author Sonny J.
 * @contributor PlugDev
 * @version 1.0
 * 
 */


public class Plugin extends JavaPlugin {

	/**
	 * 
	 * This method will be start as first and it's used
	 * for registration-stuff etc.
	 * 
	 * @author Sonny J.
	 * @contributor PlugDev
	 * @version 1.0
	 * @since 1.0
	 * 
	 */
	
    @Override
    public void onEnable() {
    	Bukkit.getLogger().info("Plugin template has been enabled.");
        getCommand("sample").setExecutor(new SampleCommand());
        getCommand("sample").setTabCompleter(new SampleCommandTab());
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    
    /**
     * 
     * This method (should) contains the stuff like unregistration
     * instances etc.
     * 
     * @author Sonny J.
     * @contributor PlugDev
     * @version 1.0
     * @since 1.0
     * 
     */
    @Override
    public void onDisable() {
    	Bukkit.getLogger().info("Plugin template has been disabled.");
    }
}
