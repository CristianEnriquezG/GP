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
    public void testControlResolucion() {
        System.out.println("controlResolucion");
        int anchoEsperado = 1280;
        int altoEsperado = 720;
        boolean resultado = CtrlVentana.controlResolucion(anchoEsperado,altoEsperado);
        assertTrue(resultado, "Resolucion esperada es valida" );
        
        resultado = CtrlVentana.controlResolucion(800,600);
        assertTrue(resultado,"Resolucion esperada es invalida");

    }
    
}
