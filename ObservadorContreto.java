public class ObservadorContreto implements obeserver {
    private String nombre;

    public ObservadorContreto(String nombre) {
        this.nombre = nombre;
    }

    public void update(int vidaEnemigo) {
        System.out.println("El enemigo tiene " + vidaEnemigo + " de vida");
    }
}