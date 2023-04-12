package cs_g4_pfinal;

import jdk.jfr.Description;

public class NoPerecederos extends MarcadeProducto {

    private boolean noperecedero;

    public NoPerecederos(boolean noperecedero, String marca, int id, String name, int cantidad, double Precio) {
        super(marca, id, name, cantidad, Precio);
        this.noperecedero = noperecedero;
    }

    public boolean isNoperecedero() {
        return noperecedero;
    }

    public void setNoperecedero(boolean noperecedero) {
        this.noperecedero = noperecedero;
    }

}
