package mod.akkamaddi.simpletungsten.datagen;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeProvider;
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

    // TODO
    
    @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleTungsten.MODID, SimpleTungstenConfig.INSTANCE, name);
    }

} // end class
