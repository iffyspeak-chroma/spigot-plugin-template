package com.iffyspeak.listeners;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Arrays;
import java.util.List;

public final class EventListener implements Listener {

	/*
    @EventHandler
    public final void onPlayerJoin(final PlayerJoinEvent event) {
    	event.setJoinMessage(event.getPlayer().getName() + " joined ^^, say hello to him/her.");
    }
	*/

	@EventHandler
	public final void onChatEvent(final AsyncPlayerChatEvent e)
	{
        /*
        List<String> playersInRange = Arrays.asList("");
        if (!e.getMessage().startsWith("@"))
        {
            // If the message doesn't start with @, do some stuff.

            for (Player p : Bukkit.getOnlinePlayers())
            {
                Location theirLoc = p.getLocation(); // Get the receiver's location
                double distanceToSender = Math.abs(e.getPlayer().getLocation().distance(theirLoc)); // Compare locations and get distance

                if (distanceToSender < 100)
                {
                     playersInRange.add(p.getName());// If the distance to sender is less than 100 units, go ahead and queue that player to the send message thing
                }
            }

            e.setCancelled(true);
            if (playersInRange.size() <= 0)
            {
                for (int pl = 0; pl < playersInRange.size(); pl++)
                {
                    //Player currentPlayer = playersInRange.get(pl);
                    Player currentPlayer = Bukkit.getPlayerExact(playersInRange.get(pl));
                    currentPlayer.sendMessage(e.getPlayer().getDisplayName() + " >> " + e.getMessage());
                }
            }
        } else
        {
            if (e.getPlayer().isOp())
            {*/
        if (e.getMessage().startsWith("@"))
                for (Player p : Bukkit.getOnlinePlayers())
                {
                    String formattedString = e.getMessage().substring(1);
                    e.setCancelled(true);
                    p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(e.getPlayer().getDisplayName() + " >> " + formattedString));
                }
            }
        }

