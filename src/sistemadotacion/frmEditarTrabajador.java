
package sistemadotacion;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class frmEditarTrabajador extends javax.swing.JFrame {

    String genero;
    ConectionSistemaDotacion con;
    
    public frmEditarTrabajador() {
        initComponents();
        setLocationRelativeTo(null);
        con= new ConectionSistemaDotacion();
        zapatos();
        sucheros();
        gorras();
        delantales();
        
        cargarColumnas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcTipoDocumento = new javax.swing.JComboBox<>();
        txtNumeroDocumento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jcCiudad = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jcPuntoVenta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcSociedad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jcDescripcion = new javax.swing.JComboBox<>();
        jcSudaderas = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jcTallaSudadera = new javax.swing.JComboBox<>();
        jcTallaDescripcion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadDescripcion = new javax.swing.JTextField();
        txtCantidadSudadera = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCantidadZapatos = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jcTallaZapatos = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jcZapatos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcGorras = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jcTallaGorras = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtCantidadGorras = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jcDelantales = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jcTallaDelantales = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtCantidadDelantales = new javax.swing.JTextField();
        txtCantidadSucheros = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jcTallaSucheros = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jcSucheros = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jctipoInventario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 257, 35));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo de documento:");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jcTipoDocumento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una opción", "CC", "CE", "PPT", "PEP", "PA" }));
        jcTipoDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jcTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 40));
        jPanel1.add(txtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 35));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Numero de documento");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jcEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una opción", "Activo", "Inactivo" }));
        jcEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Hombre");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        buttonGroup1.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Mujer");
        rbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciudad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jcCiudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jcCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una ciudad", "SANTA MARTA", "BARRANQUILLA", "CARTAGENA", "BUCARAMANGA", "MEDELLIN", "MONTERIA", "VALLEDUPAR" }));
        jcCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(jcCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 40));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Punto de venta:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jcPuntoVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcPuntoVenta.setForeground(new java.awt.Color(255, 255, 255));
        jcPuntoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un punto de venta" }));
        jcPuntoVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPuntoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(jcPuntoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 190, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sociedad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jcSociedad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSociedad.setForeground(new java.awt.Color(255, 255, 255));
        jcSociedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una sociedad", "LONG HANG", "PRADO EXPRESS" }));
        jcSociedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jcSociedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSociedadActionPerformed(evt);
            }
        });
        jPanel1.add(jcSociedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de inventario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        jdFechaSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jdFechaSalida.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jdFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 200, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CAMISAS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jcDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 190, 40));

        jcSudaderas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSudaderas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSudaderas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSudaderasActionPerformed(evt);
            }
        });
        jPanel1.add(jcSudaderas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 190, 40));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("SUDADERAS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TALLA");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jcTallaSudadera.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTallaSudadera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el genero" }));
        jPanel1.add(jcTallaSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 190, 40));

        jcTallaDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTallaDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el genero" }));
        jPanel1.add(jcTallaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CANTIDAD CAMISAS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        txtCantidadDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 190, 40));

        txtCantidadSudadera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 190, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("CANTIDAD SUDADERAS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        txtCantidadZapatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 190, 40));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("CANTIDAD ZAPATOS");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, 20));

        jcTallaZapatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 190, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TALLA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        jcZapatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcZapatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcZapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcZapatosActionPerformed(evt);
            }
        });
        jPanel1.add(jcZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 190, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ZAPATOS");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GORRAS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jcGorras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcGorras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcGorras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGorrasActionPerformed(evt);
            }
        });
        jPanel1.add(jcGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 190, 40));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TALLA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, -1));

        jcTallaGorras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 190, 40));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CANTIDAD GORRAS");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, -1, -1));

        txtCantidadGorras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 190, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DELANTALES");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        jcDelantales.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcDelantales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDelantales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDelantalesActionPerformed(evt);
            }
        });
        jPanel1.add(jcDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, 180, 40));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("TALLA");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, -1, -1));

        jcTallaDelantales.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, 180, 40));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CANTIDAD DELANTALES");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, -1, -1));

        txtCantidadDelantales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 180, 40));

        txtCantidadSucheros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCantidadSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 210, 180, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CANTIDAD SUCHEROS");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 180, -1, -1));

        jcTallaSucheros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jcTallaSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 120, 190, 40));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TALLA");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 90, -1, -1));

        jcSucheros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcSucheros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSucheros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSucherosActionPerformed(evt);
            }
        });
        jPanel1.add(jcSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, 190, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SUCHEROS");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        tbConsultas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbConsultas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 1260, 460));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Editar trabajador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 70));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/89944.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 70, 70));

        jctipoInventario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jctipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LONG HANG", "PRADO EXPRESS", "BIOEYZA" }));
        jctipoInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jctipoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(jctipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 190, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de salida:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jcPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPuntoVentaActionPerformed

    }//GEN-LAST:event_jcPuntoVentaActionPerformed

    private void jcSociedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSociedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSociedadActionPerformed

    private void jcDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDescripcionActionPerformed

    }//GEN-LAST:event_jcDescripcionActionPerformed

    private void jcSudaderasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSudaderasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSudaderasActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmPanelEntradas winPanelEntradas= new frmPanelEntradas();
        winPanelEntradas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tbConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultasMouseClicked
        int fila = tbConsultas.getSelectedRow();

    if (fila >= 0) {
        try {
        txtNombre.setText(getCellValueAsString(tbConsultas, fila, 0));
        jcTipoDocumento.setSelectedItem(getCellValueAsString(tbConsultas, fila, 1));
        txtNumeroDocumento.setText(getCellValueAsString(tbConsultas, fila, 2));
        jcEstado.setSelectedItem(getCellValueAsString(tbConsultas, fila, 3));
        genero= getCellValueAsString(tbConsultas, fila, 4);
        actualizarDatosSegunGenero(this.genero);
        jcCiudad.setSelectedItem(getCellValueAsString(tbConsultas, fila, 5));
        jcPuntoVenta.setSelectedItem(getCellValueAsString(tbConsultas, fila, 6));
        jcSociedad.setSelectedItem(getCellValueAsString(tbConsultas, fila, 7));
        jcZapatos.setSelectedItem(getCellValueAsString(tbConsultas, fila, 8));
        jcTallaZapatos.setSelectedItem(getCellValueAsString(tbConsultas, fila, 9));
        txtCantidadZapatos.setText(getCellValueAsString(tbConsultas, fila, 10));
        
        jcGorras.setSelectedItem(getCellValueAsString(tbConsultas, fila, 11));
        jcTallaGorras.setSelectedItem(getCellValueAsString(tbConsultas, fila, 12));
        txtCantidadGorras.setText(getCellValueAsString(tbConsultas, fila, 13));
        jcDelantales.setSelectedItem(getCellValueAsString(tbConsultas, fila, 14));
        jcTallaDelantales.setSelectedItem(getCellValueAsString(tbConsultas, fila, 15));
        txtCantidadDelantales.setText(getCellValueAsString(tbConsultas, fila, 16));
        jcSucheros.setSelectedItem(getCellValueAsString(tbConsultas, fila, 17));
        jcTallaSucheros.setSelectedItem(getCellValueAsString(tbConsultas, fila, 18));
        txtCantidadSucheros.setText(getCellValueAsString(tbConsultas, fila, 19));
        
        if (rbMasculino.isSelected()) {
        jcDescripcion.setSelectedItem(getCellValueAsString(tbConsultas, fila, 20));
        jcTallaDescripcion.setSelectedItem(getCellValueAsString(tbConsultas, fila, 21));
        txtCantidadDescripcion.setText(getCellValueAsString(tbConsultas, fila, 22));
        jcSudaderas.setSelectedItem(getCellValueAsString(tbConsultas, fila, 23));
        jcTallaSudadera.setSelectedItem(getCellValueAsString(tbConsultas, fila, 24));
        txtCantidadSudadera.setText(getCellValueAsString(tbConsultas, fila, 25));
        
    } else if(rbFemenino.isSelected()){
        jcDescripcion.setSelectedItem(getCellValueAsString(tbConsultas, fila, 26));
        jcTallaDescripcion.setSelectedItem(getCellValueAsString(tbConsultas, fila, 27));
        txtCantidadDescripcion.setText(getCellValueAsString(tbConsultas, fila, 28));
        jcSudaderas.setSelectedItem(getCellValueAsString(tbConsultas, fila, 29));
        jcTallaSudadera.setSelectedItem(getCellValueAsString(tbConsultas, fila, 30));
        txtCantidadSudadera.setText(getCellValueAsString(tbConsultas, fila, 31));
    }

        jdFechaSalida.setDate((Date) tbConsultas.getValueAt(fila, 32));
        jctipoInventario.setSelectedItem(getCellValueAsString(tbConsultas,fila, 33));
        

    } catch (Exception ex) {
        ex.printStackTrace();
        mostrarMensaje("Error al obtener valores de la tabla.");
    }
} else {
    JOptionPane.showMessageDialog(rootPane, "Seleccione una fila");
}
    }//GEN-LAST:event_tbConsultasMouseClicked

    private void rbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninoActionPerformed
        if (rbFemenino.isSelected()) {
            actualizarDatosSegunGenero("Mujer");
            genero="Mujer";
        }
    }//GEN-LAST:event_rbFemeninoActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        if (rbMasculino.isSelected()) {
            actualizarDatosSegunGenero("Hombre");

            genero="Hombre";
        }
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDotacionesRetiradas();
        seprarColumnas();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jctipoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jctipoInventarioActionPerformed

    public void cargarColumnas()
    {
        DefaultTableModel modelo = new DefaultTableModel();
    String[] nombreColumnas = {
        "Nombre", "Tipo Documento", "Número Documento","Estado", "Género", "Ciudad", "Punto Venta", "Sociedad",
        "Nombre Z", "Talla Z", "Cantidad Z", 
        "Nombre G", "Talla G", "Cantidad G", 
        "Nombre D", "Talla D", "Cantidad D", 
        "Nombre S", "Talla S", "Cantidad S",
        "Nombre CH", "Talla CH", "Cantidad CH", 
        "Nombre SH", "Talla SH", "Cantidad SH", 
        "Nombre CM", "Talla CM", "Cantidad CM", 
        "Nombre SM", "Talla SM", "Cantidad SM", 
        "Fecha salida"
    };
    modelo.setColumnIdentifiers(nombreColumnas);
    
    tbConsultas.setModel(modelo);
    }
    
    public void mostrarDotacionesRetiradas() {
    DefaultTableModel modelo = new DefaultTableModel();
    String[] nombreColumnas = {
        "Nombre", "Tipo Documento", "Número Documento","Estado", "Género", "Ciudad", "Punto Venta", "Sociedad",
        "Nombre Z", "Talla Z", "Cantidad Z", 
        "Nombre G", "Talla G", "Cantidad G", 
        "Nombre D", "Talla D", "Cantidad D", 
        "Nombre S", "Talla S", "Cantidad S",
        "Nombre CH", "Talla CH", "Cantidad CH", 
        "Nombre SH", "Talla SH", "Cantidad SH", 
        "Nombre CM", "Talla CM", "Cantidad CM", 
        "Nombre SM", "Talla SM", "Cantidad SM", 
        "Fecha salida","Tipo de inventario"
    };
    modelo.setColumnIdentifiers(nombreColumnas);
    try {
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        CallableStatement stmt = (CallableStatement) connection.prepareCall("{call mostrar_datos_trabajador_con_dotacion(?)}");
        
        
        stmt.setString(1,jctipoInventario.getSelectedItem().toString());
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            String nombre = rs.getString("nombre");
            String tipoDocumento = rs.getString("tipo_documento");
            int numeroDocumento = rs.getInt("numero_documento");
            String estado = rs.getString("estado");
            String genero = rs.getString("genero");
            String ciudad = rs.getString("ciudad");
            String puntoVenta = rs.getString("punto_venta_trabajador");
            String sociedad = rs.getString("sociedad");
            String nombreSalidaZapatos = rs.getString("nombre_salida_zapatos");
            String tallaSalidaZapatos = rs.getString("talla_salida_zapatos");
            int cantidadSalidaZapatos = rs.getInt("cantidad_salida_zapatos");       
            String nombreSalidaGorras = rs.getString("nombre_salida_gorras");
            String tallaSalidaGorras = rs.getString("talla_salida_gorras");
            int cantidadSalidaGorras = rs.getInt("cantidad_salida_gorras");
            String nombreSalidaDelantales = rs.getString("nombre_salida_delantales");
            String tallaSalidaDelantales = rs.getString("talla_salida_delantales");
            int cantidadSalidaDelantales = rs.getInt("cantidad_salida_delantales");
            String nombreSalidaSucheros = rs.getString("nombre_salida_sucheros");
            String tallaSalidaSucheros = rs.getString("talla_salida_sucheros");
            int cantidadSalidaSucheros = rs.getInt("cantidad_salida_sucheros");
            String nombreSalidaCamisasHombre = rs.getString("camisa_salida_hombre");
            String tallaSalidaCamisasHombre = rs.getString("talla_camisa_salida_hombre");
            int cantidadSalidaCamisasHombre = rs.getInt("cantidad_camisa_salida_hombre");
            String nombreSalidaSudaderasHombre = rs.getString("sudadera_salida_hombre");
            String tallaSalidaSudaderasHombre = rs.getString("talla_sudadera_salida_hombre");
            int cantidadSalidaSudaderasHombre = rs.getInt("cantidad_sudadera_salida_hombre");
            String nombreSalidaCamisasMujer = rs.getString("camisa_salida_mujer");
            String tallaSalidaCamisasMujer = rs.getString("talla_camisa_salida_mujer");
            int cantidadSalidaCamisasMujer = rs.getInt("cantidad_camisa_salida_mujer");
            String nombreSalidaSudaderasMujer = rs.getString("sudadera_salida_mujer");
            String tallaSalidaSudaderasMujer = rs.getString("talla_sudadera_salida_mujer");
            int cantidadSalidaSudaderasMujer = rs.getInt("cantidad_sudadera_salida_mujer");
            Date fechaSalida= rs.getDate("fecha_salida");
            String tipoInventario = rs.getString("tipo_inventario_trabajador");

            Object[] row = {
                nombre, tipoDocumento, numeroDocumento,estado, genero, ciudad, puntoVenta, sociedad,
                nombreSalidaZapatos, tallaSalidaZapatos, cantidadSalidaZapatos,
                nombreSalidaGorras, tallaSalidaGorras, cantidadSalidaGorras, 
                nombreSalidaDelantales, tallaSalidaDelantales, cantidadSalidaDelantales, 
                nombreSalidaSucheros, tallaSalidaSucheros, cantidadSalidaSucheros,
                nombreSalidaCamisasHombre, tallaSalidaCamisasHombre, cantidadSalidaCamisasHombre,
                nombreSalidaSudaderasHombre, tallaSalidaSudaderasHombre, cantidadSalidaSudaderasHombre,
                nombreSalidaCamisasMujer, tallaSalidaCamisasMujer, cantidadSalidaCamisasMujer,
                nombreSalidaSudaderasMujer, tallaSalidaSudaderasMujer, cantidadSalidaSudaderasMujer,
                fechaSalida,tipoInventario
            };
            modelo.addRow(row);
        }
        stmt.close();
        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(rootPane, "Error");
    }

    tbConsultas.setModel(modelo);
}
        
    private String getCellValueAsString(JTable table, int row, int column) {
    Object value = table.getValueAt(row, column);
    return (value != null) ? value.toString() : "";
}
    
    private void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(rootPane, mensaje);
    }
    
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
    
    private void actualizarDatosSegunGenero(String genero) {
    if (genero.equals("Hombre")) {
        // Lógica para cargar los datos correspondientes al género masculino
        String[] listaDescripcion = {"Seleccione una opción", "CAMISA LONG HANG NEGRA", "CAMISA LONG HANG BLANCA",
                "CAMISA LONG HANG GRIS", "CAMISA LONG HANG ROJAS", "CAMISA MANTENIMIENTO", "SUETER PLAYERAS"};
        String[] listaTallaDescripcion = {"Seleccione una opción", "S", "M", "L", "XL", "XXL"};
        String[] listaSudaderas = {"Seleccione una opción", "SUDADERA LONG HANG NEGRA", "SUDADERA LONG HANG GRIS"};
        String[] listaTallaSudaderas = {"Seleccione una opción", "S", "M", "L", "XL", "XXL"};

        jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
        jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
        jcSudaderas.setModel(new DefaultComboBoxModel<>(listaSudaderas));
        jcTallaSudadera.setModel(new DefaultComboBoxModel<>(listaTallaSudaderas));

        rbMasculino.setSelected(true);// Seleccionar radio button masculino

    } else if (genero.equals("Mujer")) {
        // Lógica para cargar los datos correspondientes al género femenino
        String[] listaDescripcion = {"Seleccione una opción", "CAMISA LONG HANG NEGRA", "CAMISA LONG HANG BLANCA",
                "CAMISA LONG HANG GRIS", "CAMISA LONG HANG ROJAS"};
        String[] listaTallaDescripcion = {"Seleccione una opción", "S", "M", "L", "XL", "XXL"};
        String[] listaSudaderas = {"Seleccione una opción", "SUDADERA LONG HANG NEGRA", "SUDADERA LONG HANG GRIS"};
        String[] listaTallaSudaderas = {"Seleccione una opción", "S", "M", "L", "XL", "XXL"};

        jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
        jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
        jcSudaderas.setModel(new DefaultComboBoxModel<>(listaSudaderas));
        jcTallaSudadera.setModel(new DefaultComboBoxModel<>(listaTallaSudaderas));

        rbFemenino.setSelected(true);
    }
}
    
    public void actualizarDatos() {
    try (Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword())) {
        if (validarCamposTrabajador()) {
            if (validarComboBox()) {
                try {
                    if (validarCamposNumericos() && validarCantidad()) {
                        PreparedStatement stmtInsercion = connection.prepareStatement("CALL actualizarDatos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        java.util.Date fechaSalida = jdFechaSalida.getDate();
                        java.sql.Date sqljdFechaSalida = new java.sql.Date(fechaSalida.getTime());
                        stmtInsercion.setString(1, txtNombre.getText());
                        stmtInsercion.setString(2, jcTipoDocumento.getSelectedItem().toString());
                        stmtInsercion.setInt(3, Integer.parseInt(txtNumeroDocumento.getText()));
                        stmtInsercion.setString(4, jcEstado.getSelectedItem().toString());
                        stmtInsercion.setString(5, genero);
                        stmtInsercion.setString(6, jcCiudad.getSelectedItem().toString());
                        stmtInsercion.setString(7, jcPuntoVenta.getSelectedItem().toString());
                        stmtInsercion.setString(8, jcSociedad.getSelectedItem().toString());
                        stmtInsercion.setDate(9, sqljdFechaSalida);
                        int cantidadTotalARetirar = parseCantidad(txtCantidadSucheros.getText())
                        + parseCantidad(txtCantidadDelantales.getText())
                        + parseCantidad(txtCantidadGorras.getText())
                        + parseCantidad(txtCantidadZapatos.getText())
                        + parseCantidad(txtCantidadDescripcion.getText());
                        stmtInsercion.setInt(10, cantidadTotalARetirar);
                        stmtInsercion.setString(11, jcDescripcion.getSelectedItem().toString());
                        stmtInsercion.setString(12, jcTallaDescripcion.getSelectedItem().toString());
                        stmtInsercion.setInt(13, parseCantidad(txtCantidadDescripcion.getText()));
                        stmtInsercion.setString(14, jcSudaderas.getSelectedItem().toString());
                        stmtInsercion.setString(15, jcTallaSudadera.getSelectedItem().toString());
                        stmtInsercion.setInt(16, parseCantidad(txtCantidadSudadera.getText()));
                        stmtInsercion.setString(17, jcZapatos.getSelectedItem().toString());
                        stmtInsercion.setString(18, jcTallaZapatos.getSelectedItem().toString());
                        stmtInsercion.setInt(19, parseCantidad(txtCantidadZapatos.getText()));
                        stmtInsercion.setString(20, jcGorras.getSelectedItem().toString());
                        stmtInsercion.setString(21, jcTallaGorras.getSelectedItem().toString());
                        stmtInsercion.setInt(22, parseCantidad(txtCantidadGorras.getText()));
                        stmtInsercion.setString(23, jcDelantales.getSelectedItem().toString());
                        stmtInsercion.setString(24, jcTallaDelantales.getSelectedItem().toString());
                        stmtInsercion.setInt(25, parseCantidad(txtCantidadDelantales.getText()));
                        stmtInsercion.setString(26, jcSucheros.getSelectedItem().toString());
                        stmtInsercion.setString(27, jcTallaSucheros.getSelectedItem().toString());
                        stmtInsercion.setInt(28, parseCantidad(txtCantidadSucheros.getText()));
                        stmtInsercion.setString(29, jctipoInventario.getSelectedItem().toString());
                        

                        System.out.println("Llamando a procedimiento almacenado actualizarDatos...");
                        mostrarMensaje("Datos actualizados correctamente");
                        limpiarCampos();

                        stmtInsercion.executeUpdate();
                        stmtInsercion.close();
                    }
                } catch (SQLException ex) {
                    if (!"45000".equals(ex.getSQLState())) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(rootPane, "Error al actualizar la dotación");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
    
    private boolean validarCamposTrabajador(){
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

    private boolean esNumeroEntero(String cadena) {
        if (cadena.isEmpty()) {
            return true;
        }

        return cadena.matches("\\d+");
    }
    
    public void seprarColumnas() {
    int[] minWidths = {200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200};
    TableColumnModel columnModel = tbConsultas.getColumnModel();
    int numColumns = columnModel.getColumnCount(); // Obtener el número de columnas en la tabla
    for (int i = 0; i < minWidths.length && i < numColumns; i++) {
        TableColumn column = columnModel.getColumn(i);
        column.setMinWidth(minWidths[i]);
    }
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
            java.util.logging.Logger.getLogger(frmEditarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEditarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEditarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEditarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEditarTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JComboBox<String> jcZapatos;
    private javax.swing.JComboBox<String> jctipoInventario;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tbConsultas;
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
