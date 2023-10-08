/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author MC1
 */
public interface EntrevistaPruebaPuestoDao {
    
    public ArrayList<EntrevistaPruebaPuesto> selectEntrevistaPuesto(int mes, int año);
    
    public ArrayList<EntrevistaPruebaPuesto> selectPruebaPuesto(int mes, int año);   
}