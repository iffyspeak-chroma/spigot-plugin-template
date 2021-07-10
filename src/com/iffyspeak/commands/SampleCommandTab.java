package com.iffyspeak.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class SampleCommandTab implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {

        List<String> stuff = Arrays.asList("","");

        if (strings.length == 1)
        {
            stuff.clear();
            for (Player p : Bukkit.getOnlinePlayers())
            {
                stuff.add(p.getName());
            }
            return stuff;
        }
        else {
            return null;
        }
    }
}
