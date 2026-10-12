package com.a17119973.siftdimensionmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SiftiteOreBlock extends Block {
    public SiftiteOreBlock() {
        super(Settings.of(Material.STONE).strength(3.0F, 3.0F));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            // Handle block interaction here
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}