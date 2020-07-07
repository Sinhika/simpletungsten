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
#make_recipe_advancements.py -i ashenwheat:ash_wheat_sheaf ashenwheat:ash_bread \
#    ashenwheat:ash_cookie ashenwheat:ash_seeds
make_recipe_advancements.py -i simpletungsten:tungsten_ingot \
    simpletungsten:tungsten_sword simpletungsten:tungsten_shovel \
    simpletungsten:tungsten_axe simpletungsten:tungsten_pickaxe \
    simpletungsten:tungsten_hoe simpletungsten:tungsten_helm \
    simpletungsten:tungsten_chestplate simpletungsten:tungsten_leggings \
    simpletungsten:tungsten_boots


