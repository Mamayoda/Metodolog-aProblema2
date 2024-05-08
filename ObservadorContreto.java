public class ObservadorContreto implements Observer {
    private String nombre;

    public ObservadorContreto(String nombre) {
        this.nombre = nombre;
    }

    public void update(int vidaEnemigo) {
        System.out.println(nombre+"El enemigo tiene " + vidaEnemigo + " de vida");
    }
}
