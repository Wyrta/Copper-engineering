package com.wyrta.copperengineering.util;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum CustomItemTier implements Tier {
    COPPER(200, 2f, 1.5f, 2, 18, Ingredient.of(Items.COPPER_INGOT));


	private final int uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int level;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;

    CustomItemTier(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Ingredient repairIngredient) {
		this.uses = uses;
		this.speed = speed;
		this.attackDamageBonus = attackDamageBonus;
		this.level = level;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamageBonus;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}
}
