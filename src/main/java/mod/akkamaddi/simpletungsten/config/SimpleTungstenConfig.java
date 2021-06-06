package mod.akkamaddi.simpletungsten.config;

import mod.alexndr.simplecorelib.config.ModOreConfig;
import mod.alexndr.simplecorelib.config.SimpleConfig;

public class SimpleTungstenConfig extends SimpleConfig
{
    public static SimpleTungstenConfig INSTANCE = new SimpleTungstenConfig();

    public static boolean enableTungstenOre;
    public static boolean addModLootToChests;
    
    // Vein/Chunk Count, MinHeight, MaxHeightBase, MaxHeight
    public static  ModOreConfig tungsten_cfg;
    //public static  int tungsten_veinsize = 5;
    

} // end-class
