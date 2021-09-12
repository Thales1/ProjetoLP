/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.LoginData;
import javax.swing.JOptionPane;

/**
 *
 * @author thale
 */
public class JFLogin extends javax.swing.JFrame {

    LoginData loginData;

    /**
     * Creates new form Login
     */
    public JFLogin() {
        try {
            loginData = new LoginData();
            initComponents();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        pfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Login de Funcionários");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 30));

        jLabel2.setText("  Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        getContentPane().add(pfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            if (!tfEmail.getText().contains("@") || pfSenha.getText().length() < 5) {
                JOptionPane.showMessageDialog(null, "Email ou senha inválidos!");
            } else {
                if (loginData.realizarLogin(tfEmail.getText(), pfSenha.getText())) {
                    new JFPrincipal().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Email ou senha inválidos!");
                }
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}