package com.mimic.kaupentutorial.item;

import com.mimic.kaupentutorial.KaupenTutorial;
import com.mimic.kaupentutorial.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KAUPEN_TUTORIAL_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KaupenTutorial.MOD_ID, "kaupen_tutorial_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SUSPICIOUS_SUBSTANCE))
                    .displayName(Text.translatable("itemgroup.kaupentutorial.kaupen_tutorial_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SUSPICIOUS_SUBSTANCE);
                        entries.add(ModItems.PURPLE_POWDER);
                        entries.add(ModBlocks.SUSPICIOUS_BLOCK);
                    })
                    .build());

    public static void register() {
        KaupenTutorial.LOGGER.info("Registering Mod Item Groups for " + KaupenTutorial.MOD_ID);
    }
}
