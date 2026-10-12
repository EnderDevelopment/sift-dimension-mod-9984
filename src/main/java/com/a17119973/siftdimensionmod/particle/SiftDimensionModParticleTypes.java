package com.a17119973.siftdimensionmod.particle;

import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SiftDimensionModParticleTypes {
    public static final DefaultParticleType PORTAL_PARTICLE = new DefaultParticleType(false);

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("siftdimensionmod", "portal_particle"), PORTAL_PARTICLE);
    }
}