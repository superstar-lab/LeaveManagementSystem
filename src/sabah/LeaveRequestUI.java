/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sabah;

import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author yazan
 */
public class LeaveRequestUI extends javax.swing.JFrame {

    /**
     * Creates new form LeaveRequestUI
     */
    public LeaveRequestUI() {
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

        lblLeaveRequest = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        lblTypeOfLeave = new javax.swing.JLabel();
        lblDateFrom = new javax.swing.JLabel();
        lblDateTo = new javax.swing.JLabel();
        lblDepartmentName = new javax.swing.JLabel();
        txfEmployeeName = new javax.swing.JTextField();
        cmbTypeOfLeave = new javax.swing.JComboBox<>();
        dtpDateTo = new com.github.lgooddatepicker.components.DatePicker();
        dtpDateFrom = new com.github.lgooddatepicker.components.DatePicker();
        txfDepartmentName = new javax.swing.JTextField();
        btnRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblErrorEmployeeName = new javax.swing.JLabel();
        lblErrorTypeOfLeave = new javax.swing.JLabel();
        lblErrorDateFrom = new javax.swing.JLabel();
        lblErrorDateTo = new javax.swing.JLabel();
        lblErrorDepartmentName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLeaveRequest.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblLeaveRequest.setText("Leave Request");

        lblEmployeeName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblEmployeeName.setText("Employee Name:");

        lblTypeOfLeave.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblTypeOfLeave.setText("Type Of Leave:");

        lblDateFrom.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblDateFrom.setText("Date From:");

        lblDateTo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblDateTo.setText("Date To:");

        lblDepartmentName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblDepartmentName.setText("Department Name:");

        cmbTypeOfLeave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sick Leave", "Annual Leave" }));

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRequest))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLeaveRequest)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmployeeName)
                                .addComponent(lblTypeOfLeave)
                                .addComponent(lblDateFrom)
                                .addComponent(lblDateTo))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dtpDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbTypeOfLeave, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dtpDateFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDepartmentName)
                            .addGap(18, 18, 18)
                            .addComponent(txfDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorTypeOfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLeaveRequest)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeName)
                    .addComponent(txfEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorEmployeeName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeOfLeave)
                    .addComponent(cmbTypeOfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorTypeOfLeave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateFrom)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dtpDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblErrorDateFrom)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateTo)
                    .addComponent(dtpDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorDateTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartmentName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblErrorDepartmentName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequest)
                    .addComponent(btnLogout))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        LoginUI i = new LoginUI();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        
        String employeeName = "";
        String employeeID;
        
        String leaveManagementID;
        
        LocalDate dateFrom;
        LocalDate dateTo;
        
        String departmentID;
        String departmentName;
        
        
        try
        {
        if (txfEmployeeName.getText().length() < 1)
        {
         txfEmployeeName.setBackground(Color.red);
         lblErrorEmployeeName.setText("Name Required");
        }
        else if (txfEmployeeName.getText().length() > 1)
        {
         employeeName = txfEmployeeName.getText();
         employeeID = LoginUI.db.proccessResultSet(LoginUI.db.query("SELECT EmployeeID FROM Employees WHERE Name = '" + employeeName + "';"));
         txfEmployeeName.setBackground(Color.white);
         lblErrorEmployeeName.setText("");
        }
        
        }
        catch(SQLException e)
        {
            System.out.println("Can not link with EmployeeName");
        }
        
        switch (cmbTypeOfLeave.getSelectedIndex())
        {
            case 0: leaveManagementID = "1";
            break;
            case 1: leaveManagementID = "2";
            break;
        }
        
        /*String temp = dtpDateFrom.getText();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");*/
       
        try
        {
        if (txfDepartmentName.getText().length() < 1)
        {
         lblErrorDepartmentName.setText("Department name Requires");
         txfDepartmentName.setBackground(Color.red);
        }
        else if (txfDepartmentName.getText().length() > 1)
        {
         departmentName = txfDepartmentName.getText();
         departmentID = LoginUI.db.proccessResultSet(LoginUI.db.query("SELECT DepartmentID FROM Departments WHERE DepartmentName = '" + departmentName + "';"));
         lblErrorDepartmentName.setText("");
         txfDepartmentName.setBackground(Color.white);
         
        }
        }
        catch (SQLException e)
          {
            System.out.println("Can Not Link with DepartmentName");
          }
        
       /* String dateFromString = dtpDateFrom.getText();
        LocalDate date = LocalDate.parse(dateFromString);
        
        String dateToString = dtpDateTo.getText();
        LocalDate date2 = LocalDate.parse(dateToString);
        
        if (date2.isBefore(date))
        {
         lblErrorDateTo.setText("Date To can not before date from");
        }
        else if (date.isBefore(date2))
        {
         lblErrorDateTo.setText("");
        }
        */
       
        
        
        
        
       
        
    }//GEN-LAST:event_btnRequestActionPerformed

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
            java.util.logging.Logger.getLogger(LeaveRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaveRequestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cmbTypeOfLeave;
    private com.github.lgooddatepicker.components.DatePicker dtpDateFrom;
    private com.github.lgooddatepicker.components.DatePicker dtpDateTo;
    private javax.swing.JLabel lblDateFrom;
    private javax.swing.JLabel lblDateTo;
    private javax.swing.JLabel lblDepartmentName;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblErrorDateFrom;
    private javax.swing.JLabel lblErrorDateTo;
    private javax.swing.JLabel lblErrorDepartmentName;
    private javax.swing.JLabel lblErrorEmployeeName;
    private javax.swing.JLabel lblErrorTypeOfLeave;
    private javax.swing.JLabel lblLeaveRequest;
    private javax.swing.JLabel lblTypeOfLeave;
    private javax.swing.JTextField txfDepartmentName;
    private javax.swing.JTextField txfEmployeeName;
    // End of variables declaration//GEN-END:variables
}