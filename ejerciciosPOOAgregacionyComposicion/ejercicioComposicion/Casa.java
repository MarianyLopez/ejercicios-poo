package ejerciciosPOOAgregacionyComposicion.ejercicioComposicion;

public class Casa {
    private Habitacion habitaciones[];
    private int cantidadHabitaciones;
    private final int CAPACIDAD_MAXIMA=100;

    public Casa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        cantidadHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion){
        if (cantidadHabitaciones<CAPACIDAD_MAXIMA) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        }else
            System.out.println("La cantidad de habitaciones supera el límite por casa(es decir 100)");
    }

    public void destruirCasa(){
        habitaciones = new Habitacion[0];
        cantidadHabitaciones = 0;
    }

    public void mostrarInformacionCasa(){
        System.out.println("Informacion de la casa: ");
        System.out.println(cantidadHabitaciones!=0?"Cantidad de habitaciones en la casa: "+cantidadHabitaciones:"No hay habitaciones en la casa");
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i]!=null) {
                System.out.println("Habitación "+(i+1));
                System.out.println("Número de la habitacion: " + habitaciones[i].getNumeroHabitacion());
                System.out.println("Tamaño de la habitacion: " + habitaciones[i].getTamanoHabitacion());
            }
        }
    }




}
