package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface ConvocatoriaDao {

    public List<Convocatoria> select();

    public int insert(Convocatoria convocatoria);

    public int update(Convocatoria convocatoria);

    public int delete(Convocatoria convocatoria);
    
}
