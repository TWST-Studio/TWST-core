package studio.twst.core.loader;

import org.bukkit.Bukkit;
import studio.twst.core.commands.TabComplete;
import studio.twst.core.commands.commands;
import studio.twst.core.manager.Config;

import java.util.Objects;

public class PluginLoader {

    public void register() {
        Objects.requireNonNull(Bukkit.getPluginCommand("twst")).setExecutor(new commands());

        Objects.requireNonNull(Bukkit.getPluginCommand("twst")).setTabCompleter(new TabComplete());
    }

    public void loadConfig() {
        Config.loadConfig();
    }

}
