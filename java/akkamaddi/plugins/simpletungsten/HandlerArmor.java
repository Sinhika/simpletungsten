package akkamaddi.plugins.simpletungsten;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import akkamaddi.api.core.SimpleArmorWithEffect;
import akkamaddi.api.core.SimpleArmorWithEffect.ARMOR_TYPE;

public class HandlerArmor
{
    //effects
	@SubscribeEvent
    public void onFallDamage(LivingAttackEvent event)
    {
        if (event.entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entity;
        	ItemStack [] armorbits = new ItemStack[4];
        	SimpleArmorWithEffect.getArmorPieces(player, armorbits);
			for (int i=0; i < 4; i++) {
				if (armorbits[i] == null) return;
			}

			if (armorbits[ARMOR_TYPE.HELM.ordinal()].getItem() == Content.valframHelm
					&& armorbits[ARMOR_TYPE.CHEST.ordinal()].getItem() == Content.valframChest
					&& armorbits[ARMOR_TYPE.LEGS.ordinal()].getItem() == Content.valframLegs
					&& armorbits[ARMOR_TYPE.BOOTS.ordinal()].getItem() == Content.valframBoots) 
			{
				if (event.source.equals(DamageSource.lava)
						|| event.source.equals(DamageSource.inFire)
						|| event.source.equals(DamageSource.onFire)) 
				{
					event.setCanceled(true);
					// return;
				}
			} // end-if full suit of Valfram

			else if (armorbits[ARMOR_TYPE.HELM.ordinal()].getItem() == Content.tungstenCarbideHelm
					&& armorbits[ARMOR_TYPE.CHEST.ordinal()].getItem() == Content.tungstenCarbideChest
					&& armorbits[ARMOR_TYPE.LEGS.ordinal()].getItem() == Content.tungstenCarbideLegs
					&& armorbits[ARMOR_TYPE.BOOTS.ordinal()].getItem() == Content.tungstenCarbideBoots)
			{
					if (event.source.equals(DamageSource.anvil)
							|| event.source.equals(DamageSource.fallingBlock)
							|| event.source.equals(DamageSource.inWall)) 
					{
						event.setCanceled(true);
						// return;
					}
			} // end-else-if full suit of tungsten carbide
        } // end-if entityPlayer
    } // end onFallDamage()
} // end class HandlerArmor()
