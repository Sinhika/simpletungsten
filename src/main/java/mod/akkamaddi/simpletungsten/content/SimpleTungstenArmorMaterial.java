package mod.akkamaddi.simpletungsten.content;

import java.util.function.Supplier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import mod.akkamaddi.simpletungsten.init.ModItems;

public enum SimpleTungstenArmorMaterial implements ArmorMaterial 
{
    TUNGSTEN("simpletungsten:tungsten", 24, new int[] {3, 3, 4, 3 }, 8, 
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F,
            ()-> { return Ingredient.of(ModItems.tungsten_ingot.get());}),
    TUNGSTEN_CARBIDE("simpletungsten:tungsten_carbide", 26, new int[] {4, 5, 6, 4}, 12, 
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F,
            ()-> { return Ingredient.of(ModItems.tungsten_carbide_ingot.get());}),
    VALFRAM("simpletungsten:valfram", 28, new int[] {4, 6, 7, 4}, 20, 
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 
            ()-> { return Ingredient.of(ModItems.valfram_ingot.get());}),
    TUNGSTEN_STEEL("simpletungsten:tungsten_steel", 24, new int[] {4, 6, 7, 4}, 7,
            SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 
            ()-> { return Ingredient.of(ModItems.tungsten_steel_ingot.get());}),
    PRASINOS("simpletungsten:prasinos", 45, new int[] {5, 7, 9, 5}, 11, 
            SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F,  
            ()-> { return Ingredient.of(ModItems.prasinos_ingot.get());});
    
    // {feet, legs, chest, head}
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    private SimpleTungstenArmorMaterial(String nameIn, int maxDamageIn, int[] drAmtArray, int enchantabilityIn,
            SoundEvent soundIn, float toughnessIn, Supplier<Ingredient> repairMatIn)
    {
        name = nameIn;
        maxDamageFactor = maxDamageIn;
        damageReductionAmountArray = drAmtArray;
        enchantability = enchantabilityIn;
        soundEvent = soundIn;
        toughness = toughnessIn;
        repairMaterial = new LazyLoadedValue<>(repairMatIn);
    } // end ctor()

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
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

    @Override
    public float getKnockbackResistance()
    {
        // TODO Auto-generated method stub
        return 0;
    }

} // end enum
