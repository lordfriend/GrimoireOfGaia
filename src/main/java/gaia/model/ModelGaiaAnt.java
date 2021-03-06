package gaia.model;

import gaia.entity.monster.EntityGaiaAnt;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaAnt extends ModelGaia {
	// fields
	private ModelRenderer head;
	private ModelRenderer headeyes;
	private ModelRenderer headaccessory;
	private ModelRenderer neck;
	private ModelRenderer bodytop;
	private ModelRenderer bodymiddle;
	private ModelRenderer bodymiddlebutton;
	private ModelRenderer bodybottom;
	private ModelRenderer rightchest;
	private ModelRenderer leftchest;
	private ModelRenderer rightarm;
	private ModelRenderer leftarm;
	private ModelRenderer rightleg;
	private ModelRenderer leftleg;
	private ModelRenderer rightarm2;
	private ModelRenderer leftarm2;
	private ModelRenderer thorax1;

	public ModelGaiaAnt() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -6F, -3F, 6, 6, 6);
		head.setRotationPoint(0F, 1F, -2.5F);
		head.setTextureSize(64, 32);
		setRotation(head, 0F, 0F, 0F);
		headeyes = new ModelRenderer(this, 24, 0);
		headeyes.addBox(-3F, -6F, -3F, 6, 6, 0);
		headeyes.setRotationPoint(0F, 1F, -2.5F);
		headeyes.setTextureSize(64, 32);
		setRotation(headeyes, 0F, 0F, 0F);
		headaccessory = new ModelRenderer(this, 36, 0);
		headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		headaccessory.setRotationPoint(0F, 1F, -2.466667F);
		headaccessory.setTextureSize(64, 32);
		setRotation(headaccessory, 0F, 0F, 0F);
		neck = new ModelRenderer(this, 0, 12);
		neck.addBox(-1F, -1F, -1F, 2, 2, 2);
		neck.setRotationPoint(0F, 1F, -2.5F);
		neck.setTextureSize(64, 32);
		setRotation(neck, 0F, 0F, 0F);
		bodytop = new ModelRenderer(this, 0, 16);
		bodytop.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
		bodytop.setRotationPoint(0F, 1F, -2.5F);
		bodytop.setTextureSize(64, 32);
		setRotation(bodytop, 0.1745329F, 0F, 0F);
		bodymiddle = new ModelRenderer(this, 0, 25);
		bodymiddle.addBox(-2F, 5.5F, -2.5F, 4, 3, 2);
		bodymiddle.setRotationPoint(0F, 1F, -4F);
		bodymiddle.setTextureSize(64, 32);
		setRotation(bodymiddle, 0.6108652F, 0F, 0F);
		bodymiddlebutton = new ModelRenderer(this, 0, 25);
		bodymiddlebutton.addBox(-0.5F, 6F, -2.6F, 1, 2, 0);
		bodymiddlebutton.setRotationPoint(0F, 1F, -4F);
		bodymiddlebutton.setTextureSize(64, 32);
		setRotation(bodymiddlebutton, 0.6108652F, 0F, 0F);
		bodybottom = new ModelRenderer(this, 0, 30);
		bodybottom.addBox(-3F, 6.5F, -6F, 6, 3, 3);
		bodybottom.setRotationPoint(0F, 1F, -4F);
		bodybottom.setTextureSize(64, 32);
		setRotation(bodybottom, 1.047198F, 0F, 0F);
		rightchest = new ModelRenderer(this, 0, 36);
		rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		rightchest.setRotationPoint(-1.3F, 3F, -3.6F);
		rightchest.setTextureSize(64, 32);
		setRotation(rightchest, 0.9599311F, 0.1745329F, 0.0872665F);
		leftchest = new ModelRenderer(this, 0, 36);
		leftchest.mirror = true;
		leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		leftchest.setRotationPoint(1.3F, 3F, -3.6F);
		leftchest.setTextureSize(64, 32);
		setRotation(leftchest, 0.9599311F, -0.1745329F, -0.0872665F);
		rightarm = new ModelRenderer(this, 16, 12);
		getRightarm().addBox(-2F, -1F, -1F, 2, 10, 2);
		getRightarm().setRotationPoint(-2.5F, 2.5F, -2.5F);
		getRightarm().setTextureSize(64, 32);
		setRotation(getRightarm(), 0F, 0F, 0.2617994F);
		leftarm = new ModelRenderer(this, 16, 12);
		getLeftarm().mirror = true;
		getLeftarm().addBox(0F, -1F, -1F, 2, 10, 2);
		getLeftarm().setRotationPoint(2.5F, 2.5F, -2.5F);
		getLeftarm().setTextureSize(64, 32);
		setRotation(getLeftarm(), 0F, 0F, -0.2617994F);
		rightleg = new ModelRenderer(this, 24, 12);
		rightleg.addBox(-1F, -1F, -1F, 2, 7, 2);
		rightleg.setRotationPoint(-3F, 10F, 0F);
		rightleg.setTextureSize(64, 32);
		setRotation(rightleg, -0.2617994F, 0F, -0.1745329F);
		leftleg = new ModelRenderer(this, 24, 12);
		leftleg.mirror = true;
		leftleg.addBox(-1F, -1F, -1F, 2, 7, 2);
		leftleg.setRotationPoint(3F, 10F, 0F);
		leftleg.setTextureSize(64, 32);
		setRotation(leftleg, -0.2617994F, 0F, 0.1745329F);
		ModelRenderer hairahoge = new ModelRenderer(this, 36, 14);
		hairahoge.addBox(0.7F, -10F, -4.7F, 4, 4, 4);
		hairahoge.setRotationPoint(0F, 1F, -2.5F);
		hairahoge.setTextureSize(64, 32);
		setRotation(hairahoge, 0F, 0.7853982F, 0F);
		ModelRenderer headrighthair1 = new ModelRenderer(this, 36, 22);
		headrighthair1.addBox(-4F, -7F, 2F, 2, 2, 2);
		headrighthair1.setRotationPoint(0F, 1F, -2.5F);
		headrighthair1.setTextureSize(64, 32);
		setRotation(headrighthair1, 0F, 0F, 0F);
		ModelRenderer headlefthair1 = new ModelRenderer(this, 36, 22);
		headlefthair1.mirror = true;
		headlefthair1.addBox(2F, -7F, 2F, 2, 2, 2);
		headlefthair1.setRotationPoint(0F, 1F, -2.466667F);
		headlefthair1.setTextureSize(64, 32);
		setRotation(headlefthair1, 0F, 0F, 0F);
		ModelRenderer headrighthair2 = new ModelRenderer(this, 36, 26);
		headrighthair2.addBox(-5F, -6F, 3F, 2, 4, 2);
		headrighthair2.setRotationPoint(0F, 1F, -2.5F);
		headrighthair2.setTextureSize(64, 32);
		setRotation(headrighthair2, 0F, 0F, 0F);
		ModelRenderer headlefthair2 = new ModelRenderer(this, 36, 26);
		headlefthair2.mirror = true;
		headlefthair2.addBox(3F, -6F, 3F, 2, 4, 2);
		headlefthair2.setRotationPoint(0F, 1F, -2.466667F);
		headlefthair2.setTextureSize(64, 32);
		setRotation(headlefthair2, 0F, 0F, 0F);
		ModelRenderer headrighthair3 = new ModelRenderer(this, 36, 32);
		headrighthair3.addBox(-4F, -3F, 2F, 2, 2, 2);
		headrighthair3.setRotationPoint(0F, 1F, -2.5F);
		headrighthair3.setTextureSize(64, 32);
		setRotation(headrighthair3, 0F, 0F, 0F);
		ModelRenderer headlefthair3 = new ModelRenderer(this, 36, 32);
		headlefthair3.mirror = true;
		headlefthair3.addBox(2F, -3F, 2F, 2, 2, 2);
		headlefthair3.setRotationPoint(0F, 1F, -2.466667F);
		headlefthair3.setTextureSize(64, 32);
		setRotation(headlefthair3, 0F, 0F, 0F);
		ModelRenderer rightarmlower = new ModelRenderer(this, 64, 0);
		rightarmlower.addBox(-5F, 3F, -1.5F, 2, 6, 3);
		rightarmlower.setRotationPoint(-2.5F, 2.5F, -2.5F);
		rightarmlower.setTextureSize(128, 64);
		setRotation(rightarmlower, 0F, 0F, -0.0872665F);
		ModelRenderer leftarmlower = new ModelRenderer(this, 64, 0);
		leftarmlower.addBox(3F, 3F, -1.5F, 2, 6, 3);
		leftarmlower.setRotationPoint(2.5F, 2.5F, -2.5F);
		leftarmlower.setTextureSize(128, 64);
		setRotation(leftarmlower, 0F, 0F, 0.0872665F);
		ModelRenderer rightarmhand = new ModelRenderer(this, 64, 9);
		rightarmhand.addBox(-1F, 8F, -2F, 2, 2, 2);
		rightarmhand.setRotationPoint(-2.5F, 2.5F, -2.5F);
		rightarmhand.setTextureSize(64, 32);
		setRotation(rightarmhand, 0F, 0F, 0.2617994F);
		ModelRenderer leftarmhand = new ModelRenderer(this, 64, 9);
		leftarmhand.mirror = true;
		leftarmhand.addBox(-1F, 8F, -2F, 2, 2, 2);
		leftarmhand.setRotationPoint(2.5F, 2.5F, -2.5F);
		leftarmhand.setTextureSize(64, 32);
		setRotation(leftarmhand, 0F, 0F, -0.2617994F);
		rightarm2 = new ModelRenderer(this, 64, 13);
		rightarm2.addBox(-0.5F, -1F, -0.5F, 1, 3, 1);
		rightarm2.setRotationPoint(-2.5F, 6F, -2F);
		rightarm2.setTextureSize(64, 32);
		setRotation(rightarm2, 0.1745329F, -0.2617994F, 0.2617994F);
		leftarm2 = new ModelRenderer(this, 64, 13);
		leftarm2.mirror = true;
		leftarm2.addBox(-0.5F, -1F, -0.5F, 1, 3, 1);
		leftarm2.setRotationPoint(2.5F, 6F, -2F);
		leftarm2.setTextureSize(64, 32);
		setRotation(leftarm2, 0.1745329F, 0.2617994F, -0.2617994F);
		ModelRenderer rightarm2lower = new ModelRenderer(this, 64, 17);
		rightarm2lower.addBox(-0.5F, 0F, 1.5F, 1, 3, 1);
		rightarm2lower.setRotationPoint(-2.5F, 6F, -2F);
		rightarm2lower.setTextureSize(64, 32);
		setRotation(rightarm2lower, -1.396263F, -0.2617994F, 0.2617994F);
		ModelRenderer leftarm2lower = new ModelRenderer(this, 64, 17);
		leftarm2lower.mirror = true;
		leftarm2lower.addBox(-0.5F, 0F, 1.5F, 1, 3, 1);
		leftarm2lower.setRotationPoint(2.5F, 6F, -2F);
		leftarm2lower.setTextureSize(64, 32);
		setRotation(leftarm2lower, -1.396263F, 0.2617994F, -0.2617994F);
		thorax1 = new ModelRenderer(this, 64, 21);
		thorax1.addBox(-1.5F, 8.5F, -5F, 3, 1, 3);
		thorax1.setRotationPoint(0F, 1F, -4F);
		thorax1.setTextureSize(64, 32);
		setRotation(thorax1, 1.047198F, 0F, 0F);
		ModelRenderer thorax2 = new ModelRenderer(this, 64, 25);
		thorax2.addBox(-2F, 9.5F, -5.5F, 4, 5, 4);
		thorax2.setRotationPoint(0F, 1F, -4F);
		thorax2.setTextureSize(64, 32);
		setRotation(thorax2, 1.047198F, 0F, 0F);
		ModelRenderer thorax3 = new ModelRenderer(this, 64, 34);
		thorax3.addBox(-1F, 13.5F, -6.5F, 2, 2, 2);
		thorax3.setRotationPoint(0F, 1F, -4F);
		thorax3.setTextureSize(64, 32);
		setRotation(thorax3, 1.047198F, 0F, 0F);
		ModelRenderer rightlegknee = new ModelRenderer(this, 80, 0);
		rightlegknee.addBox(-0.5F, 0F, -7F, 2, 3, 2);
		rightlegknee.setRotationPoint(-3F, 10F, 0F);
		rightlegknee.setTextureSize(64, 32);
		setRotation(rightlegknee, 1.308997F, 0F, -0.0872665F);
		ModelRenderer leftlegknee = new ModelRenderer(this, 80, 0);
		leftlegknee.mirror = true;
		leftlegknee.addBox(-1.5F, 0F, -7F, 2, 3, 2);
		leftlegknee.setRotationPoint(3F, 10F, 0F);
		leftlegknee.setTextureSize(64, 32);
		setRotation(leftlegknee, 1.308997F, 0F, 0.0872665F);
		ModelRenderer rightleglower = new ModelRenderer(this, 80, 5);
		rightleglower.addBox(1F, 5.5F, 2F, 2, 7, 2);
		rightleglower.setRotationPoint(-3F, 10F, 0F);
		rightleglower.setTextureSize(64, 32);
		setRotation(rightleglower, -0.2617994F, 0F, 0.1745329F);
		ModelRenderer leftleglower = new ModelRenderer(this, 80, 5);
		leftleglower.mirror = true;
		leftleglower.addBox(-3F, 5.5F, 2F, 2, 7, 2);
		leftleglower.setRotationPoint(3F, 10F, 0F);
		leftleglower.setTextureSize(64, 32);
		setRotation(leftleglower, -0.2617994F, 0F, -0.1745329F);
		ModelRenderer rightlegfoot = new ModelRenderer(this, 80, 14);
		rightlegfoot.addBox(-0.5F, 12F, -2F, 2, 2, 2);
		rightlegfoot.setRotationPoint(-3F, 10F, 0F);
		rightlegfoot.setTextureSize(64, 32);
		setRotation(rightlegfoot, 0F, 0F, 0F);
		ModelRenderer leftlegfoot = new ModelRenderer(this, 80, 14);
		leftlegfoot.mirror = true;
		leftlegfoot.addBox(-1.5F, 12F, -2F, 2, 2, 2);
		leftlegfoot.setRotationPoint(3F, 10F, 0F);
		leftlegfoot.setTextureSize(64, 32);
		setRotation(leftlegfoot, 0F, 0F, 0F);

		convertToChild(head, hairahoge);
		convertToChild(head, headrighthair1);
		convertToChild(head, headlefthair1);
		convertToChild(head, headrighthair2);
		convertToChild(head, headlefthair2);
		convertToChild(head, headrighthair3);
		convertToChild(head, headlefthair3);
		convertToChild(getRightarm(), rightarmlower);
		convertToChild(getLeftarm(), leftarmlower);
		convertToChild(getRightarm(), rightarmhand);
		convertToChild(getLeftarm(), leftarmhand);
		convertToChild(rightarm2, rightarm2lower);
		convertToChild(leftarm2, leftarm2lower);
		convertToChild(thorax1, thorax2);
		convertToChild(thorax1, thorax3);
		convertToChild(rightleg, rightlegknee);
		convertToChild(rightleg, rightleglower);
		convertToChild(rightleg, rightlegfoot);
		convertToChild(leftleg, leftlegknee);
		convertToChild(leftleg, leftleglower);
		convertToChild(leftleg, leftlegfoot);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		head.render(scale);
		headeyes.render(scale);
		headaccessory.render(scale);
		neck.render(scale);
		bodytop.render(scale);
		bodymiddle.render(scale);
		bodymiddlebutton.render(scale);
		bodybottom.render(scale);
		rightchest.render(scale);
		leftchest.render(scale);
		getRightarm().render(scale);
		getLeftarm().render(scale);
		rightleg.render(scale);
		leftleg.render(scale);
		rightarm2.render(scale);
		leftarm2.render(scale);
		thorax1.render(scale);

		if (entityIn.ticksExisted % 60 == 0 && limbSwingAmount <= 0.1F) {
			headeyes.render(scale);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		// head
		head.rotateAngleY = netHeadYaw / 57.295776F;
		head.rotateAngleX = headPitch / 57.295776F;
		headeyes.rotateAngleY = head.rotateAngleY;
		headeyes.rotateAngleX = head.rotateAngleX;
		headaccessory.rotateAngleY = head.rotateAngleY;
		headaccessory.rotateAngleX = head.rotateAngleX;

		// arms
		getRightarm().rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
		getLeftarm().rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

		getRightarm().rotateAngleZ = 0.0F;
		getLeftarm().rotateAngleZ = 0.0F;

		ItemStack itemstack = ((EntityLivingBase) entityIn).getHeldItemMainhand();
		EntityGaiaAnt entity = (EntityGaiaAnt) entityIn;

		if (swingProgress > -9990.0F) {
			holdingMelee();
		}

		getRightarm().rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.2617994F;
		getRightarm().rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
		getLeftarm().rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.2617994F;
		getLeftarm().rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

		// body
		float thoraxDefaultAngleX = 1.047198F;

		thorax1.rotateAngleX = MathHelper.cos(degToRad((float) entityIn.ticksExisted * 7)) * degToRad(2);
		thorax1.rotateAngleX += thoraxDefaultAngleX;

		// legs
		rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
		leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;

		rightleg.rotateAngleX -= 0.1745329F;
		leftleg.rotateAngleX -= 0.1745329F;
	}


	public void holdingMelee() {
		float f6;
		float f7;

		f6 = 1.0F - swingProgress;
		f6 *= f6;
		f6 *= f6;
		f6 = 1.0F - f6;
		f7 = MathHelper.sin(f6 * (float) Math.PI);
		float f8 = MathHelper.sin(swingProgress * (float) Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;

		getRightarm().rotateAngleX = (float) ((double) getRightarm().rotateAngleX - ((double) f7 * 1.2D + (double) f8));
		getRightarm().rotateAngleX += (bodytop.rotateAngleY * 2.0F);
		getRightarm().rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
	}

	public ModelRenderer getRightarm() {
		return rightarm;
	}

	public ModelRenderer getLeftarm() {
		return leftarm;
	}
}
