/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 84867
 */
public class QL_SANPHAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        connect_loaisp kn = new connect_loaisp();
    ResultSet rs = null;
    rs = kn.GetData("loaisp");
    while(rs.next())
     {
      /*   System.out.print(rs.getString("Username")+ "   ");
         System.out.print(rs.getString("Password")+ "   ");
         System.out.print(rs.getString("Number"));
         System.out.println("");*/
         System.out.print(rs.getString(1)+ "   ");
         System.out.print(rs.getString(2)+ "   ");
         System.out.println("");
     }
 
    }
    
}
