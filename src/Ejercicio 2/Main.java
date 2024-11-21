public class Main {

    public static void main(String[] args) {

        Persona estudiante = new Estudiante("Jesús", "Aguilar", 18, "Ingeniería En Sistemas", "2do");
        Persona profesor = new Profesor("Yances", "Salgado", 23, "Calculo Integral");

        estudiante.presentarse();
        profesor.presentarse();

    }

}
