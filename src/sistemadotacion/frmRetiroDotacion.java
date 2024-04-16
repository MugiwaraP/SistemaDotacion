
package sistemadotacion;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class frmRetiroDotacion extends javax.swing.JFrame {
    String genero;
    ConectionSistemaDotacion con;
    
    public frmRetiroDotacion() {
        initComponents();
        setLocationRelativeTo(null);
        zapatos();
        sucheros();
        gorras();
        delantales();
        con= new ConectionSistemaDotacion();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jcTipoDocumento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcDescripcion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcTallaDescripcion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadDescripcion = new javax.swing.JTextField();
        txtCantidadZapatos = new javax.swing.JTextField();
        jcTallaZapatos = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcZapatos = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcGorras = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jcTallaGorras = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtCantidadGorras = new javax.swing.JTextField();
        txtCantidadDelantales = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jcTallaDelantales = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jcDelantales = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jcSucheros = new javax.swing.JComboBox<>();
        jcTallaSucheros = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtCantidadSucheros = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        jcPuntoVenta = new javax.swing.JComboBox<>();
        jcCiudad = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jcSociedad = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCantidadSudadera = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jcTallaSudadera = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jcSudaderas = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcTipoInventario = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de inventario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 330, 40));

        jcTipoDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una opción", "CC", "CE", "PPT", "PEP", "PA" }));
        jcTipoDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jcTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de documento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNumeroDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 210, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de documento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jcEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una opción", "Activo", "Inactivo" }));
        jcEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciudad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sociedad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jcDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 190, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CAMISAS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jcTallaDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTallaDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el genero" }));
        jPanel1.add(jcTallaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 190, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CANTIDAD DESCRIPCIÓN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        txtCantidadDescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 180, 40));

        txtCantidadZapatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 190, 40));

        jcTallaZapatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 190, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TALLA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, -1));

        jcZapatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcZapatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcZapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcZapatosActionPerformed(evt);
            }
        });
        jPanel1.add(jcZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 190, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ZAPATOS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("GORRAS");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, -1, -1));

        jcGorras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcGorras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcGorras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGorrasActionPerformed(evt);
            }
        });
        jPanel1.add(jcGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 190, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TALLA");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, -1, -1));

        jcTallaGorras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 190, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CANTIDAD GORRAS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, -1, -1));

        txtCantidadGorras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 460, 190, 40));

        txtCantidadDelantales.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 460, 180, 40));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("CANTIDAD DELANTALES");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 430, -1, -1));

        jcTallaDelantales.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, 190, 40));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TALLA");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 320, -1, -1));

        jcDelantales.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcDelantales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDelantales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDelantalesActionPerformed(evt);
            }
        });
        jPanel1.add(jcDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 230, 190, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DELANTALES");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 200, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SUCHEROS");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 200, -1, -1));

        jcSucheros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSucheros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSucheros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSucherosActionPerformed(evt);
            }
        });
        jPanel1.add(jcSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 230, 190, 40));

        jcTallaSucheros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 350, 190, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CANTIDAD SUCHEROS");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 430, -1, -1));

        txtCantidadSucheros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 460, 180, 40));

        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Hombre");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        buttonGroup1.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Mujer");
        rbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jdFechaSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jdFechaSalida.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jdFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 230, 40));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Punto de venta:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        btnRetirar.setBackground(new java.awt.Color(204, 255, 204));
        btnRetirar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(0, 0, 0));
        btnRetirar.setText("Retirar Dotacion");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 190, 60));

        jcPuntoVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcPuntoVenta.setForeground(new java.awt.Color(255, 255, 255));
        jcPuntoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un punto de venta" }));
        jcPuntoVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPuntoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(jcPuntoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 230, 40));

        jcCiudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jcCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una ciudad", "SANTA MARTA", "BARRANQUILLA", "CARTAGENA", "BUCARAMANGA", "MEDELLIN", "MONTERIA", "VALLEDUPAR" }));
        jcCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(jcCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 210, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nombre:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jcSociedad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcSociedad.setForeground(new java.awt.Color(255, 255, 255));
        jcSociedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una sociedad", "LONG HANG", "PRADO EXPRESS" }));
        jcSociedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcSociedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSociedadActionPerformed(evt);
            }
        });
        jPanel1.add(jcSociedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 230, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla1111111.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 800, 140));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("CANTIDAD ZAPATOS");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, -1, -1));

        txtCantidadSudadera.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCantidadSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 190, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("CANTIDAD SUDADERAS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        jcTallaSudadera.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTallaSudadera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el genero" }));
        jPanel1.add(jcTallaSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 190, 40));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TALLA");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        jcSudaderas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSudaderas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSudaderas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSudaderasActionPerformed(evt);
            }
        });
        jPanel1.add(jcSudaderas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 190, 40));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("SUDADERAS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("TALLA");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de salida:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jcTipoInventario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTipoInventario.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LONG HANG", "PRADO EXPRESS", "BIOEYZA" }));
        jcTipoInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jcTipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 160, 40));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDocumentoActionPerformed

    private void jcDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDescripcionActionPerformed

    }//GEN-LAST:event_jcDescripcionActionPerformed

    private void jcZapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcZapatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcZapatosActionPerformed

    private void jcGorrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGorrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGorrasActionPerformed

    private void jcDelantalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDelantalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDelantalesActionPerformed

    private void jcSucherosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSucherosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSucherosActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        if (rbMasculino.isSelected()) {

            String listaDescripcion [] = {"Seleccione una opción","CAMISA LONG HANG NEGRA","CAMISA LONG HANG BLANCA",
                "CAMISA LONG HANG GRIS","CAMISA LONG HANG ROJAS","CAMISA MANTENIMIENTO","SUETER PLAYERAS"};

            String listaTallaDescripcion [] = {"Seleccione una opción","S","M","L","XL","XXL"};

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
            
            String listaSudaderas [] = {"Seleccione una opción","SUDADERA LONG HANG NEGRA","SUDADERA LONG HANG GRIS"};

            String listaTallaSudaderas [] = {"Seleccione una opción","S","M","L","XL","XXL"};

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
            
            jcSudaderas.setModel(new DefaultComboBoxModel<>(listaSudaderas));
            jcTallaSudadera.setModel(new DefaultComboBoxModel<>(listaTallaSudaderas));

            genero = "Hombre";
        }
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninoActionPerformed
        if (rbFemenino.isSelected()) {

            String listaDescripcion [] = {"Seleccione una opción","CAMISA LONG HANG NEGRA","CAMISA LONG HANG BLANCA",
                "CAMISA LONG HANG GRIS","CAMISA LONG HANG ROJAS"};

            String listaTallaDescripcion [] = {"Seleccione una opción","S","M","L","XL","XXL"};

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
            
            String listaSudaderas [] = {"Seleccione una opción","SUDADERA LONG HANG NEGRA","SUDADERA LONG HANG GRIS"};

            String listaTallaSudaderas [] = {"Seleccione una opción","S","M","L","XL","XXL"};

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
            
            jcSudaderas.setModel(new DefaultComboBoxModel<>(listaSudaderas));
            jcTallaSudadera.setModel(new DefaultComboBoxModel<>(listaTallaSudaderas));

            genero = "Mujer";
        }
    }//GEN-LAST:event_rbFemeninoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmPanelEntradas winPanelEntradas= new frmPanelEntradas();
        winPanelEntradas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        retirarDotacion();
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void jcPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPuntoVentaActionPerformed

    }//GEN-LAST:event_jcPuntoVentaActionPerformed

    private void jcCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiudadActionPerformed
               String ciudadSeleccionada = (String) jcCiudad.getSelectedItem();
        
        jcPuntoVenta.removeAllItems();
        
            if (ciudadSeleccionada.equals("SANTA MARTA")) {
                
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("ADMINISTRATIVO");
            jcPuntoVenta.addItem("ARRECIFE");
            jcPuntoVenta.addItem("CENTRO");
            jcPuntoVenta.addItem("OCEAN MALL");
            jcPuntoVenta.addItem("BUENA VISTA SANTA MARTA");
            
        } else if (ciudadSeleccionada.equals("BARRANQUILLA")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("UNICO");
            jcPuntoVenta.addItem("BUENA VISTA BARRANQUILLA");
            jcPuntoVenta.addItem("VILLA COUNTRY");
            jcPuntoVenta.addItem("PORTAL DEL PRADO");
            jcPuntoVenta.addItem("PLAZA DEL SOL");
            jcPuntoVenta.addItem("VIVA");
            jcPuntoVenta.addItem("CARNAVAL");
            jcPuntoVenta.addItem("NUESTRO ATLANTICO");
            jcPuntoVenta.addItem("ALEGRA");
            
        } else if (ciudadSeleccionada.equals("CARTAGENA")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("CARIBE PLAZA");
            jcPuntoVenta.addItem("MALL PLAZA");
            jcPuntoVenta.addItem("PLAZA BOCA GRANDE");
        }
            
        else if (ciudadSeleccionada.equals("BUCARAMANGA")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("CACIQUE");
            jcPuntoVenta.addItem("MEGA MALL");
            jcPuntoVenta.addItem("DE LA CUESTA");
        }
            
        else if (ciudadSeleccionada.equals("MEDELLIN")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("PREMIUM PLAZA");
            jcPuntoVenta.addItem("SANTA FE");
            jcPuntoVenta.addItem("MAYORCA");
        }  
            
        else if (ciudadSeleccionada.equals("MONTERIA")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("ALAMEDA");
            jcPuntoVenta.addItem("BUENA VISTA MONTERIA");
            jcPuntoVenta.addItem("NUESTRO");
        }  
            
        else if (ciudadSeleccionada.equals("VALLEDUPAR")) {
            
            jcPuntoVenta.addItem("Seleccione un punto de venta");
            jcPuntoVenta.addItem("GUATAPURI");
            jcPuntoVenta.addItem("MAYALES");
        } 
    }//GEN-LAST:event_jcCiudadActionPerformed

    private void jcSociedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSociedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSociedadActionPerformed

    private void jcSudaderasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSudaderasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSudaderasActionPerformed

    public void zapatos()
    {
        String listaZapatos [] = {"Seleccione una opción","ZAPATOS BLANCOS","ZAPATOS NEGROS"};

                String listaTallaZapatos [] = {"Seleccione una opción","36","37","38","39","40","41","42","43","44","45"};

                jcZapatos.setModel(new DefaultComboBoxModel<>(listaZapatos));
                jcTallaZapatos.setModel(new DefaultComboBoxModel<>(listaTallaZapatos));

    }

    public void gorras()
    {
        String listaGorras [] = {"Seleccione una opción","GORRA NEGRA","GORRA GRIS"};

                String listaTallaGorras [] = {"Seleccione una opción","UNICA"};

                jcGorras.setModel(new DefaultComboBoxModel<>(listaGorras));
                jcTallaGorras.setModel(new DefaultComboBoxModel<>(listaTallaGorras));
    }

    public void delantales()
    {

        String listaDelantales [] = {"Seleccione una opción","DELANTAL NEGRO","DELANTAL GRIS"};

                String listaTallaDelantales [] = {"Seleccione una opción","UNICA"};

                jcDelantales.setModel(new DefaultComboBoxModel<>(listaDelantales));
                jcTallaDelantales.setModel(new DefaultComboBoxModel<>(listaTallaDelantales));

    }

    public void sucheros()
    {
            String listaSuchero [] = {"Seleccione una opción","SUCHERO NEGRO","SUCHERO GRIS"};

                String listaTallaSuchero [] = {"Seleccione una opción","S","M","L"};

                jcSucheros.setModel(new DefaultComboBoxModel<>(listaSuchero));
                jcTallaSucheros.setModel(new DefaultComboBoxModel<>(listaTallaSuchero));
    }

    public void retirarDotacion() {
        try (Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword())) {
            if (validarCamposTrabajador()) {

               if (validarComboBox()) {
                try {

                    if (validarCamposNumericos() && validarCantidad()) {

                        if (mostrarMensajesRetirada()) {

                        CallableStatement stmt = (CallableStatement) connection.prepareCall("{call retiro_dotacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

                        java.util.Date fechaSalida = jdFechaSalida.getDate();
                        java.sql.Date sqljdFechaSalida = new java.sql.Date(fechaSalida.getTime());
                        stmt.setString(1, txtNombre.getText());
                        stmt.setString(2, jcTipoDocumento.getSelectedItem().toString());
                        stmt.setInt(3, Integer.parseInt(txtNumeroDocumento.getText()));
                        stmt.setString(4, jcEstado.getSelectedItem().toString());
                        stmt.setString(5, genero);
                        stmt.setString(6, jcCiudad.getSelectedItem().toString());
                        stmt.setString(7, jcPuntoVenta.getSelectedItem().toString());
                        stmt.setString(8, jcSociedad.getSelectedItem().toString());
                        stmt.setDate(9, sqljdFechaSalida);
                        int cantidadTotalARetirar = parseCantidad(txtCantidadSucheros.getText())
                        + parseCantidad(txtCantidadDelantales.getText())
                        + parseCantidad(txtCantidadGorras.getText())
                        + parseCantidad(txtCantidadZapatos.getText())
                        + parseCantidad(txtCantidadDescripcion.getText());
                        stmt.setInt(10, cantidadTotalARetirar);
                        stmt.setString(11, jcDescripcion.getSelectedItem().toString());
                        stmt.setString(12, jcTallaDescripcion.getSelectedItem().toString());
                        stmt.setInt(13, parseCantidad(txtCantidadDescripcion.getText()));
                        stmt.setString(14, jcSudaderas.getSelectedItem().toString());
                        stmt.setString(15, jcTallaSudadera.getSelectedItem().toString());
                        stmt.setInt(16, parseCantidad(txtCantidadSudadera.getText()));
                        stmt.setString(17, jcZapatos.getSelectedItem().toString());
                        stmt.setString(18, jcTallaZapatos.getSelectedItem().toString());
                        stmt.setInt(19, parseCantidad(txtCantidadZapatos.getText()));
                        stmt.setString(20, jcGorras.getSelectedItem().toString());
                        stmt.setString(21, jcTallaGorras.getSelectedItem().toString());
                        stmt.setInt(22, parseCantidad(txtCantidadGorras.getText()));
                        stmt.setString(23, jcDelantales.getSelectedItem().toString());
                        stmt.setString(24, jcTallaDelantales.getSelectedItem().toString());
                        stmt.setInt(25, parseCantidad(txtCantidadDelantales.getText()));
                        stmt.setString(26, jcSucheros.getSelectedItem().toString());
                        stmt.setString(27, jcTallaSucheros.getSelectedItem().toString());
                        stmt.setInt(28, parseCantidad(txtCantidadSucheros.getText()));
                        stmt.setString(29, jcTipoInventario.getSelectedItem().toString());

                        System.out.println("Llamando a procedimiento almacenado retiro_dotacion...");
                        limpiarCampos();


                        stmt.execute();
                        stmt.close();
                        connection.close();
                    }
                }

                } catch (SQLException ex) {
                if (!"45000".equals(ex.getSQLState())) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, "Error al retirar dotación");
                } else {
                    JOptionPane.showMessageDialog(rootPane,ex.getMessage());
                    System.out.println(ex);
                    }
                }
            }
        }
    } catch (SQLException ex) {
        mostrarMensaje("Error al establecer la conexión con la base de datos: " + ex.getMessage());
    }
    }


    private int parseCantidad(String cantidad) {
        try {
            if (!cantidad.isEmpty()) {
                return Integer.parseInt(cantidad);
            } else {

                return 0; 
            }
        } catch (NumberFormatException e) {

            return 0; 
        }
    }

    private boolean validarCamposNumericos() {
        String cantidadDescipcion = txtCantidadDescripcion.getText();
        String cantidadZapatos = txtCantidadZapatos.getText();
        String cantidadGorras = txtCantidadGorras.getText();
        String cantidadDelantales = txtCantidadDelantales.getText();
        String cantidadSucheros = txtCantidadSucheros.getText();
        String cantidadSudadera = txtCantidadSudadera.getText();

        if (!esNumeroEntero(cantidadDescipcion) ||
            !esNumeroEntero(cantidadZapatos) ||
            !esNumeroEntero(cantidadGorras) ||
            !esNumeroEntero(cantidadDelantales) ||
            !esNumeroEntero(cantidadSucheros)||
            !esNumeroEntero(cantidadSudadera)) {
            mostrarMensaje("Los campos de cantidad solo permiten números enteros");
            return false;
        }

        return true;
    }

    private boolean esNumeroEntero(String cadena) {
        if (cadena.isEmpty()) {
            return true;
        }

        return cadena.matches("\\d+");
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(rootPane, mensaje);
    }

    private boolean validarCantidad(){
        if (txtCantidadDescripcion.getText().isEmpty() 
             &&
                txtCantidadSudadera.getText().isEmpty()
                && txtCantidadGorras.getText().isEmpty() 
                && txtCantidadZapatos.getText().isEmpty() 
                && txtCantidadDelantales.getText().isEmpty() 
                && txtCantidadSucheros.getText().isEmpty()
                && txtCantidadSucheros.getText().isEmpty()) {

            mostrarMensaje("Al menos digite un campo de cantidad");
            return false;

        }
        return true;
    }

    private boolean validarCamposTrabajador()
    {
        if (txtNombre.getText().isEmpty()) {
            mostrarMensaje("Campo de nombre vacio");
            return false;
        }
        if (jcTipoDocumento.getSelectedItem().equals("Escoja una opción")) {
            mostrarMensaje("Escoja un tipo de documento");
            return false;
        }
        if (txtNumeroDocumento.getText().isEmpty()) {
            mostrarMensaje("Campo de numero de documento vacio");
            return false;
        }
        if (jcEstado.getSelectedItem().equals("Escoja una opción")) {
            mostrarMensaje("Campo de estado vacio");
            return false;
        }
        if (!rbFemenino.isSelected() && !rbMasculino.isSelected()) {
            mostrarMensaje("Escoja un tipo de genero");
            return false;
        }
        if (jcCiudad.getSelectedItem().equals("Seleccione una ciudad")) {
            mostrarMensaje("Campo de ciudad no seleccionado");
            return false;
        }
        if (jcPuntoVenta.getSelectedItem().equals("Seleccione un punto de venta")) {
            mostrarMensaje("Campo de punto de venta no seleccionado");
            return false;
        }

        if (jcSociedad.getSelectedItem().equals("Seleccione una sociedad")) {
            mostrarMensaje("Campo de soceidad no seleccionado");
            return false;
        }
        if (jdFechaSalida.getDate()==null) {
            mostrarMensaje("Fecha de salida vacia");
            return false;
        }


        return true;
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtNumeroDocumento.setText("");
        jcTipoDocumento.setSelectedIndex(0);
        jcEstado.setSelectedIndex(0);
        jcCiudad.setSelectedIndex(0);
        jcSociedad.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        jdFechaSalida.setDate(null);     
        txtCantidadDescripcion.setText("");
        txtCantidadZapatos.setText("");
        txtCantidadGorras.setText("");
        txtCantidadDelantales.setText("");
        txtCantidadSucheros.setText("");
        txtCantidadSudadera.setText("");
        jcDescripcion.setSelectedIndex(0);
        jcSudaderas.setSelectedIndex(0);
        jcTallaDescripcion.setSelectedIndex(0);
        jcTallaSudadera.setSelectedIndex(0);
        jcZapatos.setSelectedIndex(0);
        jcTallaZapatos.setSelectedIndex(0);
        jcGorras.setSelectedIndex(0);
        jcTallaGorras.setSelectedIndex(0);
        jcDelantales.setSelectedIndex(0);
        jcTallaDelantales.setSelectedIndex(0);
        jcSucheros.setSelectedIndex(0);
        jcTallaSucheros.setSelectedIndex(0);
    }

    private boolean validarComboBox() {
        String Descripcion = jcDescripcion.getSelectedIndex() == 0 ? "Seleccione una opción" : jcDescripcion.getSelectedItem().toString();
        String tallaDescripcion = jcTallaDescripcion.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaDescripcion.getSelectedItem().toString();
        String Sudadera = jcSudaderas.getSelectedIndex() == 0 ? "Seleccione una opción" : jcSudaderas.getSelectedItem().toString();
        String tallaSudadera = jcTallaSudadera.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaSudadera.getSelectedItem().toString();
        String Gorra = jcGorras.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaGorras.getSelectedItem().toString();
        String tallaGorra = jcTallaGorras.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaGorras.getSelectedItem().toString();
        String Zapatos = jcZapatos.getSelectedIndex() == 0 ? "Seleccione una opción" : jcZapatos.getSelectedItem().toString();
        String zapatosTalla = jcTallaZapatos.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaZapatos.getSelectedItem().toString();
        String Delantales = jcDelantales.getSelectedIndex() == 0 ? "Seleccione una opción" : jcDelantales.getSelectedItem().toString();
        String delantalesTalla = jcTallaDelantales.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaDelantales.getSelectedItem().toString();
        String Sucheros = jcSucheros.getSelectedIndex() == 0 ? "Seleccione una opción" : jcSucheros.getSelectedItem().toString();
        String sucherosTalla = jcTallaSucheros.getSelectedIndex() == 0 ? "Seleccione una opción" : jcTallaSucheros.getSelectedItem().toString();

        if (("Seleccione una opción".equals(Descripcion) || "Seleccione una opción".equals(tallaDescripcion)) && ("Seleccione una opción".equals(Sudadera) || "Seleccione una opción".equals(tallaSudadera))
            && ("Seleccione una opción".equals(Gorra) || "Seleccione una opción".equals(tallaGorra)) && ("Seleccione una opción".equals(Zapatos) || "Seleccione una opción".equals(zapatosTalla))
            && ("Seleccione una opción".equals(Delantales) || "Seleccione una opción".equals(delantalesTalla)) && ("Seleccione una opción".equals(Sucheros) || "Seleccione una opción".equals(sucherosTalla))) {
            mostrarMensaje("Alguna opción no está seleccionada de la dotacion, Por favor seleccione una opción en alguna dotacion que desee retirar");
            return false;
        }
        return true;
    }


