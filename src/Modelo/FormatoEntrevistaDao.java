package Modelo;

import java.util.List;

/**
 *
 * @author MC1
 */
public interface FormatoEntrevistaDao {

    public List<FormatoEntrevista> select();

    public int insert(FormatoEntrevista FormatoEntrevista);

    public int update(FormatoEntrevista FormatoEntrevista);

    public int delete(FormatoEntrevista FormatoEntrevista);
}