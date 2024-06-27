package com.wyrta.copperengineering.init;

import com.wyrta.copperengineering.CopperEngineering;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit
{
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CopperEngineering.MODID);



    public static final RegistryObject<CreativeModeTab> COPPERENGINEERING_TAB = TABS.register("copper_engineering", () -> CreativeModeTab.builder()
            .icon(() -> Items.COPPER_BLOCK.getDefaultInstance())
			.title(Component.literal("Copper Engineering"))
            .displayItems((parameters, output) -> {
                output.accept(BlockInit.EXAMPLE_BLOCK.get());
                output.accept(ItemInit.EXAMPLE_ITEM.get());
				
                output.accept(ItemInit.COPPER_SWORD.get());

                output.accept(ItemInit.COPPER_PICKAXE.get());
                output.accept(ItemInit.COPPER_AXE.get());
                output.accept(ItemInit.COPPER_HOE.get());
                output.accept(ItemInit.COPPER_SHOVEL.get());

                output.accept(ItemInit.COPPER_HELMET.get());
                output.accept(ItemInit.COPPER_CHESTPLATE.get());
                output.accept(ItemInit.COPPER_LEGGINGS.get());
                output.accept(ItemInit.COPPER_BOOTS.get());

            }).build());

}
