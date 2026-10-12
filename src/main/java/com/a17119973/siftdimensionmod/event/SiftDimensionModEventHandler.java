package com.a17119973.siftdimensionmod.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiftDimensionModEventHandler {
    public static final Logger LOGGER = LoggerFactory.getLogger("siftdimensionmod");

    public static void register() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            LOGGER.info("Server starting");
        });

        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            // Handle block break event here
        });

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            // Handle block use event here
            return ActionResult.PASS;
        });
    }
}