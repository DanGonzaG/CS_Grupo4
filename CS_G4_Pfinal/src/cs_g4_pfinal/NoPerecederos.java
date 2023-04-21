package cs_g4_pfinal;

import jdk.jfr.Description;

public class NoPerecederos extends Producto {

    private boolean NoPercederos;

    public NoPerecederos() {
    }

    public NoPerecederos(boolean NoPercederos, int id, int Cantidad, double Precio, String Nombre, String nomMarca) {
        super(id, Cantidad, Precio, Nombre, nomMarca);
        this.NoPercederos = NoPercederos;
    }

    public boolean isPercederos() {
        return NoPercederos;
    }

    public void setPercederos(boolean Percederos) {
        this.NoPercederos = Percederos;
    }

    @Override
    public String Descripcion() {
        String DescripcionMensaje="";
        if ( NoPercederos == false) {
            DescripcionMensaje = "Perecederos";
        }else{
            DescripcionMensaje = "No Perecederos";
        }
        return DescripcionMensaje;
    }

    

    @Override
    public String toString() {
        return super.toString() + " | " + Descripcion();
    }
}
