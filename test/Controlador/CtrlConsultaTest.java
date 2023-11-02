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
    

    @Test
    public void testVerificarSeleccionSinSeleccion() {    
        assertEquals(false, CtrlConsulta.verificarSeleccion(-1));    
    }

    @Test
    public void testVerificarSeleccionConSeleccion() {    
        assertEquals(true,CtrlConsulta.verificarSeleccion(1));        
}

    @Test
    public void testVerificarPuestosNoExistenPuestos() {               
        assertEquals(false, CtrlConsulta.verificarPuestos(0));
    }
    
    @Test
    public void testVerificarPuestosExistenPuestos() {        
        assertEquals(true, CtrlConsulta.verificarPuestos(1));        
    }

    @Test
    public void testVerificarPostulantesConPostulantes() {
        assertEquals(true,CtrlConsulta.verificarPostulantes(1));
    }
    @Test
    public void testVerificarPostulantesSinPostulantes() {        
        assertEquals(false,CtrlConsulta.verificarPostulantes(0));              
    }

    @Test
    public void testMostrarVentanaDeError() {
        System.out.println("mostrarVentanaDeError");
        String mensaje = "Prueba";
        CtrlConsulta.mostrarVentanaDeError(mensaje);
        
    }
}
