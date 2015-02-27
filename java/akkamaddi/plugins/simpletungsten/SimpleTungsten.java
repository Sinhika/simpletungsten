package akkamaddi.plugins.simpletungsten;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;

import alexndr.api.helpers.game.OreGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, 
	dependencies = "required-after:simplecore; required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore")

public class SimpleTungsten 
{
	// tab
	public static SimpleTab tabAkkamaddiTungsten;

	// armor materials
	public static ArmorMaterial armorTungsten, armorTungstenCarbide,
			armorValfram, armorTungstenSteel, armorPrasinos;

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
		LogHelper.info("Loading SimpleTungsten...");
		tabAkkamaddiTungsten = new SimpleTab("tabAkkamaddiTungsten", ContentTypes.CreativeTab.GENERAL);
		
		//Configuration
		Settings.createOrLoadSettings(event);
		
		//Content
		setToolAndArmorStats();
		Content.preInitialize();
		Recipes.preInitialize();
		Content.setLoot();

		MinecraftForge.EVENT_BUS.register(new HandlerArmor());
	} // end preInit()


	/**
	 * Called during the Init phase.
	 * @param event FMLInitializationEvent
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		// run tab icon call
		setTabIcons();
		setRepairMaterials();
		Recipes.initialize();
		setOreGenSettings();
	}

	/**
	 * Called during the PostInit phase.
	 * @param event FMLPostInitializationEvent
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		LogHelper.info("SimpleTungsten loaded");
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
	 * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
	 */
	private static void setRepairMaterials()
	{
		//Tools
		toolTungsten.setRepairItem(new ItemStack(Content.tungstenIngot));
		toolTungstenCarbide.setRepairItem(new ItemStack(Content.tungstenCarbideIngot));
		toolValfram.setRepairItem(new ItemStack(Content.valframIngot));
		toolTungstenSteel.setRepairItem(new ItemStack(Content.tungstenSteelIngot));
		toolPrasinos.setRepairItem(new ItemStack(Content.prasinosIngot));
	
		//Armor
		armorTungsten.customCraftingMaterial = Content.tungstenIngot;
		armorTungstenCarbide.customCraftingMaterial = Content.tungstenCarbideIngot;
		armorValfram.customCraftingMaterial = Content.valframIngot;
		armorTungstenSteel.customCraftingMaterial = Content.tungstenSteelIngot;
		armorPrasinos.customCraftingMaterial = Content.prasinosIngot;
	} // end setRepairMaterials()

	/**
	 * Creating the custom tab using the API class "SimpleTab" and setting
	 * its icon.
	 */
	private void setTabIcons() {
		tabAkkamaddiTungsten.setIcon(new ItemStack(Content.oreTungsten));
	}

	/**
	 * Registers each ore to be generated.
	 */
	private static void setOreGenSettings()
	{
		OreGenerator.INSTANCE.registerOreForGeneration(0, Content.oreTungsten,
				Blocks.stone, Settings.tungstenVeinSize,
				Settings.tungstenSpawnRate, Settings.tungstenMaxSpawnHeight,
				Settings.tungstenMinSpawnHeight);
	} // end setOreGenSettings()
	
} // end class SimpleTungsten
