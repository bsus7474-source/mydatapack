package me.yourname.alcohol;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.Material;

public class DrinkListener implements Listener {

    private final AlcoholPlugin plugin;

    public DrinkListener(AlcoholPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDrink(PlayerItemConsumeEvent event) {
        if (event.getItem().getType() == Material.POTION) {
            // Handle drinking potion
            plugin.getDrinkManager().addDrink(event.getPlayer().getName(), "potion");
        }
    }
}