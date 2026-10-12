package com.a17119973.siftdimensionmod.recipe;

import net.minecraft.recipe.RecipeType;

public class SiftDimensionModRecipeType {
    public static final RecipeType<SiftDimensionModRecipe> INSTANCE = new RecipeType<SiftDimensionModRecipe>() {
        @Override
        public String toString() {
            return "siftdimensionmod:example_recipe_type";
        }
    };
}