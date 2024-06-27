package com.wyrta.copperengineering;

import com.wyrta.copperengineering.client.renderer.StalkerEntityRenderer;
import com.wyrta.copperengineering.init.*;

import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CopperEngineering.MODID)
public class CopperEngineering
{
    public static final String MODID = "copperengineering";
	public static final Logger LOGGER = LogUtils.getLogger();

    public CopperEngineering()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        EntityInit.ENTITIES.register(bus);

        // BlockEntityInit.BLOCK_ENTITIES.register(bus);
        // MenuInit.MENU_TYPES.register(bus);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
		{
			LOGGER.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            EntityRenderers.register(EntityInit.STALKER.get(), StalkerEntityRenderer::new);
        }
    }
}