private boolean mostrarMensajesRetirada() {
    boolean retiradaExitosa = true; 
    StringBuilder mensaje = new StringBuilder("Se han retirado los siguientes elementos:\n");

    String tipoInventarioSeleccionado = jcTipoInventario.getSelectedItem().toString();

    if (rbFemenino.isSelected()) {
        // Lógica para camisas de mujer
        if (jcDescripcion.getSelectedIndex() != 0 && jcTallaDescripcion.getSelectedIndex() != 0 && !txtCantidadDescripcion.getText().isEmpty()) {
            if (!validarCantidadPorGenero("Mujer", "Camisa", jcTallaDescripcion.getSelectedItem().toString(), Integer.parseInt(txtCantidadDescripcion.getText()), tipoInventarioSeleccionado)) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Camisas Mujer\n");
            }
        }

        // Lógica para sudaderas de mujer
        if (jcSudaderas.getSelectedIndex() != 0 && jcTallaSudadera.getSelectedIndex() != 0 && !txtCantidadSudadera.getText().isEmpty()) {
            if (!validarCantidadPorGenero("Mujer", "Sudadera", jcTallaSudadera.getSelectedItem().toString(), Integer.parseInt(txtCantidadSudadera.getText()), tipoInventarioSeleccionado)) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Sudaderas Mujer\n");
            }
        }
    } else if (rbMasculino.isSelected()) {
        // Lógica para camisas de hombre
        if (jcDescripcion.getSelectedIndex() != 0 && jcTallaDescripcion.getSelectedIndex() != 0 && !txtCantidadDescripcion.getText().isEmpty()) {
            if (!validarCantidadPorGenero("Hombre", "Camisa", jcTallaDescripcion.getSelectedItem().toString(), Integer.parseInt(txtCantidadDescripcion.getText()), tipoInventarioSeleccionado)) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Camisas Hombre\n");
            }
        }

        // Lógica para sudaderas de hombre
        if (jcSudaderas.getSelectedIndex() != 0 && jcTallaSudadera.getSelectedIndex() != 0 && !txtCantidadSudadera.getText().isEmpty()) {
            if (!validarCantidadPorGenero("Hombre", "Sudadera", jcTallaSudadera.getSelectedItem().toString(), Integer.parseInt(txtCantidadSudadera.getText()), tipoInventarioSeleccionado)) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Sudaderas Hombre\n");
            }
        }
    }

        // Lógica para zapatos
        if (jcZapatos.getSelectedIndex() != 0 && jcTallaZapatos.getSelectedIndex() != 0 && !txtCantidadZapatos.getText().isEmpty()) {
            if (!validarCantidad("Zapatos", jcZapatos.getSelectedItem().toString(), jcTallaZapatos.getSelectedItem().toString(), Integer.parseInt(txtCantidadZapatos.getText()), jcTipoInventario.getSelectedItem().toString())) {
            retiradaExitosa = false; 
            } else {
                mensaje.append("- Zapatos\n");
            }

        }

        // Lógica para gorras
        if (jcGorras.getSelectedIndex() != 0 && jcTallaGorras.getSelectedIndex() != 0 && !txtCantidadGorras.getText().isEmpty()) {
            if (!validarCantidad("Gorras", jcGorras.getSelectedItem().toString(), jcTallaGorras.getSelectedItem().toString(), Integer.parseInt(txtCantidadGorras.getText()),jcTipoInventario.getSelectedItem().toString())) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Gorras\n");
            }
        }

        // Lógica para delantales
        if (jcDelantales.getSelectedIndex() != 0 && jcTallaDelantales.getSelectedIndex() != 0 && !txtCantidadDelantales.getText().isEmpty()) {
            if (!validarCantidad("Delantales", jcDelantales.getSelectedItem().toString(), jcTallaDelantales.getSelectedItem().toString(), Integer.parseInt(txtCantidadDelantales.getText()),jcTipoInventario.getSelectedItem().toString())) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Delantales\n");
            }
        }

        // Lógica para sucheros
        if (jcSucheros.getSelectedIndex() != 0 && jcTallaSucheros.getSelectedIndex() != 0 && !txtCantidadSucheros.getText().isEmpty()) {
            if (!validarCantidad("Sucheros", jcSucheros.getSelectedItem().toString(), jcTallaSucheros.getSelectedItem().toString(), Integer.parseInt(txtCantidadSucheros.getText()),jcTipoInventario.getSelectedItem().toString())) {
                retiradaExitosa = false; 
            } else {
                mensaje.append("- Sucheros\n");
            }
        }

        if (retiradaExitosa) {
            mostrarMensaje(mensaje.toString());
        } else {
            mostrarMensaje("No hay suficiente dotación disponible para realizar la retirada.");
        }

        return retiradaExitosa;
    }
    
