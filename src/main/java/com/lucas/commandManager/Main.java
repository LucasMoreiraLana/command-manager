package com.lucas.commandManager;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        new TestCommand();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
