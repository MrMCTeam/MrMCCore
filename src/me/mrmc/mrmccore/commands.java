package me.mrmc.mrmccore;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class commands implements CommandExecutor {

	String prefix = ChatColor.AQUA + "[MrMCCore] " + ChatColor.RESET;

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("MrMC help")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.help")) {
				if (p.getAllowFlight() == false) {
					p.setAllowFlight(true);
					p.sendMessage(prefix + "" + ChatColor.GREEN
							+ "You flying are enabled!");
				}
			} else if (sender.hasPermission("MrMC.helpmember")) {

			}
		}

		if (cmd.getName().equalsIgnoreCase("fly")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.fly")) {
				if (p.getAllowFlight() == false) {
					p.setAllowFlight(true);
					p.sendMessage(prefix + "" + ChatColor.GREEN
							+ "You flying are enabled!");
					return true;
				}
				if (p.getAllowFlight() == true) {
					p.setAllowFlight(false);
					p.sendMessage(prefix + "" + ChatColor.RED
							+ "You flying are disabled!");
					return true;
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("fly-on")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.flyon")) {
				if (p.getAllowFlight() == false) {
					p.setAllowFlight(true);
					p.sendMessage(prefix + "" + ChatColor.GREEN
							+ "You flying are enabled!");
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("fly-off")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.flyoff")) {
				if (p.getAllowFlight() == true) {
					p.setAllowFlight(false);
					p.sendMessage(prefix + "" + ChatColor.RED
							+ "You flying are disabled!");
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("gms")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.gamemode")) {
				if (p.getGameMode() != GameMode.SURVIVAL) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage(prefix + "" + ChatColor.AQUA
							+ "You are in survival mode!");
				}
			}

		}

		if (cmd.getName().equalsIgnoreCase("gmc")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.gamemode")) {
				if (p.getGameMode() != GameMode.CREATIVE) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage(prefix + "" + ChatColor.AQUA
							+ "You are in creative mode!");

				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("gma")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.gamemode")) {
				if (p.getGameMode() != GameMode.ADVENTURE) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage(prefix + "" + ChatColor.AQUA
							+ "You are in adventure mode!");

				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("gmsp")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.gamemode")) {
				if (p.getGameMode() != GameMode.SPECTATOR) {
				p.setGameMode(GameMode.SPECTATOR);
				p.sendMessage(prefix + "" + ChatColor.AQUA
						+ "You are in spectator mode!");
			}}

		}
		if (cmd.getName().equalsIgnoreCase("heal")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.heal")) {
				p.setHealth(20);
				p.sendMessage(prefix + "Heal!");
				p.playSound(p.getLocation(), Sound.SPLASH2, 1, 1);
			}
		}
		if (cmd.getName().equalsIgnoreCase("feed")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.feed")) {
				p.setFoodLevel(20);
				p.sendMessage(prefix + "Feed!");
				p.playSound(p.getLocation(), Sound.BURP, 1, 1);
			}
		}
		if (cmd.getName().equalsIgnoreCase("invis")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.invisibility")) {
				p.addPotionEffect(new PotionEffect(
						PotionEffectType.INVISIBILITY, 9999, 1), true);
			}
		}
		if (cmd.getName().equalsIgnoreCase("uninvis")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.uninvisibility")) {
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
			}
		}
		if (cmd.getName().equalsIgnoreCase("flyspeed10")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.flyspeed")) {
				p.setFlySpeed(10);
			}
		}
		if (cmd.getName().equalsIgnoreCase("flyspeed1")) {
			Player p = (Player) sender;
			if (sender.hasPermission("MrMC.flyspeed")) {
				p.setFlySpeed(1);
			}
		}
		return true;
	}
}
