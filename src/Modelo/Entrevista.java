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
public class Entrevista {
    private int codEntrevista;
    private Date fecha;
    private Time hora;
    private int presentacion;
    private int actitud;
    private int conversacion;
    private int disposicion;
    private int decision;
    private int disponibilidad;
    private int transporte;
    private int aspectoFisico;
    private int experiencia;
    private int conocimientos;
    private int relacion;
    private int liderazgo;
    private int manejoHerramientas;
    private String viveCon;
    private String estudios;
    private String recomendadoPor;
    private int codPostulante;
    private int codPuesto;

    public int getCodEntrevista() {
        return codEntrevista;
    }

    public void setCodEntrevista(int codEntrevista) {
        this.codEntrevista = codEntrevista;
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

    public int getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public int getActitud() {
        return actitud;
    }

    public void setActitud(int actitud) {
        this.actitud = actitud;
    }

    public int getConversacion() {
        return conversacion;
    }

    public void setConversacion(int conversacion) {
        this.conversacion = conversacion;
    }

    public int getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(int disposicion) {
        this.disposicion = disposicion;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getAspectoFisico() {
        return aspectoFisico;
    }

    public void setAspectoFisico(int aspectoFisico) {
        this.aspectoFisico = aspectoFisico;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(int conocimientos) {
        this.conocimientos = conocimientos;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    public int getLiderazgo() {
        return liderazgo;
    }

    public void setLiderazgo(int liderazgo) {
        this.liderazgo = liderazgo;
    }

    public int getManejoHerramientas() {
        return manejoHerramientas;
    }

    public void setManejoHerramientas(int manejoHerramientas) {
        this.manejoHerramientas = manejoHerramientas;
    }

    public String getViveCon() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getRecomendadoPor() {
        return recomendadoPor;
    }

    public void setRecomendadoPor(String recomendadoPor) {
        this.recomendadoPor = recomendadoPor;
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