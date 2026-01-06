package hundirLaFlota;

public class barco {

    private String nombre;
    private int tamaño;

    private barco(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public static barco crearPortaAviones() {
        return new barco("Porta Aviones", 5);
    }

    public static barco crearAcorazado() {
        return new barco("Acorazado", 4);
    }

    public static barco crearCruzero() {
        return new barco("Cruzero", 3);
    }

    public static barco crearSubmarino() {
        return new barco("Submarino", 3);
    }

    public static barco crearDestructor() {
        return new barco("Destructor", 2);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }
}