package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Rectangulo(5, 3);

        // Esto funciona porque el metodo está definido en Figura.
        System.out.println("Área: " + figura.calcularArea());

        // Esto da un error de compilación porque calcularPerimetro no está en Figura.
       // System.out.println("Perímetro: " + figura.calcularPerimetro());


    }
}