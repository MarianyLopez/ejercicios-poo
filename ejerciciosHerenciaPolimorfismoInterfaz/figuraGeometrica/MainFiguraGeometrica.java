package ejerciciosHerenciaPolimorfismoInterfaz.figuraGeometrica;

public class MainFiguraGeometrica {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4,4);
        System.out.println("CUADRADO:");
        System.out.println("Área: "+cuadrado.calcularArea());
        System.out.println("Perímetro: "+cuadrado.calcularPerimetro());
        System.out.println("Número de lados: "+cuadrado.calcularNumeroLados()+"\n");

        Triangulo triangulo = new Triangulo(5,6);
        System.out.println("TRIÁNGULO:");
        System.out.println("Área: "+triangulo.calcularArea());
        System.out.println("Perímetro: "+triangulo.calcularPerimetro());
        System.out.println("Número de lados: "+triangulo.calcularNumeroLados()+"\n");

        Circulo circulo = new Circulo(6);
        System.out.println("CÍRCULO:");
        System.out.println("Área: "+circulo.calcularArea());
        System.out.println("Perímetro: "+circulo.calcularPerimetro());
        System.out.println("El círculo no tiene lados");
    }
}
