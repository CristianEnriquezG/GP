/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Postulante;
import Modelo.Prueba;

/**
 *
 * @author MC1
 */
public class CtrlNuevaPrueba {
    public static String mensajeError;
    
    public static boolean esActivo(Postulante p) {
        if(!p.isEstado()) {
            mensajeError = "ERROR: Postulante inactivo";
            return false;
        }
        else return true;
    }
    
    private static boolean formatoFechaValido(String f) {
        return f.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    }
    
    private static boolean formatoHoraValido(String h) {
        return h.matches("[0-9]{2}:[0-9]{2}");
    }
    
    private static String formatearFecha(String fecha) {
        return fecha.substring(6) + "-" + fecha.substring(3,5) + "-" + fecha.substring(0,2);
    }
    
    private static String formatearHora(String hora) {
        return hora + ":00";
    }
    
    public static boolean esValida(Prueba p, String fecha, String hora) {
        if(formatoFechaValido(fecha)) {
            try {
                java.sql.Date f = java.sql.Date.valueOf(formatearFecha(fecha));
                p.setFecha(f);
            } catch(IllegalArgumentException ex) {
                mensajeError = "ERROR: Fecha no válida";
                return false;
            }
        }
        else {
            mensajeError = "ERROR: Fecha no válida";
            return false;
        }
        if(formatoHoraValido(hora)) {
            try {
                java.sql.Time t = java.sql.Time.valueOf(formatearHora(hora));
                p.setHora(t);
            } catch(IllegalArgumentException ex) {
                mensajeError = "ERROR: Hora no válida";
                return false;
            }
        }
        else {
            mensajeError = "ERROR: Hora no válida";
            return false;
        }
        return true;
    }
}
