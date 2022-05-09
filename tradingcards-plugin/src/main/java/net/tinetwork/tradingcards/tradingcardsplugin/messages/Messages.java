package net.tinetwork.tradingcards.tradingcardsplugin.messages;

public final class Messages {
    public static final String PREFIX = "&7[&fCards&7]&7 ";
    public static final String RELOAD = "Successfully reloaded config!";
    public static final String NO_CARD = "No such card exists! make sure to use the exact card name!";
    public static final String NO_PLAYER = "That player does not exist!";
    public static final String NO_CMD = "Invalid command!";
    public static final String NO_ENTITY = "that entity/mob does not exist!";
    public static final String NO_CREATIVE = "you cannot open booster packs in creative!";
    public static final String NO_RARITY = "That rarity does not exist!";
    public static final String NO_BOOSTER_PACK = "That booster pack does not exist!";
    public static final String SCHEDULED_GIVEAWAY = "A card has been given to everyone on the server!";
    public static final String GIVEAWAY = "%player% has given everyone a random card of rarity %rarity%!";
    public static final String GIVEAWAY_NATURAL = "%player% has given everyone a random card!";
    public static final String GIVEAWAY_NATURAL_BOSS = "%player% has given everyone a random boss mob card!";
    public static final String GIVEAWAY_NATURAL_HOSTILE = "%player% gave everyone a random hostile mob card!";
    public static final String GIVEAWAY_NATURAL_PASSIVE = "%player% gave everyone a random passive mob card!";
    public static final String GIVEAWAY_NATURAL_NEUTRAL = "%player% gave everyone a random neutral mob card!";
    public static final String GIVEAWAY_NATURAL_BOSS_NO_PLAYER = "Everyone's received a random boss mob card!";
    public static final String GIVEAWAY_NATURAL_PASSIVE_NO_PLAYER = "Everyone's received a random passive mob card!";
    public static final String GIVEAWAY_NATURAL_HOSTILE_NO_PLAYER = "Everyone's received a random hostile mob card!";
    public static final String GIVEAWAY_NATURAL_NEUTRAL_NO_PLAYER = "Everyone's received a random neutral mob card!";
    public static final String GIVEAWAY_NATURAL_NO_PLAYER = "Everyone's received a random card!";
    public static final String GIVE_RANDOM_CARD = "You have been given a random card!";
    public static final String GIVE_RANDOM_CARD_MSG = "you have given %player% a random card!";
    public static final String GIVE_CARD = "You have given %player% card: %card%";
    public static final String BOOSTER_PACK_MSG = "you have been given a booster pack!";
    public static final String GIVE_BOOSTER_PACK_MSG = " You have given %player% a %pack%";
    public static final String OPEN_BOOSTER_PACK = "you opened a booster pack!";
    public static final String LIST_ERROR = "%name% is not online, or is not a rarity!";
    public static final String CAN_BUY = "this card can be bought for %buyamount%!";
    public static final String CAN_SELL = "this card can be sold for %sellamount%!";
    public static final String CANNOT_BUY = "this card cannot be bought!";
    public static final String CANNOT_SELL = "this card cannot be sold!";
    public static final String CHOOSE_CARD = "please specify a card!";
    public static final String CHOOSE_RARITY = "please specify a rarity!";
    public static final String CHOOSE_PACK = "please specify a pack!";
    public static final String CANNOT_BE_BOUGHT = "this cannot be bought!";
    public static final String NOT_ENOUGH_MONEY = "you do not have enough money to buy this!";
    public static final String BOUGHT_CARD = "successfully bought for %amount%!";
    public static final String NOT_A_CARD = "you need to be holding a card!";
    public static final String CARD_DOESNT_EXIST = "that card does not exist! make sure to use the exact card and rarity names with proper capitalization.";
    public static final String PACK_DOESNT_EXIST = "that pack does not exist! make sure to use the exact card and rarity names with proper capitalization.";
    public static final String NO_VAULT = "this server has disabled economy interactions!";
    public static final String DECK_CREATIVE_ERROR = "you are not allowed to use decks in creative!";
    public static final String GIVE_DECK = "you got a deck! hold it and right click to open!";
    public static final String ALREADY_HAVE_DECK = "you already have that deck in your inventory!";
    public static final String MAX_DECKS = "you do not have permission for this deck!";
    public static final String CREATE_HELP = "creates a card.";
    public static final String CREATE_NO_NAME = "invalid name! alphanumeric and underscores only!";
    public static final String CREATE_EXISTS = "that card already exists!";
    public static final String CREATE_SUCCESS = "successfully created %name%, rarity %rarity%!";
    public static final String TIMER_MESSAGE = "next card giveaway in %hour% hour(s)!";
    public static final String TOGGLE_ENABLED = "cards are now enabled!";
    public static final String TOGGLE_DISABLED = "cards are now disabled!";
    public static final String TOGGLE_HELP = "toggles card drops from mobs.";
    public static final String RESOLVE_MSG = "%name% = %uuid%";
    public static final String RESOLVE_ERROR = "%name% is not online!";
    public static final String REWARD_HELP = "collect a reward for collecting a whole rarity.";
    public static final String REWARD_ERROR = "that rarity does not exist!";
    public static final String REWARD_ERROR2 = "you have not collected all of that rarity!";
    public static final String REWARD_ERROR3 = "you have not collected all of that rarity! %shiny_name% cards do not count.";
    public static final String REWARD_BROADCAST = "%player% has collected all %RARITY% cards!";
    public static final String REWARD_DISABLED = "rewards have been disabled!";
    public static final String SECTION_FORMAT = "&6--- %s &7(&c%cards_owned%&f/&6%shiny_cards_owned%&f/&a%cards_total%&7)&6 ---";
    public static final String SECTION_FORMAT_PLAYER = "&e&l------- &7(&6&l%player%'s Collection&7)&e&l -------";
    public static final String SECTION_FORMAT_COMPLETE = "&6--- %s &7(&6%shiny_cards_owned%&f/%sComplete&7)&6 ---";
    public static final String PACK_SECTION = "&6--- Packs ---";
    public static final String DECK_INVENTORY_TITLE = "&c%player%'s Deck #%deck_num%";

    private Messages() {
        throw new UnsupportedOperationException(InternalExceptions.UTIL_CLASS);
    }
}