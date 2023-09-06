package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostulacionDaoJDBC implements PostulacionDao {
     
        private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    public List<Postulacion> select() throws SQLException{
        List<Postulacion> Postulacion = new ArrayList<Postulacion>();
        return Postulacion;
    }

    public int insert(Postulacion Postulacion) throws SQLException{
        int rows = 0;

        return rows;
    }

    public int update(Postulacion Postulacion) throws SQLException{
        int rows = 0;

        return rows;

    }

    public int delete(Postulacion Postulacion) throws SQLException{
        int rows = 0;

        return rows;
    }
}
