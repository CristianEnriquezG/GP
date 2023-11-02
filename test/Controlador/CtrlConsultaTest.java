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
public class CtrlConsultaTest {
    
    public CtrlConsultaTest() {
    }
    

    /**
     * Test of verificarSeleccion method, of class CtrlConsulta.
     */
    @Test
    public void testVerificarSeleccion() {
        System.out.println("verificarSeleccion");
        int sinSeleccion = -1;
        int conSeleccion = 1;
        boolean expResult = false;
        
        boolean result = CtrlConsulta.verificarSeleccion(sinSeleccion);
        assertEquals(expResult, result);
        
        expResult = true;
        result = CtrlConsulta.verificarSeleccion(conSeleccion);
        assertEquals(expResult,result);

        
    }

    /**
     * Test of verificarPuestos method, of class CtrlConsulta.
     */
    @Test
    public void testVerificarPuestos() {
        System.out.println("verificarPuestos");
        int i = 0;
        boolean expResult = false;
        boolean result = CtrlConsulta.verificarPuestos(i);
        assertEquals(expResult, result);
        i = 1;
        
        expResult = true;
        result = CtrlConsulta.verificarPuestos(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of verificarPostulantes method, of class CtrlConsulta.
     */
    @Test
    public void testVerificarPostulantes() {
        System.out.println("verificarPostulantes");
        
        int i = 0;
        boolean expResult = false;
        boolean result = CtrlConsulta.verificarPostulantes(i);
        assertEquals(expResult, result);
        i = 1;
        
        expResult = true;
        result = CtrlConsulta.verificarPostulantes(i);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mostrarVentanaDeError method, of class CtrlConsulta.
     */
    @Test
    public void testMostrarVentanaDeError() {
        System.out.println("mostrarVentanaDeError");
        String mensaje = "";
        CtrlConsulta.mostrarVentanaDeError(mensaje);
        
    }
    
}
