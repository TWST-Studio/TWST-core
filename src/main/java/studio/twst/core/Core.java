package studio.twst.core;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import studio.twst.core.loader.PluginLoader;

public class Core extends JavaPlugin {

    public static Core core;

    @Override
    public void onEnable() {
        core = this;

        PluginLoader pluginLoader = new PluginLoader();
        pluginLoader.register();
        pluginLoader.loadConfig();
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        FileConfiguration config = this.getConfig();
        config.addDefault("welcome_message", "歡迎來到TWST!");
        config.options().copyDefaults(true);
        saveConfig();
        Bukkit.getLogger().info("TWST core plugin now enable");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("TWST core plugin now disable");
    }
}