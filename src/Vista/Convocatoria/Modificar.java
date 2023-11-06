/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Convocatoria;

import Controlador.CtrlConvocatoria;
import Modelo.Puesto;
import Modelo.PuestoDaoJDBC;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author EGcri
 */
public class Modificar extends javax.swing.JPanel {
    ArrayList<String> listaPuestosActivos;
    Puesto puest;

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        activarFormModificarPuesto(false);
        listaPuestosActivos = new ArrayList<>();
        if(!hayPuestosVacantes()) {
            activarFormSeleccionarPuesto(false);
            mostrarMensajeError();
        }
        else {
            jComboBoxPuesto.setModel(new DefaultComboBoxModel(listaPuestosActivos.toArray()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jLabelDescripcion = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jLabelIngrese = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelPuesto = new javax.swing.JLabel();
        jComboBoxPuesto = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setLineWrap(true);
        jTextAreaDescrip.setRows(5);
        jTextAreaDescrip.setWrapStyleWord(true);
        jTextAreaDescrip.setMaximumSize(new java.awt.Dimension(332, 60));
        jTextAreaDescrip.setMinimumSize(new java.awt.Dimension(332, 60));
        jTextAreaDescrip.setPreferredSize(new java.awt.Dimension(332, 60));
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDescripcion.setText("Descripción");
        jLabelDescripcion.setMaximumSize(new java.awt.Dimension(230, 16));
        jLabelDescripcion.setMinimumSize(new java.awt.Dimension(230, 16));
        jLabelDescripcion.setPreferredSize(new java.awt.Dimension(230, 16));

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(332, 22));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(332, 22));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(332, 22));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Modificar Puesto");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(250, 29));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(250, 29));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(250, 29));

        jLabelNombre.setText("Nombre");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(140, 16));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(140, 16));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(140, 16));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelIngrese.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIngrese.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngrese.setText("Ingrese los nuevos datos");
        jLabelIngrese.setMaximumSize(new java.awt.Dimension(250, 17));
        jLabelIngrese.setMinimumSize(new java.awt.Dimension(250, 17));
        jLabelIngrese.setPreferredSize(new java.awt.Dimension(250, 17));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelPuesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPuesto.setText("Seleccione un puesto:");
        jLabelPuesto.setMaximumSize(new java.awt.Dimension(120, 16));
        jLabelPuesto.setMinimumSize(new java.awt.Dimension(100, 120));
        jLabelPuesto.setPreferredSize(new java.awt.Dimension(120, 16));

        jComboBoxPuesto.setMaximumSize(new java.awt.Dimension(250, 22));
        jComboBoxPuesto.setMinimumSize(new java.awt.Dimension(250, 22));
        jComboBoxPuesto.setPreferredSize(new java.awt.Dimension(250, 22));
        jComboBoxPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(453, 453, 453))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(475, 475, 475)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabelIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarFormulario();
        activarFormSeleccionarPuesto(true);
        activarFormModificarPuesto(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        puest.setNombre(jTextFieldNombre.getText());
        puest.setDescripcion(jTextAreaDescrip.getText());
        if(CtrlConvocatoria.esPuestoModificable(puest)) {
            // Guarda las modificaciones en la base de datos
            new PuestoDaoJDBC().update(puest);
            // Resetea las pantallas
            limpiarFormulario();
            activarFormSeleccionarPuesto(true);
            activarFormModificarPuesto(false);
            // Reconstruye la lista de puestos con las modificaciones
            listaPuestosActivos = new ArrayList<>();
            hayPuestosVacantes();
            jComboBoxPuesto.setModel(new DefaultComboBoxModel(listaPuestosActivos.toArray()));
            JOptionPane.showMessageDialog(this, "Se han modificado los datos del puesto");
        }
        else {
            JOptionPane.showMessageDialog(this, CtrlConvocatoria.mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPuestoActionPerformed
        // TODO add your handling code here:
        int codPuest = Integer.parseInt(String.valueOf(jComboBoxPuesto.getSelectedItem()).substring(0,5));
        puest = new PuestoDaoJDBC().select(codPuest);
        // Llena el formulario con los datos del puesto seleccionado para modificar
        jTextFieldNombre.setText(puest.getNombre());
        jTextAreaDescrip.setText(puest.getDescripcion());
        // Desactiva el formulario para seleccionar puesto y activa el formulario principal
        activarFormSeleccionarPuesto(false);
        activarFormModificarPuesto(true);
    }//GEN-LAST:event_jComboBoxPuestoActionPerformed

    private boolean hayPuestosVacantes() {
        ArrayList<Puesto> listaPuestos = (ArrayList<Puesto>) new PuestoDaoJDBC().select();
        for(int i = 0; i < listaPuestos.size(); i++) {
            Puesto p = listaPuestos.get(i);
            if(p.getEstadoConvocatoria().equals("abierta")) {
                listaPuestosActivos.add(String.format("%05d",p.getCodPuesto()) + " - " + p.getNombre());
            }
        }
        return !listaPuestosActivos.isEmpty();
    }
    
    private void mostrarMensajeError() {
        JOptionPane.showMessageDialog(this, "ERROR: No hay puestos vacantes", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public final void activarFormModificarPuesto(boolean band) {
        jLabelIngrese.setEnabled(band);
        jLabelNombre.setEnabled(band);
        jTextFieldNombre.setEnabled(band);
        jLabelDescripcion.setEnabled(band);
        jTextAreaDescrip.setEnabled(band);
        jButtonGuardar.setEnabled(band);
        jButtonCancelar.setEnabled(band);
    }
    
    public final void activarFormSeleccionarPuesto(boolean band) {
        jLabelPuesto.setEnabled(band);
        jComboBoxPuesto.setEnabled(band);
    }
    
    public final void limpiarFormulario() {
        jTextFieldNombre.setText("");
        jTextAreaDescrip.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxPuesto;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelIngrese;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
