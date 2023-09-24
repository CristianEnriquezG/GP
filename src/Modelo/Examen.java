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
public class Examen {
    private int codExamen;
    private Date fechaEntrega;
    private Time horaEntrega;
    private boolean esApto;
    private String observaciones;
    private int codPostulante;
    private int codPuesto;

    public int getCodExamen() {
        return codExamen;
    }

    public void setCodExamen(int codExamen) {
        this.codExamen = codExamen;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEsApto() {
        return esApto;
    }

    public void setEsApto(boolean esApto) {
        this.esApto = esApto;
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