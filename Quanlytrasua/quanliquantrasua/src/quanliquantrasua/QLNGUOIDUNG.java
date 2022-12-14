/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanliquantrasua;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QLNGUOIDUNG extends javax.swing.JFrame {

    /**
     * Creates new form QLNGUOIDUNG
     */
    public QLNGUOIDUNG() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnTimkiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttdn = new javax.swing.JTextField();
        txtht = new javax.swing.JTextField();
        txttimkiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblND = new javax.swing.JTable();
        txtquyen = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtmk = new javax.swing.JPasswordField();
        btnnl = new javax.swing.JButton();
        btnquaylai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(54, 204, 234));
        jDesktopPane1.setForeground(new java.awt.Color(0, 181, 195));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimkiem.setBackground(new java.awt.Color(255, 153, 51));
        btnTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimkiem.setText("T??m ki???m");
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 74, 81, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Qu???n l?? USER");
        jLabel1.setToolTipText("");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1004, 37));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("T??n ????ng nh???p");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M???t kh???u");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("T??n ?????y ?????");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 223, -1, -1));
        jDesktopPane1.add(txttdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 71, 489, -1));
        jDesktopPane1.add(txtht, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 160, 489, -1));
        jDesktopPane1.add(txttimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 71, 222, -1));

        btnThem.setBackground(new java.awt.Color(255, 153, 51));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Th??m");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 152, 113, 38));

        btnSua.setBackground(new java.awt.Color(255, 153, 51));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("S???a");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 152, 113, 38));

        btnXoa.setBackground(new java.awt.Color(255, 153, 51));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xo??");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 296, 113, 38));

        btnThoat.setBackground(new java.awt.Color(255, 153, 51));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 296, 113, 38));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Quy???n");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 258, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("S?? ??i???n tho???i");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 309, -1, -1));

        tblND.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "T??n ????ng nh???p", "M???t kh???u", "H??? t??n ", "email", "Quy???n", "S??? ??i???n tho???i"
            }
        ));
        tblND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNDMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblND);

        jDesktopPane1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 350, 1016, -1));
        jDesktopPane1.add(txtquyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 258, 489, -1));
        jDesktopPane1.add(txtsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 312, 489, -1));
        jDesktopPane1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 218, 489, -1));
        jDesktopPane1.add(txtmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 111, 204, -1));

        btnnl.setBackground(new java.awt.Color(255, 153, 51));
        btnnl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnnl.setForeground(new java.awt.Color(255, 255, 255));
        btnnl.setText("Nh???p l???i ");
        btnnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnlMouseClicked(evt);
            }
        });
        btnnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnlActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 226, 111, 38));

        btnquaylai.setBackground(new java.awt.Color(255, 153, 51));
        btnquaylai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnquaylai.setForeground(new java.awt.Color(255, 255, 255));
        btnquaylai.setText("Quay l???i");
        btnquaylai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnquaylaiMouseClicked(evt);
            }
        });
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnquaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 226, 111, 38));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanliquantrasua/main-background1.jpg"))); // NOI18N
        jLabel8.setText(" ");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblND.getModel();
        model.setRowCount(100);
        model.setColumnCount(6);
        tblND.removeAll();
        try {
            connectnguoidung pt = new connectnguoidung();
            java.sql.ResultSet rs = null;
            rs = pt.GetData("nguoidung");
            int i = 0;
            while (rs.next()) {
                tblND.setValueAt(rs.getString("username"), i, 0);
                tblND.setValueAt(rs.getString("password"), i, 1);
                tblND.setValueAt(rs.getString("fullname"), i, 2);
                tblND.setValueAt(rs.getString("email"), i, 3);
                tblND.setValueAt(rs.getString("quyen"), i, 4);
                tblND.setValueAt(rs.getString("sodienthoai"), i, 5);
                i++;
            }
            pt.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null,
                    ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
    }
    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
