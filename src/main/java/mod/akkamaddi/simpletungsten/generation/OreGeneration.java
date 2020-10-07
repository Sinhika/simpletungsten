package mod.akkamaddi.simpletungsten.generation;

import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    protected static ConfiguredFeature<?, ?> ORE_TUNGSTEN;

    /**
     * Do we care about this biome? Yes, if overworld or nether, no if THEEND. Also
     * init relevant Features, if they are null.
     */
    public static boolean checkAndInitBiome(BiomeLoadingEvent evt)
    {
        if (evt.getCategory() != Biome.Category.NETHER && evt.getCategory() != Biome.Category.THEEND)
        {
            initOverworldFeatures();
            return true;
        }
        return false;
    } // end checkBiome

    /**
     * initialize overworld Features.
     * 
     * @param evt
     */
    protected static void initOverworldFeatures()
    {
        if (ORE_TUNGSTEN == null)
        {
            ORE_TUNGSTEN = OreGenUtils.buildOverworldOreFeature(
                    ModBlocks.tungsten_ore.get().getDefaultState(), SimpleTungstenConfig.tungsten_cfg); 
        }
    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_TUNGSTEN);
    } // end generateOverworldOres()

} // end class OreGeneration