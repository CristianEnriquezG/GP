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
public class Cuenta_usuario {
    
    private int cod_usuario;
    private String nombre_usuario;
    private String tipo_usuario;
    private String password;

    public Cuenta_usuario() {
    }

    public Cuenta_usuario(int cod_usuario, String nombre_usuario, String tipo_usuario, String password) {
        this.cod_usuario = cod_usuario;
        this.nombre_usuario = nombre_usuario;
        this.tipo_usuario = tipo_usuario;
        this.password = password;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
