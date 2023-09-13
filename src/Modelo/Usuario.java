/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author EGcri
 */
public class Usuario {
    private int uidUsuario;
    private String nombreUsuario;
    private String contraseñaUsuario;
    private int permisosUsuario;

    public Usuario(int uidUsuario, String nombreUsuario, String contraseñaUsuario, int permisosUsuario) {
        this.uidUsuario = uidUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.permisosUsuario = permisosUsuario;
    }

    public Usuario() {
    }

    public int getUidUsuario() {
        return uidUsuario;
    }

    public void setUidUsuario(int uidUsuario) {
        this.uidUsuario = uidUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getPermisosUsuario() {
        return permisosUsuario;
    }

    public void setPermisosUsuario(int permisosUsuario) {
        this.permisosUsuario = permisosUsuario;
    }
    
    
}
