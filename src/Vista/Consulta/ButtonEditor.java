/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Consulta;

import Modelo.CvPostulante;
import Modelo.CvPostulanteDao;
import Modelo.CvPostulanteDaoJDBC;
import Modelo.PostulanteDao;
import Modelo.PostulanteDaoJDBC;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author EGcri
 */
public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
    JButton button;
    Boolean clicked;
    int row, col;
    JTable table;
    CvPostulante cv = null;
    CvPostulanteDao intercv = new CvPostulanteDaoJDBC();
    PostulanteDao interpost = new PostulanteDaoJDBC();

    public ButtonEditor(JTable table) {
        this.table = table;
        button = new JButton("CV");
        button.setOpaque(true);        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int selectedRow = table.convertRowIndexToModel(row);
            int dni = (int) table.getModel().getValueAt(selectedRow, 0);
            abrirCV(interpost.fetch_cod(dni));
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        this.col = column;
        button.setForeground(Color.black);
        button.setBackground(UIManager.getColor("Button.background"));
        clicked = true;
        return button;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        button.setForeground(Color.black);
        button.setBackground(UIManager.getColor("Button.background"));
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        clicked = false;
        return null;
    }

    @Override
    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }

    private void abrirCV(int codPostulante) {
        // Realiza la consulta a la base de datos utilizando el codPostulante
        cv = intercv.select(codPostulante);

        if (cv != null) {
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
        }
    }

}

