package net.dark869.pruebamodfabric.item;

import net.dark869.pruebamodfabric.PruebaModFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Armor

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ROCK)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ROCK)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ROCK)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ROCK)));

    //Items
    public static final Item ROCK = registerItem("rock",
            new Item(new FabricItemSettings().group(ModItemGroup.ROCK)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PruebaModFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PruebaModFabric.LOGGER.info("Registering Mod items for " + PruebaModFabric.MOD_ID);
    }
}
