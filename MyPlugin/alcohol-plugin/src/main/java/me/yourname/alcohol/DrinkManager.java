package me.yourname.alcohol;

import org.bukkit.plugin.java.JavaPlugin;

public class DrinkManager {

    private final JavaPlugin plugin;

    public DrinkManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    // Add methods for managing drinks here
    public void addDrink(String playerName, String drinkType) {
        // Implementation for adding a drink
        plugin.getLogger().info("Added drink " + drinkType + " for " + playerName);
    }

    public void removeDrink(String playerName) {
        // Implementation for removing a drink
        plugin.getLogger().info("Removed drink for " + playerName);
    }
}