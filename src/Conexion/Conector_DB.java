/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author EGcri
 */

import java.sql.*;
public class Conector_DB {

        String url = "jdbc:mysql://localhost:3306/postulantesdb";
        String username = "PostulantesdbUser";
        String password = "159357";

        
       public void conenector()
       {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();            
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        public static void close(PreparedStatement stmt){
            try {
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        public static void close(Connection conn){
            try {
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);
            }
        }
}
       
   

