package hundirLaFlota;

import java.util.Scanner;

public class hundirLaFlota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- BIENVENIDO A HUNDIR LA FLOTA ---");
        System.out.print("Introduce tu nombre de jugador: ");
        String nombre = scanner.nextLine();

        Account jugador = new Account(nombre);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Jugar nueva partida");
            System.out.println("2. Ver estadísticas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    jugarPartida(scanner, jugador);
                    break;
                case "2":
                    jugador.getEstadisticas(jugador.getPlayerName());
                    break;
                case "3":
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void jugarPartida(Scanner scanner, Account jugador) {
        Tablero tablero = new Tablero();
        tablero.setMapa();

        Barco[] miFlota = {
                Barco.crearPortaAviones(),
                Barco.crearAcorazado(),
                Barco.crearCruzero(),
                Barco.crearSubmarino(),
                Barco.crearDestructor()
        };

        System.out.println("Generando posiciones enemigas aleatorias...");
        tablero.colocarBarcosAleatoriamente(miFlota);

        int aciertosNecesarios = 17;
        int aciertosActuales = 0;
        int intentos = 30;

        boolean victoria = false;

        while (intentos > 0 && aciertosActuales < aciertosNecesarios) {
            System.out.println("\n-----------------------------");
            System.out.println("Intentos restantes: " + intentos);

            tablero.imprimirTablero();

            int fila = -1;
            int col = -1;

            while (fila < 0 || fila > 7) {
                System.out.print("Introduce Fila (0-7): ");
                try {
                    fila = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número.");
                }
            }

            while (col < 0 || col > 7) {
                System.out.print("Introduce Columna (0-7): ");
                try {
                    col = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número.");
                }
            }

            boolean esAcierto = tablero.disparo(fila, col);

            if (esAcierto) {
                aciertosActuales++;
            }
            intentos--;
        }

        if (aciertosActuales == aciertosNecesarios) {
            System.out.println("\n¡FELICIDADES! HAS HUNDIDO TODA LA FLOTA.");
            victoria = true;
        } else {
            System.out.println("\nGAME OVER. Te has quedado sin munición.");
        }

        jugador.añadirResultado(victoria);
    }
}