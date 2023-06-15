package ejerciciosHerenciaPolimorfismoInterfaz.profesion;

public class Arquitecto extends Profesion {
    public Arquitecto() {
        super.bono = 2000000;
    }

    public Arquitecto(long sueldo, long bono) {
        super(sueldo, bono);
    }
}
