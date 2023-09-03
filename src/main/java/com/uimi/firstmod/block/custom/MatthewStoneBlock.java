package com.uimi.firstmod.block.custom;

import com.uimi.firstmod.item.custom.MatthewStone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class MatthewStoneBlock extends Block {
    public MatthewStoneBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState blockState, World world, BlockPos blockPos, PlayerEntity playerEntity,
                                             Hand hand, BlockRayTraceResult p_225533_6_) {
        if (!world.isRemote) {
            if (hand == Hand.MAIN_HAND) {
                System.out.println("I right clicked by main hand");
            }
            if (hand == Hand.OFF_HAND) {
                System.out.println("I right clicked by off hand");
            }
        }

        return super.onBlockActivated(blockState, world, blockPos, playerEntity, hand, p_225533_6_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onBlockClicked(BlockState blockState, World world, BlockPos blockPos, PlayerEntity playerEntity) {
        if (!world.isRemote) {
            System.out.println("I left clicked!");
        }

        super.onBlockClicked(blockState, world, blockPos, playerEntity);
    }

    @Override
    public void onEntityWalk(World p_176199_1_, BlockPos p_176199_2_, Entity p_176199_3_) {
        MatthewStone.lightEntityOnFire(p_176199_3_, 5);
        super.onEntityWalk(p_176199_1_, p_176199_2_, p_176199_3_);
    }
}
