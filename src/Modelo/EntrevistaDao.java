package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface EntrevistaDao {
    
    public List<Entrevista> select() throws SQLException;

    public int insert(Entrevista Entrevista) throws SQLException;

    public int update(Entrevista Entrevista) throws SQLException;

    public int delete(Entrevista Entrevista) throws SQLException;

}
