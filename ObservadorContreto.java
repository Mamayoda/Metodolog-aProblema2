public class ObservadorContreto implements Observer {

    public void update(int vidaEnemigo) {
        System.out.println("El enemigo tiene " + vidaEnemigo + " de vida");
    }
}
