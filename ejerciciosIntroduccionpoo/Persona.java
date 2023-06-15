package ejerciciosIntroduccionpoo;

public class Persona {

    private String nombre;
    private int edad;
    private int identificacion;

    public Persona() {
    }

    public Persona(String nombre, int edad, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void mostrarInformacion(){
        System.out.println("Mi nombre es: "+ nombre);
        System.out.println("Mi edad es: "+ edad);
        System.out.println("Mi identificacion es: "+ identificacion);
    }
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
}
