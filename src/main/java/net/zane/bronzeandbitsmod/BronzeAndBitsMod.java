package net.zane.bronzeandbitsmod;

import net.fabricmc.api.ModInitializer;

import net.zane.bronzeandbitsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BronzeAndBitsMod implements ModInitializer {
	public static final String MOD_ID = "bronzeandbitsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}