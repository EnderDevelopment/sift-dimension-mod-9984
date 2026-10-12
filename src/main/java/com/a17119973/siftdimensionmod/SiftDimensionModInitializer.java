package com.a17119973.siftdimensionmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiftDimensionModInitializer implements ModInitializer {
    public static final String MOD_ID = "siftdimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Sift Dimension Mod");
        // Initialize mod components here
    }

    public void onStop() {
        LOGGER.info("Stopping Sift Dimension Mod");
    }
}