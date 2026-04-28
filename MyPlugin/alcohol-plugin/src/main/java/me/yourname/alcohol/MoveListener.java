package me.yourname.alcohol;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener implements Listener {

    private final AlcoholPlugin plugin;

    public MoveListener(AlcoholPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        // Handle player movement, perhaps for drunk effects
        // For example, make movement wobbly if drunk
    }
}