package ejerciciosPOOInterfaces.tiendaLibros;

public class MainTiendaLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",50000);
        libro1.mostrarInformacion();
        System.out.println("El precio del libro es: " +libro1.obtenerPrecio());

        Libro libro2 = new Libro("Ensayo sobre la ceguera","Jose Saramago",20000);
        libro2.mostrarInformacion();
        System.out.println("El precio del libro es: " +libro2.obtenerPrecio());
    }
}
