package mod.akkamaddi.simpletungsten.datagen;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
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

    // TODO
    
    @Override
    public ICondition flag(String name)
    {
        // TODO Auto-generated method stub
        return impl_flag(SimpleTungsten.MODID, SimpleTungstenConfig.INSTANCE, name);
    }

} // end class
