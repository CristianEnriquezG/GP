package Vista.Consulta;

import Modelo.EntrevistaPruebaPuesto;
import Modelo.EntrevistaPruebaPuestoDaoJDBC;
import Modelo.Puesto;
import Modelo.PuestoDaoJDBC;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Calendario extends javax.swing.JPanel {
    private Object listaEventos[];
    private DefaultListModel<String> sinEventos;
    private SimpleDateFormat sdf;
    private LocalDate fecha;

    public Calendario() {
        initComponents();
        sinEventos = new DefaultListModel<>();
        sinEventos.addElement("(Sin eventos)");
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        jCalendar1.addPropertyChangeListener(new PropertyChangeListener() {
            int mes, año = 0;
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                fecha = LocalDate.parse(sdf.format(jCalendar1.getDate()));
                int mesCal = fecha.getMonthValue();
                int añoCal = fecha.getYear();
                if(mesCal != mes || añoCal != año) {
                    mes = mesCal;
                    año = añoCal;
                    cargarListaEventos(mes, año);
                }
                int i = fecha.getDayOfMonth();
                if(listaEventos[i] != null) {
                    jListEventos.setModel((DefaultListModel<String>)listaEventos[i]);
                }
                else {
                    jListEventos.setModel(sinEventos);
                }
            }
        });
    }
    
    public final void cargarListaEventos(int mes, int año) {
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
            if(p.getFechaCierre() == null) {
                if(listaEventos[p.getFechaInicio().getDate()] == null) listaEventos[p.getFechaInicio().getDate()] = new DefaultListModel<String>();
                ((DefaultListModel<String>)listaEventos[p.getFechaInicio().getDate()]).addElement("Apertura de convocatoria para el puesto " + p.getNombre());
            }
            else {
                if(listaEventos[p.getFechaCierre().getDate()] == null) listaEventos[p.getFechaCierre().getDate()] = new DefaultListModel<String>();
                ((DefaultListModel<String>)listaEventos[p.getFechaCierre().getDate()]).addElement("Cierre de convocatoria para el puesto " + p.getNombre());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCalendario = new javax.swing.JLabel();
        jLabelEventos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEventos = new javax.swing.JList<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 55));

        jLabelCalendario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCalendario.setText("Calendario");
        jLabelCalendario.setMaximumSize(new java.awt.Dimension(300, 29));
        jLabelCalendario.setMinimumSize(new java.awt.Dimension(300, 29));
        jLabelCalendario.setPreferredSize(new java.awt.Dimension(300, 29));

        jLabelEventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEventos.setText("Eventos");
        jLabelEventos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelEventos.setMaximumSize(new java.awt.Dimension(452, 16));
        jLabelEventos.setMinimumSize(new java.awt.Dimension(452, 16));
        jLabelEventos.setPreferredSize(new java.awt.Dimension(452, 16));

        jListEventos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane2.setViewportView(jListEventos);

        jCalendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(397, 397, 397))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(196, 511, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(478, 478, 478))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabelCalendario;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JList<String> jListEventos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}