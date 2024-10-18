import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static class juego_1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            // Variables del jugador y enemigo
            int vidaJugador = 100;
            int vidaEnemigo = 100;
            String armaJugador = "";

            // Elección de armas
            System.out.println(" ------------------- Elige tu arma --------------------");
            System.out.println(" | 1. Espada (Daño medio, alta precisión)             |");
            System.out.println(" | 2. Hacha (Daño alto, baja precisión)               |");
            System.out.println(" | 3. Daga (Daño bajo, alta probabilidad de crítico)  |");
            System.out.println(" ------------------------------------------------------");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    armaJugador = "Espada";
                    break;
                case 2:
                    armaJugador = "Hacha";
                    break;
                case 3:
                    armaJugador = "Daga";
                    break;
                default:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("| Opción no válida, has elegido la Espada por defecto. |");
                    System.out.println("-----------------------------------------------------");

                    armaJugador = "Espada";
                    break;
            }

            System.out.println("Has elegido: " + armaJugador);

            // Bucle de la batalla
            while (vidaJugador > 0 && vidaEnemigo > 0) {
                System.out.println("----------------------------------------");
                System.out.println("| Tu vida: " + vidaJugador + " | Vida del enemigo: " + vidaEnemigo + " |");
                System.out.println("----------------------------------------");


                // Turno del jugador
                System.out.println("| Es tu turno. Elige una opción:       |");
                System.out.println("| 1. Atacar                            |");
                System.out.println("| 2. Salir del juego                   |");
                System.out.println("----------------------------------------");
                System.out.print("\n");

                int opcion = sc.nextInt();

                if (opcion == 2) {
                    System.out.println("Has salido del juego. ¡Hasta luego!");
                    break;
                } else if (opcion == 1) {
                    int dolorJugador = calcularDolor(armaJugador, rand);
                    System.out.println("Atacas con " + armaJugador + " y haces " + dolorJugador + " puntos de daño.");
                    vidaEnemigo -= dolorJugador;

                    if (vidaEnemigo <= 0) {
                        System.out.println("¡Has derrotado al enemigo!");
                        break;
                    }

                    // Turno del enemigo
                    int dolorEnemigo = rand.nextInt(15) + 5; // Daño entre 5 y 15
                    System.out.println("El enemigo ataca y hace " + dolorEnemigo + " puntos de daño.");
                    vidaJugador -= dolorEnemigo;

                    if (vidaJugador <= 0) {
                        System.out.println("Has sido derrotado por el enemigo...");
                        break;
                    }
                } else {
                    System.out.println("Opción no válida. Por favor, elige 1 para atacar o 2 para salir.");
                }
            }

            sc.close();
        }

        public static int calcularDolor(String arma, Random rand) {
            int dolor = 0;

            switch (arma) {
                case "Espada":
                    dolor = rand.nextInt(15) + 5; // Daño entre 5 y 20
                    break;
                case "Hacha":
                    if (rand.nextInt(100) < 50) { // 50% de probabilidad de acertar
                        dolor = rand.nextInt(25) + 10; // Daño entre 10 y 35
                    } else {
                        System.out.println("Fallaste con el hacha...");
                    }
                    break;
                case "Daga":
                    dolor = rand.nextInt(10) + 3; // Daño entre 3 y 13
                    if (rand.nextInt(100) < 30) { // 30% de probabilidad de golpe crítico
                        System.out.println("¡Golpe crítico!");
                        dolor *= 2;
                    }
                    break;
            }

            return dolor;
        }
    }

}
