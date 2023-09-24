package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrevistaDaoJDBC implements EntrevistaDao {
    
    private Connection ConexionDB;

    private static final String SQL_SELECT = "";
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
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
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
}
