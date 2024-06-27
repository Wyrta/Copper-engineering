package com.wyrta.copperengineering;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.ImmutableList;
import com.wyrta.copperengineering.init.EntityInit;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class StalkerEntity extends Mob {
	public StalkerEntity(EntityType<StalkerEntity> entityType, Level p_20967_)
	{
		super(entityType, p_20967_);
	}

    public StalkerEntity(Level level, double x, double y, double z)
	{
        this(EntityInit.STALKER.get(), level);
        setPos(x, y, z);
    }

    public StalkerEntity(Level level, BlockPos position)
	{
        this(level, position.getX(), position.getY(), position.getZ());
    }

	public static AttributeSupplier.Builder createAttributes()
	{
        return Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 10.0D)
            .add(Attributes.MOVEMENT_SPEED, 1.0D);
    }

	public static boolean canSpawn(EntityType<StalkerEntity> entityType, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource random) {
        return spawnType == MobSpawnType.SPAWNER || level.getBlockState(position).isValidSpawn(level, position, entityType);
    }


	@Override
	public Iterable<ItemStack> getArmorSlots()
	{
		return ImmutableList.of();
	}

	@Override
	public ItemStack getItemBySlot(EquipmentSlot p_21127_)
	{
		return ItemStack.EMPTY;
	}

	@Override
	public void setItemSlot(EquipmentSlot p_21036_, ItemStack p_21037_)
	{
		return;
	}

	@Override
	public HumanoidArm getMainArm()
	{
		return HumanoidArm.RIGHT;
	}
}