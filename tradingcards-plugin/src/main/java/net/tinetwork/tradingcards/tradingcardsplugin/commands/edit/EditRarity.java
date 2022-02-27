package net.tinetwork.tradingcards.tradingcardsplugin.commands.edit;

/**
 * @author sarhatabaot
 */
public enum EditRarity implements Edit{
    DISPLAY_NAME,
    DEFAULT_COLOR,
    BUY_PRICE,
    SELL_PRICE,
    ADD_REWARD,
    REMOVE_REWARD,
    REMOVE_ALL_REWARDS;


    @Override
    public String editName() {
        return "rarity";
    }
}
