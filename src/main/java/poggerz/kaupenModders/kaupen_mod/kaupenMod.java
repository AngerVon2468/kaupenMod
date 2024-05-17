package poggerz.kaupenModders.kaupen_mod;

import dev.emi.trinkets.api.client.*;

import net.fabricmc.api.ModInitializer;

import org.slf4j.*;

import poggerz.kaupenModders.kaupen_mod.block.kaupenModBlocks;
import poggerz.kaupenModders.kaupen_mod.itemgroup.kaupenModItemGroups;
import poggerz.kaupenModders.kaupen_mod.item.itemtags.kaupenModItemTags;
import poggerz.kaupenModders.kaupen_mod.item.kaupenModItems;
import poggerz.kaupenModders.kaupen_mod.util.annotation.kaupenPog;
import poggerz.kaupenModders.kaupen_mod.util.memez.kaupenPoggerz;

import wiiu.mavity.mavity_lib.config.MavityLibConfig;

// TODO: KaupenSticks, KaupenOres, KaupenTools, KaupenBlocks, KaupenAttire, KaupenDimensions, KaupenMobs, KaupenPlants, KaupenItems, & full usage of Mavity Lib.
public class kaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public final String cringe = MavityLibConfig.trollMavity;

	@Override
	public void onInitialize() {

		// Initializing classes.
		kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main class.");
		kaupenModItemGroups.registerKaupenModItemGroups();
		kaupenModItemTags.registerKaupenModTags();
		kaupenModItems.registerKaupenModItems();
		kaupenModBlocks.registerKaupenModBlocks();

		// Trinket Render
		TrinketRendererRegistry.registerRenderer(kaupenModItems.kaupenCatEars, (TrinketRenderer) kaupenModItems.kaupenCatEars);

		// kaupenModders
		kaupenMod.kaupenModders(new kaupenPoggerz(this.cringe));
	}

	@kaupenPog
	public static void kaupenModders(kaupenPoggerz pog) {
		LOGGER.info("Mavity The Madity!");
		LOGGER.info("GarnishHat!");
		LOGGER.info("epiccool!");
		LOGGER.info("TunaMods!");
		LOGGER.info("Okamiz!");
		LOGGER.info("mlodziak00!");
		LOGGER.info("Diemant!");
	}
}