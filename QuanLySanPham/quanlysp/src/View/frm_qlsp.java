/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.connect_loaisp;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84867
 */
public class frm_qlsp extends javax.swing.JFrame {

    /**
     * Creates new form frm_qlsp
     */
    public frm_qlsp() {
        initComponents();
        loadData();
    }
        @SuppressWarnings("unchecked")
public void loadData()
{
     DefaultTableModel model = (DefaultTableModel) tb_sanpham.getModel();
          model.setRowCount(100);
         model.setColumnCount(4);
         tb_sanpham.removeAll();
        
   
 try {
 connect_loaisp pt = new connect_loaisp();
 java.sql.ResultSet rs = null;
  rs = pt.GetData("sanpham");
 int i=0;
 Vector<String> data = new Vector<String>();
 data.addElement("Xin vui long chon");
 while (rs.next()){
 data.addElement(rs.getString("maloai"));
cb_loaisp.setModel(new DefaultComboBoxModel(data));
 tb_sanpham.setValueAt(rs.getString("masp"), i, 0);
 tb_sanpham.setValueAt(rs.getString("tensp"), i, 1);
tb_sanpham.setValueAt(rs.getString("dongia"), i, 2);
tb_sanpham.setValueAt(rs.getString("maloai"), i, 3);
 i++;
 }
       pt.Close();
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 } catch (SQLException ex) {
Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, 
ex);
 }
}
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_masp = new javax.swing.JTextField();
        txt_tensp = new javax.swing.JTextField();
        txt_dongia = new javax.swing.JTextField();
        btn_thoat = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_sanpham = new javax.swing.JTable();
        cb_loaisp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Ma san pham :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Ten san pham :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Don gia :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Loai san pham :");

        txt_masp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txt_tensp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txt_dongia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btn_thoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_thoat.setText("Thoat");
        btn_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thoatMouseClicked(evt);
            }
        });
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_xoa.setText("Xoa");
        btn_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaMouseClicked(evt);
            }
        });

        btn_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_them.setText("Them");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_sua.setText("Sua");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });

        tb_sanpham.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã sản phẩm", "Tên sản phẩm", "Đơn Giá", "Loại sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_sanpham);

        cb_loaisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_loaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addComponent(txt_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_thoat)
                    .addComponent(cb_loaisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanphamMouseClicked
        // TODO add your handling code here:
        int row = tb_sanpham.getSelectedRow();
        if (row >= 0) {
            String maSP = (String) tb_sanpham.getValueAt(row, 0);
            String tenSP = (String) tb_sanpham.getValueAt(row, 1);
            String giaBan = (String) tb_sanpham.getValueAt(row, 2);
            String loaiSP = (String) tb_sanpham.getValueAt(row, 3);
            txt_masp.setText(maSP);
            txt_tensp.setText(tenSP);
            txt_dongia.setText(giaBan);
            cb_loaisp.setSelectedItem(loaiSP);
        } 
    }//GEN-LAST:event_tb_sanphamMouseClicked

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        // TODO add your handling code here:
        int row = tb_sanpham.getSelectedRow();
        int s = tb_sanpham.getSelectedColumn();
        int i = 0;
        if (txt_masp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập  mã   !");
        } else if (txt_tensp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sản phẩm !");
        } 
        else if (txt_dongia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập gia sản phẩm !");
        }
        else if (cb_loaisp.getSelectedItem().toString().equals("Xin vui long chon")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ma loai sản phẩm !");
        }
        else {
            try {
                // TODO add your handling code here:
                connect_loaisp pt = new connect_loaisp();
                java.sql.ResultSet rs = null;
                rs = pt.GetData("sanpham");
                boolean ok = false;
                while (rs.next()) {
                    if (txt_masp.getText().equals(rs.getString("masp"))) {
                        ok = true;
                    }
                }
                if (ok) {
                    JOptionPane.showMessageDialog(null, "Mã san pham đã có");
                } else {
                    pt.Insertsp("sanpham",txt_masp.getText(), txt_tensp.getText(),Integer.parseInt(txt_dongia.getText()),cb_loaisp.getSelectedItem().toString());
                    btn_them.doClick();
                    JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công ");
                    loadData();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_themMouseClicked

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
         if (txt_masp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập  mã   !");
        } else if (txt_tensp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sản phẩm !");
        } 
        else if (txt_dongia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập gia sản phẩm !");
        }
        else if (cb_loaisp.getSelectedItem().toString().equals("Xin vui long chon")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ma loai sản phẩm !");
        }
        else {
        try {
            // TODO add your handling code here:
            connect_loaisp pt = new connect_loaisp();
            pt.Updatesp("sanpham", txt_masp.getText(), txt_tensp.getText(),Integer.parseInt(txt_dongia.getText()),cb_loaisp.getSelectedItem().toString());
            btn_sua.doClick();
            JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công ");
            loadData();
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null,
                    ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
        }
    }//GEN-LAST:event_btn_suaMouseClicked

    private void btn_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseClicked
        // TODO add your handling code here:
          try {
            // TODO add )your handling code here:
            connect_loaisp pt = new connect_loaisp();
            pt.Deletesp("sanpham",txt_masp.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_qlsp.FrameConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) tb_sanpham.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công ");
        loadData();
        
    }//GEN-LAST:event_btn_xoaMouseClicked

    private void btn_thoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thoatMouseClicked
        // TODO add your handling code here:
           frm_Admin a = new frm_Admin();
             a.setVisible(true);
                a.setLocationRelativeTo(null);
          this.setVisible(false); 
    }//GEN-LAST:event_btn_thoatMouseClicked

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(frm_qlsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_qlsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_qlsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_qlsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_qlsp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_loaisp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_sanpham;
    private javax.swing.JTextField txt_dongia;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextField txt_tensp;
    // End of variables declaration//GEN-END:variables
private static class FrameConnection {

        public FrameConnection() {
        }
    }
}