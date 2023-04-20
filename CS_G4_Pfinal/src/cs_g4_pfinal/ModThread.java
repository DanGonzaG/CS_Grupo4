/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_g4_pfinal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.management.loading.MLet;

/**
 *
 * @author DanGG
 */
public class ModThread extends Thread {

    private String mAnterior, mNueva;

   
    Producto p = new Producto();     
    marcas marcas = new marcas();
    
    ArrayList<marcas> lm = new ArrayList<marcas>();  
    ArrayList<Producto> listaProducto = new ArrayList<>();

    @Override
    public void run() {
        Iterator<marcas> it = lm.iterator();
        while (it.hasNext()){
            marcas = it.next();
            if (mAnterior.equals(marcas.getNombre())){
                marcas.setNombre(mNueva);
            }
        }
        
        Iterator<Producto> it2 = listaProducto.iterator();
        while (it2.hasNext()) {
            try {
                p = it2.next();
            } catch (Exception e) {
                System.out.println("error en casteo 2");
            }
            if (mAnterior.equals(p.getNomMarca())) {
                p.setNomMarca(mNueva);
            }
        }
    }

    public void modificarMarca(String letraVieja, String letraNueva, marcas m, ArrayList<marcas> listaM, Producto p, ArrayList<Producto> listaP) {
        this.mNueva = letraNueva;
        this.mAnterior = letraVieja;
        this.marcas = m;
        this.lm = listaM;
        this.p = p;
        this.listaProducto = listaP;

    }
}
