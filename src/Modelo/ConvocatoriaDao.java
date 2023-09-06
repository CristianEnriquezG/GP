package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface ConvocatoriaDao {

    public List<Convocatoria> select() throws SQLException;

    public int insert(Convocatoria convocatoria) throws SQLException;

    public int update(Convocatoria convocatoria) throws SQLException;

    public int delete(Convocatoria convocatoria) throws SQLException;
    
}
