package mod.akkamaddi.simpletungsten.init;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import mod.alexndr.simpleores.api.content.SimpleMetalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo
 */
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, SimpleTungsten.MODID);
    
    // Ore Block
    public static final RegistryObject<OreBlock> tungsten_ore = BLOCKS.register("tungsten_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 4.0F, 10.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)));

    // Storage Blocks
    public static final RegistryObject<SimpleMetalBlock> tungsten_block = BLOCKS.register("tungsten_block", 
            () -> new SimpleMetalBlock(Block.Properties.create(Material.IRON,
                    MaterialColor.GRAY_TERRACOTTA)
                    .hardnessAndResistance(10.0F, 22.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<SimpleMetalBlock> tungsten_carbide_block = BLOCKS.register("tungsten_carbide_block", 
            () -> new SimpleMetalBlock(Block.Properties.create(Material.IRON,
                    MaterialColor.GRAY_TERRACOTTA)
                    .hardnessAndResistance(10.0F, 22.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<SimpleMetalBlock> valfram_block = BLOCKS.register("valfram_block", 
            () -> new SimpleMetalBlock(Block.Properties.create(Material.IRON,
                    MaterialColor.RED_TERRACOTTA)
                    .hardnessAndResistance(10.0F, 22.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<SimpleMetalBlock> tungsten_steel_block = BLOCKS.register("tungsten_steel_block", 
            () -> new SimpleMetalBlock(Block.Properties.create(Material.IRON,
                    MaterialColor.LIGHT_BLUE_TERRACOTTA)
                    .hardnessAndResistance(15.0F, 25.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<SimpleMetalBlock> prasinos_block = BLOCKS.register("prasinos_block", 
            () -> new SimpleMetalBlock(Block.Properties.create(Material.IRON,
                    MaterialColor.GREEN_TERRACOTTA)
                    .hardnessAndResistance(18.0F, 32.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
} // end-class
