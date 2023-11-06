package Controlador;

import Modelo.Entrevista;
import Modelo.Examen;
import Modelo.Prueba;
import org.junit.Test;
import static org.junit.Assert.*;

public class CtrlEtapaTest {
    
    public CtrlEtapaTest() {
    }

    @Test
    public void testEsEntrevistaValida_Valida() {
        Entrevista e = new Entrevista();
        e.setViveCon("Vive");
        e.setEstudios("Est");
        e.setRecomendadoPor("Rec");
        boolean expResult = true;
        boolean result = CtrlEtapa.esEntrevistaValida(e);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsEntrevistaValida_ViveConInvalido() {
        Entrevista e = new Entrevista();
        e.setViveCon("");
        boolean expResult = false;
        boolean result = CtrlEtapa.esEntrevistaValida(e);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsEntrevistaValida_EstudiosInvalido() {
        Entrevista e = new Entrevista();
        e.setViveCon("Vive");
        e.setEstudios("");
        boolean expResult = false;
        boolean result = CtrlEtapa.esEntrevistaValida(e);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsEntrevistaValida_RecomendadoInvalido() {
        Entrevista e = new Entrevista();
        e.setViveCon("Vive");
        e.setEstudios("Est");
        e.setRecomendadoPor("");
        boolean expResult = false;
        boolean result = CtrlEtapa.esEntrevistaValida(e);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsPruebaValida() {
        Prueba p = new Prueba();
        boolean expResult = true;
        boolean result = CtrlEtapa.esPruebaValida(p);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsExamenValido() {
        Examen e = new Examen();
        boolean expResult = true;
        boolean result = CtrlEtapa.esExamenValido(e);
        assertEquals(expResult, result);
    }
}