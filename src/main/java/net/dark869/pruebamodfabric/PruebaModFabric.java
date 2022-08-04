package net.dark869.pruebamodfabric;

import net.dark869.pruebamodfabric.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class PruebaModFabric implements ModInitializer {
	public static final String MOD_ID = "pruebamodfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItem.registerModItems();
	}

}
