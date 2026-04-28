package me.yourname.alcohol;

import org.bukkit.plugin.java.JavaPlugin;

public class AlcoholPlugin extends JavaPlugin {

    private DrinkManager drinkManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("AlcoholPlugin has been enabled!");

        // Initialize managers
        drinkManager = new DrinkManager(this);

        // Register listeners
        getServer().getPluginManager().registerEvents(new DrinkListener(this), this);
        getServer().getPluginManager().registerEvents(new JoinListener(this), this);
        getServer().getPluginManager().registerEvents(new MoveListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("AlcoholPlugin has been disabled!");
    }

    public DrinkManager getDrinkManager() {
        return drinkManager;
    }
}