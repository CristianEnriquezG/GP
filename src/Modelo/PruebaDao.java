package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface PruebaDao {

    public List<Prueba> select() throws SQLException;

    public int insert(Prueba Prueba) throws SQLException;

    public int update(Prueba Prueba) throws SQLException;

    public int delete(Prueba Prueba) throws SQLException;
}
