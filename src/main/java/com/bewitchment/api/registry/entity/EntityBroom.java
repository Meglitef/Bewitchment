package com.bewitchment.api.registry.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

@SuppressWarnings({"NullableProblems"})
public abstract class EntityBroom extends Entity {
	protected ItemStack item;
	
	public EntityBroom(World world) {
		super(world);
		setSize(0.7f, 0.7f);
		setNoGravity(true);
	}
	
	@Override
	public Entity getControllingPassenger() {
		return getPassengers().size() == 0 ? null : getPassengers().get(0);
	}
	
	@Override
	public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, EnumHand hand) {
		if (!player.isRiding() && !player.isSneaking()) {
			player.rotationYaw = rotationYaw;
			player.rotationPitch = rotationPitch;
			player.startRiding(this);
			return EnumActionResult.SUCCESS;
		}
		return super.applyPlayerInteraction(player, vec, hand);
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (getControllingPassenger() == null && source.getTrueSource() instanceof EntityPlayer) setDead();
		return super.attackEntityFrom(source, amount);
	}
	
	@Override
	public boolean canBeCollidedWith() {
		return !isDead;
	}
	
	@Override
	public boolean canBePushed() {
		return true;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
		if (item == null) {
			item = player.getHeldItem(hand).splitStack(1);
			return true;
		}
		return super.processInitialInteract(player, hand);
	}
	
	@Override
	public double getMountedYOffset() {
		return 0.4;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		float friction = 0.98f;
		if (onGround) friction = 0.4f;
		motionX *= friction;
		motionZ *= friction;
		float speed = getSpeed();
		float maxSpeed = getMaxSpeed();
		Entity rider = getControllingPassenger();
		if (rider != null) {
			if (Math.abs(motionX) < maxSpeed) motionX += rider.motionX * speed;
			if (Math.abs(motionZ) < maxSpeed) motionZ += rider.motionZ * speed;
			rotationYaw = rider.rotationYaw;
			if (rider instanceof EntityLivingBase && getJump((EntityLivingBase) rider) && motionY < 1) motionY += 0.3f;
		}
		if (collidedHorizontally) {
			motionX = 0;
			motionZ = 0;
		}
		motionY -= 0.1f;
		motionY *= 0.75f;
		move(MoverType.SELF, motionX, motionY, motionZ);
	}
	
	@Override
	public void setDead() {
		if (!world.isRemote) InventoryHelper.spawnItemStack(world, posX, posY, posZ, item);
		super.setDead();
	}
	
	@Override
	protected void updateFallState(double y, boolean onGround, IBlockState state, BlockPos pos) {
	}
	
	@Override
	protected void entityInit() {
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound tag) {
		if (item != null) tag.setTag("item", item.serializeNBT());
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tag) {
		item = tag.hasKey("item") ? new ItemStack(tag.getCompoundTag("item")) : ItemStack.EMPTY;
	}
	
	protected abstract float getSpeed();
	
	protected abstract float getMaxSpeed();
	
	private static boolean getJump(EntityLivingBase rider) throws IllegalArgumentException {
		return ObfuscationReflectionHelper.getPrivateValue(EntityLivingBase.class, rider, "isJumping", "field_70703_bu");
	}
}