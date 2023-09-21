package result_portal;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author Abhi
 */

public class Index extends javax.swing.JFrame {

    public Index() {
        this.setTitle("Results Portal Home Page");
        initComponents();
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        student = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        student.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 15)); // NOI18N
        student.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/student_icon.png")))); // NOI18N
        student.setText("Student");
        student.addActionListener(this::studentActionPerformed);

        admin.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 15)); // NOI18N
        admin.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/admin_icon.png")))); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(this::adminActionPerformed);

        background.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/main_bg.png")))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        StudentLogin app = new StudentLogin();
        app.setExtendedState(this.getExtendedState());
        app.setLocation(this.getLocation());
        
        this.setVisible(false);
        app.setVisible(true);
    }//GEN-LAST:event_studentActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        AdminLogin app = new AdminLogin();
        app.setExtendedState(this.getExtendedState());
        app.setLocation(this.getLocation());
        
        this.setVisible(false);
        app.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Index().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel background;
    private javax.swing.JButton student;
    // End of variables declaration//GEN-END:variables
}