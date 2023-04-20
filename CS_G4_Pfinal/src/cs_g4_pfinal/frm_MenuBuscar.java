package cs_g4_pfinal;

import java.util.ArrayList;

public class frm_MenuBuscar extends javax.swing.JFrame {

    ArrayList<Producto> listaProductos;
    //ArrayList<MarcadeProducto> listaM;
    ArrayList<marcas> listaM;

    public frm_MenuBuscar(ArrayList<Producto> listaProductos, ArrayList<marcas> listaM) {
        this.listaM = listaM;
        this.listaProductos = listaProductos;
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        Volver_MenuPrincipal = new javax.swing.JButton();
        Buscar_Marca = new javax.swing.JButton();
        Buscar_Categoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Buscar_IdProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Desea Buscar:");
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

        Buscar_Marca.setBackground(new java.awt.Color(204, 153, 0));
        Buscar_Marca.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Buscar_Marca.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Marca.setText("Marca");
        Buscar_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_MarcaActionPerformed(evt);
            }
        });

        Buscar_Categoria.setBackground(new java.awt.Color(204, 153, 0));
        Buscar_Categoria.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Buscar_Categoria.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Categoria.setText("Categoría");
        Buscar_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_CategoriaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N

        Buscar_IdProducto.setBackground(new java.awt.Color(204, 153, 0));
        Buscar_IdProducto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Buscar_IdProducto.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_IdProducto.setText("ID Producto");
        Buscar_IdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_IdProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver_MenuPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buscar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar_IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(Buscar_IdProducto)
                        .addGap(30, 30, 30)
                        .addComponent(Buscar_Categoria)
                        .addGap(34, 34, 34)
                        .addComponent(Buscar_Marca)
                        .addGap(110, 110, 110)
                        .addComponent(Volver_MenuPrincipal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        frm_MenuPrincipal pri = new frm_MenuPrincipal(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_Volver_MenuPrincipalActionPerformed

    private void Buscar_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_CategoriaActionPerformed
        // TODO add your handling code here:
        frm_SubmenuBuscar_Categoria BusC = new frm_SubmenuBuscar_Categoria(listaProductos,listaM);
        this.setVisible(false);

    }//GEN-LAST:event_Buscar_CategoriaActionPerformed

    private void Buscar_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_MarcaActionPerformed
        // TODO add your handling code here:
        frm_SubmenuBuscar_Marca BusM = new frm_SubmenuBuscar_Marca(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_Buscar_MarcaActionPerformed

    private void Buscar_IdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_IdProductoActionPerformed
        // TODO add your handling code here:
        frm_SubmenuBuscar_IdProducto BusIdP = new frm_SubmenuBuscar_IdProducto(listaProductos,listaM);
        this.setVisible(false);
    }//GEN-LAST:event_Buscar_IdProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_Categoria;
    private javax.swing.JButton Buscar_IdProducto;
    private javax.swing.JButton Buscar_Marca;
    private javax.swing.JButton Volver_MenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
