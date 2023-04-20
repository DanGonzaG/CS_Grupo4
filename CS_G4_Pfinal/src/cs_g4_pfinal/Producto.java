package cs_g4_pfinal;

public class Producto implements InterfaceBodega {
////////////// Atributos de  Producto//////////////////////////////////////////////

    private int id;
    private int Cantidad;
    private double Precio;
    private String Nombre;
    private String nomMarca;

///////////// Constructor Vacio //////////////////////////////////////////////
    public Producto() {
    }

///////////// Constructor Lleno //////////////////////////////////////////////
    public Producto(int id, int Cantidad, double Precio, String Nombre, String nomMarca) {
        this.id = id;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.nomMarca = nomMarca;
    }
/////////////// getters y setters //////////////////////////////////////////////

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNomMarca() {
        return nomMarca;
    }

    public void setNomMarca(String nomMarca) {
        this.nomMarca = nomMarca;
    }
    
    

////////////////// Metodos Abstractos Vacios //////////////////////////////////////////////
    @Override
    public String Descripcion() {
        return Nombre;
    }

   

//////////////// ToString//////////////////////////////////////////////

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Nombre=" + Nombre + ", nomMarca=" + nomMarca + '}';
    }
  
    

}
