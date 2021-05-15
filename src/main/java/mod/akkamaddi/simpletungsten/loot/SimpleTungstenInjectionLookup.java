package mod.akkamaddi.simpletungsten.loot;

import mod.alexndr.simplecorelib.helpers.InjectionTableLookup;

@SuppressWarnings("serial")
public class SimpleTungstenInjectionLookup extends InjectionTableLookup
{

    public SimpleTungstenInjectionLookup()
    {
        super();
        
        // aliased tables
        // just use 'shipwreck' for all this.
        this.put("shipwreck_supply", "shipwreck");
        this.put("shipwreck_map", "shipwreck");
        this.put("shipwreck_treasure", "shipwreck");
        
        AddStrongholdAliases();
        
        // these tables all present as themselves.
        this.put("abandoned_mineshaft", "abandoned_mineshaft");
        this.put("simple_dungeon", "simple_dungeon");

        // villagers
        this.put("village_armorer", "village_armorer");
        this.put("village_toolsmith", "village_toolsmith");
        this.put("village_weaponsmith", "village_weaponsmith");
        
    } // end ctor()

} // end class
