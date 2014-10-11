package akkamaddi.simpletungsten.code;


public class ClientProxy extends akkamaddi.akkamaddiCore.api.ClientProxy
{
    @Override
    public void registerRenderers()
    {
        // This is for rendering entities and so forth later on
        //Armor Renderers
        SimpleTungstenCore.rendererTungsten = addArmor("tungsten");
        SimpleTungstenCore.rendererTungstenCarbide = addArmor("tungstencarbide");
        SimpleTungstenCore.rendererValfram = addArmor("valfram");
        SimpleTungstenCore.rendererValfram = addArmor("valfram");
        SimpleTungstenCore.rendererTungstenSteel = addArmor("tungstensteel");
        SimpleTungstenCore.rendererPrasinos = addArmor("prasinos");
    	
    }

}