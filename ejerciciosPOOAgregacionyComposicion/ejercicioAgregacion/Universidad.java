package ejerciciosPOOAgregacionyComposicion.ejercicioAgregacion;

public class Universidad {
    private String nombre;
    private Estudiante estudiantes [];
    private int cantidadEstudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        estudiantes = new Estudiante[100];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (cantidadEstudiantes<=100) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        }else
            System.out.println("La cantidad de estudiantes supera el límite de estudiante por universidad");
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public String getNombre(){
        return nombre;
    }
}
