package ejerciciosHerenciaPolimorfismoInterfaz.profesion;

public class Medico extends Profesion{
    public Medico() {
        super.bono = 3000000;
    }
    public Medico(long sueldo, long bono) {
        super(sueldo, bono);
    }

}
