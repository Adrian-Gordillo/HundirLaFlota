package hundirLaFlota;

public class Tablero {

    private String tablero[][] = new String[8][8];
    private String mapa[][] = new String[8][8];

    public void setMapa() {

        for (int i = 0; i < mapa.length; i++) { 
            for (int j = 0; j < mapa.length; j++){
                this.mapa[i][j] = "~";
            }
        }
    }

    public void colocarBarcosAleatoriamente(Barco[] barcos) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = null;
            }
        }

        for (Barco barco : barcos) {
            boolean colocado = false;
            
            while (!colocado) {

                int fila = (int) (Math.random() * 8); 
                int col = (int) (Math.random() * 8); 
                
                
                String direccion = (Math.random() < 0.5) ? "HORIZONTAL" : "VERTICAL";

                if (esPosicionValida(barco.getTamaño(), fila, col, direccion)) {
                    colocarBarco(barco, fila, col, direccion);
                    colocado = true;
                }
            }
        }
    }

    private boolean esPosicionValida(int tamaño, int fila, int col, String direccion) {
        if (direccion.equals("HORIZONTAL")) {

            if (col + tamaño > 8) return false;

            for (int i = 0; i < tamaño; i++) {
                if (tablero[fila][col + i] != null) return false; 
            }
        } else { 

            if (fila + tamaño > 8) return false;

            for (int i = 0; i < tamaño; i++) {
                if (tablero[fila + i][col] != null) return false;
            }
        }
        return true;
    }

    public void colocarBarco(Barco barco, int fila, int columna, String direccion) {

        if (direccion.equalsIgnoreCase("HORIZONTAL")) {
            for (int i = 0; i < barco.getTamaño(); i++) {
                tablero[fila][columna + i] = barco.getNombre();
            }
        } else if (direccion.equalsIgnoreCase("VERTICAL")) {
            for (int i = 0; i < barco.getTamaño(); i++) {
                tablero[fila + i][columna] = barco.getNombre();
            }
        }
    }

    public boolean disparo(int fila, int columna) {

        if (tablero[fila][columna] == null) {
            this.mapa[fila][columna] = "A";
            System.out.println("Agua");
            return false;
        } else {
            this.mapa[fila][columna] = "x";
            System.out.println("Posición [" + fila + "][" + columna + "]: HIT");
            return true;
        }
    }

    public void imprimirTablero() {

        System.out.print("  ");
        for (int k = 0; k < 8; k++)
            System.out.print(k + " ");
        System.out.println();

        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
}