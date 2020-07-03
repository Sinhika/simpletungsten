package mod.akkamaddi.simpletungsten.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ClientConfig
{
    
    ClientConfig(final ForgeConfigSpec.Builder builder) 
    {
        builder.push("General");
        builder.pop();
    }
} // end-class

