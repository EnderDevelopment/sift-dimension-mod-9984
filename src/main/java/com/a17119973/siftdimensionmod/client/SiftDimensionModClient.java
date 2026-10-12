package com.a17119973.siftdimensionmod.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiftDimensionModClient implements ClientModInitializer {
    public static final String MOD_ID = "siftdimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing Sift Dimension Mod Client");
        // Initialize client-side components here
    }
}