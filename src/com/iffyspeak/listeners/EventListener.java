package com.iffyspeak.listeners;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

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
        if (!e.getMessage().startsWith("@"))
        {
            List<Player> playersToMessage = null;
            for (Player p : Bukkit.getOnlinePlayers())
            {
                Location loc = p.getLocation();
                Location locSend = e.getPlayer().getLocation();

                if (locSend.distance(loc) <= 100)
                {
                    playersToMessage.add(p);
                }
            }

            if (playersToMessage != null) {
                for (int p = 0; p < playersToMessage.size(); p++)
                {
                    playersToMessage.get(p).sendMessage(e.getPlayer().getDisplayName() + " >> " + e.getMessage());
                    e.setCancelled(true);
                }
            }
        } else
        {
            if (e.getPlayer().isOp())
            {
                for (Player p : Bukkit.getOnlinePlayers())
                {
                    p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(e.getPlayer().getDisplayName() + " >> " + e.getMessage()));
                }
            }
        }

	}
}
