package sistemadotacion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class frmPanelEntradas extends javax.swing.JFrame {
    
    ConectionSistemaDotacion con;   
    
    private String genero;
    
    public frmPanelEntradas() {
        initComponents();
        setLocationRelativeTo(null);
        con= new ConectionSistemaDotacion();
        zapatos();
        gorras();
        delantales();
        sucheros();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbDama = new javax.swing.JRadioButton();
        rbHombre = new javax.swing.JRadioButton();
        jcDescripcion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcTallaDescripcion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jcTallaZapatos = new javax.swing.JComboBox<>();
        jcZapatos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadZapatos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcGorras = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcTallaGorras = new javax.swing.JComboBox<>();
        jcTallaDelantales = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jcDelantales = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCantidadGorras = new javax.swing.JTextField();
        txtCantidadDelantales = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCantidadSucheros = new javax.swing.JTextField();
        jcTallaSucheros = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jcSucheros = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jcSudaderas = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jcTallaSudadera = new javax.swing.JComboBox<>();
        txtCantidadSudaderas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jctipoInventario = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD SUSADERAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        bgSexo.add(rbDama);
        rbDama.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbDama.setForeground(new java.awt.Color(255, 255, 255));
        rbDama.setText("Dama");
        rbDama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDamaActionPerformed(evt);
            }
        });
        jPanel1.add(rbDama, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        bgSexo.add(rbHombre);
        rbHombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbHombre.setText("Hombre");
        rbHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHombreActionPerformed(evt);
            }
        });
        jPanel1.add(rbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        jcDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("GENERO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TIPO DE INVENTARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, -1, -1));

        jcTallaDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcTallaDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 220, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TALLA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        txtCantidadDescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 210, 50));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 140, 60));

        jcTallaZapatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaZapatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 220, 50));

        jcZapatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcZapatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcZapatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcZapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcZapatosActionPerformed(evt);
            }
        });
        jPanel1.add(jcZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 220, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TALLA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SUDADERAS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CANTIDAD ZAPATOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        txtCantidadZapatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadZapatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 220, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GORRAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

        jcGorras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcGorras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcGorras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcGorras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGorrasActionPerformed(evt);
            }
        });
        jPanel1.add(jcGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 220, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TALLA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        jcTallaGorras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaGorras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 220, 50));

        jcTallaDelantales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaDelantales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 220, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TALLA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 320, -1, -1));

        jcDelantales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcDelantales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcDelantales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcDelantales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDelantalesActionPerformed(evt);
            }
        });
        jPanel1.add(jcDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 220, 50));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ENTRADA DE DOTACION");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CANTIDAD GORRAS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        txtCantidadGorras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadGorras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadGorras, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 210, 50));

        txtCantidadDelantales.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadDelantales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadDelantales, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, 220, 50));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CANTIDAD DELANTALES");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CANTIDAD SUCHEROS");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 430, -1, -1));

        txtCantidadSucheros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadSucheros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 460, 210, 50));

        jcTallaSucheros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaSucheros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 360, 220, 50));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TALLA");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, -1, -1));

        jcSucheros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcSucheros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSucheros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcSucheros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSucherosActionPerformed(evt);
            }
        });
        jPanel1.add(jcSucheros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 240, 220, 50));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SUCHEROS");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla1111111.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 800, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura_de_pantalla_2024-02-06_152027-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, -1, 480));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("DELANTALES");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CAMISAS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jcSudaderas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcSudaderas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcSudaderas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jcSudaderas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSudaderasActionPerformed(evt);
            }
        });
        jPanel1.add(jcSudaderas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 220, 50));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TALLA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jcTallaSudadera.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcTallaSudadera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jcTallaSudadera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jcTallaSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 220, 50));

        txtCantidadSudaderas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCantidadSudaderas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(txtCantidadSudaderas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 210, 50));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CANTIDAD DESCRIPCIÓN");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jctipoInventario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jctipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LONG HANG", "PRADO EXPRESS", "BIOEYZA" }));
        jctipoInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jctipoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(jctipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 220, 50));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ZAPATOS");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem1.setText("Mostrar Inventario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem2.setText("Retirar Dotación");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem4.setText("Editar trabajador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem3.setText("Consultar trabajadores y puntos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcSucherosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSucherosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSucherosActionPerformed

    private void jcDelantalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDelantalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDelantalesActionPerformed

    private void jcGorrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGorrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGorrasActionPerformed

    private void jcZapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcZapatosActionPerformed
        
    }//GEN-LAST:event_jcZapatosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ingresarDotacion();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jcDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDescripcionActionPerformed

    }//GEN-LAST:event_jcDescripcionActionPerformed

    private void rbHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHombreActionPerformed
        if (rbHombre.isSelected()) {

            String listaDescripcion [] = {"Seleccione una opción","CAMISA LONG HANG NEGRA","CAMISA LONG HANG BLANCA",
                "CAMISA LONG HANG GRIS","CAMISA LONG HANG ROJAS",
                "CAMISA MANTENIMIENTO","SUETER PLAYERAS"};

            String listaTallaDescripcion [] = {"Seleccione una opción","S","M","L","XL","XXL"};
            
            
            String listaSudaderas [] = {"Seleccione una opción","SUDADERA LONG HANG NEGRA","SUDADERA LONG HANG GRIS"};

            String listaTallaSudaderas [] = {"Seleccione una opción","S","M","L","XL","XXL"};

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));
            
            jcSudaderas.setModel(new DefaultComboBoxModel<>(listaSudaderas));
            jcTallaSudadera.setModel(new DefaultComboBoxModel<>(listaTallaSudaderas));

            jcDescripcion.setModel(new DefaultComboBoxModel<>(listaDescripcion));
            jcTallaDescripcion.setModel(new DefaultComboBoxModel<>(listaTallaDescripcion));

            genero = "Hombre";
        }
    }//GEN-LAST:event_rbHombreActionPerformed

    private void rbDamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDamaActionPerformed

        if (rbDama.isSelected()) {

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

    }//GEN-LAST:event_rbDamaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       frmMostrarInventario winInvetario = new frmMostrarInventario();
       winInvetario.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       frmRetiroDotacion winRetiro = new frmRetiroDotacion();
       winRetiro.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmConsultarDatosDotacion winDotacionConsultar = new frmConsultarDatosDotacion();
        winDotacionConsultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jcSudaderasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSudaderasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSudaderasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frmEditarTrabajador winEditar= new frmEditarTrabajador();
        winEditar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jctipoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jctipoInventarioActionPerformed

    public void zapatos() {
    String listaZapatos [] = {"Seleccione una opción","ZAPATOS BLANCOS","ZAPATOS NEGROS"};
            
            String listaTallaZapatos [] = {"Seleccione una opción","36","37","38","39","40","41","42","43","44","45"};
            
            jcZapatos.setModel(new DefaultComboBoxModel<>(listaZapatos));
            jcTallaZapatos.setModel(new DefaultComboBoxModel<>(listaTallaZapatos));
            
}

    public void gorras() {
    String listaGorras [] = {"Seleccione una opción","GORRA NEGRA","GORRA GRIS"};
            
            String listaTallaGorras [] = {"Seleccione una opción","UNICA"};
            
            jcGorras.setModel(new DefaultComboBoxModel<>(listaGorras));
            jcTallaGorras.setModel(new DefaultComboBoxModel<>(listaTallaGorras));
}

    public void delantales() {
    
    String listaDelantales [] = {"Seleccione una opción","DELANTAL NEGRO","DELANTAL GRIS"};
            
            String listaTallaDelantales [] = {"Seleccione una opción","UNICA"};
            
            jcDelantales.setModel(new DefaultComboBoxModel<>(listaDelantales));
            jcTallaDelantales.setModel(new DefaultComboBoxModel<>(listaTallaDelantales));
    
}

    public void sucheros() {
        String listaSuchero [] = {"Seleccione una opción","SUCHERO NEGRO","SUCHERO GRIS"};
            
            String listaTallaSuchero [] = {"Seleccione una opción","S","M","L"};
            
            jcSucheros.setModel(new DefaultComboBoxModel<>(listaSuchero));
            jcTallaSucheros.setModel(new DefaultComboBoxModel<>(listaTallaSuchero));
}

    public void ingresarDotacion() {      
    try {
        if (validarDotaciones()) {
            
        Connection connection = DriverManager.getConnection(con.getUrl(),con.getUsername(), con.getPassword());
            if (validarCamposNumericos()) {
                
                 if(validarCantidad()){
                
            
        PreparedStatement stmtInsercion = connection.prepareStatement("CALL InsertarProductoDotacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                    setInsercionDotacion(stmtInsercion);

                    stmtInsercion.executeUpdate();
                    stmtInsercion.close();
                    
                    mostrarMensaje("Datos ingresados correcatamente");
                    limpiarCampos();
                }            
            }
        }
    } catch (SQLException ex) {
        
        if ("45000".equals(ex.getSQLState())) {

                mostrarMensaje("Género no encontrado");
            } else {

                System.out.println(ex);
                mostrarMensaje("Error al guardar datos");
            }
        }
    
}

    private void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(rootPane, mensaje);
}

    public void setInsercionDotacion(PreparedStatement stmtInsercion) throws SQLException {
    stmtInsercion.setString(1, jcDescripcion.getSelectedItem().toString());
    stmtInsercion.setString(2, jcTallaDescripcion.getSelectedItem().toString());
    stmtInsercion.setInt(3, parseCantidad(txtCantidadDescripcion.getText()));
    stmtInsercion.setString(4, jcSudaderas.getSelectedItem().toString());
    stmtInsercion.setString(5, jcTallaSudadera.getSelectedItem().toString());
    stmtInsercion.setInt(6, parseCantidad(txtCantidadSudaderas.getText()));
    stmtInsercion.setString(7, jcZapatos.getSelectedItem().toString());
    stmtInsercion.setString(8, jcTallaZapatos.getSelectedItem().toString());
    stmtInsercion.setInt(9, parseCantidad(txtCantidadZapatos.getText()));
    stmtInsercion.setString(10, jcGorras.getSelectedItem().toString());
    stmtInsercion.setString(11, jcTallaGorras.getSelectedItem().toString());
    stmtInsercion.setInt(12, parseCantidad(txtCantidadGorras.getText()));
    stmtInsercion.setString(13, jcDelantales.getSelectedItem().toString());
    stmtInsercion.setString(14, jcTallaDelantales.getSelectedItem().toString());
    stmtInsercion.setInt(15, parseCantidad(txtCantidadDelantales.getText()));
    stmtInsercion.setString(16, jcSucheros.getSelectedItem().toString());
    stmtInsercion.setString(17, jcTallaSucheros.getSelectedItem().toString());
    stmtInsercion.setInt(18, parseCantidad(txtCantidadSucheros.getText()));
    stmtInsercion.setString(19, genero);
    stmtInsercion.setString(20,jctipoInventario.getSelectedItem().toString());
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

    private boolean validarDotaciones() {
    String descripcion = jcDescripcion.getSelectedIndex() == 0 ? "Escoja una opción" : jcDescripcion.getSelectedItem().toString();
    String talladescripcion = jcTallaDescripcion.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaDescripcion.getSelectedItem().toString();
    String sudaderas = jcSudaderas.getSelectedIndex() == 0 ? "Escoja una opción" : jcSudaderas.getSelectedItem().toString();
    String tallasudadera = jcTallaSudadera.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaSudadera.getSelectedItem().toString();
    String zapatos = jcZapatos.getSelectedIndex() == 0 ? "Escoja una opción" : jcZapatos.getSelectedItem().toString();
    String tallazapatos = jcTallaZapatos.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaZapatos.getSelectedItem().toString();
    String gorras = jcGorras.getSelectedIndex() == 0 ? "Escoja una opción" : jcGorras.getSelectedItem().toString();
    String tallagorras = jcTallaGorras.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaGorras.getSelectedItem().toString();
    String delantales = jcDelantales.getSelectedIndex() == 0 ? "Escoja una opción" : jcDelantales.getSelectedItem().toString();
    String talladelantales = jcTallaDelantales.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaDelantales.getSelectedItem().toString();
    String sucheros = jcSucheros.getSelectedIndex() == 0 ? "Escoja una opción" : jcSucheros.getSelectedItem().toString();
    String tallasucheros = jcTallaSucheros.getSelectedIndex() == 0 ? "Escoja una opción" : jcTallaSucheros.getSelectedItem().toString();

    
    if ("Escoja una opción".equals(descripcion) && 
        "Escoja una opción".equals(talladescripcion) && 
        "Escoja una opción".equals(zapatos) && 
        "Escoja una opción".equals(tallazapatos) && 
        "Escoja una opción".equals(gorras) && 
        "Escoja una opción".equals(tallagorras) && 
        "Escoja una opción".equals(delantales) && 
        "Escoja una opción".equals(talladelantales) &&
        "Escoja una opción".equals(sucheros) && 
        "Escoja una opción".equals(tallasucheros) && 
        "Escoja una opción".equals(sudaderas) &&
        "Escoja una opción".equals(tallasudadera))
         {
        mostrarMensaje("Ninguna opción está seleccionada. Por favor, seleccione al menos una opción.");
        return false;
    }
    return true;
} 

    private boolean validarCamposNumericos() {
    String cantidadDescipcion = txtCantidadDescripcion.getText();
    String cantidadSudadera = txtCantidadSudaderas.getText();
    String cantidadZapatos = txtCantidadZapatos.getText();
    String cantidadGorras = txtCantidadGorras.getText();
    String cantidadDelantales = txtCantidadDelantales.getText();
    String cantidadSucheros = txtCantidadSucheros.getText();

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

    private boolean validarCantidad() {
    if (txtCantidadDescripcion.getText().isEmpty() 
            && txtCantidadGorras.getText().isEmpty() 
            && txtCantidadZapatos.getText().isEmpty() 
            && txtCantidadDelantales.getText().isEmpty() 
            && txtCantidadSucheros.getText().isEmpty()
            && txtCantidadSudaderas.getText().isEmpty()) {
        
        mostrarMensaje("Al menos digite un campo de cantidad");
        return false;
        
    }
    return true;
}

    private void limpiarCampos() {
    bgSexo.clearSelection();
    jcDescripcion.setSelectedIndex(0);
    jcSudaderas.setSelectedIndex(0);
    jcTallaSudadera.setSelectedIndex(0);
    jcZapatos.setSelectedIndex(0);
    jcGorras.setSelectedIndex(0);
    jcDelantales.setSelectedIndex(0);
    jcSucheros.setSelectedIndex(0);
    jcTallaDescripcion.setSelectedIndex(0);
    jcTallaZapatos.setSelectedIndex(0);
    jcTallaGorras.setSelectedIndex(0);
    jcTallaDelantales.setSelectedIndex(0);
    jcTallaSucheros.setSelectedIndex(0);
    txtCantidadDescripcion.setText("");
    txtCantidadZapatos.setText("");
    txtCantidadGorras.setText("");
    txtCantidadDelantales.setText("");
    txtCantidadSucheros.setText("");
    txtCantidadSudaderas.setText("");
    
    
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
            java.util.logging.Logger.getLogger(frmPanelEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPanelEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPanelEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPanelEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPanelEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcDelantales;
    private javax.swing.JComboBox<String> jcDescripcion;
    private javax.swing.JComboBox<String> jcGorras;
    private javax.swing.JComboBox<String> jcSucheros;
    private javax.swing.JComboBox<String> jcSudaderas;
    private javax.swing.JComboBox<String> jcTallaDelantales;
    private javax.swing.JComboBox<String> jcTallaDescripcion;
    private javax.swing.JComboBox<String> jcTallaGorras;
    private javax.swing.JComboBox<String> jcTallaSucheros;
    private javax.swing.JComboBox<String> jcTallaSudadera;
    private javax.swing.JComboBox<String> jcTallaZapatos;
    private javax.swing.JComboBox<String> jcZapatos;
    private javax.swing.JComboBox<String> jctipoInventario;
    private javax.swing.JRadioButton rbDama;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JTextField txtCantidadDelantales;
    private javax.swing.JTextField txtCantidadDescripcion;
    private javax.swing.JTextField txtCantidadGorras;
    private javax.swing.JTextField txtCantidadSucheros;
    private javax.swing.JTextField txtCantidadSudaderas;
    private javax.swing.JTextField txtCantidadZapatos;
    // End of variables declaration//GEN-END:variables
}
