package mod.akkamaddi.simpletungsten;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.alexndr.simpleores.api.config.FlagCondition;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = SimpleTungsten.MODID,  bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(SimpleTungsten.MODID + " Mod Event Subscriber");
    
    /**
     * For best inter-mod compatibility, run ore generation in a DeferredWorkQueue, per dieseiben07.
     * @param event
     */
    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event)
    {
//        DeferredWorkQueue.runLater( () -> {
//                OreGeneration.setupOreGen();
//        } );
        LOGGER.debug("Common setup done");
    } // end onCommonSetup

    
    @SubscribeEvent
    public static void onModConfigEvent(final ModConfig.ModConfigEvent event)
    {
        final ModConfig config = event.getConfig();

        // Rebake the configs when they change
//        if (config.getSpec() == ConfigHolder.CLIENT_SPEC)
//        {
//            ConfigHelper.bakeClient(config);
//        }
//        else if (config.getSpec() == ConfigHolder.SERVER_SPEC)
//        {
//            ConfigHelper.bakeServer(config);
//        }
    } // onModConfigEvent

    @SubscribeEvent
    public static void onRegisterRecipeSerializers(
            @Nonnull final RegistryEvent.Register<IRecipeSerializer<?>> event)
    {
//        CraftingHelper.register(new FlagCondition.Serializer(SimpleTungstenConfig.INSTANCE, 
//                new ResourceLocation(SimpleTungsten.MODID, "flag")));
    } // end registerRecipeSerializers


} // end class
