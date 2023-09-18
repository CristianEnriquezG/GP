package Modelo;

import java.util.List;

public interface PostulacionDao {

    public List<Postulacion> select();

    public int insert(Postulacion Postulacion);

    public int update(Postulacion Postulacion);

    public int delete(Postulacion Postulacion);
}
