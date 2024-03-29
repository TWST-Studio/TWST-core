package studio.twst.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import studio.twst.core.loader.PluginLoader;

public class TWSTCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (label) {
            case "twst" -> {
                if ("reload".equalsIgnoreCase(args[0]) && sender.isOp()) {
                    PluginLoader pluginLoader = new PluginLoader();
                    pluginLoader.loadConfig();
                }
                if ("help".equalsIgnoreCase(args[0])) {
                    sender.sendMessage("這是TWST基礎插件");

                }
            }
        }
        return false;
    }
}
