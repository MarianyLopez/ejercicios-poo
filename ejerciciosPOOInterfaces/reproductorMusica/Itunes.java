package ejerciciosPOOInterfaces.reproductorMusica;

public class Itunes implements ReproductorMusica{
    private String nombreReproductor;

    public Itunes() {
        nombreReproductor = "iTunes";
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Música en reproducción");
    }

    @Override
    public void pausarMusica() {
        System.out.println("La música ha sido pausada");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Reproducción de música detenida");
    }

    public String getNombreReproductor() {
        return nombreReproductor;
    }
}
