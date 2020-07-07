#!/bin/bash
# scripts are from mod_utils project on my GitHub.

TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != 'SimpleTungsten' ]; then
    echo "Running in wrong directory!"
    exit 1
fi


# recipes
TARGETDIR=${TOPDIR}/src/main/resources/data/simpletungsten/recipes
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# STORAGE RECIPES
make_storage_recipes.py tungsten
make_storage_recipes.py -L -M tungsten_carbide
make_storage_recipes.py -L -M valfram
make_storage_recipes.py -L tungsten_steel
make_storage_recipes.py -L -M prasinos 

# TOOL & ARMOR RECIPES
make_tool_recipes.py -a tungsten
make_tool_recipes.py -a tungsten_carbide
make_tool_recipes.py -a valfram
make_tool_recipes.py -a tungsten_steel
make_tool_recipes.py -a prasinos

# ORE SMELTING
make_custom_recipes.py -t smelting --xp=0.8 -f 'tungsten_ingot_from_smelting' \
    -i 'simpletungsten:tungsten_ore' 'simpletungsten:tungsten_ingot' 1
make_custom_recipes.py -t blasting --xp=0.8 -f 'tungsten_ingot_from_blasting' \
    -i 'simpletungsten:tungsten_ore' 'simpletungsten:tungsten_ingot' 1
make_custom_recipes.py -t smelting --xp=1.0 -f 'tungsten_carbide_ingot_from_smelting' \
    -i 'simpletungsten:large_tungsten_carbide_chunk' \
    'simpletungsten:tungsten_carbide_ingot' 1
make_custom_recipes.py -t blasting --xp=1.0 -f 'tungsten_carbide_ingot_from_blasting' \
    -i 'simpletungsten:large_tungsten_carbide_chunk' \
    'simpletungsten:tungsten_carbide_ingot' 1
make_custom_recipes.py -t smelting --xp=1.4 -f 'valfram_ingot_from_smelting' \
    -i 'simpletungsten:large_valfram_chunk' 'simpletungsten:valfram_ingot' 1
make_custom_recipes.py -t blasting --xp=1.4 -f 'valfram_ingot_from_blasting' \
    -i 'simpletungsten:large_valfram_chunk' 'simpletungsten:valfram_ingot' 1
make_custom_recipes.py -t smelting --xp=1.2 -f 'tungsten_steel_ingot_from_smelting' \
    -i 'simpletungsten:large_tungsten_steel_chunk' 'simpletungsten:tungsten_steel_ingot' 1
make_custom_recipes.py -t blasting --xp=1.2 -f 'tungsten_steel_ingot_from_blasting' \
    -i 'simpletungsten:large_tungsten_steel_chunk' 'simpletungsten:tungsten_steel_ingot' 1
make_custom_recipes.py -t smelting --xp=1.6 -f 'prasinos_ingot_from_smelting' \
    -i 'simpletungsten:large_prasinos_chunk' 'simpletungsten:prasinos_ingot' 1
make_custom_recipes.py -t blasting --xp=1.6 -f 'prasinos_ingot_from_blasting' \
    -i 'simpletungsten:large_prasinos_chunk' 'simpletungsten:prasinos_ingot' 1

# FUSION RECIPES
# tungsten carbide
make_custom_recipes.py -t fusion --xp=8.0 -f 'tungsten_carbide_nugget' \
    --catalyst='minecraft:bone_meal' -a 'simpletungsten:tungsten_ingot;minecraft:brick' \
    'simpletungsten:tungsten_carbide_nugget' 1
make_custom_recipes.py -t fusion --xp=10.0 -f 'medium_tungsten_carbide_chunk' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_ingot;minecraft:brick' \
    'simpletungsten:medium_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion --xp=26.0 -f 'large_tungsten_carbide_chunk' \
    --catalyst='minecraft:gunpowder' -a 'simpletungsten:tungsten_ingot;minecraft:brick' \
    'simpletungsten:large_tungsten_carbide_chunk' 1

# tungsten steel
make_custom_recipes.py -t fusion --xp=26.0 -f 'large_tungsten_steel_chunk' \
    --catalyst='simpleores:tin_ingot' \
    -a 'simpletungsten:tungsten_ingot;minecraft:iron_ingot' \
    'simpletungsten:large_tungsten_steel_chunk' 1

# valfram
make_custom_recipes.py -t fusion --xp=10.0 -f 'valfram_nugget' \
    --catalyst='minecraft:gunpowder' \
    -a 'simpletungsten:tungsten_ingot;minecraft:nether_brick' \
    'simpletungsten:valfram_nugget' 1
