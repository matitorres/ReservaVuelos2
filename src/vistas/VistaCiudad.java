/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Ciudad;
import clasesData.CiudadData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Doris
 */
public class VistaCiudad extends javax.swing.JFrame {
  private static VistaCiudad ventana = new VistaCiudad();
  private CiudadData gestor;
    /**
     * Creates new form Interfaz
     */
    public VistaCiudad() {
        initComponents();
        gestor = new CiudadData();
        cajaId.setEnabled(false);
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cajaCiudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaPais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonAgregarCiudad = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCiudades = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();
        botonSALIR = new javax.swing.JButton();
        comboVigencia = new javax.swing.JComboBox<>();
        buscarCiudad = new javax.swing.JTextField();
        verCiudades = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cajaId = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 20));

        cajaCiudad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cajaCiudad.setForeground(new java.awt.Color(0, 102, 51));
        cajaCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(cajaCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAIS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 20));

        cajaPais.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cajaPais.setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().add(cajaPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIGENCIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 30));

        botonAgregarCiudad.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonAgregarCiudad.setForeground(new java.awt.Color(0, 102, 51));
        botonAgregarCiudad.setText("AGREGAR");
        botonAgregarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarCiudadMouseClicked(evt);
            }
        });
        getContentPane().add(botonAgregarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 120, 30));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 51));
        jButton2.setText("BORRAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, 30));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 51));
        jButton3.setText("MODIFICAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, 30));

        tablaCiudades.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        tablaCiudades.setForeground(new java.awt.Color(153, 153, 153));
        tablaCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCiudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCiudades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 560, 120));

        jLabelFondo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelFondo.setForeground(new java.awt.Color(0, 204, 102));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botonSALIR.setText("SALIR");
        botonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(botonSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 70, -1));

        comboVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        getContentPane().add(comboVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, -1));

        buscarCiudad.setText("Buscar..por nombre..");
        getContentPane().add(buscarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, -1));

        verCiudades.setText("VER");
        verCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCiudadesMouseClicked(evt);
            }
        });
        getContentPane().add(verCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 20));
        getContentPane().add(cajaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public static void visibilidad(boolean estado){
       ventana.setVisible(estado);
   }
     
   public void pasar_ciudades(List<Ciudad> lista){
      int i;
      //llamamos a los metodos para conectar ala BASE DE DATOS
           DefaultTableModel dm = (DefaultTableModel) tablaCiudades.getModel();
                int rowCount = dm.getRowCount();
                //Borra una a una las filas de la tabla
                for (int r = rowCount - 1; r >= 0; r--) {
                    dm.removeRow(r);
                }
            
        
        String[] columnas = {"ID","Nombre", "Pais", "Vigencia"};
        
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        
            Iterator iter = lista.iterator();
            Ciudad c;
            String vigencia = "SI";
       while(iter.hasNext()){
           c = (Ciudad)iter.next();
           
           if(c.getVigencia()){
              vigencia = "SI";
           }
           else{
                   vigencia = "NO";
                   }
           
      
         String[] filas = {""+c.getIdCiudad(), c.getNombre(),c.getPais(), vigencia};
          dtm.addRow(filas);
     
       }
 
        tablaCiudades.setModel(dtm);

        
    }
    private void cajaCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCiudadActionPerformed

    private void botonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSALIRActionPerformed
       ventana.setVisible(false);
       VistaAdmin.visibilidad(true);
    }//GEN-LAST:event_botonSALIRActionPerformed

    private void botonAgregarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarCiudadMouseClicked
  // FALTA AGREGAR METODO QUE SOLO PERMITA INGRESAR STRINGS EN ESTOS CAMPOS
     if(!cajaPais.getText().equals("")  && !cajaCiudad.getText().equals("")){   
         
       if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de hacer este registro?")) {
       try {
          // aqui tengo q usar el metodo de ciudadData : " guardarCiudad"
          
          // CREO LA CIUDAD
          Ciudad ciudad =   new Ciudad();
          // AGREGO VALORES A LOS ATRIBUTOS DE CIUDAD
          
          ciudad.setNombre(cajaCiudad.getText());
          ciudad.setPais(cajaPais.getText());
          
          String combo = (String)comboVigencia.getSelectedItem();
          boolean vigencia = false;
          
          //COMBO PUEDE SER UN SI O UN " NO"
          switch(combo){
              case "NO": vigencia = false;
              break;
              case "SI": vigencia = true;
              break;
              
          }
          ciudad.setVigencia(vigencia);
          
          //YA ESTA LA CIUDAD CON SUS ATRIBUTOS CARGADOS
          
          if(!gestor.existeCiudad(ciudad)){
                  gestor.guardarCiudad(ciudad);
         JOptionPane.showMessageDialog(null,"Registro exitoso.");
          }
          else{
                 JOptionPane.showMessageDialog(null,"Ciudad repetida.");
          }
       
      } catch (SQLException ex) {
          Logger.getLogger(VistaCiudad.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null,"fallo al agregar ciudad a la base de datos.");
          
      }
       }
     
    }
    else{
     JOptionPane.showMessageDialog(null,"Debe llenar todos los campos.");
     }
  
    }//GEN-LAST:event_botonAgregarCiudadMouseClicked

    private void verCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCiudadesMouseClicked
        // BORRO LAS CIUDADES DE LA BUSQUEDA ANTERIOR, SI LAS HAY
        
      
                
                
        if(!buscarCiudad.getText().equals("")){
           try {
               List <Ciudad> lista = gestor.filtrarCiudades(buscarCiudad.getText());
               pasar_ciudades(lista);
           } catch (SQLException ex) {
               Logger.getLogger(VistaCiudad.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error al filtrar ciudades de la base de datos.");
           }
       }
    }//GEN-LAST:event_verCiudadesMouseClicked

    private void tablaCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCiudadesMouseClicked
     
        
    
        int row = tablaCiudades.getSelectedRow();
        
        int column = 0;
        String id = tablaCiudades.getModel().getValueAt(row, column).toString(); 
        
        
        column = 1;                
        String nombre = tablaCiudades.getModel().getValueAt(row, column).toString();
        
        column = 2;
         String pais = tablaCiudades.getModel().getValueAt(row, column).toString();
         
         column = 3;
        String vigencia = tablaCiudades.getModel().getValueAt(row, column).toString();
        
        cajaId.setText(id);
        comboVigencia.setSelectedItem(vigencia);
        cajaCiudad.setText(nombre);
        cajaPais.setText(pais);
                 
    }//GEN-LAST:event_tablaCiudadesMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      if(!cajaId.getText().equals("")){
            if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro?")) {
                int id =  Integer.parseInt(cajaId.getText());
        
                try {
                    gestor.borrarCiudad(id);
                     
                    JOptionPane.showMessageDialog(null,"Se ha borrado la ciudad");
                     
        
                  
             
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCiudad.class.getName()).log(Level.SEVERE, null, ex);
                       JOptionPane.showMessageDialog(null,"Error al borrar la ciudad de la base de datos");
                }
              
            }
          
      }
      else{
              JOptionPane.showMessageDialog(null,"Seleccione una ciudad");
      }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
            if(!cajaId.getText().equals("") && !cajaCiudad.getText().equals("") && !cajaPais.getText().equals("")){
            if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro?")) {
                int id =  Integer.parseInt(cajaId.getText());
            String combo =(String) comboVigencia.getSelectedItem();
            boolean vigencia = false;
             switch(combo){
              case "NO": vigencia = false;
              break;
              case "SI": vigencia = true;
              break;
              
          }
     
                
                Ciudad ciudad = new Ciudad(id, cajaCiudad.getText(), cajaPais.getText(),vigencia );
        
                
                try {
                    gestor.modificarCiudad(ciudad);
                     JOptionPane.showMessageDialog(null,"Se ha modificado la ciudad");
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCiudad.class.getName()).log(Level.SEVERE, null, ex);
                     JOptionPane.showMessageDialog(null,"Error al modificar la ciudad");
                }
     
              
            }
          
      }
      else{
              JOptionPane.showMessageDialog(null,"Seleccione una ciudad");
      }
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCiudad;
    private javax.swing.JButton botonSALIR;
    private javax.swing.JTextField buscarCiudad;
    private javax.swing.JTextField cajaCiudad;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaPais;
    private javax.swing.JComboBox<String> comboVigencia;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaCiudades;
    private javax.swing.JButton verCiudades;
    // End of variables declaration//GEN-END:variables
}
