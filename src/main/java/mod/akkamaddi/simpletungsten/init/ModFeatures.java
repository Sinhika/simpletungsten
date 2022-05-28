package mod.akkamaddi.simpletungsten.init;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.alexndr.simplecorelib.api.helpers.OreGenUtils;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures
{
    /** ConfiguredFeature<?, ?> registry */
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SimpleTungsten.MODID);

    public static RegistryObject<ConfiguredFeature<OreConfiguration, ?>> ORE_TUNGSTEN =
            CONFIGURED_FEATURES.register("ore_tungsten", 
                    () -> OreGenUtils.createConfiguredOreFeature(
                            OreGenUtils.BuildStandardOreTargetList(ModBlocks.tungsten_ore.get(), ModBlocks.deepslate_tungsten_ore.get()),
                            SimpleTungstenConfig.tungsten_cfg));
    
    /** PlacedFeature registry */
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SimpleTungsten.MODID);
    
    public static RegistryObject<PlacedFeature> ORE_TUNGSTEN_DEPOSIT = PLACED_FEATURES.register("ore_tungsten_deposit", 
            ()-> OreGenUtils.createPlacedOreFeature(ORE_TUNGSTEN.getHolder().get(), SimpleTungstenConfig.tungsten_cfg));

} // end class
