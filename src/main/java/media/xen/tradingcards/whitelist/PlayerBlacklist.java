package media.xen.tradingcards.whitelist;

import media.xen.tradingcards.config.SimpleConfig;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * @author ketelsb
 */
public class PlayerBlacklist {
    private SimpleConfig config;
    private String listedPlayersName = "Players";
    private String whitelistModeName = "Whitelist-Mode";
    private List<String> listedPlayers;
    private WhitelistMode whitelistMode;

    public PlayerBlacklist(SimpleConfig config) {
        this.config = config;
        loadPlayers();
        setWhitelistMode();
    }

    private void loadPlayers() {
        listedPlayers = this.config.getConfig().getStringList(listedPlayersName);
    }

    private void setWhitelistMode() {
        boolean isWhitelist = this.config.getConfig().getBoolean(whitelistModeName);
        if (isWhitelist)
            this.whitelistMode = WhitelistMode.WHITELIST;
        else
            this.whitelistMode = WhitelistMode.BLACKLIST;
    }

    public boolean isAllowed(Player p) {
        boolean isOnList = listedPlayers.contains(p.getName());

        //If you're not on the blacklist, you're allowed
        if (this.whitelistMode == WhitelistMode.BLACKLIST) {
            return !isOnList;
        }

        //If you're on the whitelist, you're allowed
        if (this.whitelistMode == WhitelistMode.WHITELIST) {
            return isOnList;
        }

        return false;
    }

    public void add(Player p) {
        listedPlayers.add(p.getName());
        this.config.getConfig().set(listedPlayersName, null);
        this.config.getConfig().set(listedPlayersName, listedPlayers);
        this.config.saveConfig();
    }

    public void remove(Player p) {
        listedPlayers.remove(p.getName());
        this.config.getConfig().set(listedPlayersName, null);
        this.config.getConfig().set(listedPlayersName, listedPlayers);
        this.config.saveConfig();
    }
}