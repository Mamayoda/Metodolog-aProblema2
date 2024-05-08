public class Dificultad {
    private int vidaEnemigo;  // Vida actual del enemigo

    // Constructor que inicializa la vida del enemigo
    public Dificultad(int vidaInicial) {
        this.vidaEnemigo = vidaInicial;
    }

    // Método para reducir la vida del enemigo
    public void reducirVida(int daño) {
        vidaEnemigo -= daño;
        if (vidaEnemigo < 0) {
            vidaEnemigo = 0;  // La vida no debe ser negativa
        }
    }

    // Método para obtener la vida actual del enemigo
    public int obtenerVida() {
        return vidaEnemigo;
    }

    // Método para imprimir la vida restante del enemigo
    public void imprimirVidaEnemigo() {
        System.out.printf("Vida del enemigo %d%n \n", vidaEnemigo);
    }
}

