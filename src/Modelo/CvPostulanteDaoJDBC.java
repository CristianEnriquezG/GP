/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MC1
 */
public class CvPostulanteDaoJDBC implements CvPostulanteDao {
    
    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO cv_postulante(cv,cod_postulante) VALUES(?,?);";
    private static final String SQL_UPDATE = "UPDATE cv_postulante SET cv = ? WHERE cod_postulante = ?";
    private static final String SQL_DELETE = "";
    
    @Override
    public List<CvPostulante> select(){
        List<CvPostulante> cvPostulante = new ArrayList<>();
        return cvPostulante;
    }

    // Devuelve un CvPostulante de acuerdo al código de postulante
    public CvPostulante select(int codPostulante) {
        String sql = "SELECT * FROM cv_postulante WHERE cod_postulante = ?;";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        CvPostulante cvp = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, codPostulante);
            rs = ps.executeQuery();
            if(rs.next()) {
                cvp = new CvPostulante();
                cvp.setCodCv(rs.getInt(1));
                cvp.setCv(rs.getBinaryStream(2));
                cvp.setCodPostulante(rs.getInt(3));
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
        return cvp;
    }
    
    @Override
    public int insert(CvPostulante CvPostulante){
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setBinaryStream(1,CvPostulante.getCv());
            ps.setInt(2,CvPostulante.getCodPostulante());
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
    public int delete(CvPostulante CvPostulante){
        int rows = 0;

        return rows;
    }
    
    @Override
    public int update(CvPostulante CvPostulante){
        int rows = 0;
        String sql = SQL_UPDATE;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setBinaryStream(1,CvPostulante.getCv());
            ps.setInt(2,CvPostulante.getCodPostulante());
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
}