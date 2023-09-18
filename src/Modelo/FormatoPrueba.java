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
public class FormatoPrueba {
    private int codFormatoPrueba;
    private int numPrueba;
    private String descripcion;
    private Date fecha;
    private Time hora;
    private int codPuesto;

    public int getCodFormatoPrueba() {
        return codFormatoPrueba;
    }

    public void setCodFormatoPrueba(int codFormatoPrueba) {
        this.codFormatoPrueba = codFormatoPrueba;
    }

    public int getNumPrueba() {
        return numPrueba;
    }

    public void setNumPrueba(int numPrueba) {
        this.numPrueba = numPrueba;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(int codPuesto) {
        this.codPuesto = codPuesto;
    }
}