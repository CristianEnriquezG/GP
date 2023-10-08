package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PuestoDaoJDBC implements PuestoDao {
    
    private static final String SQL_SELECT = "SELECT * FROM puesto";
    private static final String SQL_INSERT = "INSERT INTO puesto(nombre,descripcion,fecha_inicio,fecha_cierre,estado_convocatoria) VALUES (?,?,?,?,?);";
    private static final String SQL_UPDATE = "UPDATE puesto SET nombre = ?, descripcion = ?, fecha_inicio = ?, fecha_cierre = ?, estado_convocatoria = ? WHERE cod_puesto = ?;";
    private static final String SQL_DELETE = "";

    @Override
    public List<Puesto> select(){
        List<Puesto> ListaPuesto = new ArrayList<>();
        String sql = SQL_SELECT;
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Puesto p = new Puesto();
                p.setCodPuesto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setFechaInicio(rs.getDate(4));
                p.setFechaCierre(rs.getDate(5));
                p.setEstadoConvocatoria(rs.getString(6));
                ListaPuesto.add(p);
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
        return ListaPuesto;
    }
    
    // Este método devuelve el Puesto de acuerdo al parámetro codPuesto, o NULL si no se encuentra
    public Puesto select(int codPuesto) {
        Puesto p = null;
        String sql = "SELECT * FROM puesto WHERE cod_puesto = ?";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, codPuesto);
            rs = ps.executeQuery();
            if(rs.next()) {
                p = new Puesto();
                p.setCodPuesto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setFechaInicio(rs.getDate(4));
                p.setFechaCierre(rs.getDate(5));
                p.setEstadoConvocatoria(rs.getString(6));
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
        return p;
    }
    
    // Este método se utiliza para obtener el puesto de acuerdo a mes y año, para usar en Calendario
    public ArrayList<Puesto> select(int mes, int año) {
        ArrayList<Puesto> ListaPst = new ArrayList<>();
        String sql = "SELECT nombre,fecha_cierre FROM puesto WHERE YEAR(fecha_cierre) = ? AND MONTH(fecha_cierre) = ? AND estado_convocatoria = 'abierta';";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
            rs = ps.executeQuery();
            while(rs.next()) {
                Puesto p = new Puesto();
                
                p.setNombre(rs.getString(1));
                p.setFechaCierre(rs.getDate(2));
                
                ListaPst.add(p);
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
        return ListaPst;
    }
    
    // Este método devuelve además la clave insertada
    @Override
    public int insert(Puesto Puesto){
        int clave = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,Puesto.getNombre());
            ps.setString(2,Puesto.getDescripcion());
            ps.setDate(3,Puesto.getFechaInicio());
            ps.setDate(4,Puesto.getFechaCierre());
            ps.setString(5,Puesto.getEstadoConvocatoria());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
                if(rs.next()) {
                    clave = rs.getInt(1);
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
        return clave;
    }

    @Override
    public int update(Puesto Puesto){
        int rows = 0;
        String sql = SQL_UPDATE;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1,Puesto.getNombre());
            ps.setString(2,Puesto.getDescripcion());
            ps.setDate(3,Puesto.getFechaInicio());
            ps.setDate(4,Puesto.getFechaCierre());
            ps.setString(5,Puesto.getEstadoConvocatoria());
            ps.setInt(6,Puesto.getCodPuesto());
            ps.executeUpdate();
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return rows;
    }

    @Override
    public int delete(Puesto Puesto){
        int rows = 0;

        return rows;
    }
}