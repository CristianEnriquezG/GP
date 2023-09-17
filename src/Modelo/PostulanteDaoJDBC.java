package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostulanteDaoJDBC implements PostulanteDao {

    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT cod_postulante,dni,apellido,nombre,domicilio,telefono,email,estado FROM postulante";
    private static final String SQL_INSERT = "INSERT INTO postulante(cod_postulante,dni,apellido,nombre,domicilio,telefono,email,estado) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE postulante SET nombre=?, apellido=?, domicilio=?, telefono=?, email=? WHERE cod_postulante = ?";
    private static final String SQL_DELETE = "UPDATE postulante SET estado=? WHERE cod_postulante=?";


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

    public int insert(Postulante Postulante){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_INSERT);
            stmt.setInt(1,Postulante.getCod_postulante());
            stmt.setInt(2,Postulante.getDNI());
            stmt.setString(3,Postulante.getApellido());
            stmt.setString(4,Postulante.getNombre());
            stmt.setString(5,Postulante.getDomicilio());
            stmt.setString(6,Postulante.getTelefono());
            stmt.setString(7,Postulante.getEmail());
            stmt.setBoolean(8,Postulante.getEstado());
            rows = stmt.executeUpdate();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
        finally {             
            Conector_DB.close(stmt);
            if(this.ConexionDB == null)
                {
                    Conector_DB.close(Conexion);
                }
        }
        return rows;
    }

    public int update(Postulante Postulante){
     Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            //mensaje
            stmt = Conexion.prepareStatement(SQL_UPDATE);
            stmt.setString(1,Postulante.getNombre());
            stmt.setString(2,Postulante.getApellido());
            stmt.setString(3,Postulante.getDomicilio());
            stmt.setString(4,Postulante.getTelefono());
            stmt.setString(5,Postulante.getEmail());

            rows = stmt.executeUpdate();
            //mensaje

        }
        catch(Exception e){
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

    public int delete(Postulante Postulante){
        Connection Conexion = null;
        PreparedStatement stmt = null;        
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();

            stmt = Conexion.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Postulante.getCod_postulante());
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
}
