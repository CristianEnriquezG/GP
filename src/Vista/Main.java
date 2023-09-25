/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;

import Vista.Consulta.BuscarPostulante;
import Vista.Consulta.VerPostulantesPuesto;
import Vista.Convocatoria.Crear;
import Vista.Convocatoria.Modificar;
import Vista.Convocatoria.Cancelar;
import Vista.Etapa.NuevaEntrevista;
import Vista.Etapa.NuevaPrueba;
import Vista.Etapa.NuevoExamen;
import Vista.GestionUsuarios.CrearUsuario;
import Vista.GestionUsuarios.EliminarUsuario;
import Vista.GestionUsuarios.ModificarUsuario;
import Vista.Postulantes.EliminarDatos;
import Vista.Postulantes.ModificarDatos;
import Vista.Postulantes.RegistrarDatos;
import Vista.Postulantes.RegistrarPostulacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author CristianEnriquezG
 */
public class Main {

	private static JPanel topPanel;
	private static JPanel centerPanel;
	private static JPanel bottomPanel;

     public static void main(String[] args) {
	        
	        JFrame frame = new JFrame("Gestion de Postulantes");
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(1280, 720);	        	        	      	        
	        frame.setLayout(new BorderLayout());
                frame.setResizable(false);
	        
	        topPanel = new JPanel();
	        topPanel.setPreferredSize(new Dimension(frame.getWidth(), 80));
	        topPanel.setBackground(Color.RED);

	        centerPanel = new JPanel();
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
			Registrar_datos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new RegistrarDatos());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        JMenuItem Modificar_datos = new JMenuItem("Modificar Datos");
			Modificar_datos.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new ModificarDatos());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			}
			);
	        JMenuItem Eliminar_Datos = new JMenuItem("Eliminar Datos");
			Eliminar_Datos.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new EliminarDatos());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        JMenuItem Registrar_Postulacion = new JMenuItem("Registrar Postulación");
	        Registrar_Postulacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new RegistrarPostulacion());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
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
			crear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new Crear());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        JMenuItem modificar = new JMenuItem("Modificar");
			modificar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new Modificar());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			}
			);
	        JMenuItem cancelar = new JMenuItem("Cancelar");
	        cancelar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new Cancelar());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});

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
			nueva_entrevista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new NuevaEntrevista());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        JMenuItem nueva_prueba = new JMenuItem("Nueva Prueba");
			nueva_prueba.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new NuevaPrueba());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        JMenuItem nuevo_examen = new JMenuItem("Nuevo Examen Pre-Ocupacional");
			nuevo_examen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new NuevoExamen());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        
	        nueva_entrevista.setFont(font);
	        nueva_prueba.setFont(font);
	        nuevo_examen.setFont(font);
	        
	        Etapa.add(nueva_entrevista);
	        Etapa.add(nueva_prueba);
	        Etapa.add(nuevo_examen);
	        
	        Menu_Principal.add(Etapa);
	        
	        JMenu Consulta = new JMenu("Consulta");
	        Consulta.setFont(font);
	        
	        JMenuItem buscar_DNI = new JMenuItem("Buscar postulante");
			buscar_DNI.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new BuscarPostulante());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});	       
	        JMenuItem ver_Puesto = new JMenuItem("Ver Postulantes por puesto");
			ver_Puesto.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new VerPostulantesPuesto());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});
	        
	        buscar_DNI.setFont(font);
	        ver_Puesto.setFont(font);
	        
	        Consulta.add(buscar_DNI);
	        Consulta.add(ver_Puesto);
                
	        Menu_Principal.add(Consulta);
                
                JMenu gestionUsuarios = new JMenu("Gestion de usuarios");
            gestionUsuarios.setFont(font);
            
            JMenuItem agregarUsuario = new JMenuItem("Agregar Usuario");
                agregarUsuario.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e){
                        bottomPanel.removeAll();
                        bottomPanel.add(new CrearUsuario());
                        bottomPanel.revalidate();
                        bottomPanel.repaint();
                    }
                });
            
            JMenuItem modificarUsuario = new JMenuItem("Modificar Usuario");
                modificarUsuario.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e){
                        bottomPanel.removeAll();
                        bottomPanel.add(new ModificarUsuario());
                        bottomPanel.revalidate();
                        bottomPanel.repaint();
                    }
                });
            
            JMenuItem eliminarUsuario = new JMenuItem("Eliminar Usuario");
                eliminarUsuario.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e){
                        bottomPanel.removeAll();
                        bottomPanel.add(new EliminarUsuario());
                        bottomPanel.revalidate();
                        bottomPanel.repaint();
                    }
                });
	    
                agregarUsuario.setFont(font);
                modificarUsuario.setFont(font);
                eliminarUsuario.setFont(font);
                
                gestionUsuarios.add(agregarUsuario);
                gestionUsuarios.add(modificarUsuario);
                gestionUsuarios.add(eliminarUsuario);
                
                Menu_Principal.add(gestionUsuarios);
                
                JButton SalirBoton = new JButton("Salir");
                SalirBoton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e){
                                System.exit(0);
                        }
                });
            
            
                        
                Menu_Principal.add(SalirBoton);
	        centerPanel.add(Menu_Principal);	        	        

	    	bottomPanel = new JPanel();
	        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 550));
	        bottomPanel.setBackground(Color.BLUE);
	        bottomPanel.add(new Login());

	        frame.add(topPanel, BorderLayout.NORTH);
	        frame.add(centerPanel, BorderLayout.CENTER);
	        frame.add(bottomPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);

			
	    }

}
