/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EGcri
 */
public class UsuarioDaoJDBC implements UsuarioDao{
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT uidUsuario, nombreUsuario, contraseñaUsuario, permisosUsuario FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(uidUsuario,nombreUsuario,contraseñaUsuario,permisosUsuario) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usario SET nombreUsuario=?, contraseñaUsuario=?, permisosUsuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario Where uidUsuario =?";


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
                String nombreUsuario = rs.getString("numbreUsuario");
                String contraseñaUsuario = rs.getString("contraseñaUsuario");
                int permisosUsuario = rs.getInt("permisosUsuario");
                
                Usuario = new Usuario(uidUsuario,nombreUsuario,contraseñaUsuario,permisosUsuario);
                Usuarios.add(Usuario);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
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
            stmt.setInt(1,Usuario.getUidUsuario());
            stmt.setString(2,Usuario.getNombreUsuario());
            stmt.setString(3,Usuario.getContraseñaUsuario());
            stmt.setInt(4,Usuario.getPermisosUsuario());
            rows = stmt.executeUpdate();
        }catch ( Exception e){
            System.out.println(e.getMessage());
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
            stmt.setInt(1,Usuario.getUidUsuario());
            stmt.setString(2,Usuario.getNombreUsuario());
            stmt.setString(3,Usuario.getContraseñaUsuario());
            stmt.setInt(4,Usuario.getPermisosUsuario());
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
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
            stmt.setInt(1,Usuario.getUidUsuario());
            rows = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
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
        
}
