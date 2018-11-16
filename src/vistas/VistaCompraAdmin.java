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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;





/**
 *
 * @author pedro
 */
public class VistaCompraAdmin extends javax.swing.JFrame {

    private static  VistaCompraAdmin ventana = new VistaCompraAdmin();
    
    /*static void visibilidad(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
     private TableRowSorter filtro;
     private CompraData gestorCompra = new CompraData();
     private List<Compra> listaCompras = gestorCompra.obtenerCompras();
     
     public VistaCompraAdmin() {
     
        initComponents();
        soloNumeros(cajaDniCliente);
        soloLetras(cajaFechaSalida);
        mostrarCompras(listaCompras);
        
        //DESHABILITO LOS CAMPOS QUE SOLO SE VISUALIZARAN
           cajaApellido.setEnabled(false);
           cajaAsiento.setEnabled(false);
     
              cajaCiudadDestino.setEnabled(false);
                cajaCiudadOrigen.setEnabled(false);
     cajaDniCliente.setEnabled(false);
   cajaFechaArribo.setEnabled(false);
     cajaFechaSalida.setEnabled(false);
   cajaNombre.setEnabled(false);
    
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelDatosCompra = new javax.swing.JPanel();
        panelListadoCompras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        botonEliminarCompra = new javax.swing.JButton();
        cajaBuscarCompra = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();
        botonModificarCompra = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cajaDniCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaFechaSalida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaFechaArribo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cajaCiudadOrigen = new javax.swing.JTextField();
        cajaCiudadDestino = new javax.swing.JTextField();
        idCompra = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cajaTarjetaCompra = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelDatosCompraLayout = new javax.swing.GroupLayout(panelDatosCompra);
        panelDatosCompra.setLayout(panelDatosCompraLayout);
        panelDatosCompraLayout.setHorizontalGroup(
            panelDatosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        panelDatosCompraLayout.setVerticalGroup(
            panelDatosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCompras);

        botonEliminarCompra.setText("ELIMINAR");
        botonEliminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCompraActionPerformed(evt);
            }
        });

        cajaBuscarCompra.setText("Buscar por Dni");
        cajaBuscarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaBuscarCompraMouseClicked(evt);
            }
        });
        cajaBuscarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarCompraActionPerformed(evt);
            }
        });
        cajaBuscarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaBuscarCompraKeyTyped(evt);
            }
        });

        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonModificarCompra.setText("MODIFICAR");
        botonModificarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarCompraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelListadoComprasLayout = new javax.swing.GroupLayout(panelListadoCompras);
        panelListadoCompras.setLayout(panelListadoComprasLayout);
        panelListadoComprasLayout.setHorizontalGroup(
            panelListadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoComprasLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelListadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelListadoComprasLayout.createSequentialGroup()
                        .addComponent(cajaBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelListadoComprasLayout.setVerticalGroup(
            panelListadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoComprasLayout.createSequentialGroup()
                .addGroup(panelListadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListadoComprasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelListadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEliminarCompra)
                            .addComponent(botonLimpiar)
                            .addComponent(botonModificarCompra)))
                    .addComponent(cajaBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Dni:");

        cajaDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDniClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Salida:");

        jLabel2.setText("Asiento:");

        jLabel3.setText("Fecha de Arribo:");

        jLabel4.setText("Nombre:");

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido:");

        cajaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidoActionPerformed(evt);
            }
        });

        jLabel7.setText("Ciudad Origen:");

        jLabel8.setText("Ciudad Destino:");

        idCompra.setText("Nro");

        jLabel9.setText("Nro de Compra:");

        jLabel10.setText("Ingrese su numero de tarjeta:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idCompra)
                                    .addComponent(cajaDniCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(cajaCiudadOrigen)
                                    .addComponent(cajaAsiento)
                                    .addComponent(cajaTarjetaCompra))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaCiudadDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(cajaNombre))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaFechaArribo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelListadoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112)
                        .addComponent(panelDatosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(botonSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(idCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cajaDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(cajaCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaFechaArribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTarjetaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(panelListadoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(52, 52, 52))
        );

        jTabbedPane2.addTab("COMPRAS", jPanel2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("COMPRAS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        ventana.setVisible(false);
        VistaAdmin.visibilidad(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed

    private void cajaBuscarCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarCompraKeyTyped
        cajaBuscarCompra.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                String cadena = (cajaBuscarCompra.getText());
                cajaBuscarCompra.setText(cadena);
                repaint();
                filtro();
            }
        });
        filtro = new TableRowSorter (tablaCompras.getModel());
        tablaCompras.setRowSorter(filtro);
    }//GEN-LAST:event_cajaBuscarCompraKeyTyped

    private void cajaBuscarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarCompraActionPerformed

    }//GEN-LAST:event_cajaBuscarCompraActionPerformed

    private void cajaBuscarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaBuscarCompraMouseClicked
        //cajaBuscarCompra.setText(null);
    }//GEN-LAST:event_cajaBuscarCompraMouseClicked

    private void tablaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaComprasMouseClicked
        llenarCamposCompra();// TODO add your handling code here:
    }//GEN-LAST:event_tablaComprasMouseClicked

    private void botonEliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCompraActionPerformed
        if(!cajaDniCliente.getText().equals("")){
            // SI SE HA INGRESADO UN Id
            int id = Integer.parseInt(idCompra.getText());
            if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de eliminar esta compra?")) {
                //EXISTE EN LA BASE DE DATOS?

                int exito;
                try {
                    exito = gestorCompra.borrarCompra(id);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCompraAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null,"Se ha eliminado la compra exitosamente");

            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Ingrese id de la compra");
        }
    }//GEN-LAST:event_botonEliminarCompraActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        vaciarCajasCompra();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void cajaDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDniClienteActionPerformed

    private void cajaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidoActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed
   private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    private void botonModificarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarCompraMouseClicked
        if(isNumeric(idCompra.getText())){
        if(!cajaTarjetaCompra.getText().equals("") && cajaTarjetaCompra.getText().length()<10){
          if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de modificar esta compra?")) {  
         
               int nuevaTarjeta = Integer.parseInt(cajaTarjetaCompra.getText());
              int id = Integer.parseInt(idCompra.getText());
             
              try {
                  gestorCompra.modificarCompra(id, nuevaTarjeta );
                   JOptionPane.showMessageDialog(null,"Modificacion exitosa");
              } catch (SQLException ex) {
                  Logger.getLogger(VistaCompraAdmin.class.getName()).log(Level.SEVERE, null, ex);
                   JOptionPane.showMessageDialog(null,"erro en la actualizacion");
              }
             
           }
          
       }
       else{
            JOptionPane.showMessageDialog(null,"Debe ingresar un nro de tarjeta valido");
       }
        }
        else
        {
              JOptionPane.showMessageDialog(null,"Debe seleccionar una compra");
        }
    }//GEN-LAST:event_botonModificarCompraMouseClicked

     public static void visibilidad(boolean estado){
      ventana.setVisible(estado);
  } 
    
  public void mostrarCompras( List<Compra> lista){
    
      //llamamos a los metodos para conectar ala BASE DE DATOS
      
        //Collections.sort(lista);
        String[] columnas = {"id","Dni Cliente", "Nombre Cliente","Aerolinea","Ciudad Origen","Ciudad Destino","Fecha de Salida","Fecha de Arribo", "Asiento", "Fecha de Compra"};
        
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
         int i= 0;
         SimpleDateFormat simpleFormat= new SimpleDateFormat("dd-mm-yyyy  HH:mm");
         String fechaCompra=simpleFormat.format(lista.get(i).getFechaCompra());
         while(i<lista.size()){
             lista.get(i).getFechaCompra();
             String[] filas = {""+lista.get(i).getIdCompra(), ""+lista.get(i).getCliente().getDni(), ""+lista.get(i).getCliente().getNombre()+" "+lista.get(i).getCliente().getApellido(), ""+lista.get(i).getAsiento().getVuelo().getAerolinea(), ""+lista.get(i).getAsiento().getVuelo().getCiudadOrigen().getNombre(), ""+lista.get(i).getAsiento().getVuelo().getCiudadDestino().getNombre(), ""+lista.get(i).getAsiento().getVuelo().getFechaSalida(), ""+lista.get(i).getAsiento().getVuelo().getFechaArribo(), ""+lista.get(i).getAsiento().getCodigoAsiento(), ""+fechaCompra+" hs."};
              i++;            
         dtm.addRow(filas);
     
       }
         tablaCompras.setModel(dtm);
    }
      
        public void soloLetras(JTextField texto){
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evento){
                char c=evento.getKeyChar();
                if (Character.isDigit(c)){
                    getToolkit().beep();
                    evento.consume();}
            }
        });
    }
    public void soloNumeros(JTextField texto){
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evento){
                char c=evento.getKeyChar();
                if (!Character.isDigit(c)){
                    getToolkit().beep();
                    evento.consume();}
            }
        });
    }
    
     public void vaciarCajasCompra(){ 
     cajaDniCliente.setText("");
     cajaNombre.setText("");
     cajaApellido.setText("");
     cajaCiudadOrigen.setText("");
     cajaCiudadDestino.setText("");
     cajaFechaSalida.setText("");
     cajaFechaArribo.setText("");
     cajaAsiento.setText("");
     }
    
     public void llenarCamposCompra(){
          int fila = tablaCompras.getSelectedRow();
          String id_aux = tablaCompras.getValueAt(fila, 0).toString();
          int id= Integer.parseInt(id_aux);
          Compra compra = gestorCompra.buscarCompra(id);
          idCompra.setText(id_aux);
          cajaDniCliente.setText(""+compra.getCliente().getDni());
          cajaNombre.setText(""+compra.getCliente().getNombre());
          cajaApellido.setText(""+compra.getCliente().getApellido());
          
          cajaCiudadOrigen.setText(""+compra.getAsiento().getVuelo().getCiudadOrigen().getNombre());
          cajaCiudadDestino.setText(""+compra.getAsiento().getVuelo().getCiudadDestino().getNombre());
          
          SimpleDateFormat simpleFormat= new SimpleDateFormat("dd-mm-yyyy HH:mm");
          String fecha=simpleFormat.format(compra.getAsiento().getVuelo().getFechaSalida());
          cajaFechaSalida.setText(""+fecha+" hs");
          fecha=simpleFormat.format(compra.getAsiento().getVuelo().getFechaArribo());
          cajaFechaArribo.setText(""+fecha+" hs");
         
          cajaAsiento.setText(""+compra.getAsiento().getCodigoAsiento());
          
     } 
    
        private boolean cajasVaciasCompra(){
        boolean hayvacias = false;
        
        if(cajaDniCliente.getText().equals("") ){
              hayvacias=true;
        }
        
     
        return hayvacias;
    }   
        public void filtro(){
        filtro.setRowFilter(RowFilter.regexFilter(cajaBuscarCompra.getText(), 1,2));
    } 
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarCompra;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificarCompra;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaAsiento;
    private javax.swing.JTextField cajaBuscarCompra;
    private javax.swing.JTextField cajaCiudadDestino;
    private javax.swing.JTextField cajaCiudadOrigen;
    private javax.swing.JTextField cajaDniCliente;
    private javax.swing.JTextField cajaFechaArribo;
    private javax.swing.JTextField cajaFechaSalida;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaTarjetaCompra;
    private javax.swing.JLabel idCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelDatosCompra;
    private javax.swing.JPanel panelListadoCompras;
    private javax.swing.JTable tablaCompras;
    // End of variables declaration//GEN-END:variables
}
