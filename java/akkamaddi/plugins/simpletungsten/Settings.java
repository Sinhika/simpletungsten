package akkamaddi.plugins.simpletungsten;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import akkamaddi.api.core.ASettings;
import alexndr.api.core.LogHelper;


public class Settings extends ASettings 
{
	public static void createOrLoadSettings(FMLPreInitializationEvent event)
	{
	    config = GetConfig(event, "akkamaddi", "simpletungsten.cfg");
	    
		try
		{
			LogHelper.verboseInfo(ModInfo.ID, "Loading Settings...");
			config.load();
			genericSettings(ModInfo.ID, "Tungsten & Tungsten alloys");
			
		    //Adjustable Ore Spawn Rates
			adjustOreSpawnRates();
			
			//Armor Stat Modification
			if (enableArmorStatModification)
			{
				LogHelper.verboseInfo(ModInfo.ID, "Armor Stat Modification enabled!");
				customizeArmorStats();
			} // end-if enableArmorStatModification
			else armorStatDefaults();
		
			//Block Stat Modification
			if(enableBlockStatModification)
			{
				LogHelper.verboseInfo(ModInfo.ID, "Block Stat Modification enabled!");
				customizeBlockStats();
			}
			else blockStatDefaults();
			
			if(enableToolStatModification)
			{
				LogHelper.verboseInfo(ModInfo.ID, "Tool Stat Modification enabled!");
				customizeToolStats();
			}
			else toolStatDefaults();
		} // end-try
		catch(Exception e)
		{
			LogHelper.severe(ModInfo.ID, "Settings failed to load correctly. The plugin may not function correctly");
		}
		
		finally
		{
			config.save();
			LogHelper.verboseInfo(ModInfo.ID, "Settings loaded successfully");
		}
	} // end createOrLoadSettings()

	/** 
	 * loads/sets the ore generation variables.
	 */
	public static void adjustOreSpawnRates()
	{
		tungstenSpawnRate = config.getInt("Tungsten Ore Worldgen", "Tungsten Spawn Rate", 5, 0, 5000,
				"Controls the spawn rate of Tungsten Ore.");
		tungstenVeinSize = config.getInt("Tungsten Ore Worldgen", "Tungsten Vein Size", 5, 0, 5000, 
						"Controls the max vein size of Tungsten Ore.");
		tungstenMaxSpawnHeight = config.getInt("Tungsten Ore Worldgen", "Tungsten Maximum Spawn Height", 
						18, 0, 255,	"Controls the max spawn height of Tungsten Ore.");
		tungstenMinSpawnHeight = config.getInt("Tungsten Ore Worldgen",	"Tungsten Minimum Spawn Height", 
						0, 0, 255,	"Controls the min spawn height of Tungsten Ore.");
	}
	
	/**
	 * Sets the default armor stats.
	 */
	public static void armorStatDefaults() 
	{
		tungstenArmorDurability = 24;
		tungstenArmorDamageReduction = new int[] { 3, 4, 3, 3 };
		tungstenArmorEnchantability = 8;
		tungstenCarbideArmorDurability = 26;
		tungstenCarbideArmorDamageReduction = new int[] { 4, 6, 5, 4 };
		tungstenCarbideArmorEnchantability = 12;
		valframArmorDurability = 28;
		valframArmorDamageReduction = new int[] { 4, 7, 6, 4 };
		valframArmorEnchantability = 20;
		tungstenSteelArmorDurability = 24;
		tungstenSteelArmorDamageReduction = new int[] { 4, 7, 6, 4 };
		tungstenSteelArmorEnchantability = 7;
		prasinosArmorDurability = 45;
		prasinosArmorDamageReduction = new int[] { 5, 9, 7, 5 };
		prasinosArmorEnchantability = 11;
	} // end armorStatDefaults()

