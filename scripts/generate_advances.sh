#!/bin/bash
# scripts are from mod_utils project on my GitHub.

TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != 'SimpleTungsten' ]; then
    echo "Running in wrong directory!"
    exit 1
fi

TARGETDIR=${TOPDIR}/src/main/resources/data/simpletungsten/advancements/recipes

# generate recipe advancements
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# TUNGSTEN
make_recipe_advancements.py -i simpletungsten:tungsten_ingot \
    simpletungsten:tungsten_sword simpletungsten:tungsten_shovel \
    simpletungsten:tungsten_axe simpletungsten:tungsten_pickaxe \
    simpletungsten:tungsten_hoe simpletungsten:tungsten_helmet \
    simpletungsten:tungsten_chestplate simpletungsten:tungsten_leggings \
    simpletungsten:tungsten_boots simpletungsten:tungsten_block

make_recipe_advancements.py -i simpletungsten:tungsten_ore \
    simpletungsten:tungsten_ingot_from_blasting \
    simpletungsten:tungsten_ingot_from_smelting

make_recipe_advancements.py -i simpletungsten:tungsten_nugget \
    simpletungsten:tungsten_nugget_from_blasting \
    simpletungsten:tungsten_nugget_from_smelting \
    simpletungsten:tungsten_ingot_from_nuggets

# TUNGSTEN CARBIDE
make_recipe_advancements.py -i simpletungsten:tungsten_carbide_ingot \
    simpletungsten:tungsten_carbide_sword simpletungsten:tungsten_carbide_shovel \
    simpletungsten:tungsten_carbide_axe simpletungsten:tungsten_carbide_pickaxe \
    simpletungsten:tungsten_carbide_hoe simpletungsten:tungsten_carbide_helmet \
    simpletungsten:tungsten_carbide_chestplate simpletungsten:tungsten_carbide_leggings \
    simpletungsten:tungsten_carbide_boots simpletungsten:tungsten_carbide_block

make_recipe_advancements.py -i simpletungsten:large_tungsten_carbide_chunk \
    simpletungsten:tungsten_carbide_ingot_from_blasting \
    simpletungsten:tungsten_carbide_ingot_from_smelting \
    simpletungsten:tungsten_carbide_nuggets_from_chunk \
    simpletungsten:medium_tungsten_carbide_chunk2

make_recipe_advancements.py -i simpletungsten:tungsten_carbide_nugget \
    simpletungsten:tungsten_carbide_nugget_from_blasting \
    simpletungsten:tungsten_carbide_nugget_from_smelting \
    simpletungsten:tungsten_carbide_ingot_from_nuggets \
    simpletungsten:tungsten_carbide_nuggets_from_medium \
    simpletungsten:large_tungsten_carbide_chunk \
    simpletungsten:medium_tungsten_carbide_chunk

# TUNGSTEN STEEL
make_recipe_advancements.py -i simpletungsten:tungsten_steel_ingot \
    simpletungsten:tungsten_steel_sword simpletungsten:tungsten_steel_shovel \
    simpletungsten:tungsten_steel_axe simpletungsten:tungsten_steel_pickaxe \
    simpletungsten:tungsten_steel_hoe simpletungsten:tungsten_steel_helmet \
    simpletungsten:tungsten_steel_chestplate simpletungsten:tungsten_steel_leggings \
    simpletungsten:tungsten_steel_boots simpletungsten:tungsten_steel_block

make_recipe_advancements.py -i simpletungsten:large_tungsten_steel_chunk \
    simpletungsten:tungsten_steel_ingot_from_blasting \
    simpletungsten:tungsten_steel_ingot_from_smelting \
    simpletungsten:tungsten_steel_nuggets_from_chunk

make_recipe_advancements.py -i simpletungsten:tungsten_steel_nugget \
    simpletungsten:tungsten_steel_nugget_from_blasting \
    simpletungsten:tungsten_steel_nugget_from_smelting \
    simpletungsten:tungsten_steel_ingot_from_nuggets \
    simpletungsten:large_tungsten_steel_chunk

# VALFRAM
make_recipe_advancements.py -i simpletungsten:valfram_ingot \
    simpletungsten:valfram_sword simpletungsten:valfram_shovel \
    simpletungsten:valfram_axe simpletungsten:valfram_pickaxe \
    simpletungsten:valfram_hoe simpletungsten:valfram_helmet \
    simpletungsten:valfram_chestplate simpletungsten:valfram_leggings \
    simpletungsten:valfram_boots simpletungsten:valfram_block

make_recipe_advancements.py -i simpletungsten:large_valfram_chunk \
    simpletungsten:valfram_ingot_from_blasting \
    simpletungsten:valfram_ingot_from_smelting \
    simpletungsten:valfram_nuggets_from_chunk \
    simpletungsten:medium_valfram_chunk2

make_recipe_advancements.py -i simpletungsten:valfram_nugget \
    simpletungsten:valfram_nugget_from_blasting \
    simpletungsten:valfram_nugget_from_smelting \
    simpletungsten:valfram_ingot_from_nuggets \
    simpletungsten:valfram_nuggets_from_medium \
    simpletungsten:large_valfram_chunk \
    simpletungsten:medium_valfram_chunk

# PRASINOS
make_recipe_advancements.py -i simpletungsten:prasinos_ingot \
    simpletungsten:prasinos_sword simpletungsten:prasinos_shovel \
    simpletungsten:prasinos_axe simpletungsten:prasinos_pickaxe \
    simpletungsten:prasinos_hoe simpletungsten:prasinos_helmet \
    simpletungsten:prasinos_chestplate simpletungsten:prasinos_leggings \
    simpletungsten:prasinos_boots simpletungsten:prasinos_block

make_recipe_advancements.py -i simpletungsten:large_prasinos_chunk \
    simpletungsten:prasinos_ingot_from_blasting \
    simpletungsten:prasinos_ingot_from_smelting \
    simpletungsten:prasinos_nuggets_from_chunk \
    simpletungsten:medium_prasinos_chunk2

make_recipe_advancements.py -i simpletungsten:prasinos_nugget \
    simpletungsten:prasinos_nugget_from_blasting \
    simpletungsten:prasinos_nugget_from_smelting \
    simpletungsten:prasinos_ingot_from_nuggets \
    simpletungsten:prasinos_nuggets_from_medium \
    simpletungsten:large_prasinos_chunk \
    simpletungsten:medium_prasinos_chunk

