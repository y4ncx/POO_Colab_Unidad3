package Ejercicio3;

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

}

    /*
        // MALA PRACTICA
    @Override
    public double calcularArea() {
        // Hacer exactamente lo mismo que la clase base
        System.out.println("Calculando el área del círculo...");
        return Math.PI * radio * radio;
    }
}

*/
