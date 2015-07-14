package info.jbcs.minecraft.vending.proxy;

import net.minecraftforge.fml.relauncher.Side;
import info.jbcs.minecraft.vending.network.MessagePipeline;
import info.jbcs.minecraft.vending.network.MsgAdvVenSetItem;
import info.jbcs.minecraft.vending.network.MsgWrench;

public class CommonProxy {
	public void registerEventHandlers()
	{
	}

	public void registerPackets(MessagePipeline pipeline)
	{
		pipeline.registerMessage(MsgAdvVenSetItem.Handler.class, MsgAdvVenSetItem.class, 0, Side.SERVER);
		pipeline.registerMessage(MsgWrench.Handler.class, MsgWrench.class, 1, Side.SERVER);
	}

	public void registerRenderers()
	{
	}
}