	/**
	 * sets customized armor stats.
	 */
	public static void customizeArmorStats() 
	{
		tungstenArmorDurability = config.getInt("Tungsten Armor Durability",
				"Armor Stat Modification", 24, 0, 255,
				"Controls the durability of Tungsten Armor.");
		tungstenArmorDamageReduction = config
				.get("Armor Stat Modification",
						"Tungsten Armor Damage Reduction Array",
						new int[] { 3, 4, 3, 3 }).getIntList();
		tungstenArmorEnchantability = config.getInt(
				"Tungsten Armor Enchantability", "Armor Stat Modification", 8, 0,
				255, "Controls the enchantability of Tungsten Armor.");

		tungstenCarbideArmorDurability = config.getInt(
				"Tungsten Carbide Armor Durability", "Armor Stat Modification", 26, 0, 255,
				"Controls the durability of Tungsten Carbide Armor.");
		tungstenCarbideArmorDamageReduction = config.get(
				"Armor Stat Modification", "Tungsten Carbide Armor Damage Reduction Array",
				new int[] { 4, 6, 5, 4 }).getIntList();
		tungstenCarbideArmorEnchantability = config.getInt(
				"Tungsten Carbide Armor Enchantability", "Armor Stat Modification", 12, 0,
				255, "Controls the enchantability of Tungsten Carbide Armor.");

		valframArmorDurability = config.getInt("Valfram Armor Durability",
				"Armor Stat Modification", 28, 0, 255,
				"Controls the durability of Valfram Armor.");
		valframArmorDamageReduction = config.get("Armor Stat Modification",
				"Valfram Armor Damage Reduction Array",
				new int[] { 4, 7, 6, 4 }).getIntList();
		valframArmorEnchantability = config.getInt(
				"Valfram Armor Enchantability", "Armor Stat Modification", 20,
				0, 255, "Controls the enchantability of Valfram Armor.");

		tungstenSteelArmorDurability = config.getInt(
				"Tungsten Steel Armor Durability", "Armor Stat Modification", 24,
				0, 255, "Controls the durability of Tungsten Steel Armor.");
		tungstenSteelArmorDamageReduction = config.get(
				"Armor Stat Modification",
				"Tungsten Steel Armor Damage Reduction Array",
				new int[] { 4, 7, 6, 4 }).getIntList();
		tungstenSteelArmorEnchantability = config.getInt(
				"Tungsten Steel Armor Enchantability", "Armor Stat Modification",
				7, 0, 255, "Controls the enchantability of Tungsten Steel Armor.");

		prasinosArmorDurability = config.getInt("Prasinos Armor Durability",
				"Armor Stat Modification", 45, 0, 255,
				"Controls the durability of Prasinos Armor.");
		prasinosArmorDamageReduction = config.get("Armor Stat Modification",
				"Prasinos Armor Damage Reduction Array", new int[] { 5, 9, 7, 5 })
				.getIntList();
		prasinosArmorEnchantability = config.getInt(
				"Prasinos Armor Enchantability", "Armor Stat Modification", 11, 0,
				255, "Controls the enchantability of Prasinos Armor.");
	} // end customizeArmorStatus
	

	/**
	 * Sets the default block stats.
	 */
	public static void blockStatDefaults() 
	{
	} // end blockStatDefaults()

	/**
	 * Sets the default tool stats.
	 */
	public static void toolStatDefaults() 
	{
		tungstenMiningLevel = 2;
		tungstenUsesNum = 1320;
		tungstenMiningSpeed = 4.5F;
		tungstenDamageVsEntity = 2.0F;
		tungstenEnchantability = 6;
		tungstenCarbideMiningLevel = 2;
		tungstenCarbideUsesNum = 1360;
		tungstenCarbideMiningSpeed = 15.0F;
		tungstenCarbideDamageVsEntity = 3.0F;
		tungstenCarbideEnchantability = 12;
		valframMiningLevel = 3;
		valframUsesNum = 1420;
		valframMiningSpeed = 17.0F;
		valframDamageVsEntity = 3.0F;
		valframEnchantability = 20;
		tungstenSteelMiningLevel = 2;
		tungstenSteelUsesNum = 1680;
		tungstenSteelMiningSpeed = 10.0F;
		tungstenSteelDamageVsEntity = 3.0F;
		tungstenSteelEnchantability = 7;
		prasinosMiningLevel = 4;
		prasinosUsesNum = 2640;
		prasinosMiningSpeed = 13.0F;
		prasinosDamageVsEntity = 5.0F;
		prasinosEnchantability = 9;
	} // end toolStatDefaults()
	
