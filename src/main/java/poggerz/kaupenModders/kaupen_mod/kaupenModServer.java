package poggerz.kaupenModders.kaupen_mod;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class kaupenModServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main server class.");
        }
    }
}