package studio.twst.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("TWST core plugin now enable");
        try {

            Path path = Paths.get("/TWST-core");

            //java.nio.file.Files;
            Files.createDirectories(path);

            Bukkit.getLogger().info("Directory is created!");

        } catch (IOException e) {

            Bukkit.getLogger().info("Failed to create directory!" + e.getMessage());

        }
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("TWST core plugin now disable");
        // Plugin shutdown logic
    }
}