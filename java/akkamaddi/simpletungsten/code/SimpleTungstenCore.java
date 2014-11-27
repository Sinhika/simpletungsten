package akkamaddi.simpletungsten.code;

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
import akkamaddi.akkamaddiCore.api.APIcore;
import akkamaddi.akkamaddiCore.api.CommonProxy;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimpleBlock;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "simpletungsten", name = "Simple Tungsten, and Tungsten alloys", 
	version = "1.7.10-1.3.2", 
	dependencies = "required-after:simpleores ; required-after:fusionplugin ; required-after:akkamaddicore")

public class SimpleTungstenCore
{
    // The instance of your mod that Forge uses.
    @Instance("simpletungsten")
    public static SimpleTungstenCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simpletungsten.code.ClientProxy", 
    			serverSide = "akkamaddi.akkamaddiCore.api.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Tungsten

    // set actual item names

    //Tungsten
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

    // set block names
    public static Block blockTungsten;
    public static Block oreTungsten;

    // spawning
    public static int tungstenSpawnRate;
    public static int tungstenVeinSize;
    public static int tungstenSpawnHeight;
    public static int tungstenMinSpawnHeight;

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

    // config
    public static Configuration config;

    //boolean
    public static boolean enableRecycling;
    public static boolean itemizeMobs;
    public static boolean enableHigherDimensionGen;

    //Higher Dimensions
    public static int[] dimensionIDsArray;

    // tab
    public static SimpleTab tabAkkamaddiTungsten = new SimpleTab("tabAkkamaddiTungsten");

