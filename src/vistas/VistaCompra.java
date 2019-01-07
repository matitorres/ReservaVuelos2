/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author asus pc
 */
public class VistaCompra extends javax.swing.JFrame {

    private static VistaCompra ventana = new VistaCompra();
    
    public VistaCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelCompras = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        jPanelSeleccion = new javax.swing.JPanel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldAsiento = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelIdCliente = new javax.swing.JLabel();
        jLabelIdAsiento = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

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
        jLabelAdministrador.setForeground(new java.awt.Color(102, 153, 51));
        jLabelAdministrador.setText("Administrador /");
        jLabelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdministradorMouseClicked(evt);
            }
        });
        jPanelFondo.add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 30));

        jLabelCompras.setBackground(new java.awt.Color(102, 153, 51));
        jLabelCompras.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelCompras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompras.setText("Compras");
        jPanelFondo.add(jLabelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 30));

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

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Cliente", "Id Asiento", "Fecha / Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompras.setToolTipText("");
        jTableCompras.setSelectionBackground(new java.awt.Color(102, 153, 51));
        jTableCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPaneCompras.setViewportView(jTableCompras);

        jPanelFondo.add(jScrollPaneCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 75, 691, 240));

        jPanelSeleccion.setBackground(new java.awt.Color(102, 153, 51));
        jPanelSeleccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelSeleccion.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 44, 228, 31));

        jTextFieldAsiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAsiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanelSeleccion.add(jTextFieldAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 44, 228, 31));

        jDateChooser.setBackground(new java.awt.Color(102, 153, 51));
        jPanelSeleccion.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 44, 105, 31));

        jLabelIdCliente.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdCliente.setText("Fecha");
        jPanelSeleccion.add(jLabelIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 20, -1, -1));

        jLabelIdAsiento.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelIdAsiento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdAsiento.setText("Id Asiento");
        jPanelSeleccion.add(jLabelIdAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 20, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Id Cliente");
        jPanelSeleccion.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 20, -1, -1));

        jPanelFondo.add(jPanelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 341, 691, 100));

        jButtonEliminar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("- Eliminar compra");
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFondo.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 460, 168, 31));

        jButtonModificar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("/ Modificar compra");
        jButtonModificar.setBorder(null);
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFondo.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 168, 31));

        jButtonAgregar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("+ Agregar compra");
        jButtonAgregar.setBorder(null);
        jButtonAgregar.setBorderPainted(false);
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFondo.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 460, 168, 31));

        jButtonBuscar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("ó Buscar compra");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFondo.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 460, 168, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        ventana.setVisible(false);
        VistaPrincipal.visibilidad(true);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministradorMouseClicked
        ventana.setVisible(false);
        VistaAdmin.visibilidad(true);
    }//GEN-LAST:event_jLabelAdministradorMouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIdAsiento;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelSeleccion;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JTextField jTextFieldAsiento;
    private javax.swing.JTextField jTextFieldCliente;
    // End of variables declaration//GEN-END:variables
}
