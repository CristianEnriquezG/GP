package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cuenta_usuarioDaoJDBC implements Cuenta_usuarioDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";

    public List<Cuenta_usuario> select() throws SQLException{
        List<Cuenta_usuario> convocatoria = new ArrayList<Cuenta_usuario>();
        return convocatoria;
    }

    public int insert(Cuenta_usuario Cuenta_usuario) throws SQLException{
        int rows = 0;

        return rows;
    }

    public int update(Cuenta_usuario Cuenta_usuario) throws SQLException{
        int rows = 0;

        return rows;

    }

    public int delete(Cuenta_usuario Cuenta_usuario) throws SQLException{
        int rows = 0;

        return rows;
    }

}
