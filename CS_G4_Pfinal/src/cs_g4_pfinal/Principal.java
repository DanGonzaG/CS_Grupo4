package cs_g4_pfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import cs_g4_pfinal.frm_MenuPrincipal;


public class Principal extends Thread{
 

    
    public static void main(String[] args) {
       
        
    
        
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList <MarcadeProducto> listaM = new ArrayList<>();
        
        ArrayList<marcas> listaMarcas = new ArrayList<>();
//        

       
        ///////JFRAME MENU /////////
        frm_MenuPrincipal p = new frm_MenuPrincipal(listaProductos, listaMarcas);
        
        
        
      
///////////////////////////
        
        Listas l = new Listas();
        //Menu de Pruebas
       /* int op = 0;
         while (op != 13) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                    + "1. Prueba AgregarMarcas \n"
                    + "2. Prueba MostrarMarcas\n"
                    + "3. Prueba AgregarProductos \n"
                    + "4.Prueba MostrarProductos \n"
                    + "5.Prueba BUSCARID \n"
                    + "6.Prueba BuscarMARCA \n"
                    + "7.Prueba MostrarNOPerecederos \n"
                    + "8.Prueba MostrarPerecederos \n"
                    + "9.Prueba EliminarMarca \n"
                    + "10.Prueba EditarMarca \n"
                    + "11.Prueba EliminarProducto\n"
                    + "12.Prueba EditarProducto \n"
                    + "13. Salir\n"
                    +"Digite el dato de la opcion que desea:"));
            switch (op) {
                case 1:
                    //l.AgregarListaMarcas(listaMarcas);
                    break;
                case 2:
                    l.MostrarListaMarcas(listaMarcas);
                    break;
                case 3:
                    //l.AgregarListaProductos(listaProductos, marcas);
                    break;
                case 4:
                    l.MostrarListaProductos(listaProductos);
                    break;
                case 5:
                    int IDbuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite el id que deseas buscar:"));
                    l.BuscarID(listaProductos, IDbuscado);
                    break;
                case 6:
                    //l.BuscarMarca(listaProductos, marcas);
                    break;
                case 7:
                    l.MostrarNoPerecederos(listaProductos);
                    break;
                case 8:
                   l.MostrarPerecederos(listaProductos);
                    break;
                case 9:
                    String MarcaBuscada = JOptionPane.showInputDialog("Ingrese la marca que desea Eliminar:");
                    //l.EliminarMarca(marcas, MarcaBuscada);
                    break;
                case 10:
                    //l.ModificarMarca(marcas);
                    break;
                case 11:
                    IDbuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del producto que deseas Eliminar:"));
                    l.EliminarProducto(listaProductos, IDbuscado);
                    break;
                case 12:
                    IDbuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del producto que deseas Eliminar:"));
                    //l.ModificarProducto(listaProductos, IDbuscado, marcas);
                    break;
                case 13:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
            } 
        }*/
////////////////////////////////////////////////////////////////////////////////////////////////////////         
    }
    

    
    
}
