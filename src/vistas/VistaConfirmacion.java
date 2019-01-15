/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Asiento;
import clases.Cliente;
import clases.Compra;
import clasesData.AsientoData;
import clasesData.CompraData;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author asus pc
 */
public class VistaConfirmacion extends javax.swing.JFrame {

    private static VistaConfirmacion ventana = new VistaConfirmacion();
    private CompraData cD = new CompraData();
    private AsientoData aD = new AsientoData();

    public VistaConfirmacion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelPago = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanelTarjeta = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelMetodo = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCuotas = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jPanelEfectivo = new javax.swing.JPanel();
        jLabelNombreE = new javax.swing.JLabel();
        jLabelPrecioE = new javax.swing.JLabel();
        jLabelMetodoE = new javax.swing.JLabel();

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

        jLabelPago.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPago.setText("Confirmar operación");
        jLabelPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelFondo.add(jLabelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 31));

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

        jPanelTarjeta.setBackground(new java.awt.Color(102, 153, 51));
        jPanelTarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTarjeta.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 5, 350, 25));

        jLabelPrecio.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTarjeta.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 350, 25));

        jLabelMetodo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMetodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTarjeta.add(jLabelMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 55, 350, 25));

        jLabelNumero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTarjeta.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 80, 350, 25));

        jLabelCuotas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelCuotas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTarjeta.add(jLabelCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 105, 350, 25));

        jPanelFondo.add(jPanelTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 86, 419, 135));

        jLabelTexto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelTexto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTexto.setText("¿Está seguro de realizar esta operación?");
        jPanelFondo.add(jLabelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 234, 400, 25));

        jButtonSiguiente.setBackground(new java.awt.Color(102, 153, 51));
        jButtonSiguiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setText("Confirmar");
        jButtonSiguiente.setToolTipText("");
        jButtonSiguiente.setBorder(null);
        jButtonSiguiente.setBorderPainted(false);
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 265, 150, 30));

        jPanelEfectivo.setBackground(new java.awt.Color(102, 153, 51));
        jPanelEfectivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreE.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelNombreE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelEfectivo.add(jLabelNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 350, 25));

        jLabelPrecioE.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelPrecioE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelEfectivo.add(jLabelPrecioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 55, 350, 25));

        jLabelMetodoE.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelMetodoE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMetodoE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelEfectivo.add(jLabelMetodoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 80, 350, 25));

        jPanelFondo.add(jPanelEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 86, 419, 135));

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
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        Asiento asiento = VistaPrincipal.asiento;
        Cliente cliente = LoginCliente.cliente;
        Compra compra = new Compra(asiento, cliente);
        switch (VistaPago.metodo) {
            case "Tarjeta":
                try {
                    cD.guardarCompra(compra);
                    asiento.setDisponible(false);
                    aD.actualizarAsiento(asiento);
                    enviarCorreo("vuelos032@gmail.com", "vuelos123456", cliente.getMail(), "Gracias por su compra", "Estimado cliente. Su compra se ha realizado con éxito. Saludos. Equipo de Vuelos32");
                    JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito");
                    ventana.setVisible(false);
                    VistaPrincipal.visibilidad(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al agregar nueva compra a la base de datos");
                }
                break;
            case "Rapipago":
                try {
                    cD.guardarCompra(compra);
                    asiento.setDisponible(false);
                    aD.actualizarAsiento(asiento);
                    enviarCorreo("vuelos032@gmail.com", "vuelos123456", cliente.getMail(), "Cupón de pago", "Estimado cliente. Su compra se ha realizado con éxito. Saludos. Equipo de Vuelos32");
                    JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito. Enviamos un cupón de pago a su mail.");
                    ventana.setVisible(false);
                    VistaPrincipal.visibilidad(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al agregar nueva compra a la base de datos");
                }
                break;
            case "PagoFácil":
                try {
                    cD.guardarCompra(compra);
                    asiento.setDisponible(false);
                    aD.actualizarAsiento(asiento);
                    enviarCorreo("vuelos032@gmail.com", "vuelos123456", cliente.getMail(), "Cupón de pago", "Estimado cliente. Su compra se ha realizado con éxito. Saludos. Equipo de Vuelos32");
                    JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito. Enviamos un cupón de pago a su mail.");
                    ventana.setVisible(false);
                    VistaPrincipal.visibilidad(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al agregar nueva compra a la base de datos");
                }
                break;
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    public void enviarCorreo(String usuario, String contraseña, String destinatario, String asunto, String mensaje) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, contraseña);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(mensaje);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
        if (VistaPago.metodo == "Tarjeta") {
            jPanelTarjeta.setVisible(true);
            jPanelEfectivo.setVisible(false);
            jLabelNombre.setText(LoginCliente.cliente.getNombre());
            jLabelPrecio.setText("Monto: $" + Float.toString(VistaPrincipal.asiento.getPrecio()));
            jLabelMetodo.setText("Método de pago: " + VistaPago.metodo);
            jLabelNumero.setText("Numero de tarjeta: " + VistaPago.numTarjeta);
            jLabelCuotas.setText("Cantidad de cuotas: " + VistaPago.cuotas);
        } else {
            jPanelTarjeta.setVisible(false);
            jPanelEfectivo.setVisible(true);
            jLabelNombreE.setText(LoginCliente.cliente.getNombre());
            jLabelPrecioE.setText("Monto: $" + Float.toString(VistaPrincipal.asiento.getPrecio()));
            jLabelMetodoE.setText("Método de pago: " + VistaPago.metodo);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelCerrar;
    private static javax.swing.JLabel jLabelCuotas;
    private javax.swing.JLabel jLabelInicio;
    private static javax.swing.JLabel jLabelMetodo;
    private static javax.swing.JLabel jLabelMetodoE;
    private static javax.swing.JLabel jLabelNombre;
    private static javax.swing.JLabel jLabelNombreE;
    private static javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPago;
    private static javax.swing.JLabel jLabelPrecio;
    private static javax.swing.JLabel jLabelPrecioE;
    private javax.swing.JLabel jLabelTexto;
    private static javax.swing.JPanel jPanelEfectivo;
    private javax.swing.JPanel jPanelFondo;
    private static javax.swing.JPanel jPanelTarjeta;
    // End of variables declaration//GEN-END:variables
}
