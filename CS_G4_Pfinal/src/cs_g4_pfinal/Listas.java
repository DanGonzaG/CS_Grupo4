package cs_g4_pfinal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Listas {

    public void AgregarListaMarcas(ArrayList marcas) {
        String Nmarca = JOptionPane.showInputDialog("Digite el nombre de la marca que desea agregar:");
        marcas.add(Nmarca);
    }

    public void MostrarListaMarcas(ArrayList marcas) {
        String Mensaje = "";
        for (Object f : marcas) {
            Mensaje = Mensaje + f + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Marcas: \n" + Mensaje);
    }

    public void AgregarListaProductos(ArrayList listaProductos, ArrayList marcas) {
        int op = 0;
        while (op != 3) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "El producto es?\n"
                    + "1. No Perecederos \n"
                    + "2. Perecederos\n"
                    + "3. Cancelar\n"
                    + "Digite el dato de la opcion que desea:"));
            switch (op) {
                case 1:
                    String Nombre = JOptionPane.showInputDialog(null, "Digite el nombre del producto:");
                    int Precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del producto:"));
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el id del producto:"));
                    int Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del producto:"));

                    String Mensaje = "";
                    for (Object f : marcas) {
                        Mensaje = Mensaje + f + "\n";
                    }
                    String Marca = JOptionPane.showInputDialog("Lista de Marcas: \n" + Mensaje + "\nDigite la marca de la lista que quiere escoger");

                    listaProductos.add(new NoPerecederos(true, Marca, id, Cantidad, Precio, Nombre));
                    break;
                case 2:
                    Nombre = JOptionPane.showInputDialog(null, "Digite el nombre del producto:");
                    Precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del producto:"));
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el id del producto:"));
                    Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del producto:"));

                    Mensaje = "";
                    for (Object f : marcas) {
                        Mensaje = Mensaje + f + "\n";
                    }
                    Marca = JOptionPane.showInputDialog("Lista de Marcas: \n" + Mensaje + "\nDigite la marca de la lista que quiere escoger");

                    listaProductos.add(new Perecederos(true, Marca, id, Cantidad, Precio, Nombre));
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
            }
        }
    }

    public void MostrarListaProductos(ArrayList ListaProductos) {
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
        while(itNoPerecederos.hasNext()){
            Producto NoP = itNoPerecederos.next();
            if(NoP.Descripcion().equals("No Percederos")){
                 ListaNoPerecederos = ListaNoPerecederos + NoP.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista  de Productos Filtrada por No Perecederos"+"\n" + ListaNoPerecederos);
    }
    
    public void MostrarPerecederos(ArrayList ListaProductos) {
        String ListaPerecederos = "";
        Iterator<Producto> itPerecederos = ListaProductos.iterator();
        while(itPerecederos.hasNext()){
            Producto NoP = itPerecederos.next();
            if(NoP.Descripcion().equals("Percederos")){
                 ListaPerecederos = ListaPerecederos + NoP.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista  de Productos Filtrada por Perecederos"+"\n" + ListaPerecederos);
    }
}
