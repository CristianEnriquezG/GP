package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EntrevistaDaoJDBC implements EntrevistaDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "SELECT * FROM entrevista WHERE cod_postulante = ?;";
    private static final String SQL_INSERT = "INSERT INTO entrevista(fecha,hora,presentacion,actitud,conversacion,disposicion,decision,disponibilidad,transporte,aspecto_fisico,experiencia,conocimientos,relacion,liderazgo,manejo_herramientas,vive_con,estudios,recomendado_por,cod_postulante,cod_puesto) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    @Override
  public List<Entrevista> select(){
        List<Entrevista> convocatoria = new ArrayList<Entrevista>();
        return convocatoria;
    }

    @Override
    public int insert(Entrevista Entrevista){
        int rows = 0;
        String sql = SQL_INSERT;
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = Conector_DB.getConnection();
            ps = c.prepareStatement(sql);
            ps.setDate(1,Entrevista.getFecha());
            ps.setTime(2,Entrevista.getHora());
            ps.setInt(3,Entrevista.getPresentacion());
            ps.setInt(4,Entrevista.getActitud());
            ps.setInt(5,Entrevista.getConversacion());
            ps.setInt(6,Entrevista.getDisposicion());
            ps.setInt(7,Entrevista.getDecision());
            ps.setInt(8,Entrevista.getDisponibilidad());
            ps.setInt(9,Entrevista.getTransporte());
            ps.setInt(10,Entrevista.getAspectoFisico());
            ps.setInt(11,Entrevista.getExperiencia());
            ps.setInt(12,Entrevista.getConocimientos());
            ps.setInt(13,Entrevista.getRelacion());
            ps.setInt(14,Entrevista.getLiderazgo());
            ps.setInt(15,Entrevista.getManejoHerramientas());
            ps.setString(16,Entrevista.getViveCon());
            ps.setString(17,Entrevista.getEstudios());
            ps.setString(18,Entrevista.getRecomendadoPor());
            ps.setInt(19,Entrevista.getCodPostulante());
            ps.setInt(20,Entrevista.getCodPuesto());
            ps.executeUpdate();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            Conector_DB.close(ps);
            Conector_DB.close(c);
        }
        return rows;
    }

    @Override
    public int update(Entrevista Entrevista){
        int rows = 0;

        return rows;

    }

    @Override
    public int delete(Entrevista Entrevista){
        int rows = 0;

        return rows;
    }
    @Override
    public int promedio (int cod_postulante){
        Connection Conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int promedio = 0;
        int[] resultados = new int[13];
        try{
            Conexion = this.ConexionDB != null ? this.ConexionDB : Conector_DB.getConnection();
            stmt = Conexion.prepareStatement(SQL_SELECT);
            stmt.setInt(1, cod_postulante);
            rs = stmt.executeQuery();
            while(rs.next()){
                int i = 4;
                int j = 0;
                while(i<11 & j < resultados.length){
                    resultados[j] = rs.getInt(i);
                    i++;
                    j++;
                }
            }
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        int cantidad = 0;
        for(int i = 0; i < resultados.length ; i++){
            if(resultados[i] != 0){
                promedio += resultados[i];
                cantidad++;
            }
        }
        if(cantidad != 0)
            promedio = promedio/cantidad;
        return promedio;
    }
}
