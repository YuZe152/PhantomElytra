package de.yuze.phantomelytra;

import de.yuze.phantomelytra.core.Register;
import org.bukkit.plugin.java.JavaPlugin;

public final class PhantomElytra extends JavaPlugin {

    private static PhantomElytra instance;

    @Override
    public void onEnable() {
        instance = this;
        new Register();
    }

    public static PhantomElytra getInstance() {
        return instance;
    }
}
