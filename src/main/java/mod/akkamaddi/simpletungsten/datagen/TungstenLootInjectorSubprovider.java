package mod.akkamaddi.simpletungsten.datagen;

import java.util.function.BiConsumer;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.LootTableInjectorProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class TungstenLootInjectorSubprovider extends LootTableInjectorProvider
{


    @Override
    public void generate(BiConsumer<ResourceLocation, Builder> bar) 
    {
        // abandoned mineshaft
        LootPool.Builder foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "abandoned_mineshaft"), foo);

        // simple_dungeon
        foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.large_tungsten_carbide_chunk.get()).setWeight(5)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(5)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.large_tungsten_steel_chunk.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))))
                .add(LootItem.lootTableItem(ModItems.large_prasinos_chunk.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.tungsten_steel_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "simple_dungeon"), foo);

        // shipwreck - no steel alloys, they rusted.
        foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.large_tungsten_carbide_chunk.get()).setWeight(5)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(5)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))))
                .add(LootItem.lootTableItem(ModItems.large_prasinos_chunk.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "shipwreck"), foo);
        
        // stronghold
        foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.tungsten_helmet.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.tungsten_leggings.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.tungsten_chestplate.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.tungsten_boots.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_helmet.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_leggings.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_chestplate.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_carbide_boots.get()).setWeight(1));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "stronghold"), foo);
                
        // village_armorer
        foo = createChestPool(1, 1, 0.10F)
                .add(LootItem.lootTableItem(ModItems.tungsten_helmet.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_leggings.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_chestplate.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_boots.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "village_armorer"), foo);
        
        // village_toolsmith
        foo = createChestPool(1, 1, 0.10F)
                .add(LootItem.lootTableItem(ModItems.tungsten_hoe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_pickaxe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_axe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_shovel.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "village_toolsmith"), foo);

        // village_weaponsmith
        foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.tungsten_axe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_sword.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tungsten_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))));
        addInjectionTable(bar, getInjectionTableId(SimpleTungsten.MODID, "village_weaponsmith"), foo);

    } // end getTables()

} // end class
