package akkamaddi.plugins.simpletungsten;


public class ClientProxy extends akkamaddi.api.core.ClientProxy
{
    @Override
    public void registerRenderers()
    {
        // This is for rendering entities and so forth later on
        //Armor Renderers
        SimpleTungsten.rendererTungsten = addArmor("tungsten");
        SimpleTungsten.rendererTungstenCarbide = addArmor("tungstencarbide");
        SimpleTungsten.rendererValfram = addArmor("valfram");
        SimpleTungsten.rendererValfram = addArmor("valfram");
        SimpleTungsten.rendererTungstenSteel = addArmor("tungstensteel");
        SimpleTungsten.rendererPrasinos = addArmor("prasinos");
    	
    }

}