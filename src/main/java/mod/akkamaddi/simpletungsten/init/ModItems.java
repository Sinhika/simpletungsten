package mod.akkamaddi.simpletungsten.init;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import net.minecraft.item.Item;
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
    
} // end class
