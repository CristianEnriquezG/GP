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
public class Postulante {
  private  int cod_postulante;
  private  long DNI;
  private  String domicilio;
  private  long telefono;
  private  String email;
  private  int cv;
  private  int estado;

    public Postulante(int cod_postulante, long DNI, String domicilio, long telefono, String email, int cv, int estado) {
        this.cod_postulante = cod_postulante;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.cv = cv;
        this.estado = estado;
    }

    public Postulante() {
    }

    public int getCod_postulante() {
        return cod_postulante;
    }

    public void setCod_postulante(int cod_postulante) {
        this.cod_postulante = cod_postulante;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
