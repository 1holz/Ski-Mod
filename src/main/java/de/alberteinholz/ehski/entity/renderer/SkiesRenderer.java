package de.alberteinholz.ehski.entity.renderer;

import de.alberteinholz.ehski.entity.Skies;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SkiesRenderer extends EntityRenderer<Skies> {

    public SkiesRenderer(Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(Skies entity) {
        //TODO: improve
        return new Identifier("ehski", "textures/entity/skies.png");
    }
    
}
