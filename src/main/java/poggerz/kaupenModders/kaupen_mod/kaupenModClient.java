package poggerz.kaupenModders.kaupen_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class kaupenModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main client class.");
        }
    }
}