package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class SiftDimensionModLootTableProvider extends FabricBlockLootTableProvider {
    public SiftDimensionModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(SiftDimensionModBlocks.SIFTITE_ORE);
        addDrop(SiftDimensionModBlocks.SIFTITE_BLOCK);
    }
}