package ejerciciosPOO.punto2;

import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    private String ciudad;
    private ArrayList<Jugador>jugadores = new ArrayList<>();

    public EquipoFutbol() {
    }

    public EquipoFutbol(String nombre, String ciudad, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarInformacion(){
        System.out.println("Información del Equipo de Futbol: \n" +
                "Nombre: "+nombre + "\nCiudad: "+ciudad+ "\nJugadores: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println( "     "+(i+1)+". "+jugadores.get(i).getNombre()+ "\n     Número dorsal: "+ jugadores.get(i).getNumeroDeportivo()
                    + "\n     Posición de juego: "+ jugadores.get(i).getPosicion());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> listaJugadores) {
        this.jugadores = jugadores;
    }
}
