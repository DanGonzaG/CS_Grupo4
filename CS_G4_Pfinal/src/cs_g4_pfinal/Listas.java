package cs_g4_pfinal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Listas {

    public void AgregarListaMarcas(ArrayList<marcas> marcas, String nombre) {
        marcas m = new marcas();
        m.setNombre(nombre);
        marcas.add(m);
    }

    public String MostrarListaMarcasTXA(ArrayList<marcas> marcas) { //creo que este no se ocupa
        String Mensaje = "";
        for (int i = 0; i < marcas.size(); i++) {
            Mensaje = Mensaje + marcas.get(i).getNombre() + "\n";
        }

        return Mensaje;
    }

    //////////SOOLO Pruebas/////////////////////////////////////////
    public void MostrarListaMarcas(ArrayList<marcas> marcas) { //creo que este no se ocupa
        String Mensaje = "";
        for (int i = 0; i < marcas.size(); i++) {
            Mensaje = Mensaje + marcas.get(i).getNombre() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Lista de Marcas: \n" + Mensaje);
    }

    public void AgregarListaProductos(ArrayList<Producto> listaProductos, int id, String nombre, int can, String marca, String categoria, int precio) {
        int Nid = id;
        int NCantidad = can;
        int Nprecio = precio;

        if (categoria.equals("No Perecederos")) {
            NoPerecederos np = new NoPerecederos();
            np.setId(id);
            np.setNombre(nombre);
            np.setCantidad(can);
            np.setNomMarca(marca);
            np.setPrecio(precio);
            listaProductos.add(np);

        } else if (categoria.equals("Perecederos")) {
            Perecederos p = new Perecederos();
            p.setId(id);
            p.setNombre(nombre);
            p.setCantidad(can);
            p.setNomMarca(marca);
            p.setPrecio(precio);
            listaProductos.add(p);

        }
    }

    public String MostrarListaProductosTXTA(ArrayList<Producto> ListaProductos) {//no se ocupa
        String Mensaje = "";
        for (Object f : ListaProductos) {
            Mensaje = Mensaje + f + "\n";
        }
        return Mensaje;
    }

    //////////SOOLO Pruebas/////////////////////////////////////////
    public void MostrarListaProductos(ArrayList<Producto> ListaProductos) {//no se ocupa
        String Mensaje = "";
        for (Object f : ListaProductos) {
            Mensaje = Mensaje + f + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Productos: \n" + Mensaje);
    }

    public String BuscarID(ArrayList ListaProductos, int IDbuscado) {
        Iterator<Producto> itListaProductos = ListaProductos.iterator();
        String Mensaje = "";
        boolean validar = false;
        while (itListaProductos.hasNext() && validar == false) {
            Producto prod = itListaProductos.next();
            if (prod.getId() == IDbuscado) {
                Mensaje = "ID encontrado!\n" + "Producto:\n" + prod.toString();
                validar = true;
            }
        }
        if (validar == false) {
            Mensaje = "Id no encontrado";
        }
        return Mensaje;
    }

    public String BuscarMarca(ArrayList<Producto> ListaProductos, ArrayList<marcas> ListMarcas, String MarcaBuscada) {
        Producto prod = new Producto();
        marcas marc = new marcas();
        String Mensaje = "";
        boolean validar = false;
        Iterator<marcas> itmarca = ListMarcas.iterator();
        Iterator<Producto> itproducto = ListaProductos.iterator();

        while (itmarca.hasNext() && validar == false) {
            marc = itmarca.next();
            if (marc.getNombre().equals(MarcaBuscada)) {
                validar = true;
            }
        }
        if(validar == false){
            Mensaje = "La Marca NO fue encontrada.";
        }else{
            while(itproducto.hasNext()){
                prod = itproducto.next();
                if(prod.getNomMarca().equals(MarcaBuscada)){
                    Mensaje = Mensaje + prod.toString()+"\n";
                }
            }
        }
        return Mensaje;
    }

    public String MostrarNoPerecederos(ArrayList ListaProductos) {
        String ListaNoPerecederos = "";
        Iterator<Producto> itNoPerecederos = ListaProductos.iterator();
        while (itNoPerecederos.hasNext()) {
            Producto NoP = itNoPerecederos.next();
            if (NoP.Descripcion().equals("No Percederos")) {
                ListaNoPerecederos = ListaNoPerecederos + NoP.toString() + "\n";
            }
        }
        return ListaNoPerecederos;
    }

    public String MostrarPerecederos(ArrayList ListaProductos) {
        String ListaPerecederos = "";
        Iterator<Producto> itPerecederos = ListaProductos.iterator();
        while (itPerecederos.hasNext()) {
            Producto NoP = itPerecederos.next();
            if (NoP.Descripcion().equals("Percederos")) {
                ListaPerecederos = ListaPerecederos + NoP.toString() + "\n";
            }
        }
        return ListaPerecederos;
    }

    public void EliminarMarca(ArrayList Marcas, String MarcaBuscada) {
        boolean encontrado = false;

        for (Object f : Marcas) {
            if (f.equals(MarcaBuscada)) {
                encontrado = true;
                Marcas.remove(f);
                JOptionPane.showMessageDialog(null, "Marca ELIMINADA con exito!");
                break;
            }
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Marca No encontrada ");
        }

    }

    public void EliminarProducto(ArrayList ListaProductos, int IDbuscado) {

        Iterator<Producto> itListaProductos = ListaProductos.iterator();
        boolean validar = false;
        while (itListaProductos.hasNext() && validar == false) {
            Producto prod = itListaProductos.next();
            if (prod.getId() == IDbuscado) {
                ListaProductos.remove(prod);
                JOptionPane.showMessageDialog(null, "Producto ELIMINADO con exito!");
                validar = true;
            }
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }

    }

    public void ModificarMarca(ArrayList Marcas) {
        boolean encontrado = false;
        String MarcaBuscada = "";
        String Mensaje = "";
        for (Object f : Marcas) {
            Mensaje = Mensaje + f + "\n";
        }
        MarcaBuscada = JOptionPane.showInputDialog("Lista de Marcas: \n" + Mensaje + "\nDigite la marca de la lista que quiere escoger");

        for (Object f : Marcas) {
            if (f.equals(MarcaBuscada)) {
                encontrado = true;
                Marcas.remove(f);
                String NuevaMarca = JOptionPane.showInputDialog("Ingrese la  nueva marca:");
                Marcas.add(NuevaMarca);
                JOptionPane.showMessageDialog(null, "Marca Editada con exito!");
                break;
            }
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Marca No encontrada ");
        }

    }

    public void ModificarProducto(ArrayList<Producto> listaProductos, int IDBuscado, String nombre, int can, String marca, int precio) {
        Producto prod = new Producto();
        Iterator<Producto> itListaProductos = listaProductos.iterator();
        boolean validar = false;
        while (itListaProductos.hasNext() && validar == false) {
            prod = itListaProductos.next();
            if (prod.getId() == IDBuscado) {
                prod.setNombre(nombre);
                prod.setCantidad(can);
                prod.setPrecio(precio);
                prod.setNomMarca(marca);
                validar = true;
            }
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }
    }

//hilo para modificacion simuntanea
    public void modificarMarca2(String letraVieja, String letraNueva, marcas m, ArrayList<marcas> listaM, Producto p, ArrayList<Producto> listaP) {
        ModThread mod = new ModThread();
        mod.modificarMarca(letraVieja, letraNueva, m, listaM, p, listaP);
        mod.start();

    }
}
