package Modelo;

import java.util.List;

public interface PostulanteDao {
    
    public List<Postulante> select();
    
    public List<Postulante> select_cod(int cod_postulante);
    
    public Postulante select(int DNI);

    public int insert(Postulante Postulante);

    public int update(Postulante Postulante);

    public int delete(Postulante Postulante);
    
    public Postulante fetch(String apellido, String nombre);
    
    public int fetch_cod(int dni);

}