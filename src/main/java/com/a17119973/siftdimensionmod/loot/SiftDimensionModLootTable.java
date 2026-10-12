package com.a17119973.siftdimensionmod.loot;

import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

public class SiftDimensionModLootTable {
    public static void register() {
        LootTable.Builder.create(LootContextTypes.BLOCK)
            .pool(LootPool.builder()
                .rolls(UniformLootTableRange.between(1.0F, 3.0F))
                .with(ItemEntry.builder(SiftDimensionModItems.SIFTITE_ORE))
                .with(ItemEntry.builder(SiftDimensionModItems.SIFTITE_INGOT).weight(2))
            )
            .build(new Identifier("siftdimensionmod", "blocks/siftite_ore"));
    }
}