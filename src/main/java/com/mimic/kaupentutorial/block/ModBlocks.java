package com.mimic.kaupentutorial.block;

import com.mimic.kaupentutorial.KaupenTutorial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SUSPICIOUS_BLOCK = registerBlock("suspicious_block", new Block(AbstractBlock.Settings.create()
            .strength(4F)
            .requiresTool()
            .sounds(BlockSoundGroup.SAND)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KaupenTutorial.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(KaupenTutorial.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        KaupenTutorial.LOGGER.info("Registering Mod Blocks for " + KaupenTutorial.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SUSPICIOUS_BLOCK);
        });
    }
}
