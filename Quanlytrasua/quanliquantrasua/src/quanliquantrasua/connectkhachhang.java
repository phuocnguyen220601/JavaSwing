/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquantrasua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class connectkhachhang {
    private final Connection conn;   
    //private Object con;
        public connectkhachhang() throws ClassNotFoundException, SQLException{
           //Nạp trình điều khiển
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Tạo kết nối
            String url="jdbc:mysql://localhost:3306/quanliquantrasua";//Đường dẫn vào Data Base
            this.conn=DriverManager.getConnection(url,"root","");
            //Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sinhvien","root","");
        }
        public ResultSet getData(String tbName) throws SQLException{
            ResultSet rs =null;
            //Tạo đối tượng Statement()
            Statement ts= this.conn.createStatement();
            String sql="select * from "+tbName;
            //Két quả trả về được lưu trong rs
            rs=ts.executeQuery(sql);
            return rs;
        }
        public void Insert(int id,String name,int number, String note ) throws SQLException{
                 Statement ts= this.conn.createStatement();
                 String sql1 = "Insert khachhang values("+id+",'"+name+"',"+number+",'"+note+"')";
                 ts.executeUpdate(sql1);
      } 
      
        public void Update(int id,String name,int number,String note) throws SQLException{
            Statement sta = this.conn.createStatement();
            String sql1 ="Update khachhang set Username='"+name+"',Number = "+ number+",ghichu='"+note+"' where ID ="+id+"";
            sta.executeUpdate(sql1);
}
          public ResultSet Timkiem(String timkiem ) throws SQLException
 {
      ResultSet kq = null;
       Statement statement = this.conn.createStatement();
       String sql = "select *from khachhang where id like "+Integer.parseInt(timkiem)+" or number like "+Integer.parseInt(timkiem)+"";
       kq=statement.executeQuery(sql);
      return kq;
 }
        public void Delete(int id) throws SQLException{
            Statement ts = this.conn.createStatement();
            String sql ="delete from khachhang where ID ="+id+"";
            ts.executeUpdate(sql);           
        }
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
        connectkhachhang kn = new connectkhachhang();
        ResultSet rs = null;
        rs = kn.getData("khachhang");
    while(rs.next())
     {
      /*   System.out.print(rs.getString("Username")+ "   ");
         System.out.print(rs.getString("Password")+ "   ");
         System.out.print(rs.getString("Number"));
         System.out.println("");*/
         System.out.print(rs.getString(1)+ "   ");
         System.out.print(rs.getString(2)+ "   ");
         System.out.print(rs.getString(3));
         System.out.println("");
    }
   
     }

    
}
