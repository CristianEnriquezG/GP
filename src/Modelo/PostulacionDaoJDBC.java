package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostulacionDaoJDBC implements PostulacionDao {
     
    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO postulacion VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE postulacion SET etapa_actual = ?, num_prueba_actual = ? WHERE cod_postulante = ? AND cod_puesto = ?;";
    private static final String SQL_DELETE = "";
    
    @Override
    public List<Postulacion> select() {
        List<Postulacion> Postulacion = new ArrayList<>();
        return Postulacion;
    }
    
    // Devuelve todas las postulaciones de un postulante
    public List<Postulacion> select(int codPostulante) {
        List<Postulacion> ListaPostulaciones = new ArrayList<>();
        String sql = "SELECT * FROM postulacion WHERE cod_postulante = ?";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, codPostulante);
            rs = ps.executeQuery();
            while(rs.next()) {
                Postulacion p = new Postulacion();
                p.setCodPostulante(rs.getInt(1));
                p.setCodPuesto(rs.getInt(2));
                p.setEtapaActual(rs.getString(3));
                p.setNumPruebaActual(rs.getInt(4));
                ListaPostulaciones.add(p);
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
        return ListaPostulaciones;
    }
    
    // Devuelve una postulación específica de un postulante
    public Postulacion select(int codPostulante, int codPuesto) {
        String sql = "SELECT * FROM postulacion WHERE cod_postulante = ? AND cod_puesto = ?";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Postulacion pst = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, codPostulante);
            ps.setInt(2,codPuesto);
            rs = ps.executeQuery();
            while(rs.next()) {
                pst = new Postulacion();
                pst.setCodPostulante(rs.getInt(1));
                pst.setCodPuesto(rs.getInt(2));
                pst.setEtapaActual(rs.getString(3));
                pst.setNumPruebaActual(rs.getInt(4));
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
        return pst;
    }
    
    @Override
    public int insert(Postulacion Postulacion){
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1,Postulacion.getCodPostulante());
            ps.setInt(2,Postulacion.getCodPuesto());
            ps.setString(3,Postulacion.getEtapaActual());
            ps.setInt(4,Postulacion.getNumPruebaActual());
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
    public int update(Postulacion Postulacion){
        int rows = 0;
        String sql = SQL_UPDATE;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1,Postulacion.getEtapaActual());
            ps.setInt(2,Postulacion.getNumPruebaActual());
            ps.setInt(3,Postulacion.getCodPostulante());
            ps.setInt(4,Postulacion.getCodPuesto());
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
    public int delete(Postulacion Postulacion){
        int rows = 0;

        return rows;
    }
}