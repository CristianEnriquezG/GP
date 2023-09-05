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
    private int cod_postulante;
    private int cod_puesto;
    private String etapa;
    private int pruebas_completadas;

    public Postulacion() {
    }

    public Postulacion(int cod_postulante, int cod_puesto, String etapa, int pruebas_completadas) {
        this.cod_postulante = cod_postulante;
        this.cod_puesto = cod_puesto;
        this.etapa = etapa;
        this.pruebas_completadas = pruebas_completadas;
    }

    public int getCod_postulante() {
        return cod_postulante;
    }

    public void setCod_postulante(int cod_postulante) {
        this.cod_postulante = cod_postulante;
    }

    public int getCod_puesto() {
        return cod_puesto;
    }

    public void setCod_puesto(int cod_puesto) {
        this.cod_puesto = cod_puesto;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getPruebas_completadas() {
        return pruebas_completadas;
    }

    public void setPruebas_completadas(int pruebas_completadas) {
        this.pruebas_completadas = pruebas_completadas;
    }
    
}
