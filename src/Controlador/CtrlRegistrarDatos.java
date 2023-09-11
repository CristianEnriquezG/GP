/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.PostulanteDTO;

/**
 *
 * @author MC1
 */
public class CtrlRegistrarDatos {
    public static String mensajeError;
    
    /*-----------------------ATENCIÓN-----------------------------
    FALTA VERIFICAR QUE NO SE TRATE DE UN DNI DUPLICADO
    */
    public static boolean esValido(PostulanteDTO post) {
        if(!String.valueOf(post.getDni()).matches("[0-9]{8}")) {
            mensajeError = "ERROR: Número de DNI no válido";
            return false;
        }
        if(!post.getApellido().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ ]+")) {
            mensajeError = "ERROR: Apellido no válido.";
            return false;
        }
        if(!post.getNombre().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ ]+")) {
            mensajeError = "ERROR: Nombre no válido.";
            return false;
        }
        if(!post.getDomicilio().matches("[A-ZÁÉÍÓÚÑ][A-ZÁÉÍÓÚÑa-záéíóúüñ0-9/ ]+")) {
            mensajeError = "ERROR: Domicilio no válido.";
            return false;
        }
        if(!String.valueOf(post.getTelefono()).matches("[0-9]{7,}")) {
            mensajeError = "ERROR: Número de teléfono no válido";
            return false;
        }
        if(!post.getEmail().matches("[a-z0-9-_]+@[a-z]+.[a-z]{3}")) {
            mensajeError = "ERROR: Dirección de e-mail no válida.";
            return false;
        }
        return true;
    }
}