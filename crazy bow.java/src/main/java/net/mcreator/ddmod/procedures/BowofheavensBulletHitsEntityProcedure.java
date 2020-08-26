package net.mcreator.ddmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ddmod.DdModModElements;

import java.util.Map;

@DdModModElements.ModElement.Tag
public class BowofheavensBulletHitsEntityProcedure extends DdModModElements.ModElement {
	public BowofheavensBulletHitsEntityProcedure(DdModModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BowofheavensBulletHitsEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
