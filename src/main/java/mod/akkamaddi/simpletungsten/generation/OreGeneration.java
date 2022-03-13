package mod.akkamaddi.simpletungsten.generation;

import java.util.List;

import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    public static final List<OreConfiguration.TargetBlockState> ORE_TUNGSTEN_TARGET =
            OreGenUtils.BuildStandardOreTargetList(ModBlocks.tungsten_ore.get(), ModBlocks.deepslate_tungsten_ore.get());
    public static ConfiguredFeature<OreConfiguration, ?> ORE_TUNGSTEN;
    public static PlacedFeature ORE_TUNGSTEN_DEPOSIT;

    /**
     * initialize overworld Features.
     * 
     * @param evt
     */
    public static void initOverworldFeatures()
    {
        ORE_TUNGSTEN = FeatureUtils.register("ore_tungsten",   
                OreGenUtils.ConfigureOreFeature(ORE_TUNGSTEN_TARGET, SimpleTungstenConfig.tungsten_cfg.getVein_size(), 0.0F));
        ORE_TUNGSTEN_DEPOSIT = PlacementUtils.register("ore_tungsten_deposit",      
                                OreGenUtils.ConfigurePlacedFeature(SimpleTungstenConfig.tungsten_cfg, ORE_TUNGSTEN));

    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_TUNGSTEN_DEPOSIT);
    } // end generateOverworldOres()

} // end class OreGeneration