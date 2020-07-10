package mod.akkamaddi.simpletungsten.config;

import java.util.HashMap;
import java.util.Map;

import mod.alexndr.simpleores.api.config.ISimpleConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;

public class SimpleTungstenConfig implements ISimpleConfig
{
    private static Map<String, Boolean> flags = new HashMap<>();
    public static SimpleTungstenConfig INSTANCE = new SimpleTungstenConfig();

    public static boolean enableTungstenOre;
    
    // Vein/Chunk Count, MinHeight, MaxHeightBase, MaxHeight
    public static  CountRangeConfig tungsten_cfg;
    public static  int tungsten_veinsize = 5;
    
    @Override
    public boolean getFlag(String n)
    {
        Boolean obj = flags.get(n);
        return obj != null && obj;
    }

    @Override
    public void clear() {
        flags.clear();
    }

    @Override
    public void putFlag(String n, boolean val)
    {
        flags.put(n, val);
    }

} // end-class
