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
public class Entrevista {
    private int cod_entrevista;
    private int presentacion;
    private int actitud;
    private int conversacion;
    private int disposicion;
    private int decision;
    private int transporte;
    private int aspecto_fisico;
    private int experiencia;
    private int conocimientos;
    private int relacion;
    private int liderazgo;
    private int manejo_herramientas;
    private String vive_con;
    private String estudios;
    private String recomendado_por;
    private int cod_postulante;
    private int cod_puesto;

    public Entrevista() {
    }

    public Entrevista(int cod_entrevista, int presentacion, int actitud, int conversacion, int disposicion, int decision, int transporte, int aspecto_fisico, int experiencia, int conocimientos, int relacion, int liderazgo, int manejo_herramientas, String vive_con, String estudios, String recomendado_por, int cod_postulante, int cod_puesto) {
        this.cod_entrevista = cod_entrevista;
        this.presentacion = presentacion;
        this.actitud = actitud;
        this.conversacion = conversacion;
        this.disposicion = disposicion;
        this.decision = decision;
        this.transporte = transporte;
        this.aspecto_fisico = aspecto_fisico;
        this.experiencia = experiencia;
        this.conocimientos = conocimientos;
        this.relacion = relacion;
        this.liderazgo = liderazgo;
        this.manejo_herramientas = manejo_herramientas;
        this.vive_con = vive_con;
        this.estudios = estudios;
        this.recomendado_por = recomendado_por;
        this.cod_postulante = cod_postulante;
        this.cod_puesto = cod_puesto;
    }

    public int getCod_entrevista() {
        return cod_entrevista;
    }

    public void setCod_entrevista(int cod_entrevista) {
        this.cod_entrevista = cod_entrevista;
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

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getAspecto_fisico() {
        return aspecto_fisico;
    }

    public void setAspecto_fisico(int aspecto_fisico) {
        this.aspecto_fisico = aspecto_fisico;
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

    public int getManejo_herramientas() {
        return manejo_herramientas;
    }

    public void setManejo_herramientas(int manejo_herramientas) {
        this.manejo_herramientas = manejo_herramientas;
    }

    public String getVive_con() {
        return vive_con;
    }

    public void setVive_con(String vive_con) {
        this.vive_con = vive_con;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getRecomendado_por() {
        return recomendado_por;
    }

    public void setRecomendado_por(String recomendado_por) {
        this.recomendado_por = recomendado_por;
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
