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
public class VistaAdminOpciones extends javax.swing.JFrame {

    /**
     * Creates new form VistaAdminOpciones
     */
    public VistaAdminOpciones() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jButtonCiudades = new javax.swing.JButton();
        jButtonVuelos = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonCompras = new javax.swing.JButton();
        jButtonAsientos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInicio.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 153, 51));
        jLabelInicio.setText("Inicio //");
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 98, 30));

        jLabelAdministrador.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministrador.setText("Administrador");
        jLabelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 30));

        jLabelCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(102, 153, 51));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 15, 15));

        jButtonCiudades.setBackground(new java.awt.Color(102, 153, 51));
        jButtonCiudades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCiudades.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCiudades.setText("Ciudades");
        jButtonCiudades.setBorder(null);
        jButtonCiudades.setBorderPainted(false);
        jButtonCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 111, 198, 42));

        jButtonVuelos.setBackground(new java.awt.Color(102, 153, 51));
        jButtonVuelos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonVuelos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVuelos.setText("Vuelos");
        jButtonVuelos.setBorder(null);
        jButtonVuelos.setBorderPainted(false);
        jButtonVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 111, 198, 42));

        jButtonClientes.setBackground(new java.awt.Color(102, 153, 51));
        jButtonClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setText("Clientes");
        jButtonClientes.setBorder(null);
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 111, 198, 42));

        jButtonCompras.setBackground(new java.awt.Color(102, 153, 51));
        jButtonCompras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCompras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCompras.setText("Compras");
        jButtonCompras.setBorder(null);
        jButtonCompras.setBorderPainted(false);
        jButtonCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 166, 198, 42));

        jButtonAsientos.setBackground(new java.awt.Color(102, 153, 51));
        jButtonAsientos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAsientos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsientos.setText("Asientos");
        jButtonAsientos.setBorder(null);
        jButtonAsientos.setBorderPainted(false);
        jButtonAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 166, 198, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAdminOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdminOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdminOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdminOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdminOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsientos;
    private javax.swing.JButton jButtonCiudades;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonVuelos;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}