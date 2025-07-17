package net.szan.spectercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.damage.DamageSource;

public class AcidBlock extends Block {
    public AcidBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);

        if (!world.isClient && entity instanceof LivingEntity living) {
            living.damage(world.getDamageSources().magic(), 2.0F);
        }
    }
}
