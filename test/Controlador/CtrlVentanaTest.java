/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EGcri
 */
public class CtrlVentanaTest {
    
    @Test
    public void testControlResolucionConValoresValidos() {
        int altoValido = 720;
        int anchoValido = 1280;
        assertTrue(CtrlVentana.controlResolucion(anchoValido,altoValido));

    }
    @Test
    public void testControlResolucionConValoresInvalidos(){
        int altoInvalidoMasGrande = 1281;
        int anchoInvalidoMasGrande = 721;
        assertFalse(CtrlVentana.controlResolucion(altoInvalidoMasGrande,anchoInvalidoMasGrande));
        
        int altoInvalidoPequeño = 1279;
        int anchoInvalidoPequeño = 719;
        assertFalse(CtrlVentana.controlResolucion(altoInvalidoPequeño, anchoInvalidoPequeño));
       
        assertFalse(CtrlVentana.controlResolucion(1280, 600));
    }
    
}
