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
make_storage_recipes.py -L tungsten
# FUSION RECYCLING RECIPES
#make_custom_recipes.py -t fusion -c --xp=15.0 -f 'recycle_golden_helmet' \
#    --catalyst='minecraft:items/coals' \
#    -a 'minecraft:golden_helmet;minecraft:gravel' 'minecraft:gold_ore' 1