private boolean validarCantidad(String elemento, String nombre, String talla, int cantidad, String tipoInventario) {
    boolean cantidadValida = false;
    String query = "";

    switch(elemento) {
        case "Zapatos":
            query = "SELECT cantidad FROM Zapatos WHERE nombre = ? AND talla = ? AND nombre_tipo_inventario = ?";
            break;
        case "Gorras":
            query = "SELECT cantidad FROM Gorras WHERE nombre = ? AND talla = ? AND nombre_tipo_inventario = ?";
            break;
        case "Delantales":
            query = "SELECT cantidad FROM Delantales WHERE nombre = ? AND talla = ? AND nombre_tipo_inventario = ?";
            break;
        case "Sucheros":
            query = "SELECT cantidad FROM Sucheros WHERE nombre = ? AND talla = ? AND nombre_tipo_inventario = ?";
            break;
    }

    try (Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());
         PreparedStatement stmt = connection.prepareStatement(query)) {

        stmt.setString(1, nombre);
        stmt.setString(2, talla);
        stmt.setString(3, tipoInventario); // Agregamos el tipo de inventario como parámetro

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int cantidadDisponible = rs.getInt("cantidad");
                if (cantidadDisponible >= cantidad) {
                    cantidadValida = true;
                }
            } else {
                // No se encontraron registros, por lo que no hay disponibilidad para la talla especificada
                mostrarMensaje("No hay disponibilidad para la talla de " + elemento.toLowerCase() + " especificada en el tipo de inventario " + tipoInventario);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        mostrarMensaje("Error al verificar la disponibilidad: " + ex.getMessage());
    }

    return cantidadValida;
}




