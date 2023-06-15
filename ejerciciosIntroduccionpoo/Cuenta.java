package ejerciciosIntroduccionpoo;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInformacion(){
        System.out.println("El titular de la cuenta es: "+ titular);
        System.out.println("El saldo es: "+ cantidad);
    }

    public void ingresarSaldo(double saldoIngresado){
        cantidad += saldoIngresado;
    }

    public void retirar(double valorARetirar){

        if (valorARetirar>cantidad)
            System.out.println("Fondos insuficientes");
        else
            cantidad -= valorARetirar;
    }
}
