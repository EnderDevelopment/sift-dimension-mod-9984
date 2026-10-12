package com.a17119973.siftdimensionmod.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SiftDimensionModTag {
    public static final TagKey<Block> SIFTITE_ORE = TagKey.of(Registry.BLOCK_KEY, new Identifier("siftdimensionmod", "siftite_ore"));
    public static final TagKey<Item> SIFTITE_INGOT = TagKey.of(Registry.ITEM_KEY, new Identifier("siftdimensionmod", "siftite_ingot"));

    public static void register() {
        // Register tags here
    }
}