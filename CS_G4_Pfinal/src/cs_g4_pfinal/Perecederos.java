package cs_g4_pfinal;


public class Perecederos extends Producto{
    private boolean Percederos;

    public Perecederos() {
    }
    
    public Perecederos(boolean Percederos,  int id, int Cantidad, double Precio, String Nombre, String nomMarca) {
        super(id, Cantidad, Precio, Nombre, nomMarca);
        this.Percederos = Percederos;
    }

    public boolean isPercederos() {
        return Percederos;
    }

    public void setPercederos(boolean Percederos) {
        this.Percederos = Percederos;
    }
    
    public String Descripcion() {
        String DescripcionMensaje="";
        if ( Percederos == false) {
            DescripcionMensaje = "No Percederos";
        }else{
            DescripcionMensaje = "Percederos";
        }
        return DescripcionMensaje;
    }

   

    @Override
    public String toString() {
        return super.toString() + Descripcion() ;
    }
    
    
}
