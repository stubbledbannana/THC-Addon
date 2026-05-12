package com.thcaddons;

import com.thcaddons.hud.THCHud;
import com.thcaddons.modules.ArmorNotify;
import com.thcaddons.modules.AntiFeetPlace;
import com.thcaddons.modules.AutoPortal;
import com.thcaddons.modules.SurroundPlus;
import com.thcaddons.modules.NoJumpDelay;
import com.thcaddons.modules.Phase;
import com.thcaddons.modules.DiscordNotifs;
import com.thcaddons.modules.AntiAnnouncement;
import com.thcaddons.modules.AutoFuckModule;
import com.thcaddons.modules.NewChunks;
import com.thcaddons.modules.BetterLocator;
import com.thcaddons.modules.AutoLogin;
import com.thcaddons.modules.MaceKill;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
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

        // Modules
        Modules.get().add(new ArmorNotify());
        Modules.get().add(new AntiFeetPlace());
        Modules.get().add(new AutoPortal());
        Modules.get().add(new SurroundPlus());
        Modules.get().add(new NoJumpDelay());
        Modules.get().add(new Phase());
        Modules.get().add(new DiscordNotifs());
        Modules.get().add(new AntiAnnouncement());
        Modules.get().add(new AutoFuckModule());
        Modules.get().add(new NewChunks());
        Modules.get().add(new BetterLocator());
        Modules.get().add(new AutoLogin());
	Modules.get().add(new MaceKill());

        // HUD
        Hud.get().register(THCHud.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.thcaddons";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("StubbledBannana", "thc-addon");
    }
}
