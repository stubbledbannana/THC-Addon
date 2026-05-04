package com.thcaddons.hud;

import com.thcaddons.THCAddon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class THCHud extends HudElement {
    /**
     * The {@code name} parameter should be in kebab-case.
     */
    public static final HudElementInfo<THCHud> INFO = new HudElementInfo<>(THCAddon.HUD_GROUP, "thc", "THC HUD element.", THCHud::new);

    public THCHud() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("THC element", true), renderer.textHeight(true));

        // Render background
        renderer.quad(x, y, getWidth(), getHeight(), Color.LIGHT_GRAY);

        // Render text
        renderer.text("THC element", x, y, Color.WHITE, true);
    }
}
