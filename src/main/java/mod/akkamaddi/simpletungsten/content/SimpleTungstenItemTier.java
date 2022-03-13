package mod.akkamaddi.simpletungsten.content;

import java.util.List;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public final class SimpleTungstenItemTier 
{
    public static final Tag.Named<Block> TUNGSTEN_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleTungsten.MODID, "needs_tungsten_tool"));
    public static final Tag.Named<Block> TUNGSTEN_CARBIDE_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleTungsten.MODID, "needs_tungsten_carbide_tool"));
    public static final Tag.Named<Block> VALFRAM_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleTungsten.MODID, "needs_valfram_tool"));
    public static final Tag.Named<Block> TUNGSTEN_STEEL_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleTungsten.MODID, "needs_tungsten_steel_tool"));
    public static final Tag.Named<Block> PRASINOS_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleTungsten.MODID, "needs_prasinos_tool"));
   
    public static final Tier TUNGSTEN = TierSortingRegistry.registerTier( 
            new ForgeTier(Tiers.IRON.getLevel(), 1320, 4.5F, 2.0F, 6, TUNGSTEN_TAG, ()->Ingredient.of(ModItems.tungsten_ingot.get())),
            new ResourceLocation(SimpleTungsten.MODID, "tungsten"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
    public static final Tier TUNGSTEN_CARBIDE = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 1360, 15.0F, 3.0F, 12, TUNGSTEN_CARBIDE_TAG, ()->Ingredient.of( ModItems.tungsten_carbide_ingot.get())),
            new ResourceLocation(SimpleTungsten.MODID, "tungsten_carbide"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
            
    public static final Tier VALFRAM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 1420, 17.0F, 3.0F, 20, VALFRAM_TAG, ()->Ingredient.of( ModItems.valfram_ingot.get())),
            new ResourceLocation(SimpleTungsten.MODID, "valfram"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
            
    public static final Tier TUNGSTEN_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 1680, 10.0F, 3.0F, 7, TUNGSTEN_STEEL_TAG, ()->Ingredient.of( ModItems.tungsten_steel_ingot.get())),
            new ResourceLocation(SimpleTungsten.MODID, "tungsten_steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
            
    public static final Tier PRASINOS = TierSortingRegistry.registerTier( 
            new ForgeTier(Tiers.NETHERITE.getLevel(), 2640, 13.0F, 5.0F, 9, PRASINOS_TAG, ()->Ingredient.of( ModItems.prasinos_ingot.get())),
            new ResourceLocation(SimpleTungsten.MODID, "prasinos"), List.of(Tiers.NETHERITE), List.of());
    
} // end-enum
