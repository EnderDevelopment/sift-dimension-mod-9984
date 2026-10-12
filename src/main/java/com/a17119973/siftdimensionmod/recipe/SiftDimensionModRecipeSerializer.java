package com.a17119973.siftdimensionmod.recipe;

import com.google.gson.JsonObject;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;

public class SiftDimensionModRecipeSerializer implements RecipeSerializer<SiftDimensionModRecipe> {
    public static final SiftDimensionModRecipeSerializer INSTANCE = new SiftDimensionModRecipeSerializer();

    @Override
    public SiftDimensionModRecipe read(Identifier id, JsonObject json) {
        // Implement recipe reading logic here
        return new SiftDimensionModRecipe();
    }

    @Override
    public SiftDimensionModRecipe read(Identifier id, PacketByteBuf buf) {
        // Implement recipe reading logic here
        return new SiftDimensionModRecipe();
    }

    @Override
    public void write(PacketByteBuf buf, SiftDimensionModRecipe recipe) {
        // Implement recipe writing logic here
    }
}