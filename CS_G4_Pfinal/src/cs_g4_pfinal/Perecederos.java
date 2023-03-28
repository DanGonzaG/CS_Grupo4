package cs_g4_pfinal;


public class Perecederos extends MarcadeProducto{
    private boolean Percederos;

    public Perecederos() {
    }
    
    public Perecederos(boolean Percederos, String NombreMarca, int id, int Cantidad, double Precio, String Nombre) {
        super(NombreMarca, id, Cantidad, Precio, Nombre);
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
