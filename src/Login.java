
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Login extends javax.swing.JFrame {
static int wrongPass = 0;


    /**
     * Creates new form MainFrame
     */
    public Login() {
        
        initComponents();
        Logo.setVisible(true);
        
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
        jLabel3 = new javax.swing.JLabel();
        signInUsernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        signInPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        showPassword1 = new javax.swing.JCheckBox();
        warningLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESIÓN");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 110, 145));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Usuario");

        signInUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInUsernameFieldActionPerformed(evt);
            }
        });
        signInUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signInUsernameFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Contraseña");

        signInPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signInPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                signInPasswordFieldKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Miscelanea - copia.png"))); // NOI18N

        showPassword1.setBackground(new java.awt.Color(255, 255, 255));
        showPassword1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        showPassword1.setForeground(new java.awt.Color(0, 77, 64));
        showPassword1.setToolTipText("Mostrar contraseña");
        showPassword1.setBorderPaintedFlat(true);
        showPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showPassword1.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signInUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signInPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(signInUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(signInPasswordField))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 380));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicia Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 450, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInUsernameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        if(signInUsernameField.getText().equals("Sergio") && signInPasswordField.getText().equals("admin")){
            JFrame adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
            LoggerManager.setLogger(signInUsernameField.getText());
            System.out.println(LoggerManager.getLogger());
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            wrongPass = 0;
            this.dispose();
        }
        if(signInUsernameField.getText().equals("Faustino") && signInPasswordField.getText().equals("fpr1421")){
            JFrame adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
            LoggerManager.setLogger(signInUsernameField.getText());
            System.out.println(LoggerManager.getLogger());
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            wrongPass = 0;
            this.dispose();
        }
        if(signInUsernameField.getText().equals("Elsa") && signInPasswordField.getText().equals("malaca")){
            JFrame adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
            LoggerManager.setLogger(signInUsernameField.getText());
            System.out.println(LoggerManager.getLogger());
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            wrongPass = 0;
            this.dispose();
            }
        boolean flag = ConexionDB.signer(signInUsernameField.getText(), signInPasswordField.getText());   
            if(flag){
                LoggerManager.setLogger(signInUsernameField.getText());
                warningLabel.setText("Usuario Correcto");
                signInUsernameField.setText("");
                signInPasswordField.setText("");
                MainPannel da = new MainPannel();
                da.setVisible(true);
                this.dispose();
                wrongPass = 0;
            }
            else{
               signInUsernameField.requestFocus();
                wrongPass++;
                if(wrongPass == 2){
                    warningLabel.setText("Usuario/Contraseña Incorrectos! Queda 1 Intento");
                }
                else if(wrongPass == 1){
                    warningLabel.setText("Usuario/Contraseña Incorrectos! Quedan 2 Intentos");
                }
                else if(wrongPass == 0){
                    warningLabel.setText("Usuario/Contraseña Incorrectos! Quedan 3 Intentos");
}
                if(wrongPass>=3){
                    //ForgotPasswordFrame forgotPasswordFrame = new ForgotPasswordFrame();
                    //forgotPasswordFrame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Olvidaste tu Contraseña? \n Contacta con el desarrolador 7331923012", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    warningLabel.setText("No te quedan intentos");
                }
                
                signInUsernameField.setText("");
                signInPasswordField.setText("");
            }        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword1ActionPerformed
        // TODO add your handling code here:
        if(showPassword1.isSelected()){
            signInPasswordField.setEchoChar((char)0);
        }
        else
        signInPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showPassword1ActionPerformed

    private void signInUsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInUsernameFieldKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Verificar si se presiona la tecla Enter
        signInPasswordField.requestFocus(); // Establecer el foco en el siguiente JTextField
    }
    }//GEN-LAST:event_signInUsernameFieldKeyPressed

    private void signInPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInPasswordFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_signInPasswordFieldKeyReleased

    private void signInPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInPasswordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Verificar si se presiona la tecla Enter
        jButton1.doClick(); // Establecer el foco en el siguiente JTextField
        }
    }//GEN-LAST:event_signInPasswordFieldKeyPressed



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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox showPassword1;
    private javax.swing.JPasswordField signInPasswordField;
    private javax.swing.JTextField signInUsernameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables


}
