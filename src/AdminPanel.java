
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class AdminPanel extends javax.swing.JFrame {

    static boolean signInStatus = false;
    static String logger;
    public AdminPanel() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Agregar1 = new javax.swing.JMenuItem();
        Actualizar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Products = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jPopupMenu2.setAlignmentX(1.0F);
        jPopupMenu2.setAlignmentY(1.0F);
        jPopupMenu2.setDoubleBuffered(true);
        jPopupMenu2.setLabel("");

        Agregar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agg.png"))); // NOI18N
        Agregar1.setText("Agregar");
        Agregar1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jPopupMenu2.add(Agregar1);

        Actualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Xd.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jPopupMenu2.add(Actualizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(1, 110, 145));
        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 72));

        jLabel1.setBackground(new java.awt.Color(1, 110, 145));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Miscelanea Palacios");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(720, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Miscelanea.png"))); // NOI18N

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 110, 1250, 550));

        jPanel4.setBackground(new java.awt.Color(0, 150, 136));

        Products.setBackground(new java.awt.Color(0, 150, 136));
        Products.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prod.png"))); // NOI18N
        Products.setText("Productos");
        Products.setToolTipText("Panel de productos");
        Products.setBorder(null);
        Products.setBorderPainted(false);
        Products.setContentAreaFilled(false);
        Products.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products.setOpaque(true);
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProductsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ProductsMouseReleased(evt);
            }
        });
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });

        Usuarios.setBackground(new java.awt.Color(0, 150, 136));
        Usuarios.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pngwing.com (1).png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.setToolTipText("Panel de Usuarios");
        Usuarios.setBorder(null);
        Usuarios.setBorderPainted(false);
        Usuarios.setContentAreaFilled(false);
        Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Usuarios.setOpaque(true);
        Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuariosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UsuariosMouseReleased(evt);
            }
        });
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        Ventas.setBackground(new java.awt.Color(0, 150, 136));
        Ventas.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sell.png"))); // NOI18N
        Ventas.setText("Ventas");
        Ventas.setToolTipText("Panel de Ventas");
        Ventas.setBorder(null);
        Ventas.setBorderPainted(false);
        Ventas.setContentAreaFilled(false);
        Ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ventas.setOpaque(true);
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VentasMouseReleased(evt);
            }
        });
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 150, 136));
        back.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/out.png"))); // NOI18N
        back.setText("Cerrar Sesión");
        back.setToolTipText("Cerrar Sesión");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backMouseReleased(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(668, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1250, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsMouseClicked

    private void ProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseEntered
        // TODO add your handling code here:;
        Products.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_ProductsMouseEntered

    private void ProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseExited
        // TODO add your handling code here:
        Products.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_ProductsMouseExited

    private void ProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMousePressed
        // TODO add your handling code here:
        Products.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_ProductsMousePressed

    private void ProductsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseReleased
        // TODO add your handling code here:
        Products.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_ProductsMouseReleased

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
        Producto da = new Producto();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsActionPerformed

    private void UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosMouseClicked

    private void UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseEntered
        // TODO add your handling code here:
        Usuarios.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_UsuariosMouseEntered

    private void UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseExited
        // TODO add your handling code here:
        Usuarios.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_UsuariosMouseExited

    private void UsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMousePressed
        // TODO add your handling code here:
        Usuarios.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_UsuariosMousePressed

    private void UsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseReleased
        // TODO add your handling code here:
        Usuarios.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_UsuariosMouseReleased

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Usuarios da = new Usuarios();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        Ventas da = new Ventas();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentasMouseClicked

    private void VentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseEntered
        // TODO add your handling code here:
        Ventas.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_VentasMouseEntered

    private void VentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseExited
        // TODO add your handling code here:
        Ventas.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_VentasMouseExited

    private void VentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMousePressed
        // TODO add your handling code here:
        Ventas.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_VentasMousePressed

    private void VentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseReleased
        // TODO add your handling code here:
        Ventas.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_VentasMouseReleased

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        Ventas da = new Ventas();
        da.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_VentasActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_backMouseExited

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMousePressed

    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        back.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_backMouseReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
  
        LoggerManager.resetLogger();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar;
    private javax.swing.JMenuItem Agregar1;
    private javax.swing.JButton Products;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton Ventas;
    private javax.swing.JButton back;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
