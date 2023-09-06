package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PuestoDaoJDBC implements PuestoDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    public List<Puesto> select() throws SQLException{
        List<Puesto> Puesto = new ArrayList<Puesto>();
        return Puesto;
    }

    public int insert(Puesto Puesto) throws SQLException{
        int rows = 0;

        return rows;
    }

    public int update(Puesto Puesto) throws SQLException{
        int rows = 0;

        return rows;

    }

    public int delete(Puesto Puesto) throws SQLException{
        int rows = 0;

        return rows;
    }
}
