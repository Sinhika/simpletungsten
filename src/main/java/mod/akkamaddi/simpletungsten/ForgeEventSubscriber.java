package mod.akkamaddi.simpletungsten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleTungsten.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    @SuppressWarnings("unused")
    private static final Logger LOGGER = LogManager.getLogger(SimpleTungsten.MODID + " Forge Event Subscriber");

} // end class
