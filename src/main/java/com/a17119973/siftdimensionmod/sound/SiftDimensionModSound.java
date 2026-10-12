package com.a17119973.siftdimensionmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SiftDimensionModSound {
    public static final Identifier PORTAL_OPEN_ID = new Identifier("siftdimensionmod", "portal_open");
    public static final SoundEvent PORTAL_OPEN = SoundEvent.of(PORTAL_OPEN_ID);

    public static void register() {
        Registry.register(Registry.SOUND_EVENT, PORTAL_OPEN_ID, PORTAL_OPEN);
    }
}