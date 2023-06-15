package ejerciciosPOOAgregacionyComposicion.ejercicioAgregacion;

public class MainUniversidad {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Dilan Dahier Quintero Rivera",21,1);
        Estudiante estudiante2 = new Estudiante("Mariany López Sánchez",21, 2);
        Estudiante estudiante3 = new Estudiante("Emily Quintero Rivera", 15, 3);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        System.out.println(universidad.getNombre());

        Estudiante [] estudiantes = universidad.getEstudiantes();

        System.out.println("Estudiantes:");
        for (int i = 0; i < universidad.getCantidadEstudiantes(); i++) {
            System.out.println((i+1)+". Nombre: "+estudiantes[i].getNombre()+"\n   Edad: "+estudiantes[i].getEdad()
                    + "\n   Número de Estudiante: "+estudiantes[i].getNumeroEstudiante());
        }

    }
}
