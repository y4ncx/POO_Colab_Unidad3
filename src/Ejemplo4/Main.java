package Ejemplo4;

// Clase de prueba (incorrecta)
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.correr(); // Error de compilación: El método correr() no existe en Animal
    }
}