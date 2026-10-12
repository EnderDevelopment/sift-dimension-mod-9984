package com.a17119973.siftdimensionmod.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SiftDimensionModRegistry {
    public static void register() {
        // Register blocks, items, and other components here
    }

    public static Identifier id(String path) {
        return new Identifier("siftdimensionmod", path);
    }
}