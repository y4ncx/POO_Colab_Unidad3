package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Persona estudiante = new Estudiante(1, "Jesus", "Aguilar", 18, "Ingenieria en sistemas", "2do");
        Persona profesor = new Profesor(2, "Jassir", "Yances", 23, "Ingenieria de Software");


        estudiante.presentarse();//polimorfismo
        profesor.presentarse();

    }

}