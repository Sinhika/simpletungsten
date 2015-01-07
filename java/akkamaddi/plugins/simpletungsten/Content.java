package akkamaddi.plugins.simpletungsten;

import akkamaddi.api.core.LootHelper;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.items.SimpleAxe;
import alexndr.api.content.items.SimpleHoe;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.content.items.SimpleArmor;
import alexndr.api.content.items.SimplePickaxe;
import alexndr.api.content.items.SimpleShovel;
import alexndr.api.content.items.SimpleSword;
import alexndr.api.core.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Content 
{

	/**
	 * Loads all the Simple Tungsten content, by calling the methods below.
	 */
	public static void preInitialize()
	{
		try {
			doItems();
			LogHelper.verboseInfo(ModInfo.ID,
					"All items were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Items were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doBlocks();
			LogHelper.verboseInfo(ModInfo.ID,
					"All blocks were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Blocks were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doTools();
			LogHelper.verboseInfo(ModInfo.ID,
					"All tools were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Tools were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doArmor();
			LogHelper.verboseInfo(ModInfo.ID,
					"All armor was added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Armor was not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		//		try{doAchievements(); LogHelper.verboseInfo(ModInfo.ID, "All achievements were added successfully");}
//			catch(Exception e){LogHelper.severe(ModInfo.ID, "Achievements were not added successfully. This is a serious problem!"); e.printStackTrace();}
	} // end preInitialize()

	public static void doArmor() 
	{
		tungstenHelm = new SimpleArmor(SimpleTungsten.armorTungsten, 0)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHelm");
		tungstenChest = new SimpleArmor(SimpleTungsten.armorTungsten, 1)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenChest");
		tungstenLegs = new SimpleArmor(SimpleTungsten.armorTungsten, 2)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenLegs");
		tungstenBoots = new SimpleArmor(SimpleTungsten.armorTungsten, 3)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenBoots");
		
		tungstenCarbideHelm = new SimpleArmor(
				SimpleTungsten.armorTungstenCarbide, 0).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHelm");
		tungstenCarbideChest = new SimpleArmor(
				SimpleTungsten.armorTungstenCarbide, 1).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideChest");
		tungstenCarbideLegs = new SimpleArmor(
				SimpleTungsten.armorTungstenCarbide, 2).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideLegs");
		tungstenCarbideBoots = new SimpleArmor(
				SimpleTungsten.armorTungstenCarbide, 3).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideBoots");

		valframHelm = new SimpleArmor(SimpleTungsten.armorValfram, 0)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHelm");
		valframChest = new SimpleArmor(SimpleTungsten.armorValfram, 1)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframChest");
		valframLegs = new SimpleArmor(SimpleTungsten.armorValfram, 2)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframLegs");
		valframBoots = new SimpleArmor(SimpleTungsten.armorValfram, 3)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframBoots");
	
		tungstenSteelHelm = new SimpleArmor(SimpleTungsten.armorTungstenSteel,
				 0).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHelm");
		tungstenSteelChest = new SimpleArmor(SimpleTungsten.armorTungstenSteel,
				 1).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelChest");
		tungstenSteelLegs = new SimpleArmor(SimpleTungsten.armorTungstenSteel,
				 2).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelLegs");
		tungstenSteelBoots = new SimpleArmor(SimpleTungsten.armorTungstenSteel,
				 3).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelBoots");

		prasinosHelm = new SimpleArmor(SimpleTungsten.armorPrasinos,  0)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHelm");
		prasinosChest = new SimpleArmor(SimpleTungsten.armorPrasinos,  1)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosChest");
		prasinosLegs = new SimpleArmor(SimpleTungsten.armorPrasinos,  2)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosLegs");
		prasinosBoots = new SimpleArmor(SimpleTungsten.armorPrasinos,  3)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosBoots");
	
	} // end doArmor()

	public static void doTools() 
	{
		// Tungsten
		tungstenSword = new SimpleSword(SimpleTungsten.toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSword");
		tungstenShovel = new SimpleShovel(SimpleTungsten.toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenShovel");
		tungstenAxe = new SimpleAxe(SimpleTungsten.toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenAxe");
		tungstenPickaxe = new SimplePickaxe(SimpleTungsten.toolTungsten)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenPickaxe");
		tungstenHoe = new SimpleHoe(SimpleTungsten.toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHoe");
		
		// Tungsten Carbide
		tungstenCarbideSword = new SimpleSword(SimpleTungsten.toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideSword");
		tungstenCarbideShovel = new SimpleShovel(SimpleTungsten.toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideShovel");
		tungstenCarbideAxe = new SimpleAxe(SimpleTungsten.toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideAxe");
		tungstenCarbidePickaxe = new SimplePickaxe(SimpleTungsten.toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbidePickaxe");
		tungstenCarbideHoe = new SimpleHoe(SimpleTungsten.toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHoe");
		
		// Valfram
		valframSword = new SimpleSword(SimpleTungsten.toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframSword");
		valframShovel = new SimpleShovel(SimpleTungsten.toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframShovel");
		valframAxe = new SimpleAxe(SimpleTungsten.toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframAxe");
		valframPickaxe = new SimplePickaxe(SimpleTungsten.toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframPickaxe");
		valframHoe = new SimpleHoe(SimpleTungsten.toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHoe");

		// Tungsten Steel
		tungstenSteelSword = new SimpleSword(SimpleTungsten.toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelSword");
		tungstenSteelShovel = new SimpleShovel(SimpleTungsten.toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelShovel");
		tungstenSteelAxe = new SimpleAxe(SimpleTungsten.toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelAxe");
		tungstenSteelPickaxe = new SimplePickaxe(SimpleTungsten.toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelPickaxe");
		tungstenSteelHoe = new SimpleHoe(SimpleTungsten.toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHoe");

		// Prasinos
		prasinosSword = new SimpleSword(SimpleTungsten.toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosSword");
		prasinosShovel = new SimpleShovel(SimpleTungsten.toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosShovel");
		prasinosAxe = new SimpleAxe(SimpleTungsten.toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosAxe");
		prasinosPickaxe = new SimplePickaxe(SimpleTungsten.toolPrasinos)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosPickaxe");
		prasinosHoe = new SimpleHoe(SimpleTungsten.toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHoe");

	} // end doTools()

	public static void doBlocks() 
	{
		blockTungsten = new SimpleBlock(Material.iron).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.tungstenHardness)
				.setResistance(Settings.tungstenResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockTungsten");

		oreTungsten = new SimpleBlock(Material.iron).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.tungstenOreHardness)
				.setResistance(Settings.tungstenOreResistance)
				.setStepSound(Block.soundTypeMetal).setBlockName("oreTungsten");

		blockTungstenCarbide = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.tungstenCarbideHardness)
				.setResistance(Settings.tungstenCarbideResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockTungstenCarbide");

		blockValfram = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.valframHardness)
				.setResistance(Settings.valframResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockValfram");

		blockTungstenSteel = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.tungstenSteelHardness)
				.setResistance(Settings.tungstenSteelResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockTungstenSteel");

		blockPrasinos = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(Settings.prasinosHardness)
				.setResistance(Settings.prasinosResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockPrasinos");

		blockTungsten.setHarvestLevel("pickaxe", Settings.tungstenHarvestLevel);
		oreTungsten.setHarvestLevel("pickaxe", Settings.tungstenOreHarvestLevel);
		blockTungstenSteel.setHarvestLevel("pickaxe", Settings.tungstenSteelHarvestLevel);
		blockPrasinos.setHarvestLevel("pickaxe", Settings.prasinosHarvestLevel);
		blockTungstenCarbide.setHarvestLevel("pickaxe", Settings.tungstenCarbideHarvestLevel);
		blockValfram.setHarvestLevel("pickaxe", Settings.valframHarvestLevel);

	} // end doBlocks()

	/**
	 * Loads SimpleOres 2 Items.
	 */
	public static void doItems()
	{
		tungstenIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenIngot");
		tungstenCarbideIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideIngot");
		smallTungstenCarbideChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallTungstenCarbideChunkItem");
		mediumTungstenCarbideChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumTungstenCarbideChunkItem");
		largeTungstenCarbideChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenCarbideChunkItem");
		valframIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframIngot");
		smallValframChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallValframChunkItem");
		mediumValframChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumValframChunkItem");
		largeValframChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeValframChunkItem");
		tungstenSteelIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelIngot");
		largeTungstenSteelChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenSteelChunkItem");
		prasinosIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosIngot");
		smallPrasinosChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallPrasinosChunkItem");
		mediumPrasinosChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumPrasinosChunkItem");
		largePrasinosChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largePrasinosChunkItem");
		
	} // end doItems()

	public static void setLoot() 
	{
		// loot
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosIngot),
				1, 2, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosSword),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosPickaxe),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosAxe), 1,
				1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosShovel),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenCarbideIngot), 1, 2, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenCarbideSword), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenCarbidePickaxe), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframIngot), 1,
				1, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframSword), 1,
				1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframPickaxe),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenSteelIngot), 1, 2, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenSteelSword), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				tungstenSteelPickaxe), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosIngot),
				1, 1, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosSword),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosPickaxe),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosIngot), 1, 1,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosPickaxe), 1,
				3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosSword), 1, 7,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenCarbideSword),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest",
				new ItemStack(tungstenCarbidePickaxe), 1, 1, 1);
		LootHelper
				.addLoot("dungeonChest", new ItemStack(valframSword), 1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSteelSword),
				2, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSteelPickaxe),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosSword), 1, 1,
				1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(prasinosIngot),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(prasinosPickaxe),
				1, 4, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(prasinosShovel),
				1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenCarbideIngot), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenCarbidePickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenCarbideShovel), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(valframPickaxe),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenSteelIngot), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenSteelPickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				tungstenSteelShovel), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(prasinosPickaxe),
				1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframSword),
				1, 4, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframHelm),
				1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframChest),
				1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframLegs),
				1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframBoots),
				1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(valframPickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframShovel),
				1, 5, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframIngot),
				3, 5, 3);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(prasinosIngot),
				3, 7, 5);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelSword), 1, 4, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelHelm), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelChest), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelLegs), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelBoots), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelPickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelShovel), 1, 5, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tungstenSteelIngot), 3, 5, 4);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideSword), 1, 4, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideHelm), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideChest), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideLegs), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideBoots), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbidePickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideShovel), 1, 5, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tungstenCarbideIngot), 3, 5, 3);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosSword),
				1, 4, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosHelm),
				1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosChest),
				1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosLegs),
				1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosBoots),
				1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest",
				new ItemStack(prasinosPickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosAxe), 2,
				8, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosIngot),
				3, 5, 4);
	}

    //Tungsten items
    public static Item tungstenIngot;

    public static Item tungstenSword;
    public static Item tungstenShovel;
    public static Item tungstenAxe;
    public static Item tungstenPickaxe;
    public static Item tungstenHoe;

    public static Item tungstenHelm;
    public static Item tungstenChest;
    public static Item tungstenLegs;
    public static Item tungstenBoots;

    public static Block blockTungsten;
    public static Block oreTungsten;

    // Tungsten Carbide
    public static Item tungstenCarbideIngot;
    public static Item smallTungstenCarbideChunkItem;
    public static Item mediumTungstenCarbideChunkItem;
    public static Item largeTungstenCarbideChunkItem;

    public static Item tungstenCarbideSword;
    public static Item tungstenCarbideShovel;
    public static Item tungstenCarbideAxe;
    public static Item tungstenCarbidePickaxe;
    public static Item tungstenCarbideHoe;

    public static Item tungstenCarbideHelm;
    public static Item tungstenCarbideChest;
    public static Item tungstenCarbideLegs;
    public static Item tungstenCarbideBoots;

    public static Block blockTungstenCarbide;

    // Valfram
    public static Item valframIngot;
    public static Item smallValframChunkItem;
    public static Item mediumValframChunkItem;
    public static Item largeValframChunkItem;

    public static Item valframSword;
    public static Item valframShovel;
    public static Item valframAxe;
    public static Item valframPickaxe;
    public static Item valframHoe;

    public static Item valframHelm;
    public static Item valframChest;
    public static Item valframLegs;
    public static Item valframBoots;

    public static Block blockValfram;

    // Tungsten Steel
    public static Item tungstenSteelIngot;
    public static Item largeTungstenSteelChunkItem;

    public static Item tungstenSteelSword;
    public static Item tungstenSteelShovel;
    public static Item tungstenSteelAxe;
    public static Item tungstenSteelPickaxe;
    public static Item tungstenSteelHoe;

    public static Item tungstenSteelHelm;
    public static Item tungstenSteelChest;
    public static Item tungstenSteelLegs;
    public static Item tungstenSteelBoots;

    public static Block blockTungstenSteel;

    // Prasinos
    public static Item prasinosIngot;
    public static Item smallPrasinosChunkItem;
    public static Item mediumPrasinosChunkItem;
    public static Item largePrasinosChunkItem;

    public static Item prasinosSword;
    public static Item prasinosShovel;
    public static Item prasinosAxe;
    public static Item prasinosPickaxe;
    public static Item prasinosHoe;

    public static Item prasinosHelm;
    public static Item prasinosChest;
    public static Item prasinosLegs;
    public static Item prasinosBoots;

    public static Block blockPrasinos;

} // end class Content
