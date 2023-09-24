/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author EGcri
 */
public class Prueba {
    private int codPrueba;
    private Date fecha;
    private Time hora;
    private int resultado;
    private String observaciones;
    private int codPostulante;
    private int codPuesto;
    
    public int getCodPrueba() {
        return codPrueba;
    }

    public void setCodPrueba(int codPrueba) {
        this.codPrueba = codPrueba;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCodPostulante() {
        return codPostulante;
    }

    public void setCodPostulante(int codPostulante) {
        this.codPostulante = codPostulante;
    }

    public int getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(int codPuesto) {
        this.codPuesto = codPuesto;
    }
}