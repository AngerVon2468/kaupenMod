package poggerz.kaupenModders.kaupen_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.*;

import poggerz.kaupenModders.kaupen_mod.block.kaupenModBlocks;
import poggerz.kaupenModders.kaupen_mod.itemgroup.kaupenModItemGroups;
import poggerz.kaupenModders.kaupen_mod.item.itemtags.kaupenModItemTags;
import poggerz.kaupenModders.kaupen_mod.item.kaupenModItems;
import poggerz.kaupenModders.kaupen_mod.util.annotation.kaupenPog;
import poggerz.kaupenModders.kaupen_mod.util.memez.kaupenPoggerz;

// TODO: KaupenSticks, KaupenOres, KaupenTools, KaupenBlocks, KaupenAttire, KaupenDimensions, KaupenMobs, KaupenPlants, KaupenItems, & full usage of Mavity Lib.
// dibs on kaupenTools (epiccool)
// dibs on kaupenAttire (Mavity)
// dibs on KaupenDimension, KaupenStructures, KaupenBugs, KaupenCrashes and the kaupenBlocks (GarnishHat)
public class kaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {

		// Initializing classes.
		kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main class.");
		kaupenModItemGroups.registerKaupenModItemGroups();
		kaupenModItemTags.registerKaupenModTags();
		kaupenModItems.registerKaupenModItems();
		kaupenModBlocks.registerKaupenModBlocks();

		// kaupenModders
		kaupenMod.kaupenModders(new kaupenPoggerz());
	}

	@kaupenPog
	public static void kaupenModders(kaupenPoggerz pog) {
		LOGGER.info("Mavity!");
		LOGGER.info("Garnish!");
		LOGGER.info("epiccool!");
		LOGGER.info("Tuna!");
		LOGGER.info("Okamiz!");
		LOGGER.info("mlodziak00!");
		LOGGER.info("Diemant!");
	}
}