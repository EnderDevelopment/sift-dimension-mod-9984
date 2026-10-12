package com.a17119973.siftdimensionmod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.ServerCommandSource;
import static net.minecraft.server.command.CommandManager.literal;

public class SiftDimensionModCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("siftdimensionmod")
            .then(literal("info").executes(context -> {
                // Handle info command here
                return 1;
            }))
            .then(literal("teleport").executes(context -> {
                // Handle teleport command here
                return 1;
            })));
    }
}