/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EGcri
 */
public class CtrlUsuariosTest {
    
    @Test
    public void testChequeoFinalVacio() {
        System.out.println("chequeoFinal");
        Usuario usuario = new Usuario
        (
            0,
            "",
            "",
            1,
            false
        );
        boolean expResult = false;
        boolean result = CtrlUsuarios.chequeoFinal(usuario);
        assertEquals(expResult, result);        
    }
@Test
    public void testChequeoFinalCompleto() {
        System.out.println("chequeoFinal");
        Usuario usuario = new Usuario();
        boolean expResult = true;        
        usuario = new Usuario
        (
                1,
                "test",
                "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918",
                1,
                true
        );

        boolean result = CtrlUsuarios.chequeoFinal(usuario);
        assertEquals(expResult,result);
    }
    /**
     * Test of hasher method, of class CtrlUsuarios.
     */
    @Test
    public void testHasher() {
        System.out.println("hasher");
        String contraseña = "admin";
        String expResult = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918";
        String result = CtrlUsuarios.hasher(contraseña);
        assertEquals(expResult, result);
    }

}
