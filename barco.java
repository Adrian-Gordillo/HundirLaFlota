package hundirLaFlota;

public class Barco {

    private String nombre;
    private int tamaño;

    private Barco(String nombre, int tamaño) {

        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public static Barco crearPortaAviones() {
        return new Barco("Porta Aviones", 5);
    }

    public static Barco crearAcorazado() {
        return new Barco("Acorazado", 4);
    }

    public static Barco crearCruzero() {
        return new Barco("Cruzero", 3);
    }

    public static Barco crearSubmarino() {
        return new Barco("Submarino", 3);
    }

    public static Barco crearDestructor() {
        return new Barco("Destructor", 2);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }
}