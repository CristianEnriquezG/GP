package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrevistaDaoJDBC implements EntrevistaDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


  public List<Entrevista> select() throws SQLException{
        List<Entrevista> convocatoria = new ArrayList<Entrevista>();
        return convocatoria;
    }

    public int insert(Entrevista Entrevista) throws SQLException{
        int rows = 0;

        return rows;
    }

    public int update(Entrevista Entrevista) throws SQLException{
        int rows = 0;

        return rows;

    }

    public int delete(Entrevista Entrevista) throws SQLException{
        int rows = 0;

        return rows;
    }
}
