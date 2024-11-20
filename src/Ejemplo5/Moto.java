package Ejemplo5;

// Clase derivada
public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover(); // Uso innecesario si no se modifica el comportamiento
    }
}