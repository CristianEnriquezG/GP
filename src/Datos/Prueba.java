/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author EGcri
 */
public class Prueba {
    private int cod_prueba;
    private int numero;
    private String descripcion;
    private int tiempo_ejecucion ;
    private String fecha_hora;
    private String observaciones;
    private int cod_postulante;
    private int cod_puesto;

    public Prueba() {
    }

    public Prueba(int cod_prueba, int numero, String descripcion, int tiempo_ejecucion, String fecha_hora, String observaciones, int cod_postulante, int cod_puesto) {
        this.cod_prueba = cod_prueba;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tiempo_ejecucion = tiempo_ejecucion;
        this.fecha_hora = fecha_hora;
        this.observaciones = observaciones;
        this.cod_postulante = cod_postulante;
        this.cod_puesto = cod_puesto;
    }

    public int getCod_prueba() {
        return cod_prueba;
    }

    public void setCod_prueba(int cod_prueba) {
        this.cod_prueba = cod_prueba;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo_ejecucion() {
        return tiempo_ejecucion;
    }

    public void setTiempo_ejecucion(int tiempo_ejecucion) {
        this.tiempo_ejecucion = tiempo_ejecucion;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
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
