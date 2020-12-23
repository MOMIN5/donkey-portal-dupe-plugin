package com.momin5.donkeydupe;


import com.momin5.donkeydupe.events.PortalEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class DonkeyDupe extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PortalEvent(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[DonkeyDupe] The Plugin is now Enabled");
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[DonkeyDupe] The Plugin is now Disabled");

    }
}
