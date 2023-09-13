/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EGcri
 */
public class UsuarioDaoJDBC implements UsuarioDao{
        private Connection ConexionDB;

    private static final String SQL_SELECT = "";
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";


    public List<Usuario> select(){
        List<Usuario> Usuario = new ArrayList<Usuario>();
        return Usuario;
    }

    public int insert(Usuario Usuario){
        int rows = 0;

        return rows;
    }

    public int update(Usuario Usuario){
        int rows = 0;

        return rows;

    }

    public int delete(Usuario Usuario){
        int rows = 0;

        return rows;
    }
}
