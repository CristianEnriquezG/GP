/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author Cristian Enríquez
 */
public class CtrlContraseñaaHash {
    
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
