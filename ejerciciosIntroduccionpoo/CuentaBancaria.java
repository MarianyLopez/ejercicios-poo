package ejerciciosIntroduccionpoo;


public class CuentaBancaria extends Cuenta {
    private long numeroDeCuenta;

    public CuentaBancaria() {
        this.setTitular("");
        this.setCantidad(0);
        this.numeroDeCuenta = 00000000000000000000;
    }

    public CuentaBancaria(String titular, double cantidad) {
        super(titular, cantidad);
        this.numeroDeCuenta=00000000000000000000;
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(long numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void getDatosCuenta (){
        super.mostrarInformacion();
        System.out.println("numeroDeCuenta = " + numeroDeCuenta);
    }
}
