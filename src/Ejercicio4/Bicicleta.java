package Ejercicio4;

class Bicicleta extends Vehiculo {
    
    private String tipo;
    
    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public void mover() {

        System.out.println("La bicicleta" + tipo  + " está siendo pedaleada.");

    }

}
