package mod.akkamaddi.simpletungsten.init;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.content.SimpleTungstenArmorMaterial;
import mod.akkamaddi.simpletungsten.content.SimpleTungstenItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleTungsten.MODID);
    
    // Simple Items: ingots, chunks, nuggets
    public static final RegistryObject<Item> tungsten_ingot = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tungsten_nugget = ITEMS.register("tungsten_nugget",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tungsten_carbide_ingot = ITEMS.register("tungsten_carbide_ingot",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tungsten_carbide_nugget = ITEMS.register("tungsten_carbide_nugget",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_tungsten_carbide_chunk = ITEMS.register("medium_tungsten_carbide_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_tungsten_carbide_chunk = ITEMS.register("large_tungsten_carbide_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> valfram_ingot = ITEMS.register("valfram_ingot",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> valfram_nugget = ITEMS.register("valfram_nugget",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_valfram_chunk = ITEMS.register("medium_valfram_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_valfram_chunk = ITEMS.register("large_valfram_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tungsten_steel_ingot = ITEMS.register("tungsten_steel_ingot",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tungsten_steel_nugget = ITEMS.register("tungsten_steel_nugget",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_tungsten_steel_chunk = ITEMS.register("large_tungsten_steel_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> prasinos_ingot = ITEMS.register("prasinos_ingot",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> prasinos_nugget = ITEMS.register("prasinos_nugget",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_prasinos_chunk = ITEMS.register("medium_prasinos_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_prasinos_chunk = ITEMS.register("large_prasinos_chunk",
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // TOOLS & WEAPONS
    // swords
    public static final RegistryObject<SwordItem> tungsten_sword = ITEMS.register("tungsten_sword",
            () -> new SwordItem(SimpleTungstenItemTier.TUNGSTEN, 3, -2.4F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> tungsten_carbide_sword = ITEMS.register("tungsten_carbide_sword",
            () -> new SwordItem(SimpleTungstenItemTier.TUNGSTEN_CARBIDE, 3, -2.4F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> valfram_sword = ITEMS.register("valfram_sword",
            () -> new SwordItem(SimpleTungstenItemTier.VALFRAM, 3, -2.4F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> tungsten_steel_sword = ITEMS.register("tungsten_steel_sword",
            () -> new SwordItem(SimpleTungstenItemTier.TUNGSTEN_STEEL, 3, -2.4F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> prasinos_sword = ITEMS.register("prasinos_sword",
            () -> new SwordItem(SimpleTungstenItemTier.PRASINOS, 3, -2.4F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
  
    // axes
    public static final RegistryObject<AxeItem> tungsten_axe = ITEMS.register("tungsten_axe",
            () -> new AxeItem(SimpleTungstenItemTier.TUNGSTEN, 6.0F, 3.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> tungsten_carbide_axe = ITEMS.register("tungsten_carbide_axe",
            () -> new AxeItem(SimpleTungstenItemTier.TUNGSTEN_CARBIDE, 6.0F, 3.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> valfram_axe = ITEMS.register("valfram_axe",
            () -> new AxeItem(SimpleTungstenItemTier.VALFRAM, 6.0F, 3.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> tungsten_steel_axe = ITEMS.register("tungsten_steel_axe",
            () -> new AxeItem(SimpleTungstenItemTier.TUNGSTEN_STEEL, 6.0F, 3.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> prasinos_axe = ITEMS.register("prasinos_axe",
            () -> new AxeItem(SimpleTungstenItemTier.PRASINOS, 6.0F, 3.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // pickaxes
    public static final RegistryObject<PickaxeItem> tungsten_pickaxe = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(SimpleTungstenItemTier.TUNGSTEN, 1, -2.8F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> tungsten_carbide_pickaxe = ITEMS.register("tungsten_carbide_pickaxe",
            () -> new PickaxeItem(SimpleTungstenItemTier.TUNGSTEN_CARBIDE, 1, -2.8F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> valfram_pickaxe = ITEMS.register("valfram_pickaxe",
            () -> new PickaxeItem(SimpleTungstenItemTier.VALFRAM, 1, -2.8F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> tungsten_steel_pickaxe = ITEMS.register("tungsten_steel_pickaxe",
            () -> new PickaxeItem(SimpleTungstenItemTier.TUNGSTEN_STEEL, 1, -2.8F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> prasinos_pickaxe = ITEMS.register("prasinos_pickaxe",
            () -> new PickaxeItem(SimpleTungstenItemTier.PRASINOS, 1, -2.8F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // hoes
    public static final RegistryObject<HoeItem> tungsten_hoe = ITEMS.register("tungsten_hoe",
            () -> new HoeItem(SimpleTungstenItemTier.TUNGSTEN, -1.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> tungsten_carbide_hoe = ITEMS.register("tungsten_carbide_hoe",
            () -> new HoeItem(SimpleTungstenItemTier.TUNGSTEN_CARBIDE, -1.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> valfram_hoe = ITEMS.register("valfram_hoe",
            () -> new HoeItem(SimpleTungstenItemTier.VALFRAM, -1.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> tungsten_steel_hoe = ITEMS.register("tungsten_steel_hoe",
            () -> new HoeItem(SimpleTungstenItemTier.TUNGSTEN_STEEL, -1.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> prasinos_hoe = ITEMS.register("prasinos_hoe",
            () -> new HoeItem(SimpleTungstenItemTier.PRASINOS, -1.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
  
    // shovel
    public static final RegistryObject<ShovelItem> tungsten_shovel = ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(SimpleTungstenItemTier.TUNGSTEN, 1.5F, -2.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> tungsten_carbide_shovel = ITEMS.register("tungsten_carbide_shovel",
            () -> new ShovelItem(SimpleTungstenItemTier.TUNGSTEN_CARBIDE, 1.5F, -2.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> valfram_shovel = ITEMS.register("valfram_shovel",
            () -> new ShovelItem(SimpleTungstenItemTier.VALFRAM, 1.5F, -2.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> tungsten_steel_shovel = ITEMS.register("tungsten_steel_shovel",
            () -> new ShovelItem(SimpleTungstenItemTier.TUNGSTEN_STEEL, 1.5F, -2.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> prasinos_shovel = ITEMS.register("prasinos_shovel",
            () -> new ShovelItem(SimpleTungstenItemTier.PRASINOS, 1.5F, -2.0F,
                                new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
  
    // ARMOR
    // tungsten
    public static final RegistryObject<ArmorItem> tungsten_helmet = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_leggings = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_chestplate = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_boots = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // tungsten carbide
    public static final RegistryObject<ArmorItem> tungsten_carbide_helmet = ITEMS.register("tungsten_carbide_helmet",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_carbide_leggings = ITEMS.register("tungsten_carbide_leggings",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_carbide_chestplate = ITEMS.register("tungsten_carbide_chestplate",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_carbide_boots = ITEMS.register("tungsten_carbide_boots",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // valfram
    public static final RegistryObject<ArmorItem> valfram_helmet = ITEMS.register("valfram_helmet",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.VALFRAM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> valfram_leggings = ITEMS.register("valfram_leggings",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.VALFRAM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> valfram_chestplate = ITEMS.register("valfram_chestplate",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.VALFRAM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> valfram_boots = ITEMS.register("valfram_boots",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.VALFRAM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));

    // tungsten steel
    public static final RegistryObject<ArmorItem> tungsten_steel_helmet = ITEMS.register("tungsten_steel_helmet",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_steel_leggings = ITEMS.register("tungsten_steel_leggings",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_steel_chestplate = ITEMS.register("tungsten_steel_chestplate",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tungsten_steel_boots = ITEMS.register("tungsten_steel_boots",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
   // prasinos
    public static final RegistryObject<ArmorItem> prasinos_helmet = ITEMS.register("prasinos_helmet",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.PRASINOS, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> prasinos_leggings = ITEMS.register("prasinos_leggings",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.PRASINOS, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> prasinos_chestplate = ITEMS.register("prasinos_chestplate",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.PRASINOS, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> prasinos_boots = ITEMS.register("prasinos_boots",
            () -> new ArmorItem(SimpleTungstenArmorMaterial.PRASINOS, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    
} // end class
