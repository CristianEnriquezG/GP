/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Postulantes;

import Controlador.CtrlPostulante;
import Modelo.CvPostulante;
import Modelo.CvPostulanteDaoJDBC;
import Modelo.Postulante;
import Modelo.PostulanteDaoJDBC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author EGcri
 */
public class ModificarDatos extends javax.swing.JPanel {
    private Postulante post;
    private File archivoPDF = null;

    public ModificarDatos() {
        initComponents();
        jFileChooserPDF.addChoosableFileFilter(new FileNameExtensionFilter("Documentos PDF","pdf"));
        jFileChooserPDF.setAcceptAllFileFilterUsed(false);
        activarFormModificarPostulante(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserPDF = new javax.swing.JFileChooser();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelDomicilio = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSeleccionarPDF = new javax.swing.JButton();
        jLabelRutaPdf = new javax.swing.JLabel();
        jLabelCv = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jLabelApellido.setText("Apellido/s:");
        jLabelApellido.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelApellido.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelApellido.setPreferredSize(new java.awt.Dimension(100, 16));

        jTextFieldDNI.setMaximumSize(new java.awt.Dimension(125, 22));
        jTextFieldDNI.setMinimumSize(new java.awt.Dimension(125, 22));
        jTextFieldDNI.setPreferredSize(new java.awt.Dimension(125, 22));

        jLabelNombre.setText("Nombre/s:");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(100, 16));

        jTextFieldApellido.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldApellido.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldApellido.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabelDomicilio.setText("Domicilio:");
        jLabelDomicilio.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelDomicilio.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelDomicilio.setPreferredSize(new java.awt.Dimension(100, 16));

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabelTelefono.setText("Teléfono:");
        jLabelTelefono.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelTelefono.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelTelefono.setPreferredSize(new java.awt.Dimension(100, 16));

        jTextFieldDomicilio.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldDomicilio.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldDomicilio.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabelEmail.setText("E-mail:");
        jLabelEmail.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelEmail.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelEmail.setPreferredSize(new java.awt.Dimension(100, 16));

        jTextFieldTelefono.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldTelefono.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldTelefono.setPreferredSize(new java.awt.Dimension(200, 22));

        jTextFieldEmail.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Datos de Postulante");
        jLabel1.setMaximumSize(new java.awt.Dimension(350, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(350, 29));
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese los datos a modificar");
        jLabel2.setMaximumSize(new java.awt.Dimension(350, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(350, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 17));

        jLabelDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDni.setText("Ingrese DNI:");
        jLabelDni.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelDni.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelDni.setPreferredSize(new java.awt.Dimension(100, 16));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setMaximumSize(new java.awt.Dimension(125, 22));
        jButtonBuscar.setMinimumSize(new java.awt.Dimension(125, 22));
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(125, 22));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar Datos");
        jButtonGuardar.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSeleccionarPDF.setText("Seleccionar Archivo PDF...");
        jButtonSeleccionarPDF.setActionCommand("Seleccionar Archivo PDF...");
        jButtonSeleccionarPDF.setMaximumSize(new java.awt.Dimension(200, 22));
        jButtonSeleccionarPDF.setMinimumSize(new java.awt.Dimension(200, 22));
        jButtonSeleccionarPDF.setPreferredSize(new java.awt.Dimension(200, 22));
        jButtonSeleccionarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarPDFActionPerformed(evt);
            }
        });

        jLabelRutaPdf.setMaximumSize(new java.awt.Dimension(200, 16));
        jLabelRutaPdf.setMinimumSize(new java.awt.Dimension(200, 16));
        jLabelRutaPdf.setPreferredSize(new java.awt.Dimension(200, 16));

        jLabelCv.setText("Currículum Vitae");
        jLabelCv.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelCv.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelCv.setPreferredSize(new java.awt.Dimension(100, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(454, 454, 454))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSeleccionarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRutaPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRutaPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        post.setApellido(jTextFieldApellido.getText());
        post.setNombre(jTextFieldNombre.getText());
        post.setDomicilio(jTextFieldDomicilio.getText());
        post.setTelefono(jTextFieldTelefono.getText());
        post.setEmail(jTextFieldEmail.getText());
        if(CtrlPostulante.esPostulanteValido(post)) {
            new PostulanteDaoJDBC().update(post);
            
            // Si he especificado nuevo currículum, lo actualizo
            if(!jLabelRutaPdf.getText().equals("")) {
                CvPostulante cvPost = new CvPostulante();
                try {
                    cvPost.setCv(new FileInputStream(archivoPDF));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ModificarDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
                cvPost.setCodPostulante(post.getCodPostulante());
                new CvPostulanteDaoJDBC().update(cvPost);
            }
            
            JOptionPane.showMessageDialog(this, "Se han modificado los datos del postulante");
            limpiarFormulario();
            activarFormModificarPostulante(false);
            activarFormBuscarPostulante(true);
        }
        else {
            JOptionPane.showMessageDialog(this, CtrlPostulante.mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarFormulario();
        activarFormModificarPostulante(false);
        activarFormBuscarPostulante(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int dniPost = 0;
        try {
            dniPost = Integer.parseInt(jTextFieldDNI.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"ERROR: Número de DNI no válido");
            return;
        }
        post = new PostulanteDaoJDBC().select(dniPost);
        if(post != null) {
            if(CtrlPostulante.esPostulanteActivo(post)) {
                jTextFieldApellido.setText(post.getApellido());
                jTextFieldNombre.setText(post.getNombre());
                jTextFieldDomicilio.setText(post.getDomicilio());
                jTextFieldTelefono.setText(String.valueOf(post.getTelefono()));
                jTextFieldEmail.setText(post.getEmail());
                activarFormModificarPostulante(true);
                activarFormBuscarPostulante(false);
            }
            else {
                JOptionPane.showMessageDialog(this,CtrlPostulante.mensajeError);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"ERROR: Postulante inexistente");
        }
    }
    
    public final void activarFormModificarPostulante(boolean band) {
        jLabel2.setEnabled(band);
        jLabelApellido.setEnabled(band);
        jTextFieldApellido.setEnabled(band);
        jLabelNombre.setEnabled(band);
        jTextFieldNombre.setEnabled(band);
        jLabelDomicilio.setEnabled(band);
        jTextFieldDomicilio.setEnabled(band);
        jLabelTelefono.setEnabled(band);
        jTextFieldTelefono.setEnabled(band);
        jLabelEmail.setEnabled(band);
        jTextFieldEmail.setEnabled(band);
        jButtonGuardar.setEnabled(band);
        jButtonCancelar.setEnabled(band);
        jLabelCv.setEnabled(band);
        jButtonSeleccionarPDF.setEnabled(band);
        jLabelRutaPdf.setEnabled(band);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSeleccionarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarPDFActionPerformed
        int valorRet = jFileChooserPDF.showDialog(this, "Seleccionar");
        if(valorRet == JFileChooser.APPROVE_OPTION) {
            archivoPDF = jFileChooserPDF.getSelectedFile();
            jLabelRutaPdf.setText(archivoPDF.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonSeleccionarPDFActionPerformed

    public void activarFormBuscarPostulante(boolean band) {
        jLabelDni.setEnabled(band);
        jTextFieldDNI.setEnabled(band);
        jButtonBuscar.setEnabled(band);
    }
    
    public void limpiarFormulario() {
        jTextFieldDNI.setText("");
        jTextFieldApellido.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDomicilio.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
        jLabelRutaPdf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSeleccionarPDF;
    private javax.swing.JFileChooser jFileChooserPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCv;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRutaPdf;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}