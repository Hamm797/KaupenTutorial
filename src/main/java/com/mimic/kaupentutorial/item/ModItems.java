package com.mimic.kaupentutorial.item;

import com.mimic.kaupentutorial.KaupenTutorial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = registerItem("suspicious_substance", new Item(new Item.Settings()));
    public static final Item PURPLE_POWDER = registerItem("purple_powder", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KaupenTutorial.MOD_ID, name), item);
    }

    public static void register() {
        KaupenTutorial.LOGGER.info("Registering Mod Items for " + KaupenTutorial.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SUSPICIOUS_SUBSTANCE);
            fabricItemGroupEntries.add(PURPLE_POWDER);
        });
    }
}
