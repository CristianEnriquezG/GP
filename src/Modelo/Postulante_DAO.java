/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author MC1
 */
public class Postulante_DAO {

    public void insertar(PostulanteDTO post) {
        //Conexion c = new Conexion();
        String sql = "INSERT INTO postulante(dni,apellido,nombre,domicilio,telefono,email,estado) VALUES(?,?,?,?,?,?,?);";
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            
            ps.setInt(1,post.getDni());
            ps.setString(2,post.getApellido());
            ps.setString(3, post.getNombre());
            ps.setString(4,post.getDomicilio());
            ps.setLong(5, post.getTelefono());
            ps.setString(6,post.getEmail());
            ps.setBoolean(7,post.isEstado());
            
            ps.executeUpdate();
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            //Conector_DB.close(ps);
            //Conector_DB.close(c);
            try {
                if(ps != null) ps.close();
                if(c != null) c.close();
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}