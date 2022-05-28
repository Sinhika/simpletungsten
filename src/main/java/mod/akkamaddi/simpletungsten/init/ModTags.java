package mod.akkamaddi.simpletungsten.init;

import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags
{
    public static class Items
    {
        public static final TagKey<Item> INGOTS_TUNGSTEN = TagUtils.forgeTag("ingots/tungsten");
        public static final TagKey<Item> INGOTS_TIN = TagUtils.forgeTag("ingots/tin");
        public static final TagKey<Item> INGOTS_ADAMANTIUM = TagUtils.forgeTag("ingots/adamantium");
    } // end class Items

} // end class
