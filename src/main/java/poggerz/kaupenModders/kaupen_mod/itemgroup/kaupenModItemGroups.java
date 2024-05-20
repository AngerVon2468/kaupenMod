package poggerz.kaupenModders.kaupen_mod.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import poggerz.kaupenModders.kaupen_mod.block.kaupenModBlocks;
import poggerz.kaupenModders.kaupen_mod.item.kaupenModItems;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

public class kaupenModItemGroups {
    public static final ItemGroup ALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(kaupenMod.MOD_ID, "all"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.kaupen_mod.all"))
                    .icon(() -> new ItemStack(Items.NETHER_STAR)).entries((displayContext, entries) -> {

                        entries.add(kaupenModItems.kaupenIngot);
                        entries.add(kaupenModItems.rawKaupenIngot);

                        entries.add(kaupenModItems.kaupenSword);
                        entries.add(kaupenModItems.kaupenPickaxe);

                        entries.add(kaupenModBlocks.kaupenOre);
                        entries.add(kaupenModBlocks.deepslateKaupenOre);
                        entries.add(kaupenModBlocks.kaupenOreBlock);

                        entries.add(kaupenModBlocks.kaupenDiscordBlock);
                        entries.add(kaupenModItems.kaupenDiscordItem);

                        entries.add(kaupenModItems.kaupenCosplay);
                        entries.add(kaupenModItems.kaupenCatEars);
                    }).build());

    public static void registerKaupenModItemGroups() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its itemgroups.");
    }
}