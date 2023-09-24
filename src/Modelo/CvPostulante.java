/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.InputStream;

/**
 *
 * @author MC1
 */
public class CvPostulante {
    private int codCv;
    private InputStream cv;
    private int codPostulante;

    public int getCodCv() {
        return codCv;
    }

    public void setCodCv(int codCv) {
        this.codCv = codCv;
    }

    public InputStream getCv() {
        return cv;
    }

    public void setCv(InputStream cv) {
        this.cv = cv;
    }

    public int getCodPostulante() {
        return codPostulante;
    }

    public void setCodPostulante(int codPostulante) {
        this.codPostulante = codPostulante;
    }
}