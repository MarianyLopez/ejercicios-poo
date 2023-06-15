package ejerciciosHerenciaPolimorfismoInterfaz.profesion;

public class MainProfesion {
    public static void main(String[] args) {
        Ingeniero ingeniero = new Ingeniero();
        System.out.println("Sueldo ingeniero: "+ingeniero.calcularSueldo());

        Arquitecto arquitecto = new Arquitecto();
        System.out.println("Sueldo arquitecto: "+arquitecto.calcularSueldo());

        Medico medico = new Medico();
        System.out.println("Sueldo medico: "+medico.calcularSueldo());

    }
}
