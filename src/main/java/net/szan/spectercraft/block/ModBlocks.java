package net.szan.spectercraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.szan.spectercraft.SpecterCraft;

public class ModBlocks {
    //=========================|ACID|====================================================
    public static final Block ACID = registerBlock("acid",
            new AcidBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.LIME)
                    .strength(0.5F)
                    .slipperiness(1.2F)
                    .nonOpaque()));
    //===================================================================================
    public static final Block ERROR_BLOCK = registerBlock("error_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
                    .sounds(BlockSoundGroup.CORAL)
                    .mapColor(MapColor.PURPLE)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .dropsNothing()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SpecterCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SpecterCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SpecterCraft.LOGGER.info("registering blocks: " + SpecterCraft.MOD_ID);
    }
}
