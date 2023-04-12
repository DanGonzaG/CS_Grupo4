package cs_g4_pfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//////JFRAME Menu//////////////////////////
import cs_g4_pfinal.frm_MenuPrincipal;
///////////////////////////////////////

public class Principal {

    private ArrayList<Producto> datosBasicos = new ArrayList<Producto>();
    private ArrayList<MarcadeProducto> marcas = new ArrayList<MarcadeProducto>();

    public static void main(String[] args) {
        ///////JFRAME MENU /////////
        //frm_MenuPrincipal p = new frm_MenuPrincipal();
        Principal programa = new Principal();
        programa.iniciar();
        ///////////////////////////
    }

    public void iniciar() {
        voidArregloProducto();
        voidArregloMarcas();
        voidMenu();

    }

    //////////////////Prototipo ArrayList Marcas/////////////////////////////////////////////////////////////////////////////////////////////////
    public void voidArregloProducto() {
        // Solicitar al usuario que ingrese los datos de cada producto
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));

        for (int i = 0; i < cantidadProductos; i++) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto:"));
            String name = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));

            // Agregamos los datos básicos al ArrayList correspondiente
            datosBasicos.add(new Producto(id, name, cantidad, precio));
        }
    }

    public void voidArregloMarcas() {
        // Solicitar al usuario que ingrese los datos de la marca de cada producto
        for (int i = 0; i < datosBasicos.size(); i++) {
            Producto producto = datosBasicos.get(i);
            int id = producto.getId();
            String name = producto.getName();
            int cantidad = producto.getCantidad();
            double precio = producto.getPrecio();

            String marca = JOptionPane.showInputDialog("Ingrese la marca del producto " + name + ":");
            boolean esPerecedero = JOptionPane.showInputDialog("El producto " + name + " es perecedero? (y/n):")
                    .equalsIgnoreCase("y");

            // Agregamos la marca al ArrayList correspondiente
            if (esPerecedero) {
                marcas.add(new Perecederos(true, marca, id, name, cantidad, precio));
            } else {
                marcas.add(new NoPerecederos(false, marca, id, name, cantidad, precio));
            }
        }
    }

    public void voidMenu() {
        String[] opciones = {"Ver productos no perecederos", "Ver productos perecederos", "Ver todos los productos", "Salir"};
        int opcionSeleccionada;
        String mensaje;

        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            mensaje = "";

            switch (opcionSeleccionada) {
                case 0:
                    // código para mostrar productos no perecederos
                    for (int i = 0; i < marcas.size(); i++) {
                        MarcadeProducto marcatemp = marcas.get(i);
                        if (marcatemp instanceof NoPerecederos) {
                            Producto db = datosBasicos.get(i);
                            mensaje += "ID: " + db.getId() + "\n";
                            mensaje += "Nombre: " + db.getName() + "\n";
                            mensaje += "Cantidad: " + db.getCantidad() + "\n";
                            mensaje += "Precio: " + db.getPrecio() + "\n";
                            mensaje += "Marca: " + marcatemp.getMarca() + "\n";
                            mensaje += "\n";
                        }
                    }
                    break;

                case 1:
                    // código para mostrar productos perecederos
                    for (int i = 0; i < marcas.size(); i++) {
                        MarcadeProducto marcatemp = marcas.get(i);
                        if (marcatemp instanceof Perecederos) {
                            Producto db = datosBasicos.get(i);
                            mensaje += "ID: " + db.getId() + "\n";
                            mensaje += "Nombre: " + db.getName() + "\n";
                            mensaje += "Cantidad: " + db.getCantidad() + "\n";
                            mensaje += "Precio: " + db.getPrecio() + "\n";
                            mensaje += "Marca: " + marcatemp.getMarca() + "\n";
                            mensaje += "\n";
                        }
                    }
                    break;
                case 2:
                    // código para mostrar todos los productos
                    for (int i = 0; i < datosBasicos.size(); i++) {
                        Producto db = datosBasicos.get(i);
                        MarcadeProducto marcatemp = marcas.get(i);

                        mensaje += "ID: " + db.getId() + "\n";
                        mensaje += "Nombre: " + db.getName() + "\n";
                        mensaje += "Cantidad: " + db.getCantidad() + "\n";
                        mensaje += "Precio: " + db.getPrecio() + "\n";
                        mensaje += "Marca: " + marcatemp.getMarca() + "\n";
                        if (marcatemp instanceof Perecederos) {
                            mensaje += "Es perecedero\n";
                        } else {
                            mensaje += "No es perecedero\n";
                        }
                        mensaje += "\n";
                    }
                    break;

                case 3:
                // salir del programa

                default:

                    break;
            }

            JOptionPane.showMessageDialog(null, mensaje);
        } while (opcionSeleccionada
                != 3);
        // Mostrar el resultado en una ventana de diálogo

    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

