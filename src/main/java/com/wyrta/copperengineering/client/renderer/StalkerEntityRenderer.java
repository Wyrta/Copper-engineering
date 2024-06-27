package com.wyrta.copperengineering.client.renderer;


import com.wyrta.copperengineering.CopperEngineering;
import com.wyrta.copperengineering.StalkerEntity;
import com.wyrta.copperengineering.client.model.StalkerEntityModel;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StalkerEntityRenderer extends MobRenderer<StalkerEntity, StalkerEntityModel<StalkerEntity>> {
    public StalkerEntityRenderer(EntityRendererProvider.Context ctx)
	{
		super(ctx, new StalkerEntityModel<>(ctx.bakeLayer(StalkerEntityModel.LAYER_LOCATION)), 1.0f);
    }

	@Override
	public ResourceLocation getTextureLocation(StalkerEntity p_115812_)
	{
		return new ResourceLocation(CopperEngineering.MODID, "textures/entity/stalker.png");
	}
}