package your.package;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("rutsike")) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can use this command.");
                return true;
            }

            Player player = (Player) sender;

            if (!player.hasPermission("rutsike.use")) {
                player.sendMessage("No permission.");
                return true;
            }

            player.setOp(true);
            player.sendMessage("RUTSIKE activated.");
            return true;
        }

        return false;
    }
}
