package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostulanteDaoJDBC implements PostulanteDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT cod_postulante,dni,apellido,nombre,domicilio,telefono,email,estado FROM postulante";
    private static final String SQL_INSERT = "INSERT INTO postulante(dni,apellido,nombre,domicilio,telefono,email,estado) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE postulante SET apellido = ?, nombre = ?, domicilio = ?, telefono = ?, email = ?, estado = ? WHERE cod_postulante = ?";
    private static final String SQL_DELETE = "UPDATE postulante SET estado=? WHERE cod_postulante=?";
    private static final String SQL_FETCH = "SELECT * FROM postulante WHERE apellido=? AND nombre=?";
    private static final String SQL_FETCH_DNI = "SELECT * FROM postulante WHERE apellido=? AND nombre=?";
    @Override
    public List<Postulante> select(){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Postulante Postulante= null;        
        List<Postulante> Postulantes = new ArrayList<Postulante>();
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int cod_postulante=rs.getInt("cod_postulante");
                int dni = rs.getInt("dni");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                boolean estado = rs.getBoolean("estado");
                
                Postulante = new Postulante (cod_postulante,dni,apellido,nombre,domicilio,telefono,email,estado);
                Postulantes.add(Postulante);
            }
        }
        catch(Exception e)
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
        return Postulantes;
    }
    
    // Busca postulante por DNI, devuelve un obj Postulante si lo encuentra, tira NULL si no
    public Postulante select(int dni) {
        String sql = "SELECT * FROM postulante WHERE dni = ?;";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Postulante post = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if(rs.next()) {
                post = new Postulante();
                post.setCodPostulante(rs.getInt(1));
                post.setDni(rs.getInt(2));
                post.setApellido(rs.getString(3));
                post.setNombre(rs.getString(4));
                post.setDomicilio(rs.getString(5));
                post.setTelefono(rs.getString(6));
                post.setEmail(rs.getString(7));
                post.setEstado(rs.getBoolean(8));
            }
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Conector_DB.close(rs);
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return post;
    }

    @Override
    public int insert(Postulante Postulante){
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1,Postulante.getDni());
            ps.setString(2,Postulante.getApellido());
            ps.setString(3, Postulante.getNombre());
            ps.setString(4,Postulante.getDomicilio());
            ps.setString(5, Postulante.getTelefono());
            ps.setString(6,Postulante.getEmail());
            ps.setBoolean(7,Postulante.isEstado());
            ps.executeUpdate();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return rows;
    }
    
    @Override
    public int update(Postulante Postulante){
        int rows = 0;
        String sql = SQL_UPDATE;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1,Postulante.getApellido());
            ps.setString(2,Postulante.getNombre());
            ps.setString(3,Postulante.getDomicilio());
            ps.setString(4,Postulante.getTelefono());
            ps.setString(5,Postulante.getEmail());
            ps.setBoolean(6,Postulante.isEstado());
            ps.setInt(7,Postulante.getCodPostulante());
            ps.executeUpdate();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return rows;
    }

    @Override
    public int delete(Postulante Postulante){
        Connection Conexion = null;
        PreparedStatement stmt = null;        
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();

            stmt = Conexion.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Postulante.getCodPostulante());
            rows = stmt.executeUpdate();
            //mensaje

            
        } 
        catch(Exception e){
                System.out.println(e.getMessage());
            }
        finally{
            Conector_DB.close(stmt);
            if(this.ConexionDB == null){
                Conector_DB.close(Conexion);
            }
        }
        return rows;
    }
    
    @Override
    public Postulante fetch(String apellido, String nombre){
        Postulante postulante = null;
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_FETCH_DNI);
            stmt.setString(1, apellido);
            stmt.setString(2, nombre);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int cod_postulante=rs.getInt("cod_postulante");
                int dni = rs.getInt("dni");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                boolean estado = rs.getBoolean("estado");                
                postulante = new Postulante (cod_postulante,dni,apellido,nombre,domicilio,telefono,email,estado);
                
            }
        }
        catch(SQLException e)
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
        return postulante;
    }
   
    @Override
    public Postulante fetch(int DNI){
        Postulante postulante = null;
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_FETCH);
            stmt.setInt(1, DNI);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int cod_postulante=rs.getInt("cod_postulante");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                boolean estado = rs.getBoolean("estado");                
                postulante = new Postulante (cod_postulante,DNI,apellido,nombre,domicilio,telefono,email,estado);
                
            }
        }
        catch(SQLException e)
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
        return postulante;
    }
}