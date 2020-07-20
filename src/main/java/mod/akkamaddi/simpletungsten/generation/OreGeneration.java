package mod.akkamaddi.simpletungsten.generation;

import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{

    /**
     * called in setup to generate overworld ores; should respect config entries.
     */
    public static void setupOreGen()
    {
        for (Biome biome : ForgeRegistries.BIOMES.getValues())
        {
            if (biome.getCategory() == Biome.Category.THEEND)
            {
                // We have no ores for the End dimension, so this if statement is just so that
                // we skip biomes in that dimension.
                continue;
            }
            if (biome.getCategory() == Biome.Category.NETHER)
            {
                // No ores for Nether dimension, either
                continue;
            } // end-else NETHER
            else
            {
                // Overworld
                if (SimpleTungstenConfig.enableTungstenOre)
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                            Biome.createDecoratedFeature(Feature.ORE,
                                                         new OreFeatureConfig(
                                                                 OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                                                 ModBlocks.tungsten_ore.get().getDefaultState(),
                                                                 SimpleTungstenConfig.tungsten_veinsize),
                                                         Placement.COUNT_RANGE,
                                                         SimpleTungstenConfig.tungsten_cfg));
                }
            } // end-else all others
        } // end-for Biome
    } // end setupOreGen()

} // end class OreGeneration