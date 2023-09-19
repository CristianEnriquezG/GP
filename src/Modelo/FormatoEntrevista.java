/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author MC1
 */
public class FormatoEntrevista {
    private int codFormatoEntrevista;
    private Date fecha;
    private Time hora;
    private boolean presentacion;
    private boolean actitud;
    private boolean conversacion;
    private boolean disposicion;
    private boolean decision;
    private boolean disponibilidad;
    private boolean transporte;
    private boolean aspectoFisico;
    private boolean experiencia;
    private boolean conocimientos;
    private boolean relacion;
    private boolean liderazgo;
    private boolean manejoHerramientas;
    private int codPuesto; 

    public int getCodFormatoEntrevista() {
        return codFormatoEntrevista;
    }

    public void setCodFormatoEntrevista(int codFormatoEntrevista) {
        this.codFormatoEntrevista = codFormatoEntrevista;
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

    public boolean isPresentacion() {
        return presentacion;
    }

    public void setPresentacion(boolean presentacion) {
        this.presentacion = presentacion;
    }

    public boolean isActitud() {
        return actitud;
    }

    public void setActitud(boolean actitud) {
        this.actitud = actitud;
    }

    public boolean isConversacion() {
        return conversacion;
    }

    public void setConversacion(boolean conversacion) {
        this.conversacion = conversacion;
    }

    public boolean isDisposicion() {
        return disposicion;
    }

    public void setDisposicion(boolean disposicion) {
        this.disposicion = disposicion;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    public boolean isAspectoFisico() {
        return aspectoFisico;
    }

    public void setAspectoFisico(boolean aspectoFisico) {
        this.aspectoFisico = aspectoFisico;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(boolean conocimientos) {
        this.conocimientos = conocimientos;
    }

    public boolean isRelacion() {
        return relacion;
    }

    public void setRelacion(boolean relacion) {
        this.relacion = relacion;
    }

    public boolean isLiderazgo() {
        return liderazgo;
    }

    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    public boolean isManejoHerramientas() {
        return manejoHerramientas;
    }

    public void setManejoHerramientas(boolean manejoHerramientas) {
        this.manejoHerramientas = manejoHerramientas;
    }

    public int getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(int codPuesto) {
        this.codPuesto = codPuesto;
    }
}