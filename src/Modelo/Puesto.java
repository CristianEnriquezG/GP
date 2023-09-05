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
public class Puesto {
    private int cod_puesto;
    private String denomicnacion;
    private int cantidad_pruebas;
    private int cod_convocatoria;

    public Puesto() {
    }

    public Puesto(int cod_puesto, String denomicnacion, int cantidad_pruebas, int cod_convocatoria) {
        this.cod_puesto = cod_puesto;
        this.denomicnacion = denomicnacion;
        this.cantidad_pruebas = cantidad_pruebas;
        this.cod_convocatoria = cod_convocatoria;
    }

    public int getCod_puesto() {
        return cod_puesto;
    }

    public void setCod_puesto(int cod_puesto) {
        this.cod_puesto = cod_puesto;
    }

    public String getDenomicnacion() {
        return denomicnacion;
    }

    public void setDenomicnacion(String denomicnacion) {
        this.denomicnacion = denomicnacion;
    }

    public int getCantidad_pruebas() {
        return cantidad_pruebas;
    }

    public void setCantidad_pruebas(int cantidad_pruebas) {
        this.cantidad_pruebas = cantidad_pruebas;
    }

    public int getCod_convocatoria() {
        return cod_convocatoria;
    }

    public void setCod_convocatoria(int cod_convocatoria) {
        this.cod_convocatoria = cod_convocatoria;
    }
    
}
