package akkamaddi.plugins.simpletungsten;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.api.core.LogHelper;
import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.FusionMaterial;

public class Recipes
{
	public static void preInitialize()
	{
		try {
			addOreDictEntries();
			LogHelper.verboseInfo(ModInfo.ID,
					"All OreDictionary entries were added successfully.");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
			 "OreDictionary entries were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end preInitialize()
	
	public static void initialize()
	{
		try {
			addRecipes();
			LogHelper.verboseInfo(ModInfo.ID,
					"All recipes were added successfully.");
		} catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Recipes were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end initialize()
	
	public static void addOreDictEntries()
	{
		OreDictionary.registerOre("ingotTungsten", new ItemStack(
				Content.tungstenIngot));
		OreDictionary.registerOre("oreTungsten", new ItemStack(
				Content.oreTungsten));
		OreDictionary.registerOre("ingotTungstenCarbide", new ItemStack(
				Content.tungstenCarbideIngot));
		OreDictionary.registerOre("ingotValfram", new ItemStack(
				Content.valframIngot));
		OreDictionary.registerOre("ingotTungstenSteel", new ItemStack(
				Content.tungstenSteelIngot));
		OreDictionary.registerOre("ingotPrasinos", new ItemStack(
				Content.prasinosIngot));
	} // end addOreDictEntries()
	
 	@SuppressWarnings("unchecked")
	public static void addRecipes()
    {
        // recipes: Crafting
        //Storage Block
		GameRegistry
				.addRecipe(new ItemStack(Content.blockTungsten, 1),
						new Object[] { "AAA", "AAA", "AAA", 'A',
								Content.tungstenIngot });
		GameRegistry.addRecipe(new ItemStack(Content.blockTungstenCarbide, 1),
				new Object[] { "AAA", "AAA", "AAA", 'A',
						Content.tungstenCarbideIngot });
		GameRegistry
				.addRecipe(new ItemStack(Content.blockValfram, 1),
						new Object[] { "AAA", "AAA", "AAA", 'A',
								Content.valframIngot });
		GameRegistry.addRecipe(new ItemStack(Content.blockTungstenSteel, 1),
				new Object[] { "AAA", "AAA", "AAA", 'A',
						Content.tungstenSteelIngot });
		GameRegistry
				.addRecipe(new ItemStack(Content.blockPrasinos, 1),
						new Object[] { "AAA", "AAA", "AAA", 'A',
								Content.prasinosIngot });
       
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(Content.tungstenIngot, 9), new Object[]
                                        {Content.blockTungsten});
        GameRegistry.addShapelessRecipe(new ItemStack(Content.tungstenCarbideIngot, 9), new Object[]
                                        {Content.blockTungstenCarbide});
        GameRegistry.addShapelessRecipe(new ItemStack(Content.valframIngot, 9), new Object[]
                                        {Content.blockValfram});
        GameRegistry.addShapelessRecipe(new ItemStack(Content.tungstenSteelIngot, 9), new Object[]
                                        {Content.blockTungstenSteel});
        GameRegistry.addShapelessRecipe(new ItemStack(Content.prasinosIngot, 9), new Object[]
                                        {Content.blockPrasinos});
        
        // Tungsten Carbide Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {Content.mediumTungstenCarbideChunkItem, Content.mediumTungstenCarbideChunkItem, Content.mediumTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeTungstenCarbideChunkItem, 1), new Object[]
                                        {Content.mediumTungstenCarbideChunkItem, Content.mediumTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumTungstenCarbideChunkItem, 1), new Object[]
                                        {Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem, Content.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumTungstenCarbideChunkItem, 2), new Object[]
                                        {Content.largeTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.smallTungstenCarbideChunkItem, 2), new Object[]
                                        {Content.mediumTungstenCarbideChunkItem });
        
        // Valfram Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeValframChunkItem, 1), new Object[]
                                        {Content.smallValframChunkItem, Content.smallValframChunkItem, Content.smallValframChunkItem, Content.smallValframChunkItem, Content.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeValframChunkItem, 1), new Object[]
                                        {Content.mediumValframChunkItem, Content.mediumValframChunkItem, Content.mediumValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largeValframChunkItem, 1), new Object[]
                                        {Content.mediumValframChunkItem, Content.mediumValframChunkItem, Content.smallValframChunkItem, Content.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumValframChunkItem, 1), new Object[]
                                        {Content.smallValframChunkItem, Content.smallValframChunkItem, Content.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumValframChunkItem, 2), new Object[]
                                        {Content.largeValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.smallValframChunkItem, 2), new Object[]
                                        {Content.mediumValframChunkItem });
        // Prasinos Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largePrasinosChunkItem, 1), new Object[]
                                        {Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largePrasinosChunkItem, 1), new Object[]
                                        {Content.mediumPrasinosChunkItem, Content.mediumPrasinosChunkItem, Content.mediumPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.largePrasinosChunkItem, 1), new Object[]
                                        {Content.mediumPrasinosChunkItem, Content.mediumPrasinosChunkItem, Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumPrasinosChunkItem, 1), new Object[]
                                        {Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem, Content.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.mediumPrasinosChunkItem, 2), new Object[]
                                        {Content.largePrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(Content.smallPrasinosChunkItem, 2), new Object[]
                                        {Content.mediumPrasinosChunkItem });
        // Tungsten
        //Tungsten Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        //Tungsten Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotTungsten" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungsten" }));
        // Tungsten Carbide
        //Tungsten Carbide Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbidePickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        //Tungsten Carbide Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenCarbide" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenCarbideBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenCarbide" }));
        // Valfram
        // Valfram Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        // Valfram Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotValfram" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.valframBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotValfram" }));
        // Tungsten Steel
        //Tungsten Steel Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        //Tungsten Steel Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenSteel" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.tungstenSteelBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenSteel" }));
        // Prasinos
        // Prasinos Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        // Prasinos Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotPrasinos" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.prasinosBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotPrasinos" }));
        
        // recipes: Smelting
		GameRegistry.addSmelting(Content.oreTungsten, new ItemStack(
				Content.tungstenIngot), 0.8F);
		GameRegistry.addSmelting(
				Content.largeTungstenCarbideChunkItem,
				new ItemStack(Content.tungstenCarbideIngot), 1.0F);
		GameRegistry.addSmelting(Content.largeValframChunkItem,
				new ItemStack(Content.valframIngot), 1.4F);
		GameRegistry.addSmelting(
				Content.largeTungstenSteelChunkItem, new ItemStack(
						Content.tungstenSteelIngot), 1.2F);
		GameRegistry.addSmelting(Content.largePrasinosChunkItem,
				new ItemStack(Content.prasinosIngot), 1.6F);
        
        //Fusion Furnace Recipes
		// Tungsten Carbide
		FusionFurnaceRecipes
				.addSmelting(
						FusionMaterial.of("ingotTungsten"),
						FusionMaterial.of(Items.brick),
						FusionMaterial.of(Items.dye, 1, 15),
						new ItemStack(
								Content.smallTungstenCarbideChunkItem),
						8.0F);
		FusionFurnaceRecipes
				.addSmelting(
						FusionMaterial.of("ingotTungsten"),
						FusionMaterial.of(Items.brick),
						FusionMaterial.of(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								Content.mediumTungstenCarbideChunkItem),
						10.0F);
		FusionFurnaceRecipes
				.addSmelting(
						FusionMaterial.of("ingotTungsten"),
						FusionMaterial.of(Items.brick),
						FusionMaterial.of(Items.gunpowder),
						new ItemStack(
								Content.largeTungstenCarbideChunkItem),
						26.F);
		
		// Tungsten Steel
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"),
				FusionMaterial.of("ingotIron"), 
				FusionMaterial.of("ingotTin"), 
				new ItemStack(Content.largeTungstenSteelChunkItem), 26.F);
		
