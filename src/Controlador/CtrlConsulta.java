/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author EGcri
 */
public class CtrlConsulta {
    
    public static final String errorApellidoNombreVacio = "El apellido y nombre no puede ser vacio";
    
    public static final String errorPostulanteInexistente = "El Postulante no existe";
    
    public static final String errorPostulanteInactivo ="El Postulante esta inactivo";
    
    public static final String errorDNIVacio = "El DNI no puede ser vacio";
    
    public static final String errorDNINoExistente = "El DNI no existe";
    
    public static final String errorNoHayPuestos = "no hay puestos creados";
    
    public static final String errorVacio = "No hay seleccion";
    
    public static boolean verificarSeleccion(int i){
        if(i <= 0){
            mostrarVentanaDeError(errorVacio);
            return false;
        }
        else  return true;
        
    }
     public static void mostrarVentanaDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
