package Ejercicio1;

class Circulo extends Figura {
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribir calcularArea
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}