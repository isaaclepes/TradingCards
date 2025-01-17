package net.tinetwork.tradingcards.tradingcardsplugin.storage.impl.local;

import net.tinetwork.tradingcards.tradingcardsplugin.TradingCards;
import net.tinetwork.tradingcards.tradingcardsplugin.utils.Util;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.configurate.ConfigurateException;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CardsConfig {
    private final File cardsFolder;
    private final TradingCards plugin;
    private final YamlStorage yamlStorage;
    private Map<String,SimpleCardsConfig> cardConfigs;
    public CardsConfig(final TradingCards plugin, YamlStorage yamlStorage) {
        this.plugin = plugin;

        createCardsFolder(plugin);
        if(plugin.getGeneralConfig().useDefaultCardsFile())
            createDefaultCardConfig(plugin);

        this.cardsFolder = new File(plugin.getDataFolder().getPath() + File.separator + "cards");
        this.yamlStorage = yamlStorage;
        initValues();
    }

    public void initValues() {
        this.cardConfigs = new HashMap<>();
        File[] files = cardsFolder.listFiles();
        if(files == null) {
            plugin.getLogger().warning("There are no files in the cards folder.");
            return;
        }

        for (File file : files) {
            plugin.debug(CardsConfig.class,"File name: " + file.getName());
            if (file.getName().endsWith(".yml")) {
                try {
                    cardConfigs.put(file.getName(),new SimpleCardsConfig(plugin, file.getName(), yamlStorage));
                    plugin.debug(CardsConfig.class,"Added: " + file.getName());
                } catch (ConfigurateException e) {
                    plugin.getLogger().severe(e.getMessage());
                }
            }
        }
    }

    private void createCardsFolder(final @NotNull TradingCards plugin) {
        final File cardsFolder = new File(plugin.getDataFolder() + File.separator + "cards");
        if (!cardsFolder.exists())
            cardsFolder.mkdir();
    }

    private void createDefaultCardConfig(final TradingCards plugin) {
        try {
            new SimpleCardsConfig(plugin, "cards.yml", yamlStorage).saveDefaultConfig();
        } catch (ConfigurateException e) {
            Util.logSevereException(e);
        }
    }

    public Map<String,SimpleCardsConfig> getCardConfigs() {
        return cardConfigs;
    }
}
