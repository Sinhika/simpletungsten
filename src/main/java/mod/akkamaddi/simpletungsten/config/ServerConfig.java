package mod.akkamaddi.simpletungsten.config;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * For configuration settings that change the behaviour of code on the LOGICAL SERVER.
 * This can be moved to an inner class of ExampleModConfig, but is separate because of personal preference and to keep the code organised
 *
 * @author Cadiboo
 * @author Sinhika
 */
final class ServerConfig
{
    
	ServerConfig(final ForgeConfigSpec.Builder builder)
	{
	    builder.push("General");
	    builder.pop();
	    
	    builder.push("OreGeneration");
        builder.pop();
        
        builder.push("Tools");
        builder.pop();
        
        builder.push("Armor");
        builder.pop();
        
	} // end ctor

} // end class ServerConfig
