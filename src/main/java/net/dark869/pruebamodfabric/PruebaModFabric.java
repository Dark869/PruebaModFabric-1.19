package net.dark869.pruebamodfabric;

import net.dark869.pruebamodfabric.block.ModBlocks;
import net.dark869.pruebamodfabric.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaModFabric implements ModInitializer {
	public static final String MOD_ID = "pruebamodfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