// TODO add your handling code here:
          String tim = txttimkiem.getText();
     
         DefaultTableModel model = (DefaultTableModel) tblND.getModel();
           model.setRowCount(0);
        tblND.removeAll();
         model.setRowCount(100);
         model.setColumnCount(6);
  if(tim.equals(""))
 {
     loadData();
 }
  else
  {
  try {
 connectnguoidung pt = new connectnguoidung();
 java.sql.ResultSet rs = null;

     rs = pt.Timkiem(tim);
     int i=0;
     while (rs.next()){
         tblND.setValueAt(rs.getString("username"), i, 0);
         tblND.setValueAt(rs.getString("password"), i, 1);
         tblND.setValueAt(rs.getString("fullname"), i, 2);
         tblND.setValueAt(rs.getString("email"), i, 3);
          tblND.setValueAt(rs.getString("quyen"), i, 4);
           tblND.setValueAt(rs.getString("sodienthoai"), i, 5);
         i++;
     }
 //pt.Close();
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 }
  }
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked

        if (txttdn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n ????ng nh???p !");
        } else if (txtmk.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p m???t kh???u !");
        } else if (txtht.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p h??? t??n ?????y ????? c???a b???n !");
        } else if (txtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p email!");
        } else if (txtquyen.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p quy???n  !");
        } else if (txtsdt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p tr???ng th??i ho???t ?????ng !");
        } else {

            try {
                // TODO add your handling code here:
                connectnguoidung pt = new connectnguoidung();
                java.sql.ResultSet rs = null;
                rs = pt.GetData("sanpham");
                boolean ok=false;
               while(rs.next())
               {
                   if(txttdn.getText().equals(rs.getString("username")))
                   {
                       ok = true;
                   }
               }
            if(ok)
            {
              JOptionPane.showMessageDialog(null, "T??n ????ng nh???p ???? t???n t???i!!");
             }
            else
            {
                pt.Insert(txttdn.getText(), txtmk.getText(), txtht.getText(), txtemail.getText(), txtquyen.getText(),Integer.parseInt(txtsdt.getText()));
                btnThem.doClick();
                JOptionPane.showMessageDialog(null, "B???n ???? th??m th??nh c??ng ");
                loadData();
            }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        try {

            connectnguoidung pt = new connectnguoidung();
            pt.Update(txttdn.getText(), txtmk.getText(), txtht.getText(), txtemail.getText(), txtquyen.getText(), Integer.parseInt(txtsdt.getText()));
            btnSua.doClick();
            JOptionPane.showMessageDialog(null, "B???n ???? s???a th??nh c??ng ");
            loadData();
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
    try {
 // TODO add )your handling code here:
    connectnguoidung pt = new connectnguoidung();
    pt.Delete( txttdn.getText());
     }
     
  catch (ClassNotFoundException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
 }
     DefaultTableModel model = (DefaultTableModel) tblND.getModel();
       model.setRowCount(0);
        JOptionPane.showMessageDialog(null, "B???n ???? xo?? th??nh c??ng ");
        loadData();
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNDMouseClicked
        //  TODO add your handling code here:
        int row = tblND.getSelectedRow();
        String username = tblND.getValueAt(row, 0).toString();
        String password = tblND.getValueAt(row, 1).toString();
        String fullname = tblND.getValueAt(row, 2).toString();
        String email = tblND.getValueAt(row, 3).toString();
        String quyen = tblND.getValueAt(row, 4).toString();
        String sodienthoai = tblND.getValueAt(row, 5).toString();
        txttdn.setText(username);
        txtmk.setText(password);
        txtht.setText(fullname);
        txtemail.setText(email);
        txtquyen.setText(quyen);
        txtsdt.setText(sodienthoai);

    }//GEN-LAST:event_tblNDMouseClicked

    private void btnnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnlActionPerformed
        // TODO add your handling code here:
          txttdn.setText("");
        txtmk.setText("");
        txtht.setText("");
        txtemail.setText("");
        txtquyen.setText("");
        txtsdt.setText("");
    }//GEN-LAST:event_btnnlActionPerformed

    private void btnnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnlMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnnlMouseClicked

    private void btnquaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquaylaiMouseClicked
            menu a = new menu();
          a.setVisible(true);
                a.setLocationRelativeTo(null);
          this.setVisible(false); 
    }//GEN-LAST:event_btnquaylaiMouseClicked

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquaylaiActionPerformed

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
            java.util.logging.Logger.getLogger(QLNGUOIDUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNGUOIDUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNGUOIDUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNGUOIDUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             QLNGUOIDUNG a = new QLNGUOIDUNG();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnnl;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblND;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtht;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txtquyen;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttdn;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
