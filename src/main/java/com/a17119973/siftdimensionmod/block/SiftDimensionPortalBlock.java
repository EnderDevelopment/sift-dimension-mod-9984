package com.a17119973.siftdimensionmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SiftDimensionPortalBlock extends Block {
    public SiftDimensionPortalBlock() {
        super(Settings.of(Material.PORTAL).strength(-1.0F, 3600000.0F).luminance(state -> 15));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            // Handle portal interaction here
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}