package mod.akkamaddi.simpletungsten.generation;

import mod.akkamaddi.simpletungsten.init.ModFeatures;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ModFeatures.ORE_TUNGSTEN_DEPOSIT.getHolder().get());
    } // end generateOverworldOres()

} // end class OreGeneration