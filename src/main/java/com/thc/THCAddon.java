package com.thc;

import com.thc.hud.THCHud;
import com.thc.modules.MaceKill;
import com.thc.modules.PingSpoofer;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class THCAddon extends MeteorAddon {

    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("THC");
    public static final HudGroup HUD_GROUP = new HudGroup("THC");

    @Override
    public void onInitialize() {
        LOG.info("Initializing THC Addon");

        // Register Modules
        Modules.get().add(new MaceKill());
        Modules.get().add(new PingSpoofer());

        // Register HUD
        Hud.get().register(THCHud.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.thc";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("StubbledBannana", "THC-Addon");
    }
}
