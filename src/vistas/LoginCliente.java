package vistas;

import clases.Cliente;
import clasesData.ClienteData;
import javax.swing.JOptionPane;

/**
 *
 * @author asus pc
 */
public class LoginCliente extends javax.swing.JFrame {

    private static LoginCliente ventana = new LoginCliente();
    private ClienteData cD = new ClienteData();
    public static Cliente cliente = null;
    
    public LoginCliente() {
        initComponents();
        setLocationRelativeTo(null);
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonRegistro = new javax.swing.JButton();
        jButtonIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelFondo.setBackground(new java.awt.Color(153, 204, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInicio.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 153, 51));
        jLabelInicio.setText("Inicio //");
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
        });
        jPanelFondo.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 98, 30));

        jLabelAdministrador.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministrador.setText("Inicio de sesión");
        jLabelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelFondo.add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 30));

        jLabelCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(102, 153, 51));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanelFondo.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 15, 15));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 153, 51));
        jLabelUsuario.setText("Correo electrónico");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 80, -1, -1));

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 108, 321, 31));

        jLabelContraseña.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(102, 153, 51));
        jLabelContraseña.setText("Contraseña");
        jPanelFondo.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 145, -1, -1));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 172, 321, 31));

        jButtonRegistro.setBackground(new java.awt.Color(102, 153, 51));
        jButtonRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistro.setText("Registrarse");
        jButtonRegistro.setBorder(null);
        jButtonRegistro.setBorderPainted(false);
        jButtonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 220, 146, 31));

        jButtonIniciarSesion.setBackground(new java.awt.Color(102, 153, 51));
        jButtonIniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.setBorderPainted(false);
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 220, 146, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        ventana.setVisible(false);
        VistaPrincipal.visibilidad(true);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        ventana.setVisible(false);
        RegistroCliente.visibilidad(true);
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        String mail = jTextFieldUsuario.getText();
        if (!camposVacios()) {
            if (cD.existe(-1, mail)) {
                char pass[] = jPasswordFieldContraseña.getPassword();
                String contraseña = new String(pass);
                Cliente cliente = cD.getCliente(mail);
                if (contraseña.equals(cliente.getContraseña())) {
                    this.cliente = cliente;
                    JOptionPane.showMessageDialog(null, "Joya");
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta. Pongase en contacto con nuestros representantes.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ingresado no existe. Haga clic en Registrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error. Debe llenar todos los campos.");
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private boolean camposVacios() {
        boolean hayVacias = false;
        if (jTextFieldUsuario.getText().equals("") || jPasswordFieldContraseña.getPassword().equals("")) {
            hayVacias = true;
        }
        return hayVacias;
    }
    
    private void limpiarCampos() {
        jTextFieldUsuario.setText("");
        jPasswordFieldContraseña.setText("");
    }
    
    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
