package akkamaddi.plugins.simpleprasinos;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import akkamaddi.api.core.APIcore;
import akkamaddi.api.core.CommonProxy;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.plugins.SimpleOres.Settings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, dependencies = "required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore")
public class SimpleTungsten {
	// The instance of your mod that Forge uses.
	// @Instance("simpletungsten")
	// public static SimpleTungsten instance;

	// // Says where the client and server 'proxy' code is loaded.
	// @SidedProxy(clientSide = "akkamaddi.simpleprasinos.code.ClientProxy",
	// serverSide = "akkamaddi.api.core.CommonProxy")
	// public static CommonProxy proxy;

	// tab
	public static SimpleTab tabAkkamaddiTungsten;

	// armor materials
	public static ArmorMaterial armorTungsten, armorTungstenCarbide,
			armorValfram, armorTungstenSteel, armorPrasinos;

	// renderers
	public static int rendererTungsten, rendererTungstenCarbide,
			rendererValfram, rendererTungstenSteel, rendererPrasinos;

	// tool materials
	public static ToolMaterial toolTungsten, toolTungstenCarbide, toolValfram,
			toolTungstenSteel, toolPrasinos;

	/**
	 * Called during the PreInit phase.
	 * @param event FMLPreInitializationEvent
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		// Tab
		tabAkkamaddiTungsten = new SimpleTab("tabAkkamaddiTungsten", "general");
		
		// define items
		// Tungsten
		tungstenIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenIngot");
		tungstenSword = new SimpleSword(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSword");
		tungstenShovel = new SimpleShovel(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenShovel");
		tungstenAxe = new SimpleAxe(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenAxe");
		tungstenPickaxe = new SimplePickaxe(toolTungsten)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenPickaxe");
		tungstenHoe = new SimpleHoe(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHoe");
		tungstenHelm = new SimpleArmor(armorTungsten, rendererTungsten, 0)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHelm");
		tungstenChest = new SimpleArmor(armorTungsten, rendererTungsten, 1)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenChest");
		tungstenLegs = new SimpleArmor(armorTungsten, rendererTungsten, 2)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenLegs");
		tungstenBoots = new SimpleArmor(armorTungsten, rendererTungsten, 3)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenBoots");

		// Tungsten Carbide
		tungstenCarbideIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideIngot");
		smallTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallTungstenCarbideChunkItem");
		mediumTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumTungstenCarbideChunkItem");
		largeTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenCarbideChunkItem");
		tungstenCarbideSword = new SimpleSword(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideSword");
		tungstenCarbideShovel = new SimpleShovel(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideShovel");
		tungstenCarbideAxe = new SimpleAxe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideAxe");
		tungstenCarbidePickaxe = new SimplePickaxe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbidePickaxe");
		tungstenCarbideHoe = new SimpleHoe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHoe");
		tungstenCarbideHelm = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 0).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHelm");
		tungstenCarbideChest = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 1).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideChest");
		tungstenCarbideLegs = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 2).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideLegs");
		tungstenCarbideBoots = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 3).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideBoots");

		// Valfram
		valframIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframIngot");
		smallValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallValframChunkItem");
		mediumValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumValframChunkItem");
		largeValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeValframChunkItem");
		valframSword = new SimpleSword(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframSword");
		valframShovel = new SimpleShovel(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframShovel");
		valframAxe = new SimpleAxe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframAxe");
		valframPickaxe = new SimplePickaxe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframPickaxe");
		valframHoe = new SimpleHoe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHoe");
		valframHelm = new SimpleArmor(armorValfram, rendererValfram, 0)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHelm");
		valframChest = new SimpleArmor(armorValfram, rendererValfram, 1)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframChest");
		valframLegs = new SimpleArmor(armorValfram, rendererValfram, 2)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframLegs");
		valframBoots = new SimpleArmor(armorValfram, rendererValfram, 3)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframBoots");

		// Tungsten Steel
		tungstenSteelIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelIngot");
		largeTungstenSteelChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenSteelChunkItem");
		tungstenSteelSword = new SimpleSword(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelSword");
		tungstenSteelShovel = new SimpleShovel(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelShovel");
		tungstenSteelAxe = new SimpleAxe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelAxe");
		tungstenSteelPickaxe = new SimplePickaxe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelPickaxe");
		tungstenSteelHoe = new SimpleHoe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHoe");
		tungstenSteelHelm = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 0).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHelm");
		tungstenSteelChest = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 1).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelChest");
		tungstenSteelLegs = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 2).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelLegs");
		tungstenSteelBoots = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 3).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelBoots");

		// Prasinos
		prasinosIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosIngot");
		smallPrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallPrasinosChunkItem");
		mediumPrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumPrasinosChunkItem");
		largePrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("largePrasinosChunkItem");
		prasinosSword = new SimpleSword(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosSword");
		prasinosShovel = new SimpleShovel(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosShovel");
		prasinosAxe = new SimpleAxe(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosAxe");
		prasinosPickaxe = new SimplePickaxe(toolPrasinos)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosPickaxe");
		prasinosHoe = new SimpleHoe(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHoe");
		prasinosHelm = new SimpleArmor(armorPrasinos, rendererPrasinos, 0)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHelm");
		prasinosChest = new SimpleArmor(armorPrasinos, rendererPrasinos, 1)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosChest");
		prasinosLegs = new SimpleArmor(armorPrasinos, rendererPrasinos, 2)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosLegs");
		prasinosBoots = new SimpleArmor(armorPrasinos, rendererPrasinos, 3)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosBoots");

		// define blocks
		blockTungsten = new SimpleBlock(Material.iron).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(10.0F).setResistance(22.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockTungsten");

		oreTungsten = new SimpleBlock(Material.iron).modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(4.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal).setBlockName("oreTungsten");

		blockTungstenCarbide = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(10.0F).setResistance(22.0F)
				.setStepSound(Block.soundTypeMetal)).setAsBeaconBase(true)
				.setBlockName("blockTungstenCarbide");

		blockValfram = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(10.0F).setResistance(22.0F)
				.setStepSound(Block.soundTypeMetal)).setAsBeaconBase(true)
				.setBlockName("blockValfram");

		blockTungstenSteel = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(15.0F).setResistance(25.0F)
				.setStepSound(Block.soundTypeMetal)).setAsBeaconBase(true)
				.setBlockName("blockTungstenSteel");

		blockPrasinos = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungsten.tabAkkamaddiTungsten)
				.setHardness(18.0F).setResistance(32.0F)
				.setStepSound(Block.soundTypeMetal)).setAsBeaconBase(true)
				.setBlockName("blockPrasinos");

		blockTungsten.setHarvestLevel("pickaxe", 0);
		oreTungsten.setHarvestLevel("pickaxe", 2);
		blockTungstenSteel.setHarvestLevel("pickaxe", 0);
		blockPrasinos.setHarvestLevel("pickaxe", 0);
		blockTungstenCarbide.setHarvestLevel("pickaxe", 0);
		blockValfram.setHarvestLevel("pickaxe", 0);

		((SimpleBlock) blockTungsten).setAsBeaconBase(true);
		((SimpleBlock) blockTungstenSteel).setAsBeaconBase(true);
		((SimpleBlock) blockPrasinos).setAsBeaconBase(true);
		((SimpleBlock) blockTungstenCarbide).setAsBeaconBase(true);
		((SimpleBlock) blockValfram).setAsBeaconBase(true);

		armorTungsten.customCraftingMaterial = SimpleTungsten.prasinosIngot;
		armorTungstenCarbide.customCraftingMaterial = SimpleTungsten.prasinosCarbideIngot;
		armorValfram.customCraftingMaterial = SimpleTungsten.valframIngot;
		armorTungstenSteel.customCraftingMaterial = SimpleTungsten.prasinosSteelIngot;
		armorPrasinos.customCraftingMaterial = SimpleTungsten.prasinosIngot;
		toolTungsten.customCraftingMaterial = SimpleTungsten.prasinosIngot;
		toolTungstenCarbide.customCraftingMaterial = SimpleTungsten.prasinosCarbideIngot;
		toolValfram.customCraftingMaterial = SimpleTungsten.valframIngot;
		toolTungstenSteel.customCraftingMaterial = SimpleTungsten.prasinosSteelIngot;
		toolPrasinos.customCraftingMaterial = SimpleTungsten.prasinosIngot;

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
				prasinosCarbideIngot), 1, 2, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				prasinosCarbideSword), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				prasinosCarbidePickaxe), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframIngot), 1,
				1, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframSword), 1,
				1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(valframPickaxe),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				prasinosSteelIngot), 1, 2, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				prasinosSteelSword), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				prasinosSteelPickaxe), 1, 2, 1);
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
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosCarbideSword),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest",
				new ItemStack(prasinosCarbidePickaxe), 1, 1, 1);
		LootHelper
				.addLoot("dungeonChest", new ItemStack(valframSword), 1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosSteelSword),
				2, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(prasinosSteelPickaxe),
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
				prasinosCarbideIngot), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				prasinosCarbidePickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				prasinosCarbideShovel), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(valframPickaxe),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				prasinosSteelIngot), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				prasinosSteelPickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				prasinosSteelShovel), 1, 2, 1);
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
				prasinosSteelSword), 1, 4, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelHelm), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelChest), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelLegs), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelBoots), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelPickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelShovel), 1, 5, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				prasinosSteelIngot), 3, 5, 4);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideSword), 1, 4, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideHelm), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideChest), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideLegs), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideBoots), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbidePickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideShovel), 1, 5, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				prasinosCarbideIngot), 3, 5, 3);
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
		// recipes
		TungstenRecipes.doTungstenRecipes();

		MinecraftForge.EVENT_BUS.register(new HandlerArmor());
		GameRegistry.registerWorldGenerator(new SimpleTungstenGenerator(), 1);
		APIcore.instance.joinWorldModRegistry.add(new JoinWorldHandler());
	}

	/**
	 * Called during the Init phase.
	 * @param event FMLInitializationEvent
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		// run tab icon call
		setTabIcons();
	}

	/**
	 * Called during the PostInit phase.
	 * @param event FMLPostInitializationEvent
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}

	/**
	 * Sets the tool and armor stats from the Settings file.
	 */
	private static void setToolAndArmorStats() 
	{
		/**
		 * ToolMaterial
		 */
		toolTungsten = EnumHelper.addToolMaterial("TUNGSTEN",
				Settings.tungstenMiningLevel, Settings.tungstenUsesNum,
				Settings.tungstenMiningSpeed, Settings.tungstenDamageVsEntity,
				Settings.tungstenEnchantability);
		toolTungstenCarbide = EnumHelper.addToolMaterial("TUNGSTENCARBIDE",
				Settings.tungstenCarbideMiningLevel, Settings.tungstenCarbideUsesNum,
				Settings.tungstenCarbideMiningSpeed, Settings.tungstenCarbideDamageVsEntity,
				Settings.tungstenCarbideEnchantability);
		toolValfram = EnumHelper.addToolMaterial("VALFRAM",
				Settings.valframMiningLevel, Settings.valframUsesNum,
				Settings.valframMiningSpeed, Settings.valframDamageVsEntity,
				Settings.valframEnchantability);
		toolTungstenSteel = EnumHelper.addToolMaterial("TUNGSTENSTEEL",
				Settings.tungstenSteelMiningLevel, Settings.tungstenSteelUsesNum,
				Settings.tungstenSteelMiningSpeed, Settings.tungstenSteelDamageVsEntity,
				Settings.tungstenSteelEnchantability);
		toolPrasinos = EnumHelper.addToolMaterial("PRASINOS",
				Settings.prasinosMiningLevel, Settings.prasinosUsesNum,
				Settings.prasinosMiningSpeed, Settings.prasinosDamageVsEntity,
				Settings.prasinosEnchantability);

		/**
		 * ArmorMaterial. In form ("NAME", max damage (like uses, multiply by
		 * pieces for their max damage), new int[] {helmet defense, chestplate
		 * defense, leggings defense, boots defense}, enchantability)
		 */
		armorTungsten = EnumHelper.addArmorMaterial("TUNGSTEN",
				Settings.tungstenArmorDurability,
				Settings.tungstenArmorDamageReduction,
				Settings.tungstenArmorEnchantability);
		armorTungstenCarbide = EnumHelper.addArmorMaterial("TUNGSTENCARBIDE",
				Settings.tungstenCarbideArmorDurability,
				Settings.tungstenCarbideArmorDamageReduction,
				Settings.tungstenCarbideArmorEnchantability);
		armorValfram = EnumHelper.addArmorMaterial("VALFRAM",
				Settings.valframArmorDurability,
				Settings.valframArmorDamageReduction,
				Settings.valframArmorEnchantability);
		armorTungstenSteel = EnumHelper.addArmorMaterial("TUNGSTENSTEEL",
				Settings.tungstenSteelArmorDurability,
				Settings.tungstenSteelArmorDamageReduction,
				Settings.tungstenSteelArmorEnchantability);
		armorPrasinos = EnumHelper.addArmorMaterial("PRASINOS",
				Settings.prasinosArmorDurability,
				Settings.prasinosArmorDamageReduction,
				Settings.prasinosArmorEnchantability);
	} // end setToolAndArmorStats()
	
	/**
	 * Creating the custom tab using the API class "SimpleTab" and setting
	 * its icon.
	 */
	private void setTabIcons() {
		tabAkkamaddiTungsten.setIcon(new ItemStack(oreTungsten));
	}


} // end class SimpleTungsten
