/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EGcri
 */

import java.sql.*;
public class Conector_DB {

        private static String url = "jdbc:mysql://localhost:3306/postulantesdb";
        private static String username = "PostulantesdbUser";
        private static String password = "159355";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, username, password);
        }
        
        public static void close(ResultSet rs){
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace(System.out);
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
       
   

