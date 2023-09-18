package Modelo;

import java.util.List;

public interface PostulanteDao {
    
    public List<Postulante> select();

    public int insert(Postulante Postulante);

    public int update(Postulante Postulante);

    public int delete(Postulante Postulante);
}