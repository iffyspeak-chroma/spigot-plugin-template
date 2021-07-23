package com.iffyspeak.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public final class SampleCommandTab implements TabCompleter {

	/**
	 * 
	 * The method onTabComplete() will be "started", if someone tabs ingame.
	 * ~ simple, hehe
	 * 
	 * @author Sonny J.
	 * @contributor PlugDev
	 * @version 1.0
	 * @since 1.0
	 * 
	 */
	
	
	@Override
	public final List<String> onTabComplete(final CommandSender commandSender, final Command command,
			final String string, final String[] args) {
		final List<String> stuff = Arrays.asList("", "");
		if (args.length == 1) {
			stuff.clear();
			for (Player player : Bukkit.getOnlinePlayers())
				stuff.add(player.getName());
			return stuff;
		}

		return null;
	}
}
