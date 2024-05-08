import java.util.Scanner;

public class FightEngine {
    public FightEngine() {
        Scanner seleccion = new Scanner(System.in);
        Dificultad dificultad = new Dificultad(100);
        System.out.println("Empieza el juego!!!");
        System.out.println("Selecciona tu luchador (1 o 2 o 3): 1-Choro Portenho | 2-Minero Warrior | 3-Punki Porteño");
        
        // Lee la elección del jugador
        String luchadorPlayer1 = seleccion.nextLine();
        
        // Usa la fábrica para crear el luchador seleccionado
        Object player1 = FabricaDeLuchadores.createFighter(luchadorPlayer1);
        
        // Comprueba si la creación del luchador fue exitosa
        if (player1 == null) {
            System.out.println("Opción de luchador inválida. Fin del juego.");
        } else {
            // Verifica el tipo de luchador y muestra el mensaje correspondiente
            if (player1 instanceof ChoroPortenho) {
                System.out.println("Choro Portenho inicia la batalla!");
            } else if (player1 instanceof MineroWarrior) {
                System.out.println("Minero Warrior inicia la batalla!");
            } else if (player1 instanceof PunkiPorteno) {
                System.out.println("Punki Porteño inicia la batalla!");
            }
            
            // Comienza el combate
            dificultad.imprimirVidaEnemigo();
            
            while (dificultad.obtenerVida() > 0) {
                System.out.println("Ingresa tu acción! :1-Golpe | 2-Patada | 3-Salto | 4-LANZAR PODER");
                String accionLuchadorIn = seleccion.nextLine();
                int accionLuchador = Integer.parseInt(accionLuchadorIn);
                
                // Lógica para cada tipo de luchador
                if (player1 instanceof ChoroPortenho) {
                    ChoroPortenho luchador = (ChoroPortenho) player1;
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchador.golpear());
                            dificultad.reducirVida(10);
                            break;
                        case 2:
                            System.out.println(luchador.patear());
                            dificultad.reducirVida(20);
                            break;
                        case 3:
                            System.out.println(luchador.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchador.LanzarPoder());
                            dificultad.reducirVida(50);
                            break;
                    }
                } else if (player1 instanceof MineroWarrior) {
                    MineroWarrior luchador = (MineroWarrior) player1;
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchador.golpear());
                            dificultad.reducirVida(10);
                            break;
                        case 2:
                            System.out.println(luchador.patear());
                            dificultad.reducirVida(20);
                            break;
                        case 3:
                            System.out.println(luchador.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchador.LanzarPoder());
                            dificultad.reducirVida(50);
                            break;
                    }
                } else if (player1 instanceof PunkiPorteno) {
                    PunkiPorteno luchador = (PunkiPorteno) player1;
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchador.golpear());
                            dificultad.reducirVida(10);
                            break;
                        case 2:
                            System.out.println(luchador.patear());
                            dificultad.reducirVida(20);
                            break;
                        case 3:
                            System.out.println(luchador.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchador.LanzarPoder());
                            dificultad.reducirVida(50);
                            break;
                    }
                }
                
                // Imprime la vida restante del enemigo
                dificultad.imprimirVidaEnemigo();
            }
        }
        
        seleccion.close();
        System.out.println("FIN DEL JUEGO.");
    }
}
