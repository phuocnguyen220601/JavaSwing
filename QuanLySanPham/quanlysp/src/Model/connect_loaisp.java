/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 84867
 */
public class connect_loaisp {
     static com.sun.jdi.connect.spi.Connection getconnect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private final Connection conn;
    public connect_loaisp() throws ClassNotFoundException, SQLException{
       //Nạp trình điều khiển
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/ql_sanpham";//Đường dẫn vào Data Base
        this.conn=DriverManager.getConnection(url,"root","");
    }
     public ResultSet GetData(String tbname) throws SQLException{
        
       ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from "+tbname;
       kq=statement.executeQuery(sql);
      return kq;
     }
public void Insert(String tbname,String maloai,String tenloai) throws SQLException{ 
      Statement sta = this.conn.createStatement();
      String sql1 = "Insert into "+tbname+" values ('"+maloai+"','"+tenloai+"')";
      sta.executeUpdate(sql1);
      }
public void Insertsp(String tbname,String maloai,String tenloai,int dongia,String loaisp) throws SQLException{ 
      Statement sta = this.conn.createStatement();
      String sql1 = "Insert into "+tbname+" values ('"+maloai+"','"+tenloai+"',"+dongia+",'"+loaisp+"')";
      sta.executeUpdate(sql1);
      }
 public void Update(String tbname,String maloai,String tenloai) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql1 ="Update "+tbname+" set tenloai='"+tenloai+"' where maloai ='"+maloai+"'";
 sta.executeUpdate(sql1);
}
  public void Updatesp(String tbname,String masp,String tensp,int dongia,String maloai) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql1 ="Update "+tbname+" set tensp='"+tensp+"',dongia = "+dongia+",maloai = '"+maloai+"' where masp ='"+masp+"'";
 sta.executeUpdate(sql1);
}
   public void Delete(String tbname,String id) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql ="delete from "+tbname+" where maloai ='"+id+"'";
 sta.executeUpdate(sql);
 }
      public void Deletesp(String tbname,String id) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql ="delete from "+tbname+" where masp ='"+id+"'";
 sta.executeUpdate(sql);
 }
    public ResultSet Timkiemtheoten(String timkiem) throws SQLException
 {
   
      ResultSet kq = null;
       Statement statement = this.conn.createStatement();
      String sql = "select * from sanpham where tensp like N'%"+timkiem+"%'";
    //  String sql = "select * from sanpham where tensp = 'Bánh Mỳ'";
      
       kq=statement.executeQuery(sql);
      return kq;
 }
      public ResultSet Timkiemtheogia(String timkiem1,String timkiem2) throws SQLException
 {
   
      ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from sanpham where dongia >= "+Integer.parseInt(timkiem1)+"  && dongia <= "+Integer.parseInt(timkiem2)+"";
       kq=statement.executeQuery(sql);
      return kq;
 }
   public void Close() throws SQLException {
        conn.close();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   