package com.qej.betterbricks;

import com.qej.betterbricks.init.BlockInit;
import com.qej.betterbricks.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("betterbricks")
public class BetterBricks
{
    public static final String MOD_ID = "betterbricks";
    
    public static final CreativeModeTab BETTER_BRICKS_TAB = new CreativeModeTab(MOD_ID) 
    {    
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() 
        {
            return new ItemStack(BlockInit.GRAY_BRICKS.get());
        }
    };

    public BetterBricks()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

}
