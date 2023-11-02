/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EGcri
 */
public class CtrlVentanaTest {
    
    public CtrlVentanaTest() {
    }


    /**
     * Test of controlResolucion method, of class CtrlVentana.
     */
    @Test
    public void testControlResolucionValida() {        
        assertTrue(CtrlVentana.controlResolucion(1280,720));

    }
    @Test
    public void testControlResolucionInvalida(){
        assertFalse(CtrlVentana.controlResolucion(800,600));
        assertFalse(CtrlVentana.controlResolucion(1281,721));
        assertFalse(CtrlVentana.controlResolucion(1180, 720));
        assertFalse(CtrlVentana.controlResolucion(1280, 600));
    }
    
}
