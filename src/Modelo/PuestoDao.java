package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface PuestoDao {
    
public List<Puesto> select() throws SQLException;

    public int insert(Puesto Puesto) throws SQLException;

    public int update(Puesto Puesto) throws SQLException;

    public int delete(Puesto Puesto) throws SQLException;

}
