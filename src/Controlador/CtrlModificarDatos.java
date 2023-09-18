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
public class CtrlModificarDatos {
    public static String mensajeError;
    
    public static boolean esModificable(Postulante p) {
        if(!p.isEstado()) {
            mensajeError = "ERROR: Postulante inactivo";
            return false;
        }
        else return true;
    }
    
    public static boolean esValido(Postulante post) {
        if(!post.getApellido().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ ]+")) {
            mensajeError = "ERROR: Apellido no válido";
            return false;
        }
        if(!post.getNombre().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ ]+")) {
            mensajeError = "ERROR: Nombre no válido";
            return false;
        }
        if(!post.getDomicilio().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ0-9/ ]+")) {
            mensajeError = "ERROR: Domicilio no válido";
            return false;
        }
        if(!post.getTelefono().matches("([0-9]|\\(|\\)|-| ){7,}")) {
            mensajeError = "ERROR: Número de teléfono no válido";
            return false;
        }
        if(!post.getEmail().matches("[a-z0-9-_]+@[a-z]+.[a-z]{3}")) {
            mensajeError = "ERROR: Dirección de e-mail no válida";
            return false;
        }
        return true;
    }
}