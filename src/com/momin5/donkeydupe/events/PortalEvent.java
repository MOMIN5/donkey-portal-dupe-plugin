package com.momin5.donkeydupe.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class PortalEvent implements Listener {
    @EventHandler
    public void onEntityDeath(EntityDeathEvent b){
        Entity entity = b.getEntity();
        if(entity.getType() == EntityType.DONKEY) {
                double randomDouble = Math.random();
                randomDouble *= 6.0D;
                int randomInt = (int) randomDouble;
                for (int i = 0; i < randomInt; i++) {
                    for (int x = 0; x < b.getDrops().size(); x++)
                        entity.getWorld().dropItemNaturally(entity.getLocation(), b.getDrops().get(x));
                }
            }
        if(entity.getType() == EntityType.LLAMA) {
             double randomDouble = Math.random();
             randomDouble *= 6.0D;
             int randomInt = (int)randomDouble;
             for (int i = 0; i < randomInt; i++){
                 for(int x = 0; x < b.getDrops().size(); x++)
                     entity.getWorld().dropItemNaturally(entity.getLocation(), b.getDrops().get(x));
             }
            }
        }
}


