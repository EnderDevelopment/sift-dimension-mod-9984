package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

public class SiftDimensionModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public SiftDimensionModBlockTagProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(SiftDimensionModBlocks.SIFTITE_ORE)
            .add(SiftDimensionModBlocks.SIFTITE_BLOCK);
    }
}