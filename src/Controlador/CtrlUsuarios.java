/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;

/**
 *
 * @author EGcri
 */
public class CtrlUsuarios {
    public static final String errorUsuarioVacio = "El nombre de usuario no puede ser vacio";
    
    public static final String errorContraseñaVacia = "la contraseña no puede estar vacia";
    
    public static final String errorSinSeleccion= "Debe seleccionar al menos un permiso";
    
    public static final String errorEnCreacion = "Error usuario no creado";
     
    public static final String errorUsuarioDadoDeBaja = "Error: el usuario no esta activo";

    public static final String errorUsuarioInexistente = "Error: El usuario no existe";

    public static final String errorContraseñaIncorrecta = "Error: Contraseña incorrecta";

    public static final String errorContraseñasDistintas = "Error: las contraseñas no son iguales";
            
    public static boolean chequeoFinal(Usuario usuario){
        boolean resultado = false;
        if(usuario.getNombreUsuario().length() != 0)
            resultado = true;
        if(usuario.getPermisosUsuario() != 0)
            resultado = true;
        if(usuario.getContraseñaUsuario().length() != 0)
            resultado = true;
            
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
}
