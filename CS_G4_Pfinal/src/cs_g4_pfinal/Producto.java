package cs_g4_pfinal;

public class Producto implements InterfaceBodega {
////////////// Atributos de  Producto//////////////////////////////////////////////

    private int id;
    private String name;
    private int cantidad;
    private double Precio;

///////////// Constructor Vacio //////////////////////////////////////////////
    public Producto() {
    }

///////////// Constructor Lleno //////////////////////////////////////////////
    public Producto(int id, String name, int cantidad, double Precio) {
        this.id = id;
        this.name = name;
        this.cantidad = cantidad;
        this.Precio = Precio;
    }
/////////////// getters y setters //////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }



////////////////// Metodos Abstractos Vacios //////////////////////////////////////////////
    public String Descripcion() {
        return name;
    }

   

//////////////// ToString//////////////////////////////////////////////
    

}

