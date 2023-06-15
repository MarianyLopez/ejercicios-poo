package ejerciciosPOOAgregacionyComposicion.ejercicioComposicion;

public class MainCasa {
    public static void main(String[] args) {

        Casa casa = new Casa();
        Habitacion habitacion1 = new Habitacion(1,20);
        Habitacion habitacion2 = new Habitacion(2,25);
        Habitacion habitacion3 = new Habitacion(3,30);

        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);
        casa.agregarHabitacion(habitacion3);

        casa.mostrarInformacionCasa();

        casa.destruirCasa();

        System.out.println("\nDespués de llamar al método destruir casa: ");
        casa.mostrarInformacionCasa();

    }
}
