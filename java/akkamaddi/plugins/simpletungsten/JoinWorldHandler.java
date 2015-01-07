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
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 2)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
        }

        if (range == 3)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
        }

        if (range == 4)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
        }

        if (range == 5)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
        }

        if (range == 6)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 7)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenShovel));
        }

        if (range == 8)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenAxe));
        }

        if (range == 9)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenPickaxe));
        }

        if (range == 10)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenHoe));
        }

        if (range == 11)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 12)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 13)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 14)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 15)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 16)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 17)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenShovel));
        }

        if (range == 18)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenAxe));
        }

        if (range == 19)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenPickaxe));
        }

        if (range == 20)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenHoe));
        }

        if (range == 21)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenCarbideChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideSword));
        }

        if (range == 22)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
        }

        if (range == 23)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenCarbideChest));
        }

        if (range == 24)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenCarbideLegs));
        }

        if (range == 25)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
        }

        if (range == 26)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideSword));
        }

        if (range == 27)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideShovel));
        }

        if (range == 28)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideAxe));
        }

        if (range == 29)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbidePickaxe));
        }

        if (range == 30)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideHoe));
        }

        if (range == 31)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.valframChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframSword));
        }

        if (range == 32)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
        }

        if (range == 33)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.valframChest));
        }

        if (range == 34)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.valframLegs));
        }

        if (range == 35)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
        }

        if (range == 36)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframSword));
        }

        if (range == 37)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframShovel));
        }

        if (range == 38)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframAxe));
        }

        if (range == 39)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframPickaxe));
        }

        if (range == 40)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframHoe));
        }

        if (range == 41)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSword));
        }

        if (range == 42)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenPickaxe));
        }

        if (range == 43)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenAxe));
        }

        if (range == 44)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenShovel));
        }

        if (range == 45)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenHoe));
        }

        if (range == 46)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenCarbideChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideSword));
        }

        if (range == 47)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbidePickaxe));
        }

        if (range == 48)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenCarbideChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideAxe));
        }

        if (range == 49)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenCarbideLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideShovel));
        }

        if (range == 50)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenCarbideHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenCarbideBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideHoe));
        }

        if (range == 51)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.valframChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframSword));
        }

        if (range == 52)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframPickaxe));
        }

        if (range == 53)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.valframChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframAxe));
        }

        if (range == 54)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.valframLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframShovel));
        }

        if (range == 55)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.valframHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.valframBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframHoe));
        }

        if (range == 56)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenCarbideSword));
        }

        if (range == 57)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.valframSword));
        }

        if (range == 58)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenSteelChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelSword));
        }

        if (range == 59)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
        }

        if (range == 60)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenSteelChest));
        }

        if (range == 61)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenSteelLegs));
        }

        if (range == 62)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
        }

        if (range == 63)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelSword));
        }

        if (range == 64)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelShovel));
        }

        if (range == 65)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelAxe));
        }

        if (range == 66)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelPickaxe));
        }

        if (range == 67)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelHoe));
        }

        if (range == 68)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.prasinosChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosSword));
        }

        if (range == 69)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
        }

        if (range == 70)
        {
            living.setCurrentItemOrArmor(3, new ItemStack(Content.prasinosChest));
        }

        if (range == 71)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.prasinosLegs));
        }

        if (range == 72)
        {
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
        }

        if (range == 73)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosSword));
        }

        if (range == 74)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosShovel));
        }

        if (range == 75)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosAxe));
        }

        if (range == 76)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosPickaxe));
        }

        if (range == 77)
        {
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosHoe));
        }

        if (range == 78)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenSteelChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelSword));
        }

        if (range == 79)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelPickaxe));
        }

        if (range == 80)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenSteelChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelAxe));
        }

        if (range == 81)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenSteelLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelShovel));
        }

        if (range == 82)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenSteelHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenSteelBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelHoe));
        }

        if (range == 83)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.prasinosChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosSword));
        }

        if (range == 84)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosPickaxe));
        }

        if (range == 85)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.prasinosChest));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosAxe));
        }

        if (range == 86)
        {
            living.setCurrentItemOrArmor(2, new ItemStack(Content.prasinosLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosShovel));
        }

        if (range == 87)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.prasinosHelm));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.prasinosBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosHoe));
        }

        if (range == 88)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.tungstenSteelSword));
        }

        if (range == 89)
        {
            living.setCurrentItemOrArmor(4, new ItemStack(Content.tungstenHelm));
            living.setCurrentItemOrArmor(3, new ItemStack(Content.tungstenChest));
            living.setCurrentItemOrArmor(2, new ItemStack(Content.tungstenLegs));
            living.setCurrentItemOrArmor(1, new ItemStack(Content.tungstenBoots));
            living.setCurrentItemOrArmor(0, new ItemStack(Content.prasinosSword));
        }

	} // end EquipMobs()

} // end class JoinWorldHandler
