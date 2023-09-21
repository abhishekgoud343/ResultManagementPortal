package result_portal;

import java.awt.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;

/**
 *
 * @author Abhi
 */

public class StudentHome extends javax.swing.JFrame {

    public StudentHome(String rollno) {
        this.setTitle("Student Result");
        initComponents();
        jTextField4.setText(rollno);
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel7.setText("Physics");

        jLabel8.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel8.setText("Math");

        jLabel9.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel9.setText("English");

        jLabel10.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel10.setText("DBMS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel11.setText("Engg. Mechanics");

        jLabel12.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel12.setText("Chemistry");

        jLabel13.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel13.setText("Marks Obtained");

        jLabel14.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel14.setText("Total Marks");

        jLabel15.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel15.setText("Passing Marks");

        jLabel16.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel16.setText("Subject");

        jLabel17.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel17.setText("Total:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel18.setText("100");

        jLabel19.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel19.setText("100");

        jLabel20.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel20.setText("100");

        jLabel21.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel21.setText("100");

        jLabel22.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel22.setText("100");

        jLabel23.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel23.setText("100");

        jLabel25.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel25.setText("40");

        jLabel26.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel26.setText("40");

        jLabel27.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel27.setText("40");

        jLabel28.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel28.setText("40");

        jLabel29.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel29.setText("40");

        jLabel30.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel30.setText("40");

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setEditable(false);
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setEditable(false);
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField11.setEditable(false);
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField12.setEditable(false);
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setEditable(false);
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/result_portal/resources/back_icon_27.png")))); // NOI18N
        jButton1.setText("Back");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel14)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25))))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 331, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20)
                    .addComponent(jLabel27)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21)
                    .addComponent(jLabel28)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel22)
                    .addComponent(jLabel29)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel23)
                    .addComponent(jLabel30)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel1.setText("Course Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel2.setText("Branch Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel4.setText("Roll number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13)); // NOI18N
        jLabel6.setText("Father's Name");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent ignoredEvt) {//GEN-FIRST:event_formComponentShown
        String rollno = jTextField4.getText();
        
        //SQL
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            //Setting up connection to database
            con = DatabaseConnection.getConnection();

            stmt = con.prepareStatement("SELECT * FROM student join result WHERE student.`Roll No` = ? AND result.`Roll No` = ?;");
            stmt.setString(1, rollno);
            stmt.setString(2, rollno);

            rs = stmt.executeQuery();

            if (rs.next()) {
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                jTextField7.setText(rs.getString(9));
                jTextField8.setText(rs.getString(10));
                jTextField9.setText(rs.getString(8));
                jTextField10.setText(rs.getString(13));
                jTextField11.setText(rs.getString(12));
                jTextField12.setText(rs.getString(11));

                if (jTextField7.getText().equals("")) jTextField7.setText("0");
                if (jTextField8.getText().equals("")) jTextField8.setText("0");
                if (jTextField9.getText().equals("")) jTextField9.setText("0");
                if (jTextField10.getText().equals("")) jTextField10.setText("0");
                if (jTextField11.getText().equals("")) jTextField11.setText("0");
                if (jTextField12.getText().equals("")) jTextField12.setText("0");

                int total = Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + Integer.parseInt(jTextField10.getText()) + Integer.parseInt(jTextField11.getText()) + Integer.parseInt(jTextField12.getText());
                jTextField13.setText(String.valueOf(total));
            }
            else {
                JOptionPane.showMessageDialog(this, "No result records found for this roll number", "", JOptionPane.WARNING_MESSAGE);

                StudentLogin app = new StudentLogin();
                app.setExtendedState(this.getExtendedState());
                app.setLocation(this.getLocation());

                this.setVisible(false);
                app.setVisible(true);
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
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentLogin app = new StudentLogin();
        app.setExtendedState(this.getExtendedState());
        app.setLocation(this.getLocation());
                
        this.setVisible(false);
        app.setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}