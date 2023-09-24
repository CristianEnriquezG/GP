/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Puesto;

/**
 *
 * @author MC1
 */
public class CtrlModificarConvocatoria {
    public static String mensajeError;
    
    private static boolean formatoFechaValido(String f) {
        return f.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    }
    
    private static String formatearFecha(String fecha) {
        return fecha.substring(6) + "-" + fecha.substring(3,5) + "-" + fecha.substring(0,2);
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
    
    public static String modificarFormatoFecha(String fecha) {
        return fecha.substring(8,10) + "/" + fecha.substring(5,7) + "/" + fecha.substring(0,4);
    }
}
