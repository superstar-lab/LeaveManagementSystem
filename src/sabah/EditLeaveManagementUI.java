/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sabah;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yazan
 */
public class EditLeaveManagementUI extends javax.swing.JFrame {

    /**
     * Creates new form EditLeaveManagementUI
     */
    public EditLeaveManagementUI() {
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

        lblLeaveManagement = new javax.swing.JLabel();
        lblLeaveTypeName = new javax.swing.JLabel();
        lblMinDuration = new javax.swing.JLabel();
        lblMaxDuration = new javax.swing.JLabel();
        txfLeaveTypeName = new javax.swing.JTextField();
        txfMinDuration = new javax.swing.JTextField();
        txfMaxDuration = new javax.swing.JTextField();
        lblErrorLeaveTypeName = new javax.swing.JLabel();
        lblErrorMinDuration = new javax.swing.JLabel();
        lblErrorMaxDuration = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLeaveManagement.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblLeaveManagement.setText("Leave Management");

        lblLeaveTypeName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblLeaveTypeName.setText("Leave Type Name:");

        lblMinDuration.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblMinDuration.setText("Minimum Duration:");

        lblMaxDuration.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblMaxDuration.setText("Maximum Duration:");

        txfMaxDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMaxDurationActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblNote.setFont(new java.awt.Font("Segoe UI Emoji", 3, 12)); // NOI18N
        lblNote.setText("To Delete: Only Leave Type Name Required");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLeaveManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblMinDuration)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txfMinDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblLeaveTypeName)
                                            .addGap(31, 31, 31)
                                            .addComponent(txfLeaveTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblErrorLeaveTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                        .addComponent(lblErrorMinDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMaxDuration)
                                    .addGap(19, 19, 19)
                                    .addComponent(txfMaxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblErrorMaxDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnUpdate)))
                            .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLeaveManagement)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLeaveTypeName)
                        .addComponent(txfLeaveTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorLeaveTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinDuration)
                    .addComponent(txfMinDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorMinDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaxDuration)
                        .addComponent(txfMaxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorMaxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(lblNote)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfMaxDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMaxDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMaxDurationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        LeaveManagementUI l = new LeaveManagementUI();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

        
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        String name = "";
        int max = 0;
        int min = 0;
        
       
        if (txfLeaveTypeName.getText().length() < 1)
        {
         lblErrorLeaveTypeName.setText("Leave Name Required");
         txfLeaveTypeName.setBackground(Color.red);
        }
        else if (txfLeaveTypeName.getText().length() > 1)
        {
         name = txfLeaveTypeName.getText();
         lblErrorLeaveTypeName.setText("");
         txfLeaveTypeName.setBackground(Color.white);
        }
        
        if (txfMinDuration.getText().length() < 1)
        {
         lblErrorMinDuration.setText("Min Duration required");
         txfMinDuration.setBackground(Color.red);
        }
        else if (Integer.parseInt(txfMinDuration.getText()) <= 0)
        {
         lblErrorMinDuration.setText("Min Duration can not be 0 or Below");
         txfMinDuration.setBackground(Color.red);
        }
        else if (Integer.parseInt(txfMinDuration.getText()) > Integer.parseInt(txfMaxDuration.getText()))
        {
         lblErrorMinDuration.setText("Min Duration can not be bigger than Max");
         txfMinDuration.setBackground(Color.red);
        }
        else if (Integer.parseInt(txfMinDuration.getText()) > 1 && (Integer.parseInt(txfMinDuration.getText()) < Integer.parseInt(txfMaxDuration.getText())))
        {
         min = Integer.parseInt(txfMinDuration.getText());
         lblErrorMinDuration.setText("");
         txfMinDuration.setBackground(Color.white);
        }
        
        if (txfMaxDuration.getText().length() < 1)
        {
         lblErrorMaxDuration.setText("Min Duration required");
         txfMaxDuration.setBackground(Color.red);
        }
        else if (Integer.parseInt(txfMaxDuration.getText()) <= 0)
        {
         lblErrorMaxDuration.setText("Max Duration can not be 0 or Below");
         txfMaxDuration.setBackground(Color.red);
        }
        else if (Integer.parseInt(txfMaxDuration.getText()) > 1 && (Integer.parseInt(txfMinDuration.getText()) < Integer.parseInt(txfMaxDuration.getText())))
        {
         max = Integer.parseInt(txfMaxDuration.getText());
         lblErrorMaxDuration.setText("");
         txfMaxDuration.setBackground(Color.white);
        }
        
        if (txfLeaveTypeName.getText().length() > 1 && Integer.parseInt(txfMinDuration.getText()) > 1 && Integer.parseInt(txfMaxDuration.getText()) > 1 ) 
        try
        {
         LoginUI.db.update("INSERT INTO LeaveManagement (LeaveName, MinDuration, MaxDuration) "
                 + "VALUES ('" + name + "','" + min + "','" + max + "');");
         
         JOptionPane.showMessageDialog(null,"Added To Databse");
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
     
       
     
        if (txfLeaveTypeName.getText().length() > 1 && txfMaxDuration.getText().length() < 1 && txfMinDuration.getText().length() < 1)
        {
         try
         {
          LoginUI.db.update("DELETE FROM LeaveManagement WHERE LeaveName = '" + txfLeaveTypeName.getText() + "';");
          JOptionPane.showMessageDialog(null, "Deleted");
         }
         catch (SQLException e)
         {
             System.out.println("Could Not Delete From Database");
         }
        }
        
        if (txfMaxDuration.getText().length() > 1)
        {
         lblErrorMaxDuration.setText("Leave Field Empty");
         txfMaxDuration.setBackground(Color.red);
        }
        
        if (txfMinDuration.getText().length() > 1)
        {
         lblErrorMinDuration.setText("Leave Field Empty");
         txfMinDuration.setBackground(Color.red);
        }
        
     
    
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(EditLeaveManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLeaveManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLeaveManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLeaveManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLeaveManagementUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblErrorLeaveTypeName;
    private javax.swing.JLabel lblErrorMaxDuration;
    private javax.swing.JLabel lblErrorMinDuration;
    private javax.swing.JLabel lblLeaveManagement;
    private javax.swing.JLabel lblLeaveTypeName;
    private javax.swing.JLabel lblMaxDuration;
    private javax.swing.JLabel lblMinDuration;
    private javax.swing.JLabel lblNote;
    private javax.swing.JTextField txfLeaveTypeName;
    private javax.swing.JTextField txfMaxDuration;
    private javax.swing.JTextField txfMinDuration;
    // End of variables declaration//GEN-END:variables
}
