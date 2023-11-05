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
        int sinSeleccion = -1;
        assertEquals(false, CtrlConsulta.verificarSeleccion(sinSeleccion));    
    }

    @Test
    public void testVerificarSeleccionConSeleccion() {
        int conSeleccion = 1;
        assertEquals(true,CtrlConsulta.verificarSeleccion(conSeleccion));        
}

    @Test
    public void testVerificarPuestosNoExistenPuestos() {
        int noHayPuestos = 0;
        assertEquals(false, CtrlConsulta.verificarPuestos(noHayPuestos));
    }
    
    @Test
    public void testVerificarPuestosExistenPuestos() {
        int puestoExistente  = 1;
        assertEquals(true, CtrlConsulta.verificarPuestos(puestoExistente));        
    }

    /**
     * Test of verificarPostulantes method, of class CtrlConsulta.
     */
    @Test
    public void testVerificarPostulantesConPostulantes() {
        int existePostulante = 1;
        assertEquals(true,CtrlConsulta.verificarPostulantes(existePostulante));
    }
    @Test
    public void testVerificarPostulantesSinPostulantes() {
        int noExistePostulante = 0;
        assertEquals(false,CtrlConsulta.verificarPostulantes(noExistePostulante));
    }
     /*
     *
     * Test of mostrarVentanaDeError method, of class CtrlConsulta.
     */
    @Test
    public void testMostrarVentanaDeError() {
        System.out.println("mostrarVentanaDeError");
        String mensaje = "Prueba";
        CtrlConsulta.mostrarVentanaDeError(mensaje);
        
    }
}
