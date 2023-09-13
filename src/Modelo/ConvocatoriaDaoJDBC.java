package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConvocatoriaDaoJDBC implements ConvocatoriaDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT cod_convocatoria, titulo, descripcion, fecha_inicio, fecha_fin, estado FROM convocatoria";
    private static final String SQL_INSERT = "INSERT INTO convocatoria(cod_convocatoria, titulo, descripcion, fecha_inicio, fecha_fin, estado) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE convocatoria SET titulo=?. descripcion=?, fecha_inicio=?, fecha_fin=?, estado=? Where cod_convocatoria = ?";
    private static final String SQL_DELETE = "DELETE FROM convocatoria WHERE cod_convocatoria=?";


    public List<Convocatoria> select(){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Convocatoria convocatoria = null;
        List<Convocatoria> convocatorias = new ArrayList<Convocatoria>();
            try {
                Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
                stmt = Conexion.prepareStatement(SQL_SELECT);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    int cod_convocatoria = rs.getInt("cod_convocatoria");
                    String titulo = rs.getString("titulo");
                    String descripcion = rs.getString("descripcion");
                    String fecha_inicio = rs.getString("fecha_inicio");
                    String fecha_fin = rs.getString("fecha_fin");
                    String estado = rs.getString("estado");

                    convocatoria = new Convocatoria(cod_convocatoria,titulo,descripcion,fecha_inicio,fecha_fin,estado);
                    convocatorias.add(convocatoria);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                Conector_DB.close(rs);
                Conector_DB.close(stmt);
                if(this.ConexionDB == null)
                {
                    Conector_DB.close(Conexion);
                }
            }
        return convocatorias;
    }

    public int insert(Convocatoria convocatoria){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_INSERT);
            stmt.setInt(1, convocatoria.getCod_convocatoria());
            stmt.setString(2, convocatoria.getTitulo());
            stmt.setString(3, convocatoria.getDescripcion());
            stmt.setString(3,convocatoria.getFecha_inicio());
            stmt.setString(4, convocatoria.getFecha_fin());
            stmt.setString(5,convocatoria.getEstado());
            //mensaje
            rows = stmt.executeUpdate();
        }
        catch(Exception e){
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

    public int update(Convocatoria convocatoria){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            //mensaje
            stmt = Conexion.prepareStatement(SQL_UPDATE);
            stmt.setString(1,convocatoria.getTitulo());
            stmt.setString(2,convocatoria.getDescripcion());
            stmt.setString(3, convocatoria.getFecha_inicio());
            stmt.setString(4, convocatoria.getFecha_fin());
            stmt.setString(5, convocatoria.getEstado());

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

    public int delete(Convocatoria convocatoria){
        Connection Conexion = null;
        PreparedStatement stmt = null;        
        int rows = 0;
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();

            stmt = Conexion.prepareStatement(SQL_DELETE);
            stmt.setInt(1, convocatoria.getCod_convocatoria());
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
