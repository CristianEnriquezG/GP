package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExamenDaoJDBC implements ExamenDao {

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO examen(fecha_entrega,hora_entrega,es_apto,observaciones,cod_postulante,cod_puesto) VALUES(?,?,?,?,?,?);";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";
    
    @Override
    public List<Examen> select(){
        List<Examen> Examen = new ArrayList<Examen>();
        return Examen;
    }

    @Override
    public int insert(Examen Examen){
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setDate(1,Examen.getFechaEntrega());
            ps.setTime(2,Examen.getHoraEntrega());
            ps.setBoolean(3,Examen.isEsApto());
            ps.setString(4,Examen.getObservaciones());
            ps.setInt(5,Examen.getCodPostulante());
            ps.setInt(6,Examen.getCodPuesto());
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
    public int update(Examen Examen){
        int rows = 0;

        return rows;

    }

    @Override
    public int delete(Examen Examen){
        int rows = 0;

        return rows;
    }
}