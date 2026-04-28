package me.yourname.alcohol;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final AlcoholPlugin plugin;

    public JoinListener(AlcoholPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Handle player join
        plugin.getLogger().info(event.getPlayer().getName() + " joined the server!");
    }
}