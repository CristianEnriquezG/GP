package Controlador;

import Modelo.Postulante;
import org.junit.Test;
import static org.junit.Assert.*;

public class CtrlPostulanteTest {
    
    public CtrlPostulanteTest() {
    }
    
    @Test
    public void testEsPostulanteValido_Valido() {
        Postulante post = new Postulante(1,12345678,"Ape","Nom","Dom","1234","usr@mail.com",true);
        boolean expResult = true;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsPostulanteValido_DniInvalido() {
        Postulante post = new Postulante(); // Dni = 0
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteValido_ApellidoInvalido() {
        Postulante post = new Postulante(1,12345678,"ape","Nom","Dom","1234","usr@mail.com",true);
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteValido_NombreInvalido() {
        Postulante post = new Postulante(1,12345678,"Ape","nom","Dom","1234","usr@mail.com",true);
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteValido_DomicilioInvalido() {
        Postulante post = new Postulante(1,12345678,"Ape","Nom","dom","1234","usr@mail.com",true);
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteValido_TelefonoInvalido() {
        Postulante post = new Postulante(1,12345678,"Ape","Nom","Dom","ABCD","usr@mail.com",true);
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteValido_EmailInvalido() {
        Postulante post = new Postulante(1,12345678,"Ape","Nom","Dom","1234","usr.mail.com",true);
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteValido(post);
        assertEquals(expResult, result);
    }

    @Test
    public void testExistePostulante_NoExiste() {
        // Postulante con DNI = 0 no existe
        int dni = 0;
        boolean expResult = false;
        boolean result = CtrlPostulante.existePostulante(dni);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testExistePostulante_SiExiste() {
        // Postulante con DNI = 34567890 sí existe
        int dni = 34567890;
        boolean expResult = true;
        boolean result = CtrlPostulante.existePostulante(dni);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsPostulanteActivo_Activo() {
        Postulante p = new Postulante();
        p.setEstado(true);
        boolean expResult = true;
        boolean result = CtrlPostulante.esPostulanteActivo(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPostulanteActivo_Inactivo() {
        // Estado por defecto es false
        Postulante p = new Postulante();
        boolean expResult = false;
        boolean result = CtrlPostulante.esPostulanteActivo(p);
        assertEquals(expResult, result);
    }
}