package cs_g4_pfinal;

public class MarcadeProducto extends Producto {

    private String marca;

    public MarcadeProducto(String marca, int id, String name, int cantidad, double Precio) {
        super(id, name, cantidad, Precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

