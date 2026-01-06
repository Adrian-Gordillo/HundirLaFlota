package hundirLaFlota;

public class tablero {

    private String tablero[][] = new String[8][8];

    public void disparo(int fila, int columna) {
        if (tablero[fila][columna] == null) {
            System.out.println("Agua");
        } else {
            System.out.println("HIT");
        }
    }

    public void colocarBarco(Barco barco, int fila, int columna, String direccion) {

        if (direccion.equals("HORIZONTAL")) {
            for (int i = 0; i < barco.getTamaño(); i++) {
                tablero[fila][columna + i] = barco.getNombre();
            }
        } else if (direccion.equals("VERTICAL")) {
            for (int i = 0; i < barco.getTamaño(); i++) {
                tablero[fila + i][columna] = barco.getNombre();
            }
        }
    }
}