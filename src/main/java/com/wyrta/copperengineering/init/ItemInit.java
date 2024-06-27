package com.wyrta.copperengineering.init;

import com.wyrta.copperengineering.CopperEngineering;
import com.wyrta.copperengineering.util.CustomArmorMaterials;
import com.wyrta.copperengineering.util.CustomItemTier;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
	    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CopperEngineering.MODID);


	public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build())));
	public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTier.COPPER, 0, -2.4f, new Item.Properties()) );
	public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTier.COPPER, 0, -2.8f, new Item.Properties()) );
	public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTier.COPPER, 0, -3f, new Item.Properties()) );
	public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(CustomItemTier.COPPER, 0, -1f, new Item.Properties()) );
	public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTier.COPPER, 0, -3f, new Item.Properties()) );
	public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(CustomArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(CustomArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(CustomArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(CustomArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));


}
