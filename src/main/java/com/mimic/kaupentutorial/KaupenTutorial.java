package com.mimic.kaupentutorial;

import com.mimic.kaupentutorial.block.ModBlocks;
import com.mimic.kaupentutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenTutorial implements ModInitializer {
	public static final String MOD_ID = "kaupentutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	}
}