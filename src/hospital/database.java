/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sohail
 */
public class database {
 Connection con=null;
 Statement st=null;
 ResultSet rs=null;
 
Connection createdatabase(){
    try{
       con=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital", "ali", "ali"); 
       return con;
    }
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    return null;
} 
          
 
}
