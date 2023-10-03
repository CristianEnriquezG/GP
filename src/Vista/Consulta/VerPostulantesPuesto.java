/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Consulta;

import Controlador.CtrlConsulta;
import Modelo.EntrevistaDao;
import Modelo.EntrevistaDaoJDBC;
import Modelo.Postulacion;
import Modelo.PostulacionDao;
import Modelo.PostulacionDaoJDBC;
import Modelo.Postulante;
import Modelo.PostulanteDao;
import Modelo.PostulanteDaoJDBC;
import Modelo.Puesto;
import Modelo.PuestoDao;
import Modelo.PuestoDaoJDBC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EGcri
 */
public class VerPostulantesPuesto extends javax.swing.JPanel {

    Postulante postulante = null;
    Postulacion postulacion = null;
    Puesto puesto = null;
    PostulanteDao postulanteInter = new PostulanteDaoJDBC();
    PostulacionDao postulacionInter = new PostulacionDaoJDBC();
    PuestoDao puestoInter = new PuestoDaoJDBC();
    EntrevistaDao entrevistaInter = new EntrevistaDaoJDBC();
    /**
     * Creates new form VerPostulantes
     */
    public VerPostulantesPuesto() {
        initComponents();
        llenarTablaPuesto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PuestosjTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        PostulantesjTable = new javax.swing.JTable();
        ImprimirjButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ver postulantes por puesto");
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 30));

        PuestosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo de Puesto", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PuestosjTable.setColumnSelectionAllowed(true);
        PuestosjTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = PuestosjTable.getSelectedRow();
                    Integer codPuesto  = (Integer)PuestosjTable.getValueAt(selectedRow, 0);
                    cargarPostulante(codPuesto );

                }
            }
        });
        jScrollPane2.setViewportView(PuestosjTable);
        PuestosjTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (PuestosjTable.getColumnModel().getColumnCount() > 0) {
            PuestosjTable.getColumnModel().getColumn(0).setResizable(false);
            PuestosjTable.getColumnModel().getColumn(1).setResizable(false);
        }

        PostulantesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido y Nombre", "Puntaje Promedio", "Etapa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PostulantesjTable.setColumnSelectionAllowed(true);
        PostulantesjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(PostulantesjTable);
        PostulantesjTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (PostulantesjTable.getColumnModel().getColumnCount() > 0) {
            PostulantesjTable.getColumnModel().getColumn(0).setResizable(false);
            PostulantesjTable.getColumnModel().getColumn(1).setResizable(false);
            PostulantesjTable.getColumnModel().getColumn(2).setResizable(false);
            PostulantesjTable.getColumnModel().getColumn(3).setResizable(false);
        }

        ImprimirjButton.setText("Imprimir");
        ImprimirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(ImprimirjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ImprimirjButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirjButtonActionPerformed
    private void llenarTablaPuesto(){
        List<Puesto> Puestos = new java.util.ArrayList<>();
        Puestos = puestoInter.select();
        if(Puestos.size() > 0)
        {
        DefaultTableModel model = (DefaultTableModel) PuestosjTable.getModel();
        model.setRowCount(0);
            for(Puesto puesto : Puestos)
            {
                Object[] row = new Object[2];
                row[0] = puesto.getCodPuesto();
                row[1] = puesto.getNombre();
                model.addRow(row);
            }    
        }
        else
        {
           mostrarVentanaDeError(CtrlConsulta.errorNoHayPuestos);
        }
        
    }

    private void cargarPostulante(int  codPuesto ){
        List<Postulacion> postulaciones = postulacionInter.select_cod(codPuesto);
        List<Postulante> postulantes = new ArrayList<>();        
        for (Postulacion postulacion : postulaciones) {
        List<Postulante> postulantesDePostulacion = postulanteInter.select_cod(postulacion.getCodPostulante());
        postulantes.addAll(postulantesDePostulacion);
        }
        DefaultTableModel model = (DefaultTableModel) PostulantesjTable.getModel();
        model.setNumRows(0);
        for (Postulacion postulacion : postulaciones) {
            for (Postulante postulante: postulantes)
            {
                if (postulacion.getCodPostulante() == postulante.getCodPostulante()){
                Object[] row = new Object[4];
                row[0] = postulante.getDni();
                row[1] = postulante.getApellido() + " " + postulante.getNombre();
                row[2] = entrevistaInter.promedio(postulante.getCodPostulante());
                row[3] = etapa(postulacion.getNumPruebaActual());
                model.addRow(row);
            }
            }            
        }
            
    }
    
    private String etapa(int numero){
        String etapa = "";
        switch(numero){
            case 0:
                etapa = "Entrevista";
                break;
            case 1:
                etapa = "Prueba";
                break;
            case 2:
                etapa = "Examen Preocupacional";
                break;
            case 3:
                etapa = "Finalizado";
                break;
        }                            
        return etapa;
                
    }
    
     public static void mostrarVentanaDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImprimirjButton;
    private javax.swing.JTable PostulantesjTable;
    private javax.swing.JTable PuestosjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
