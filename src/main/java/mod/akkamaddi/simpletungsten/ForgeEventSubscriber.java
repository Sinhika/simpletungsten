package mod.akkamaddi.simpletungsten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simpletungsten.content.SimpleTungstenArmorMaterial;
import mod.akkamaddi.simpletungsten.generation.OreGeneration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleTungsten.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(SimpleTungsten.MODID + " Forge Event Subscriber");
 
    /**
     * Biome loading triggers ore generation.
     */
    @SubscribeEvent(priority=EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent evt)
    {
        if (!OreGeneration.checkAndInitBiome(evt)) return;
        OreGeneration.generateOverworldOres(evt);
   } // end onBiomeLoading()
    
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
        if (event.getEntityLiving() instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            LOGGER.debug("caught LivingAttackEvent");

            // falling anvils and other impact damage, wearing full suit of tungsten carbide?
            if (( event.getSource() == DamageSource.ANVIL 
                 || event.getSource() == DamageSource.FALLING_BLOCK
                 || event.getSource() == DamageSource.FLY_INTO_WALL
                 || event.getSource() == DamageSource.IN_WALL) 
                &&
                ModUtil.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled impact damage because of tungsten carbide");
            } // end-if full set of tungsten carbide and impact damage
            else if ( event.getSource().isFireDamage()
                     && ModUtil.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.VALFRAM))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled fire/lava damage because of valfram");
            } // end-else-if full set of Valfram and fire/lava/heat damage
        } // end-if player
    } // end onLivingHurtEvent

} // end class
