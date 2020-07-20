package mod.akkamaddi.simpletungsten.content;

import java.util.function.Supplier;

import mod.akkamaddi.simpletungsten.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum SimpleTungstenArmorMaterial implements IArmorMaterial 
{
    TUNGSTEN("simpletungsten:tungsten", 24, new int[] {3, 3, 4, 3 }, 8, 
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F,
            ()-> { return Ingredient.fromItems(ModItems.tungsten_ingot.get());}),
    TUNGSTEN_CARBIDE("simpletungsten:tungsten_carbide", 26, new int[] {4, 5, 6, 4}, 12, 
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F,
            ()-> { return Ingredient.fromItems(ModItems.tungsten_carbide_ingot.get());}),
    VALFRAM("simpletungsten:valfram", 28, new int[] {4, 6, 7, 4}, 20, 
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 
            ()-> { return Ingredient.fromItems(ModItems.valfram_ingot.get());}),
    TUNGSTEN_STEEL("simpletungsten:tungsten_steel", 24, new int[] {4, 6, 7, 4}, 7,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
            ()-> { return Ingredient.fromItems(ModItems.tungsten_steel_ingot.get());}),
    PRASINOS("simpletungsten:prasinos", 45, new int[] {5, 7, 9, 5}, 11, 
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F,  
            ()-> { return Ingredient.fromItems(ModItems.prasinos_ingot.get());});
    
    // {feet, legs, chest, head}
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyLoadBase<Ingredient> repairMaterial;

    private SimpleTungstenArmorMaterial(String nameIn, int maxDamageIn, int[] drAmtArray, int enchantabilityIn,
            SoundEvent soundIn, float toughnessIn, Supplier<Ingredient> repairMatIn)
    {
        name = nameIn;
        maxDamageFactor = maxDamageIn;
        damageReductionAmountArray = drAmtArray;
        enchantability = enchantabilityIn;
        soundEvent = soundIn;
        toughness = toughnessIn;
        repairMaterial = new LazyLoadBase<>(repairMatIn);
    } // end ctor()

    @Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.getValue();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

} // end enum
