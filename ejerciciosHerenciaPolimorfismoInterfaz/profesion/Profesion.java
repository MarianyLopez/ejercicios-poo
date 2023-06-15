package ejerciciosHerenciaPolimorfismoInterfaz.profesion;

public class Profesion {
    protected long sueldo;
    protected long bono;

    public Profesion() {
        sueldo = 2000000;
    }

    public Profesion(long sueldo, long bono) {
        this.sueldo = sueldo;
        this.bono = bono;
    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }

    public long calcularSueldo(){
        return sueldo+bono;
    }
}
