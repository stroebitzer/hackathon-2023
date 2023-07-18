package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class SheepCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning a sheep");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            Sheep sheep = player.getWorld().spawn(location, Sheep.class);
            sheep.setSheared(false);
            sheep.setColor(DyeColor.PINK);
            sheep.setTarget(player);
        }
        return true;
    }

}
