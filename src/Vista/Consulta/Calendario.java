/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Consulta;

import Modelo.EntrevistaPruebaPuesto;
import Modelo.EntrevistaPruebaPuestoDaoJDBC;
import Modelo.Puesto;
import Modelo.PuestoDaoJDBC;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author MC1
 */
public class Calendario extends javax.swing.JPanel {
    private int año = LocalDate.now().getYear();
    private int mes = LocalDate.now().getMonthValue();
    private Object dias[][] = new Object[7][7];
    private String nomDias[] = {"Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"};
    private String nomMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private Object listaEventos[];
    private DefaultListModel<String> sinEventos;

    /**
     * Creates new form Calendario
     */
    public Calendario() {
        initComponents();
        sinEventos = new DefaultListModel<>();
        sinEventos.addElement("(Sin eventos)");
        cargarDias();
        formatearTabla();
        cargarListaEventos();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int f = jTable1.rowAtPoint(evt.getPoint());
                int c = jTable1.columnAtPoint(evt.getPoint());
                if (f >= 0 && c >= 0) {
                    int i = (int) jTable1.getModel().getValueAt(f, c);
                    if(listaEventos[i] != null) {
                        jList1.setModel((DefaultListModel<String>)listaEventos[i]);
                    }
                    else {
                        jList1.setModel(sinEventos);
                    }
                }
            }
        });
    }
    
    public final void cargarDias() {
        boolean b = false;
        int primerDia = (LocalDate.of(año,mes,1).getDayOfWeek().ordinal() + 1) % 7;
        int k = 1;
        int l = LocalDate.of(año,mes,1).lengthOfMonth();
        while(true) {
            for(int i = 0; i < 7; i++) {
                for(int j = 0; j < 7; j++) {
                    if(j == primerDia) b = true;
                    if(b) {
                        dias[i][j] = k;
                        k++;
                        if(k > l) return;
                    }
                }
            }
        }
    }
    
    public final void formatearTabla() {
        jTable1.setModel(new javax.swing.table.DefaultTableModel(dias,nomDias));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setFillsViewportHeight(true);
        jLabelMesAnio.setText(nomMeses[mes-1] + " " + año);
        // Centrado del texto del encabezado y resto de celdas
        ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer  cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(SwingConstants.CENTER);        
        for(int i = 0; i < 7; i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(cr);
        }
    }
    
    public final void cargarListaEventos() {
        listaEventos = new Object[32];
        ArrayList<EntrevistaPruebaPuesto> entrevistas = new EntrevistaPruebaPuestoDaoJDBC().selectEntrevistaPuesto(mes,año);
        ArrayList<EntrevistaPruebaPuesto> pruebas = new EntrevistaPruebaPuestoDaoJDBC().selectPruebaPuesto(mes,año);
        ArrayList<Puesto> puestos = new PuestoDaoJDBC().select(mes, año);
        for(int i = 0; i < entrevistas.size(); i++) {
            EntrevistaPruebaPuesto epp = entrevistas.get(i);
            if(listaEventos[epp.getDia()] == null) listaEventos[epp.getDia()] = new DefaultListModel<String>();
            ((DefaultListModel<String>)listaEventos[epp.getDia()]).addElement(String.valueOf(epp.getHora()) + " - Entrevistas para el puesto " + epp.getNombrePuesto());
        }
        for(int i = 0; i < pruebas.size(); i++) {
            EntrevistaPruebaPuesto epp = pruebas.get(i);
            if(listaEventos[epp.getDia()] == null) listaEventos[epp.getDia()] = new DefaultListModel<String>();
            ((DefaultListModel<String>)listaEventos[epp.getDia()]).addElement(String.valueOf(epp.getHora()) + " - Prueba no. " + epp.getNumPrueba() + " para el puesto " + epp.getNombrePuesto());
        }
        for(int i = 0; i < puestos.size(); i++) {
            Puesto p = puestos.get(i);
            if(listaEventos[p.getFechaCierre().getDate()] == null) listaEventos[p.getFechaCierre().getDate()] = new DefaultListModel<String>();
            ((DefaultListModel<String>)listaEventos[p.getFechaCierre().getDate()]).addElement("Cierre de convocatoria para el puesto " + p.getNombre());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAtras = new javax.swing.JButton();
        jButtonAdelante = new javax.swing.JButton();
        jLabelMesAnio = new javax.swing.JLabel();
        jLabelEvento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calendario");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 29));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 29));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 208));

        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(30);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jButtonAtras.setText("<");
        jButtonAtras.setMaximumSize(new java.awt.Dimension(60, 22));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(60, 22));
        jButtonAtras.setPreferredSize(new java.awt.Dimension(60, 22));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonAdelante.setText(">");
        jButtonAdelante.setMaximumSize(new java.awt.Dimension(60, 22));
        jButtonAdelante.setMinimumSize(new java.awt.Dimension(60, 22));
        jButtonAdelante.setPreferredSize(new java.awt.Dimension(60, 22));
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });

        jLabelMesAnio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMesAnio.setMaximumSize(new java.awt.Dimension(302, 16));
        jLabelMesAnio.setMinimumSize(new java.awt.Dimension(302, 16));
        jLabelMesAnio.setPreferredSize(new java.awt.Dimension(302, 16));

        jLabelEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEvento.setText("Eventos");
        jLabelEvento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelEvento.setMaximumSize(new java.awt.Dimension(452, 16));
        jLabelEvento.setMinimumSize(new java.awt.Dimension(452, 16));
        jLabelEvento.setPreferredSize(new java.awt.Dimension(452, 16));

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMesAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMesAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        if(mes > 1) mes--;
        else {
            mes = 12;
            año--;
        }
        dias = new Object[7][7];
        cargarDias();
        formatearTabla();
        cargarListaEventos();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        // TODO add your handling code here:
        if(mes < 12) mes++;
        else {
            mes = 1;
            año++;
        }
        dias = new Object[7][7];
        cargarDias();
        formatearTabla();
        cargarListaEventos();
    }//GEN-LAST:event_jButtonAdelanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JLabel jLabelMesAnio;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}