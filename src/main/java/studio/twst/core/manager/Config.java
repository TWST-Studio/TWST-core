package studio.twst.core.manager;

import org.bukkit.configuration.file.YamlConfiguration;
import studio.twst.core.Core;

import java.io.File;

public class Config {

    private static YamlConfiguration yamlConfiguration;

    public static YamlConfiguration getYaml() {
        return yamlConfiguration;
    }

    public static void loadConfig() {
        File file = new File(Core.core.getDataFolder(), "config.yml");
        yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    }

}
