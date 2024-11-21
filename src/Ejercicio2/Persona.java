package Ejercicio2;

class Persona {
    
    int id;
    String nombre;
    String nombre2;
    int edad;

    
    public Persona(int id, String nombre, String nombre2, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.edad = edad;

    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " " + nombre2 + " y tengo " + edad + " años.");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public int getEdad() {
        return edad;
    }

}
