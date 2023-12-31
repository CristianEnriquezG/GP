/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.GestionUsuarios;

import Controlador.CtrlContraseñaaHash;
import Controlador.CtrlUsuarios;
import Modelo.Usuario;
import Modelo.UsuarioDao;
import Modelo.UsuarioDaoJDBC;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author EGcri
 */
public class ModificarUsuario extends javax.swing.JPanel {
    
    Usuario user = null;
    UsuarioDao inter = new UsuarioDaoJDBC();
    /**
     * Creates new form modificarUsuario
     */
    public ModificarUsuario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        NombreUsuariojTextField = new javax.swing.JTextField();
        BuscarjButton = new javax.swing.JButton();
        DatosUsuariojLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CambiarContraseñajLabel = new javax.swing.JLabel();
        ContraseñaActualjLabel = new javax.swing.JLabel();
        ContraseñaActualjPasswordField = new javax.swing.JPasswordField();
        ContraseñaNuevajLabel = new javax.swing.JLabel();
        ConfirmarContraseñajLabel = new javax.swing.JLabel();
        ContraseñaNuevajPasswordField = new javax.swing.JPasswordField();
        ConfirmarContraseñajPasswordField = new javax.swing.JPasswordField();
        GuardarjButton = new javax.swing.JButton();
        PermisosjLabel = new javax.swing.JLabel();
        AdministradorjRadioButton = new javax.swing.JRadioButton();
        OperadorjRadioButton = new javax.swing.JRadioButton();
        PostulantejRadioButton = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(1280, 550));
        setMinimumSize(new java.awt.Dimension(1280, 550));

        jLabel1.setText("Nombre de usuario");

        NombreUsuariojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreUsuariojTextFieldKeyPressed(evt);
            }
        });

        BuscarjButton.setText("Buscar");
        BuscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButtonActionPerformed(evt);
            }
        });

        DatosUsuariojLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        DatosUsuariojLabel.setText("Datos del usuario");
        DatosUsuariojLabel.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Buscar Usuario");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Modificar Usuario");

        CambiarContraseñajLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CambiarContraseñajLabel.setText("Cambiar Contraseña");
        CambiarContraseñajLabel.setEnabled(false);

        ContraseñaActualjLabel.setText("Contraseña Actual");
        ContraseñaActualjLabel.setEnabled(false);

        ContraseñaActualjPasswordField.setEnabled(false);
        ContraseñaActualjPasswordField.setMaximumSize(new java.awt.Dimension(100, 20));
        ContraseñaActualjPasswordField.setMinimumSize(new java.awt.Dimension(100, 20));
        ContraseñaActualjPasswordField.setPreferredSize(new java.awt.Dimension(100, 20));

        ContraseñaNuevajLabel.setText("Contraseña Nueva");
        ContraseñaNuevajLabel.setEnabled(false);

        ConfirmarContraseñajLabel.setText("Confirmar contraseña");
        ConfirmarContraseñajLabel.setEnabled(false);

        ContraseñaNuevajPasswordField.setEnabled(false);
        ContraseñaNuevajPasswordField.setMaximumSize(new java.awt.Dimension(100, 20));
        ContraseñaNuevajPasswordField.setMinimumSize(new java.awt.Dimension(100, 20));
        ContraseñaNuevajPasswordField.setName(""); // NOI18N
        ContraseñaNuevajPasswordField.setPreferredSize(new java.awt.Dimension(100, 20));

        ConfirmarContraseñajPasswordField.setEnabled(false);
        ConfirmarContraseñajPasswordField.setMaximumSize(new java.awt.Dimension(100, 20));
        ConfirmarContraseñajPasswordField.setMinimumSize(new java.awt.Dimension(100, 20));
        ConfirmarContraseñajPasswordField.setPreferredSize(new java.awt.Dimension(100, 20));

        GuardarjButton.setText("Guardar");
        GuardarjButton.setEnabled(false);
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        PermisosjLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PermisosjLabel.setText("Permisos");
        PermisosjLabel.setEnabled(false);

        buttonGroup1.add(AdministradorjRadioButton);
        AdministradorjRadioButton.setText("Administrador");
        AdministradorjRadioButton.setEnabled(false);

        buttonGroup1.add(OperadorjRadioButton);
        OperadorjRadioButton.setText("Operador");
        OperadorjRadioButton.setEnabled(false);

        buttonGroup1.add(PostulantejRadioButton);
        PostulantejRadioButton.setText("Postulante");
        PostulantejRadioButton.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatosUsuariojLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(NombreUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BuscarjButton))
                    .addComponent(CambiarContraseñajLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConfirmarContraseñajLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfirmarContraseñajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaActualjLabel)
                            .addComponent(ContraseñaNuevajLabel))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContraseñaActualjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContraseñaNuevajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(GuardarjButton))
                    .addComponent(PermisosjLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdministradorjRadioButton)
                        .addGap(92, 92, 92)
                        .addComponent(OperadorjRadioButton)
                        .addGap(87, 87, 87)
                        .addComponent(PostulantejRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel4)))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatosUsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PermisosjLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdministradorjRadioButton)
                    .addComponent(OperadorjRadioButton)
                    .addComponent(PostulantejRadioButton))
                .addGap(18, 18, 18)
                .addComponent(CambiarContraseñajLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaActualjLabel)
                    .addComponent(ContraseñaActualjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaNuevajLabel)
                    .addComponent(ContraseñaNuevajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarContraseñajLabel)
                    .addComponent(ConfirmarContraseñajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(GuardarjButton)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        if(
           ContraseñaActualjPasswordField.getPassword().length != 0 && 
           ContraseñaActualjPasswordField.getPassword().length != 0 &&
           ConfirmarContraseñajPasswordField.getPassword().length != 0
           )
        {
        
        char[]  contraseñaActual = ContraseñaActualjPasswordField.getPassword();
        char[]  contraseñaNueva = ContraseñaNuevajPasswordField.getPassword();
        char[]  confirmarContraseña = ConfirmarContraseñajPasswordField.getPassword(); 
        String HashContraseñaActual = CtrlContraseñaaHash.hasher(new String(contraseñaActual));
        String HashContraseñaNueva = CtrlContraseñaaHash.hasher(new String(contraseñaNueva));
        String HashConfirmarContraseña = CtrlContraseñaaHash.hasher(new String(confirmarContraseña)); 
        
        if(inter.match(user))
            {
            if(HashContraseñaNueva.equals(HashConfirmarContraseña))
            {
                user.setContraseñaUsuario(HashConfirmarContraseña);
                user.setPermisosUsuario(leerbullets());
                if(inter.update(user) == 1)
                    JOptionPane.showMessageDialog(this, "Usuario Actualizado", TOOL_TIP_TEXT_KEY, HEIGHT);
            }                                 
            else
                JOptionPane.showMessageDialog(this, CtrlUsuarios.errorContraseñaIncorrecta, TOOL_TIP_TEXT_KEY, HEIGHT);   
            }
        else
            JOptionPane.showMessageDialog(this, CtrlUsuarios.errorContraseñaIncorrecta, TOOL_TIP_TEXT_KEY, HEIGHT);   
        }
        else
         JOptionPane.showMessageDialog(this, CtrlUsuarios.errorContraseñaVacia, TOOL_TIP_TEXT_KEY, HEIGHT);   
        
    }//GEN-LAST:event_GuardarjButtonActionPerformed
      
    private int leerbullets(){
        int resultado = 0;
        if(AdministradorjRadioButton.isEnabled())
            resultado = 1;
        else if(OperadorjRadioButton.isEnabled())
            resultado = 2;
        else if(PostulantejRadioButton.isEnabled())
            resultado = 3;        
        return resultado;
    }
    private void marcarBullet(int permiso){
        switch(permiso){
            case 0:
                AdministradorjRadioButton.setEnabled(true);
                break;
            case 1:
                OperadorjRadioButton.setEnabled(true);
                break;
            case 2:
                PostulantejRadioButton.setEnabled(true);
                break;
        }
    }
    
    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        String nombreUsuario = NombreUsuariojTextField.getText();
        if(nombreUsuario.length() == 0 || " ".equals(nombreUsuario) ) JOptionPane.showMessageDialog(this, CtrlUsuarios.errorUsuarioVacio, TOOL_TIP_TEXT_KEY, HEIGHT);
        else
        {           
            user = inter.search(nombreUsuario);
            if(user == null){
                JOptionPane.showMessageDialog(this, CtrlUsuarios.errorUsuarioInexistente, TOOL_TIP_TEXT_KEY, HEIGHT);                    
            }
            else
            if (!user.isActivo()){
                JOptionPane.showMessageDialog(this, CtrlUsuarios.errorUsuarioDadoDeBaja, TOOL_TIP_TEXT_KEY, HEIGHT);                    
            }
            else{
                 habilitarFormulario();
                 marcarBullet(user.getPermisosUsuario());                 
            }
        }
    }//GEN-LAST:event_BuscarjButtonActionPerformed

    private void NombreUsuariojTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreUsuariojTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) BuscarjButtonActionPerformed(null);
    }//GEN-LAST:event_NombreUsuariojTextFieldKeyPressed
    
     private void habilitarFormulario(){
        CambiarContraseñajLabel.setEnabled(true);
        ConfirmarContraseñajLabel.setEnabled(true);
        ContraseñaActualjLabel.setEnabled(true);
        ContraseñaNuevajLabel.setEnabled(true);
        AdministradorjRadioButton.setEnabled(true);
        OperadorjRadioButton.setEnabled(true);
        PostulantejRadioButton.setEnabled(true);
        ContraseñaActualjPasswordField.setEnabled(true);
        ContraseñaNuevajPasswordField.setEnabled(true);
        ConfirmarContraseñajPasswordField.setEnabled(true);
        PermisosjLabel.setEnabled(true);
        DatosUsuariojLabel.setEnabled(true);
        GuardarjButton.setEnabled(true);                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdministradorjRadioButton;
    private javax.swing.JButton BuscarjButton;
    private javax.swing.JLabel CambiarContraseñajLabel;
    private javax.swing.JLabel ConfirmarContraseñajLabel;
    private javax.swing.JPasswordField ConfirmarContraseñajPasswordField;
    private javax.swing.JLabel ContraseñaActualjLabel;
    private javax.swing.JPasswordField ContraseñaActualjPasswordField;
    private javax.swing.JLabel ContraseñaNuevajLabel;
    private javax.swing.JPasswordField ContraseñaNuevajPasswordField;
    private javax.swing.JLabel DatosUsuariojLabel;
    private javax.swing.JButton GuardarjButton;
    private javax.swing.JTextField NombreUsuariojTextField;
    private javax.swing.JRadioButton OperadorjRadioButton;
    private javax.swing.JLabel PermisosjLabel;
    private javax.swing.JRadioButton PostulantejRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
