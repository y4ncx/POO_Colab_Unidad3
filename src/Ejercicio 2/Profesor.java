class Profesor extends Persona {

    private String asignatura;

    public Profesor(int id, String nombre, String nombre2, int edad, String asignatura) {
        super(id, nombre, nombre2, edad);
        this.asignatura = asignatura;
    }

    
    @Override
    public void presentarse() {
        System.out.println("Muy buenas, mi nombre es " + getNombre() + getNombre2() ", tengo " + getEdad() + " años y soy el profesor de " + asignatura + ".");
    }

}