package poggerz.kaupenModders.kaupen_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import poggerz.kaupenModders.kaupen_mod.block.blocktype.kaupenDiscordBlock;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import wiiu.mavity.mavity_lib.block.BlockRegistry;

public class kaupenModBlocks {
    public static final Block kaupenDiscordBlock = BlockRegistry.registerBlock(kaupenMod.MOD_ID, "kaupen_discord_block",
            new kaupenDiscordBlock(FabricBlockSettings.create()));







    // ORES BLOCKS

    public static final Block KAUPEN_BLOCK = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block KAUPEN_ORE = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f,3.0f), UniformIntProvider.create(2, 4)));
    public static final Block DEEPSLATE_KAUPEN_ORE = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"deepslate_kaupen_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.5f,3.0f), UniformIntProvider.create(3, 7)));



    public static void registerKaupenModBlocks() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its items.");
    }
}