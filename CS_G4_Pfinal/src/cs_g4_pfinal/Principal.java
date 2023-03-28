package cs_g4_pfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        
    }
    
    public void ArrayListaMarcas(){
        ArrayList<String> lista = new ArrayList<String>(); // Creamos el ArrayList

        String input = JOptionPane.showInputDialog("Ingrese un string o la palabra'salir' para terminar:");

        // Iteramos hasta que el usuario escriba 'salir'
        while (!input.equalsIgnoreCase("salir")) {
            lista.add(input); // Agregamos el string al ArrayList
            input = JOptionPane.showInputDialog("Ingrese otro string o la palabra 'salir' para terminar:");
        }

        // Creamos un mensaje que muestra el contenido del ArrayList
        String mensaje = "Contenido del ArrayList:\n";
        for (String str : lista) {
            mensaje += str + "\n";
        }

        // Mostramos el contenido del ArrayList en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
