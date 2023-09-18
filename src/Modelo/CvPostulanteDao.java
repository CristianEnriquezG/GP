/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

public interface CvPostulanteDao {
    
    public List<CvPostulante> select();

    public int insert(CvPostulante cv);

    public int update(CvPostulante cv);

    public int delete(CvPostulante cv);
}