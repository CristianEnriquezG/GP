/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.FormatoEntrevista;
import Modelo.FormatoPrueba;
import Modelo.Puesto;
import java.time.LocalTime;

/**
 *
 * @author MC1
 */
public class CtrlCrearConvocatoria {
    public static String mensajeError;
    
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
    
    public static boolean esValido(Puesto p, String fechaIni, String fechaCie) {
        if(p.getNombre().trim().equals("")) {
            mensajeError = "ERROR: Nombre de puesto no válido";
            return false;
        }
        if(p.getDescripcion().trim().equals("")) {
            mensajeError = "ERROR: Descripción no válida";
            return false;
        }
        if(formatoFechaValido(fechaIni)) {
            try {
                java.sql.Date f = java.sql.Date.valueOf(formatearFecha(fechaIni));
                p.setFechaInicio(f);
            } catch(IllegalArgumentException e) {
                mensajeError = "ERROR: Fecha de inicio no válida";
                return false;
            }
        }
        else {
            mensajeError = "ERROR: Fecha de inicio no válida";
            return false;
        }
        if(formatoFechaValido(fechaCie)) {
            try {
                java.sql.Date f = java.sql.Date.valueOf(formatearFecha(fechaCie));
                p.setFechaCierre(f);
            } catch(IllegalArgumentException e) {
                mensajeError = "ERROR: Fecha de cierre no válida";
                return false;
            }
        }
        else {
            mensajeError = "ERROR: Fecha de cierre no válida";
            return false;
        }
        return true;
    }
    
    public static boolean esValido(FormatoEntrevista fEnt, String fecha, String hora) {
        if(formatoFechaValido(fecha)) {
            try {
                java.sql.Date f = java.sql.Date.valueOf(formatearFecha(fecha));
                fEnt.setFecha(f);
            } catch(IllegalArgumentException e) {
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
                fEnt.setHora(t);
            } catch(IllegalArgumentException e) {
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
    
    public static boolean esValido(FormatoPrueba fPru, String fecha, String hora) {
        if(fPru.getDescripcion().trim().equals("")) {
            mensajeError = "ERROR: Descripción no válida";
            return false;
        }
        if(formatoFechaValido(fecha)) {
            try {
                java.sql.Date f = java.sql.Date.valueOf(formatearFecha(fecha));
                fPru.setFecha(f);
            } catch(IllegalArgumentException e) {
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
                fPru.setHora(t);
            } catch(IllegalArgumentException e) {
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