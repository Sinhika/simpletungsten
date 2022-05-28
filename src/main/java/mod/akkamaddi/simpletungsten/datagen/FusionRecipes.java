package mod.akkamaddi.simpletungsten.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.init.ModItems;
import mod.akkamaddi.simpletungsten.init.ModTags;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.api.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class FusionRecipes extends AbstractFusionRecipeProvider  implements IConditionBuilder, ISimpleConditionBuilder
{
    private FusionRecipeSetBuilder fusionbuilder;


    public FusionRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        fusionbuilder = new FusionRecipeSetBuilder(SimpleTungsten.MODID);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerTungstenRecyclingRecipes(consumer);
        registerTungstenSteelRecipes(consumer);
        registerTungstenCarbideRecipes(consumer);
        registerValframRecipes(consumer);
        registerPrasinosRecipes(consumer);
    }

    protected void registerTungstenRecyclingRecipes(Consumer<FinishedRecipe> consumer)
    {
        fusionbuilder.buildFusionRecyclingRecipes(consumer, 
                Ingredient.of(ModItems.tungsten_axe.get(), 
                ModItems.tungsten_pickaxe.get(), ModItems.tungsten_boots.get(),
                ModItems.tungsten_helmet.get(),
                ModItems.tungsten_shovel.get(), ModItems.tungsten_sword.get()),
                Ingredient.of(ModItems.tungsten_chestplate.get(), ModItems.tungsten_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.raw_tungsten.get(), 10.0F, 600, flag("recycling_recipes"), 
                "recycle_tungsten_items");
        
    } // end registerTungstenRecyclingRecipes
    
    
    /**
     * Tungsten Steel alloying and fusion recycling recipes.
     */
    protected void registerTungstenSteelRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN));
        primary_inputs.add(Ingredient.of(Items.IRON_INGOT));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(ModTags.Items.INGOTS_TIN);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_tungsten_steel_chunk.get(),
                6.5F, 600, flag("tungsten_steel_recipes"));
        
        // tungsten_steel fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.tungsten_steel_axe.get(), 
                ModItems.tungsten_steel_pickaxe.get(), ModItems.tungsten_steel_boots.get(),
                ModItems.tungsten_steel_helmet.get(),
                ModItems.tungsten_steel_shovel.get(), ModItems.tungsten_steel_sword.get()),
                Ingredient.of(ModItems.tungsten_steel_chestplate.get(), ModItems.tungsten_steel_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.large_tungsten_steel_chunk.get(), 15.0F, 600, flag("recycling_recipes"), 
                "recycle_tungsten_steel_items");
    } // end registerTungstenSteelRecipes

    /**
     * Tungsten Carbide alloying and fusion recycling recipes.
     */
    protected void registerTungstenCarbideRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN));
        primary_inputs.add(Ingredient.of(Items.BRICK));
        catalysts[0] = Ingredient.of(Items.BONE_MEAL);
        catalysts[1] = Ingredient.of(ItemTags.COALS);
        catalysts[2] = Ingredient.of(Items.GUNPOWDER);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.tungsten_carbide_nugget.get(), ModItems.medium_tungsten_carbide_chunk.get(), 
                ModItems.large_tungsten_carbide_chunk.get(),
                8.0F, 600, flag("tungsten_carbide_recipes"));
        
        // tungsten_carbide fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.tungsten_carbide_axe.get(), 
                ModItems.tungsten_carbide_pickaxe.get(), ModItems.tungsten_carbide_boots.get(),
                ModItems.tungsten_carbide_helmet.get(),
                ModItems.tungsten_carbide_shovel.get(), ModItems.tungsten_carbide_sword.get()),
                Ingredient.of(ModItems.tungsten_carbide_chestplate.get(), ModItems.tungsten_carbide_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.large_tungsten_carbide_chunk.get(), 15.0F, 600, flag("recycling_recipes"), 
                "recycle_tungsten_carbide_items");
    } // end registerTungstenCarbideRecipes

    /**
     * Valfram alloying and fusion recycling recipes.
     */
    protected void registerValframRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN));
        primary_inputs.add(Ingredient.of(Items.NETHER_BRICK));
        catalysts[0] = Ingredient.of(Items.GUNPOWDER);
        catalysts[1] = Ingredient.of(Items.GLOWSTONE_DUST);
        catalysts[2] = Ingredient.of(Items.LAVA_BUCKET);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.valfram_nugget.get(), ModItems.medium_valfram_chunk.get(), 
                ModItems.large_valfram_chunk.get(),
                10.0F, 600, flag("valfram_recipes"));
        
        // valfram fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.valfram_axe.get(), 
                ModItems.valfram_pickaxe.get(), ModItems.valfram_boots.get(),
                ModItems.valfram_helmet.get(),
                ModItems.valfram_shovel.get(), ModItems.valfram_sword.get()),
                Ingredient.of(ModItems.valfram_chestplate.get(), ModItems.valfram_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.large_valfram_chunk.get(), 20.0F, 600, flag("recycling_recipes"), 
                "recycle_valfram_items");
    } // end registerValframRecipes

    /**
     * Prasinos alloying and fusion recycling recipes.
     */
    protected void registerPrasinosRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_ADAMANTIUM));
        catalysts[0] = Ingredient.of(Items.GLOWSTONE_DUST);
        catalysts[1] = Ingredient.of(Items.MAGMA_CREAM);
        catalysts[2] = Ingredient.of(Items.BLAZE_POWDER);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.prasinos_nugget.get(), ModItems.medium_prasinos_chunk.get(), 
                ModItems.large_prasinos_chunk.get(),
                12.0F, 600, flag("prasinos_recipes"));
        
        // prasinos fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.prasinos_axe.get(), 
                ModItems.prasinos_pickaxe.get(), ModItems.prasinos_boots.get(),
                ModItems.prasinos_helmet.get(),
                ModItems.prasinos_shovel.get(), ModItems.prasinos_sword.get()),
                Ingredient.of(ModItems.prasinos_chestplate.get(), ModItems.prasinos_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.large_prasinos_chunk.get(), 25.0F, 600, flag("recycling_recipes"), 
                "recycle_prasinos_items");
    } // end registerPrasinosRecipes


    @Override
    public ICondition flag(String name)
    {
        // TODO Auto-generated method stub
        return impl_flag(SimpleTungsten.MODID, SimpleTungstenConfig.INSTANCE, name);
    }

} // end class
