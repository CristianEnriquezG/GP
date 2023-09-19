/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Postulante;

/**
 *
 * @author MC1
 */
public class CtrlEliminarDatos {
    public static String mensajeError;
    
    public static boolean esEliminable(Postulante p) {
        if(!p.isEstado()) {
            mensajeError = "ERROR: Postulante inactivo";
            return false;
        }
        else return true;
    }
    
}