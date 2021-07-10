package com.iffyspeak.tools;

import org.bukkit.Bukkit;

public class Logger {

    public enum LogType {
        info,
        warning,
        severe
    }

    public Logger(String msg, LogType type)
    {
        switch (type) {

            case info:
                Bukkit.getLogger().info(msg);
                break;
            case warning:
                Bukkit.getLogger().warning(msg);
                break;
            case severe:
                Bukkit.getLogger().severe(msg);
                break;
        }
    }

}
