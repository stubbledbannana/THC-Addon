package com.thcaddons.mixin;

import com.thcaddons.THCAddon;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class THCMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onGameLoaded(RunArgs args, CallbackInfo ci) {
        THCAddon.LOG.info("Hello from THCMixin!");
    }
}
