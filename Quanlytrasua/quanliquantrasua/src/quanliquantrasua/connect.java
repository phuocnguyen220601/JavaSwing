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
public class connect {

    static com.sun.jdi.connect.spi.Connection getconnect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final Connection conn;
    public connect() throws ClassNotFoundException, SQLException{
       //Nạp trình điều khiển
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/quanliquantrasua";//Đường dẫn vào Data Base
        this.conn=DriverManager.getConnection(url,"root","");
    }
     public ResultSet GetData(String tbname) throws SQLException{
        
       ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from sanpham";
       kq=statement.executeQuery(sql);
      return kq;
     }
       public void Insert(int id,String tensp,int dongia,String nguyenlieu) throws SQLException{ 
      Statement sta = this.conn.createStatement();
      String sql1 = "Insert into sanpham values ("+id+",'"+tensp+"',"+dongia+",'"+nguyenlieu+"')";
      sta.executeUpdate(sql1);
      }
 public void Update(int id,String tensp,int dongia,String nguyenlieu) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql1 ="Update sanpham set tensp='"+tensp+"',dongia = "+dongia+",nguyenlieu='"+nguyenlieu+"' where id ="+id+"";
 sta.executeUpdate(sql1);
}
 public ResultSet Timkiem(String timkiem) throws SQLException
 {
   
      ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select * from sanpham where tensp like N'%"+timkiem+"%' or id like "+Integer.parseInt(timkiem)+"  or dongia like "+Integer.parseInt(timkiem)+"";
       kq=statement.executeQuery(sql);
      return kq;
 }
  public void Delete(int id) throws SQLException{
 Statement sta = this.conn.createStatement();
 String sql ="delete from sanpham where id ="+id+"";
 sta.executeUpdate(sql);
 }
     public static void main(String args[]) throws ClassNotFoundException, SQLException {
    connect kn = new connect();
    ResultSet rs = null;
    rs = kn.GetData("sanpham");
    while(rs.next())
     {
      /*   System.out.print(rs.getString("Username")+ "   ");
         System.out.print(rs.getString("Password")+ "   ");
         System.out.print(rs.getString("Number"));
         System.out.println("");*/
         System.out.print(rs.getString(1)+ "   ");
         System.out.print(rs.getString(2)+ "   ");
         System.out.print(rs.getString(3)+ "   ");
         System.out.print(rs.getString(4));
         System.out.println("");
     }
    String timkiem = "trà sữa";
    char[] ch = new char[50];
     timkiem.getChars(0,timkiem.length(), ch, 0);
     System.out.println(ch);
    }

    void Close() throws SQLException {
        conn.close();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ResultSet Timkiem(char[] ch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


//    com.sun.jdi.connect.spi.Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
