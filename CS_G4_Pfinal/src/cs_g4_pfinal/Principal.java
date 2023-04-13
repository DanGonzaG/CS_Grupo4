package cs_g4_pfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import cs_g4_pfinal.frm_MenuPrincipal;


public class Principal {

    
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<NoPerecederos> listNoP = new ArrayList<>();
//        ArrayList<Perecederos> listP = new ArrayList<>();
        
        Listas l  = new Listas();
        ///////JFRAME MENU /////////
//        frm_MenuPrincipal p = new frm_MenuPrincipal();
        ///////////////////////////
        
        
//        Menu de Pruebas
        int op = 0;
         while (op != 5) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                    + "1. Prueba AgregarMarcas \n"
                    + "2. Prueba MostrarMarcas\n"
                    + "3. Prueba AgregarProductos \n"
                    + "4.Prueba MostrarProductos \n"
                    + "5. Salir\n"
                    +"Digite el dato de la opcion que desea:"));
            switch (op) {
                case 1:
                    l.AgregarListaMarcas(marcas);
                    break;
                case 2:
                    l.MostrarListaMarcas(marcas);
                    break;
                case 3:
                    l.AgregarListaProductos(listaProductos, marcas);
                    break;
                case 4:
                    l.MostrarListaProductos(listaProductos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
            } 
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////         
    }
    
   
    
    
}