make_custom_recipes.py -t fusion --xp=12.0 -f 'medium_valfram_chunk' \
    --catalyst='minecraft:glowstone_dust' \
    -a 'simpletungsten:tungsten_ingot;minecraft:nether_brick' \
    'simpletungsten:medium_valfram_chunk' 1
make_custom_recipes.py -t fusion --xp=36.0 -f 'large_valfram_chunk' \
    --catalyst='minecraft:lava_bucket' \
    -a 'simpletungsten:tungsten_ingot;minecraft:nether_brick' \
    'simpletungsten:large_valfram_chunk' 1

# prasinos
make_custom_recipes.py -t fusion --xp=12.0 -f 'prasinos_nugget' \
    --catalyst='minecraft:glowstone_dust' \
    -a 'simpletungsten:tungsten_ingot;simpleores:adamantium' \
    'simpletungsten:prasinos_nugget' 1
make_custom_recipes.py -t fusion --xp=16.0 -f 'medium_prasinos_chunk' \
    --catalyst='minecraft:magma_cream' \
    -a 'simpletungsten:tungsten_ingot;simpleores:adamantium' \
    'simpletungsten:medium_prasinos_chunk' 1
make_custom_recipes.py -t fusion --xp=40.0 -f 'large_prasinos_chunk' \
    --catalyst='minecraft:blaze_powder' \
    -a 'simpletungsten:tungsten_ingot;simpleores:adamantium' \
    'simpletungsten:large_prasinos_chunk' 1


# FUSION RECYCLING RECIPES
# recycle tungsten
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_helmet' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_helmet;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_tungsten_chestplate' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_chestplate;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 2
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_tungsten_leggings' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_leggings;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 2
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_boots' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_boots;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_shovel' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_shovel;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_sword' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_sword;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_axe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_axe;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_pickaxe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_pickaxe;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1
make_custom_recipes.py -t fusion -c --xp=10.0 -f 'recycle_tungsten_hoe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_hoe;minecraft:gravel' \
    'simpletungsten:tungsten_ore' 1

# recycle tungsten carbide
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_helmet' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_helmet;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=30.0 -f 'recycle_tungsten_carbide_chestplate' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_chestplate;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 2
make_custom_recipes.py -t fusion -c --xp=30.0 -f 'recycle_tungsten_carbide_leggings' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_leggings;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 2
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_boots' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_boots;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_shovel' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_shovel;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_sword' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_sword;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_axe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_axe;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_pickaxe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_pickaxe;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_carbide_hoe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_carbide_hoe;minecraft:clay_ball' \
    'simpletungsten:large_tungsten_carbide_chunk' 1

# recycle valfram
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_helmet' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_helmet;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=40.0 -f 'recycle_valfram_chestplate' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_chestplate;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 2
make_custom_recipes.py -t fusion -c --xp=40.0 -f 'recycle_valfram_leggings' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_leggings;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 2
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_boots' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_boots;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_shovel' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_shovel;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_sword' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_sword;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_axe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_axe;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_pickaxe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_pickaxe;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1
make_custom_recipes.py -t fusion -c --xp=20.0 -f 'recycle_valfram_hoe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:valfram_hoe;minecraft:netherrack' \
    'simpletungsten:large_valfram_chunk' 1

# recycle tungsten steel
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_helmet' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_helmet;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=30.0 -f 'recycle_tungsten_steel_chestplate' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_chestplate;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 2
make_custom_recipes.py -t fusion -c --xp=30.0 -f 'recycle_tungsten_steel_leggings' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_leggings;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 2
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_boots' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_boots;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_shovel' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_shovel;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_sword' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_sword;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_axe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_axe;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_pickaxe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_pickaxe;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1
make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_tungsten_steel_hoe' \
    --catalyst='minecraft:coals' -a 'simpletungsten:tungsten_steel_hoe;minecraft:gravel' \
    'simpletungsten:large_tungsten_steel_chunk' 1

# recycle prasinos
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_helmet' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_helmet;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=50.0 -f 'recycle_prasinos_chestplate' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_chestplate;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 2
make_custom_recipes.py -t fusion -c --xp=50.0 -f 'recycle_prasinos_leggings' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_leggings;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 2
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_boots' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_boots;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_shovel' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_shovel;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_sword' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_sword;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_axe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_axe;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_pickaxe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_pickaxe;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1
make_custom_recipes.py -t fusion -c --xp=25.0 -f 'recycle_prasinos_hoe' \
    --catalyst='minecraft:lava_bucket' -a 'simpletungsten:prasinos_hoe;minecraft:gravel' \
    'simpletungsten:large_prasinos_chunk' 1


