package me.mrmc.mrmccore.event;

import java.util.Calendar;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemClick implements Listener {

	@EventHandler
	public void onItemInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.WATCH) {
			Calendar cal = Calendar.getInstance();
			int hr = cal.get(Calendar.HOUR_OF_DAY);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			p.sendMessage("Time: " + hr + ":" + min + ":" + sec);
		}
	}

}
