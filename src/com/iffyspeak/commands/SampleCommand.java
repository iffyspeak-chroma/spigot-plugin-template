package com.iffyspeak.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class SampleCommand implements CommandExecutor {

	/**
	 * 
	 * The method onCommand() will be "started", if executing a command. ~ simple,
	 * right?
	 * 
	 * @author Sonny J.
	 * @contributor PlugDev
	 * @version 1.0
	 * @since 1.0
	 * 
	 */

	@Override
	public boolean onCommand(final CommandSender commandSender, final Command command, final String string,
			final String[] args) {
		if (!(commandSender instanceof Player)) {
			commandSender.sendMessage("§cThis command can only run a valid player.");
			return true;
		}

		Player player = (Player) commandSender;
		player.sendMessage("Test");
		return true;
	}
}
