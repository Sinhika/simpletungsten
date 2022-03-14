package mod.akkamaddi.simpletungsten.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModBlocks;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private RecipeSetBuilder setbuilder;

    public Recipes(DataGenerator pGenerator)
    {
        super(pGenerator);
        setbuilder = new RecipeSetBuilder(SimpleTungsten.MODID);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer)
    {
        registerStorageRecipes(pFinishedRecipeConsumer);
        registerToolRecipes(pFinishedRecipeConsumer);
        registerArmorRecipes(pFinishedRecipeConsumer);
        registerFurnaceRecipes(pFinishedRecipeConsumer);
    }

    private void registerFurnaceRecipes(Consumer<FinishedRecipe> consumer)
    {
        // ore and raw metal
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModBlocks.tungsten_ore.get()),
                ModItems.tungsten_ingot.get(), has(ModBlocks.tungsten_ore.get()), 
                0.8F, 200, "_from_ore");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModBlocks.deepslate_tungsten_ore.get()),
                ModItems.tungsten_ingot.get(), has(ModBlocks.tungsten_ore.get()), 
                0.8F, 200, "_from_deepslate_ore");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.raw_tungsten.get()),
                ModItems.tungsten_ingot.get(), has(ModItems.raw_tungsten.get()), 
                0.8F, 200);
        
        // large chunks
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_prasinos_chunk.get()),
                ModItems.prasinos_ingot.get(), has(ModItems.large_prasinos_chunk.get()), 
                1.6F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_valfram_chunk.get()),
                ModItems.valfram_ingot.get(), has(ModItems.large_valfram_chunk.get()), 
                1.4F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_tungsten_carbide_chunk.get()),
                ModItems.tungsten_carbide_ingot.get(), has(ModItems.large_tungsten_carbide_chunk.get()), 
                1.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_tungsten_steel_chunk.get()),
                ModItems.tungsten_steel_ingot.get(), has(ModItems.large_tungsten_steel_chunk.get()), 
                1.2F, 200);
        
        // vanilla recycling
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.tungsten_axe.get(), 
                ModItems.tungsten_boots.get(), ModItems.tungsten_chestplate.get(), ModItems.tungsten_helmet.get(),
                ModItems.tungsten_hoe.get(), ModItems.tungsten_leggings.get(), ModItems.tungsten_pickaxe.get(),
                ModItems.tungsten_shovel.get(), ModItems.tungsten_sword.get()), 
                ModItems.tungsten_nugget.get(), has(ModItems.tungsten_axe.get()), 0.2F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.tungsten_carbide_axe.get(), 
                ModItems.tungsten_carbide_boots.get(), ModItems.tungsten_carbide_chestplate.get(), ModItems.tungsten_carbide_helmet.get(),
                ModItems.tungsten_carbide_hoe.get(), ModItems.tungsten_carbide_leggings.get(), ModItems.tungsten_carbide_pickaxe.get(),
                ModItems.tungsten_carbide_shovel.get(), ModItems.tungsten_carbide_sword.get()), 
                ModItems.tungsten_carbide_nugget.get(), has(ModItems.tungsten_carbide_axe.get()), 0.2F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.tungsten_steel_axe.get(), 
                ModItems.tungsten_steel_boots.get(), ModItems.tungsten_steel_chestplate.get(), ModItems.tungsten_steel_helmet.get(),
                ModItems.tungsten_steel_hoe.get(), ModItems.tungsten_steel_leggings.get(), ModItems.tungsten_steel_pickaxe.get(),
                ModItems.tungsten_steel_shovel.get(), ModItems.tungsten_steel_sword.get()), 
                ModItems.tungsten_steel_nugget.get(), has(ModItems.tungsten_steel_axe.get()), 0.2F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.valfram_axe.get(), 
                ModItems.valfram_boots.get(), ModItems.valfram_chestplate.get(), ModItems.valfram_helmet.get(),
                ModItems.valfram_hoe.get(), ModItems.valfram_leggings.get(), ModItems.valfram_pickaxe.get(),
                ModItems.valfram_shovel.get(), ModItems.valfram_sword.get()), 
                ModItems.valfram_nugget.get(), has(ModItems.valfram_axe.get()), 0.2F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.prasinos_axe.get(), 
                ModItems.prasinos_boots.get(), ModItems.prasinos_chestplate.get(), ModItems.prasinos_helmet.get(),
                ModItems.prasinos_hoe.get(), ModItems.prasinos_leggings.get(), ModItems.prasinos_pickaxe.get(),
                ModItems.prasinos_shovel.get(), ModItems.prasinos_sword.get()), 
                ModItems.prasinos_nugget.get(), has(ModItems.prasinos_axe.get()), 0.2F, 200);

   } // end registerFurnaceRecipes()
    
    
    private void registerArmorRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.tungsten_ingot.get()), 
                "tungsten", has(ModItems.tungsten_ingot.get()), flag("tungsten_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.tungsten_carbide_ingot.get()), 
                "tungsten_carbide", has(ModItems.tungsten_carbide_ingot.get()), flag("tungsten_carbide_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.tungsten_steel_ingot.get()), 
                "tungsten_steel", has(ModItems.tungsten_steel_ingot.get()), flag("tungsten_steel_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.valfram_ingot.get()), 
                "valfram", has(ModItems.valfram_ingot.get()), flag("valfram_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.prasinos_ingot.get()), 
                "prasinos", has(ModItems.prasinos_ingot.get()), flag("prasinos_recipes"));
    }
    
    private void registerToolRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.tungsten_ingot.get()), "tungsten",
                has(ModItems.tungsten_ingot.get()), flag("tungsten_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.prasinos_ingot.get()), "prasinos",
                has(ModItems.prasinos_ingot.get()), flag("prasinos_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.valfram_ingot.get()), "valfram",
                has(ModItems.valfram_ingot.get()), flag("valfram_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.tungsten_carbide_ingot.get()), "tungsten_carbide",
                has(ModItems.tungsten_carbide_ingot.get()), flag("tungsten_carbide_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.tungsten_steel_ingot.get()), "tungsten_steel",
                has(ModItems.tungsten_steel_ingot.get()), flag("tungsten_steel_recipes"), false);
    }
    
    /**
     * build and register storage recipes; i.e., nugget => ingot => block conversions.
     * @param consumer
     */
    private void registerStorageRecipes(Consumer<FinishedRecipe> consumer)
    {
        // vanilla storage recipes
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.tungsten_ingot.get(), ModBlocks.tungsten_block.get(),
                ModItems.tungsten_nugget.get(), has(ModItems.tungsten_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.tungsten_carbide_ingot.get(), ModBlocks.tungsten_carbide_block.get(),
                ModItems.tungsten_carbide_nugget.get(), has(ModItems.tungsten_carbide_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.tungsten_steel_ingot.get(), ModBlocks.tungsten_steel_block.get(),
                ModItems.tungsten_steel_nugget.get(), has(ModItems.tungsten_steel_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.valfram_ingot.get(), ModBlocks.valfram_block.get(),
                ModItems.valfram_nugget.get(), has(ModItems.valfram_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.prasinos_ingot.get(), ModBlocks.prasinos_block.get(),
                ModItems.prasinos_nugget.get(), has(ModItems.prasinos_ingot.get()));
        
        // chunk conversion recipes
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.tungsten_carbide_nugget.get(),
                ModItems.medium_tungsten_carbide_chunk.get(), ModItems.large_tungsten_carbide_chunk.get(), 
                has(ModItems.tungsten_carbide_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.tungsten_steel_nugget.get(),
                null, ModItems.large_tungsten_steel_chunk.get(), 
                has(ModItems.tungsten_steel_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.valfram_nugget.get(),
                ModItems.medium_valfram_chunk.get(), ModItems.large_valfram_chunk.get(), 
                has(ModItems.valfram_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.prasinos_nugget.get(),
                ModItems.medium_prasinos_chunk.get(), ModItems.large_prasinos_chunk.get(), 
                has(ModItems.prasinos_nugget.get()));

    } // end registerStorageRecipes()
    
    @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleTungsten.MODID, SimpleTungstenConfig.INSTANCE, name);
    }
} // end class
