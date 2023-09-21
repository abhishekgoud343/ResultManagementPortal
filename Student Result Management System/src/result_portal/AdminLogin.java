package result_portal;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Abhi
 */

public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        this.setTitle("Admin Login");
        initComponents();
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD | Font.ITALIC, 14)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", Font.BOLD | Font.ITALIC, 14)); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setOpaque(true);

        username.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        username.addActionListener(this::usernameActionPerformed);

        password.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        password.addActionListener(this::passwordActionPerformed);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e){
                int key = e.getKeyCode();

                if (key == java.awt.event.KeyEvent.VK_ENTER)
                    jButton1ActionPerformed(null);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/login_icon.png")))); // NOI18N
        jButton1.setText("Login");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/back_icon.png")))); // NOI18N
        jButton2.setText("Back");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        background.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/admin_login_bg.png")))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(password))))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 26, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 36, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username_str = username.getText();
        char[] password_str = password.getPassword();

        //SQL
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            //Setting up connection to database
            con = DatabaseConnection.getConnection();

            stmt = con.prepareStatement("SELECT username FROM admin_credentials WHERE username = ? AND password = ?;");
            stmt.setString(1, username_str);
            stmt.setString(2, String.valueOf(password_str));

            rs = stmt.executeQuery();

            if (rs.next()) {
                AdminHome app = new AdminHome();
                app.setExtendedState(this.getExtendedState());
                app.setLocation(this.getLocation());

                this.setVisible(false);
                app.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password", "Error Message", JOptionPane.ERROR_MESSAGE);
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

        Arrays.fill(password_str, '0');
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Index app = new Index();
        app.setExtendedState(this.getExtendedState());
        app.setLocation(this.getLocation());
                
        this.setVisible(false);
        app.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}