    /**
     * ArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
	public static ArmorMaterial armorTungsten = EnumHelper.addArmorMaterial(
			"TUNGSTEN", 24, new int[] { 3, 4, 3, 3 }, 8);
	public static ArmorMaterial armorTungstenCarbide = EnumHelper
			.addArmorMaterial("TUNGSTENCARBIDE", 26, new int[] { 4, 6, 5, 4 },
					12);
	public static ArmorMaterial armorValfram = EnumHelper.addArmorMaterial(
			"VALFRAM", 28, new int[] { 4, 7, 6, 4 }, 20);
	public static ArmorMaterial armorTungstenSteel = EnumHelper
			.addArmorMaterial("TUNGSTENSTEEL", 30, new int[] { 4, 7, 6, 4 }, 7);
	public static ArmorMaterial armorPrasinos = EnumHelper.addArmorMaterial(
			"PRASINOS", 45, new int[] { 5, 9, 7, 5 }, 11);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererTungsten;
    public static int rendererTungstenCarbide;
    public static int rendererValfram;
    public static int rendererTungstenSteel;
    public static int rendererPrasinos;

    // set tool properties
    // ToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
	public static ToolMaterial toolTungsten = EnumHelper.addToolMaterial(
			"TUNGSTEN", 2, 1320, 4.5F, 2, 6);
	public static ToolMaterial toolTungstenCarbide = EnumHelper
			.addToolMaterial("TUNGSTENCARBIDE", 2, 1360, 15.0F, 3, 12);
	public static ToolMaterial toolValfram = EnumHelper.addToolMaterial(
			"VALFRAM", 3, 1420, 17.0F, 3, 20);
	public static ToolMaterial toolTungstenSteel = EnumHelper.addToolMaterial(
			"TUNGSTENSTEEL", 2, 1680, 10.0F, 3, 7);
	public static ToolMaterial toolPrasinos = EnumHelper.addToolMaterial(
			"PRASINOS", 4, 2640, 13.0F, 5, 9);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiTungsten.setIcon(new ItemStack(oreTungsten));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        File installDir = event.getModConfigurationDirectory();
        File configDir = new File(installDir, "akkamaddi");
        File configFile = new File(configDir, "simpletungsten.cfg");
        Configuration config = new Configuration(configFile);

        config.load();

        //Adjustable Ore Spawn Rates
		tungstenSpawnRate = config.get("Tungsten Ore Worldgen",
				"Tungsten Spawn Rate", 5).getInt();
		tungstenVeinSize = config.get("Tungsten Ore Worldgen",
				"Tungsten Vein Size", 5).getInt();
		tungstenSpawnHeight = config.get("Tungsten Ore Worldgen",
				"Tungsten Maximum Spawn Height", 18).getInt();
		tungstenMinSpawnHeight = config.get("Tungsten Ore Worldgen",
				"Tungsten Minimum Spawn Height", 0).getInt();
        // recycle
        enableRecycling = config.get(Configuration.CATEGORY_GENERAL, "Enable Tungsten & alloy recycling recipes: false or true?", false).getBoolean(false);
        itemizeMobs = config.get(Configuration.CATEGORY_GENERAL, 
        		"Equip mobs with Tungsten gear, true or false", false).getBoolean(false);
        
        //higher dimension
        enableHigherDimensionGen = config.get("Higher World Gen", "Spawn Tungsten in higher dimensions? (Advanced)", false).getBoolean(enableHigherDimensionGen);
        		
         if (enableHigherDimensionGen)
        {
            dimensionIDsArray = config.get("Higher Dimensions", "Higher Dimensions ID List", new int[] {}).getIntList();
            System.out.println("Number of dimension ID's in the array = " + dimensionIDsArray.length);

            try
            {
                for (int i = 0; i < dimensionIDsArray.length; i++)
                {
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Spawn Rate", 6).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Maximum Spawn Height", 32).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Minimum Spawn Height", 0).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Vein Size", 6).getInt();
                    System.out.println("Dimension ID in position " + i + " is " + dimensionIDsArray[i]);
                }
            }
            catch (Exception e)
            {
            }
        }
        else
            dimensionIDsArray = new int[] {};

        config.save();

        // define items
        // Tungsten
		tungstenIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenIngot");
		tungstenSword = new SimpleSword(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSword");
		tungstenShovel = new SimpleShovel(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenShovel");
		tungstenAxe = new SimpleAxe(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenAxe");
		tungstenPickaxe = new SimplePickaxe(toolTungsten)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenPickaxe");
		tungstenHoe = new SimpleHoe(toolTungsten).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHoe");
		tungstenHelm = new SimpleArmor(armorTungsten, rendererTungsten, 0)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenHelm");
		tungstenChest = new SimpleArmor(armorTungsten, rendererTungsten, 1)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenChest");
		tungstenLegs = new SimpleArmor(armorTungsten, rendererTungsten, 2)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenLegs");
		tungstenBoots = new SimpleArmor(armorTungsten, rendererTungsten, 3)
				.modId("simpletungsten").setType("tungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenBoots");
       
        // Tungsten Carbide
		tungstenCarbideIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideIngot");
		smallTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallTungstenCarbideChunkItem");
		mediumTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumTungstenCarbideChunkItem");
		largeTungstenCarbideChunkItem = new SimpleIngot()
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenCarbideChunkItem");
		tungstenCarbideSword = new SimpleSword(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideSword");
		tungstenCarbideShovel = new SimpleShovel(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideShovel");
		tungstenCarbideAxe = new SimpleAxe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideAxe");
		tungstenCarbidePickaxe = new SimplePickaxe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbidePickaxe");
		tungstenCarbideHoe = new SimpleHoe(toolTungstenCarbide)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHoe");
		tungstenCarbideHelm = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 0).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideHelm");
		tungstenCarbideChest = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 1).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideChest");
		tungstenCarbideLegs = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 2).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideLegs");
		tungstenCarbideBoots = new SimpleArmor(armorTungstenCarbide,
				rendererTungsten, 3).modId("simpletungsten")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenCarbideBoots");

        // Valfram
		valframIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframIngot");
		smallValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallValframChunkItem");
		mediumValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumValframChunkItem");
		largeValframChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeValframChunkItem");
		valframSword = new SimpleSword(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframSword");
		valframShovel = new SimpleShovel(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframShovel");
		valframAxe = new SimpleAxe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframAxe");
		valframPickaxe = new SimplePickaxe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframPickaxe");
		valframHoe = new SimpleHoe(toolValfram).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHoe");
		valframHelm = new SimpleArmor(armorValfram, rendererValfram, 0)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframHelm");
		valframChest = new SimpleArmor(armorValfram, rendererValfram, 1)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframChest");
		valframLegs = new SimpleArmor(armorValfram, rendererValfram, 2)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframLegs");
		valframBoots = new SimpleArmor(armorValfram, rendererValfram, 3)
				.modId("simpletungsten").setType("valfram")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("valframBoots");

        // Tungsten Steel
		tungstenSteelIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelIngot");
		largeTungstenSteelChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("largeTungstenSteelChunkItem");
		tungstenSteelSword = new SimpleSword(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelSword");
		tungstenSteelShovel = new SimpleShovel(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelShovel");
		tungstenSteelAxe = new SimpleAxe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelAxe");
		tungstenSteelPickaxe = new SimplePickaxe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelPickaxe");
		tungstenSteelHoe = new SimpleHoe(toolTungstenSteel)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHoe");
		tungstenSteelHelm = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 0).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelHelm");
		tungstenSteelChest = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 1).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelChest");
		tungstenSteelLegs = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 2).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelLegs");
		tungstenSteelBoots = new SimpleArmor(armorTungstenSteel,
				rendererTungstenSteel, 3).modId("simpletungsten")
				.setType("tungstensteel")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("tungstenSteelBoots");

        // Prasinos
		prasinosIngot = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosIngot");
		smallPrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("smallPrasinosChunkItem");
		mediumPrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("mediumPrasinosChunkItem");
		largePrasinosChunkItem = new SimpleIngot().modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("largePrasinosChunkItem");
		prasinosSword = new SimpleSword(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosSword");
		prasinosShovel = new SimpleShovel(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosShovel");
		prasinosAxe = new SimpleAxe(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosAxe");
		prasinosPickaxe = new SimplePickaxe(toolPrasinos)
				.modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosPickaxe");
		prasinosHoe = new SimpleHoe(toolPrasinos).modId("simpletungsten")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHoe");
		prasinosHelm = new SimpleArmor(armorPrasinos, rendererPrasinos, 0)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosHelm");
		prasinosChest = new SimpleArmor(armorPrasinos, rendererPrasinos, 1)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosChest");
		prasinosLegs = new SimpleArmor(armorPrasinos, rendererPrasinos, 2)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosLegs");
		prasinosBoots = new SimpleArmor(armorPrasinos, rendererPrasinos, 3)
				.modId("simpletungsten").setType("prasinos")
				.setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
				.setUnlocalizedName("prasinosBoots");

        // define blocks
        blockTungsten = new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("blockTungsten");

        oreTungsten = new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("oreTungsten");

        blockTungstenCarbide = ((SimpleBlock) new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal))
        .setAsBeaconBase(true)
        .setBlockName("blockTungstenCarbide");

        blockValfram = ((SimpleBlock) new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal))
        .setAsBeaconBase(true)
        .setBlockName("blockValfram");

        blockTungstenSteel = ((SimpleBlock) new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(15.0F).setResistance(25.0F).setStepSound(Block.soundTypeMetal))
        .setAsBeaconBase(true)
        .setBlockName("blockTungstenSteel");

        blockPrasinos = ((SimpleBlock) new SimpleBlock( Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(18.0F).setResistance(32.0F).setStepSound(Block.soundTypeMetal))
        .setAsBeaconBase(true)
        .setBlockName("blockPrasinos");

        blockTungsten.setHarvestLevel("pickaxe", 0);
        oreTungsten.setHarvestLevel("pickaxe", 2);
        blockTungstenSteel.setHarvestLevel( "pickaxe", 0);
        blockPrasinos.setHarvestLevel( "pickaxe", 0);
        blockTungstenCarbide.setHarvestLevel( "pickaxe", 0);
        blockValfram.setHarvestLevel( "pickaxe", 0);

        ((SimpleBlock) blockTungsten).setAsBeaconBase(true);
        ((SimpleBlock) blockTungstenSteel).setAsBeaconBase(true);
        ((SimpleBlock) blockPrasinos).setAsBeaconBase(true);
        ((SimpleBlock) blockTungstenCarbide).setAsBeaconBase(true);
        ((SimpleBlock) blockValfram).setAsBeaconBase(true);
        
        armorTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        armorTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        armorValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        armorTungstenSteel.customCraftingMaterial = SimpleTungstenCore.tungstenSteelIngot;
        armorPrasinos.customCraftingMaterial = SimpleTungstenCore.prasinosIngot;
        toolTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        toolTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        toolValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        toolTungstenSteel.customCraftingMaterial = SimpleTungstenCore.tungstenSteelIngot;
        toolPrasinos.customCraftingMaterial = SimpleTungstenCore.prasinosIngot;

        // loot
		LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenIngot),
				1, 2, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenSword),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenPickaxe),
				1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenAxe), 1,
				1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenShovel),
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
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenIngot), 1, 1,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenPickaxe), 1,
				3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSword), 1, 7,
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
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenIngot),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenPickaxe),
				1, 4, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenShovel),
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
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframPickaxe), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframShovel),
				1, 5, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframIngot),
				3, 5, 3);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenIngot),
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
        //recipes
        TungstenRecipes.doTungstenRecipes();

        // run tab icon call
        setTabIcons();
        MinecraftForge.EVENT_BUS.register(new HandlerArmor());
        GameRegistry.registerWorldGenerator(new SimpleTungstenGenerator(), 1);
        APIcore.instance.joinWorldModRegistry.add(new JoinWorldHandler());
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
