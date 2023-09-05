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
public class Examen {
    private int cod_examen;
    private String fecha_hora_entrega;
    private int es_apto;
    private String fecha_rayos_x;
    private String fecha_audiometria;
    private String fecha_laboratorio;
    private String fecha_ecg;
    private String fecha_pcr;
    private int documentacion;
    private String observaciones;
    private int cod_postulante;
    private int cod_puesto;

    public Examen() {
    }

    public Examen(int cod_examen, String fecha_hora_entrega, int es_apto, String fecha_rayos_x, String fecha_audiometria, String fecha_laboratorio, String fecha_ecg, String fecha_pcr, int documentacion, String observaciones, int cod_postulante, int cod_puesto) {
        this.cod_examen = cod_examen;
        this.fecha_hora_entrega = fecha_hora_entrega;
        this.es_apto = es_apto;
        this.fecha_rayos_x = fecha_rayos_x;
        this.fecha_audiometria = fecha_audiometria;
        this.fecha_laboratorio = fecha_laboratorio;
        this.fecha_ecg = fecha_ecg;
        this.fecha_pcr = fecha_pcr;
        this.documentacion = documentacion;
        this.observaciones = observaciones;
        this.cod_postulante = cod_postulante;
        this.cod_puesto = cod_puesto;
    }

    public int getCod_examen() {
        return cod_examen;
    }

    public void setCod_examen(int cod_examen) {
        this.cod_examen = cod_examen;
    }

    public String getFecha_hora_entrega() {
        return fecha_hora_entrega;
    }

    public void setFecha_hora_entrega(String fecha_hora_entrega) {
        this.fecha_hora_entrega = fecha_hora_entrega;
    }

    public int getEs_apto() {
        return es_apto;
    }

    public void setEs_apto(int es_apto) {
        this.es_apto = es_apto;
    }

    public String getFecha_rayos_x() {
        return fecha_rayos_x;
    }

    public void setFecha_rayos_x(String fecha_rayos_x) {
        this.fecha_rayos_x = fecha_rayos_x;
    }

    public String getFecha_audiometria() {
        return fecha_audiometria;
    }

    public void setFecha_audiometria(String fecha_audiometria) {
        this.fecha_audiometria = fecha_audiometria;
    }

    public String getFecha_laboratorio() {
        return fecha_laboratorio;
    }

    public void setFecha_laboratorio(String fecha_laboratorio) {
        this.fecha_laboratorio = fecha_laboratorio;
    }

    public String getFecha_ecg() {
        return fecha_ecg;
    }

    public void setFecha_ecg(String fecha_ecg) {
        this.fecha_ecg = fecha_ecg;
    }

    public String getFecha_pcr() {
        return fecha_pcr;
    }

    public void setFecha_pcr(String fecha_pcr) {
        this.fecha_pcr = fecha_pcr;
    }

    public int getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(int documentacion) {
        this.documentacion = documentacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
    
}
