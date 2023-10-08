/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Consulta;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author EGcri
 */
public class ButtonRenderer extends JButton implements  TableCellRenderer {
    public ButtonRenderer(){
        setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int column){
        setForeground(Color.black);
        setBackground(UIManager.getColor("Button.background"));
        setText("CV");
        return this;
    }
}
