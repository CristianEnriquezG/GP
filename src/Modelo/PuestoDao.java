package Modelo;


import java.util.List;

public interface PuestoDao {
    
public List<Puesto> select();

    public int insert(Puesto Puesto);

    public int update(Puesto Puesto);

    public int delete(Puesto Puesto);

}
