package Controlador;

import Modelo.Entrevista;
import Modelo.Examen;
import Modelo.Prueba;

public class CtrlEtapa {
    public static String mensajeError;
    
    public static boolean esEntrevistaValida(Entrevista e) {
        //if(e.getViveCon().trim().equals("")) {
        if(!CtrlConvocatoria.esNoVacio(e.getViveCon())) {
            mensajeError = "ERROR: Debe completar el campo \"Vive con\"";
            return false;
        }
        if(!CtrlConvocatoria.esNoVacio(e.getEstudios())) {
            mensajeError = "ERROR: Debe completar el campo \"Estudios\"";
            return false;
        }
        if(!CtrlConvocatoria.esNoVacio(e.getRecomendadoPor())) {
            mensajeError = "ERROR: Debe completar el campo \"Recomendado por\"";
            return false;
        }
        return true;
    }
    
    // ATENCIÓN: Aunque estos métodos no entregan nada valioso, mantenerlos por si
    // más adelante hay que hacer validaciones en las fechas o algo por el estilo
    public static boolean esPruebaValida(Prueba p) {
        mensajeError = "";
        return true; 
    }
    
    public static boolean esExamenValido(Examen e) {
        mensajeError = "";
        return true; 
    }
}