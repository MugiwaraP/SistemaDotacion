
package sistemadotacion;

import com.mysql.cj.jdbc.CallableStatement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmMostrarInventario extends javax.swing.JFrame {
    
    ConectionSistemaDotacion con;

    public frmMostrarInventario() {
        initComponents();
        con= new ConectionSistemaDotacion();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInventario = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        btnInventario = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        txtBuscarDotacion = new javax.swing.JTextField();
        txtBuscarDotacionSexo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jctipoInventario = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbInventario.setBackground(new java.awt.Color(255, 255, 255));
        tbInventario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbInventario.setForeground(new java.awt.Color(0, 0, 0));
        tbInventario.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
        jScrollPane1.setViewportView(tbInventario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1260, 530));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Mostrar Inventario por genero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 310, 50));

        bgSexo.add(rbHombre);
        rbHombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbHombre.setText("Hombre");
        rbHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHombreActionPerformed(evt);
            }
        });
        jPanel1.add(rbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        bgSexo.add(rbMujer);
        rbMujer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbMujer.setText("Mujer");
        rbMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMujerActionPerformed(evt);
            }
        });
        jPanel1.add(rbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        btnInventario.setBackground(new java.awt.Color(204, 255, 204));
        btnInventario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(0, 0, 0));
        btnInventario.setText("Mostrar Inventario ");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, 50));

        btnExportarExcel.setBackground(new java.awt.Color(204, 255, 204));
        btnExportarExcel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnExportarExcel.setForeground(new java.awt.Color(0, 0, 0));
        btnExportarExcel.setText("Exportar Excel");
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 210, 60));

        txtBuscarDotacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtBuscarDotacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDotacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarDotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 320, 50));

        txtBuscarDotacionSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtBuscarDotacionSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDotacionSexoKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarDotacionSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 320, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2444573-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ffffff-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jctipoInventario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jctipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LONG HANG", "PRADO EXPRESS", "BIOEYZA" }));
        jctipoInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jctipoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(jctipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 220, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TIpo de inventario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mostrarInventarioSexo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHombreActionPerformed

    }//GEN-LAST:event_rbHombreActionPerformed

    private void rbMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMujerActionPerformed

    }//GEN-LAST:event_rbMujerActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        mostrarInventario();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmPanelEntradas winPanelEntradas= new frmPanelEntradas();
        winPanelEntradas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(tbInventario);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_btnExportarExcelActionPerformed

    private void txtBuscarDotacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDotacionKeyReleased
       filtroInventario();
    }//GEN-LAST:event_txtBuscarDotacionKeyReleased

    private void txtBuscarDotacionSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDotacionSexoKeyReleased
        filtroInventarioSexo();
    }//GEN-LAST:event_txtBuscarDotacionSexoKeyReleased

    private void jctipoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jctipoInventarioActionPerformed

    private String obtenerTipoInventarioSeleccionado() {
    if (rbHombre.isSelected()) {
        return "Hombre";
    } else if (rbMujer.isSelected()) {
        return "Mujer";
    } else {
        return "Error"; 
    }
}
    
    public void mostrarInventarioSexo() {
    
    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumnas[] = {"Categoria", "Articulo", "Talla", "Cantidad", "Fecha de ingreso","TIpo de Inventario"};
    modelo.setColumnIdentifiers(nombreColumnas);

    try {
        if (validarSexo()) {
            
        
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());
        String tipoSexo = obtenerTipoInventarioSeleccionado();
        if ("Hombre".equals(tipoSexo) || "Mujer".equals(tipoSexo)) {
            CallableStatement stmt = (CallableStatement) connection.prepareCall("{call MostrarInventarioSexo(?,?)}");
            stmt.setString(1, tipoSexo);
            stmt.setString(2, jctipoInventario.getSelectedItem().toString());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String categoria = rs.getString("Categoria");
                String articulo = rs.getString("Articulo");
                String talla = rs.getString("Talla");
                String cantidad = rs.getString("Cantidad");
                Date fechaIngreso = rs.getDate("Fecha_Ingreso");
                String tipoInventario = rs.getString("nombre_tipo_inventario");

                Object[] row = {categoria, articulo, talla, cantidad, fechaIngreso,tipoInventario};
                modelo.addRow(row);
            }

            stmt.close();
        }
        connection.close();
        }
    } catch (SQLException ex) {
        System.out.println(ex);
        JOptionPane.showMessageDialog(rootPane, "Error");
    }

    tbInventario.setModel(modelo);
}

    public boolean validarSexo() {
    if (!rbHombre.isSelected() && !rbMujer.isSelected()) {
        JOptionPane.showMessageDialog(rootPane, "Escoja al menos algún genero para mostrar el inventario");
        return false;
    }
    return true;
}
    
    public void mostrarInventario() {
    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumnas[] = {"Categoria", "Nombre", "Talla", "Cantidad","Tipo de inventario"};
    modelo.setColumnIdentifiers(nombreColumnas);

    try {
        
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());
            
        CallableStatement stmt = (CallableStatement) connection.prepareCall("{call MostrarInventario(?)}");
        stmt.setString(1, jctipoInventario.getSelectedItem().toString());
        ResultSet rs = stmt.executeQuery();
        

        while (rs.next()) {
            
            String categoria = rs.getString("Categoria");
            String nombre = rs.getString("nombre");
            String talla = rs.getString("talla");
            String cantidad = rs.getString("cantidad");
            String tipoInventario=rs.getString("nombre_tipo_inventario");

            
            Object[] row = {categoria, nombre, talla, cantidad,tipoInventario};
            modelo.addRow(row);
        }
        
        stmt.close();
        connection.close();
        
    } catch (SQLException ex) {
        System.out.println(ex);
        JOptionPane.showMessageDialog(rootPane, "Error");
    }

    // Asignar el modelo a la tabla
    tbInventario.setModel(modelo);
}

    public void filtroInventario() {
    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumnas[] = {"Categoria", "Nombre", "Talla", "Cantidad","Fecha de ingreso","Tipo de inventario"};
    modelo.setColumnIdentifiers(nombreColumnas);
   
    tbInventario.setModel(modelo);
    try {
        Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

        String nombreBuscado = txtBuscarDotacion.getText().trim();

        String query = "{CALL filtroInventario(?,?)}";

        CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
        cstmt.setString(1, "%" + nombreBuscado + "%");
        cstmt.setString(2, jctipoInventario.getSelectedItem().toString());

        ResultSet rs = cstmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tbInventario.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            Object[] row = {
                rs.getString("Categoria"),
                rs.getString("nombre"),
                rs.getString("talla"),
                rs.getString("cantidad"),
                rs.getString("fecha_ingreso"),
                rs.getString("nombre_tipo_inventario")
            };
            model.addRow(row);
        }

        // Cerrar las conexion
        rs.close();
        cstmt.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
        System.out.println(ex);
        }

}

    public void filtroInventarioSexo() {
    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumnas[] = {"Categoria", "Nombre", "Talla", "Cantidad", "Fecha_Ingreso","Tipo de inventario"};
    modelo.setColumnIdentifiers(nombreColumnas);
   
    tbInventario.setModel(modelo);
    
    if (!rbHombre.isSelected() && !rbMujer.isSelected()) {
        JOptionPane.showMessageDialog(rootPane, "Escoja al menos un sexo para buscar la dotación deseada");
    } else {
        try {
            Connection connection = DriverManager.getConnection(con.getUrl(), con.getUsername(), con.getPassword());

            String sexo = rbHombre.isSelected() ? "Hombre" : "Mujer";
            String nombreBuscado = txtBuscarDotacionSexo.getText().trim();

            String query = "{CALL filtroInventarioSexo(?, ?, ?)}";

            CallableStatement cstmt = (CallableStatement) connection.prepareCall(query);
            cstmt.setString(1, sexo);
            cstmt.setString(2, "%" + nombreBuscado + "%");
            cstmt.setString(3, jctipoInventario.getSelectedItem().toString());

            ResultSet rs = cstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tbInventario.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = {
                    rs.getString("Categoria"),
                    rs.getString("Articulo"),
                    rs.getString("Talla"),
                    rs.getString("Cantidad"),
                    rs.getString("Fecha_Ingreso"),
                    rs.getString("nombre_tipo_inventario")
                };
                model.addRow(row);
            }

            // Cerrar la conexión
            rs.close();
            cstmt.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + ex.getMessage());
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(frmMostrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMostrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMostrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMostrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMostrarInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jctipoInventario;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JTable tbInventario;
    private javax.swing.JTextField txtBuscarDotacion;
    private javax.swing.JTextField txtBuscarDotacionSexo;
    // End of variables declaration//GEN-END:variables
}
