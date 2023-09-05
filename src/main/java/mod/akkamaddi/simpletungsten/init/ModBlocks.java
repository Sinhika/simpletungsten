package mod.akkamaddi.simpletungsten.init;

import mod.akkamaddi.simpletungsten.SimpleTungsten;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleTungsten.MODID);
    
    // Ore Block
    public static final RegistryObject<DropExperienceBlock> tungsten_ore = BLOCKS.register("tungsten_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength( 4.0F, 10.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<DropExperienceBlock> deepslate_tungsten_ore = BLOCKS.register("deepslate_tungsten_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength( 4.0F, 10.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    // Storage Blocks
    public static final RegistryObject<Block> tungsten_block = BLOCKS.register("tungsten_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> raw_tungsten_block = BLOCKS.register("raw_tungsten_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> tungsten_carbide_block = BLOCKS.register("tungsten_carbide_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
                    //.harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> valfram_block = BLOCKS.register("valfram_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED)
                    .strength(10.0F, 22.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> tungsten_steel_block = BLOCKS.register("tungsten_steel_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(15.0F, 25.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> prasinos_block = BLOCKS.register("prasinos_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(18.0F, 32.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
} // end-class
