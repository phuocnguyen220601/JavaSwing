/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquantrasua;

import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanliquantrasua.connectkhachhang;

/**
 *
 * @author User
 */
public class frm_Khachhang extends javax.swing.JFrame {

    /**
     * Creates new form frm_Khachhang
     */
    public frm_Khachhang() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void loadData()
{
     DefaultTableModel model = (DefaultTableModel) tblKH.getModel();
         model.setRowCount(100);
         model.setColumnCount(4);
    tblKH.removeAll();
 try {
 connectkhachhang pt = new connectkhachhang();
 java.sql.ResultSet rs = null;
  rs = pt.getData("khachhang");
 int i=0;
 while (rs.next()){
        tblKH.setValueAt(rs.getString("ID"), i, 0);
        tblKH.setValueAt(rs.getString("Username"), i, 1);
        tblKH.setValueAt(rs.getString("Number"), i, 2);
        tblKH.setValueAt(rs.getString("ghichu"), i, 3);
 i++;
 }
//pt.Close();
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
 }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtnumber = new javax.swing.JTextField();
        txtnote = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        btnGetdata = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        btnquaylai = new javax.swing.JButton();
        btnnl = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qu???n l?? kh??ch h??ng");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M?? kh??ch h??ng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("T??n kh??ch h??ng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 177, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S??? ??i???n tho???i");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 251, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ghi ch??");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 348, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 110, 290, 37));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 172, 290, 37));
        getContentPane().add(txtnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 246, 290, 37));
        getContentPane().add(txtnote, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 343, 290, 37));

        tblKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? kh??ch h??ng", "T??n kh??ch h??ng", "S??? ??i???n tho???i", "Ghi ch??"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKH);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 416, 1024, 283));

        btnGetdata.setText("L???y d??? li???u");
        btnGetdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetdataMouseClicked(evt);
            }
        });
        getContentPane().add(btnGetdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 110, 98, 38));

        btnXoa.setText("X??a");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 110, 93, 38));

        btnthem.setText("Th??m");
        btnthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthemMouseClicked(evt);
            }
        });
        getContentPane().add(btnthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 166, 98, 44));

        btnthoat.setText("Tho??t");
        btnthoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthoatMouseClicked(evt);
            }
        });
        getContentPane().add(btnthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 166, 93, 44));

        btnsua.setText("S???a");
        btnsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsuaMouseClicked(evt);
            }
        });
        getContentPane().add(btnsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 227, 98, 42));

        btnsearch.setBackground(new java.awt.Color(0, 204, 204));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("t??m ki???m");
        btnsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsearchMouseClicked(evt);
            }
        });
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 340, 93, 42));

        txttimkiem.setText(" ");
        getContentPane().add(txttimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 340, 234, 32));

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
        getContentPane().add(btnquaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 301, 98, 33));

        btnnl.setText("Nh???p l???i");
        btnnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnlMouseClicked(evt);
            }
        });
        getContentPane().add(btnnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 228, 93, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanliquantrasua/main-background1.jpg"))); // NOI18N
        jLabel6.setText(" ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1030, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetdataMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblKH.getModel();
         model.setRowCount(30);
         model.setColumnCount(4);
        tblKH.removeAll();
        try{
            connectkhachhang kn = new connectkhachhang();
            try (ResultSet rs = kn.getData("khachhang")){
                int i=0;
                while (rs.next()){
                    tblKH.setValueAt(rs.getString("ID"), i, 0);
                    tblKH.setValueAt(rs.getString("Username"), i, 1);
                    tblKH.setValueAt(rs.getString("Number"), i, 2);
                    tblKH.setValueAt(rs.getString("ghichu"), i, 3);

                    i++;
                }
            }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetdataMouseClicked

    private void btnthemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseClicked
        // TODO add your handling code here:
         if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p  m?? !");
        }
        else if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n  !");
        }
                     else  if(txtnumber.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p s??? ??i???n tho???i  !");
        }
                      else  if(txtnote.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p ghi ch??!");
        }
       
                       else{
        try {
 // TODO add your handling code here:
            connectkhachhang kn = new connectkhachhang();
            java.sql.ResultSet rs = null;
            rs = kn.getData("khachhang");
            boolean ok=false;
            while(rs.next())
            {   
            if(txtid.getText().equals(rs.getString("ID")))
            {
              ok=true;
            }
            
            }
            if(ok)
            {
                JOptionPane.showMessageDialog(null, "M?? kh??ch h??ng ???? t???n t???i");
            }
            else
            {
            kn.Insert(Integer.parseInt(txtid.getText()), txtname.getText(), Integer.parseInt(txtnumber.getText()), txtnote.getText());
            btnthem.doClick();
            loadData();
            }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
              } catch (SQLException ex) {
                    Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
              }
 }
    }//GEN-LAST:event_btnthemMouseClicked

    private void btnsuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseClicked
        // TODO add your handling code here:
         try {
 // TODO add your handling code here:
     connectkhachhang pt = new connectkhachhang();
     pt.Update(Integer.parseInt(txtid.getText()),txtname.getText(),Integer.parseInt(txtnumber.getText()),txtnote.getText());
     btnsua.doClick();
     loadData();
 } catch (ClassNotFoundException ex) {
 
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 }
    }//GEN-LAST:event_btnsuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
         try {
 // TODO add )your handling code here:
    connectkhachhang pt = new connectkhachhang();
    pt.Delete(Integer.parseInt(txtid.getText()));
     }
     
      catch (ClassNotFoundException ex) {
        Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
      } catch (SQLException ex) {
        Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
             DefaultTableModel model = (DefaultTableModel) tblKH.getModel();
            model.setRowCount(0);
                loadData();
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnthoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnthoatMouseClicked

    private void tblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMouseClicked
        // TODO add your handling code here:
            int row = tblKH.getSelectedRow();
        String id = tblKH.getValueAt(row, 0).toString();
        String name = tblKH.getValueAt(row, 1).toString();
        String number = tblKH.getValueAt(row, 2).toString();
        String note = tblKH.getValueAt(row, 3).toString();
        
        txtid.setText(id);
        txtname.setText(name);
        txtnumber.setText(number);
        txtnote.setText(number);
    
    }//GEN-LAST:event_tblKHMouseClicked

    private void btnsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearchMouseClicked
        // TODO add your handling code here:
          String tim = txttimkiem.getText();
     
         DefaultTableModel model = (DefaultTableModel) tblKH.getModel();
           model.setRowCount(0);
        tblKH.removeAll();
         model.setRowCount(100);
         model.setColumnCount(4);
  if(tim.equals(""))
 {
     loadData();
 }
  else
  {
  try {
 connectkhachhang pt = new connectkhachhang();
 java.sql.ResultSet rs = null;

     rs = pt.Timkiem(tim);
     int i=0;
     while (rs.next()){
         tblKH.setValueAt(rs.getString("ID"), i, 0);
         tblKH.setValueAt(rs.getString("Username"), i, 1);
         tblKH.setValueAt(rs.getString("number"), i, 2);
         tblKH.setValueAt(rs.getString("ghichu"), i, 3);
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
    }//GEN-LAST:event_btnsearchMouseClicked

    private void btnquaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquaylaiMouseClicked
        // TODO add your handling code here:
           menu a = new menu();
          a.setVisible(true);
                a.setLocationRelativeTo(null);
          this.setVisible(false); 
    }//GEN-LAST:event_btnquaylaiMouseClicked

    private void btnnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnlMouseClicked
        // TODO add your handling code here:
           txtid.setText("");
        txtname.setText("");
        txtnumber.setText("");
        txtnote.setText("");
    }//GEN-LAST:event_btnnlMouseClicked

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_Khachhang a = new frm_Khachhang();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetdata;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnnl;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKH;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnote;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
