package ejerciciosPOO.punto2;

public class Jugador {

    private String nombre;
    private int numeroDeportivo;
    private String posicion;

    public Jugador(String nombre, int numeroDeportivo, String posicion) {
        this.nombre = nombre;
        this.numeroDeportivo = numeroDeportivo;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeportivo() {
        return numeroDeportivo;
    }

    public void setNumeroDeportivo(int numeroDeportivo) {
        this.numeroDeportivo = numeroDeportivo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
