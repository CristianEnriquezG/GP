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
    
    public static final String errorApellidoNombreVacio = "Error: El apellido y nombre no puede ser vacio";
    
    public static final String errorPostulanteInexistente = "Error: El Postulante no existe";
    
    public static final String errorPostulanteInactivo ="Error: El Postulante esta inactivo";
    
    public static final String errorDNIVacio = "Error: El DNI no puede ser vacio";
    
    public static final String errorDNINoExistente = "Error: El DNI no existe";
    
    public static final String errorNoHayPuestos = "Error: No hay puestos creados";
    
    public static final String errorVacio = "Error: No hay seleccion";
    
    public static final String errorSinPostulantes = "Error: No hay Postulantes para ese puesto";
    
    public static boolean verificarSeleccion(int i){
        if(i <= -1){
            mostrarVentanaDeError(errorVacio);
            return false;
        }
        else  return true;
        
    }
    
    public static boolean verificarPuestos(int i){
        if(i <= 0){
            mostrarVentanaDeError(errorNoHayPuestos);
            return false;
        }
        else  return true;
    }
    
    public static boolean verificarPostulantes(int i){
        if(i <= 0){
            mostrarVentanaDeError(errorSinPostulantes);
            return false;
        }
        else  return true;
    }
    
     public static void mostrarVentanaDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
