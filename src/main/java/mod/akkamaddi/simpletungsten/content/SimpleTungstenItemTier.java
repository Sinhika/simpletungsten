package mod.akkamaddi.simpletungsten.content;

import java.util.function.Supplier;

import mod.akkamaddi.simpletungsten.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum SimpleTungstenItemTier implements IItemTier 
{
    TUNGSTEN(2, 1320, 4.5F, 2.0F, 6, ()->{ return Ingredient.fromItems( ModItems.tungsten_ingot.get()); }),
    TUNGSTEN_CARBIDE(2, 1360, 15.0F, 3.0F, 12, ()->{ return Ingredient.fromItems( ModItems.tungsten_carbide_ingot.get()); }),
    VALFRAM(3, 1420, 17.0F, 3.0F, 20, ()->{ return Ingredient.fromItems( ModItems.valfram_ingot.get()); }),
    TUNGSTEN_STEEL(2, 1680, 10.0F, 3.0F, 7, ()->{ return Ingredient.fromItems( ModItems.tungsten_steel_ingot.get()); }),
    PRASINOS(4, 2640, 13.0F, 5.0F, 9, ()->{ return Ingredient.fromItems( ModItems.prasinos_ingot.get()); });
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private SimpleTungstenItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
                     Supplier<Ingredient> repairMaterialIn)
    {
       this.harvestLevel = harvestLevelIn;
       this.maxUses = maxUsesIn;
       this.efficiency = efficiencyIn;
       this.attackDamage = attackDamageIn;
       this.enchantability = enchantabilityIn;
       this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getMaxUses() {
       return this.maxUses;
    }

    @Override
    public float getEfficiency() {
       return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
       return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
       return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
       return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
       return this.repairMaterial.getValue();
    }

} // end-enum
