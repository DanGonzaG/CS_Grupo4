/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs_g4_pfinal;

import cs_g4_pfinal.frm_MenuPrincipal;
import cs_g4_pfinal.frm_SubmenuModificar_Marca;
import cs_g4_pfinal.frm_SubmenuModificar_Producto;
import java.util.ArrayList;

/**
 *
 * @author PC MASTER
 */
public class frm_MenuModificar extends javax.swing.JFrame {

    ArrayList<Producto> listaProductos;
    //ArrayList<MarcadeProducto> listaM;
    
    ArrayList<marcas> listaM;

    /**
     * Creates new form frm_MenuModificar
     */
    public frm_MenuModificar(ArrayList<Producto> listaProductos, ArrayList<marcas> listaM) {
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
        Modificar_Marcas = new javax.swing.JButton();
        Modificar_Productos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Desea Modificar:");
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

        Modificar_Marcas.setBackground(new java.awt.Color(204, 153, 0));
        Modificar_Marcas.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Modificar_Marcas.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_Marcas.setText("Marca");
        Modificar_Marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_MarcasActionPerformed(evt);
            }
        });

        Modificar_Productos.setBackground(new java.awt.Color(204, 153, 0));
        Modificar_Productos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Modificar_Productos.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_Productos.setText("Producto");
        Modificar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ProductosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modificar_Marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Volver_MenuPrincipal)))
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(Modificar_Marcas)
                        .addGap(67, 67, 67)
                        .addComponent(Modificar_Productos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 472, Short.MAX_VALUE)
                        .addComponent(Volver_MenuPrincipal)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void Volver_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        frm_MenuPrincipal prin = new frm_MenuPrincipal(listaProductos,listaM);
        this.setVisible(false);

    }//GEN-LAST:event_Volver_MenuPrincipalActionPerformed

    private void Modificar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ProductosActionPerformed
        // TODO add your handling code here:
        frm_SubmenuModificar_Producto ModP = new frm_SubmenuModificar_Producto(listaProductos,listaM);
        this.setVisible(false);

    }//GEN-LAST:event_Modificar_ProductosActionPerformed

    private void Modificar_MarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_MarcasActionPerformed
        // TODO add your handling code here:.
        frm_SubmenuModificar_Marca ModM = new frm_SubmenuModificar_Marca(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_Modificar_MarcasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar_Marcas;
    private javax.swing.JButton Modificar_Productos;
    private javax.swing.JButton Volver_MenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
