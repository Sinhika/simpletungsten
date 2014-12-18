package akkamaddi.plugins.simpletungsten;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.core.Content;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;

public class TungstenRecipes
{
    @SuppressWarnings("unchecked")
	public static void doTungstenRecipes()
    {
        // Ore Dictionary
		OreDictionary.registerOre("ingotTungsten", new ItemStack(
				SimpleTungsten.tungstenIngot));
		OreDictionary.registerOre("oreTungsten", new ItemStack(
				SimpleTungsten.oreTungsten));
		OreDictionary.registerOre("ingotTungstenCarbide", new ItemStack(
				SimpleTungsten.tungstenCarbideIngot));
		OreDictionary.registerOre("ingotValfram", new ItemStack(
				SimpleTungsten.valframIngot));
		OreDictionary.registerOre("ingotTungstenSteel", new ItemStack(
				SimpleTungsten.tungstenSteelIngot));
		OreDictionary.registerOre("ingotPrasinos", new ItemStack(
				SimpleTungsten.prasinosIngot));
        
        // recipes: Crafting
        //Storage Block
		GameRegistry.addRecipe(new ItemStack(SimpleTungsten.blockTungsten,
				1), new Object[] { "AAA", "AAA", "AAA", 'A',
				SimpleTungsten.tungstenIngot });
		GameRegistry.addRecipe(new ItemStack(
				SimpleTungsten.blockTungstenCarbide, 1), new Object[] {
				"AAA", "AAA", "AAA", 'A',
				SimpleTungsten.tungstenCarbideIngot });
		GameRegistry.addRecipe(
				new ItemStack(SimpleTungsten.blockValfram, 1),
				new Object[] { "AAA", "AAA", "AAA", 'A',
						SimpleTungsten.valframIngot });
		GameRegistry.addRecipe(new ItemStack(
				SimpleTungsten.blockTungstenSteel, 1),
				new Object[] { "AAA", "AAA", "AAA", 'A',
						SimpleTungsten.tungstenSteelIngot });
		GameRegistry.addRecipe(new ItemStack(SimpleTungsten.blockPrasinos,
				1), new Object[] { "AAA", "AAA", "AAA", 'A',
				SimpleTungsten.prasinosIngot });
        
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.tungstenIngot, 9), new Object[]
                                        {SimpleTungsten.blockTungsten});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.tungstenCarbideIngot, 9), new Object[]
                                        {SimpleTungsten.blockTungstenCarbide});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.valframIngot, 9), new Object[]
                                        {SimpleTungsten.blockValfram});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.tungstenSteelIngot, 9), new Object[]
                                        {SimpleTungsten.blockTungstenSteel});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.prasinosIngot, 9), new Object[]
                                        {SimpleTungsten.blockPrasinos});
        
        // Tungsten Carbide Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumTungstenCarbideChunkItem, SimpleTungsten.mediumTungstenCarbideChunkItem, SimpleTungsten.mediumTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumTungstenCarbideChunkItem, SimpleTungsten.mediumTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumTungstenCarbideChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem, SimpleTungsten.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumTungstenCarbideChunkItem, 2), new Object[]
                                        {SimpleTungsten.largeTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.smallTungstenCarbideChunkItem, 2), new Object[]
                                        {SimpleTungsten.mediumTungstenCarbideChunkItem });
        
        // Valfram Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeValframChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeValframChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumValframChunkItem, SimpleTungsten.mediumValframChunkItem, SimpleTungsten.mediumValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largeValframChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumValframChunkItem, SimpleTungsten.mediumValframChunkItem, SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumValframChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem, SimpleTungsten.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumValframChunkItem, 2), new Object[]
                                        {SimpleTungsten.largeValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.smallValframChunkItem, 2), new Object[]
                                        {SimpleTungsten.mediumValframChunkItem });
        // Prasinos Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largePrasinosChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largePrasinosChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumPrasinosChunkItem, SimpleTungsten.mediumPrasinosChunkItem, SimpleTungsten.mediumPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.largePrasinosChunkItem, 1), new Object[]
                                        {SimpleTungsten.mediumPrasinosChunkItem, SimpleTungsten.mediumPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumPrasinosChunkItem, 1), new Object[]
                                        {SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem, SimpleTungsten.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.mediumPrasinosChunkItem, 2), new Object[]
                                        {SimpleTungsten.largePrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungsten.smallPrasinosChunkItem, 2), new Object[]
                                        {SimpleTungsten.mediumPrasinosChunkItem });
        // Tungsten
        //Tungsten Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        //Tungsten Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungsten" }));
        // Tungsten Carbide
        //Tungsten Carbide Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbidePickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        //Tungsten Carbide Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenCarbideBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenCarbide" }));
        // Valfram
        // Valfram Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        // Valfram Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.valframBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotValfram" }));
        // Tungsten Steel
        //Tungsten Steel Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        //Tungsten Steel Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.tungstenSteelBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenSteel" }));
        // Prasinos
        // Prasinos Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        // Prasinos Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungsten.prasinosBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotPrasinos" }));
        
        // recipes: Smelting
		GameRegistry.addSmelting(SimpleTungsten.oreTungsten, new ItemStack(
				SimpleTungsten.tungstenIngot), 0.8F);
		GameRegistry.addSmelting(
				SimpleTungsten.largeTungstenCarbideChunkItem,
				new ItemStack(SimpleTungsten.tungstenCarbideIngot), 1.0F);
		GameRegistry.addSmelting(SimpleTungsten.largeValframChunkItem,
				new ItemStack(SimpleTungsten.valframIngot), 1.4F);
		GameRegistry.addSmelting(
				SimpleTungsten.largeTungstenSteelChunkItem, new ItemStack(
						SimpleTungsten.tungstenSteelIngot), 1.2F);
		GameRegistry.addSmelting(SimpleTungsten.largePrasinosChunkItem,
				new ItemStack(SimpleTungsten.prasinosIngot), 1.6F);
        
        //Fusion Furnace Recipes
		// Tungsten Carbide
		FusionRecipes
				.addSmelting(
						new ItemStack(SimpleTungsten.tungstenIngot),
						new ItemStack(Items.brick),
						new ItemStack(Items.dye, 1, 15),
						new ItemStack(
								SimpleTungsten.smallTungstenCarbideChunkItem),
						8.0F);
		FusionRecipes
				.addSmelting(
						new ItemStack(SimpleTungsten.tungstenIngot),
						new ItemStack(Items.brick),
						new ItemStack(Items.coal, 1,
								OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								SimpleTungsten.mediumTungstenCarbideChunkItem),
						10.0F);
		FusionRecipes
				.addSmelting(
						new ItemStack(SimpleTungsten.tungstenIngot),
						new ItemStack(Items.brick),
						new ItemStack(Items.gunpowder),
						new ItemStack(
								SimpleTungsten.largeTungstenCarbideChunkItem),
						26.F);
		// Tungsten Steel
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(
						Content.tin_ingot), new ItemStack(
						SimpleTungsten.largeTungstenSteelChunkItem), 26.F);
		// Valfram
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot), new ItemStack(
				Items.netherbrick), new ItemStack(Items.gunpowder),
				new ItemStack(SimpleTungsten.smallValframChunkItem), 10.0F);
		FusionRecipes
				.addSmelting(new ItemStack(SimpleTungsten.tungstenIngot),
						new ItemStack(Items.netherbrick), new ItemStack(
								Items.glowstone_dust), new ItemStack(
								SimpleTungsten.mediumValframChunkItem),
						12.0F);
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot), new ItemStack(
				Items.netherbrick), new ItemStack(Items.lava_bucket),
				new ItemStack(SimpleTungsten.largeValframChunkItem), 36.F);
		// Prasinos
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot), new ItemStack(
				Content.adamantium_ingot), new ItemStack(
				Items.glowstone_dust), new ItemStack(
				SimpleTungsten.smallPrasinosChunkItem), 12.0F);
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot), new ItemStack(
				Content.adamantium_ingot), new ItemStack(
				Items.magma_cream), new ItemStack(
				SimpleTungsten.mediumPrasinosChunkItem), 16.0F);
		FusionRecipes.addSmelting(new ItemStack(
				SimpleTungsten.tungstenIngot), new ItemStack(
				Content.adamantium_ingot), new ItemStack(
				Items.blaze_powder), new ItemStack(
				SimpleTungsten.largePrasinosChunkItem), 40.F);

        if (SimpleTungsten.enableRecycling)
        {
            // Tungsten
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.oreTungsten, 2, 0), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.oreTungsten, 2, 0), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleTungsten.oreTungsten), 10.0F);
			// Tungsten Carbide
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball, 2,
					0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.largeTungstenCarbideChunkItem, 2, 0),
					30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball, 2,
					0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.largeTungstenCarbideChunkItem, 2, 0),
					30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbidePickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenCarbideHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenCarbideChunkItem),
					15.0F);
			// Valfram
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem, 2,
							0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem, 2,
							0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.valframHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(SimpleTungsten.largeValframChunkItem),
					20.0F);
			// Tungsten Steel
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.largeTungstenSteelChunkItem, 2, 0),
					30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleTungsten.largeTungstenSteelChunkItem, 2, 0),
					30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.tungstenSteelHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							SimpleTungsten.largeTungstenSteelChunkItem),
					15.0F);
			// Prasinos
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleTungsten.largePrasinosChunkItem, 2, 0), 50.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleTungsten.largePrasinosChunkItem, 2, 0), 50.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleTungsten.prasinosHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							SimpleTungsten.largePrasinosChunkItem), 25.0F);
        } // end if recycling
    } // end doTungstenRecipes()
} // end class TungstenRecipes
