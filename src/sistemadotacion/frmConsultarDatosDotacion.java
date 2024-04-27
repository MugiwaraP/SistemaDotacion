package sistemadotacion;

import com.mysql.cj.jdbc.CallableStatement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class frmConsultarDatosDotacion extends javax.swing.JFrame {

  ConectionSistemaDotacion con;
    public frmConsultarDatosDotacion() {
        initComponents();
        con= new ConectionSistemaDotacion();
        setLocationRelativeTo(null);
        
      DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {
        "Nombre", "Tipo Documento", "Número Documento", "Género", "Ciudad", "Punto Venta", "Sociedad",
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
        seprarColumnas();
        modelo.setColumnIdentifiers(nombreColumnas);
        tbConsultas.setModel(modelo);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnDotacionRetirada = new javax.swing.JButton();
        btnDotacionRetiradaPuntos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdFinal = new com.toedter.calendar.JDateChooser();
        jdInicio = new com.toedter.calendar.JDateChooser();
        btnConsultar = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        txtPunto = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTrabajadorDotacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPuntoDotacion = new javax.swing.JTextField();
        jcCiudad = new javax.swing.JComboBox<>();
        jcPuntoVenta = new javax.swing.JComboBox<>();
        txtNombreDotacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcTipoInventario = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmInicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar dotacion especifica por punto de venta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre de dotacion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buscar punto por nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar dotacion especifica para trabajador");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONSULTAR FECHA ESPECIFICA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnDotacionRetirada.setBackground(new java.awt.Color(204, 255, 204));
        btnDotacionRetirada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDotacionRetirada.setForeground(new java.awt.Color(0, 0, 0));
        btnDotacionRetirada.setText("Mostrar dotacion retirada por trabajador");
        btnDotacionRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotacionRetiradaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDotacionRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 360, 50));

        btnDotacionRetiradaPuntos.setBackground(new java.awt.Color(204, 255, 204));
        btnDotacionRetiradaPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDotacionRetiradaPuntos.setForeground(new java.awt.Color(0, 0, 0));
        btnDotacionRetiradaPuntos.setText("Mostrar dotacion retirada por punto de venta");
        btnDotacionRetiradaPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotacionRetiradaPuntosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDotacionRetiradaPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 360, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha final:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de inventario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 200, 30));
        jPanel1.add(jdFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, 40));
        jPanel1.add(jdInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 210, 40));

        btnConsultar.setBackground(new java.awt.Color(204, 255, 204));
        btnConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, 50));

        btnExportarExcel.setBackground(new java.awt.Color(204, 255, 204));
        btnExportarExcel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnExportarExcel.setForeground(new java.awt.Color(0, 0, 0));
        btnExportarExcel.setText("Exportar Excel");
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, 210, 60));

        txtPunto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPuntoKeyReleased(evt);
            }
        });
        jPanel1.add(txtPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 310, 30));

        txtTrabajador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTrabajadorKeyReleased(evt);
            }
        });
        jPanel1.add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 310, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png-transparent-clerk-computer-icons-clerk-thumbnail-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OIP__1_-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 50, 50));

        tbConsultas.setBackground(new java.awt.Color(255, 255, 255));
        tbConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tbConsultas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbConsultas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbConsultas.setEditingColumn(1);
        tbConsultas.setEditingRow(1);
        jScrollPane1.setViewportView(tbConsultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1640, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngtree-search-icon-creative-design-template-png-image_1998500-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 50, 40));

        txtTrabajadorDotacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTrabajadorDotacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTrabajadorDotacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtTrabajadorDotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 310, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TTTT-Photoroom.png-Photoroom.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 60, 50));

        txtPuntoDotacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPuntoDotacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPuntoDotacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtPuntoDotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 310, 30));

        jcCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una ciudad", "SANTA MARTA", "BARRANQUILLA", "CARTAGENA", "BUCARAMANGA", "MEDELLIN", "MONTERIA", "VALLEDUPAR" }));
        jcCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(jcCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 240, 200, 40));

        jPanel1.add(jcPuntoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 240, 200, 40));

        txtNombreDotacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreDotacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreDotacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombreDotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 180, 300, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar trabajador por nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jcTipoInventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcTipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LONG HANG", "PRADO EXPRESS", "BIOEYZA" }));
        jPanel1.add(jcTipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, 210, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha inicio:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jmInicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmInicio.setText("Inicio");
        jmInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInicioActionPerformed(evt);
            }
        });
        jMenu1.add(jmInicio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDotacionRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotacionRetiradaActionPerformed
        mostrarDotacionesRetiradas();
        seprarColumnas();
    }//GEN-LAST:event_btnDotacionRetiradaActionPerformed

    private void btnDotacionRetiradaPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotacionRetiradaPuntosActionPerformed
        mostrarCantidadesRetiradasPorPuntoVenta();
        seprarColumnas();
    }//GEN-LAST:event_btnDotacionRetiradaPuntosActionPerformed

    private void jmInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInicioActionPerformed
        frmPanelEntradas winPanelEntrada = new frmPanelEntradas();
        winPanelEntrada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmInicioActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        FiltroMostrarDotacionesRetiradas(); 
        seprarColumnas();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(tbConsultas);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    
    }//GEN-LAST:event_btnExportarExcelActionPerformed

    private void txtPuntoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntoKeyReleased
       
