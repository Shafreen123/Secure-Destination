/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miniproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class hotel extends javax.swing.JFrame {

    /**
     * Creates new form hotel
     */
    
    DefaultTableModel model;
    
    public hotel() {
        initComponents();
        setRecordToTable();
    }

    public void setRecordToTable()
{
    try {
            String URL = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "admin";
            String pass = "ShaziaAfreen";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, user, pass);
            PreparedStatement pst = con.prepareStatement("select * from hotels");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String Place = rs.getString("Place");
                String Hotels = rs.getString("Hotels");
                String Price = rs.getString("Price");
                Object[] obj ={Place,Hotels,Price};
                model = (DefaultTableModel)hotelTable.getModel(); /** type casting to default*/
                model.addRow(obj);
            }
    }
    catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
}
     public void searc(String str)
{
     model = (DefaultTableModel)hotelTable.getModel();
     TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
     hotelTable.setRowSorter(trs);
     trs.setRowFilter(RowFilter.regexFilter(str));
     
     
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
        jPanel4 = new javax.swing.JPanel();
        securitybutton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        homebutton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        backbutton = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        logoutbutton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hoteltxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hotelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 1040));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        securitybutton.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        securitybutton.setForeground(new java.awt.Color(255, 255, 255));
        securitybutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\miniproject1\\src\\main\\java\\com\\mycompany\\miniproject1\\icon\\search2.png")); // NOI18N
        securitybutton.setText("SECURITY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(securitybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(securitybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, 60));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebutton.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        homebutton.setForeground(new java.awt.Color(255, 255, 255));
        homebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\miniproject1\\src\\main\\java\\com\\mycompany\\miniproject1\\icon\\home.png")); // NOI18N
        homebutton.setText("HOME");
        jPanel3.add(homebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 165, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 70));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbutton.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\miniproject1\\src\\main\\java\\com\\mycompany\\miniproject1\\icon\\back1.png")); // NOI18N
        backbutton.setText("BACK");
        jPanel6.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 127, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 210, 60));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbutton.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\miniproject1\\src\\main\\java\\com\\mycompany\\miniproject1\\icon\\logout.png")); // NOI18N
        logoutbutton.setText("LOGOUT");
        jPanel7.add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 8, -1, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 210, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 400, 960));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEARCH");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 60));

        hoteltxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hoteltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hoteltxtMouseReleased(evt);
            }
        });
        hoteltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoteltxtActionPerformed(evt);
            }
        });
        hoteltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hoteltxtKeyReleased(evt);
            }
        });
        jPanel2.add(hoteltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 320, 60));

        hotelTable.setBackground(new java.awt.Color(0, 0, 0));
        hotelTable.setForeground(new java.awt.Color(255, 255, 255));
        hotelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Place", "Hotel", "Price"
            }
        ));
        hotelTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(hotelTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 900, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 1160, 960));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
Login login = new Login();
login.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
security Security = new security();
        Security.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
  security Security = new security();
        Security.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void hoteltxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoteltxtMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hoteltxtMouseReleased

    private void hoteltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoteltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoteltxtActionPerformed

    private void hoteltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hoteltxtKeyReleased
String searchstring = hoteltxt.getText();
searc(searchstring);        // TODO add your handling code here:
    }//GEN-LAST:event_hoteltxtKeyReleased

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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel homebutton;
    private javax.swing.JTable hotelTable;
    private javax.swing.JTextField hoteltxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutbutton;
    private javax.swing.JLabel securitybutton;
    // End of variables declaration//GEN-END:variables
}