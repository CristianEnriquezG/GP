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
public class CtrlRegistrarDatos {
    public static String mensajeError;
    
    public static boolean esValido(Postulante post) {
        if(!String.valueOf(post.getDni()).matches("[0-9]{8}")) {
            mensajeError = "ERROR: Número de DNI no válido";
            return false;
        }
        if(new PostulanteDaoJDBC().select(post.getDni()) != null) {
            mensajeError = "ERROR: Número de DNI de postulante ya existe";
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
        if(!post.getTelefono().matches("([0-9]|\\(|\\)|-| ){7,}")) {
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