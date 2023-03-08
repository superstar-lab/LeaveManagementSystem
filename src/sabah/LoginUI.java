/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sabah;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author yazan
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    LeaveManagementManager lM;
    public static DatabaseOperation db = new DatabaseOperation();
    
    public LoginUI()  {
        initComponents();
        
        
        
        try 
        {
         lM = new LeaveManagementManager();
        }
        catch(SQLException e)
        {
            System.out.println(e);
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

        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txfPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        rdbGeneralUser = new javax.swing.JRadioButton();
        rdbAdminUser = new javax.swing.JRadioButton();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorRadioButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogin.setText("Login");

        lblUsername.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblUsername.setText("Username: ");

        lblPassword.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblPassword.setText("Password:");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        rdbGeneralUser.setText("General User");

        rdbAdminUser.setText("Admin User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbAdminUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbGeneralUser))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnExit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLogin))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUsername)
                                        .addComponent(lblPassword))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblErrorPassword)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbGeneralUser)
                    .addComponent(rdbAdminUser)
                    .addComponent(lblErrorRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnLogin))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        
        String username = "";
        String password = "";
        
        if (txfUsername.getText().length() < 1)
        {
         txfUsername.setBackground(Color.red);
         lblErrorUsername.setText("Username is Required");
        }
        else if (txfUsername.getText().length() > 1)
        {
         username = txfUsername.getText();
         txfUsername.setBackground(Color.white);
         lblErrorUsername.setText("");
        }
        
         if (txfPassword.getText().length() < 1)
        {
         txfPassword.setBackground(Color.red);
         lblErrorPassword.setText("Password is Required");
        }
        else if (txfPassword.getText().length() > 1)
        {
          password = txfPassword.getText();
         txfPassword.setBackground(Color.white);
         lblErrorPassword.setText("");
        }
        
         if (rdbAdminUser.isSelected() && rdbGeneralUser.isSelected())
         {
          lblErrorRadioButton.setText("Click Only One");
         }
         else if ((!(rdbAdminUser.isSelected())) && (!(rdbGeneralUser.isSelected())))
         {
          lblErrorRadioButton.setText("Click Only One");
         }
         else if (rdbAdminUser.isSelected() || rdbGeneralUser.isSelected())
         {
          lblErrorRadioButton.setText("");
         }
         
        
        //Check if Admin Users username and password is valid is valid 
     if (rdbAdminUser.isSelected() && txfPassword.getText().length() > 1 && txfUsername.getText().length() > 1 && (!(rdbGeneralUser.isSelected())))
         {   
          
           if (lM.checkUsernamePasswordAdminUsers(username, password) == true)
            {
             AdminUsersUI aU = new AdminUsersUI();
             aU.setVisible(true);
             this.dispose();
            }
           else if (lM.checkUsernamePasswordAdminUsers(username, password) == false)
            {
             JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            } 
           
         }
     
     
     //Check if Employers username and password is valid
     if (rdbGeneralUser.isSelected() && txfPassword.getText().length() > 1 && txfUsername.getText().length() > 1 && (!(rdbAdminUser.isSelected())))
         {   
          
          if (lM.checkUsernamePasswordEmployees(username, password) == true)
            {
             LeaveRequestUI r = new LeaveRequestUI();
             r.setVisible(true);
             this.dispose();
             
            }
           else if (lM.checkUsernamePasswordEmployees(username, password) == false)
            {
             JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            } 
           
         }
     
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:

        //if a user exits the program, the login page will dispose
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRadioButton;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rdbAdminUser;
    private javax.swing.JRadioButton rdbGeneralUser;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}