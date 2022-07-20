package studio.twst.core;

import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin now enable");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin now disable");
        // Plugin shutdown logic
    }
}
