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
public class FormatoPruebaDaoJDBC implements FormatoPruebaDao {
    
    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO formato_prueba(num_prueba,descripcion,fecha,hora,cod_puesto) VALUES(?,?,?,?,?);";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";
    
    @Override
    public List<FormatoPrueba> select() {
        List<FormatoPrueba> FormatoPrueba = new ArrayList<>();
        return FormatoPrueba;
    }

    @Override
    public int insert(FormatoPrueba FormatoPrueba) {
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            
            ps.setInt(1,FormatoPrueba.getNumPrueba());
            ps.setString(2,FormatoPrueba.getDescripcion());
            ps.setDate(3,FormatoPrueba.getFecha());
            ps.setTime(4,FormatoPrueba.getHora());
            ps.setInt(5,FormatoPrueba.getCodPuesto());
            
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
    public int update(FormatoPrueba FormatoPrueba) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(FormatoPrueba FormatoPrueba) {
        int rows = 0;
        return rows;
    }
}