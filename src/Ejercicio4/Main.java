package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Vehiculo carro = new Carro("Renault");
        Vehiculo bicicleta = new Bicicleta("Montañera");

        carro.mover();
        bicicleta.mover();

    }
}