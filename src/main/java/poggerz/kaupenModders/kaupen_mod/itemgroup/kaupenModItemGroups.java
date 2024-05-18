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

                        entries.add(kaupenModItems.KAUPEN_INGOT);
                        entries.add(kaupenModItems.RAW_KAUPEN);

                        entries.add(kaupenModItems.kaupenPickaxe);

                        entries.add(kaupenModBlocks.KAUPEN_ORE);
                        entries.add(kaupenModBlocks.DEEPSLATE_KAUPEN_ORE);
                        entries.add(kaupenModBlocks.KAUPEN_BLOCK);

                        entries.add(kaupenModBlocks.kaupenDiscordBlock);

                        entries.add(kaupenModItems.kaupenCosplay);
                        entries.add(kaupenModItems.kaupenCatEars);
                    }).build());

    public static void registerKaupenModItemGroups() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its' itemgroups.");
    }
}