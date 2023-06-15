package ejerciciosHerenciaPolimorfismoInterfaz.tarjetaCredito;

import java.time.LocalDate;

public class MainTarjetaCredito {
    public static void main(String[] args) {
        Clasica clasica = new Clasica("Visa",3000000,"3108287238",2345, LocalDate.parse("2028-06-10"));
        System.out.println("Información tarjeta Clásica");
        clasica.imprimir();
        System.out.println();

        Dorada dorada = new Dorada("MasterCard",5000000,"320437738",1375, LocalDate.parse("2028-06-10"));
        System.out.println("Información tarjeta Dorada");
        dorada.imprimir();
        System.out.println();

        Platinum platinum = new Platinum("American Express",7000000,"270437738",2501, LocalDate.parse("2028-06-10"));
        System.out.println("Información tarjeta Platinum");
        platinum.imprimir();
        System.out.println();

        Black black = new Black("Visa",10000000,"358437738",2678, LocalDate.parse("2028-06-10"));
        System.out.println("Información tarjeta Black");
        black.imprimir();

    }
}
