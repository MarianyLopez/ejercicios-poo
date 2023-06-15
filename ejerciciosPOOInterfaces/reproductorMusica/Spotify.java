package ejerciciosPOOInterfaces.reproductorMusica;

public class Spotify implements ReproductorMusica{
    private String nombreReproductor;

    public Spotify() {
        nombreReproductor = "Spotify";
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
