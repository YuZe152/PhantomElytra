package de.yuze.phantomelytra.core;

import de.yuze.phantomelytra.PhantomElytra;
import de.yuze.phantomelytra.listener.KillPhantom;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

/**
 * JavaDoc this file!
 * Created: 15.02.2023
 *
 * @author YuZe152
 */

public class Register {

    public Register() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new KillPhantom(), PhantomElytra.getInstance());
    }

}
