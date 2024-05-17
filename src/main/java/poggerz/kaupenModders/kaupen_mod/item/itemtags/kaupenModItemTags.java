package poggerz.kaupenModders.kaupen_mod.item.itemtags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import poggerz.kaupenModders.kaupen_mod.kaupenMod;

public class kaupenModItemTags {
    public static final TagKey<Item> kaupenStuff = TagKey.of(RegistryKeys.ITEM, new Identifier(kaupenMod.MOD_ID, "kaupen_stuff"));

    public static void registerKaupenModTags() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its' item tags.");
    }
}