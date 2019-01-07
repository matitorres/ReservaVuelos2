package vistas;

import clases.Asiento;
import clases.Ciudad;
import clases.Vuelo;
import clasesData.AsientoData;
import clasesData.CiudadData;
import clasesData.VueloData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author asus pc
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    private VueloData vD = new VueloData();
    private CiudadData cD = new CiudadData();
    private AsientoData aD = new AsientoData();
    private DefaultTableModel modelo;
    private static VistaPrincipal ventana = new VistaPrincipal();
    public static Asiento asiento = null;

    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        llenarComboCiudades();
        jPanelAsientos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelAsientos = new javax.swing.JPanel();
        jButtonV001 = new javax.swing.JButton();
        jButtonP002 = new javax.swing.JButton();
        jButtonP003 = new javax.swing.JButton();
        jButtonV004 = new javax.swing.JButton();
        jButtonV005 = new javax.swing.JButton();
        jButtonP006 = new javax.swing.JButton();
        jButtonP007 = new javax.swing.JButton();
        jButtonV008 = new javax.swing.JButton();
        jButtonV009 = new javax.swing.JButton();
        jButtonP010 = new javax.swing.JButton();
        jButtonP011 = new javax.swing.JButton();
        jButtonV012 = new javax.swing.JButton();
        jButtonV013 = new javax.swing.JButton();
        jButtonP014 = new javax.swing.JButton();
        jButtonP015 = new javax.swing.JButton();
        jButtonV016 = new javax.swing.JButton();
        jButtonV017 = new javax.swing.JButton();
        jButtonP018 = new javax.swing.JButton();
        jButtonP019 = new javax.swing.JButton();
        jButtonV020 = new javax.swing.JButton();
        jButtonV021 = new javax.swing.JButton();
        jButtonP022 = new javax.swing.JButton();
        jButtonP023 = new javax.swing.JButton();
        jButtonV024 = new javax.swing.JButton();
        jButtonV025 = new javax.swing.JButton();
        jButtonP026 = new javax.swing.JButton();
        jButtonP027 = new javax.swing.JButton();
        jButtonV028 = new javax.swing.JButton();
        jButtonV029 = new javax.swing.JButton();
        jButtonP030 = new javax.swing.JButton();
        jButtonP031 = new javax.swing.JButton();
        jButtonV032 = new javax.swing.JButton();
        jLabelPrecio = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanelBusqueda = new javax.swing.JPanel();
        jComboBoxOrigen = new javax.swing.JComboBox<>();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabelOrigen = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jPanelAsientosFondo = new javax.swing.JPanel();
        jScrollPaneVuelos = new javax.swing.JScrollPane();
        jTableVuelos = new javax.swing.JTable();
        jLabelAdmin = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelPrincipal.setBackground(new java.awt.Color(153, 204, 51));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAsientos.setBackground(new java.awt.Color(102, 153, 51));
        jPanelAsientos.setInheritsPopupMenu(true);
        jPanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonV001.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV001.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV001.setText("V001");
        jButtonV001.setBorder(null);
        jButtonV001.setBorderPainted(false);
        jButtonV001.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV001ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV001, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, 23, 23));

        jButtonP002.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP002.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP002.setText("P002");
        jButtonP002.setToolTipText("");
        jButtonP002.setBorder(null);
        jButtonP002.setBorderPainted(false);
        jButtonP002.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP002ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP002, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 12, 23, 23));

        jButtonP003.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP003.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP003.setText("V004");
        jButtonP003.setToolTipText("");
        jButtonP003.setBorder(null);
        jButtonP003.setBorderPainted(false);
        jButtonP003.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP003ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP003, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 12, 23, 23));

        jButtonV004.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV004.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV004.setText("P003");
        jButtonV004.setBorder(null);
        jButtonV004.setBorderPainted(false);
        jButtonV004.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV004.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV004ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV004, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 12, 23, 23));

        jButtonV005.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV005.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV005.setText("V005");
        jButtonV005.setBorder(null);
        jButtonV005.setBorderPainted(false);
        jButtonV005.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV005ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV005, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 41, 23, 23));

        jButtonP006.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP006.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP006.setText("P006");
        jButtonP006.setToolTipText("");
        jButtonP006.setBorder(null);
        jButtonP006.setBorderPainted(false);
        jButtonP006.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP006ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP006, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 41, 23, 23));

        jButtonP007.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP007.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP007.setText("P007");
        jButtonP007.setBorder(null);
        jButtonP007.setBorderPainted(false);
        jButtonP007.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP007ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP007, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 41, 23, 23));

        jButtonV008.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV008.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV008.setText("V008");
        jButtonV008.setToolTipText("");
        jButtonV008.setBorder(null);
        jButtonV008.setBorderPainted(false);
        jButtonV008.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV008.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV008ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV008, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 41, 23, 23));

        jButtonV009.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV009.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV009.setText("V009");
        jButtonV009.setBorder(null);
        jButtonV009.setBorderPainted(false);
        jButtonV009.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV009ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV009, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 70, 23, 23));

        jButtonP010.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP010.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP010.setText("P010");
        jButtonP010.setToolTipText("");
        jButtonP010.setBorder(null);
        jButtonP010.setBorderPainted(false);
        jButtonP010.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP010ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP010, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 23, 23));

        jButtonP011.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP011.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP011.setText("P011");
        jButtonP011.setBorder(null);
        jButtonP011.setBorderPainted(false);
        jButtonP011.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP011ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP011, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 70, 23, 23));

        jButtonV012.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV012.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV012.setText("V012");
        jButtonV012.setToolTipText("");
        jButtonV012.setBorder(null);
        jButtonV012.setBorderPainted(false);
        jButtonV012.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV012ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV012, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 23, 23));

        jButtonV013.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV013.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV013.setText("V013");
        jButtonV013.setBorder(null);
        jButtonV013.setBorderPainted(false);
        jButtonV013.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV013ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV013, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 99, 23, 23));

        jButtonP014.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP014.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP014.setText("P014");
        jButtonP014.setToolTipText("");
        jButtonP014.setBorder(null);
        jButtonP014.setBorderPainted(false);
        jButtonP014.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP014ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP014, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 99, 23, 23));

        jButtonP015.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP015.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP015.setText("P015");
        jButtonP015.setBorder(null);
        jButtonP015.setBorderPainted(false);
        jButtonP015.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP015ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP015, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 99, 23, 23));

        jButtonV016.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV016.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV016.setText("V016");
        jButtonV016.setToolTipText("");
        jButtonV016.setBorder(null);
        jButtonV016.setBorderPainted(false);
        jButtonV016.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV016ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV016, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 99, 23, 23));

        jButtonV017.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV017.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV017.setText("V017");
        jButtonV017.setBorder(null);
        jButtonV017.setBorderPainted(false);
        jButtonV017.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV017.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV017ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV017, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 128, 23, 23));

        jButtonP018.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP018.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP018.setText("P018");
        jButtonP018.setToolTipText("");
        jButtonP018.setBorder(null);
        jButtonP018.setBorderPainted(false);
        jButtonP018.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP018.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP018ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP018, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 128, 23, 23));

        jButtonP019.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP019.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP019.setText("P019");
        jButtonP019.setBorder(null);
        jButtonP019.setBorderPainted(false);
        jButtonP019.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP019ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP019, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 128, 23, 23));

        jButtonV020.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV020.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV020.setText("V020");
        jButtonV020.setToolTipText("");
        jButtonV020.setBorder(null);
        jButtonV020.setBorderPainted(false);
        jButtonV020.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV020.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV020ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV020, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 128, 23, 23));

        jButtonV021.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV021.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV021.setText("V021");
        jButtonV021.setBorder(null);
        jButtonV021.setBorderPainted(false);
        jButtonV021.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV021ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV021, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 157, 23, 23));

        jButtonP022.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP022.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP022.setText("P022");
        jButtonP022.setToolTipText("");
        jButtonP022.setBorder(null);
        jButtonP022.setBorderPainted(false);
        jButtonP022.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP022.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP022ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP022, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 157, 23, 23));

        jButtonP023.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP023.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP023.setText("P023");
        jButtonP023.setBorder(null);
        jButtonP023.setBorderPainted(false);
        jButtonP023.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP023.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP023ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP023, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 157, 23, 23));

        jButtonV024.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV024.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV024.setText("V024");
        jButtonV024.setToolTipText("");
        jButtonV024.setBorder(null);
        jButtonV024.setBorderPainted(false);
        jButtonV024.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV024.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV024ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV024, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 157, 23, 23));

        jButtonV025.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV025.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV025.setText("V025");
        jButtonV025.setBorder(null);
        jButtonV025.setBorderPainted(false);
        jButtonV025.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV025.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV025ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV025, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 186, 23, 23));

        jButtonP026.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP026.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP026.setText("P026");
        jButtonP026.setToolTipText("");
        jButtonP026.setBorder(null);
        jButtonP026.setBorderPainted(false);
        jButtonP026.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP026.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP026ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP026, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, 23, 23));

        jButtonP027.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP027.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP027.setText("P027");
        jButtonP027.setBorder(null);
        jButtonP027.setBorderPainted(false);
        jButtonP027.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP027.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP027ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP027, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 186, 23, 23));

        jButtonV028.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV028.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV028.setText("V028");
        jButtonV028.setToolTipText("");
        jButtonV028.setBorder(null);
        jButtonV028.setBorderPainted(false);
        jButtonV028.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV028.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV028ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV028, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 186, 23, 23));

        jButtonV029.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV029.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV029.setText("V029");
        jButtonV029.setBorder(null);
        jButtonV029.setBorderPainted(false);
        jButtonV029.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV029.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV029ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV029, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 215, 23, 23));

        jButtonP030.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP030.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP030.setText("P030");
        jButtonP030.setToolTipText("");
        jButtonP030.setBorder(null);
        jButtonP030.setBorderPainted(false);
        jButtonP030.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP030.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP030ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP030, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 215, 23, 23));

        jButtonP031.setBackground(new java.awt.Color(153, 204, 51));
        jButtonP031.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonP031.setText("P031");
        jButtonP031.setBorder(null);
        jButtonP031.setBorderPainted(false);
        jButtonP031.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP031.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP031ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonP031, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 215, 23, 23));

        jButtonV032.setBackground(new java.awt.Color(153, 204, 51));
        jButtonV032.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonV032.setText("V032");
        jButtonV032.setToolTipText("");
        jButtonV032.setBorder(null);
        jButtonV032.setBorderPainted(false);
        jButtonV032.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonV032.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonV032ActionPerformed(evt);
            }
        });
        jPanelAsientos.add(jButtonV032, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, 23, 23));

        jLabelPrecio.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("$00000,0");
        jPanelAsientos.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 255, 120, 40));

        jLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Precio");
        jPanelAsientos.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 250, 100, 10));

        jPanelPrincipal.add(jPanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 231, 162, 300));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanelPrincipal.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 22, 176, 37));

        jLabelCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(102, 153, 51));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 15, 15));

        jPanelBusqueda.setBackground(new java.awt.Color(102, 153, 51));
        jPanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxOrigen.setBackground(new java.awt.Color(102, 153, 51));
        jComboBoxOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxOrigen.setBorder(null);
        jPanelBusqueda.add(jComboBoxOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 39, 231, 31));

        jComboBoxDestino.setBackground(new java.awt.Color(102, 153, 51));
        jComboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDestino.setBorder(null);
        jPanelBusqueda.add(jComboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 39, 231, 31));

        jDateChooserFecha.setBackground(new java.awt.Color(102, 153, 51));
        jDateChooserFecha.setMinSelectableDate(new Date());
        jPanelBusqueda.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 39, 119, 31));

        jLabelOrigen.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelOrigen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrigen.setLabelFor(jComboBoxOrigen);
        jLabelOrigen.setText("Ciudad de Origen");
        jPanelBusqueda.add(jLabelOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 15, -1, -1));

        jLabelDestino.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDestino.setLabelFor(jComboBoxDestino);
        jLabelDestino.setText("Ciudad de Destino");
        jPanelBusqueda.add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 15, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setLabelFor(jDateChooserFecha);
        jLabelFecha.setText("Fecha");
        jPanelBusqueda.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 15, -1, -1));

        jPanelPrincipal.add(jPanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 82, 695, 91));

        jButtonBuscar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setToolTipText("");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 183, 150, 30));

        jPanelAsientosFondo.setBackground(new java.awt.Color(102, 153, 51));
        jPanelAsientosFondo.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanelAsientosFondoLayout = new javax.swing.GroupLayout(jPanelAsientosFondo);
        jPanelAsientosFondo.setLayout(jPanelAsientosFondoLayout);
        jPanelAsientosFondoLayout.setHorizontalGroup(
            jPanelAsientosFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanelAsientosFondoLayout.setVerticalGroup(
            jPanelAsientosFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(jPanelAsientosFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 231, 162, 251));

        jTableVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Aerolinea", "Aeronave", "Origen", "Destino", "Salida", "Arribo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVuelos.setToolTipText("");
        jTableVuelos.setSelectionBackground(new java.awt.Color(102, 153, 51));
        jTableVuelos.getTableHeader().setReorderingAllowed(false);
        jTableVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVuelosMouseClicked(evt);
            }
        });
        jScrollPaneVuelos.setViewportView(jTableVuelos);

        jPanelPrincipal.add(jScrollPaneVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 231, 518, 300));

        jLabelAdmin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdmin.setText("Modo administrador");
        jLabelAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdminMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jLabelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 555, -1, -1));

        jButtonComprar.setBackground(new java.awt.Color(102, 153, 51));
        jButtonComprar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprar.setText("Comprar");
        jButtonComprar.setToolTipText("");
        jButtonComprar.setBorder(null);
        jButtonComprar.setBorderPainted(false);
        jButtonComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonComprar.setEnabled(false);
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 550, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonV001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV001ActionPerformed
        seleccionarAsiento("V001");
    }//GEN-LAST:event_jButtonV001ActionPerformed

    private void jButtonP002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP002ActionPerformed
        seleccionarAsiento("P002");
    }//GEN-LAST:event_jButtonP002ActionPerformed

    private void jButtonP003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP003ActionPerformed
        seleccionarAsiento("P003");
    }//GEN-LAST:event_jButtonP003ActionPerformed

    private void jButtonV004ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV004ActionPerformed
        seleccionarAsiento("V004");
    }//GEN-LAST:event_jButtonV004ActionPerformed

    private void jButtonV005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV005ActionPerformed
        seleccionarAsiento("V005");
    }//GEN-LAST:event_jButtonV005ActionPerformed

    private void jButtonP006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP006ActionPerformed
        seleccionarAsiento("P006");
    }//GEN-LAST:event_jButtonP006ActionPerformed

    private void jButtonP007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP007ActionPerformed
        seleccionarAsiento("P007");
    }//GEN-LAST:event_jButtonP007ActionPerformed

    private void jButtonV008ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV008ActionPerformed
        seleccionarAsiento("V008");
    }//GEN-LAST:event_jButtonV008ActionPerformed

    private void jButtonV009ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV009ActionPerformed
        seleccionarAsiento("V009");
    }//GEN-LAST:event_jButtonV009ActionPerformed

    private void jButtonP010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP010ActionPerformed
        seleccionarAsiento("P010");
    }//GEN-LAST:event_jButtonP010ActionPerformed

    private void jButtonP011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP011ActionPerformed
        seleccionarAsiento("P011");
    }//GEN-LAST:event_jButtonP011ActionPerformed

    private void jButtonV012ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV012ActionPerformed
        seleccionarAsiento("V012");
    }//GEN-LAST:event_jButtonV012ActionPerformed

    private void jButtonV013ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV013ActionPerformed
        seleccionarAsiento("V013");
    }//GEN-LAST:event_jButtonV013ActionPerformed

    private void jButtonP014ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP014ActionPerformed
        seleccionarAsiento("P014");
    }//GEN-LAST:event_jButtonP014ActionPerformed

    private void jButtonP015ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP015ActionPerformed
        seleccionarAsiento("P015");
    }//GEN-LAST:event_jButtonP015ActionPerformed

    private void jButtonV016ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV016ActionPerformed
        seleccionarAsiento("V016");
    }//GEN-LAST:event_jButtonV016ActionPerformed

    private void jButtonV017ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV017ActionPerformed
        seleccionarAsiento("V017");
    }//GEN-LAST:event_jButtonV017ActionPerformed

    private void jButtonP018ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP018ActionPerformed
        seleccionarAsiento("P018");
    }//GEN-LAST:event_jButtonP018ActionPerformed

    private void jButtonP019ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP019ActionPerformed
        seleccionarAsiento("P019");
    }//GEN-LAST:event_jButtonP019ActionPerformed

    private void jButtonV020ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV020ActionPerformed
        seleccionarAsiento("V020");
    }//GEN-LAST:event_jButtonV020ActionPerformed

    private void jButtonV021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV021ActionPerformed
        seleccionarAsiento("V021");
    }//GEN-LAST:event_jButtonV021ActionPerformed

    private void jButtonP022ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP022ActionPerformed
        seleccionarAsiento("P022");
    }//GEN-LAST:event_jButtonP022ActionPerformed

    private void jButtonP023ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP023ActionPerformed
        seleccionarAsiento("P023");
    }//GEN-LAST:event_jButtonP023ActionPerformed

    private void jButtonV024ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV024ActionPerformed
        seleccionarAsiento("V024");
    }//GEN-LAST:event_jButtonV024ActionPerformed

    private void jButtonV025ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV025ActionPerformed
        seleccionarAsiento("V025");
    }//GEN-LAST:event_jButtonV025ActionPerformed

    private void jButtonP026ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP026ActionPerformed
        seleccionarAsiento("P026");
    }//GEN-LAST:event_jButtonP026ActionPerformed

    private void jButtonP027ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP027ActionPerformed
        seleccionarAsiento("P027");
    }//GEN-LAST:event_jButtonP027ActionPerformed

    private void jButtonV028ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV028ActionPerformed
        seleccionarAsiento("V028");
    }//GEN-LAST:event_jButtonV028ActionPerformed

    private void jButtonV029ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV029ActionPerformed
        seleccionarAsiento("V029");
    }//GEN-LAST:event_jButtonV029ActionPerformed

    private void jButtonP030ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP030ActionPerformed
        seleccionarAsiento("P030");
    }//GEN-LAST:event_jButtonP030ActionPerformed

    private void jButtonP031ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP031ActionPerformed
        seleccionarAsiento("P031");
    }//GEN-LAST:event_jButtonP031ActionPerformed

    private void jButtonV032ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonV032ActionPerformed
        seleccionarAsiento("V032");
    }//GEN-LAST:event_jButtonV032ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        llenarTablaDisponibles();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTableVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVuelosMouseClicked
        jPanelAsientos.setVisible(true);
        mostrarAsientos();
    }//GEN-LAST:event_jTableVuelosMouseClicked

    private void jLabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdminMouseClicked
        ventana.setVisible(false);
        LoginAdmin.visibilidad(true);
    }//GEN-LAST:event_jLabelAdminMouseClicked

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        ventana.setVisible(false);
        LoginCliente.visibilidad(true);
    }//GEN-LAST:event_jButtonComprarActionPerformed

    public void llenarComboCiudades() {
        DefaultComboBoxModel modeloOrigen = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloDestino = new DefaultComboBoxModel();
        List<Ciudad> ciudades = cD.getCiudades();
        modeloOrigen.addElement("Seleccione ciudad de origen");
        jComboBoxOrigen.setModel(modeloOrigen);
        modeloDestino.addElement("Seleccione ciudad de destino");
        jComboBoxDestino.setModel(modeloDestino);
        for (int i = 0; i < ciudades.size(); i++) {
            modeloOrigen.addElement(ciudades.get(i).getNombre());
            jComboBoxOrigen.setModel(modeloOrigen);
            modeloDestino.addElement(ciudades.get(i).getNombre());
            jComboBoxDestino.setModel(modeloDestino);
        }
    }
    
    public void llenarTablaDisponibles() {
        List<Vuelo> vuelos = vD.obtenerVuelos();
        modelo = (DefaultTableModel) jTableVuelos.getModel();
        modelo.setRowCount(0);
        Object[] fila = new Object[modelo.getColumnCount()];
        int i = 0;
        while (i < vuelos.size()) {
            if (!vuelos.get(i).getEstado().equals("c")) {
                fila[0] = vuelos.get(i).getIdVuelo();
                fila[1] = vuelos.get(i).getAerolinea().toUpperCase();
                fila[2] = vuelos.get(i).getTipoAeronave().toUpperCase();
                Ciudad origen = cD.getCiudad(vuelos.get(i).getCiudadOrigen().getIdCiudad());
                fila[3] = origen.getNombre().toUpperCase();
                Ciudad destino = cD.getCiudad(vuelos.get(i).getCiudadDestino().getIdCiudad());
                fila[4] = destino.getNombre().toUpperCase();
                fila[5] = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(vuelos.get(i).getFechaSalida());
                fila[6] = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(vuelos.get(i).getFechaArribo());
                fila[7] = vuelos.get(i).getEstado().toUpperCase();
                modelo.addRow(fila);
            }
            i++;
        }
        filtrarTabla();
    }
    
    private void filtrarTabla() {
        modelo = (DefaultTableModel) jTableVuelos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        jTableVuelos.setRowSorter(tr);
        List<RowFilter<DefaultTableModel, Object>> filtros = new ArrayList<>();
        int i = 0;
        if (!jComboBoxOrigen.getSelectedItem().toString().equals("Seleccione ciudad de origen")) {
            filtros.add(RowFilter.regexFilter(jComboBoxOrigen.getSelectedItem().toString().toUpperCase(),3));
            filtros.set(i, RowFilter.regexFilter(jComboBoxOrigen.getSelectedItem().toString().toUpperCase(),3));
            i++;
        }
        if (!jComboBoxDestino.getSelectedItem().toString().equals("Seleccione ciudad de destino")) {
            filtros.add(RowFilter.regexFilter(jComboBoxDestino.getSelectedItem().toString().toUpperCase(),4));
            filtros.set(i, RowFilter.regexFilter(jComboBoxDestino.getSelectedItem().toString().toUpperCase(),4));
            i++;
        }
        if (jDateChooserFecha.getDate() != null) {
            filtros.add(RowFilter.regexFilter(new SimpleDateFormat("dd/MM/yyyy").format(jDateChooserFecha.getDate()),5));
            filtros.set(i, RowFilter.regexFilter(new SimpleDateFormat("dd/MM/yyyy").format(jDateChooserFecha.getDate()),5));
            i++;
        }
        tr.setRowFilter(RowFilter.andFilter(filtros));
    }
    
    public void mostrarAsientos() {
        pintarBotonAsiento(jButtonV001, "V001");
        pintarBotonAsiento(jButtonP002, "P002");
        pintarBotonAsiento(jButtonP003, "P003");
        pintarBotonAsiento(jButtonV004, "V004");
        pintarBotonAsiento(jButtonV005, "V005");
        pintarBotonAsiento(jButtonP006, "P006");
        pintarBotonAsiento(jButtonP007, "P007");
        pintarBotonAsiento(jButtonV008, "V008");
        pintarBotonAsiento(jButtonV009, "V009");
        pintarBotonAsiento(jButtonP010, "P010");
        pintarBotonAsiento(jButtonP011, "P011");
        pintarBotonAsiento(jButtonV012, "V012");
        pintarBotonAsiento(jButtonV013, "V013");
        pintarBotonAsiento(jButtonP014, "P014");
        pintarBotonAsiento(jButtonP015, "P015");
        pintarBotonAsiento(jButtonV016, "V016");
        pintarBotonAsiento(jButtonV017, "V017");
        pintarBotonAsiento(jButtonP018, "P018");
        pintarBotonAsiento(jButtonP019, "P019");
        pintarBotonAsiento(jButtonV020, "V020");
        pintarBotonAsiento(jButtonV021, "V021");
        pintarBotonAsiento(jButtonP022, "P022");
        pintarBotonAsiento(jButtonP023, "P023");
        pintarBotonAsiento(jButtonV024, "V024");
        pintarBotonAsiento(jButtonV025, "V025");
        pintarBotonAsiento(jButtonP026, "P026");
        pintarBotonAsiento(jButtonP027, "P027");
        pintarBotonAsiento(jButtonV028, "V028");
        pintarBotonAsiento(jButtonV029, "V029");
        pintarBotonAsiento(jButtonP030, "P030");
        pintarBotonAsiento(jButtonP031, "P031");
        pintarBotonAsiento(jButtonV032, "V032");
    }

    public void pintarBotonAsiento(JButton boton, String ubicacion) {
        int fila = jTableVuelos.getSelectedRow();
        String id_aux = jTableVuelos.getValueAt(fila, 0).toString();
        int id = Integer.parseInt(id_aux);
        Vuelo vuelo = vD.buscarVuelo(id);
        Asiento asiento = aD.obtenerAsientosVueloUbicacion(vuelo, ubicacion);
        if (!asiento.getDisponible()) {
            boton.setEnabled(false);
        } else {
            boton.setEnabled(true);
        }
    }
    
    public void seleccionarAsiento(String ubicacion) {
        int fila = jTableVuelos.getSelectedRow();
        String id_aux = jTableVuelos.getValueAt(fila, 0).toString();
        int id = Integer.parseInt(id_aux);
        Vuelo vuelo = vD.buscarVuelo(id);
        Asiento asientoSelec = aD.obtenerAsientosVueloUbicacion(vuelo, ubicacion);
        this.asiento = asientoSelec;
        jLabelPrecio.setText("$"+Float.toString(asiento.getPrecio()));
        jButtonComprar.setEnabled(true);
    }
    
    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
    }
    
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana = new VistaPrincipal();
                ventana.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonP002;
    private javax.swing.JButton jButtonP003;
    private javax.swing.JButton jButtonP006;
    private javax.swing.JButton jButtonP007;
    private javax.swing.JButton jButtonP010;
    private javax.swing.JButton jButtonP011;
    private javax.swing.JButton jButtonP014;
    private javax.swing.JButton jButtonP015;
    private javax.swing.JButton jButtonP018;
    private javax.swing.JButton jButtonP019;
    private javax.swing.JButton jButtonP022;
    private javax.swing.JButton jButtonP023;
    private javax.swing.JButton jButtonP026;
    private javax.swing.JButton jButtonP027;
    private javax.swing.JButton jButtonP030;
    private javax.swing.JButton jButtonP031;
    private javax.swing.JButton jButtonV001;
    private javax.swing.JButton jButtonV004;
    private javax.swing.JButton jButtonV005;
    private javax.swing.JButton jButtonV008;
    private javax.swing.JButton jButtonV009;
    private javax.swing.JButton jButtonV012;
    private javax.swing.JButton jButtonV013;
    private javax.swing.JButton jButtonV016;
    private javax.swing.JButton jButtonV017;
    private javax.swing.JButton jButtonV020;
    private javax.swing.JButton jButtonV021;
    private javax.swing.JButton jButtonV024;
    private javax.swing.JButton jButtonV025;
    private javax.swing.JButton jButtonV028;
    private javax.swing.JButton jButtonV029;
    private javax.swing.JButton jButtonV032;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxOrigen;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelOrigen;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanelAsientos;
    private javax.swing.JPanel jPanelAsientosFondo;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneVuelos;
    private javax.swing.JTable jTableVuelos;
    // End of variables declaration//GEN-END:variables

}