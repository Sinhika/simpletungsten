package mod.akkamaddi.simpletungsten.config;

import net.minecraftforge.fml.config.ModConfig;

/**
 * This bakes the config values to normal fields
 *
 * @author Cadiboo
 * It can be merged into the main ExampleModConfig class, but is separate because of personal preference and to keep the code organised
 */
public final class ConfigHelper
{
//      public static void bakeClient(final ModConfig config) { }

    public static void bakeServer(final ModConfig config)
    {
        SimpleTungstenConfig.addModLootToChests = ConfigHolder.SERVER.serverAddModLootToChests.get();
        
 
        // recipe flags
        SimpleTungstenConfig.INSTANCE.putFlag("tungsten_recipes", ConfigHolder.SERVER.serverEnableTungstenRecipes.get());
        SimpleTungstenConfig.INSTANCE.putFlag("tungsten_carbide_recipes", ConfigHolder.SERVER.serverEnableTungstenCarbideRecipes.get());
        SimpleTungstenConfig.INSTANCE.putFlag("tungsten_steel_recipes", ConfigHolder.SERVER.serverEnableTungstenSteelRecipes.get());
        SimpleTungstenConfig.INSTANCE.putFlag("valfram_recipes", ConfigHolder.SERVER.serverEnableValframRecipes.get());
        SimpleTungstenConfig.INSTANCE.putFlag("prasinos_recipes", ConfigHolder.SERVER.serverEnablePrasinosRecipes.get());
        SimpleTungstenConfig.INSTANCE.putFlag("recycling_recipes", ConfigHolder.SERVER.serverEnableRecyclingRecipes.get());
        
    } // end bakeServer()

    public static void bakeClient(final ModConfig config) 
    {
    } // end bakeClient
    
    @SuppressWarnings("unused")
    private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue)
    {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    } // end setValueAndSave()

} // end class ConfigHelper
