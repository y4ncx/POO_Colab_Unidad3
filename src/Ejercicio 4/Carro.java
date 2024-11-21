class Carro extends Vehiculo {
    
    String marca;
    
    public Carro(String marca) {
    
        this.marca = marca;
    
    }

    @Override
    public void mover() {
    
        System.out.println("El carro " + marca + " se está moviendo por la carretera.");
    
    }

}
