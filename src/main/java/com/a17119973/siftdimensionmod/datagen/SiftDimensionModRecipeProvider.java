package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

public class SiftDimensionModRecipeProvider extends FabricRecipeProvider {
    public SiftDimensionModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SiftDimensionModItems.SIFTITE_INGOT, RecipeCategory.MISC, SiftDimensionModItems.SIFTITE_ORE, 0.7f, 200, "siftite_ingot");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, SiftDimensionModItems.SIFTITE_INGOT, RecipeCategory.BUILDING_BLOCKS, SiftDimensionModBlocks.SIFTITE_BLOCK);
    }
}