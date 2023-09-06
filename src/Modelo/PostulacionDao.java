package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface PostulacionDao {

    public List<Postulacion> select() throws SQLException;

    public int insert(Postulacion Postulacion) throws SQLException;

    public int update(Postulacion Postulacion) throws SQLException;

    public int delete(Postulacion Postulacion) throws SQLException;
}
