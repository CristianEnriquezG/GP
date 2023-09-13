/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.List;
        
/**
 *
 * @author EGcri
 */
public interface UsuarioDao {
    public List<Usuario> select();
    

    public int insert(Usuario Usuario);
        

    public int update(Usuario Usuario);
        

    public int delete(Usuario Usuario);
        
}
