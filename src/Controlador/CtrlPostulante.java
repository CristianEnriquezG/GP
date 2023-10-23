/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Postulante;
import Modelo.PostulanteDaoJDBC;

/**
 *
 * @author MC1
 */
public class CtrlPostulante {
    public static String mensajeError;
    
    public static boolean esPostulanteValido(Postulante post) {
        if(!esDniValido(post.getDni())) {
            mensajeError = "ERROR: Número de DNI no válido";
            return false;
        }
        if(!esNombreValido(post.getApellido())) {
            mensajeError = "ERROR: Apellido no válido.";
            return false;
        }
        if(!esNombreValido(post.getNombre())) {
            mensajeError = "ERROR: Nombre no válido.";
            return false;
        }
        if(!esDomicilioValido(post.getDomicilio())) {
            mensajeError = "ERROR: Domicilio no válido.";
            return false;
        }
        if(!esTelefonoValido(post.getTelefono())) {
            mensajeError = "ERROR: Número de teléfono no válido";
            return false;
        }
        if(!esEmailValido(post.getEmail())) {
            mensajeError = "ERROR: Dirección de e-mail no válida.";
            return false;
        }
        return true;
    }
    
    public static boolean esDniValido(int dni) {
        return String.valueOf(dni).matches("[0-9]{8}");
    }
    
    public static boolean esNombreValido(String nombre) {
        return nombre.matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ ]+");
    }
    
    public static boolean esDomicilioValido(String domicilio) {
        return domicilio.matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ0-9/ ]+");
    }
    
    public static boolean esTelefonoValido(String telefono) {
        return telefono.matches("(\\([0-9]+\\))?[0-9 -]+");
    }
    
    public static boolean esEmailValido(String email) {
        return email.matches("[a-z0-9-_]+@[a-z]+.[a-z]{3}");
    }
    
    public static boolean existePostulante(int dni) {
        if(new PostulanteDaoJDBC().select(dni) != null) {
            mensajeError = "ERROR: Número de DNI de postulante ya existe";
            return true;
        }
        else return false;
    }
    
    public static boolean esPostulanteActivo(Postulante p) {
        if(!p.isEstado()) {
            mensajeError = "ERROR: Postulante inactivo";
            return false;
        }
        else return true;
    }
}