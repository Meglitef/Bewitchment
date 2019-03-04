package com.bewitchment.common.content.ritual.rituals;

import com.bewitchment.api.transformation.DefaultTransformations;
import com.bewitchment.common.content.ritual.RitualImpl;
import com.bewitchment.common.content.transformation.CapabilityTransformation;
import com.bewitchment.common.potion.ModPotions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class RitualSolarGlory extends RitualImpl {

	public RitualSolarGlory(ResourceLocation registryName, NonNullList<Ingredient> input, NonNullList<ItemStack> output, int timeInTicks, int circles, int altarPower, int costPerTick) {
		super(registryName, input, output, timeInTicks, circles, altarPower, costPerTick);
	}

	@Override
	public void onFinish(EntityPlayer player, TileEntity tile, World world, BlockPos pos, NBTTagCompound tag, BlockPos effectivePosition, int covenSize) {
		if (!world.isRemote) {
			world.playerEntities.stream()
					.filter(p -> p.getCapability(CapabilityTransformation.CAPABILITY, null).getType() == DefaultTransformations.VAMPIRE)
					.forEach(p -> p.addPotionEffect(new PotionEffect(ModPotions.sun_ward, 30 * 20)));
			world.setWorldTime(world.getWorldTime() + ((24000 + 6000) - (world.getWorldTime() % 24000)) % 24000);
		}
	}

	@Override
	public boolean isValid(EntityPlayer player, World world, BlockPos pos, List<ItemStack> recipe, BlockPos effectivePosition, int covenSize) {
		return !world.isDaytime() && player.getCapability(CapabilityTransformation.CAPABILITY, null).getType() != DefaultTransformations.VAMPIRE;
	}

	@Override
	public boolean canBePerformedRemotely() {
		return false;
	}

}
