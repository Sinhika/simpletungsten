package mod.akkamaddi.simpletungsten.config;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import net.minecraftforge.common.ForgeConfigSpec;

/**
 * For configuration settings that change the behaviour of code on the LOGICAL SERVER.
 * This can be moved to an inner class of ExampleModConfig, but is separate because of personal preference and to keep the code organised
 *
 * @author Cadiboo
 * @author Sinhika
 */
final class ServerConfig
{
    final ForgeConfigSpec.BooleanValue serverEnableTungstenOre;
    final ForgeConfigSpec.IntValue serverTungstenVeinSize;
    final ForgeConfigSpec.IntValue serverTungstenVeinCount;
    final ForgeConfigSpec.IntValue serverTungstenBottomHeight;
    final ForgeConfigSpec.IntValue serverTungstenMaxHeight;
    
    final ForgeConfigSpec.BooleanValue serverEnableTungstenRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableTungstenCarbideRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableTungstenSteelRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableValframRecipes;
    final ForgeConfigSpec.BooleanValue serverEnablePrasinosRecipes;
    
    final ForgeConfigSpec.BooleanValue serverEnableRecyclingRecipes;
    final ForgeConfigSpec.BooleanValue serverAddModLootToChests;

	ServerConfig(final ForgeConfigSpec.Builder builder)
	{
	    builder.push("General");
        serverAddModLootToChests = builder.comment("Add SimpleTungsten items to chest loot?")
                .translation(SimpleTungsten.MODID + ".config.addModLootToChests")
                .define("AddModLootToChests", true);
        
	    serverEnableRecyclingRecipes = builder
            .comment("Enable fusion recydling of tungsten items?")
            .translation(SimpleTungsten.MODID + ".config.enableRecycling")
            .define("EnableRecycling", true);
	    builder.pop();
	    
	    builder.push("OreGeneration");
	    serverEnableTungstenOre = builder
                .comment("Enable tungsten ore generation?")
                .translation(SimpleTungsten.MODID + ".config.enableTungstenOre")
                .define("EnableTungstenOre", true);
        builder.push("Tungsten");
        serverTungstenVeinSize = builder
                .comment("Tungsten ore vein size")
                .translation(SimpleTungsten.MODID + ".config.serverTungstenVeinSize")
                .defineInRange("TungstenVeinSize", 5, 1, Integer.MAX_VALUE);
        serverTungstenVeinCount = builder
                .comment("Tungsten ore vein count per chunk")
                .translation(SimpleTungsten.MODID + ".config.serverTungstenVeinCount")
                .defineInRange("TungstenVeinCount", 5, 1, Integer.MAX_VALUE);
        serverTungstenBottomHeight = builder
                .comment("Tungsten ore minimum height")
                .translation(SimpleTungsten.MODID + ".config.serverTungstenBottomHeight")
                .defineInRange("TungstenBottomHeight", 1, 1, 254);
        serverTungstenMaxHeight = builder
                .comment("Tungsten ore maximum height")
                .translation(SimpleTungsten.MODID + ".config.serverTungstenMaxHeight")
                .defineInRange("TungstenMaxHeight", 18, 1, 255);
        builder.pop();
        builder.pop();
        
        builder.push("Recipes");
        serverEnableTungstenRecipes = builder.comment("false disables recipes")
                .translation(SimpleTungsten.MODID + ".config.enableTungstenRecipes")
                .define("EnableTungstenRecipes", true);
        serverEnableTungstenCarbideRecipes = builder.comment("false disables recipes")
                .translation(SimpleTungsten.MODID + ".config.enableTungstenCarbideRecipes")
                .define("EnableTungstenCarbideRecipes", true);
        serverEnableTungstenSteelRecipes = builder.comment("false disables recipes")
                .translation(SimpleTungsten.MODID + ".config.enableTungstenSteelRecipes")
                .define("EnableTungstenSteelRecipes", true);
        serverEnableValframRecipes = builder.comment("false disables recipes")
                .translation(SimpleTungsten.MODID + ".config.enableValframRecipes")
                .define("EnableValframRecipes", true);
        serverEnablePrasinosRecipes = builder.comment("false disables recipes")
                .translation(SimpleTungsten.MODID + ".config.enablePrasinosRecipes")
                .define("EnablePrasinosRecipes", true);
        builder.pop();
        
	} // end ctor

} // end class ServerConfig
