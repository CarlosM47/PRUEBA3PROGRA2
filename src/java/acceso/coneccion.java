/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class coneccion {
    


/**
 *
 * @author ricardotoledo
 */


    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public coneccion() {

        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "yagami47";
        String url = "jdbc:mysql://localhost:3306/prueba";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            System.out.println("Error de conexion!!" + ex.getMessage());
        }
    }
    //select * from ciudad
    public void setConsult(String sql) {
        try {
            stmt = con.createStatement();
            stmt.executeQuery(sql);
            rs = stmt.getResultSet();
        } catch (SQLException ex) {
     
        }
    }
  
 public Connection getConeccion(){
        return con;
    }    

//devolver el listado de ciudades
    public ResultSet getResult(){
        return rs;
    }
    
   
    public void setInsert(String sql){
        try {
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
        }
      
    }
}









