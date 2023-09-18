/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EGcri
 */
public class Postulacion {
    private int codPostulante;
    private int codPuesto;
    private String etapaActual;
    private int numPruebaActual;

    public Postulacion() {}

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

    public String getEtapaActual() {
        return etapaActual;
    }

    public void setEtapaActual(String etapaActual) {
        this.etapaActual = etapaActual;
    }

    public int getNumPruebaActual() {
        return numPruebaActual;
    }

    public void setNumPruebaActual(int numPruebaActual) {
        this.numPruebaActual = numPruebaActual;
    }
}