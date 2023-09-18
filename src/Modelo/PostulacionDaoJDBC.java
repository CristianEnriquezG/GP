package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostulacionDaoJDBC implements PostulacionDao {
     
    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "INSERT INTO postulacion VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";
    
    public List<Postulacion> select() {
        List<Postulacion> Postulacion = new ArrayList<Postulacion>();
        return Postulacion;
    }
    
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

    public int update(Postulacion Postulacion){
        int rows = 0;

        return rows;

    }

    public int delete(Postulacion Postulacion){
        int rows = 0;

        return rows;
    }
}