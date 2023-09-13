package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface ExamenDao {
    
    public List<Examen> select();

    public int insert(Examen Examen);

    public int update(Examen Examen);

    public int delete(Examen Examen);


}
