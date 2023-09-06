package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface ExamenDao {
    
    public List<Examen> select() throws SQLException;

    public int insert(Examen Examen) throws SQLException;

    public int update(Examen Examen) throws SQLException;

    public int delete(Examen Examen) throws SQLException;


}
