/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs_g4_pfinal;

import cs_g4_pfinal.frm_MenuPrincipal;
import java.util.ArrayList;

/**
 *
 * @author PC MASTER
 */
public class frm_MenuMostrar extends javax.swing.JFrame {

    ArrayList<Producto> listaProductos;
    //ArrayList<MarcadeProducto> listaM;
    
    ArrayList<marcas> listaM;

    /**
     * Creates new form frm_MenuMostrar
     */
    public frm_MenuMostrar(ArrayList<Producto> listaProductos, ArrayList<marcas> listaM) {
        this.listaM = listaM;
        this.listaProductos = listaProductos;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Listas l = new Listas();
        txta_MostrarInv.setText(l.MostrarListaProductosTXTA(listaProductos));
        txta_MostrarMarc.setText(l.MostrarListaMarcasTXA(listaM));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnVolver_MenuPrincipal = new javax.swing.JButton();
        btnMostrar_Inventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrar_Marcas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txta_MostrarMarc = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txta_MostrarInv = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Desea Mostrar:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnVolver_MenuPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver_MenuPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVolver_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver_MenuPrincipal.setText("Volver al menú");
        btnVolver_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver_MenuPrincipalActionPerformed(evt);
            }
        });

        btnMostrar_Inventario.setBackground(new java.awt.Color(204, 153, 0));
        btnMostrar_Inventario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnMostrar_Inventario.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar_Inventario.setText("Mostrar Inventario");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6.png"))); // NOI18N

        btnMostrar_Marcas.setBackground(new java.awt.Color(204, 153, 0));
        btnMostrar_Marcas.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnMostrar_Marcas.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar_Marcas.setText("Mostrar Marcas");

        txta_MostrarMarc.setEditable(false);
        jScrollPane4.setViewportView(txta_MostrarMarc);

        txta_MostrarInv.setEditable(false);
        jScrollPane5.setViewportView(txta_MostrarInv);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrar_Marcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar_Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVolver_MenuPrincipal)
                                .addGap(316, 316, 316))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar_Inventario)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar_Marcas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver_MenuPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnVolver_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        frm_MenuPrincipal prin = new frm_MenuPrincipal(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver_MenuPrincipalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar_Inventario;
    private javax.swing.JButton btnMostrar_Marcas;
    private javax.swing.JButton btnVolver_MenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane txta_MostrarInv;
    private javax.swing.JTextPane txta_MostrarMarc;
    // End of variables declaration//GEN-END:variables
}
