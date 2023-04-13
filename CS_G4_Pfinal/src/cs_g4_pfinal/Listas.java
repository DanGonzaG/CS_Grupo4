package cs_g4_pfinal;

import java.util.ArrayList;
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

    public void AgregarListaProductos(ArrayList listaNoP, ArrayList marcas) {
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

                    listaNoP.add(new NoPerecederos(true, Marca, id, Cantidad, Precio, Nombre));
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

                    listaNoP.add(new Perecederos(true, Marca, id, Cantidad, Precio, Nombre));
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
            }
        }
    }
    public void MostrarListaProductos(ArrayList listaNoP) {
        String Mensaje = "";
        for (Object f : listaNoP) {
            Mensaje = Mensaje + f + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Productos: \n" + Mensaje);
    }
}
