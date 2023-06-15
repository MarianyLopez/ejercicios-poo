package ejerciciosPOOAgregacionyComposicion.ejercicioComposicion;

public class Habitacion {
    private int numeroHabitacion ;
    private double tamanoHabitacion;

    public Habitacion(int numeroHabitacion, double tamanoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tamanoHabitacion = tamanoHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getTamanoHabitacion() {
        return tamanoHabitacion;
    }
}
