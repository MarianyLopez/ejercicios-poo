package ejerciciosPOOInterfaces.reproductorMusica;

public class MainReproductorMusica {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        System.out.println("Nombre del Reproductor: "+spotify.getNombreReproductor());
        spotify.reproducirMusica();
        spotify.pausarMusica();
        spotify.detenerReproduccion();

        System.out.println();

        Itunes itunes = new Itunes();
        System.out.println("Nombre del Reproductor: "+itunes.getNombreReproductor());
        itunes.reproducirMusica();
        itunes.pausarMusica();
        itunes.detenerReproduccion();
    }
}
