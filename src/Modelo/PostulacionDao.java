package Modelo;

import java.util.List;

public interface PostulacionDao {

    public List<Postulacion> select();
    
    public List<Postulacion> select_cod(int cod_puesto);
    
    public List<Postulacion> select(int cod_puesto);
    
    public int insert(Postulacion Postulacion);

    public int update(Postulacion Postulacion);

    public int delete(Postulacion Postulacion);
}
