package ejerciciosHerenciaPolimorfismoInterfaz.profesion;

public class Ingeniero extends Profesion{
    public Ingeniero() {
        super.bono = 5000000;
    }

    public Ingeniero(long sueldo, long bono) {
        super(sueldo, bono);
    }
}
