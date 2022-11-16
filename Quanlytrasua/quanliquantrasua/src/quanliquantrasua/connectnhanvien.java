/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquantrasua;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 84867
 */
public class connectnhanvien {
    private final Connection conn;
    public connectnhanvien() throws ClassNotFoundException, SQLException{
       //Nạp trình điều khiển
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/quanliquantrasua";//Đường dẫn vào Data Base
        this.conn=DriverManager.getConnection(url,"root","");
    }
     public ResultSet GetData(String tbname) throws SQLException{
        
       ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from nhanvien";
       kq=statement.executeQuery(sql);
      return kq;
     }
       public void Insert(int manhanvien,String tennhanvien,String quequan,int cmnd,int sdt,int tuoi) throws SQLException{ 
      Statement sta = this.conn.createStatement();
      String sql1 = "Insert into nhanvien values ("+manhanvien+",'"+tennhanvien+"','"+quequan+"',"+cmnd+","+sdt+","+tuoi+" )";
      sta.executeUpdate(sql1);
      }
 public void Update(int manhanvien,String tennhanvien,String quequan,int cmnd,int sdt,int tuoi) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql1 ="Update nhanvien set tennhanvien='"+tennhanvien+"',quequan='"+quequan+"',cmnd = "+cmnd+",sdt = "+sdt+",tuoi = "+tuoi+" where manhanvien ="+manhanvien+"";
 sta.executeUpdate(sql1);
}
  public ResultSet Timkiem(String timkiem) throws SQLException
 {
      ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from nhanvien where manhanvien like "+Integer.parseInt(timkiem)+" or sdt like "+Integer.parseInt(timkiem)+"";
       kq=statement.executeQuery(sql);
      return kq;
 }
  public void Delete(int manhanvien) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql ="delete from nhanvien where manhanvien ="+manhanvien+"";
 sta.executeUpdate(sql);
 }
     public static void main(String args[]) throws ClassNotFoundException, SQLException {
    connectnhanvien kn = new connectnhanvien();
    ResultSet rs = null;
    rs = kn.GetData("nhanvien");
    while(rs.next())
     {
      /*   System.out.print(rs.getString("Username")+ "   ");
         System.out.print(rs.getString("Password")+ "   ");
         System.out.print(rs.getString("Number"));
         System.out.println("");*/
         System.out.print(rs.getString(1)+ "   ");
         System.out.print(rs.getString(2)+ "   ");
         System.out.print(rs.getString(3)+ "   ");
           System.out.print(rs.getString(4)+ "   ");
             System.out.print(rs.getString(5)+ "   ");
         System.out.print(rs.getString(6));
         System.out.println("");
     } 
    }

    void Close() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Delete(String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


//    com.sun.jdi.connect.spi.Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
