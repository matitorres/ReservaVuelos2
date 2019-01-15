/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author asus pc
 */
public class VistaPago extends javax.swing.JFrame {

    private static VistaPago ventana = new VistaPago();
    public static String metodo = "";
    public static String numTarjeta = "";
    public static String cuotas = "";

    public VistaPago() {
        initComponents();
        setLocationRelativeTo(null);
        jPanelTarjeta.setVisible(true);
        jPanelEfectivo.setVisible(false);
        jTextNumero.setText(Integer.toString(LoginCliente.cliente.getTarjeta()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelPago = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jComboBoxPago = new javax.swing.JComboBox<>();
        jButtonSiguiente = new javax.swing.JButton();
        jPanelEfectivo = new javax.swing.JPanel();
        jLabelPagofacil = new javax.swing.JLabel();
        jLabelRapipago = new javax.swing.JLabel();
        jPanelFondoRapi = new javax.swing.JPanel();
        jPanelFondoPago = new javax.swing.JPanel();
        jPanelTarjeta = new javax.swing.JPanel();
        jTextNumero = new javax.swing.JTextField();
        jTextPin = new javax.swing.JTextField();
        jComboBoxCuotas = new javax.swing.JComboBox<>();
        jLabelNumero = new javax.swing.JLabel();
        jLabelPin = new javax.swing.JLabel();
        jLabelCuotas = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jLabelMetodo = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();

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
        jLabelPago.setText("Método de pago");
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

        jComboBoxPago.setBackground(new java.awt.Color(153, 204, 51));
        jComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "Efectivo" }));
        jComboBoxPago.setBorder(null);
        jComboBoxPago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPagoItemStateChanged(evt);
            }
        });
        jPanelFondo.add(jComboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 103, 236, 31));

        jButtonSiguiente.setBackground(new java.awt.Color(102, 153, 51));
        jButtonSiguiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setToolTipText("");
        jButtonSiguiente.setBorder(null);
        jButtonSiguiente.setBorderPainted(false);
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 307, 150, 30));

        jPanelEfectivo.setBackground(new java.awt.Color(102, 153, 51));
        jPanelEfectivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPagofacil.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelPagofacil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagofacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PagoFacil.png"))); // NOI18N
        jLabelPagofacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPagofacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPagofacilMouseClicked(evt);
            }
        });
        jPanelEfectivo.add(jLabelPagofacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 25, 86, 85));

        jLabelRapipago.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelRapipago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRapipago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rapipago.png"))); // NOI18N
        jLabelRapipago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRapipago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRapipagoMouseClicked(evt);
            }
        });
        jPanelEfectivo.add(jLabelRapipago, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 45, 159, 44));

        jPanelFondoRapi.setBackground(new java.awt.Color(153, 204, 51));

        javax.swing.GroupLayout jPanelFondoRapiLayout = new javax.swing.GroupLayout(jPanelFondoRapi);
        jPanelFondoRapi.setLayout(jPanelFondoRapiLayout);
        jPanelFondoRapiLayout.setHorizontalGroup(
            jPanelFondoRapiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanelFondoRapiLayout.setVerticalGroup(
            jPanelFondoRapiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanelEfectivo.add(jPanelFondoRapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 40, 170, 54));

        jPanelFondoPago.setBackground(new java.awt.Color(153, 204, 51));

        javax.swing.GroupLayout jPanelFondoPagoLayout = new javax.swing.GroupLayout(jPanelFondoPago);
        jPanelFondoPago.setLayout(jPanelFondoPagoLayout);
        jPanelFondoPagoLayout.setHorizontalGroup(
            jPanelFondoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanelFondoPagoLayout.setVerticalGroup(
            jPanelFondoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        jPanelEfectivo.add(jPanelFondoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 20, 96, 95));

        jPanelFondo.add(jPanelEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 150, 407, 139));

        jPanelTarjeta.setBackground(new java.awt.Color(102, 153, 51));
        jPanelTarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextNumero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelTarjeta.add(jTextNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 33, 236, 31));

        jTextPin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelTarjeta.add(jTextPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 33, 77, 31));

        jComboBoxCuotas.setBackground(new java.awt.Color(102, 153, 51));
        jComboBoxCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "3", "6", "12" }));
        jComboBoxCuotas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBoxCuotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCuotasItemStateChanged(evt);
            }
        });
        jPanelTarjeta.add(jComboBoxCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 94, 111, 31));

        jLabelNumero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("N° de tarjeta");
        jPanelTarjeta.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 9, -1, -1));

        jLabelPin.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelPin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPin.setText("PIN");
        jPanelTarjeta.add(jLabelPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 9, -1, -1));

        jLabelCuotas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelCuotas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuotas.setText("Cuotas");
        jPanelTarjeta.add(jLabelCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 70, -1, -1));

        jPanelFondo.add(jPanelTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 150, 407, 139));

        jLabelMonto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelMonto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMonto.setText("Monto");
        jPanelFondo.add(jLabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 79, -1, -1));

        jLabelMetodo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMetodo.setText("Método de pago");
        jPanelFondo.add(jLabelMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 79, -1, -1));

        jLabelPrecio.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("$00000,0");
        jPanelFondo.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 103, 120, 31));

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
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jComboBoxPagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPagoItemStateChanged
        switch (jComboBoxPago.getSelectedItem().toString()) {
            case "Tarjeta de crédito":
                jButtonSiguiente.setEnabled(true);
                jPanelTarjeta.setVisible(true);
                jPanelEfectivo.setVisible(false);
                break;
            case "Efectivo":
                jPanelFondoRapi.setVisible(false);
                jPanelFondoPago.setVisible(false);
                jButtonSiguiente.setEnabled(false);
                jPanelTarjeta.setVisible(false);
                jPanelEfectivo.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jComboBoxPagoItemStateChanged

    private void jLabelRapipagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRapipagoMouseClicked
        this.metodo = "Rapipago";
        jPanelFondoRapi.setVisible(true);
        jPanelFondoPago.setVisible(false);
        jButtonSiguiente.setEnabled(true);
    }//GEN-LAST:event_jLabelRapipagoMouseClicked

    private void jLabelPagofacilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPagofacilMouseClicked
        this.metodo = "PagoFácil";
        jPanelFondoRapi.setVisible(false);
        jPanelFondoPago.setVisible(true);
        jButtonSiguiente.setEnabled(true);
    }//GEN-LAST:event_jLabelPagofacilMouseClicked

    private void jComboBoxCuotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCuotasItemStateChanged
        switch (jComboBoxCuotas.getSelectedItem().toString()) {
            case "1":
                cuotas = "1";
                break;
            case "3":
                cuotas = "3";
                break;
            case "6":
                cuotas = "6";
                break;
            case "12":
                cuotas = "12";
                break;
        }
    }//GEN-LAST:event_jComboBoxCuotasItemStateChanged

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if (jComboBoxPago.getSelectedItem() == "Tarjeta de crédito") {
            if (!camposVacios()) {
                numTarjeta = jTextNumero.getText();
                cuotas = jComboBoxCuotas.getSelectedItem().toString();
                metodo = "Tarjeta";
                ventana.setVisible(false);
                VistaConfirmacion.visibilidad(true);
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
        } else {
            ventana.setVisible(false);
            VistaConfirmacion.visibilidad(true);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private boolean camposVacios() {
        boolean hayVacias = false;
        if (jTextNumero.getText().equals("") || jTextPin.getText().equals("")) {
            hayVacias = true;
        }
        return hayVacias;
    }

    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
        jLabelPrecio.setText("$" + Float.toString(VistaPrincipal.asiento.getPrecio()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JComboBox<String> jComboBoxCuotas;
    private javax.swing.JComboBox<String> jComboBoxPago;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCuotas;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelMetodo;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPago;
    private javax.swing.JLabel jLabelPagofacil;
    private javax.swing.JLabel jLabelPin;
    private static javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRapipago;
    private javax.swing.JPanel jPanelEfectivo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelFondoPago;
    private javax.swing.JPanel jPanelFondoRapi;
    private javax.swing.JPanel jPanelTarjeta;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPin;
    // End of variables declaration//GEN-END:variables
}
