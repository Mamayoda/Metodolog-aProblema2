import java.util.Scanner;

public class FightEngine {
    public FightEngine() {
        String luchadorPlayer1;
        String accionLuchadorIn;
        int accionLuchador;
        Dificultad dificultad = new Dificultad(100);
            
        System.out.println("Empieza el juego!!!");
        System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho | 2-Minero Warrior ");
        
        Scanner seleccion = new Scanner(System.in);
        luchadorPlayer1 = seleccion.nextLine();
    
        System.out.println(luchadorPlayer1);
        
        // Usa FighterFactory para crear el luchador seleccionado
        Object player1 = FabricaDeLuchadores.createFighter(luchadorPlayer1);
        
        if (player1 != null) {
            System.out.println(player1 instanceof ChoroPortenho ? "Choro Portenho inicia la batalla!" : "Minero Warrior inicia la batalla!");
            dificultad.imprimirVidaEnemigo();
            
            while (dificultad.obtenerVida() > 0) {
                System.out.println("Ingresa tu acción! :1-Golpe | 2-Patada | 3-Salto | 4-LANZAR PODER");
                accionLuchadorIn = seleccion.nextLine();
                accionLuchador = Integer.parseInt(accionLuchadorIn);
                
                if (player1 instanceof ChoroPortenho) {
                    ChoroPortenho player1CP = (ChoroPortenho) player1;
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(player1CP.golpear());
                            dificultad.reducirVida(10);
                            break;
                        case 2:
                            System.out.println(player1CP.patear());
                            dificultad.reducirVida(20);
                            break;
                        case 3:
                            System.out.println(player1CP.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(player1CP.LanzarPoder());
                            dificultad.reducirVida(50);
                            break;
                    }
                } else if (player1 instanceof MineroWarrior) {
                    MineroWarrior player1MW = (MineroWarrior) player1;
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(player1MW.golpear());
                            dificultad.reducirVida(10);
                            break;
                        case 2:
                            System.out.println(player1MW.patear());
                            dificultad.reducirVida(20);
                            break;
                        case 3:
                            System.out.println(player1MW.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(player1MW.LanzarPoder());
                            dificultad.reducirVida(50);
                            break;
                    }
                }
                
                dificultad.imprimirVidaEnemigo();
            }
        } else {
            System.out.println("Opción de luchador inválida. Fin del juego.");
        }
        
        seleccion.close();
        System.out.println("FIN DEL JUEGO.");
    }
}
