import java.util.Scanner;

public class FightEngine {
    public FightEngine() {
        int Arma = 0;
        Scanner seleccion = new Scanner(System.in);
        Scanner seleccionArma = new Scanner(System.in);
        Dificultad dificultad = new Dificultad(100);
        System.out.println("Empieza el juego!!!");
        System.out.println("Selecciona tu luchador (1 o 2 o 3): 1-Choro Portenho | 2-Minero Warrior | 3-Punki Porteño");
        
        // Lee la elección del jugador
        String luchadorPlayer1 = seleccion.nextLine();

        // Selecciona el arma a utilizar
        System.out.println("Selecciona arma: 1-Botella");
        Arma = seleccionArma.nextInt();
        

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
                if (player1 instanceof ChoroPortenho && Arma == 1) {
                    ChoroPortenho luchador = (ChoroPortenho) player1;
                    Luchador luchadorConBotella = new Botella(luchador);
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchadorConBotella.golpear());
                            dificultad.reducirVida(15);
                            break;
                        case 2:
                            System.out.println(luchadorConBotella.patear());
                            dificultad.reducirVida(25);
                            break;
                        case 3:
                            System.out.println(luchadorConBotella.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchadorConBotella.LanzarPoder());
                            dificultad.reducirVida(55);
                            break;
                    }
                } else if (player1 instanceof MineroWarrior && Arma == 1) {
                    MineroWarrior luchador = (MineroWarrior) player1;
                    Luchador luchadorConBotella = new Botella(luchador);
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchadorConBotella.golpear());
                            dificultad.reducirVida(15);
                            break;
                        case 2:
                            System.out.println(luchadorConBotella.patear());
                            dificultad.reducirVida(25);
                            break;
                        case 3:
                            System.out.println(luchadorConBotella.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchadorConBotella.LanzarPoder());
                            dificultad.reducirVida(55);
                            break;
                    }
                } else if (player1 instanceof PunkiPorteno && Arma == 1) {
                    PunkiPorteno luchador = (PunkiPorteno) player1;
                    Luchador luchadorConBotella = new Botella(luchador);
                    switch (accionLuchador) {
                        case 1:
                            System.out.println(luchadorConBotella.golpear());
                            dificultad.reducirVida(15);
                            break;
                        case 2:
                            System.out.println(luchadorConBotella.patear());
                            dificultad.reducirVida(25);
                            break;
                        case 3:
                            System.out.println(luchadorConBotella.saltar());
                            dificultad.reducirVida(0);
                            break;
                        case 4:
                            System.out.println(luchador.LanzarPoder());
                            dificultad.reducirVida(55);
                            break;
                    }
                } else if (player1 instanceof ChoroPortenho && Arma == 0) {
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
                } else if (player1 instanceof MineroWarrior && Arma == 0) {
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
                } else if (player1 instanceof PunkiPorteno && Arma == 0) {
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
