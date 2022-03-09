package mod.akkamaddi.simpletungsten.generation;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    public static ConfiguredFeature<?, ?> ORE_TUNGSTEN;

    /**
     * initialize overworld Features.
     * 
     * @param evt
     */
    public static void initOverworldFeatures()
    {
        ORE_TUNGSTEN = OreGenUtils.buildOverworldOreFeature(Feature.ORE, ModBlocks.tungsten_ore.get().defaultBlockState(),
                SimpleTungstenConfig.tungsten_cfg);
        OreGenUtils.registerFeature(SimpleTungsten.MODID, "tungsten_vein", ORE_TUNGSTEN);

    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_TUNGSTEN);
    } // end generateOverworldOres()

} // end class OreGeneration