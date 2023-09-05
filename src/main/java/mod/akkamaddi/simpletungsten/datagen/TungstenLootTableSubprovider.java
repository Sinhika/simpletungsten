package mod.akkamaddi.simpletungsten.datagen;

import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.SimpleBlockLootSubProvider;

public class TungstenLootTableSubprovider extends SimpleBlockLootSubProvider
{

    @Override
	protected void generate() 
    {
    	dropMultiItemsWithFortune(ModBlocks.tungsten_ore.get(), ModItems.raw_tungsten.get(), 1, 1);
    	dropMultiItemsWithFortune(ModBlocks.deepslate_tungsten_ore.get(), ModItems.raw_tungsten.get(),1,1);
        dropSelf(ModBlocks.tungsten_block.get());
        dropSelf(ModBlocks.tungsten_carbide_block.get());
        dropSelf(ModBlocks.valfram_block.get());
        dropSelf(ModBlocks.tungsten_steel_block.get());
        dropSelf(ModBlocks.prasinos_block.get());
    }

} // end class
