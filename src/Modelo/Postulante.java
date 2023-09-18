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
    private int codPostulante;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String email;
    private boolean estado;

    public Postulante() {}

    public Postulante(int codPostulante, int dni, String apellido, String nombre, String domicilio, String telefono, String email, boolean estado) {
        this.codPostulante = codPostulante;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
    
    public int getCodPostulante() {
        return codPostulante;
    }

    public void setCodPostulante(int codPostulante) {
        this.codPostulante = codPostulante;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}