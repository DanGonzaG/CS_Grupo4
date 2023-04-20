package cs_g4_pfinal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Listas {

    public void AgregarListaMarcas(ArrayList marcas, String nombre) {        
        marcas.add(nombre);
    }

    public void MostrarListaMarcas(ArrayList marcas) { //creo que este no se ocupa
        String Mensaje = "";
        for (Object f : marcas) {
            Mensaje = Mensaje + f + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Marcas: \n" + Mensaje);
    }

    public void AgregarListaProductos(ArrayList listaProductos, int id, String nombre, int can, String marca, String categoria) {
        if (categoria.equals("No Perecederos")){
            NoPerecederos np = new NoPerecederos();
            np.setId(id);
            np.setNombre(nombre);
            np.setCantidad(can);
            np.setNombreMarca(nombre);
            listaProductos.add(np);
            
            
        } else if (categoria.equals("Perecederos")){
            Perecederos p = new Perecederos();
            p.setId(id);
            p.setNombre(nombre);
            p.setCantidad(can);
            p.setNombreMarca(marca);
            listaProductos.add(p);
        }
    }

    public void MostrarListaProductos(ArrayList ListaProductos) {//no se ocupa
        String Mensaje = "";
        for (Object f : ListaProductos) {
            Mensaje = Mensaje + f + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Productos: \n" + Mensaje);
    }

    public void BuscarID(ArrayList ListaProductos, int IDbuscado) {
        Iterator<Producto> itListaProductos = ListaProductos.iterator();
        boolean validar = false;
        while (itListaProductos.hasNext() && validar == false) {
            Producto prod = itListaProductos.next();
            if (prod.getId() == IDbuscado) {
                JOptionPane.showMessageDialog(null, "ID encontrado \n Producto:\n  " + prod.toString());
                validar = true;
            }
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }

    }

    public void BuscarMarca(ArrayList ListaProductos, ArrayList Marcas) {
        String Mensaje = "";
        for (Object f : Marcas) {
            Mensaje = Mensaje + f + "\n";
        }
        String MarcaBuscada = JOptionPane.showInputDialog("Lista de Marcas: \n" + Mensaje + "\nDigite la marca de la lista que quiere buscar:");
        Iterator<MarcadeProducto> itListaProductos = ListaProductos.iterator();
        boolean validar = false;

        while (itListaProductos.hasNext() && validar == false) {
            MarcadeProducto productos = itListaProductos.next();
            if (productos.getNombreMarca().equals(MarcaBuscada)) {
                JOptionPane.showMessageDialog(null, "La Marca Coincide:");
                validar = true;
            }
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Marca no encontrada, intetelo de nuevo");
        } else {
            String ListaProdMarcas = "";
            Iterator<MarcadeProducto> itListaMarcas = ListaProductos.iterator();
            while (itListaMarcas.hasNext()) {
                MarcadeProducto prod = itListaMarcas.next();
                if (prod.getNombreMarca().equals(MarcaBuscada)) {
                    ListaProdMarcas = ListaProdMarcas + prod.toString() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, "Lista  de Productos Filtrada por Marca " + MarcaBuscada + "\n" + ListaProdMarcas);
        }
    }

    public void MostrarNoPerecederos(ArrayList ListaProductos) {
        String ListaNoPerecederos = "";
        Iterator<Producto> itNoPerecederos = ListaProductos.iterator();
        while (itNoPerecederos.hasNext()) {
            Producto NoP = itNoPerecederos.next();
            if (NoP.Descripcion().equals("No Percederos")) {
                ListaNoPerecederos = ListaNoPerecederos + NoP.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista  de Productos Filtrada por No Perecederos" + "\n" + ListaNoPerecederos);
    }

    public void MostrarPerecederos(ArrayList ListaProductos) {
        String ListaPerecederos = "";
        Iterator<Producto> itPerecederos = ListaProductos.iterator();
        while (itPerecederos.hasNext()) {
            Producto NoP = itPerecederos.next();
            if (NoP.Descripcion().equals("Percederos")) {
                ListaPerecederos = ListaPerecederos + NoP.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista  de Productos Filtrada por Perecederos" + "\n" + ListaPerecederos);
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
                String NuevaMarca= JOptionPane.showInputDialog("Ingrese la  nueva marca:");
                Marcas.add(NuevaMarca);
                JOptionPane.showMessageDialog(null, "Marca Editada con exito!");
                break;
            }
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Marca No encontrada ");
        }

    }

    public void ModificarProducto(ArrayList ListaProductos, int IDbuscado, ArrayList marcas) {
        Iterator<Producto> itListaProductos = ListaProductos.iterator();
        boolean validar = false;
        while (itListaProductos.hasNext() && validar == false) {
            Producto prod = itListaProductos.next();
            if (prod.getId() == IDbuscado) {
                ListaProductos.remove(prod);

                String Nombre = JOptionPane.showInputDialog(null, "Digite el nuevo nombre del producto:");
                int Precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el  nuevo precio del producto:"));
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo id del producto:"));
                int Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nueva cantidad del producto:"));
                String Mensaje = "";
                for (Object f : marcas) {
                    Mensaje = Mensaje + f + "\n";
                }

                validar = true;
                String Marca = JOptionPane.showInputDialog("Lista de Marcas: \n" + Mensaje + "\nDigite la marca de la lista que quiere escoger");
                int Categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "El producto es?\n"
                        + "1. No Perecederos \n"
                        + "2. Perecederos\n"
                        + "3. Cancelar\n"
                        + "Digite el dato de la opcion que desea:"));
                if (Categoria == 1) {
                    ListaProductos.add(new NoPerecederos(true, Marca, id, Cantidad, Precio, Nombre));
                    JOptionPane.showMessageDialog(null, "Producto Editado con exito!");
                } else if (Categoria == 2) {
                    ListaProductos.add(new Perecederos(true, Marca, id, Cantidad, Precio, Nombre));
                    JOptionPane.showMessageDialog(null, "Producto Editado con exito!");
                } else if (Categoria == 3) {
                    break;
                }

                if (validar == false) {
                    JOptionPane.showMessageDialog(null, "Id no encontrado");
                }
            }
        }
    }
}
