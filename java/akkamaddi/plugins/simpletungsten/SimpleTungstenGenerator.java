package akkamaddi.plugins.simpletungsten;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import akkamaddi.api.core.AkkaWorldGenHelper;

public class SimpleTungstenGenerator implements IWorldGenerator {
	/**
	 * Generates the ores in the world. Depending on which 'world' the player is
	 * in (ie. Nether or Surface), different methods are called. These two
	 * methods are generateSurface and generateNether, which are below.
	 */

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.dimensionId == 0) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		} else if (SimpleTungsten.enableHigherDimensionGen
				&& SimpleTungsten.dimensionIDsArray.length >= 1) {
			for (int i = 0; i < SimpleTungsten.dimensionIDsArray.length; i++) {
				if (world.provider.dimensionId == SimpleTungsten.dimensionIDsArray[i]) {
					generateHigher(world, random, chunkX * 16, chunkZ * 16,
							SimpleTungsten.dimensionIDsArray[i]);
				}
			}
		}
	}

	/**
	 * Sets the details for how the blocks should spawn on the surface world.
	 *
	 * Configurable options are spawn rate, spawn height, vein size, and the
	 * block which spawns. Lowest and highest spawn heights can be set.
	 *
	 *
	 * WorldGenMinable determines which block the ores generate in.
	 *
	 * WorldGenMinable will generate in stone, ie. for surface ores.
	 */
	protected void generateSurface(World world, Random random, int blockX,
			int blockZ) 
	{
		for (int x = 0; x < SimpleTungsten.tungstenSpawnRate; x++) 
		{
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(SimpleTungsten.tungstenSpawnHeight
					- SimpleTungsten.tungstenMinSpawnHeight);
			int Zcoord = blockZ + random.nextInt(16);
			new AkkaWorldGenHelper(SimpleTungsten.oreTungsten,
					SimpleTungsten.tungstenVeinSize, Blocks.stone)
					.generate(world, random, Xcoord, Ycoord
							+ SimpleTungsten.tungstenMinSpawnHeight, Zcoord);
		}
	}

	/**
	 * Generates the main surface ores in dimensions other than the vanilla
	 * ones. Based on code by AleXndrTheGr8st This is all configurable through
	 * the settings file, and is classified as "Advanced".
	 *
	 * Each different dimension can have different spawn rates, with support for
	 * up to ~30000 dimensions (I think).
	 */

	protected void generateHigher(World world, Random random, int blockX,
			int blockZ, int dimensionID) 
	{
		if (SimpleTungsten.enableHigherDimensionGen) 
		{
			for (int i = 0; i < SimpleTungsten.dimensionIDsArray.length; i++) 
			{
				int tungstenRate = SimpleTungsten.config.get(
						"Higher Dimension ID: " + dimensionID,
						"Tungsten Spawn Rate", 6).getInt();

				for (int x = 0; x < tungstenRate; x++) {
					int maxHeight = SimpleTungsten.config.get(
							"Higher Dimension ID: " + dimensionID,
							"Tungsten Maximum Spawn Height", 32).getInt();
					int minHeight = SimpleTungsten.config.get(
							"Higher Dimension ID: " + dimensionID,
							"Tungsten Minimum Spawn Height", 0).getInt();
					int veinSize = SimpleTungsten.config.get(
							"Higher Dimension ID: " + dimensionID,
							"Tungsten Vein Size", 6).getInt();
					int Xcoord = blockX + random.nextInt(16);
					int Ycoord = random.nextInt(maxHeight - minHeight);
					int Zcoord = blockZ + random.nextInt(16);
					new AkkaWorldGenHelper(SimpleTungsten.oreTungsten,
							veinSize, Blocks.stone).generate(world, random,
							Xcoord, Ycoord + minHeight, Zcoord);
				}
			}
		}
	} // end generateHigher()
} // end class SimpleTungstenGenerator