private boolean validarCantidadPorGenero(String genero, String nombre, String talla, int cantidad, String tipoInventario) {
    boolean cantidadValida = false;
    String query = "";

    // Determinar la tabla y las columnas adecuadas según el tipo de prenda
    switch (nombre) {
        case "Camisa":
            query = "SELECT cantidad_camisa_" + genero.toLowerCase() + " FROM Camisas_" + genero + " WHERE camisa_nombre_" + genero.toLowerCase() + " = ? AND talla_camisa_" + genero.toLowerCase() + " = ? AND nombre_tipo_inventario = ?";
            break;
        case "Sudadera":
            query = "SELECT cantidad_sudadera_" + genero.toLowerCase() + " FROM Sudaderas_" + genero + " WHERE sudadera_nombre_" + genero.toLowerCase() + " = ? AND talla_sudadera_" + genero.toLowerCase() + " = ? AND nombre_tipo_inventario = ?";
            break;
        default:
            break;
    }

    try (Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());
         PreparedStatement stmt = connection.prepareStatement(query)) {

        String nombreSeleccionado = "";
        String tallaSeleccionada = "";

        if (nombre.equals("Camisa")) {
            nombreSeleccionado = jcDescripcion.getSelectedItem().toString();
            tallaSeleccionada = jcTallaDescripcion.getSelectedItem().toString();
        } else if (nombre.equals("Sudadera")) {
            nombreSeleccionado = jcSudaderas.getSelectedItem().toString();
            tallaSeleccionada = jcTallaSudadera.getSelectedItem().toString();
        }


        stmt.setString(1, nombreSeleccionado);
        stmt.setString(2, tallaSeleccionada);
        stmt.setString(3, tipoInventario);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int cantidadDisponible = rs.getInt(1);
                // Verificar si hay suficiente cantidad disponible de la prenda
                if (cantidadDisponible >= cantidad) {
                    cantidadValida = true;
                } else {
                    mostrarMensaje("No hay suficientes " + nombreSeleccionado.toLowerCase() + " disponibles en talla " + tallaSeleccionada);
                }
            } else {
                mostrarMensaje("No hay disponibilidad para la dotación de " + genero.toLowerCase() + " con nombre " + nombre.toLowerCase() + " y talla " + talla);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        mostrarMensaje("Error al verificar la disponibilidad: " + ex.getMessage());
    }
    return cantidadValida;
}


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
            java.util.logging.Logger.getLogger(frmRetiroDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRetiroDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRetiroDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRetiroDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRetiroDotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcCiudad;
    private javax.swing.JComboBox<String> jcDelantales;
    private javax.swing.JComboBox<String> jcDescripcion;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcGorras;
    private javax.swing.JComboBox<String> jcPuntoVenta;
    private javax.swing.JComboBox<String> jcSociedad;
    private javax.swing.JComboBox<String> jcSucheros;
    private javax.swing.JComboBox<String> jcSudaderas;
    private javax.swing.JComboBox<String> jcTallaDelantales;
    private javax.swing.JComboBox<String> jcTallaDescripcion;
    private javax.swing.JComboBox<String> jcTallaGorras;
    private javax.swing.JComboBox<String> jcTallaSucheros;
    private javax.swing.JComboBox<String> jcTallaSudadera;
    private javax.swing.JComboBox<String> jcTallaZapatos;
    private javax.swing.JComboBox<String> jcTipoDocumento;
    private javax.swing.JComboBox<String> jcTipoInventario;
    private javax.swing.JComboBox<String> jcZapatos;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtCantidadDelantales;
    private javax.swing.JTextField txtCantidadDescripcion;
    private javax.swing.JTextField txtCantidadGorras;
    private javax.swing.JTextField txtCantidadSucheros;
    private javax.swing.JTextField txtCantidadSudadera;
    private javax.swing.JTextField txtCantidadZapatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDocumento;
    // End of variables declaration//GEN-END:variables
}
