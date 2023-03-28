package cs_g4_pfinal;

import jdk.jfr.Description;

public class NoPerecederos extends MarcadeProducto {

    private boolean NoPercederos;

    public NoPerecederos() {
    }

    public NoPerecederos(boolean NoPercederos, String NombreMarca, int id, int Cantidad, double Precio, String Nombre) {
        super(NombreMarca, id, Cantidad, Precio, Nombre);
        this.NoPercederos = NoPercederos;
    }

    public boolean isPercederos() {
        return NoPercederos;
    }

    public void setPercederos(boolean Percederos) {
        this.NoPercederos = Percederos;
    }

    public String Descripcion() {
        String DescripcionMensaje="";
        if ( NoPercederos == false) {
            DescripcionMensaje = "Percederos";
        }else{
            DescripcionMensaje = "No Percederos";
        }
        return DescripcionMensaje;
    }

    

    @Override
    public String toString() {
        return super.toString() + Descripcion();
    }
}
