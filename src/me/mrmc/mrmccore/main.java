package me.mrmc.mrmccore;

import me.mrmc.mrmccore.event.playerjoinquit;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
		registerCommands();
		Server server = Bukkit.getServer();
		ConsoleCommandSender console = server.getConsoleSender();
		console.sendMessage(ChatColor.GREEN
				+ "[MrMCCore]Plugin has been enabled");

	}

	public void onDisable() {
		Server server = Bukkit.getServer();
		ConsoleCommandSender console = server.getConsoleSender();
		console.sendMessage(ChatColor.RED
				+ "[MrMCCore]Plugin has been disabled");

	}

	public void registerCommands() {
		getCommand("fly").setExecutor(new commands());
		getCommand("fly-on").setExecutor(new commands());
		getCommand("fly-off").setExecutor(new commands());
		getCommand("gms").setExecutor(new commands());
		getCommand("gmc").setExecutor(new commands());
		getCommand("gma").setExecutor(new commands());
		getCommand("gmsp").setExecutor(new commands());
		getCommand("heal").setExecutor(new commands());
		getCommand("feed").setExecutor(new commands());
	}

	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new playerjoinquit(), (this));
	}
}
