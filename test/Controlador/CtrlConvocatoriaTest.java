package Controlador;

import Modelo.FormatoPrueba;
import Modelo.Puesto;
import java.sql.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class CtrlConvocatoriaTest {
    
    public CtrlConvocatoriaTest() {
    }

    @Test
    public void testEsPuestoValido_Valido() {
        Puesto p = new Puesto();
        p.setNombre("Nombre");
        p.setDescripcion("Descrip");
        p.setFechaInicio(Date.valueOf("2023-12-01"));
        p.setFechaCierre(Date.valueOf("2023-12-10"));
        boolean expResult = true;
        boolean result = CtrlConvocatoria.esPuestoValido(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoValido_NombreInvalido() {
        // Un nombre válido debe ser no vacío
        Puesto p = new Puesto();
        p.setNombre("");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoValido(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoValido_DescripcionInvalida() {
        // Una descripción válida debe ser no vacía
        Puesto p = new Puesto();
        p.setNombre("Nombre");
        p.setDescripcion("");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoValido(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoValido_FechaInicioInvalida() {
        // Fecha inicio anterior a fecha actual es invalido
        Puesto p = new Puesto();
        p.setNombre("Nombre");
        p.setDescripcion("Descrip");
        p.setFechaInicio(Date.valueOf("2023-01-01"));
        p.setFechaCierre(Date.valueOf("2023-01-10"));
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoValido(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoValido_FechaCierreInvalida() {
        // Fecha cierre anterior a fecha inicio es inválido
        Puesto p = new Puesto();
        p.setNombre("Nombre");
        p.setDescripcion("Descrip");
        p.setFechaInicio(Date.valueOf("2023-12-20"));
        p.setFechaCierre(Date.valueOf("2023-12-10"));
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoValido(p);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsPuestoModificable_Si() {
        // Nombre y descripción del puesto son no vacíos, entonces es modificable
        Puesto p = new Puesto();
        p.setNombre("Nom");
        p.setDescripcion("Des");
        boolean expResult = true;
        boolean result = CtrlConvocatoria.esPuestoModificable(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoModificable_NombreInvalido() {
        Puesto p = new Puesto();
        p.setNombre("");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoModificable(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPuestoModificable_DescripcionInvalida() {
        Puesto p = new Puesto();
        p.setNombre("Nom");
        p.setDescripcion("");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esPuestoModificable(p);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsFechaValidaEntrevista_Valida() {
        // Para ser válida, fecha de entrevista debe ser posterior a fecha cierre de convocatoria
        Date fechaEntrev = Date.valueOf("2023-01-10");
        Date fechaCierre = Date.valueOf("2023-01-05");
        boolean expResult = true;
        boolean result = CtrlConvocatoria.esFechaValidaEntrevista(fechaEntrev, fechaCierre);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsFechaValidaEntrevista_Invalida() {
        Date fechaEntrev = Date.valueOf("2023-01-05");
        Date fechaCierre = Date.valueOf("2023-01-05");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esFechaValidaEntrevista(fechaEntrev, fechaCierre);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsFechaValidaPrueba_Valida() {
        // Para ser válida, fecha de prueba debe ser posterior a fecha de entrevista
        Date fechaPrueba = Date.valueOf("2023-02-05");
        Date fechaEntrev = Date.valueOf("2023-01-05");
        boolean expResult = true;
        boolean result = CtrlConvocatoria.esFechaValidaPrueba(fechaPrueba, fechaEntrev);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsFechaValidaPrueba_Invalida() {
        Date fechaPrueba = Date.valueOf("2023-02-05");
        Date fechaEntrev = Date.valueOf("2023-03-10");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esFechaValidaPrueba(fechaPrueba, fechaEntrev);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsFormatoPruebaValido_Valido() {
        // Para ser válido, la descripción del formato de prueba debe ser no vacía
        FormatoPrueba fp = new FormatoPrueba();
        fp.setDescripcion("Desc");
        boolean expResult = true;
        boolean result = CtrlConvocatoria.esFormatoPruebaValido(fp);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsFormatoPruebaValido_Invalido() {
        FormatoPrueba fp = new FormatoPrueba();
        fp.setDescripcion("");
        boolean expResult = false;
        boolean result = CtrlConvocatoria.esFormatoPruebaValido(fp);
        assertEquals(expResult, result);
    }
}