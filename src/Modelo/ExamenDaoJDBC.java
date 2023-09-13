package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExamenDaoJDBC implements ExamenDao {
    
        private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


  public List<Examen> select(){
        List<Examen> Examen = new ArrayList<Examen>();
        return Examen;
    }

    public int insert(Examen Examen){
        int rows = 0;

        return rows;
    }

    public int update(Examen Examen){
        int rows = 0;

        return rows;

    }

    public int delete(Examen Examen){
        int rows = 0;

        return rows;
    }

}
