package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.ItemTags;

public class SiftDimensionModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SiftDimensionModItemTagProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.PICKAXES)
            .add(SiftDimensionModItems.SIFTITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.ARMOR)
            .add(SiftDimensionModItems.SIFTITE_HELMET)
            .add(SiftDimensionModItems.SIFTITE_CHESTPLATE)
            .add(SiftDimensionModItems.SIFTITE_LEGGINGS)
            .add(SiftDimensionModItems.SIFTITE_BOOTS);
    }
}