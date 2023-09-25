/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Consulta;

import Modelo.Postulante;
import Modelo.PostulanteDao;
import Modelo.PostulanteDaoJDBC;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Controlador.CtrlConsulta;
import Modelo.CvPostulante;
import Modelo.CvPostulanteDao;
import Modelo.CvPostulanteDaoJDBC;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author EGcri
 */
public class BuscarPostulante extends javax.swing.JPanel {

    Postulante post = null;
    PostulanteDao inter = new PostulanteDaoJDBC();
    CvPostulante cv = null;
    CvPostulanteDao intercv = new CvPostulanteDaoJDBC();
    /**
     * Creates new form BuscarPostDNI
     */
    public BuscarPostulante() {
        initComponents();
        
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
        jLabel2 = new javax.swing.JLabel();
        DNIjTextField = new javax.swing.JTextField();
        BuscarDNIjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BuscarApeNombrejButton = new javax.swing.JButton();
        ApellidoyNombrejTextField = new javax.swing.JTextField();
        ApellidoNombrejLabel = new javax.swing.JLabel();
        ApellidoNombreHolderjLabel = new javax.swing.JLabel();
        DNIShowjLabel = new javax.swing.JLabel();
        DNIHolderjLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DireccionjLabel = new javax.swing.JLabel();
        DirecciónHolderjLabel = new javax.swing.JLabel();
        TelefonojLabel = new javax.swing.JLabel();
        TelefonoHolderjLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmailHolderjLabel = new javax.swing.JLabel();
        CurriculumVitaejButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DireccionjLabel1 = new javax.swing.JLabel();
        DirecciónHolderjLabel1 = new javax.swing.JLabel();
        TelefonojLabel1 = new javax.swing.JLabel();
        TelefonoHolderjLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ApellidoNombrejLabel1 = new javax.swing.JLabel();
        EmailHolderjLabel1 = new javax.swing.JLabel();
        ApellidoNombreHolderjLabel1 = new javax.swing.JLabel();
        ApellidoNombreHolderjLabel1.setVisible(false);
        CurriculumVitaejButton1 = new javax.swing.JButton();
        DNIShowjLabel1 = new javax.swing.JLabel();
        DNIHolderjLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 550));
        setPreferredSize(new java.awt.Dimension(1280, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Buscar postulantes por DNI");
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI");
        jLabel2.setMaximumSize(new java.awt.Dimension(110, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(110, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 20));

        DNIjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DNIjTextFieldKeyPressed(evt);
            }
        });

        BuscarDNIjButton.setText("Buscar");
        BuscarDNIjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDNIjButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Buscar Postulante por Apellido y Nombre");

        jLabel4.setText("Apellido y Nombre");

        BuscarApeNombrejButton.setText("Buscar");
        BuscarApeNombrejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarApeNombrejButtonActionPerformed(evt);
            }
        });

        ApellidoyNombrejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApellidoyNombrejTextFieldKeyPressed(evt);
            }
        });

        ApellidoNombrejLabel.setText("Apellido y Nombre:");

        ApellidoNombreHolderjLabel.setVisible(false);
        ApellidoNombreHolderjLabel.setText("labelApellidoNombre");

        DNIShowjLabel.setText("DNI:");

        DNIHolderjLabel.setVisible(false);
        DNIHolderjLabel.setText("labelDNI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Datos Personales");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Datos de Contacto");

        DireccionjLabel.setText("Dirección:");

        DirecciónHolderjLabel.setVisible(false);
        DirecciónHolderjLabel.setText("labelDireccion");

        TelefonojLabel.setText("Telefono:");

        TelefonoHolderjLabel.setVisible(false);
        TelefonoHolderjLabel.setText("labelTelefono");

        jLabel7.setText("Email:");

        EmailHolderjLabel.setVisible(false);
        EmailHolderjLabel.setText("labelEmail");

        CurriculumVitaejButton.setText("Curriculum Vitae");
        CurriculumVitaejButton.setEnabled(false);
        CurriculumVitaejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurriculumVitaejButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Datos Personales");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Datos de Contacto");

        DireccionjLabel1.setText("Dirección:");

        DirecciónHolderjLabel1.setVisible(false);
        DirecciónHolderjLabel1.setText("labelDireccion");

        TelefonojLabel1.setText("Telefono:");

        TelefonoHolderjLabel1.setVisible(false);
        TelefonoHolderjLabel1.setText("labelTelefono");

        jLabel10.setText("Email:");

        ApellidoNombrejLabel1.setText("Apellido y Nombre:");

        EmailHolderjLabel1.setVisible(false);
        EmailHolderjLabel1.setText("labelEmail");

        ApellidoNombreHolderjLabel1.setText("labelApellidoNombre");

        CurriculumVitaejButton1.setText("Curriculum Vitae");
        CurriculumVitaejButton1.setEnabled(false);
        CurriculumVitaejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurriculumVitaejButton1ActionPerformed(evt);
            }
        });

        DNIShowjLabel1.setText("DNI:");

        DNIHolderjLabel1.setVisible(false);
        DNIHolderjLabel1.setText("labelDNI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DNIjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarDNIjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DireccionjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DirecciónHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DireccionjLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DirecciónHolderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ApellidoNombrejLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ApellidoNombreHolderjLabel1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DNIShowjLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DNIHolderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(384, 384, 384)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TelefonojLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TelefonoHolderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EmailHolderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CurriculumVitaejButton1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ApellidoNombrejLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ApellidoNombreHolderjLabel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(DNIShowjLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DNIHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(384, 384, 384)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TelefonojLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TelefonoHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(EmailHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CurriculumVitaejButton)))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(ApellidoyNombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarApeNombrejButton))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel5)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarDNIjButton))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoNombrejLabel)
                            .addComponent(ApellidoNombreHolderjLabel)
                            .addComponent(jLabel7)
                            .addComponent(EmailHolderjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DNIShowjLabel)
                            .addComponent(DNIHolderjLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CurriculumVitaejButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonojLabel)
                    .addComponent(TelefonoHolderjLabel))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionjLabel)
                    .addComponent(DirecciónHolderjLabel))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BuscarApeNombrejButton)
                    .addComponent(ApellidoyNombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoNombrejLabel1)
                            .addComponent(ApellidoNombreHolderjLabel1)
                            .addComponent(jLabel10)
                            .addComponent(EmailHolderjLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DNIShowjLabel1)
                            .addComponent(DNIHolderjLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CurriculumVitaejButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonojLabel1)
                    .addComponent(TelefonoHolderjLabel1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionjLabel1)
                    .addComponent(DirecciónHolderjLabel1))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void mostrarLabelDNI(){
        ApellidoNombreHolderjLabel.setVisible(true);
        DNIHolderjLabel.setVisible(true);
        DirecciónHolderjLabel.setVisible(true);
        EmailHolderjLabel.setVisible(true);
        TelefonoHolderjLabel.setVisible(true);
        CurriculumVitaejButton.setVisible(true);
    }
    
    private void mostrarLabelApeNom(){
        ApellidoNombreHolderjLabel1.setVisible(true);
        DNIHolderjLabel1.setVisible(true);
        DirecciónHolderjLabel1.setVisible(true);
        EmailHolderjLabel1.setVisible(true);
        TelefonoHolderjLabel1.setVisible(true);
        CurriculumVitaejButton1.setVisible(true);
    }
    
    private void BuscarDNIjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDNIjButtonActionPerformed
        int DNI = Integer.parseInt(DNIjTextField.getText());
        if (DNIjTextField.getText().length() > 0) {
            post = inter.select(DNI);
            if (post != null){
                if(post.isEstado())
                {
                   mostrarLabelDNI();
                   ApellidoNombreHolderjLabel.setText(post.getApellido()+ " " +post.getNombre());
                   DNIHolderjLabel.setText(String.valueOf(post.getDni()));
                   DirecciónHolderjLabel.setText(post.getDomicilio());
                   EmailHolderjLabel.setText(post.getEmail());
                   TelefonoHolderjLabel.setText(post.getTelefono());
                   CurriculumVitaejButton.setEnabled(true);
                   DNIjTextField.setText("");
                }
                else
                {
                    mostrarVentanaDeError(CtrlConsulta.errorPostulanteInactivo);
                }
            }
            else
            {
                mostrarVentanaDeError(CtrlConsulta.errorPostulanteInexistente);
            }
        }
        else
        {
            mostrarVentanaDeError(CtrlConsulta.errorDNIVacio);
        }
        
    }//GEN-LAST:event_BuscarDNIjButtonActionPerformed

     public static void mostrarVentanaDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void BuscarApeNombrejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarApeNombrejButtonActionPerformed
        String[] division = ApellidoyNombrejTextField.getText().split(" ", 2);
        String nombre = division[1];
        String apellido = division[0];
        if(ApellidoyNombrejTextField.getText().length() > 0 ) {
            post = inter.fetch(apellido, nombre);
            if (post != null){
                if(post.isEstado())
                {
                   mostrarLabelApeNom();
                   ApellidoNombreHolderjLabel1.setText(ApellidoyNombrejTextField.getText());
                   DNIHolderjLabel1.setText(String.valueOf(post.getDni()));
                   DirecciónHolderjLabel1.setText(post.getDomicilio());
                   EmailHolderjLabel1.setText(post.getEmail());
                   TelefonoHolderjLabel1.setText(post.getTelefono());
                   CurriculumVitaejButton1.setEnabled(true);
                   ApellidoyNombrejTextField.setText("");
                }
                else
                {
                    mostrarVentanaDeError(CtrlConsulta.errorPostulanteInactivo);
                }
            }
            else
            {
                mostrarVentanaDeError(CtrlConsulta.errorPostulanteInexistente);
            }
        
        }
        else
        {
            mostrarVentanaDeError(CtrlConsulta.errorApellidoNombreVacio);
        }
        
    }//GEN-LAST:event_BuscarApeNombrejButtonActionPerformed

    private void ApellidoyNombrejTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoyNombrejTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) BuscarApeNombrejButtonActionPerformed(null);
    }//GEN-LAST:event_ApellidoyNombrejTextFieldKeyPressed

    private void DNIjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIjTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) BuscarDNIjButtonActionPerformed(null);
    }//GEN-LAST:event_DNIjTextFieldKeyPressed

    private void CurriculumVitaejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurriculumVitaejButton1ActionPerformed
        cv = intercv.select(post.getCodPostulante());
    }//GEN-LAST:event_CurriculumVitaejButton1ActionPerformed

    private void CurriculumVitaejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurriculumVitaejButtonActionPerformed
        cv = intercv.select(post.getCodPostulante());
        try {

    InputStream cvInputStream = cv.getCv();


    File tempFile = File.createTempFile("archivo", ".pdf", new File(System.getProperty("user.dir")));


    OutputStream outputStream = new FileOutputStream(tempFile);


    byte[] buffer = new byte[1024];
    int length;
    while ((length = cvInputStream.read(buffer)) != -1) {
        outputStream.write(buffer, 0, length);
    }


    cvInputStream.close();
    outputStream.close();

    if (Desktop.isDesktopSupported()) {
        Desktop.getDesktop().open(tempFile);
    }
    tempFile.deleteOnExit();
} catch (IOException e) {
    System.out.println("Error al guardar o abrir el archivo: " + e.getMessage());
}
    }//GEN-LAST:event_CurriculumVitaejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoNombreHolderjLabel;
    private javax.swing.JLabel ApellidoNombreHolderjLabel1;
    private javax.swing.JLabel ApellidoNombrejLabel;
    private javax.swing.JLabel ApellidoNombrejLabel1;
    private javax.swing.JTextField ApellidoyNombrejTextField;
    private javax.swing.JButton BuscarApeNombrejButton;
    private javax.swing.JButton BuscarDNIjButton;
    private javax.swing.JButton CurriculumVitaejButton;
    private javax.swing.JButton CurriculumVitaejButton1;
    private javax.swing.JLabel DNIHolderjLabel;
    private javax.swing.JLabel DNIHolderjLabel1;
    private javax.swing.JLabel DNIShowjLabel;
    private javax.swing.JLabel DNIShowjLabel1;
    private javax.swing.JTextField DNIjTextField;
    private javax.swing.JLabel DireccionjLabel;
    private javax.swing.JLabel DireccionjLabel1;
    private javax.swing.JLabel DirecciónHolderjLabel;
    private javax.swing.JLabel DirecciónHolderjLabel1;
    private javax.swing.JLabel EmailHolderjLabel;
    private javax.swing.JLabel EmailHolderjLabel1;
    private javax.swing.JLabel TelefonoHolderjLabel;
    private javax.swing.JLabel TelefonoHolderjLabel1;
    private javax.swing.JLabel TelefonojLabel;
    private javax.swing.JLabel TelefonojLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
