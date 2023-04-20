/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs_g4_pfinal;

import cs_g4_pfinal.frm_MenuPrincipal;
import cs_g4_pfinal.frm_SubmenuEliminar_Marca;
import cs_g4_pfinal.frm_SubmenuEliminar_Producto;
import java.util.ArrayList;

/**
 *
 * @author PC MASTER
 */
public class frm_MenuEliminar extends javax.swing.JFrame {

    ArrayList<Producto> listaProductos;
    //ArrayList<MarcadeProducto> listaM;
    
    ArrayList<marcas> listaM;

    /**
     * Creates new form frm_MenuEliminar
     */
    public frm_MenuEliminar(ArrayList<Producto> listaProductos, ArrayList<marcas> listaM) {
        this.listaM = listaM;
        this.listaProductos = listaProductos;

        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        Volver_MenuPrincipal = new javax.swing.JButton();
        Eliminar_Producto = new javax.swing.JButton();
        Eliminar_Marca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Desea Eliminar:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Volver_MenuPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        Volver_MenuPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Volver_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        Volver_MenuPrincipal.setText("Volver al menú");
        Volver_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_MenuPrincipalActionPerformed(evt);
            }
        });

        Eliminar_Producto.setBackground(new java.awt.Color(204, 153, 0));
        Eliminar_Producto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Eliminar_Producto.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Producto.setText("Producto");
        Eliminar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ProductoActionPerformed(evt);
            }
        });

        Eliminar_Marca.setBackground(new java.awt.Color(204, 153, 0));
        Eliminar_Marca.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Eliminar_Marca.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Marca.setText("Marca");
        Eliminar_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_MarcaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Eliminar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver_MenuPrincipal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(Eliminar_Producto)
                .addGap(67, 67, 67)
                .addComponent(Eliminar_Marca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volver_MenuPrincipal)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Volver_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        frm_MenuPrincipal prin = new frm_MenuPrincipal(listaProductos,listaM);
        this.setVisible(false);

    }//GEN-LAST:event_Volver_MenuPrincipalActionPerformed

    private void Eliminar_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_MarcaActionPerformed
        // TODO add your handling code here:
        frm_SubmenuEliminar_Marca ElimM = new frm_SubmenuEliminar_Marca(listaProductos,listaM);
        this.setVisible(false);


    }//GEN-LAST:event_Eliminar_MarcaActionPerformed

    private void Eliminar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ProductoActionPerformed
        // TODO add your handling code here:
        frm_SubmenuEliminar_Producto ElimP = new frm_SubmenuEliminar_Producto(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_Eliminar_ProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar_Marca;
    private javax.swing.JButton Eliminar_Producto;
    private javax.swing.JButton Volver_MenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