	/**
	 * set customized tool stats.
	 */
	public static void customizeToolStats() 
	{
		tungstenMiningLevel = config
				.getInt("Tungsten Mining Level",
						"Tool Stat Modification",
						2,
						0,
						255,
						"Controls the mining level of Tungsten Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		tungstenUsesNum = config.getInt("Tungsten Tools Durability",
				"Tool Stat Modification", 1320, 0, 32000,
				"Controls the number of uses Tungsten Tools have.");
		tungstenMiningSpeed = config
				.getFloat("Tungsten Mining Speed", "Tool Stat Modification",
						4.5F, 0, 32000,
						"Controls the speed at which Tungsten Tools harvest their appropriate blocks.");
		tungstenDamageVsEntity = config
				.getFloat("Tungsten Damage Vs. Entities",
						"Tool Stat Modification", 2.0F, 0, 32000,
						"Controls the amount of damage that Tungsten Tools will do to entities.");
		tungstenEnchantability = config.getInt("Tungsten Tools Enchantability",
				"Tool Stat Modification", 6, 0, 32000,
				"Controls the enchantability of Tungsten Tools.");

		tungstenCarbideMiningLevel = config
				.getInt("Tungsten Carbide Mining Level",
						"Tool Stat Modification",
						2,
						0,
						255,
						"Controls the mining level of Tungsten Carbide Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		tungstenCarbideUsesNum = config.getInt(
				"Tungsten Carbide Tools Durability", "Tool Stat Modification",
				1360, 0, 32000,
				"Controls the number of uses Tungsten Carbide Tools have.");
		tungstenCarbideMiningSpeed = config
				.getFloat(
						"Tungsten Carbide Mining Speed",
						"Tool Stat Modification",
						15.0F,
						0,
						32000,
						"Controls the speed at which Tungsten Carbide Tools harvest their appropriate blocks.");
		tungstenCarbideDamageVsEntity = config
				.getFloat(
						"Tungsten Carbide Damage Vs. Entities",
						"Tool Stat Modification",
						3.0F,
						0,
						32000,
						"Controls the amount of damage that Tungsten Carbide Tools will do to entities.");
		tungstenCarbideEnchantability = config.getInt(
				"Tungsten Carbide Tools Enchantability",
				"Tool Stat Modification", 12, 0, 32000,
				"Controls the enchantability of Tungsten Carbide Tools.");

		valframMiningLevel = config
				.getInt("Valfram Mining Level",
						"Tool Stat Modification",
						3,
						0,
						255,
						"Controls the mining level of Valfram Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		valframUsesNum = config.getInt("Valfram Tools Durability",
				"Tool Stat Modification", 1420, 0, 32000,
				"Controls the number of uses Valfram Tools have.");
		valframMiningSpeed = config
				.getFloat("Valfram Mining Speed", "Tool Stat Modification",
						17.0F, 0, 32000,
						"Controls the speed at which Valfram Tools harvest their appropriate blocks.");
		valframDamageVsEntity = config
				.getFloat("Valfram Damage Vs. Entities",
						"Tool Stat Modification", 3.0F, 0, 32000,
						"Controls the amount of damage Valfram Tools will do to entities.");
		valframEnchantability = config.getInt("Valfram Tools Enchantability",
				"Tool Stat Modification", 20, 0, 32000,
				"Controls the enchantability of Valfram Tools.");

		tungstenSteelMiningLevel = config
				.getInt("Tungsten Steel Mining Level",
						"Tool Stat Modification",
						2,
						0,
						255,
						"Controls the mining level of Tungsten Steel Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		tungstenSteelUsesNum = config.getInt("Tungsten Steel Tools Durability",
				"Tool Stat Modification", 1680, 0, 32000,
				"Controls the number of uses Tungsten Steel Tools have.");
		tungstenSteelMiningSpeed = config
				.getFloat(
						"Tungsten Steel Mining Speed",
						"Tool Stat Modification",
						10.0F,
						0,
						32000,
						"Controls the speed at which Tungsten Steel Tools harvest their appropriate blocks.");
		tungstenSteelDamageVsEntity = config
				.getFloat("Tungsten Steel Damage Vs. Entities",
						"Tool Stat Modification", 3.0F, 0, 32000,
						"Controls the amount of damage Tungsten Steel Tools will do to entities.");
		tungstenSteelEnchantability = config.getInt(
				"Tungsten Steel Tools Enchantability",
				"Tool Stat Modification", 7, 0, 32000,
				"Controls the enchantability of Tungsten Steel Tools.");

		prasinosMiningLevel = config
				.getInt("Prasinos Mining Level",
						"Tool Stat Modification",
						4,
						0,
						255,
						"Controls the mining level of Prasinos Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		prasinosUsesNum = config.getInt("Prasinos Tools Durability",
				"Tool Stat Modification", 2640, 0, 32000,
				"Controls the number of uses Prasinos Tools have.");
		prasinosMiningSpeed = config
				.getFloat("Prasinos Mining Speed", "Tool Stat Modification",
						13.0F, 0, 32000,
						"Controls the speed at which Prasinos Tools harvest their appropriate blocks.");
		prasinosDamageVsEntity = config
				.getFloat("Prasinos Damage Vs. Entity",
						"Tool Stat Modification", 5.0F, 0, 32000,
						"Controls the amount of damage Prasinos Tools will do to entities.");
		prasinosEnchantability = config.getInt("Prasinos Tools Enchantability",
				"Tool Stat Modification", 9, 0, 32000,
				"Controls the enchantability of Prasinos Tools.");
		
	} // end customizeToolStats()
	

	
	// spawning
	public static int tungstenSpawnRate, tungstenVeinSize, tungstenMaxSpawnHeight, tungstenMinSpawnHeight;
	
