package poggerz.kaupenModders.kaupen_mod.item;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import wiiu.mavity.mavity_lib.cosmeticstuff.common.item.ClothingItem;
import wiiu.mavity.mavity_lib.item.ItemRegistry;
import wiiu.mavity.mavity_lib.property.PropertyInit;

public class kaupenModItems {
    public static final Item kaupenPickaxe = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_pickaxe", new PickaxeItem(kaupenModToolMaterial.KAUPEN, 2, 2f, PropertyInit.GTOI));

    public static final Item kaupenCosplay = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_cosplay", new ClothingItem(PropertyInit.GTOIU, "kaupen_cosplay"));

    public static void registerKaupenModItems() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its items.");
    }
}