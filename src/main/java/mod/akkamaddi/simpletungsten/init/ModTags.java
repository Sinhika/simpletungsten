package mod.akkamaddi.simpletungsten.init;

import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class ModTags
{
    public static class Items
    {
        public static final Tag.Named<Item> INGOTS_TUNGSTEN = TagUtils.forgeTag("ingots/tungsten");
        public static final Tag.Named<Item> INGOTS_TIN = TagUtils.forgeTag("ingots/tin");
        public static final Tag.Named<Item> INGOTS_ADAMANTIUM = TagUtils.forgeTag("ingots/adamantium");
    } // end class Items

} // end class
