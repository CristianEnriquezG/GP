/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MC1
 */
public class FormatoEntrevistaDaoJDBC implements FormatoEntrevistaDao {
    
    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO formato_entrevista(fecha,hora,presentacion,actitud,conversacion,disposicion,decision,disponibilidad,transporte,aspecto_fisico,experiencia,conocimientos,relacion,liderazgo,manejo_herramientas,cod_puesto) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";
    
    @Override
    public List<FormatoEntrevista> select() {
        List<FormatoEntrevista> FormatoEntrevista = new ArrayList<>();
        return FormatoEntrevista;
    }
    
    // Devuelve un registro de acuerdo al codPuesto recibido como parámetro
    public FormatoEntrevista select(int codPuesto) {
        String sql = "SELECT * FROM formato_entrevista WHERE cod_puesto = ?;";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FormatoEntrevista forEnt = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, codPuesto);
            rs = ps.executeQuery();
            if(rs.next()) {
                forEnt = new FormatoEntrevista();
                forEnt.setCodFormatoEntrevista(rs.getInt(1));
                forEnt.setFecha(rs.getDate(2));
                forEnt.setHora(rs.getTime(3));
                forEnt.setPresentacion(rs.getBoolean(4));
                forEnt.setActitud(rs.getBoolean(5));
                forEnt.setConversacion(rs.getBoolean(6));
                forEnt.setDisposicion(rs.getBoolean(7));
                forEnt.setDecision(rs.getBoolean(8));
                forEnt.setDisponibilidad(rs.getBoolean(9));
                forEnt.setTransporte(rs.getBoolean(10));
                forEnt.setAspectoFisico(rs.getBoolean(11));
                forEnt.setExperiencia(rs.getBoolean(12));
                forEnt.setConocimientos(rs.getBoolean(13));
                forEnt.setRelacion(rs.getBoolean(14));
                forEnt.setLiderazgo(rs.getBoolean(15));
                forEnt.setManejoHerramientas(rs.getBoolean(16));
                forEnt.setCodPuesto(rs.getInt(17));
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
        return forEnt;
    }

    @Override
    public int insert(FormatoEntrevista FormatoEntrevista) {
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            
            ps.setDate(1,FormatoEntrevista.getFecha());
            ps.setTime(2,FormatoEntrevista.getHora());
            ps.setBoolean(3,FormatoEntrevista.isPresentacion());
            ps.setBoolean(4,FormatoEntrevista.isActitud());
            ps.setBoolean(5,FormatoEntrevista.isConversacion());
            ps.setBoolean(6,FormatoEntrevista.isDisposicion());
            ps.setBoolean(7,FormatoEntrevista.isDecision());
            ps.setBoolean(8,FormatoEntrevista.isDisponibilidad());
            ps.setBoolean(9,FormatoEntrevista.isTransporte());
            ps.setBoolean(10,FormatoEntrevista.isAspectoFisico());
            ps.setBoolean(11,FormatoEntrevista.isExperiencia());
            ps.setBoolean(12,FormatoEntrevista.isConocimientos());
            ps.setBoolean(13,FormatoEntrevista.isRelacion());
            ps.setBoolean(14,FormatoEntrevista.isLiderazgo());
            ps.setBoolean(15,FormatoEntrevista.isManejoHerramientas());
            ps.setInt(16,FormatoEntrevista.getCodPuesto());
            
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
    public int update(FormatoEntrevista FormatoEntrevista) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(FormatoEntrevista FormatoEntrevista) {
        int rows = 0;
        return rows;
    }
}