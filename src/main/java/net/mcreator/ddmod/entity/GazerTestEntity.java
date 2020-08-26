
package net.mcreator.ddmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.ddmod.DdModModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@DdModModElements.ModElement.Tag
public class GazerTestEntity extends DdModModElements.ModElement {
	public static EntityType entity = null;
	public GazerTestEntity(DdModModElements instance) {
		super(instance, 4);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("gazer_test")
						.setRegistryName("gazer_test");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13369600, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("gazer_test"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelspectator(), 0.5f) {
				{
					this.addLayer(new GlowingLayer<>(this));
				}
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("dd_mod:textures/gazer_texture.png");
				}
			};
		});
	}
	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(true);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("dd_mod:textures/gazer_texture.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
