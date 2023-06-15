package ejerciciosIntroduccionpoo;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Mariany",21,1193534495);

        persona.mostrarInformacion();

        String mayor = (persona.esMayorDeEdad())?"Soy mayor de edad":"Soy menor de edad";

        System.out.println(mayor);


    }
}
