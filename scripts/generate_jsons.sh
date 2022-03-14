#!/bin/bash

# scripts are from mod_utils project on my GitHub.

ID='simpletungsten'
NAME='SimpleTungsten'
TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != $NAME ]; then
    echo "Running in wrong directory!"
    exit 1
fi

# blockstates
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/blockstates
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# make simple blockstates
gen_blockstate_jsons.py --type=simple raw_tungsten_block
gen_blockstate_jsons.py --type=simple deepslate_tungsten_ore

# models
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/models
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# block models
gen_model_jsons.py --type=block raw_tungsten_block 
gen_model_jsons.py --type=block deepslate_tungsten_ore 

#inventory items
gen_model_jsons.py --type=inventory --item_only raw_tungsten

