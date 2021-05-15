package mod.akkamaddi.simpletungsten.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.datagen.LootTableInjectorProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

public class SimpleTungstenLootInjectorProvider extends LootTableInjectorProvider
{

    public SimpleTungstenLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();
        
        // abandoned mineshaft
        LootPool.Builder foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))));
        addInjectionTable(SimpleTungsten.MODID, "abandoned_mineshaft", foo);

        // simple_dungeon
        foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.large_tungsten_carbide_chunk.get()).setWeight(5)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(5)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.large_tungsten_steel_chunk.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 1))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 4))))
                .add(ItemLootEntry.lootTableItem(ModItems.large_prasinos_chunk.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 4))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_steel_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(SimpleTungsten.MODID, "simple_dungeon", foo);

        // shipwreck - no steel alloys, they rusted.
        foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.large_tungsten_carbide_chunk.get()).setWeight(5)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(5)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 4))))
                .add(ItemLootEntry.lootTableItem(ModItems.large_prasinos_chunk.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 4))))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))));
        addInjectionTable(SimpleTungsten.MODID, "shipwreck", foo);
        
        // stronghold
        foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_helmet.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_leggings.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_chestplate.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_boots.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_helmet.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_leggings.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_chestplate.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_carbide_boots.get()).setWeight(1));
        addInjectionTable(SimpleTungsten.MODID, "stronghold", foo);
                
        // village_armorer
        foo = createChestPool(1, 1, 0.10F)
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_helmet.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_leggings.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_chestplate.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_boots.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(SimpleTungsten.MODID, "village_armorer", foo);
        
        // village_toolsmith
        foo = createChestPool(1, 1, 0.10F)
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_hoe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_pickaxe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_axe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_shovel.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(SimpleTungsten.MODID, "village_toolsmith", foo);

        // village_weaponsmith
        foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_axe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_sword.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(SimpleTungsten.MODID, "village_weaponsmith", foo);
                
        return tables;
    } // end getTables()

} // end class
