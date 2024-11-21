package Ejercicio2;

class Estudiante extends Persona {

    String carrera;
    String semestre;

    public Estudiante(int id, String nombre, String nombre2, int edad, String carrera, String semestre) {

        super(id, nombre, nombre2, edad);
        this.carrera = carrera;
        this.semestre = semestre;

    }

    @Override
    public void presentarse() {

        System.out.println("Muy buenas, mi nombre es " + getNombre() + getNombre2() + ", tengo " + getEdad() + " años y ando estudiando " + carrera + "de" + semestre + " semestre.");

    }

}
