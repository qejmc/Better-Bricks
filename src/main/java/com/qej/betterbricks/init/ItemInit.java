package com.qej.betterbricks.init;

import com.google.common.base.Supplier;
import com.qej.betterbricks.BetterBricks;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit 
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBricks.MOD_ID);
    
    public static final RegistryObject<Item> MORTAR = register("mortar", 
            () -> new Item(new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Item> TAN_DYE = register("tan_dye", 
            () -> new Item(new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) 
    {
        return ITEMS.register(name, item);
    }
}
