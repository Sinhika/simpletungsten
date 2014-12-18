package akkamaddi.plugins.simpletungsten;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import akkamaddi.api.core.AkkaJoinWorldHelper;

public class JoinWorldHandler extends AkkaJoinWorldHelper 
{

	@Override
	public void EquipMobs(EntityJoinWorldEvent event) 
	{
        int range = random.nextInt(1, 89);
        EntityLiving living = (EntityLiving)event.entity;

        if (range == 1)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 2)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
        }

        if (range == 3)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
        }

        if (range == 4)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
        }

        if (range == 5)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
        }

        if (range == 6)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 7)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenShovel));
        }

        if (range == 8)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenAxe));
        }

        if (range == 9)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenPickaxe));
        }

        if (range == 10)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenHoe));
        }

        if (range == 11)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 12)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 13)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 14)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 15)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 16)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 17)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenShovel));
        }

        if (range == 18)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenAxe));
        }

        if (range == 19)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenPickaxe));
        }

        if (range == 20)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenHoe));
        }

        if (range == 21)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenCarbideChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideSword));
        }

        if (range == 22)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
        }

        if (range == 23)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenCarbideChest));
        }

        if (range == 24)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenCarbideLegs));
        }

        if (range == 25)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
        }

        if (range == 26)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideSword));
        }

        if (range == 27)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideShovel));
        }

        if (range == 28)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideAxe));
        }

        if (range == 29)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbidePickaxe));
        }

        if (range == 30)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideHoe));
        }

        if (range == 31)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.valframChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframSword));
        }

        if (range == 32)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
        }

        if (range == 33)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.valframChest));
        }

        if (range == 34)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.valframLegs));
        }

        if (range == 35)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
        }

        if (range == 36)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframSword));
        }

        if (range == 37)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframShovel));
        }

        if (range == 38)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframAxe));
        }

        if (range == 39)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframPickaxe));
        }

        if (range == 40)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframHoe));
        }

        if (range == 41)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSword));
        }

        if (range == 42)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenPickaxe));
        }

        if (range == 43)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenAxe));
        }

        if (range == 44)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenShovel));
        }

        if (range == 45)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenHoe));
        }

        if (range == 46)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenCarbideChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideSword));
        }

        if (range == 47)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbidePickaxe));
        }

        if (range == 48)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenCarbideChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideAxe));
        }

        if (range == 49)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideShovel));
        }

        if (range == 50)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideHoe));
        }

        if (range == 51)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.valframChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframSword));
        }

        if (range == 52)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframPickaxe));
        }

        if (range == 53)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.valframChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframAxe));
        }

        if (range == 54)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframShovel));
        }

        if (range == 55)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.valframHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframHoe));
        }

        if (range == 56)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenCarbideSword));
        }

        if (range == 57)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.valframSword));
        }

        if (range == 58)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenSteelChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelSword));
        }

        if (range == 59)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
        }

        if (range == 60)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenSteelChest));
        }

        if (range == 61)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenSteelLegs));
        }

        if (range == 62)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
        }

        if (range == 63)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelSword));
        }

        if (range == 64)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelShovel));
        }

        if (range == 65)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelAxe));
        }

        if (range == 66)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelPickaxe));
        }

        if (range == 67)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelHoe));
        }

        if (range == 68)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.prasinosChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosSword));
        }

        if (range == 69)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
        }

        if (range == 70)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.prasinosChest));
        }

        if (range == 71)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.prasinosLegs));
        }

        if (range == 72)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
        }

        if (range == 73)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosSword));
        }

        if (range == 74)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosShovel));
        }

        if (range == 75)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosAxe));
        }

        if (range == 76)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosPickaxe));
        }

        if (range == 77)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosHoe));
        }

        if (range == 78)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenSteelChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelSword));
        }

        if (range == 79)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelPickaxe));
        }

        if (range == 80)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenSteelChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelAxe));
        }

        if (range == 81)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelShovel));
        }

        if (range == 82)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenSteelHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelHoe));
        }

        if (range == 83)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.prasinosChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosSword));
        }

        if (range == 84)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosPickaxe));
        }

        if (range == 85)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.prasinosChest));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosAxe));
        }

        if (range == 86)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosShovel));
        }

        if (range == 87)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.prasinosHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosHoe));
        }

        if (range == 88)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.tungstenSteelSword));
        }

        if (range == 89)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungsten.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungsten.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungsten.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungsten.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungsten.prasinosSword));
        }

	} // end EquipMobs()

} // end class JoinWorldHandler
