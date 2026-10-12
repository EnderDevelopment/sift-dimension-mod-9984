package com.a17119973.siftdimensionmod.integration;

import net.fabricmc.loader.api.FabricLoader;

public class SiftDimensionModIntegration {
    public static void register() {
        if (FabricLoader.getInstance().isModLoaded("modmenu")) {
            // Register ModMenu integration here
        }
    }
}