package com.a17119973.siftdimensionmod.network;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class SiftDimensionModNetwork {
    public static final Identifier PORTAL_OPEN_PACKET_ID = new Identifier("siftdimensionmod", "portal_open");

    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(PORTAL_OPEN_PACKET_ID, (server, player, handler, buf, responseSender) -> {
            // Handle portal open packet here
        });
    }
}