DefaultTableModel modelo = new DefaultTableModel();
String[] nombreColumnas = {
    "Ciudad", "Punto de Venta","Sociedad","Fecha salida", 
        "Nombre CH", "Talla CH", "Cantidad CH",
        "Nombre SH", "Talla SH", "Cantidad SH", 
        "Nombre CM", "Talla CM", "Cantidad CM", 
        "Nombre SM", "Talla SM", "Cantidad SM",
        "Nombre Z", "Talla Z", "Cantidad Z", 
        "Nombre G", "Talla G", "Cantidad G", 
        "Nombre D", "Talla D", "Cantidad D", 
        "Nombre S", "Talla S", "Cantidad S"
};
modelo.setColumnIdentifiers(nombreColumnas);
tbConsultas.setModel(modelo);

    try {
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        String nombreBuscado = txtPunto.getText().trim();

        String query = "{CALL filtro_cantidad_total_dotacion_por_punto(?,?)}";

        CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
        cstmt.setString(1, "%" + nombreBuscado + "%");
        cstmt.setString(2,jcTipoInventario.getSelectedItem().toString());

        ResultSet rs = cstmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tbConsultas.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            Object[] row = {
                rs.getString("ciudad"),
                rs.getString("punto_venta_trabajador"),
                rs.getString("sociedad"),
                rs.getString("camisa_salida_hombre"),
                rs.getString("talla_camisa_salida_hombre"),
                rs.getInt("total_camisa_hombre"),
                rs.getString("sudadera_salida_hombre"),
                rs.getString("talla_sudadera_salida_hombre"),
                rs.getInt("total_sudadera_hombre"),         
                rs.getString("camisa_salida_mujer"),
                rs.getString("talla_camisa_salida_mujer"),
                rs.getInt("total_camisa_mujer"),         
                rs.getString("sudadera_salida_mujer"),
                rs.getString("talla_sudadera_salida_mujer"),
                rs.getInt("total_sudadera_mujer"),  
                rs.getString("nombre_salida_zapatos"),
                rs.getString("talla_salida_zapatos"),
                rs.getInt("total_zapatos"),
                rs.getString("nombre_salida_gorras"),
                rs.getString("talla_salida_gorras"),
                rs.getInt("total_gorras"),
                rs.getString("nombre_salida_delantales"),
                rs.getString("talla_salida_delantales"),
                rs.getInt("total_delantales"),
                rs.getString("nombre_salida_sucheros"),
                rs.getString("talla_salida_sucheros"),
                rs.getInt("total_sucheros"),
                rs.getString("fecha_salida"),
                rs.getString("tipo_inventario_trabajador")
            };
            model.addRow(row);
        }
        seprarColumnas();
        // Cerrar las conexion
        rs.close();
        cstmt.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
        System.out.println(ex);
        }
    }//GEN-LAST:event_txtPuntoKeyReleased

    private void txtTrabajadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajadorKeyReleased
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {
        "Nombre", "Tipo Documento", "Número Documento", "Género", "Ciudad", "Punto Venta", "Sociedad",
        "Nombre Z", "Talla Z", "Cantidad Z", 
        "Nombre G", "Talla G", "Cantidad G", 
        "Nombre D", "Talla D", "Cantidad D", 
        "Nombre S", "Talla S", "Cantidad S",
        "Nombre CH", "Talla CH", "Cantidad CH", 
        "Nombre SH", "Talla SH", "Cantidad SH", 
        "Nombre CM", "Talla CM", "Cantidad CM", 
        "Nombre SM", "Talla SM", "Cantidad SM", 
        "Fecha salida","Tipo inventario"
        };
        modelo.setColumnIdentifiers(nombreColumnas);
        tbConsultas.setModel(modelo);

    try {
        // Obtener la conexión a la base de datos
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        // Obtener el nombre buscado desde el JTextField
        String nombreBuscado = txtTrabajador.getText().trim();

        // Llamar al procedimiento almacenado con un parámetro de búsqueda
        String query = "{CALL filtro_datos_trabajador_con_dotacion(?,?)}";

        // Preparar la declaración SQL
        CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
        cstmt.setString(1, "%" + nombreBuscado + "%");
        cstmt.setString(2,jcTipoInventario.getSelectedItem().toString());

        // Ejecutar la consulta
        ResultSet rs = cstmt.executeQuery();

        // Obtener el modelo de la tabla y limpiar los datos existentes
        DefaultTableModel model = (DefaultTableModel) tbConsultas.getModel();
        model.setRowCount(0); 

        // Iterar sobre los resultados y agregarlos al modelo de la tabla
        while (rs.next()) {
            Object[] row = {
            rs.getString("nombre"),
            rs.getString("tipo_documento"),
            rs.getInt("numero_documento"),
            rs.getString("genero"),
            rs.getString("ciudad"),
            rs.getString("punto_venta_trabajador"),
            rs.getString("sociedad"),
            rs.getString("nombre_salida_zapatos"),
            rs.getString("talla_salida_zapatos"),
            rs.getInt("cantidad_salida_zapatos"),    
            rs.getString("nombre_salida_gorras"),
            rs.getString("talla_salida_gorras"),
            rs.getInt("cantidad_salida_gorras"),
            rs.getString("nombre_salida_delantales"),
            rs.getString("talla_salida_delantales"),
            rs.getInt("cantidad_salida_delantales"),
            rs.getString("nombre_salida_sucheros"),
            rs.getString("talla_salida_sucheros"),
            rs.getInt("cantidad_salida_sucheros"),
            rs.getString("camisa_salida_hombre"),
            rs.getString("talla_camisa_salida_hombre"),
            rs.getInt("cantidad_camisa_salida_hombre"),
            rs.getString("sudadera_salida_hombre"),
            rs.getString("talla_sudadera_salida_hombre"),
            rs.getInt("cantidad_sudadera_salida_hombre"),
            rs.getString("camisa_salida_mujer"),
            rs.getString("talla_camisa_salida_mujer"),
            rs.getInt("cantidad_camisa_salida_mujer"),
            rs.getString("sudadera_salida_mujer"),
            rs.getString("talla_sudadera_salida_mujer"),
            rs.getInt("cantidad_sudadera_salida_mujer"),
            rs.getString("fecha_salida"),
            rs.getString("tipo_inventario_trabajador")
            };
            model.addRow(row);
        }
        seprarColumnas();
        // Cerrar los recursos
        rs.close();
        cstmt.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
        System.out.println(ex);
        }
    }//GEN-LAST:event_txtTrabajadorKeyReleased

    private void txtTrabajadorDotacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajadorDotacionKeyReleased
        filtroDotacionPorTrabajador();
        
        seprarColumnas();
    }//GEN-LAST:event_txtTrabajadorDotacionKeyReleased

    private void txtPuntoDotacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntoDotacionKeyReleased
        filtroDotacionPorPunto();
        seprarColumnas();
    }//GEN-LAST:event_txtPuntoDotacionKeyReleased

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

    private void txtNombreDotacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDotacionKeyReleased
        filtroDotacionPorTrabajador();
        seprarColumnas();
    }//GEN-LAST:event_txtNombreDotacionKeyReleased

    public void mostrarDotacionesRetiradas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {
            "Nombre", "Tipo Documento", "Número Documento", "Género", "Ciudad", "Punto Venta", "Sociedad",
            "Nombre Z", "Talla Z", "Cantidad Z", 
            "Nombre G", "Talla G", "Cantidad G", 
            "Nombre D", "Talla D", "Cantidad D", 
            "Nombre S", "Talla S", "Cantidad S",
            "Nombre CH", "Talla CH", "Cantidad CH", 
            "Nombre SH", "Talla SH", "Cantidad SH", 
            "Nombre CM", "Talla CM", "Cantidad CM", 
            "Nombre SM", "Talla SM", "Cantidad SM", 
            "Fecha salida","Tipo Inventario"
        };
        modelo.setColumnIdentifiers(nombreColumnas);
        try {
            Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

            CallableStatement stmt = (CallableStatement) connection.prepareCall("{call mostrar_datos_trabajador_con_dotacion(?)}");
            
            stmt.setString(1,jcTipoInventario.getSelectedItem().toString());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String tipoDocumento = rs.getString("tipo_documento");
                int numeroDocumento = rs.getInt("numero_documento");
                String genero = rs.getString("genero");
                String ciudad = rs.getString("ciudad");
                String puntoVentaTrabajador = rs.getString("punto_venta_trabajador");
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
                    nombre, tipoDocumento, numeroDocumento, genero, ciudad, puntoVentaTrabajador, sociedad,
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

    public void FiltroMostrarDotacionesRetiradas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {
            "Nombre", "Tipo Documento", "Número Documento", "Género", "Ciudad", "Punto Venta", "Sociedad",
            "Nombre Z", "Talla Z", "Cantidad Z", 
            "Nombre G", "Talla G", "Cantidad G", 
            "Nombre D", "Talla D", "Cantidad D", 
            "Nombre S", "Talla S", "Cantidad S",
            "Nombre CH", "Talla CH", "Cantidad CH", 
            "Nombre SH", "Talla SH", "Cantidad SH", 
            "Nombre CM", "Talla CM", "Cantidad CM", 
            "Nombre SM", "Talla SM", "Cantidad SM", 
            "Fecha salida","Tipo Inventario"
        };
        modelo.setColumnIdentifiers(nombreColumnas);
        try {

            Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

            // Obtener las fechas seleccionadas en los JDateChooser
            Date fechaInicio = jdInicio.getDate();
            Date fechaFin = jdFinal.getDate();


            if (validarFechas()) {
            // Crear la llamada al procedimiento almacenado con los parámetros de fecha
            CallableStatement stmt = (CallableStatement) connection.prepareCall("{call mostrar_datos_trabajador_con_dotacion_filtro(?, ?, ?)}");
            stmt.setDate(1, new java.sql.Date(fechaInicio.getTime())); 
            stmt.setDate(2, new java.sql.Date(fechaFin.getTime())); 
            stmt.setString(3,jcTipoInventario.getSelectedItem().toString());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String tipoDocumento = rs.getString("tipo_documento");
                int numeroDocumento = rs.getInt("numero_documento");
                String genero = rs.getString("genero");
                String ciudad = rs.getString("ciudad");
                String puntoVentaTrabajador = rs.getString("punto_venta_trabajador");
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
                String tipoInventario    = rs.getString("tipo_inventario_trabajador");

                jdInicio.setDate(null);
                jdFinal.setDate(null);

                Object[] row = {
                    nombre, tipoDocumento, numeroDocumento, genero, ciudad, puntoVentaTrabajador, sociedad,
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


            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error");
        }

        tbConsultas.setModel(modelo);
    }

    public void mostrarCantidadesRetiradasPorPuntoVenta() {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] nombreColumnas = {
            "Ciudad","Punto venta","Sociedad","Fecha salida","Tipo Inventario", 
            "Nombre CH", "Talla CH", "Cantidad CH",
            "Nombre SH", "Talla SH", "Cantidad SH", 
            "Nombre CM", "Talla CM", "Cantidad CM", 
            "Nombre SM", "Talla SM", "Cantidad SM",
            "Nombre Z", "Talla Z", "Cantidad Z", 
            "Nombre G", "Talla G", "Cantidad G", 
            "Nombre D", "Talla D", "Cantidad D", 
            "Nombre S", "Talla S", "Cantidad S", };
        modelo.setColumnIdentifiers(nombreColumnas);

        try {
            Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());
            CallableStatement stmt = (CallableStatement) connection.prepareCall("{CALL mostrar_cantidad_total_dotacion_por_punto(?)}");
            
            stmt.setString(1, jcTipoInventario.getSelectedItem().toString());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String ciudad = rs.getString("ciudad");
                String puntoVenta=rs.getString("punto_venta_trabajador");
                String sociedad = rs.getString("sociedad");
                Date fechaSalida= rs.getDate("fecha_salida");
                String tipoInventario= rs.getString("tipo_inventario_trabajador");
                String referenciaCamisaHombre = rs.getString("referencia_camisa_hombre");
                String tallaCamisaHombre = rs.getString("talla_camisa_hombre");
                int cantidadCamisaHombre = rs.getInt("total_camisa_hombre");
                String referenciaSudaderaHombre = rs.getString("referencia_sudadera_hombre");
                String tallaSudaderaHombre = rs.getString("talla_sudadera_hombre");
                int cantidadSudaderaHombre = rs.getInt("total_sudadera_hombre");         
                String referenciaCamisaMujer = rs.getString("referencia_camisa_mujer");
                String tallaCamisaMujer = rs.getString("talla_camisa_mujer");
                int cantidadCamisaMujer = rs.getInt("total_camisa_mujer");          
                String referenciaSudaderaMujer = rs.getString("referencia_sudadera_mujer");
                String tallaSudaderaMujer = rs.getString("talla_sudadera_mujer");
                int cantidadSudaderaMujer = rs.getInt("total_sudadera_mujer");         
                String referenciaZapatos = rs.getString("referencia_zapatos");
                String tallaZapatos = rs.getString("talla_zapatos");
                int cantidadZapatos = rs.getInt("total_zapatos");
                String referenciaGorras = rs.getString("referencia_gorras");
                String tallaGorras = rs.getString("talla_gorras");
                int cantidadGorras = rs.getInt("total_gorras");
                String referenciaDelantales = rs.getString("referencia_delantales");
                String tallaDelantales = rs.getString("talla_delantales");
                int cantidadDelantales = rs.getInt("total_delantales");
                String referenciaSucheros = rs.getString("referencia_sucheros");
                String tallaSucheros = rs.getString("talla_sucheros");
                int cantidadSucheros = rs.getInt("total_sucheros");

                Object[] row = {ciudad,puntoVenta,sociedad,fechaSalida,tipoInventario,
                                referenciaCamisaHombre,tallaCamisaHombre,cantidadCamisaHombre,
                                referenciaSudaderaHombre,tallaSudaderaHombre,cantidadSudaderaHombre,
                                referenciaCamisaMujer,tallaCamisaMujer,cantidadCamisaMujer,
                                referenciaSudaderaMujer,tallaSudaderaMujer,cantidadSudaderaMujer,
                                referenciaZapatos, tallaZapatos, cantidadZapatos,
                                referenciaGorras, tallaGorras, cantidadGorras, 
                                referenciaDelantales, tallaDelantales, cantidadDelantales,
                                referenciaSucheros, tallaSucheros, cantidadSucheros};
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

    public boolean validarFechas() {
        if (jdInicio.getDate()==null || jdFinal.getDate()==null ) {

            JOptionPane.showMessageDialog(rootPane, "Ambas fechas son obligatorias");
            return false;
        }
        return true;
    }
    
    public void filtroDotacionPorPunto() {
    DefaultTableModel modelo = new DefaultTableModel();
    String[] nombreColumnas = {
        "Ciudad", "Punto de Venta", "Sociedad", 
        "Categoria", "Nombre", "Talla", 
        "Cantidad", "Fecha de salida","Tipo Inventario"
    };
    modelo.setColumnIdentifiers(nombreColumnas);
    
    tbConsultas.setModel(modelo);

    try {
        if (validarComboBox()) {
            
        
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        String nombreBuscado = txtPuntoDotacion.getText().trim();
        String puntoVenta = jcPuntoVenta.getSelectedItem().toString();

        String query = "{CALL filtroInventarioPorPunto(?,?,?)}";

        CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
        cstmt.setString(1, nombreBuscado);
        cstmt.setString(2, puntoVenta);
        cstmt.setString(3,jcTipoInventario.getSelectedItem().toString());

        boolean hadResults = cstmt.execute();

        if (hadResults) {
            ResultSet rs = cstmt.getResultSet();
            DefaultTableModel model = (DefaultTableModel) tbConsultas.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = {
                    rs.getString("ciudad"),
                    rs.getString("punto_venta_trabajador"),
                    rs.getString("sociedad"),
                    rs.getString("Categoria"),
                    rs.getString("nombre"),
                    rs.getString("talla"),
                    rs.getInt("cantidad"),
                    rs.getString("fecha_salida"),
                    rs.getString("tipo_inventario_trabajador")
                };
                model.addRow(row);
            }

            // Cerrar las conexiones
            rs.close();
        }

        cstmt.close();
        connection.close();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
        System.out.println(ex);
    }
    
}

    public void filtroDotacionPorTrabajador() {
    DefaultTableModel modelo = new DefaultTableModel();
    String[] nombreColumnas = {
        "Nombre del trabajador", "Tipo de documento", "Numero de documento",
        "Estado", "Genero",
        "Ciudad", "Punto de Venta", "Sociedad", 
        "Categoria", "Nombre de la dotacion", "Talla de la dotacion", 
        "Cantidad retirada de la dotacion", "Fecha de salida"
    };
    modelo.setColumnIdentifiers(nombreColumnas);
    
    tbConsultas.setModel(modelo);

    try {
              
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        String nombreTrabajador = txtTrabajadorDotacion.getText().trim();
        String nombreDotacion = txtNombreDotacion.getText().trim();

        String query = "{CALL filtroInventarioPorTrabajador(?,?,?)}";

        CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
        cstmt.setString(1, nombreTrabajador);
        cstmt.setString(2, nombreDotacion);
        cstmt.setString(3,jcTipoInventario.getSelectedItem().toString());

        boolean hadResults = cstmt.execute();

        if (hadResults) {
            ResultSet rs = cstmt.getResultSet();
            DefaultTableModel model = (DefaultTableModel) tbConsultas.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = {
                    rs.getString("nombreTrabajador"), 
                    rs.getString("tipo_documento"),
                    rs.getString("numero_documento"),
                    rs.getString("estado"),
                    rs.getString("genero"),
                    rs.getString("ciudad"),
                    rs.getString("punto_venta_trabajador"),
                    rs.getString("sociedad"),
                    rs.getString("Categoria"),
                    rs.getString("nombreDotacion"),
                    rs.getString("talla"),
                    rs.getInt("cantidad"),
                    rs.getString("fecha_salida"),
                    rs.getString("tipo_inventario_trabajador")
                };
                model.addRow(row);
            }

            
            rs.close();
        }
        cstmt.close();
        connection.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
        System.out.println(ex);
    }
    
}

    public boolean validarComboBox() {
    if (jcCiudad.getSelectedItem().equals("Seleccione una ciudad") || jcPuntoVenta.getSelectedItem().equals("Seleccione un punto de venta") ) {
        
        JOptionPane.showMessageDialog(rootPane, "Escoja una ciudad y punto de venta para mostrar la dotacion que desea ver");
        return false;
    }
    return true;

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
            java.util.logging.Logger.getLogger(frmConsultarDatosDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultarDatosDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultarDatosDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultarDatosDotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultarDatosDotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDotacionRetirada;
    private javax.swing.JButton btnDotacionRetiradaPuntos;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCiudad;
    private javax.swing.JComboBox<String> jcPuntoVenta;
    private javax.swing.JComboBox<String> jcTipoInventario;
    private com.toedter.calendar.JDateChooser jdFinal;
    private com.toedter.calendar.JDateChooser jdInicio;
    private javax.swing.JMenuItem jmInicio;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTextField txtNombreDotacion;
    private javax.swing.JTextField txtPunto;
    private javax.swing.JTextField txtPuntoDotacion;
    private javax.swing.JTextField txtTrabajador;
    private javax.swing.JTextField txtTrabajadorDotacion;
    // End of variables declaration//GEN-END:variables
}
