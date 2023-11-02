/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

/**
 *
 * @author EGcri
 */
public class CtrlUsuarios {
    public static final String errorUsuarioVacio = "Error: El nombre de usuario no puede ser vacio";
    
    public static final String errorContraseñaVacia = "Error: La contraseña no puede estar vacia";
    
    public static final String errorSinSeleccion= "Error: Debe seleccionar al menos un permiso";
    
    public static final String errorEnCreacion = "Error: Usuario no creado";
     
    public static final String errorUsuarioDadoDeBaja = "Error: El usuario no esta activo";

    public static final String errorUsuarioInexistente = "Error: El usuario no existe";

    public static final String errorContraseñaIncorrecta = "Error: Contraseña incorrecta";

    public static final String errorContraseñasDistintas = "Error: Las contraseñas no son iguales";
            
    public static boolean chequeoFinal(Usuario usuario){
        boolean resultado = false;
        boolean nombreUsuario = false;
        boolean permisos = false;
        boolean contraseña = false;
        if(usuario.getNombreUsuario().length() != 0)
            nombreUsuario = true;
        if(usuario.getPermisosUsuario() != 0)
            permisos = true;
        if(usuario.getContraseñaUsuario().length() != 0)
            contraseña = true;
        if ( nombreUsuario && permisos && contraseña)
            resultado = true;
        else
            mostrarVentanaDeError(errorEnCreacion);
        return resultado;
    }
        public static String hasher(String contraseña){
        byte[] hashenBytes;
        String hash = "";
        try {
                        
            MessageDigest conversor = MessageDigest.getInstance("SHA-256");
            hashenBytes = conversor.digest(contraseña.getBytes(StandardCharsets.UTF_8));
            hash = bytesaHex(hashenBytes);
            return hash;
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CtrlContraseñaaHash.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return hash;
        }
    }
     private static String bytesaHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
      public static void mostrarVentanaDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
