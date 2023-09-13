package Modelo;

import java.sql.SQLException;
import java.util.List;

public interface Cuenta_usuarioDao {
    
    public List<Cuenta_usuario> select();

    public int insert(Cuenta_usuario Cuenta_usuario);

    public int update(Cuenta_usuario Cuenta_usuario);

    public int delete(Cuenta_usuario Cuenta_usuario);
}
