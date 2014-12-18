package akkamaddi.plugins.simpletungsten;

import alexndr.api.content.items.SimpleBucket;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.core.LogHelper;
import alexndr.api.helpers.game.TabHelper;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

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
