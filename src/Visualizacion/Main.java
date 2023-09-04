/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author EGcri
 */
public class Main {
     public static void main(String[] args) {
	        
	        JFrame frame = new JFrame("Mi Aplicación");
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(1280, 720);	        	        	      
	        
	        frame.setLayout(new BorderLayout());
	        
	        JPanel topPanel = new JPanel();
	        topPanel.setPreferredSize(new Dimension(frame.getWidth(), 80));
	        topPanel.setBackground(Color.RED);

	        JPanel centerPanel = new JPanel();
	        centerPanel.setPreferredSize(new Dimension(frame.getWidth(), 40));
	        centerPanel.setBackground(Color.GREEN);
	        
	        
	        
	        JMenuBar Menu_Principal = new JMenuBar();
	        	        
	        Menu_Principal.setPreferredSize(new Dimension(frame.getWidth(), 40));
	        Font font = new Font(Menu_Principal.getFont().getName(), Font.BOLD, 16);
	        Menu_Principal.setFont(font);
	        Menu_Principal.setOpaque(false);
	        
	        JButton Inicio = new JButton("Inicio");
	        
	        Inicio.setPreferredSize(new Dimension(200, 40));
	        Inicio.setOpaque(false);
	        Inicio.setContentAreaFilled(false);
	        Inicio.setBorderPainted(false);
	        Inicio.setFont(font);
	        
	        Menu_Principal.add(Inicio);
	        
	        JMenu Postulante = new JMenu("Postulante");
	        Postulante.setFont(font);
	        
	        JMenuItem Registrar_datos = new JMenuItem("Registrar Datos");
	        JMenuItem Modificar_datos = new JMenuItem("Modificar Datos");
	        JMenuItem Eliminar_Datos = new JMenuItem("Eliminar Datos");
	        JMenuItem Registrar_Postulacion = new JMenuItem("Registrar Postulación");
	        
	        Registrar_datos.setFont(font);
	        Modificar_datos.setFont(font);
	        Eliminar_Datos.setFont(font);
	        Registrar_Postulacion.setFont(font);
	        
	        Postulante.add(Registrar_datos);
	        Postulante.add(Modificar_datos);
	        Postulante.add(Eliminar_Datos);
	        Postulante.add(Registrar_Postulacion);

	        Menu_Principal.add(Postulante);
	        
	        JMenu Convocatoria = new JMenu("Convocatoria");
	        Convocatoria.setFont(font);
	        
	        JMenuItem crear = new JMenuItem("Crear");
	        JMenuItem modificar = new JMenuItem("Modificar");
	        JMenuItem cancelar = new JMenuItem("Cancelar");
	        
	        crear.setFont(font);
	        modificar.setFont(font);
	        cancelar.setFont(font);
	        
	        
	        Convocatoria.add(crear);
	        Convocatoria.add(modificar);
	        Convocatoria.add(cancelar);
	        
	        Menu_Principal.add(Convocatoria);
	        	        	        	        
	        JMenu Etapa = new JMenu("Etapa");
	        Etapa.setFont(font);
	        
	        JMenuItem nueva_entrevista = new JMenuItem("Nueva Entrevista");
	        JMenuItem nueva_prueba = new JMenuItem("Nueva Prueba");
	        JMenuItem nuevo_examen = new JMenuItem("Nuevo Examen Pre-Ocupacional");
	        
	        nueva_entrevista.setFont(font);
	        nueva_prueba.setFont(font);
	        nuevo_examen.setFont(font);
	        
	        Etapa.add(nueva_entrevista);
	        Etapa.add(nueva_prueba);
	        Etapa.add(nuevo_examen);
	        
	        Menu_Principal.add(Etapa);
	        
	        JMenu Consulta = new JMenu("Consulta");
	        Consulta.setFont(font);
	        
	        JMenuItem buscar_DNI = new JMenuItem("Buscar postulante por DNI");
	        JMenuItem buscar_Nombre = new JMenuItem("Buscar postulante por nombre y apellido");
	        JMenuItem ver_Puesto = new JMenuItem("Ver Postulantes por puesto");
	        
	        buscar_DNI.setFont(font);
	        buscar_Nombre.setFont(font);
	        ver_Puesto.setFont(font);
	        
	        Consulta.add(buscar_DNI);
	        Consulta.add(buscar_Nombre);
	        Consulta.add(ver_Puesto);

	        Menu_Principal.add(Consulta);
	        
                JButton SalirBoton = new JButton("Salir");
                
                Menu_Principal.add(SalirBoton);
	        centerPanel.add(Menu_Principal);
	        
	        


	        JPanel bottomPanel = new JPanel();
	        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 550));
	        bottomPanel.setBackground(Color.BLUE);
	        bottomPanel.add(new Login());

	        frame.add(topPanel, BorderLayout.NORTH);
	        frame.add(centerPanel, BorderLayout.CENTER);
	        frame.add(bottomPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);
	    }

}
