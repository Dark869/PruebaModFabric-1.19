package net.dark869.pruebamodfabric.item;

import net.dark869.pruebamodfabric.PruebaModFabric;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ROCK = FabricItemGroupBuilder.build(
            new Identifier(PruebaModFabric.MOD_ID, "rock"), () -> new ItemStack(ModItems.ROCK));
}
