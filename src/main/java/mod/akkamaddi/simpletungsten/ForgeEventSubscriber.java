package mod.akkamaddi.simpletungsten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.content.SimpleTungstenArmorMaterial;
import mod.akkamaddi.simpletungsten.loot.SimpleTungstenInjectionLookup;
import mod.alexndr.simplecorelib.api.helpers.ArmorUtils;
import mod.alexndr.simplecorelib.api.helpers.LootUtils;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleTungsten.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(SimpleTungsten.MODID + " Forge Event Subscriber");
    private static final SimpleTungstenInjectionLookup lootLookupMap = new SimpleTungstenInjectionLookup();

    /**
     * add mod loot to loot tables. Code heavily based on Botania's LootHandler, which
     * neatly solves the problem when I couldn't figure it out.
     */
    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
        if (SimpleTungstenConfig.addModLootToChests)
        {
            LootUtils.LootLoadHandler(SimpleTungsten.MODID, event, lootLookupMap);
        } // end-if
    } // end LootLoad()
    
     /**
     * Handle special armor immunities: tungsten carbide armor protects from impact damage such
     * as falling anvils, falling blocks, being smashed into a wall; valfram protects from heat
     * and fire damage.
     * 
     * @param event
     */
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingAttackEvent(LivingAttackEvent event)
    {
        // first, is it a player?
        if (event.getEntity() instanceof Player)
        {
            Player player = (Player) event.getEntity();
            LOGGER.debug("caught LivingAttackEvent");

            // falling anvils and other impact damage, wearing full suit of tungsten carbide?
            if (( event.getSource().is(DamageTypes.FALLING_ANVIL)
                 || event.getSource().is(DamageTypes.FALLING_BLOCK)
                 || event.getSource().is(DamageTypes.FLY_INTO_WALL)
                 || event.getSource().is(DamageTypes.IN_WALL))
                &&
                ArmorUtils.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled impact damage because of tungsten carbide");
            } // end-if full set of tungsten carbide and impact damage
            else if ( (event.getSource().is(DamageTypes.IN_FIRE)
            		 || event.getSource().is(DamageTypes.FIREBALL)
            		 || event.getSource().is(DamageTypes.LAVA)
            		 || event.getSource().is(DamageTypes.HOT_FLOOR)
            		 || event.getSource().is(DamageTypes.ON_FIRE)
            		 || event.getSource().is(DamageTypes.FIREWORKS)
            		 || event.getSource().is(DamageTypes.UNATTRIBUTED_FIREBALL))
                     && ArmorUtils.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.VALFRAM))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled fire/lava damage because of valfram");
            } // end-else-if full set of Valfram and fire/lava/heat damage
        } // end-if player
    } // end onLivingHurtEvent

} // end class
