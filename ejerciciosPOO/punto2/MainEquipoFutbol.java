package ejerciciosPOO.punto2;

public class MainEquipoFutbol {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("James Rodriguez",10,"Centrocampista");
        Jugador jugador2 = new Jugador("David Ospina",1,"Portero");
        Jugador jugador3 = new Jugador("Davinson Sánchez",23,"Defensa Central");
        Jugador jugador4 = new Jugador("Radamel Falcao",9,"Delantero Centro");

        EquipoFutbol equipoFutbol = new EquipoFutbol();
        equipoFutbol.setNombre("Colombia");
        equipoFutbol.setCiudad("Bogotá");

        equipoFutbol.agregarJugador(jugador1);
        equipoFutbol.agregarJugador(jugador2);
        equipoFutbol.agregarJugador(jugador3);
        equipoFutbol.agregarJugador(jugador4);

        equipoFutbol.mostrarInformacion();

    }
}
