package studio.twst.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("TWST core plugin now enable");
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("TWST core plugin now disable");
        // Plugin shutdown logic
    }
}