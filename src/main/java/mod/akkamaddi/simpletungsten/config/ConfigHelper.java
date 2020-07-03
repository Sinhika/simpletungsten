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

    } // end bakeServer()

        @SuppressWarnings("unused")
		private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue)
        {
                modConfig.getConfigData().set(path, newValue);
                modConfig.save();
        } // end setValueAndSave()

} // end class ConfigHelper
