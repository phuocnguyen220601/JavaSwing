/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author 84867
 */
public class QLSP2 extends javax.swing.JFrame {

    /**
     * Creates new form QLSP2
     */
    public QLSP2() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btnTimkiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        txttimkiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnguyenlieu = new javax.swing.JTextArea();
        btnquaylai = new javax.swing.JButton();
        btnnhaplai = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(54, 204, 234));
        jDesktopPane1.setForeground(new java.awt.Color(0, 181, 195));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSP.setBackground(new java.awt.Color(255, 153, 51));
        tblSP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblSP.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tên Sản Phẩm", "Đơn Giá", "Nguyên Liệu"
            }
        ));
        tblSP.setGridColor(new java.awt.Color(153, 255, 0));
        tblSP.setInheritsPopupMenu(true);
        tblSP.setSelectionBackground(new java.awt.Color(51, 204, 0));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);
        if (tblSP.getColumnModel().getColumnCount() > 0) {
            tblSP.getColumnModel().getColumn(0).setMinWidth(80);
            tblSP.getColumnModel().getColumn(0).setMaxWidth(90);
            tblSP.getColumnModel().getColumn(1).setMinWidth(200);
            tblSP.getColumnModel().getColumn(1).setMaxWidth(250);
            tblSP.getColumnModel().getColumn(2).setMinWidth(100);
            tblSP.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 313, 940, 230));

        btnTimkiem.setBackground(new java.awt.Color(255, 153, 51));
        btnTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 74, 81, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");
        jLabel1.setToolTipText("");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 859, 37));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Sản Phẩm :");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đơn Giá :");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nguyên Liệu :");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, -1));
        jDesktopPane1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 71, 362, -1));
        txtid.getAccessibleContext().setAccessibleName("");
        txtid.getAccessibleContext().setAccessibleDescription("");

        jDesktopPane1.add(txttensp, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 111, 362, -1));
        jDesktopPane1.add(txtdongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 160, 362, -1));
        jDesktopPane1.add(txttimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 71, 222, -1));

        btnThem.setBackground(new java.awt.Color(255, 153, 51));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 152, 113, 38));

        btnSua.setBackground(new java.awt.Color(255, 153, 51));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 152, 113, 38));

        btnXoa.setBackground(new java.awt.Color(255, 153, 51));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        jDesktopPane1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 208, 113, 38));

        btnThoat.setBackground(new java.awt.Color(255, 153, 51));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 264, 113, 38));

        txtnguyenlieu.setColumns(20);
        txtnguyenlieu.setRows(5);
        jScrollPane2.setViewportView(txtnguyenlieu);

        jDesktopPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 208, 362, 105));

        btnquaylai.setBackground(new java.awt.Color(255, 153, 51));
        btnquaylai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnquaylai.setForeground(new java.awt.Color(255, 255, 255));
        btnquaylai.setText("Quay lại");
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
        jDesktopPane1.add(btnquaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 264, 113, 38));

        btnnhaplai.setBackground(new java.awt.Color(255, 153, 51));
        btnnhaplai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnnhaplai.setForeground(new java.awt.Color(255, 255, 255));
        btnnhaplai.setText("Nhập lại ");
        btnnhaplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnhaplaiMouseClicked(evt);
            }
        });
        btnnhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaplaiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnnhaplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 208, 113, 38));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanliquantrasua/main-background1.jpg"))); // NOI18N
        jLabel6.setText(" ");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void loadData()
{
     DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
         model.setRowCount(100);
         model.setColumnCount(4);
    tblSP.removeAll();
 try {
 connect pt = new connect();
 java.sql.ResultSet rs = null;
  rs = pt.GetData("sanpham");
 int i=0;
 while (rs.next()){
 tblSP.setValueAt(rs.getString("id"), i, 0);
 tblSP.setValueAt(rs.getString("tensp"), i, 1);
 tblSP.setValueAt(rs.getString("dongia"), i, 2);
 tblSP.setValueAt(rs.getString("nguyenlieu"), i, 3);
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
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
             int row =tblSP.getSelectedRow();
             int s = tblSP.getSelectedColumn();
             int i=0;
        if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập  mã   !");
        }
        else if(txttensp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sản phẩm !");
        }
                     else  if(txtdongia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đơn giá !");
        }
                      else  if(txtnguyenlieu.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập nguyên liệu ");
        }
        
                       else{
        try {
 // TODO add your handling code here:
 connect pt = new connect();  
 java.sql.ResultSet rs = null;
  rs = pt.GetData("sanpham");
  boolean ok=false;
  while(rs.next())
  {
      if(txtid.getText().equals(rs.getString("id")))
      {
          ok = true;
     }
      }
  if(ok)
  {
      JOptionPane.showMessageDialog(null, "Mã tài khoản đã có");
  }
  else
  {
  pt.Insert(Integer.parseInt(txtid.getText()),txttensp.getText(),Integer.parseInt(txtdongia.getText()),txtnguyenlieu.getText());
  btnThem.doClick();
  JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công ");
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
 // TODO add your handling code here:
     connect pt = new connect();
     pt.Update(Integer.parseInt(txtid.getText()),txttensp.getText(),Integer.parseInt(txtdongia.getText()),txtnguyenlieu.getText());
     btnSua.doClick();
     JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công ");
     loadData();
 } catch (ClassNotFoundException ex) {
 
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
         try {
 // TODO add )your handling code here:
    connect pt = new connect();
    pt.Delete(Integer.parseInt(txtid.getText()));
     }
     
  catch (ClassNotFoundException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
 } catch (SQLException ex) {
Logger.getLogger(FrameConnection.class.getName()).log(Level.SEVERE,null, ex);
 }
     DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
       model.setRowCount(0);
       JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công ");
        loadData();
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked

     
         DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
           model.setRowCount(0);
        tblSP.removeAll();
         model.setRowCount(100);
         model.setColumnCount(4);
  if(txttimkiem.getText().equals(""))
 {
     loadData();
 }
  else
  {
  try {
   String timkiem= txttimkiem.getText();
 connect pt = new connect();
 java.sql.ResultSet rs = null;
     rs = pt.Timkiem(timkiem.trim());
     int i=0;
     while (rs.next()){
         tblSP.setValueAt(rs.getString("id"), i, 0);
         tblSP.setValueAt(rs.getString("tensp"), i, 1);
         tblSP.setValueAt(rs.getString("dongia"), i, 2);
         tblSP.setValueAt(rs.getString("nguyenlieu"), i, 3);
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
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
          int row =tblSP.getSelectedRow();
        String id=tblSP.getValueAt(row,0).toString();
        String tensp=tblSP.getValueAt(row,1).toString();
         String dongia=tblSP.getValueAt(row,2).toString();
          String nguyenlieu=tblSP.getValueAt(row,3).toString();
           
            txtid.setText(id);
            txttensp.setText(tensp);
            txtdongia.setText(dongia);
            txtnguyenlieu.setText(nguyenlieu);
             
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btnnhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaplaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnhaplaiActionPerformed

    private void btnnhaplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhaplaiMouseClicked
        // TODO add your handling code here:
           txtid.setText("");
            txttensp.setText("");
            txtdongia.setText("");
            txtnguyenlieu.setText("");
    }//GEN-LAST:event_btnnhaplaiMouseClicked

    private void btnquaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquaylaiMouseClicked
           menu a = new menu();
          a.setVisible(true);
                a.setLocationRelativeTo(null);
          this.setVisible(false); 
    }//GEN-LAST:event_btnquaylaiMouseClicked

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimkiemActionPerformed
    
        
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
            java.util.logging.Logger.getLogger(QLSP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                QLSP2 a = new QLSP2();
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
    private javax.swing.JButton btnnhaplai;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtnguyenlieu;
    private javax.swing.JTextField txttensp;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}