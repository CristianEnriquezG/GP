package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostulanteDaoJDBC implements PostulanteDao {

    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    public List<Postulante> select(){
        List<Postulante> Postulante = new ArrayList<Postulante>();
        return Postulante;
    }

    public int insert(Postulante Postulante){
        int rows = 0;

        return rows;
    }

    public int update(Postulante Postulante){
        int rows = 0;

        return rows;

    }

    public int delete(Postulante Postulante){
        int rows = 0;

        return rows;
    }
}
