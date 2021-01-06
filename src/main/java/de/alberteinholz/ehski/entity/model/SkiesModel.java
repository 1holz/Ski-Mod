package de.alberteinholz.ehski.entity.model;

import de.alberteinholz.ehski.entity.Skies;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

@Environment(EnvType.CLIENT)
public class SkiesModel extends EntityModel<Skies> {
	private final ModelPart rMain =
	private final ModelPart rTip =
	private final ModelPart lMain =
	private final ModelPart lTip =

	public SkiesModel() {
		//textureWidth = 16;
		//textureHeight = 16;

		right = new ModelPart(this);
		right.setRotationPoint(-2.0F, 24.0F, 0.0F);
		right.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -8.0F, 2.0F, 1.0F, 30.0F, 0.0F, false);

		tip_r1 = new ModelPart(this);
		tip_r1.setRotationPoint(0.0F, 0.0F, 22.0F);
		right.addChild(tip_r1);
		setRotationAngle(tip_r1, 0.5236F, 0.0F, 0.0F);
		tip_r1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		left = new ModelPart(this);
		left.setRotationPoint(-2.0F, 24.0F, 0.0F);
		left.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -8.0F, 2.0F, 1.0F, 30.0F, 0.0F, false);

		tip_r2 = new ModelPart(this);
		tip_r2.setRotationPoint(6.0F, 0.0F, 22.0F);
		left.addChild(tip_r2);
		setRotationAngle(tip_r2, 0.5236F, 0.0F, 0.0F);
		tip_r2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {

	}

	public void setRotationAngle(ModelPart modelPartModelPart, float x, float y, float z) {
		modelPartModelPart.rotateAngleX = x;
		modelPartModelPart.rotateAngleY = y;
		modelPartModelPart.rotateAngleZ = z;
	}

	@Override
	public void setAngles(Skies entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		// TODO Auto-generated method stub

	}
}