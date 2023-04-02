/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author green
 */
public class regstudents extends javax.swing.JFrame {

    /**
     * Creates new form regstudents
     */
    public regstudents() {
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

        jPanel1 = new javax.swing.JPanel();
        AddStudent = new javax.swing.JButton();
        updateresults = new javax.swing.JButton();
        regstudents = new javax.swing.JButton();
        results = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(590, 420));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStudent.setBackground(new java.awt.Color(0, 255, 102));
        AddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudent.setText("Add Student");
        AddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudent.setPreferredSize(new java.awt.Dimension(200, 25));
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        jPanel1.add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        updateresults.setBackground(new java.awt.Color(0, 255, 102));
        updateresults.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateresults.setText("Update Results");
        updateresults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateresults.setPreferredSize(new java.awt.Dimension(200, 25));
        updateresults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateresultsActionPerformed(evt);
            }
        });
        jPanel1.add(updateresults, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, -1));

        regstudents.setBackground(new java.awt.Color(0, 255, 102));
        regstudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regstudents.setText("Registered Students");
        regstudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regstudents.setEnabled(false);
        regstudents.setPreferredSize(new java.awt.Dimension(200, 25));
        regstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regstudentsActionPerformed(evt);
            }
        });
        jPanel1.add(regstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        results.setBackground(new java.awt.Color(0, 255, 102));
        results.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        results.setText("List of Students'  Results");
        results.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        results.setPreferredSize(new java.awt.Dimension(200, 25));
        results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsActionPerformed(evt);
            }
        });
        jPanel1.add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, -1));

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setText("LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setPreferredSize(new java.awt.Dimension(200, 25));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 420));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("REGISTERED STUDENTS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 370, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_AddStudentActionPerformed

    private void updateresultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateresultsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateresults().setVisible(true);
    }//GEN-LAST:event_updateresultsActionPerformed

    private void regstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regstudentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new regstudents().setVisible(true);
    }//GEN-LAST:event_regstudentsActionPerformed

    private void resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new results().setVisible(true);
    }//GEN-LAST:event_resultsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(rootPane, "Are You Sure?", "LOGOUT", JOptionPane.YES_NO_OPTION);
        if(flag==0){
            setVisible(false);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from student");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(regstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regstudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton regstudents;
    private javax.swing.JButton results;
    private javax.swing.JButton updateresults;
    // End of variables declaration//GEN-END:variables
}