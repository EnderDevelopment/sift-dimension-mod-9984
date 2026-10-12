package com.a17119973.siftdimensionmod.dimension;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class SiftDimension {
    public static final RegistryKey<World> SIFT_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier("siftdimensionmod", "sift_dimension"));
    public static final RegistryKey<DimensionType> SIFT_DIMENSION_TYPE = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, SIFT_DIMENSION_KEY.getValue());

    public static void register() {
        // Register dimension here
    }
}