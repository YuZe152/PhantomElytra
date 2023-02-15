package de.yuze.phantomelytra.listener;

import org.bukkit.Material;
import org.bukkit.entity.Phantom;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

/**
 * JavaDoc this file!
 * Created: 15.02.2023
 *
 * @author YuZe152
 */

public class KillPhantom implements Listener {

    @EventHandler
    public void onKillPhantom(EntityDeathEvent event) {
        Phantom entity = (Phantom) event.getEntity();
        if (event.getEntity().equals(entity))
            entity.getWorld().dropItemNaturally(entity.getLocation(), new ItemStack(Material.ELYTRA, 1));
    }

}
