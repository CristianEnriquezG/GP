package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface PostulanteDao {
    
    public List<Postulante> select() throws SQLException;

    public int insert(Postulante Postulante) throws SQLException;

    public int update(Postulante Postulante) throws SQLException;

    public int delete(Postulante Postulacion) throws SQLException;
}
