package poggerz.kaupenModders.kaupen_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

import net.minecraft.item.SwordItem;
import poggerz.kaupenModders.kaupen_mod.item.itemtype.trinket.kaupenCatEarsTrinket;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import net.lightglow.cosmlib.common.item.ClothingItem;

import wiiu.mavity.mavity_lib.item.ItemRegistry;
import wiiu.mavity.mavity_lib.property.PropertyInit;

public class kaupenModItems {
    public static final Item kaupenPickaxe = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_pickaxe", new PickaxeItem(kaupenModToolMaterial.KAUPEN, 2, 2f, PropertyInit.GTOI));
    public static final Item kaupenSword = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_sword", new SwordItem(kaupenModToolMaterial.KAUPEN, 5, 3f, PropertyInit.GTOI));

    public static final Item kaupenCosplay = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_cosplay", new ClothingItem(PropertyInit.GTOIU, kaupenMod.MOD_ID, "kaupen_cosplay"));

    public static final Item kaupenCatEars = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_cat_ears", new kaupenCatEarsTrinket(PropertyInit.GTOIU));







    // MATERIALS

    public static final Item rawKaupenIngot = ItemRegistry.registerItem(kaupenMod.MOD_ID, "raw_kaupen",
            new Item(new FabricItemSettings()));
    public static final Item kaupenIngot = ItemRegistry.registerItem(kaupenMod.MOD_ID, "kaupen_ingot",
            new Item(new FabricItemSettings()));



    public static void registerKaupenModItems() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its items.");
    }
}