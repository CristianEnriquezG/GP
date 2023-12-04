/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;

import Vista.Consulta.BuscarPostulante;
import Vista.Consulta.Calendario;
import Vista.Consulta.Calendario;
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
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.CtrlVentana;
import Modelo.Puesto;
import Modelo.PuestoDaoJDBC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author CristianEnriquezG
 */
public class Main {

	private static PanelSuperior topPanel;
	private static JPanel centerPanel;
	private static JPanel bottomPanel;
        private static JMenuBar Menu_Principal;
        private JMenu Postulante;
        private JMenu Etapa;
        private JMenu Consulta;
        private JMenu Convocatoria;
        private JMenu gestionUsuarios;
        private JMenuItem Eliminar_Datos;
        private JButton Cerrar_Sesion;
        
    public Main(){
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(Exception ex) {
            System.err.println("Libreria ausente");
            ex.printStackTrace();
        }
	        JFrame frame = new JFrame("Gestion de Postulantes");
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(1280, 720);
                frame.setMinimumSize(new Dimension(1280, 720));
	        frame.setLayout(new BorderLayout());
                frame.setResizable(true);
                if(! CtrlVentana.controlResolucion(1280,720))
                {
                    JFrame errorFrame = new JFrame("Error de resolución");
                    JOptionPane.showMessageDialog(errorFrame, "La resolución mínima requerida es 1280x720.");
                    errorFrame.dispose(); 
                    System.exit(0); 
                }
	        topPanel = new PanelSuperior();
	        topPanel.setPreferredSize(new Dimension(1280, 80));

	        centerPanel = new JPanel();
	        centerPanel.setPreferredSize(new Dimension(1280, 40));	        
	               
	        Main.Menu_Principal = new JMenuBar();
	        	        
	        Menu_Principal.setPreferredSize(new Dimension(1280, 40));
	        Font font = new Font(Menu_Principal.getFont().getName(), Font.BOLD, 16);
	        Menu_Principal.setFont(font);
	        Menu_Principal.setOpaque(false);
	        
	        
	        this.Postulante = new JMenu("Postulante");
	        Postulante.setFont(font);
	        
	        JMenuItem Registrar_datos = new JMenuItem("Registrar Datos");
			Registrar_datos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new RegistrarDatos(Main.this,Main.topPanel));
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
	        this.Eliminar_Datos = new JMenuItem("Eliminar Datos");
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
	        
	        this.Convocatoria = new JMenu("Convocatoria");
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
	        	        	        	        
	        this.Etapa = new JMenu("Etapa");
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
	        
	        this.Consulta = new JMenu("Consulta");
	        Consulta.setFont(font);
	            
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
                        
	        ver_Puesto.setFont(font);
	        Consulta.add(ver_Puesto);
                
