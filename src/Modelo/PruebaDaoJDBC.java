package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PruebaDaoJDBC implements PruebaDao {

    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    public List<Prueba> select() throws SQLException{
        List<Prueba> Prueba = new ArrayList<Prueba>();
        return Prueba;
    }

    public int insert(Prueba Prueba) throws SQLException{
        int rows = 0;

        return rows;
    }

    public int update(Prueba Prueba) throws SQLException{
        int rows = 0;

        return rows;

    }

    public int delete(Prueba Prueba) throws SQLException{
        int rows = 0;

        return rows;
    }
}
