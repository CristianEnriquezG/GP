/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EGcri
 */
public class UsuarioDaoJDBC implements UsuarioDao{
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT uidUsuario, nombreUsuario, contraseñaUsuario, permisosUsuario, activo FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(nombreUsuario, contraseñaUsuario, permisosUsuario, activo) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET nombreUsuario=?, contraseñaUsuario=?, permisosUsuario=?";
    private static final String SQL_DELETE = "UPDATE usuario SET activo=? WHERE uidUsuario =?";
    private static final String SQL_SEARCH = "SELECT uidUsuario, nombreUsuario, contraseñaUsuario, permisosUsuario, activo FROM usuario WHERE nombreUsuario =?";


    public List<Usuario> select(){
        
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario Usuario = null;
        List<Usuario> Usuarios = new ArrayList<Usuario>();
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int uidUsuario = rs.getInt("uidUsuario");
                String nombreUsuario = rs.getString("nombreUsuario");
                String contraseñaUsuario = rs.getString("contraseñaUsuario");
                int permisosUsuario = rs.getInt("permisosUsuario");
                boolean activo = rs.getBoolean("activo");
                
                Usuario = new Usuario(uidUsuario,nombreUsuario,contraseñaUsuario,permisosUsuario,activo);
                Usuarios.add(Usuario);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            Conector_DB.close(rs);
            Conector_DB.close(stmt);
            if(this.ConexionDB == null)
            {
                Conector_DB.close(Conexion);
            }
        }
        return Usuarios;
    }

    public int insert(Usuario Usuario){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_INSERT);
            stmt.setString(1,Usuario.getNombreUsuario());
            stmt.setString(2,Usuario.getContraseñaUsuario());
            stmt.setInt(3,Usuario.getPermisosUsuario());
            stmt.setBoolean(4,Usuario.isActivo());
            rows = stmt.executeUpdate();
        }catch ( Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            Conector_DB.close(stmt);
            if(this.ConexionDB == null)
                {
                    Conector_DB.close(Conexion);
                }
        }

        return rows;
    }

    public int update(Usuario Usuario){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_UPDATE);
            stmt.setString(1,Usuario.getNombreUsuario());
            stmt.setString(2,Usuario.getContraseñaUsuario());
            stmt.setInt(3,Usuario.getPermisosUsuario());
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            Conector_DB.close(stmt);
            if(this.ConexionDB == null)
            {
                Conector_DB.close(Conexion);
            }

        return rows;
        }
    }

    public int delete(Usuario Usuario){
        Connection Conexion = null;
        PreparedStatement stmt = null;        
        int rows = 0;
        try
        {
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_DELETE);
            stmt.setBoolean(1,false);
            stmt.setInt(2,Usuario.getUidUsuario());
            rows = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
        Conector_DB.close(stmt);
            if(this.ConexionDB == null)
            {
                Conector_DB.close(Conexion);
            }
        }
        return rows;
    }
     
    public Usuario search(String nombreUsuario){
        Usuario usuario = null;
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_SEARCH);
            stmt.setString(1,nombreUsuario);
            rs = stmt.executeQuery();
            while(rs.next()){
                int uidUsuario = rs.getInt("uidUsuario");
                String contraseñaUsuario = rs.getString("contraseñaUsuario");
                int permisosUsuario = rs.getInt("permisosUsuario");
                boolean activo = rs.getBoolean("activo");
                usuario = new Usuario(uidUsuario,nombreUsuario,contraseñaUsuario,permisosUsuario,activo);
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            Conector_DB.close(stmt);
            if(this.ConexionDB == null) Conector_DB.close(Conexion);
        }
        return usuario;
    }
}
