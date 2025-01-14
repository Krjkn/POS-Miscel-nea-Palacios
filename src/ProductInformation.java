/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Void
 */
public class ProductInformation extends javax.swing.JFrame {
    /**
     * Creates new form ProductInformation
     */
    
    

    
    public ProductInformation(int Id, String Lote, String Nombre, String Descripcion, String Stock, String fecha_cad, String Precio_Publico, String Precio_Compra, String Descuento) {
        
        
        initComponents();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        idLabel.setText(String.valueOf(Id));
        loteLabel.setText(String.valueOf(Lote));
        nameLabel.setText(Nombre);
        descLabel.setText(Descripcion);
        stockLabel.setText(Stock);
        
        Date fecha;
        
        try {
            
            fecha = dateFormat.parse(fecha_cad);
            fechaLabel.setDate(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ProductInformation.class.getName()).log(Level.SEVERE, null, ex);
        };
        
        precioPLabel.setText(String.valueOf(Precio_Publico));
        precioCLabel.setText(String.valueOf(Precio_Compra));
        descuentoLabel.setText(Descuento);
        
        setResizable(false);
        setLocationRelativeTo(null);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        productInfoBrand = new javax.swing.JLabel();
        productInfoBrand1 = new javax.swing.JLabel();
        productInfoBrand2 = new javax.swing.JLabel();
        productInfoBrand3 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        productInfoPrice = new javax.swing.JLabel();
        loteLabel = new javax.swing.JTextField();
        nameLabel = new javax.swing.JTextField();
        descLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stockLabel = new javax.swing.JTextField();
        fechaLabel = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precioPLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precioCLabel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        descuentoLabel = new javax.swing.JTextField();
        No = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información del Producto ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Info_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productInfoBrand.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoBrand.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand.setText("ID: ");
        jPanel3.add(productInfoBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 37, -1, -1));

        productInfoBrand1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        productInfoBrand1.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand1.setText("Nombre:");
        jPanel3.add(productInfoBrand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 141, 115, -1));

        productInfoBrand2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        productInfoBrand2.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand2.setText("Descripcion: ");
        jPanel3.add(productInfoBrand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 214, -1, -1));

        productInfoBrand3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        productInfoBrand3.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand3.setText("Codigo de Barras:");
        jPanel3.add(productInfoBrand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 68, -1, -1));

        Actualizar.setBackground(new java.awt.Color(0, 77, 64));
        Actualizar.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Upd.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(null);
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Actualizar.setPreferredSize(new java.awt.Dimension(90, 35));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 150, 40));

        idLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 77, 64));
        jPanel3.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 37, 175, 19));

        productInfoPrice.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoPrice.setForeground(new java.awt.Color(0, 77, 64));
        jPanel3.add(productInfoPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 312, 166, 19));

        loteLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loteLabel.setPreferredSize(new java.awt.Dimension(14, 30));
        jPanel3.add(loteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 99, 184, -1));

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameLabelActionPerformed(evt);
            }
        });
        jPanel3.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 172, 184, 30));

        descLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descLabelActionPerformed(evt);
            }
        });
        jPanel3.add(descLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 245, 184, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 64));
        jLabel3.setText("Stock:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 68, -1, -1));

        stockLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        stockLabel.setPreferredSize(new java.awt.Dimension(14, 30));
        jPanel3.add(stockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 99, 184, -1));

        fechaLabel.setDateFormatString("yyyy-MM-dd");
        fechaLabel.setMaxSelectableDate(new java.util.Date(1893481289000L));
        fechaLabel.setMinSelectableDate(new java.util.Date(1262329289000L));
        fechaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaLabelMouseClicked(evt);
            }
        });
        jPanel3.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 173, 184, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 64));
        jLabel4.setText("Fecha de Caducidad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 141, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 77, 64));
        jLabel5.setText("Precio Público:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 214, -1, -1));

        precioPLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        precioPLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioPLabelActionPerformed(evt);
            }
        });
        jPanel3.add(precioPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 245, 184, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 77, 64));
        jLabel6.setText("Precio de Compra:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 287, -1, -1));

        precioCLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        precioCLabel.setPreferredSize(new java.awt.Dimension(73, 30));
        precioCLabel.setRequestFocusEnabled(false);
        jPanel3.add(precioCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 318, 184, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 77, 64));
        jLabel7.setText("Descuento:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 287, -1, -1));

        descuentoLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descuentoLabel.setPreferredSize(new java.awt.Dimension(73, 30));
        jPanel3.add(descuentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 318, 184, -1));

        No.setBackground(new java.awt.Color(0, 77, 64));
        No.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        No.setForeground(new java.awt.Color(255, 255, 255));
        No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        No.setText("Cerrar");
        No.setBorder(null);
        No.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel3.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 130, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 740, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void descLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descLabelActionPerformed

    private void nameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameLabelActionPerformed

    //public static ArrayList<ProductList> cartItem = new ArrayList();
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
         String fecha = ((JTextField)fechaLabel.getDateEditor().getUiComponent()).getText();
         if (fecha.isEmpty()) {
            fecha = null;
        }
        try {
            ProductDB.actualizarProducto(loteLabel.getText(),nameLabel.getText(),descLabel.getText(),Double.parseDouble(precioPLabel.getText()),
                    Double.parseDouble(precioCLabel.getText()),Integer.parseInt(stockLabel.getText()),fecha,Integer.parseInt(descuentoLabel.getText()),Integer.parseInt(idLabel.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ProductInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void fechaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaLabelMouseClicked

    }//GEN-LAST:event_fechaLabelMouseClicked

    private void precioPLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioPLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioPLabelActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        this.dispose();
    }//GEN-LAST:event_NoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton No;
    private javax.swing.JTextField descLabel;
    private javax.swing.JTextField descuentoLabel;
    private com.toedter.calendar.JDateChooser fechaLabel;
    public javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField loteLabel;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JTextField precioCLabel;
    private javax.swing.JTextField precioPLabel;
    private javax.swing.JLabel productInfoBrand;
    private javax.swing.JLabel productInfoBrand1;
    private javax.swing.JLabel productInfoBrand2;
    private javax.swing.JLabel productInfoBrand3;
    public javax.swing.JLabel productInfoPrice;
    private javax.swing.JTextField stockLabel;
    // End of variables declaration//GEN-END:variables
}
