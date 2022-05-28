package mod.akkamaddi.simpletungsten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simpletungsten.config.ConfigHolder;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.akkamaddi.simpletungsten.init.ModFeatures;
import mod.akkamaddi.simpletungsten.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimpleTungsten.MODID)
public class SimpleTungsten
{
    public static final String MODID = "simpletungsten";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    
    public SimpleTungsten()
    {
        LOGGER.debug("Hello from akkamaddi's Simple Tungsten!");
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModFeatures.CONFIGURED_FEATURES.register(modEventBus);
        ModFeatures.PLACED_FEATURES.register(modEventBus);
        
        // Register Configs
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHolder.SERVER_SPEC);
        modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigHolder.CLIENT_SPEC);
    } // end ctor()
} // end class
