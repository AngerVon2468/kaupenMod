package poggerz.kaupenModders.kaupen_mod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.*;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import poggerz.kaupenModders.kaupen_mod.block.blocktype.kaupenDiscordBlock;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import wiiu.mavity.mavity_lib.block.BlockRegistry;

public class kaupenModBlocks {
    public static final Block kaupenDiscordBlock = BlockRegistry.registerBlock(kaupenMod.MOD_ID, "kaupen_discord_block",
            new kaupenDiscordBlock(FabricBlockSettings.create()));

    // Wood Blocks

    public static final Block kaupenLog = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block kaupenStrippedLog = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"stripped_kaupen_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));

    public static final Block kaupenWood = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));

    public static final Block kaupenStrippedWood = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"stripped_kaupen_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block kaupenPlanks = BlockRegistry.registerBlock(kaupenMod.MOD_ID, "kaupen_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block kaupenPolishedStone = BlockRegistry.registerBlock(kaupenMod.MOD_ID, "polished_kaupenstone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).strength(4f)));

    public static final Block kaupenLeaves = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    //public static final Block kaupenSapling = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_sapling",
    //        new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));;



    //public static final Block kaupenLeaves = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_leaves.json",
      //new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

    // Ore Blocks

    public static final Block kaupenOreBlock = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block kaupenOre = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"kaupen_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f,3.0f), UniformIntProvider.create(2, 4)));
    public static final Block deepslateKaupenOre = BlockRegistry.registerBlock(kaupenMod.MOD_ID,"deepslate_kaupen_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.5f,3.0f), UniformIntProvider.create(3, 7)));

    public static void registerKaupenModBlocks() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its items.");
        }
    }
}