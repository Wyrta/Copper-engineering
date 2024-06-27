package com.wyrta.copperengineering.init;


import com.wyrta.copperengineering.CopperEngineering;
import com.wyrta.copperengineering.StalkerEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit
{
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CopperEngineering.MODID);

    public static final RegistryObject<EntityType<StalkerEntity>> STALKER = ENTITIES.register("stalker", () -> EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.CREATURE).sized(0.6f, 1.8f).build("stalker"));
}