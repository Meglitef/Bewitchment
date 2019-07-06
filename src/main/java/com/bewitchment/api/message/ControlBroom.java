package com.bewitchment.api.message;

import com.bewitchment.api.registry.entity.EntityBroom;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@SuppressWarnings({"unused", "WeakerAccess"})
public class ControlBroom implements IMessage {
	public int id;
	public double motionX, motionY, motionZ;
	
	public ControlBroom() {
	}
	
	public ControlBroom(int id, double motionX, double motionY, double motionZ) {
		this.id = id;
		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;
	}
	
	@Override
	public void fromBytes(ByteBuf byteBuf) {
		id = byteBuf.readInt();
		motionX = byteBuf.readDouble();
		motionY = byteBuf.readDouble();
		motionZ = byteBuf.readDouble();
	}
	
	@Override
	public void toBytes(ByteBuf byteBuf) {
		byteBuf.writeInt(id);
		byteBuf.writeDouble(motionX);
		byteBuf.writeDouble(motionY);
		byteBuf.writeDouble(motionZ);
	}
	
	public static class Handler implements IMessageHandler<ControlBroom, IMessage> {
		@Override
		public IMessage onMessage(ControlBroom message, MessageContext ctx) {
			if (ctx.side.isServer()) {
				Entity entity = ctx.getServerHandler().player.world.getEntityByID(message.id);
				if (entity instanceof EntityBroom) {
					EntityBroom broom = (EntityBroom) entity;
					broom.motionX = message.motionX;
					broom.motionY = message.motionY;
					broom.motionZ = message.motionZ;
				}
			}
			return null;
		}
	}
}