package mod.akkamaddi.simpletungsten.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.datagen.BlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;

public class SimpleTungstenLootTableProvider extends BlockLootTableProvider
{

    public SimpleTungstenLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables()
    {
        tables.clear();
        specialDropTable(ModBlocks.tungsten_ore.get(), ModItems.raw_tungsten.get());
        specialDropTable(ModBlocks.deepslate_tungsten_ore.get(), ModItems.raw_tungsten.get());
        standardDropTable(ModBlocks.tungsten_block.get());
        standardDropTable(ModBlocks.tungsten_carbide_block.get());
        standardDropTable(ModBlocks.valfram_block.get());
        standardDropTable(ModBlocks.tungsten_steel_block.get());
        standardDropTable(ModBlocks.prasinos_block.get());
        return tables;
    }

} // end class
