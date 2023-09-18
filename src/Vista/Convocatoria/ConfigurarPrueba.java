/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Convocatoria;

import Controlador.CtrlCrearConvocatoria;
import Modelo.FormatoEntrevista;
import Modelo.FormatoEntrevistaDaoJDBC;
import Modelo.FormatoPrueba;
import Modelo.FormatoPruebaDaoJDBC;
import Modelo.Puesto;
import Modelo.PuestoDaoJDBC;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MC1
 */
public class ConfigurarPrueba extends javax.swing.JPanel {
    private Crear pantCrear;
    private ArrayList<Object> objeto;
    private int numeroPrueba;

    /**
     * Creates new form ConfigurarPrueba
     * @param c
     * @param numPrueba
     * @param etiqBoton
     * @param obj
     */
    public ConfigurarPrueba(Crear c, int numPrueba, String etiqBoton, ArrayList<Object> obj) {
        initComponents();
        pantCrear = c;
        numeroPrueba = numPrueba;
        objeto = obj;
        jLabel1.setText("Configurar Prueba " + numeroPrueba);
        jButtonSigFin.setText(etiqBoton);
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
        jButtonSigFin = new javax.swing.JButton();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jLabelRutaPdf1 = new javax.swing.JLabel();
        jLabelRutaPdf2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configurar Prueba []");
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 29));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 29));

        jButtonSigFin.setText("[Siguiente | Finalizar]");
        jButtonSigFin.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonSigFin.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonSigFin.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonSigFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigFinActionPerformed(evt);
            }
        });

        jTextFieldFecha.setMaximumSize(new java.awt.Dimension(100, 22));
        jTextFieldFecha.setMinimumSize(new java.awt.Dimension(100, 22));
        jTextFieldFecha.setPreferredSize(new java.awt.Dimension(100, 22));

        jTextFieldHora.setMaximumSize(new java.awt.Dimension(100, 22));
        jTextFieldHora.setMinimumSize(new java.awt.Dimension(100, 22));
        jTextFieldHora.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabelRutaPdf1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRutaPdf1.setText("Hora");
        jLabelRutaPdf1.setMaximumSize(new java.awt.Dimension(40, 16));
        jLabelRutaPdf1.setMinimumSize(new java.awt.Dimension(40, 16));
        jLabelRutaPdf1.setPreferredSize(new java.awt.Dimension(40, 16));

        jLabelRutaPdf2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRutaPdf2.setText("Fecha");
        jLabelRutaPdf2.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabelRutaPdf2.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabelRutaPdf2.setPreferredSize(new java.awt.Dimension(50, 16));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setLineWrap(true);
        jTextAreaDescrip.setRows(5);
        jTextAreaDescrip.setWrapStyleWord(true);
        jTextAreaDescrip.setMaximumSize(new java.awt.Dimension(230, 85));
        jTextAreaDescrip.setMinimumSize(new java.awt.Dimension(230, 85));
        jTextAreaDescrip.setPreferredSize(new java.awt.Dimension(230, 85));
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Descripción");
        jLabel3.setMaximumSize(new java.awt.Dimension(250, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 16));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(140, 22));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(528, 528, 528)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(451, 451, 451))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelRutaPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRutaPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(461, 461, 461))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSigFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(471, 471, 471))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRutaPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRutaPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSigFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSigFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigFinActionPerformed
        FormatoPrueba formatoPru = new FormatoPrueba();
        formatoPru.setDescripcion(jTextAreaDescrip.getText());
        formatoPru.setNumPrueba(numeroPrueba);
        String fec = jTextFieldFecha.getText();
        String hor = jTextFieldHora.getText();
        if(CtrlCrearConvocatoria.esValido(formatoPru, fec, hor)) {
            // almacena objeto válido en array list
            objeto.add(formatoPru);
            if(jButtonSigFin.getText().equals("Siguiente")) {
                pantCrear.avanzarPantalla();
            }
            else {
                int codPuesto = 0;
                // Inserta puesto nuevo en la BD
                Object ob = objeto.get(0);
                codPuesto = new PuestoDaoJDBC().insert((Puesto) ob);
                // Inserta entrevistas o pruebas según sea el caso
                for(int i = 1; i < objeto.size(); i++) {
                    ob = objeto.get(i);
                    if(ob instanceof FormatoEntrevista) {
                        ((FormatoEntrevista) ob).setCodPuesto(codPuesto);
                        new FormatoEntrevistaDaoJDBC().insert((FormatoEntrevista) ob);
                    }
                    else {
                        ((FormatoPrueba) ob).setCodPuesto(codPuesto);
                        new FormatoPruebaDaoJDBC().insert((FormatoPrueba) ob);
                    }  
                }
                JOptionPane.showMessageDialog(this, "Puesto creado");
                pantCrear.resetearPantallas();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, CtrlCrearConvocatoria.mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSigFinActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        pantCrear.resetearPantallas();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSigFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelRutaPdf1;
    private javax.swing.JLabel jLabelRutaPdf2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}