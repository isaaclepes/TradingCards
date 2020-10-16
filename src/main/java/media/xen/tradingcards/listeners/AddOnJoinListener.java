package media.xen.tradingcards.listeners;


import media.xen.tradingcards.TradingCards;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddOnJoinListener extends SimpleListener{
	public AddOnJoinListener(final TradingCards plugin) {
		super(plugin);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (plugin.getMainConfig().autoAddPlayers) {
			Player p = e.getPlayer();
			GregorianCalendar gc = new GregorianCalendar();
			int date;
			int month;
			int year;
			if (p.hasPlayedBefore()) {
				gc.setTimeInMillis(p.getFirstPlayed());
			} else {
				gc.setTimeInMillis(System.currentTimeMillis());
			}
			date = gc.get(Calendar.DATE);
			month = gc.get(Calendar.MONTH) + 1;
			year = gc.get(Calendar.YEAR);

			ConfigurationSection rarities = plugin.getConfig().getConfigurationSection("Rarities");
			Set<String> rarityKeys = rarities.getKeys(false);
			Map<String, Boolean> children = plugin.permRarities.getChildren();
			String rarity = plugin.getMainConfig().autoAddPlayersRarity;
			Iterator<String> var11 = rarityKeys.iterator();

			String type;
			while (var11.hasNext()) {
				type = var11.next();
				children.put("cards.rarity." + type, false);
				plugin.permRarities.recalculatePermissibles();
				if (p.hasPermission("cards.rarity." + type)) {
					rarity = type;
					break;
				}
			}

			if (p.isOp()) {
				rarity = plugin.getMainConfig().playerOpRarity;
			}

			if (!plugin.getCardsConfig().getConfig().contains("Cards." + rarity + "." + p.getName())) {
				String series = plugin.getMainConfig().playerSeries;
				type = plugin.getMainConfig().playerType;
				boolean hasShiny = plugin.getMainConfig().playerHasShinyVersion;
				plugin.getCardsConfig().getConfig().set("Cards." + rarity + "." + p.getName() + ".Series", series);
				plugin.getCardsConfig().getConfig().set("Cards." + rarity + "." + p.getName() + ".Type", type);
				plugin.getCardsConfig().getConfig().set("Cards." + rarity + "." + p.getName() + ".Has-Shiny-Version", hasShiny);
				if (plugin.getMainConfig().americanMode) {
					plugin.getCardsConfig().getConfig().set("Cards." + rarity + "." + p.getName() + ".Info", "Joined " + month + "/" + date + "/" + year);
				} else {
					plugin.getCardsConfig().getConfig().set("Cards." + rarity + "." + p.getName() + ".Info", "Joined " + date + "/" + month + "/" + year);
				}

				plugin.getCardsConfig().saveConfig();
				plugin.getCardsConfig().reloadConfig();
			}
		}

	}
}
