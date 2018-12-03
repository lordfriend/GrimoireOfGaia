package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.entity.monster.EntityGaiaGoblinFeral;
import gaia.model.ModelGaiaGoblinFeral;
import gaia.renderer.entity.layers.LayerGaiaHeldItem;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaGoblinFeral extends RenderLiving<EntityLiving> {
	private static final ResourceLocation texture01 = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/goblin_feral01.png");
	private static final ResourceLocation texture02 = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/alternate/goblin_feral02.png");

	public RenderGaiaGoblinFeral(RenderManager renderManager, float shadowSize) {
		super(renderManager, new ModelGaiaGoblinFeral(), shadowSize);
		addLayer(LayerGaiaHeldItem.right(this, getModel().getRightArm()));
		addLayer(LayerGaiaHeldItem.left(this, getModel().getLeftArm()));
	}

	private ModelGaiaGoblinFeral getModel() {
		return (ModelGaiaGoblinFeral) getMainModel();
	}

	@Override
	public void transformHeldFull3DItemLayer() {
		GlStateManager.translate(0.0F, 0.1875F, 0.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return getTexture((EntityGaiaGoblinFeral) entity);
	}

	private ResourceLocation getTexture(EntityGaiaGoblinFeral entity) {
		switch (entity.getTextureType()) {
		case 0:
			return texture01;
		case 1:
			return texture02;
		default:
			return texture01;
		}
	}
}