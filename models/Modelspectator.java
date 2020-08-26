// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelspectator extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone6;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;

	public Modelspectator() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.2182F);
		bone.setTextureOffset(15, 16).addBox(-2.2155F, -7.8937F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, false);
		bone.setTextureOffset(0, 6).addBox(-0.725F, -7.2865F, -1.0F, 1.0F, 2.0F, 3.0F, 1.0F, false);
		bone.setTextureOffset(15, 11).addBox(-0.2459F, -8.241F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone6);
		bone6.setTextureOffset(14, 8).addBox(-2.5151F, -7.8341F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.1927F, -0.7599F, 1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.1745F);
		bone2.setTextureOffset(0, 0).addBox(0.7304F, -7.4574F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(15, 2).addBox(-2.9134F, -5.6194F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -0.0873F, -0.3054F, -0.2182F);
		bone3.setTextureOffset(0, 11).addBox(2.0712F, -14.2944F, 0.3797F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(10, 4).addBox(-1.0F, -13.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(8, 8).addBox(-0.6993F, -14.0832F, -4.0499F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(5, 6).addBox(0.0167F, -8.9979F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(7, 0).addBox(0.0F, -13.0001F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone4);
		bone4.setTextureOffset(4, 15).addBox(-0.368F, -9.9322F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(-0.3659F, -9.9218F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(bone10);
		bone10.setTextureOffset(13, 0).addBox(1.5475F, -6.3024F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.9239F, 0.3827F, -3.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0436F);
		bone5.setTextureOffset(12, 12).addBox(-0.7486F, -14.0192F, 2.9848F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0873F, 0.0F);
		bone7.setTextureOffset(0, 15).addBox(-2.6836F, -12.0803F, -0.0038F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		bone8.setTextureOffset(8, 12).addBox(-3.0872F, -13.0F, -2.0038F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0873F, -0.0873F, 0.0F);
		bone9.setTextureOffset(0, 0).addBox(-2.0F, -12.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.0872F, 0.0F, 0.9962F);
		bone7.addChild(bone11);
		setRotationAngle(bone11, 0.9163F, 0.0F, 0.0F);
		bone11.setTextureOffset(0, 0).addBox(-0.0579F, -4.8743F, 2.4454F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(1.0693F, -4.2419F, 4.2671F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(1.1948F, -6.6708F, 2.2949F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone12);
		bone12.setTextureOffset(0, 0).addBox(1.2437F, -4.8221F, 3.6547F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(1.0129F, -4.7985F, 6.3991F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, -0.9163F, 0.0F, 0.1309F);
		bone13.setTextureOffset(0, 0).addBox(-1.8904F, -1.5451F, 0.0136F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(0, 0).addBox(-1.5417F, -1.5451F, -3.9712F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(bone14);
		bone14.setTextureOffset(0, 0).addBox(-1.9406F, -0.5535F, -2.986F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(0, 0).addBox(-1.0501F, -1.0084F, -2.9996F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}