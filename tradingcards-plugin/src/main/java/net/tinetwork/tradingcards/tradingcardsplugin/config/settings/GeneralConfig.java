package net.tinetwork.tradingcards.tradingcardsplugin.config.settings;

import net.tinetwork.tradingcards.api.config.settings.GeneralConfigurate;
import net.tinetwork.tradingcards.tradingcardsplugin.TradingCards;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.ConfigurationNode;

import java.io.File;

public class GeneralConfig extends GeneralConfigurate {
    private boolean debugMode;

    private boolean useDefaultCardsFile;

    //Cards
    private Material cardMaterial;
    private String cardPrefix;
    private String shinyName;

    //Decks
    private boolean deckInCreative;
    private boolean useDeckItem;
    private boolean useLargeDecks;
    private Material deckMaterial;
    private String deckPrefix;
    private boolean dropDeckItems;
    private int deckRows;

    //Packs
    private Material packMaterial;
    private String packPrefix;


    //Player
    private String playerOpRarity;
    private String playerSeries;
    private String playerType;
    private boolean playerHasShinyVersion;
    private boolean playerDropsCard;
    private int playerDropsCardRarity;

    //Rewards
    private boolean allowRewards;
    private boolean rewardBroadcast;
    private boolean eatShinyCards;

    //Vault
    private boolean vaultEnabled;
    private boolean closedEconomy;
    private String serverAccount;

    private boolean spawnerBlock;
    private String spawnerMobName;
    private int infoLineLength;

    private String colorPackName;
    private String colorPackLore;
    private String colorPackNormal;
    private String colorListHaveCard;
    private String colorListHaveCardShiny;
    private String colorRarityCompleted;

    private String displayTitle;
    private String displayShinyTitle;
    private String displaySeries;
    private String displayType;
    private String displayInfo;
    private String displayAbout;

    private ItemStack blankCard;
    private ItemStack blankBoosterPack;
    private ItemStack blankDeck;

    public GeneralConfig(TradingCards plugin) throws ConfigurateException {
        super(plugin, "settings" + File.separator,"general.yml", "settings");
    }

    @Override
    protected void initValues() throws ConfigurateException {
        this.debugMode = rootNode.node("debug-mode").getBoolean(false);

        this.useDefaultCardsFile = rootNode.node("use-default-cards-file").getBoolean(true);

        //Cards
        this.cardMaterial= rootNode.node("card-material").get(Material.class, Material.PAPER);
        this.cardPrefix = rootNode.node("card-prefix").getString("Card ");
        this.shinyName = rootNode.node("shiny-name").getString("Shiny");

        //Decks
        this.deckInCreative = rootNode.node("decks-in-creative").getBoolean(false);
        this.useDeckItem = rootNode.node("use-deck-item").getBoolean(true);
        //We should change this to deck size, or num of rows in deck
        this.useLargeDecks = rootNode.node("use-large-decks").getBoolean(false);
        this.deckRows = rootNode.node("deck-rows").getInt(6);

        this.deckMaterial = rootNode.node("deck-material").get(Material.class, Material.BOOK);
        this.deckPrefix = rootNode.node("deck-prefix").getString("&7[&fDeck&7]&f ");
        this.dropDeckItems = rootNode.node("drop-deck-items").getBoolean(true);

        //Packs
        this.packMaterial = rootNode.node("booster-pack-material").get(Material.class, Material.BOOK);
        this.packPrefix = rootNode.node("booster-pack-prefix").getString("&7[&fPack&7]&f ");

        //Player Drops
        this.playerOpRarity = rootNode.node("player-op-rarity").getString("Legendary");
        this.playerSeries = rootNode.node("player-series").getString("Legacy");
        this.playerType = rootNode.node("player-type").getString("Player");
        this.playerHasShinyVersion = rootNode.node("player-has-shiny-version").getBoolean(true);
        this.playerDropsCard = rootNode.node("player-drops-card").getBoolean(true);
        this.playerDropsCardRarity = rootNode.node("player-drops-card-rarity").getInt(1000000);
        //Rewards
        this.allowRewards = rootNode.node("allow-rewards").getBoolean(true);
        this.rewardBroadcast = rootNode.node("reward-broadcast").getBoolean(true);
        this.eatShinyCards = rootNode.node("eat-shiny-cards").getBoolean(false);

        //Vault
        this.vaultEnabled = rootNode.node("vault-enabled").getBoolean(true);
        this.closedEconomy = rootNode.node("closed-economy").getBoolean(false);
        this.serverAccount = rootNode.node("server-account").getString("TradingCards-Bank");

        //Misc
        this.spawnerBlock = rootNode.node("spawner-block").getBoolean(true);
        this.spawnerMobName = rootNode.node("spawner-mob-name").getString("Spawned Mob");
        this.infoLineLength = rootNode.node("info-line-length").getInt(25);

        final ConfigurationNode colorNode = rootNode.node("colors");
        //Colors
        //colors-packs
        final ConfigurationNode colorPacksNode = colorNode.node("packs");
        this.colorPackName = colorPacksNode.node("booster-pack-name").getString();
        this.colorPackLore = colorPacksNode.node("booster-pack-lore").getString();
        this.colorPackNormal = colorPacksNode.node("booster-pack-normal-cards").getString();
        //colors-lists
        final ConfigurationNode colorListsNode = colorNode.node("lists");
        this.colorListHaveCard = colorListsNode.node("list-have-card").getString();
        this.colorListHaveCardShiny = colorListsNode.node("list-have-shiny-card").getString();
        this.colorRarityCompleted = colorListsNode.node("list-rarity-complete").getString();

        //Display
        final ConfigurationNode displayNode = rootNode.node("display");
        this.displayTitle = displayNode.node("title").getString();
        this.displayShinyTitle = displayNode.node("shiny-title").getString();
        this.displaySeries = displayNode.node("series").getString();
        this.displayType = displayNode.node("type").getString();
        this.displayInfo = displayNode.node("info").getString();
        this.displayAbout = displayNode.node("about").getString();
    }


