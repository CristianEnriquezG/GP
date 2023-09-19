/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;
import java.util.List;

/**
 *
 * @author MC1
 */
public interface FormatoPruebaDao {
    
    public List<FormatoPrueba> select();

    public int insert(FormatoPrueba FormatoPrueba);

    public int update(FormatoPrueba FormatoPrueba);

    public int delete(FormatoPrueba FormatoPrueba);
}