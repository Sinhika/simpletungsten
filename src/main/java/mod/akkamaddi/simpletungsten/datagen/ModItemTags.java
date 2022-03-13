package mod.akkamaddi.simpletungsten.datagen;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.alexndr.simplecorelib.datagen.MiningItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends MiningItemTags
{

    public ModItemTags(DataGenerator gen, ExistingFileHelper existingFileHelper)
    {
        super(gen, new ModBlockTags(gen, existingFileHelper), SimpleTungsten.MODID, existingFileHelper);
        // TODO Auto-generated constructor stub
    }

} // end class