		// Valfram
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"),
				FusionMaterial.of(Items.netherbrick),
				FusionMaterial.of(Items.gunpowder), 
				new ItemStack(Content.smallValframChunkItem), 10.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"),
				FusionMaterial.of(Items.netherbrick), 
				FusionMaterial.of(Items.glowstone_dust), 
				new ItemStack(
						Content.mediumValframChunkItem), 12.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"),
				FusionMaterial.of(Items.netherbrick), 
				FusionMaterial.of(Items.lava_bucket), 
				new ItemStack(Content.largeValframChunkItem), 36.F);
		
		// Prasinos
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"), 
				FusionMaterial.of("ingotAdamantium"), 
				FusionMaterial.of(Items.glowstone_dust), 
				new ItemStack(Content.smallPrasinosChunkItem), 12.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"), 
				FusionMaterial.of("ingotAdamantium"), 
				FusionMaterial.of(Items.magma_cream), 
				new ItemStack(Content.mediumPrasinosChunkItem), 16.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTungsten"), 
				FusionMaterial.of("ingotAdamantium"), 
				FusionMaterial.of(Items.blaze_powder), 
				new ItemStack(Content.largePrasinosChunkItem), 40.F);

        if (Settings.enableRecycling)
        {
            // Tungsten
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreTungsten, 2, 0), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreTungsten, 2, 0), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreTungsten), 10.0F);
			// Tungsten Carbide
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball, 2,
					0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeTungstenCarbideChunkItem, 2, 0),
					30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball, 2,
					0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeTungstenCarbideChunkItem, 2, 0),
					30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbidePickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenCarbideHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Items.clay_ball),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenCarbideChunkItem),
					15.0F);
			// Valfram
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem, 2,
							0), 40.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem, 2,
							0), 40.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.valframHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.netherrack), new ItemStack(Items.lava_bucket),
					new ItemStack(Content.largeValframChunkItem),
					20.0F);
			// Tungsten Steel
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeTungstenSteelChunkItem, 2, 0),
					30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeTungstenSteelChunkItem, 2, 0),
					30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tungstenSteelHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largeTungstenSteelChunkItem),
					15.0F);
			// Prasinos
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largePrasinosChunkItem, 2, 0), 50.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largePrasinosChunkItem, 2, 0), 50.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.prasinosHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							Content.largePrasinosChunkItem), 25.0F);
        } // end if recycling
    } // end addRecipes()
} // end class TungstenRecipes
