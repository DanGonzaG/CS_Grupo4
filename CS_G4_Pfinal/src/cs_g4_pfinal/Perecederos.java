package cs_g4_pfinal;


public class Perecederos extends MarcadeProducto{

    private boolean perecedero;
    
   

    public Perecederos(boolean perecedero, String marca, int id, String name, int cantidad, double Precio) {
        super(marca,id, name, cantidad, Precio);
        this.perecedero = perecedero;
    }

    public boolean isPerecedero() {
        return perecedero;
    }

    public void setPerecedero(boolean perecedero) {
        this.perecedero = perecedero;
    }

}