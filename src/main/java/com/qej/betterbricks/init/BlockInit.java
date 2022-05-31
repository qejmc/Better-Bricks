package com.qej.betterbricks.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.qej.betterbricks.BetterBricks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit 
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterBricks.MOD_ID);
    
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
    
    /*
     * STANDARD BRICK BLOCKS
     */
    
    public static final RegistryObject<Block> TAN_BRICKS = register("tan_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> GRAY_BRICKS = register("gray_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = register("light_gray_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> SANDSTONE_BRICKS = register("sandstone_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICKS = register("brown_multicolor_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICKS = register("tan_multicolor_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHEAT_BRICKS = register("wheat_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_BRICKS = register("white_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_THIN_BRICKS = register("white_thin_bricks", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    /*
     * STANDARD BRICK STAIRS
     */
    
    public static final RegistryObject<Block> TAN_BRICK_STAIRS = register("tan_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = register("gray_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICK_STAIRS = register("brown_multicolor_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICK_STAIRS = register("tan_multicolor_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHEAT_BRICK_STAIRS = register("wheat_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = register("white_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_THIN_BRICK_STAIRS = register("white_thin_brick_stairs", 
            () -> new StairBlock(() -> BlockInit.TAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    /*
     * STANDARD BRICK SLABS
     */
    
    public static final RegistryObject<Block> TAN_BRICK_SLAB = register("tan_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> GRAY_BRICK_SLAB = register("gray_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> BROWN_MULTICOLOR_BRICK_SLAB = register("brown_multicolor_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> TAN_MULTICOLOR_BRICK_SLAB = register("tan_multicolor_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHEAT_BRICK_SLAB = register("wheat_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = register("white_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    public static final RegistryObject<Block> WHITE_THIN_BRICK_SLAB = register("white_thin_brick_slab", 
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BetterBricks.BETTER_BRICKS_TAB)));
    
    /*
     * Register blocks
     */
    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) 
    {
        return BLOCKS.register(name, block);
    }
    
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) 
    {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
