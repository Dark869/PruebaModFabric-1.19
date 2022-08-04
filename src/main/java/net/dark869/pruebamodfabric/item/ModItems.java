package net.dark869.pruebamodfabric.item;

import net.dark869.pruebamodfabric.PruebaModFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ROCK = registerItem("rock",
            new Item(new FabricItemSettings().group(ModItemGroup.ROCK)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PruebaModFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PruebaModFabric.LOGGER.info("Registering Mod items for " + PruebaModFabric.MOD_ID);
    }
}
