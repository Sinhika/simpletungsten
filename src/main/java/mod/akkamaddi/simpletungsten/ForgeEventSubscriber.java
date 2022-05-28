package mod.akkamaddi.simpletungsten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simpletungsten.config.SimpleTungstenConfig;
import mod.akkamaddi.simpletungsten.content.SimpleTungstenArmorMaterial;
import mod.akkamaddi.simpletungsten.generation.OreGeneration;
import mod.akkamaddi.simpletungsten.loot.SimpleTungstenInjectionLookup;
import mod.alexndr.simplecorelib.api.helpers.ArmorUtils;
import mod.alexndr.simplecorelib.api.helpers.LootUtils;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
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
     * Biome loading triggers ore generation.
     */
    @SubscribeEvent(priority=EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent evt)
    {
        if (evt.getCategory() != Biome.BiomeCategory.NETHER && evt.getCategory() != Biome.BiomeCategory.THEEND)
        {
            OreGeneration.generateOverworldOres(evt);
        }
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
        if (event.getEntityLiving() instanceof Player)
        {
            Player player = (Player) event.getEntityLiving();
            LOGGER.debug("caught LivingAttackEvent");

            // falling anvils and other impact damage, wearing full suit of tungsten carbide?
            if (( event.getSource() == DamageSource.ANVIL 
                 || event.getSource() == DamageSource.FALLING_BLOCK
                 || event.getSource() == DamageSource.FLY_INTO_WALL
                 || event.getSource() == DamageSource.IN_WALL) 
                &&
                ArmorUtils.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.TUNGSTEN_CARBIDE))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled impact damage because of tungsten carbide");
            } // end-if full set of tungsten carbide and impact damage
            else if ( event.getSource().isFire()
                     && ArmorUtils.isPlayerWearingFullSet(player, SimpleTungstenArmorMaterial.VALFRAM))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled fire/lava damage because of valfram");
            } // end-else-if full set of Valfram and fire/lava/heat damage
        } // end-if player
    } // end onLivingHurtEvent

} // end class
