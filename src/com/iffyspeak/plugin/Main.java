package com.iffyspeak.plugin;

import com.iffyspeak.commands.SampleCommand;
import com.iffyspeak.commands.SampleCommandTab;
import com.iffyspeak.tools.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Logger("Plugin template has been enabled.", Logger.LogType.info);
        getCommand("sample").setExecutor(new SampleCommand());
        getCommand("sample").setTabCompleter(new SampleCommandTab());
    }

    @Override
    public void onDisable() {
        new Logger("Plugin template has been disabled.", Logger.LogType.info);
    }
}
