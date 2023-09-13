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


    public List<Puesto> select(){
        List<Puesto> Puesto = new ArrayList<Puesto>();
        return Puesto;
    }

    public int insert(Puesto Puesto){
        int rows = 0;

        return rows;
    }

    public int update(Puesto Puesto){
        int rows = 0;

        return rows;

    }

    public int delete(Puesto Puesto){
        int rows = 0;

        return rows;
    }
}
