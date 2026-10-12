package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SiftDimensionModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SiftDimensionModBlockTagProvider::new);
        pack.addProvider(SiftDimensionModItemTagProvider::new);
        pack.addProvider(SiftDimensionModLootTableProvider::new);
        pack.addProvider(SiftDimensionModRecipeProvider::new);
        pack.addProvider(SiftDimensionModAdvancementProvider::new);
    }
}