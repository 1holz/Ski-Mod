package de.alberteinholz.ehski;

import de.alberteinholz.ehski.entity.Skies;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SkiMod implements ModInitializer, ClientModInitializer {
	
	public static final EntityType<Skies> SKIES = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("ehski", "skies"),
		FabricEntityTypeBuilder.create(SpawnGroup.MISC, Skies::new).dimensions(EntityDimensions.fixed(2.0F, 0.5F)).build()
	);

	@Override
	public void onInitialize() {
		//FabricDefaultAttributeRegistry.register(SKIES, DefaultAttributeContainer.builder());
	}

	@Environment(EnvType.CLIENT)
	@Override
	public void onInitializeClient() {
		
	}

}
