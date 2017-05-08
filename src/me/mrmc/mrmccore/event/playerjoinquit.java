package me.mrmc.mrmccore.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerjoinquit implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		event.setJoinMessage(null);
		Bukkit.broadcastMessage(ChatColor.AQUA + "[MrMCJoin] " + p.getName()
				+ "" + ChatColor.WHITE + "has join server");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 0);
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player p = event.getPlayer();
		event.setQuitMessage(null);
		Bukkit.broadcastMessage(ChatColor.RED + "[MrMCQuit] " + p.getName()
				+ "" + ChatColor.WHITE + "has left server");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 0);
	}

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		Player p = event.getPlayer();
		Bukkit.broadcastMessage(ChatColor.BLACK + "" + ChatColor.ITALIC + "["
				+ p.getName() + "connecting to server]");
	}

}
