package Controlador;

import Modelo.FormatoPrueba;
import Modelo.Puesto;
import java.time.LocalDate;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class CtrlConvocatoria {
    public static String mensajeError;
    
    public static boolean esPuestoValido(Puesto p) {
        if(!esNoVacio(p.getNombre())) {
            mensajeError = "ERROR: Debe especificar un nombre de puesto";
            return false;
        }
        if(!esNoVacio(p.getDescripcion())) {
            mensajeError = "ERROR: Debe especificar una descripción";
            return false;
        }
        String hoy = LocalDate.now().toString();
        String fechaInicio = p.getFechaInicio().toString();
        String fechaCierre = p.getFechaCierre().toString();
        if(compararFechas(fechaInicio, hoy) < 0) {
            mensajeError = "ERROR: Fecha de inicio debe ser\t\nigual o posterior a la fecha actual";
            return false;
        }
        if(compararFechas(fechaInicio, fechaCierre) >= 0) {
            mensajeError = "ERROR: Fecha de cierre debe ser\t\n posterior a la fecha de inicio";
            return false;
        }
        return true;
    }
    
    public static boolean esPuestoModificable(Puesto p) {
        if(!esNoVacio(p.getNombre())) {
            mensajeError = "ERROR: Debe especificar un nombre de puesto";
            return false;
        }
        if(!esNoVacio(p.getDescripcion())) {
            mensajeError = "ERROR: Debe especificar una descripción";
            return false;
        }
        return true;
    }
    
    public static boolean esFechaValidaEntrevista(Date fechaEntrev, Date fechaCierre) {
        int comp = compararFechas(fechaEntrev.toString(), fechaCierre.toString());
        if(comp <= 0) {
            String fcStr = new SimpleDateFormat("dd MMMM yyyy").format(fechaCierre);
            mensajeError = "ERROR: Fecha de entrevista debe ser\t\nposterior a " + fcStr;
            return false;
        }
        else return true;
    }
    
    public static boolean esFechaValidaPrueba(Date fechaPrueba, Date fechaEntrev) {
        int comp = compararFechas(fechaPrueba.toString(), fechaEntrev.toString());
        if(comp <= 0) {
            String fcStr = new SimpleDateFormat("dd MMMM yyyy").format(fechaEntrev);
            mensajeError = "ERROR: Fecha de prueba debe ser\t\nposterior a " + fcStr;
            return false;
        }
        else return true;
    }
    
    public static boolean esFormatoPruebaValido(FormatoPrueba fp) {
        if(!esNoVacio(fp.getDescripcion())) {
            mensajeError = "ERROR: Descripción no válida";
            return false;
        }
        else return true;
    }
    
    public static boolean esNoVacio(String cadena) {
        return !cadena.trim().equals("");
    }
    
    public static int compararFechas(String fecha1, String fecha2) {
        return fecha1.compareTo(fecha2);
    } 
}