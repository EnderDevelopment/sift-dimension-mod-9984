package com.a17119973.siftdimensionmod.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class SiftDimensionModParticle {
    public static void register() {
        ParticleFactoryRegistry.getInstance().register(SiftDimensionModParticleTypes.PORTAL_PARTICLE, PortalParticle.Factory::new);
    }

    public static class PortalParticle extends SpriteBillboardParticle {
        protected PortalParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            super(world, x, y, z, velocityX, velocityY, velocityZ);
        }

        @Override
        public ParticleTextureSheet getType() {
            return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
        }
    }
}