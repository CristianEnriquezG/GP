package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PruebaDaoJDBC implements PruebaDao {

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO prueba(fecha,hora,resultado,observaciones,cod_postulante,cod_puesto) VALUES(?,?,?,?,?,?);";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    @Override
    public List<Prueba> select() {
        List<Prueba> Prueba = new ArrayList<Prueba>();
        return Prueba;
    }

    @Override
    public int insert(Prueba Prueba) {
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setDate(1,Prueba.getFecha());
            ps.setTime(2,Prueba.getHora());
            ps.setInt(3,Prueba.getResultado());
            ps.setString(4,Prueba.getObservaciones());
            ps.setInt(5,Prueba.getCodPostulante());
            ps.setInt(6,Prueba.getCodPuesto());
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
    public int update(Prueba Prueba) {
        int rows = 0;

        return rows;

    }

    @Override
    public int delete(Prueba Prueba) {
        int rows = 0;

        return rows;
    }
}