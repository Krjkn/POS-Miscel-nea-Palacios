/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;


/**
 *
 * @author Void
 */
public class DetallesVenta extends javax.swing.JFrame {
    int tktidventa;
    int tkttotal;
    String tktfecha;
    String tktvendedor;
    String tktEfectivo;
    
    private String ticketContent;
    private VariablesParaImprimirTicket variablesTicket;

    VariablesParaImprimirTicket instanciaTicket = VariablesParaImprimirTicket.getInstancia();
    

    /**
     * Creates new form NotificationForm
     */
    public DetallesVenta(int idVenta, int Total,String Fecha,String Vendedor,String Efectivo) {
        this.tktidventa = idVenta;
        this.tktfecha = Fecha;
        this.tkttotal = Total;
        this.tktvendedor = Vendedor;
        this.tktEfectivo = Efectivo;
        
        variablesTicket = VariablesParaImprimirTicket.getInstancia();
        
        //construirContenidoTicket();
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) detallesTabla.getModel();
        model.setRowCount(0);
        Object[] data = new Object[9]; // Aumenta el tamaño del arreglo para incluir el campo "vendedor"}
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<detVentaObject> list = new ArrayList<>();
        list = VentaDB.obtenerDetallesVenta(idVenta); // Reemplaza idVentaActual con tu variable

        for (int i = 0; i < list.size(); i++) {
           data[0] = list.get(i).getIdVenta();
           data[1] = list.get(i).getIdProducto();
           data[2] = list.get(i).getNombre();
           data[3] = list.get(i).getDescripcion();
           data[4] = list.get(i).getCantidad();
           data[5] = list.get(i).getPrecioUnitario();
           data[6] = list.get(i).getSubtotal();
           data[7] = list.get(i).getDescuento();
           data[8] = list.get(i).getVendedor(); // Agrega el campo "vendedor"
           int cantidadProductos = model.getRowCount();
           variablesTicket.setCantidadProductos(String.valueOf(cantidadProductos));
           variablesTicket.setVendedor(Vendedor);
           model.addRow(data);
           detallesTabla.setRowHeight(20);
           
           String productoData = list.get(i).getCantidad() + " pz, "
        + list.get(i).getNombre() + " "
        + list.get(i).getDescripcion() + ", $"
        + list.get(i).getPrecioUnitario() + " c/u, $"
        + list.get(i).getSubtotal()+"";

        productos.add(productoData);
            

        }
        variablesTicket.setFechaVenta(Fecha);
        variablesTicket.setTotalVenta(String.valueOf(Total));
        variablesTicket.setCodigoVenta(String.valueOf(idVenta));
        variablesTicket.setImporte(Efectivo);

        String productosLista = String.join("\n", productos);
        variablesTicket.setProductosLista(productosLista);;
        

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    DetallesVenta() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        No = new javax.swing.JButton();
        Si = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        detallesTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 136), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 150, 136));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Detalles de la Venta");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel8)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        No.setBackground(new java.awt.Color(0, 77, 64));
        No.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        No.setForeground(new java.awt.Color(255, 255, 255));
        No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Vote_24px_1.png"))); // NOI18N
        No.setText("Cerrar");
        No.setBorder(null);
        No.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel2.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 36));

        Si.setBackground(new java.awt.Color(0, 77, 64));
        Si.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Si.setForeground(new java.awt.Color(255, 255, 255));
        Si.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Vote_24px_1.png"))); // NOI18N
        Si.setText("Imprimir Ticket");
        Si.setBorder(null);
        Si.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        jPanel2.add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 160, 36));

        detallesTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venta", "ID Producto", "Nombre", "Descripcion","Cantidad","Precio Unitario","SubTotal","Descuento","Vendedor"
            }
        ));
        detallesTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detallesTablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(detallesTabla);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 390));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 890, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        limpiarTabla();
        tktidventa = 0;
        this.dispose();
        variablesTicket.setImporte("");
        variablesTicket.setCambio("");
       
    }//GEN-LAST:event_NoActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        TicketPrinter ticketPrinter = new TicketPrinter(ticketContent);
        ticketPrinter.print();
    }//GEN-LAST:event_SiActionPerformed

    private void detallesTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesTablaMouseClicked
        
    }//GEN-LAST:event_detallesTablaMouseClicked
    private void limpiarTabla() {
    DefaultTableModel model = (DefaultTableModel) detallesTabla.getModel();
    model.setRowCount(0);
    }    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NotificationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NotificationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NotificationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NotificationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NotificationForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton No;
    private javax.swing.JButton Si;
    private javax.swing.JTable detallesTabla;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables




}