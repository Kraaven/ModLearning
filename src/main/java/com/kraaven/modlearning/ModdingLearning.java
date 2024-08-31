package com.kraaven.modlearning;

import com.kraaven.modlearning.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingLearning implements ModInitializer {
	public static final String MOD_ID = "moddinglearning";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
	}
}