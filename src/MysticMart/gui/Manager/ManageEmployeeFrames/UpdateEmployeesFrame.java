/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.gui.Manager.ManageEmployeeFrames;

import MysticMart.dao.EmployeesDAO;
import MysticMart.pojo.EmployeePojo;
import MysticMart.pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author prach
 */
public class UpdateEmployeesFrame extends javax.swing.JFrame {

    
    public UpdateEmployeesFrame() {
        super("UpdateEmployeesFrame");
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hey, "+UserProfile.getUsername());
        getEmployees();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnEXIT = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jcEmpId = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        backBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtEmpName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtJob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(199, 225, 186));
        jPanel2.setForeground(new java.awt.Color(221, 196, 112));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/headerLogo.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnEXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/exit.png"))); // NOI18N
        btnEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEXITMouseClicked(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Hey, @n null");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1151, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/UpdateEmpFrame.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 610, 400));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 114, 73));
        jLabel1.setText("Employee Id");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 114, 73));
        jLabel4.setText("Employee Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 114, 73));
        jLabel5.setText("Job");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 60, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 114, 73));
        jLabel6.setText("Salary");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 80, -1));
        jPanel4.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 300, 30));

        jcEmpId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel4.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 300, 30));

        btnUpdate.setBackground(new java.awt.Color(221, 196, 112));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Update");

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel10)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 210, 40));

        backBtn.setBackground(new java.awt.Color(221, 196, 112));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Back");

        javax.swing.GroupLayout backBtnLayout = new javax.swing.GroupLayout(backBtn);
        backBtn.setLayout(backBtnLayout);
        backBtnLayout.setHorizontalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        backBtnLayout.setVerticalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 210, 40));

        logoutBtn.setBackground(new java.awt.Color(204, 110, 85));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 140, 40));

        jPanel1.setBackground(new java.awt.Color(243, 213, 189));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, 5));

        jPanel5.setBackground(new java.awt.Color(243, 213, 189));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 250, 5));
        jPanel4.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 300, 30));

        jLabel15.setFont(new java.awt.Font("MV Boli", 1, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(57, 114, 73));
        jLabel15.setText("Employee Details");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 310, -1));

        txtJob.setEditable(false);
        jPanel4.add(txtJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(186, 177, 144));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(221, 196, 112));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setBackground(new Color(186, 177, 144));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new Color(221, 196, 112));
    }//GEN-LAST:event_backBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(219, 154, 136));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(204, 110, 85));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (!validateInputs()) {
            JOptionPane.showMessageDialog(null, "Please, input all the fiels.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {

            EmployeePojo e = new EmployeePojo();
            e.setEmpid(jcEmpId.getSelectedItem().toString());
            e.setEmpname(txtEmpName.getText());
            e.setJob(txtJob.getText());
            //e.setJob(jcJob.getSelectedItem().toString());
            e.setSalary(Double.parseDouble(txtSalary.getText()));
            boolean result = EmployeesDAO.updateEmployee(e);
            if (result) {
                JOptionPane.showMessageDialog(null, "Record Updated Successfully", "Updation Done!", JOptionPane.INFORMATION_MESSAGE);
                //clearText();
                //getEmployees();
            } else {
                JOptionPane.showMessageDialog(null, "Updation Failed..", "Error!", JOptionPane.ERROR_MESSAGE);

            }
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in Update employee Frame");
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnUpdateMouseClicked

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        try {

            String empid = jcEmpId.getSelectedItem().toString();
            EmployeePojo e = EmployeesDAO.findEmpById(empid);
            txtEmpName.setText(e.getEmpname());
            txtSalary.setText(String.valueOf(e.getSalary()));
            txtJob.setText(e.getJob());
            //jcJob.setSelectedItem(e.getJob());

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in Update employee Frame");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void btnEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnEXITMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new ManageEmployeeFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel btnEXIT;
    private javax.swing.JPanel btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void getEmployees() {
        try {

            jcEmpId.removeAllItems();
            List<String> allEmpid = EmployeesDAO.getAllEmpId();
            for (String id : allEmpid) {
                jcEmpId.addItem(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in Update employee Frame");
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {

        return !(txtEmpName.getText().isEmpty() || txtSalary.getText().isEmpty());
    }

    /*private void clearText() {
        jcEmpId.removeAll();
        txtEmpName.setText("");
        txtJob.setText("");
        txtSalary.setText("");
    }*/
}