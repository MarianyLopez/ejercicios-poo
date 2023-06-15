package ejerciciosIntroduccionpoo;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Mariany López",9000000);

        cuenta1.mostrarInformacion();

        CuentaBancaria cuentaBancaria = new CuentaBancaria("Mariany López", 9000000);

        cuentaBancaria.getDatosCuenta();

    }
}
