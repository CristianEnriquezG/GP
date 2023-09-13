package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface EntrevistaDao {
    
    public List<Entrevista> select();

    public int insert(Entrevista Entrevista);

    public int update(Entrevista Entrevista);

    public int delete(Entrevista Entrevista);

}
