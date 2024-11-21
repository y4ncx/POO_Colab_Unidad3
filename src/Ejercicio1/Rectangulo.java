package Ejercicio1;

class Rectangulo extends Figura {
    private double ancho;
    private double alto;


    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Sobrescribir calcularArea
    @Override
    public void calcularArea() {
        double area = ancho * alto;
        System.out.println("El área del rectángulo es: " + area);
    }
}