                JMenuItem calendario = new JMenuItem("Ver Calendario");
			calendario.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					bottomPanel.removeAll();
					bottomPanel.add(new Calendario());
					bottomPanel.revalidate();
					bottomPanel.repaint();
				}
			});

	        calendario.setFont(font);
	        Consulta.add(calendario);
                
                Menu_Principal.add(Consulta);
                
                this.gestionUsuarios = new JMenu("Gestion de usuarios");
            gestionUsuarios.setFont(font);
            
            JMenuItem agregarUsuario = new JMenuItem("Agregar Usuario");
                agregarUsuario.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e){
                        bottomPanel.removeAll();
                        bottomPanel.add(new CrearUsuario(Main.topPanel));
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
                
                Cerrar_Sesion = new JButton("Cerrar Sesion");
                Cerrar_Sesion.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            bottomPanel.removeAll();
                            bottomPanel.add(new Login(Main.this,Main.topPanel));
                            bottomPanel.revalidate();
                            bottomPanel.repaint();
                            Etapa.setVisible(false);
                            Convocatoria.setVisible(false);
                            Consulta.setVisible(false);
                            gestionUsuarios.setVisible(false);
                            Postulante.setVisible(false);
                            Cerrar_Sesion.setVisible(false);
                        }
                    });
                
	        Cerrar_Sesion.setPreferredSize(new Dimension(200, 40));
	        Cerrar_Sesion.setOpaque(false);
	        Cerrar_Sesion.setBorderPainted(false);
	        Cerrar_Sesion.setFont(font);
                Cerrar_Sesion.setVisible(false);
	        
	        Menu_Principal.add(Cerrar_Sesion);
	        
                
                JButton SalirBoton = new JButton("Salir");
                SalirBoton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e){
                                System.exit(0);
                        }
                });
                SalirBoton.setOpaque(false);
	        SalirBoton.setBorderPainted(false);
	        SalirBoton.setFont(font);
            
            
                        
                Menu_Principal.add(SalirBoton);
	        centerPanel.add(Menu_Principal);	        	                       
	    	bottomPanel = new JPanel();
	        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 550));
	        bottomPanel.add(new Login(this,Main.topPanel));
                topPanel.add(new PanelSuperior());
                Etapa.setVisible(false);
                Convocatoria.setVisible(false);
                Consulta.setVisible(false);
                gestionUsuarios.setVisible(false);
                Postulante.setVisible(false);
	        frame.add(topPanel, BorderLayout.NORTH);
	        frame.add(centerPanel, BorderLayout.CENTER);
	        frame.add(bottomPanel, BorderLayout.SOUTH);
                
                frame.setVisible(true);
                ejecutarHiloCerrarConvocatoria(bottomPanel);
    }
    
    public static void main(String[] args) {
        Main principal = new Main();
    }
    
    public void setBottomPanel(){
        bottomPanel.removeAll();
        bottomPanel.add(new CrearUsuario(Main.topPanel));
        bottomPanel.revalidate();        
        bottomPanel.repaint();
     }
     public void setBottomPanelVacio(){
        bottomPanel.removeAll();
        bottomPanel.revalidate();        
        bottomPanel.repaint();
    }
    
    public void Administrador(){
        Postulante.setVisible(true);
        Etapa.setVisible(true);
        gestionUsuarios.setVisible(true);
        Consulta.setVisible(true);
        Convocatoria.setVisible(true);
        Eliminar_Datos.setVisible(true);
        Cerrar_Sesion.setVisible(true);
    }
    
    public void Operador(){
        Etapa.setVisible(true);
        Convocatoria.setVisible(true);
        Eliminar_Datos.setVisible(true);
    }
    
    public void Postulante(){
        Postulante.setVisible(true);
        Eliminar_Datos.setVisible(false);
        bottomPanel.removeAll();
        bottomPanel.add(new RegistrarDatos(Main.this,Main.topPanel));
        bottomPanel.revalidate();
        bottomPanel.repaint();
    }
    
    /* Este hilo cierra las convocatorias cuya fecha de cierre sea <= a la fecha actual;
     * ejecuta esta tarea apenas iniciado el programa y luego a las 0:00 hs de cada día
     * (obviamente, siempre y cuando el programa se mantenga en ejecución) */
    public final void ejecutarHiloCerrarConvocatoria(JPanel jpan) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(LocalDate.now().toString());
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
        java.util.Timer t = new java.util.Timer();
        TimerTask ttCerrarConvocatoria = new TimerTask() {
            @Override
            public void run() {
                PuestoDaoJDBC pstDao = new PuestoDaoJDBC();
                ArrayList<Puesto> arrPst = pstDao.selectPstCierreConv();
                Puesto p = null;
                for(int i = 0; i < arrPst.size(); i++) {
                    p = arrPst.get(i);
                    p.setEstadoConvocatoria("cerrada");
                    pstDao.update(p);
                    JOptionPane.showMessageDialog(jpan,"Se ha cerrado la convocatoria\n   Puesto: " + p.getNombre() + "\n   Código: " + String.format("%05d",p.getCodPuesto()));
                }
            };
        };
        t.scheduleAtFixedRate(ttCerrarConvocatoria,d,86400000L);
    }
}