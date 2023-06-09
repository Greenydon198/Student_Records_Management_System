/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author green
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
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

        Student = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        Pass = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(5, 5, 590, 420));
        setMaximumSize(new java.awt.Dimension(590, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setBackground(new java.awt.Color(153, 255, 153));
        Student.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Student.setForeground(new java.awt.Color(51, 51, 0));
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/student.png"))); // NOI18N
        Student.setText("Student");
        Student.setToolTipText("PASSWORD IS THE USERNAME");
        Student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        Admin.setBackground(new java.awt.Color(102, 102, 255));
        Admin.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        Admin.setForeground(new java.awt.Color(51, 51, 0));
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/administrator.png"))); // NOI18N
        Admin.setText("Admin");
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        Pass.setBackground(new java.awt.Color(0, 204, 102));
        Pass.setFont(new java.awt.Font("Showcard Gothic", 1, 17)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 51, 51));
        Pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pass.setText("PASSWORD");
        Pass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, 30));

        Username.setBackground(new java.awt.Color(0, 204, 102));
        Username.setFont(new java.awt.Font("Showcard Gothic", 1, 17)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 51, 0));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("USERNAME");
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 140, -1));

        title.setBackground(new java.awt.Color(255, 153, 0));
        title.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setText("Student Results Management System");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 520, 80));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 140, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/jess-bailey-l3N9Q27zULw-unsplash.jpg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:
        String user = jTextField1.getText();
        String pass = jPasswordField1.getText();
        if(user.length()==0 || pass.length()==0)
            JOptionPane.showMessageDialog(rootPane,"Please Enter the USERNAME and PASSWORD.");
        else{
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = st.executeQuery("Select rollno from student where rollno='"+user+"'");
                if(!rs.first()){
                    JOptionPane.showMessageDialog(rootPane, "The entered Roll no. is not in the database.");
                }
                else{
                    if(user.equals(pass))
                        new Studentframe(user).setVisible(true);
                    else{
                        JOptionPane.showMessageDialog(rootPane, "'"+"Username or Password is incorrect"+"'");
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.toString());
            }
    //        if(user.equals("user") && pass.equals("pass"))
    //            new Studentframe().setVisible(true);
    //        else
    //            JOptionPane.showMessageDialog(null, "'"+"Username or Password is incorrect"+"'");
        }
    }//GEN-LAST:event_StudentActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        String user = jTextField1.getText();
        String pass = jPasswordField1.getText();
        if(user.equals("admin") && pass.equals("pass"))
            new AddStudent().setVisible(true);
        else
            JOptionPane.showMessageDialog(null, "'"+"Username or Password is incorrect"+"'");
    }//GEN-LAST:event_AdminActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Pass;
    private javax.swing.JButton Student;
    private javax.swing.JLabel Username;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
