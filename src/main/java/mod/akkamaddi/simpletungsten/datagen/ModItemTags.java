package mod.akkamaddi.simpletungsten.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.MiningItemTags;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends MiningItemTags
{

    public ModItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
			CompletableFuture<TagLookup<Block>> blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTagProvider, SimpleTungsten.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider)
    {
        super.addTags(lookupProvider);
        registerNuggetTags();
        registerIngotTags();
        registerStorageBlockTags();
        registerToolTags(ModItems.ITEMS);
        registerArmorTags(ModItems.ITEMS);
    }

    @Override
    protected void registerOreTags()
    {
        // register "forge:ores" tags
        this.tag(TagUtils.forgeTag( "ores"))
            .addTag(TagUtils.forgeTag("ores/tungsten"));
        this.tag(TagUtils.forgeTag("ores/tungsten"))
            .add(ModBlocks.tungsten_ore.get().asItem())
            .add(ModBlocks.deepslate_tungsten_ore.get().asItem());
        
        // register forge ore_rates tags.
        this.registerOreRateTags( List.of(), // sparse 
                List.of(ModBlocks.tungsten_ore.get(), ModBlocks.deepslate_tungsten_ore.get()), // singular 
                List.of()); // dense

        // register forge:ores_in_ground tags
        this.registerOresInGroundTags( List.of(ModBlocks.tungsten_ore.get()), // stone ores
                List.of( ModBlocks.deepslate_tungsten_ore.get()), // deepslate ores
                List.of());  // netherrack ores
    } // end registerOreTags()

    
    private void registerNuggetTags()
    {
        this.tag(TagUtils.forgeTag("nuggets"))
            .addTag(TagUtils.forgeTag("nuggets/tungsten"))
            .addTag(TagUtils.forgeTag("nuggets/tungsten_carbide"))
            .addTag(TagUtils.forgeTag("nuggets/tungsten_steel"))
            .addTag(TagUtils.forgeTag("nuggets/valfram"))
            .addTag(TagUtils.forgeTag("nuggets/prasinos"));

        this.tag(TagUtils.forgeTag("nuggets/tungsten")).add(ModItems.tungsten_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/tungsten_carbide")).add(ModItems.tungsten_carbide_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/tungsten_steel")).add(ModItems.tungsten_steel_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/valfram")).add(ModItems.valfram_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/prasinos")).add(ModItems.prasinos_nugget.get());
    } // end registerNuggetTags();
    
    private void registerIngotTags()
    {
        this.tag(TagUtils.forgeTag("ingots"))
            .addTag(TagUtils.forgeTag("ingots/tungsten"))
            .addTag(TagUtils.forgeTag("ingots/tungsten_carbide"))
            .addTag(TagUtils.forgeTag("ingots/tungsten_steel"))
            .addTag(TagUtils.forgeTag("ingots/valfram"))
            .addTag(TagUtils.forgeTag("ingots/prasinos"));

        this.tag(TagUtils.forgeTag("ingots/tungsten")).add(ModItems.tungsten_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/tungsten_carbide")).add(ModItems.tungsten_carbide_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/tungsten_steel")).add(ModItems.tungsten_steel_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/valfram")).add(ModItems.valfram_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/prasinos")).add(ModItems.prasinos_ingot.get());
    }
    
    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeTag("storage_blocks"))
            .addTag(TagUtils.forgeTag("storage_block/tungsten"))
            .addTag(TagUtils.forgeTag("storage_block/raw_tungsten"))
            .addTag(TagUtils.forgeTag("storage_block/tungsten_carbide"))
            .addTag(TagUtils.forgeTag("storage_block/tungsten_steel"))
            .addTag(TagUtils.forgeTag("storage_block/valfram"))
            .addTag(TagUtils.forgeTag("storage_block/prasinos"));
            
        this.tag(TagUtils.forgeTag("storage_block/tungsten"))
            .add(ModBlocks.tungsten_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_block/raw_tungsten"))
            .add(ModBlocks.raw_tungsten_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_block/tungsten_carbide"))
            .add(ModBlocks.tungsten_carbide_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_block/tungsten_steel"))
            .add(ModBlocks.tungsten_steel_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_block/valfram"))
            .add(ModBlocks.valfram_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_block/prasinos"))
            .add(ModBlocks.prasinos_block.get().asItem());
        
    } // end registerStorageBlockTags()
    

} // end class
