/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionproyectoentornos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumMati
 */
public class Compras extends javax.swing.JFrame {

    static public ResultSet r;

    static public Connection connection;

    /**
     * Creates new form Compras
     */
    public Compras() {
        try {
            initComponents();
            String url = "jdbc:mysql://localhost:3306/tienda_videojuegos";
            String user = "entornos"; //Cambiar a root y sin contraseña si no está creado el usuario "entornos"
            String pass = "entornos"; //Cambiar a root y sin contraseña si no está creado el usuario "entornos"
            connection = DriverManager.getConnection(url, user, pass);

            Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT * FROM Compras";
            r = s.executeQuery(query);
            r.first();

            id.setText(r.getString("Identificador"));
            fecha.setText(r.getString("Fecha"));
            producto.setText(r.getString("Producto"));
            cantidad.setText(r.getString("Cantidad"));
            precio.setText(r.getString("Precio_total"));

        } catch (SQLException ex) {
            Logger.getLogger(Compras.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        nueva = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        primera = new javax.swing.JButton();
        ultima = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("COMPRAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 11, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 348, 93, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("ID: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 109, -1, -1));

        id.setEditable(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 106, 115, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Fecha: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 147, -1, -1));

        fecha.setEditable(false);
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 144, 115, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("IdProducto: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 185, 70, -1));

        producto.setEditable(false);
        getContentPane().add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 182, 115, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Cantidad: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 223, -1, -1));

        cantidad.setEditable(false);
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 115, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Precio total: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 261, -1, -1));

        precio.setEditable(false);
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 258, 115, -1));

        nueva.setText("Nueva");
        nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaActionPerformed(evt);
            }
        });
        getContentPane().add(nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 307, -1, -1));

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 307, -1, -1));

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 307, -1, -1));

        primera.setText("Primera");
        primera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeraActionPerformed(evt);
            }
        });
        getContentPane().add(primera, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 307, -1, -1));

        ultima.setText("Última");
        ultima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimaActionPerformed(evt);
            }
        });
        getContentPane().add(ultima, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 307, -1, -1));

        insertar.setText("Insertar");
        insertar.setEnabled(false);
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });
        getContentPane().add(insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 80, -1));

        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionproyectoentornos/imagen_corporativa.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionproyectoentornos/fondo_app.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        insertar.setEnabled(false);
        cancelar.setEnabled(false);
        primera.setEnabled(true);
        ultima.setEnabled(true);
        anterior.setEnabled(true);
        siguiente.setEnabled(true);
        volver.setEnabled(true);
        producto.setEditable(false);
        cantidad.setEditable(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        try {
            // TODO add your handling code here:
            if (r.next()) {
                id.setText(r.getString("Identificador"));
                fecha.setText(r.getString("Fecha"));
                producto.setText(r.getString("Producto"));
                cantidad.setText(r.getString("Cantidad"));
                precio.setText(r.getString("Precio_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try {
            // TODO add your handling code here:
            if (r.previous()) {
                id.setText(r.getString("Identificador"));
                fecha.setText(r.getString("Fecha"));
                producto.setText(r.getString("Producto"));
                cantidad.setText(r.getString("Cantidad"));
                precio.setText(r.getString("Precio_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void primeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeraActionPerformed
        try {
            if (r.first()) {
                id.setText(r.getString("Identificador"));
                fecha.setText(r.getString("Fecha"));
                producto.setText(r.getString("Producto"));
                cantidad.setText(r.getString("Cantidad"));
                precio.setText(r.getString("Precio_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_primeraActionPerformed

    private void ultimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimaActionPerformed
        try {
            // TODO add your handling code here:
            if (r.last()) {
                id.setText(r.getString("Identificador"));
                fecha.setText(r.getString("Fecha"));
                producto.setText(r.getString("Producto"));
                cantidad.setText(r.getString("Cantidad"));
                precio.setText(r.getString("Precio_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimaActionPerformed

    private void nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaActionPerformed
        // TODO add your handling code here:
        id.setText(null);
        fecha.setText(null);
        producto.setText(null);
        cantidad.setText(null);
        precio.setText(null);

        producto.setEditable(true);
        cantidad.setEditable(true);

        primera.setEnabled(false);
        ultima.setEnabled(false);
        anterior.setEnabled(false);
        siguiente.setEnabled(false);
        volver.setEnabled(false);

        insertar.setEnabled(true);
        cancelar.setEnabled(true);
    }//GEN-LAST:event_nuevaActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        try {
            String vProducto, vCantidad;
            
            
            vProducto = producto.getText();
            vCantidad = cantidad.getText();
            
            
            String url = "jdbc:mysql://localhost:3306/tienda_videojuegos";
            String user = "entornos"; //Cambiar a root y sin contraseña si no está creado el usuario "entornos"
            String pass = "entornos"; //Cambiar a root y sin contraseña si no está creado el usuario "entornos"
            connection = DriverManager.getConnection(url, user, pass);
            
            Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String query = "INSERT INTO Compras (Fecha, Producto, Cantidad, Precio_total) VALUES (CURDATE(), " + vProducto + ", " +vCantidad+ ", (SELECT SUM("+ vCantidad +" * P.Precio) FROM Productos P, Compras C WHERE P.Identificador = " + vProducto + "))";
            
            int resultado = s.executeUpdate(query);
            
            insertar.setEnabled(false);
            cancelar.setEnabled(false);
            primera.setEnabled(true);
            ultima.setEnabled(true);
            anterior.setEnabled(true);
            siguiente.setEnabled(true);
            volver.setEnabled(true);
            producto.setEditable(false);
            cantidad.setEditable(false);
            
            String query2 = "SELECT * FROM Compras";
            r = s.executeQuery(query2);
            r.first();
            id.setText(r.getString("Identificador"));
            fecha.setText(r.getString("Fecha"));
            producto.setText(r.getString("Producto"));
            cantidad.setText(r.getString("Cantidad"));
            precio.setText(r.getString("Precio_total"));
            
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_insertarActionPerformed

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
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField id;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nueva;
    private javax.swing.JTextField precio;
    private javax.swing.JButton primera;
    private javax.swing.JTextField producto;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultima;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
