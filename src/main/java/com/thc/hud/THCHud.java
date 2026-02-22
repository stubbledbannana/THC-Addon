package com.thc.hud;

import com.thc.THCAddon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class THCHud extends HudElement {

    public static final HudElementInfo<THCHud> INFO =
        new HudElementInfo<>(THCAddon.HUD_GROUP, "thc-hud", "THC Element.", THCHud::new);

    public THCHud() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        String textString = "THC element";

        setSize(renderer.textWidth(textString, true), renderer.textHeight(true));

        // Dark green translucent background
        Color background = new Color(0, 40, 0, 200);

        // Bright neon green text
        Color text = new Color(57, 255, 20, 255);

        renderer.quad(x, y, getWidth(), getHeight(), background);
        renderer.text(textString, x, y, text, true);
    }
}
