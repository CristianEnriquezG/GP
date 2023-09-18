/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
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