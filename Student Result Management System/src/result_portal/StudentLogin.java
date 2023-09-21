package result_portal;

import java.awt.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;

/**
 *
 * @author Abhi
 */

public class StudentLogin extends javax.swing.JFrame {

    public StudentLogin() {
        this.setTitle("Student Login");
        initComponents();
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rollno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("sansserif", Font.BOLD, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter your roll number");
        jLabel1.setOpaque(true);

        rollno.setFont(new java.awt.Font("Arial", Font.PLAIN, 14)); // NOI18N
        rollno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rollno.addActionListener(this::rollnoActionPerformed);
        rollno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e){
                int key = e.getKeyCode();

                if (key == java.awt.event.KeyEvent.VK_ENTER)
                    jButton1ActionPerformed(null);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/back_icon.png")))); // NOI18N
        jButton2.setText("Back");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/login_icon.png")))); // NOI18N
        jButton1.setText("Submit");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        background.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/student_login_bg.png")))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rollno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoActionPerformed
    }//GEN-LAST:event_rollnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Index app = new Index();
        app.setExtendedState(this.getExtendedState());
        app.setLocation(this.getLocation());

        this.setVisible(false);
        app.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String roll = rollno.getText();
        
        //SQL
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            //Setting up connection to database
            con = DatabaseConnection.getConnection();

            stmt = con.prepareStatement("SELECT * FROM student WHERE `Roll No` = ?;");
            stmt.setString(1, roll);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                StudentHome app = new StudentHome(roll);
                app.setExtendedState(this.getExtendedState());
                app.setLocation(this.getLocation());
                
                this.setVisible(false);
                app.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid roll number", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e) {
            if (e instanceof SQLException) JOptionPane.showMessageDialog(this, e.toString(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            else JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.toString(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rollno;
    // End of variables declaration//GEN-END:variables
}