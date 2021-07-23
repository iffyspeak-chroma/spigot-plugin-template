package com.iffyspeak.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class EventListener implements Listener {
	
	/**
	 * 
	 * If someone joins the spigot-instance, this method is being used
	 * as first.
	 * 
	 * @author Sonny J.
	 * @contributor PlugDev
	 * @version 1.0
	 * @since 1.0
	 * 
	 */
	
    @EventHandler
    public final void onPlayerJoin(final PlayerJoinEvent event) {
    	event.setJoinMessage(event.getPlayer().getName() + " joined ^^, say hello to him/her.");
    }

}
