/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquantrasua;

import com.sun.jdi.connect.spi.Connection;
import static java.awt.SystemColor.menu;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
 

/**
 *
 * @author Admin
 */
public class dangnhap extends javax.swing.JFrame {

    /**
     * Creates new form dangnhap
     */
    public dangnhap() {
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

        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txttdn = new javax.swing.JTextField();
        txtmk = new javax.swing.JPasswordField();
        btDisplay = new javax.swing.JButton();
        lbDangnhap = new javax.swing.JLabel();
        btnnl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnthoat1 = new javax.swing.JButton();
        btnthoat2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("User name");
        getContentPane().add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 64, -1, -1));

        lbPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 255));
        lbPass.setText("Pass Word");
        getContentPane().add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 124, -1, -1));

        txttdn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txttdn.setToolTipText("Nhập tên người sử dụng");
        getContentPane().add(txttdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 54, 192, 38));

        txtmk.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtmk.setEchoChar('?');
        getContentPane().add(txtmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 102, 192, 39));

        btDisplay.setBackground(new java.awt.Color(0, 204, 204));
        btDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btDisplay.setText(" Thực hiện");
        btDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(btDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        lbDangnhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbDangnhap.setForeground(new java.awt.Color(255, 255, 255));
        lbDangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangnhap.setText("ĐĂNG NHẬP");
        getContentPane().add(lbDangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 6, 250, 30));

        btnnl.setBackground(new java.awt.Color(102, 0, 0));
        btnnl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnnl.setForeground(new java.awt.Color(255, 255, 255));
        btnnl.setText("Nhập lại");
        btnnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnlActionPerformed(evt);
            }
        });
        getContentPane().add(btnnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 197, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanliquantrasua/main-background1.jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 490, 310));

        btnthoat1.setBackground(new java.awt.Color(102, 0, 0));
        btnthoat1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnthoat1.setForeground(new java.awt.Color(255, 255, 255));
        btnthoat1.setText("thoát");
        btnthoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoat1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnthoat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        btnthoat2.setBackground(new java.awt.Color(102, 0, 0));
        btnthoat2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnthoat2.setForeground(new java.awt.Color(255, 255, 255));
        btnthoat2.setText("thoát");
        btnthoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoat2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnthoat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisplayActionPerformed
       try {
            String user=txttdn.getText();
            String pass=txtmk.getText();
            connectnguoidung kn = new connectnguoidung();
            ResultSet rs = kn.GetData("nguoidung");
            boolean ok=false;
            while(rs.next())
            {
            // if(rs.getString(1).equals(user)&&rs.getString(2).equals(pass)){   
            if(rs.getString("username").equals(user)&&rs.getString("password").equals(pass))
            {
              ok=true;
            }
            
            }
            if(ok){
                System.out.println("Kết nối thành công");
                JOptionPane.showMessageDialog(null, "Bạn đăng nhập thành công");
                menu b = new menu();
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Sai Tai khoan hoac Mat khau");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btDisplayActionPerformed

    private void btnnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnlActionPerformed
txttdn.setText("");
 txtmk.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnlActionPerformed

    private void btnthoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnthoat1ActionPerformed

    private void btnthoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnthoat2ActionPerformed

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
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dangnhap a = new dangnhap();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDisplay;
    private javax.swing.JButton btnnl;
    private javax.swing.JButton btnthoat1;
    private javax.swing.JButton btnthoat2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDangnhap;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttdn;
    // End of variables declaration//GEN-END:variables
}
