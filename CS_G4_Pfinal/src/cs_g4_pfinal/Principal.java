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
         while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                    + "1. Prueba AgregarMarcas \n"
                    + "2. Prueba MostrarMarcas\n"
                    + "3. Prueba AgregarProductos \n"
                    + "4.Prueba MostrarProductos \n"
                    + "5.Prueba BUSCARID \n"
                    + "6.Prueba BuscarMARCA \n"
                    + "7.Prueba MostrarNOPerecederos \n"
                    + "8. Salir\n"
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
                    int IDbuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite el id que deseas buscas:"));
                    l.BuscarID(listaProductos, IDbuscado);
                    break;
                case 6:
                    l.BuscarMarca(listaProductos, marcas);
                    break;
                case 7:
                    l.MostrarNoPerecederos(listaProductos);
                    break;
                case 8:
                    l.MostrarPerecederos(listaProductos);
                    break;
                case 9:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
            } 
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////         
    }
    
   
    
    
}
