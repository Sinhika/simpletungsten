package mod.akkamaddi.simpletungsten.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.BlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.util.ResourceLocation;

public class SimpleTungstenLootTableProvider extends BlockLootTableProvider
{

    public SimpleTungstenLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();
        standardDropTable(ModBlocks.tungsten_ore.get());
        standardDropTable(ModBlocks.tungsten_block.get());
        standardDropTable(ModBlocks.tungsten_carbide_block.get());
        standardDropTable(ModBlocks.valfram_block.get());
        standardDropTable(ModBlocks.tungsten_steel_block.get());
        standardDropTable(ModBlocks.prasinos_block.get());
        return tables;
    }

} // end class
