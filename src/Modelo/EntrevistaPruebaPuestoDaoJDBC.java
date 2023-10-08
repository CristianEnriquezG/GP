/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MC1
 */
public class EntrevistaPruebaPuestoDaoJDBC implements EntrevistaPruebaPuestoDao {
    
    @Override
    public ArrayList<EntrevistaPruebaPuesto> selectEntrevistaPuesto(int mes, int año) {
        ArrayList<EntrevistaPruebaPuesto> ListaEntPst = new ArrayList<>();
        String sql = "SELECT hora,nombre,DAY(fecha) FROM formato_entrevista JOIN puesto ON formato_entrevista.cod_puesto = puesto.cod_puesto WHERE YEAR(fecha) = ? AND MONTH(fecha) = ? AND puesto.estado_convocatoria != 'cancelada';";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
            rs = ps.executeQuery();
            while(rs.next()) {
                EntrevistaPruebaPuesto epp = new EntrevistaPruebaPuesto();
                
                epp.setHora(rs.getTime(1));
                epp.setNombrePuesto(rs.getString(2));
                epp.setDia(rs.getInt(3));
                
                ListaEntPst.add(epp);
            }
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Conector_DB.close(rs);
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return ListaEntPst;
    }
    
    @Override
    public ArrayList<EntrevistaPruebaPuesto> selectPruebaPuesto(int mes, int año) {
        ArrayList<EntrevistaPruebaPuesto> ListaPruPst = new ArrayList<>();
        String sql = "SELECT hora,nombre,DAY(fecha),num_prueba FROM formato_prueba JOIN puesto ON formato_prueba.cod_puesto = puesto.cod_puesto WHERE YEAR(fecha) = ? AND MONTH(fecha) = ? AND puesto.estado_convocatoria != 'cancelada';";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
            rs = ps.executeQuery();
            while(rs.next()) {
                EntrevistaPruebaPuesto epp = new EntrevistaPruebaPuesto();
                
                epp.setHora(rs.getTime(1));
                epp.setNombrePuesto(rs.getString(2));
                epp.setDia(rs.getInt(3));
                epp.setNumPrueba(rs.getInt(4));
                
                ListaPruPst.add(epp);
            }
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Conector_DB.close(rs);
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return ListaPruPst;
    }
}