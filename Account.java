package hundirLaFlota;

public class Account {

    private String playerName;
    private int partidasJugadas;
    private int victorias;

    public Account(String playerName) {
        this.playerName = playerName;
        this.partidasJugadas = 0;
        this.victorias = 0;

    }

    public void añadirResultado(boolean victoria) {
        this.partidasJugadas++;
        if (victoria == true) {
            this.victorias++;
        }
    }

    public double porcentajeVictorias() {
        if (this.partidasJugadas == 0) {
            return 0.0;
        } else {
            return ((double) this.victorias / this.partidasJugadas) * 100;
        }
    }

    public void setName(String newName) {
        this.playerName = newName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void getEstadisticas(String playerName) {
        System.out
                .println("Numero de victorias: " + "|" + this.victorias + "% victorias:" + porcentajeVictorias() + "%");
    }
}