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
public class Convocatoria {
    
    private int cod_convocatoria;
    private String titulo;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String estado;

    public int getCod_convocatoria() {
        return cod_convocatoria;
    }

    public void setCod_convocatoria(int cod_convocatoria) {
        this.cod_convocatoria = cod_convocatoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Convocatoria() {
    }

    public Convocatoria(int cod_convocatoria, String titulo, String descripcion, String fecha_inicio, String fecha_fin, String estado) {
        this.cod_convocatoria = cod_convocatoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }
    
}
