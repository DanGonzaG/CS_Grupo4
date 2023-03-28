package cs_g4_pfinal;

public class MarcadeProducto extends Producto {

    private String NombreMarca;

    public MarcadeProducto() {
    }

    public MarcadeProducto(String NombreMarca, int id, int Cantidad, double Precio, String Nombre) {
        super(id, Cantidad, Precio, Nombre);
        this.NombreMarca = NombreMarca;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String NombreMarca) {
        this.NombreMarca = NombreMarca;
    }

    public String Descripcion() {
        return NombreMarca;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "MarcadeProducto" + "NombreMarca=" + NombreMarca ;
    }
    
    
}
