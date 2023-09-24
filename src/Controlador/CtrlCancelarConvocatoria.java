/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author MC1
 */
public class CtrlCancelarConvocatoria {
    
    public static String modificarFormatoFecha(String fecha) {
        return fecha.substring(8,10) + "/" + fecha.substring(5,7) + "/" + fecha.substring(0,4);
    }
    
}
