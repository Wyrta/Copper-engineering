package com.wyrta.copperengineering.events;

import com.wyrta.copperengineering.CopperEngineering;
import com.wyrta.copperengineering.client.model.StalkerEntityModel;
import com.wyrta.copperengineering.client.renderer.StalkerEntityRenderer;
import com.wyrta.copperengineering.init.EntityInit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = CopperEngineering.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents
{
	@SubscribeEvent
	public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event)
	{
		event.registerEntityRenderer(EntityInit.STALKER.get(), StalkerEntityRenderer::new);
	}
	
	@SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event)
	{
        event.registerLayerDefinition(StalkerEntityModel.LAYER_LOCATION, StalkerEntityModel::createBodyLayer);
    }
}
