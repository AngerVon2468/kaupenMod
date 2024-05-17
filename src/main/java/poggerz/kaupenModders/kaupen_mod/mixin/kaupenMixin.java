package poggerz.kaupenModders.kaupen_mod.mixin;

import net.minecraft.server.MinecraftServer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import poggerz.kaupenModders.kaupen_mod.kaupenMod;

@Mixin(MinecraftServer.class)
public class kaupenMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		kaupenMod.LOGGER.info("LOGGER SPAM (" + kaupenMod.NAME + ")!");
	}
}