    @Override
    protected void preLoaderBuild() {
        //nothing to add
    }

    public ItemStack blankCard() {
        if(blankCard == null)
            this.blankCard = new ItemStack(cardMaterial());
        return blankCard;
    }

    public ItemStack blankBoosterPack() {
        if(blankBoosterPack == null)
            this.blankBoosterPack = new ItemStack(new ItemStack(packMaterial()));
        return blankBoosterPack;
    }

    public ItemStack blankDeck() {
        if(blankDeck == null)
            this.blankDeck = new ItemStack(deckMaterial());
        return blankDeck;
    }

    public Material deckMaterial() {
        return deckMaterial;
    }

    public String deckPrefix() {
        return deckPrefix;
    }

    public boolean dropDeckItems() {
        return dropDeckItems;
    }

    public String playerOpRarity() {
        return playerOpRarity;
    }

    public String playerSeries() {
        return playerSeries;
    }

    public String playerType() {
        return playerType;
    }

    public boolean playerHasShinyVersion() {
        return playerHasShinyVersion;
    }

    public boolean allowRewards() {
        return allowRewards;
    }

    public boolean rewardBroadcast() {
        return rewardBroadcast;
    }

    public boolean eatShinyCards() {
        return eatShinyCards;
    }

    public boolean playerDropsCard() {
        return playerDropsCard;
    }

    public int playerDropsCardRarity() {
        return playerDropsCardRarity;
    }

    public boolean vaultEnabled() {
        return vaultEnabled;
    }

    public boolean closedEconomy() {
        return closedEconomy;
    }

    public String serverAccount() {
        return serverAccount;
    }

    public boolean spawnerBlock() {
        return spawnerBlock;
    }

    public String spawnerMobName() {
        return spawnerMobName;
    }

    public int infoLineLength() {
        return infoLineLength;
    }

    public boolean deckInCreative() {
        return deckInCreative;
    }

    public boolean useDeckItem() {
        return useDeckItem;
    }

    public boolean useLargeDecks() {
        return useLargeDecks;
    }

    public boolean debugMode() {
        return debugMode;
    }

    public String cardPrefix() {
        return cardPrefix;
    }

    public String shinyName() {
        return shinyName;
    }

    public Material cardMaterial() {
        return cardMaterial;
    }

    public Material packMaterial() {
        return packMaterial;
    }

    public String colorPackName() {
        return colorPackName;
    }

    public String colorPackLore() {
        return colorPackLore;
    }

    public String colorPackNormal() {
        return colorPackNormal;
    }

    public String colorListHaveCard() {
        return colorListHaveCard;
    }

    public String colorListHaveCardShiny() {
        return colorListHaveCardShiny;
    }

    public String colorRarityCompleted() {
        return colorRarityCompleted;
    }

    public String packPrefix() {
        return packPrefix;
    }

    public String displayTitle() {
        return displayTitle;
    }

    public String displayShinyTitle() {
        return displayShinyTitle;
    }

    public String displaySeries() {
        return displaySeries;
    }

    public String displayType() {
        return displayType;
    }

    public String displayInfo() {
        return displayInfo;
    }

    public String displayAbout() {
        return displayAbout;
    }

    public boolean useDefaultCardsFile(){
        return useDefaultCardsFile;
    }

    public int deckRows() {
        return deckRows;
    }
}
