public class Botella extends Decorador{
    public Botella(Luchador luchador){
        super(luchador);
    }
    @Override
    public String golpear() {
        return luchador.golpear() + " CON BOTELLAZO!";
    }
    
    @Override
    public String patear() {
        return luchador.patear() + " con botella!";
    }
    
    @Override
    public String saltar() {
        return luchador.saltar() + " con botella!";
    }
    
    @Override
    public String LanzarPoder() {
        return luchador.LanzarPoder() + " con botella!";
    }

}