	// Tool Stats
	public static int tungstenMiningLevel, tungstenCarbideMiningLevel,
			valframMiningLevel, tungstenSteelMiningLevel, prasinosMiningLevel;
	public static int tungstenUsesNum, tungstenCarbideUsesNum, valframUsesNum,
			tungstenSteelUsesNum, prasinosUsesNum;
	public static float tungstenMiningSpeed, tungstenCarbideMiningSpeed,
			valframMiningSpeed, tungstenSteelMiningSpeed, prasinosMiningSpeed;
	public static float tungstenDamageVsEntity, tungstenCarbideDamageVsEntity,
			valframDamageVsEntity, tungstenSteelDamageVsEntity,
			prasinosDamageVsEntity;
	public static int tungstenEnchantability, tungstenCarbideEnchantability,
			valframEnchantability, tungstenSteelEnchantability,
			prasinosEnchantability;

	//Armor Stats
	public static int tungstenArmorDurability, tungstenCarbideArmorDurability,
			valframArmorDurability, tungstenSteelArmorDurability,
			prasinosArmorDurability;
	public static int[] tungstenArmorDamageReduction, tungstenCarbideArmorDamageReduction,
			valframArmorDamageReduction, tungstenSteelArmorDamageReduction,
			prasinosArmorDamageReduction;
	public static int tungstenArmorEnchantability, tungstenCarbideArmorEnchantability,
			valframArmorEnchantability, tungstenSteelArmorEnchantability,
			prasinosArmorEnchantability;

} // end class Settings
