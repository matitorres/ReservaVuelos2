package vistas;

import clases.Cliente;
import clasesData.ClienteData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus pc
 */
public class RegistroCliente extends javax.swing.JFrame {

    private static RegistroCliente ventana = new RegistroCliente();
    private ClienteData cD = new ClienteData();
    
    
    public RegistroCliente() {
        initComponents();
        setLocationRelativeTo(null);
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldPasaporte = new javax.swing.JTextField();
        jTextFieldTarjeta = new javax.swing.JTextField();
        jTextFieldConfirContra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();

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
        jPanelFondo.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 98, 31));

        jLabelRegistro.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setText("Registro de usuario");
        jLabelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelFondo.add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 31));

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

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 107, 220, 30));

        jTextFieldDni.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 170, 220, 30));

        jTextFieldMail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 233, 220, 30));

        jTextFieldContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 296, 220, 30));

        jTextFieldApellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 107, 220, 30));

        jTextFieldPasaporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPasaporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 170, 220, 30));

        jTextFieldTarjeta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTarjeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 233, 220, 30));

        jTextFieldConfirContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldConfirContra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelFondo.add(jTextFieldConfirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 296, 220, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("N° de DNI");
        jPanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 148, 220, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre");
        jPanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 85, 220, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Correo electrónico");
        jPanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 211, 220, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Contraseña");
        jPanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 274, 220, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Apellido");
        jPanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 85, 220, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("N° de pasaporte");
        jPanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 148, 220, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("N° de tarjeta");
        jPanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 211, 220, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Confirmar contraseña");
        jPanelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 274, 220, 20));

        jButtonRegistrar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 345, 146, 31));

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
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        ventana.setVisible(false);
        VistaPrincipal.visibilidad(true);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        if (!camposVacios()) {
            if (!cD.existe(Integer.parseInt(jTextFieldDni.getText()), jTextFieldMail.getText())) {
                if (jTextFieldContraseña.getText().equals(jTextFieldConfirContra.getText())) {
                    if (0 == JOptionPane.showConfirmDialog(this, "¿Esta seguro de hacer este registro?")) {
                        Cliente nuevoCliente = new Cliente(0, jTextFieldNombre.getText(), jTextFieldApellido.getText(), Integer.parseInt(jTextFieldDni.getText()), jTextFieldMail.getText(), Integer.parseInt(jTextFieldPasaporte.getText()), Integer.parseInt(jTextFieldTarjeta.getText()), jTextFieldContraseña.getText());
                        try {
                            cD.altaCliente(nuevoCliente);
                            JOptionPane.showMessageDialog(null, "Registro exitoso!");
                            ventana.setVisible(false);
                            LoginCliente.visibilidad(true);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error al registrar");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo electrónico o el dni ya existen. Si el problema persiste comuniquese con nuestros representantes");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error. Debe llenar todos los campos");
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private boolean camposVacios() {
        boolean hayVacias = false;
        if (jTextFieldNombre.getText().equals("") || jTextFieldApellido.getText().equals("")
            || jTextFieldDni.getText().equals("") || jTextFieldPasaporte.getText().equals("")
            || jTextFieldMail.getText().equals("") || jTextFieldTarjeta.getText().equals("")
            || jTextFieldContraseña.getText().equals("") || jTextFieldConfirContra.getText().equals("")) {
            hayVacias = true;
        }
        return hayVacias;
    }
    
    private void limpiarCampos() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDni.setText("");
        jTextFieldMail.setText("");
        jTextFieldPasaporte.setText("");
        jTextFieldTarjeta.setText("");
        jTextFieldContraseña.setText("");
    }
    
    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldConfirContra;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPasaporte;
    private javax.swing.JTextField jTextFieldTarjeta;
    // End of variables declaration//GEN-END:variables
}
