package Ejercicio1;

// Clase de prueba
public class PruebaFiguras {
    public static void main(String[] args) {

        Figura circulo = new Circulo(5.0); // Radio = 5.0
        Figura rectangulo = new Rectangulo(4.0, 6.0); // Ancho = 4.0, Alto = 6.0

        // Usar polimorfismo para calcular el área
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}