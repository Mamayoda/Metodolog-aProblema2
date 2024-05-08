public abstract class Decorador extends Luchador{
    protected Luchador luchador;

    public Decorador(Luchador luchador){
        this.luchador = luchador;
    }
}
