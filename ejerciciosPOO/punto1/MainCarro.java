package ejerciciosPOO.punto1;

import ejerciciosPOO.punto1.Carro;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi","R8",2020,"Rojo");
        carro1.acelerar();
        carro1.frenar();
        carro1.girar("Derecha");
        System.out.println("\nInformación del carro: ");
        carro1.mostrarInformacion();

        System.out.println();

        Carro carro2 = new Carro("Lamborghini","Aventador",2023,"Gris");
        carro2.acelerar();
        carro2.frenar();
        carro2.girar("Izquierda");
        System.out.println("\nInformación del carro:");
        carro2.mostrarInformacion();
    }
}
