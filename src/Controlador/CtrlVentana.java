/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author EGcri
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CtrlVentana {
    
    public static void controlResolucion(){
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int minWidth = 1280;
        int minHeight = 720;
        if (screenWidth < minWidth || screenHeight < minHeight) 
        {        
        JFrame errorFrame = new JFrame("Error de resolución");
        JOptionPane.showMessageDialog(errorFrame, "La resolución mínima requerida es 1280x720.");
        errorFrame.dispose(); 
        System.exit(0); 
        }        
    }
}
