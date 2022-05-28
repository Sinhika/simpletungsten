package mod.akkamaddi.simpletungsten.datagen;

import java.util.List;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.alexndr.simplecorelib.api.datagen.MiningBlockTags;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockTags extends MiningBlockTags
{

    public ModBlockTags(DataGenerator gen, ExistingFileHelper existingFileHelper)
    {
        super(gen, SimpleTungsten.MODID, existingFileHelper);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void addTags()
    {
        super.addTags();
        registerStorageBlockTags();
        registerBeaconBlockTags();
    }

    @Override
    protected void registerMiningTags()
    {
        // all the registered blocks are mineable.
        List<Block> mineables = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
        
        // do nothing; super() generates all the vanilla blocktags, and we don't want that.
        // note: all the mineable blocks are iron-level.
        registerMineableTags(mineables, 
                 List.of(), // 1 stone
                 List.of(ModBlocks.tungsten_ore.get(), ModBlocks.deepslate_tungsten_ore.get(), ModBlocks.tungsten_block.get(), 
                         ModBlocks.raw_tungsten_block.get(), ModBlocks.tungsten_carbide_block.get(), 
                         ModBlocks.tungsten_steel_block.get()), // 2 - iron
                 List.of(ModBlocks.valfram_block.get()), // 3 - diamond
                 List.of(ModBlocks.prasinos_block.get())); // 4 - netherite
    }

    @Override
    protected void registerOreTags()
    {
        // register "forge:ores" tags
        this.tag(TagUtils.forgeBlockTag( "ores"))
            .addTag(TagUtils.forgeBlockTag("ores/tungsten"));
        this.tag(TagUtils.forgeBlockTag("ores/tungsten"))
            .add(ModBlocks.tungsten_ore.get())
            .add(ModBlocks.deepslate_tungsten_ore.get());
        
        // register forge ore_rates tags.
        this.registerOreRateTags( List.of(), // sparse 
                List.of(ModBlocks.tungsten_ore.get(), ModBlocks.deepslate_tungsten_ore.get()), // singular 
                List.of()); // dense

        // register forge:ores_in_ground tags
        this.registerOresInGroundTags( List.of(ModBlocks.tungsten_ore.get()), // stone ores
                List.of( ModBlocks.deepslate_tungsten_ore.get()), // deepslate ores
                List.of());  // netherrack ores
        
    } // end registerOreTags()

    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeBlockTag("storage_blocks"))
            .addTag(TagUtils.forgeBlockTag("storage_block/tungsten"))
            .addTag(TagUtils.forgeBlockTag("storage_block/raw_tungsten"))
            .addTag(TagUtils.forgeBlockTag("storage_block/tungsten_carbide"))
            .addTag(TagUtils.forgeBlockTag("storage_block/tungsten_steel"))
            .addTag(TagUtils.forgeBlockTag("storage_block/valfram"))
            .addTag(TagUtils.forgeBlockTag("storage_block/prasinos"));
            
        this.tag(TagUtils.forgeBlockTag("storage_block/tungsten"))
            .add(ModBlocks.tungsten_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_block/raw_tungsten"))
            .add(ModBlocks.raw_tungsten_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_block/tungsten_carbide"))
            .add(ModBlocks.tungsten_carbide_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_block/tungsten_steel"))
            .add(ModBlocks.tungsten_steel_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_block/valfram"))
            .add(ModBlocks.valfram_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_block/prasinos"))
            .add(ModBlocks.prasinos_block.get());
        
    } // end registerStorageBlockTags()
    
    /**
     * Identify metal blocks as beacon block bases.
     */
    private void registerBeaconBlockTags()
    {
        // NB: valfram and tungsten carbide are ceramics, and thus not beacon bases.
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
            .add(ModBlocks.tungsten_block.get())
            .add(ModBlocks.tungsten_steel_block.get())
            .add(ModBlocks.prasinos_block.get());
        
    }
    
} // end class
