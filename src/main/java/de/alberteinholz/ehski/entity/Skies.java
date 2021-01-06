package de.alberteinholz.ehski.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Packet;
import net.minecraft.world.World;

public class Skies extends Entity {

    public Skies(EntityType<? extends Entity> type, World world) {
        super(type, world);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void initDataTracker() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void readCustomDataFromTag(CompoundTag tag) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void writeCustomDataToTag(CompoundTag tag) {
        // TODO Auto-generated method stub

    }

    @Override
    public Packet<?> createSpawnPacket() {
        // TODO Auto-generated method stub
        return null;
    }

}
