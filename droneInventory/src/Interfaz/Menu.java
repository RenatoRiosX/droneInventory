package Interfaz;

import Dominio.*;
import Persistencia.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class Menu extends javax.swing.JFrame {

    //private Persistir persistir; de esta manera no funciona, tenemos que instanciar la clase, aunque tecnicamente no seria correcto
    Persistir persistir = new Persistir();

    public Menu(Sistema unSistema) {

        modelo = unSistema;
        initComponents();

        // centrar ventana
        this.setLocationRelativeTo(null);

    }

    // WARNING: Do NOT modify this code. The content of this method is always
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarArticulo = new javax.swing.JButton();
        btnRegistrarDron = new javax.swing.JButton();
        btnRegistrarFuncionario = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarVuelo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIngresoManual = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Control de inventario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnRegistrarArticulo.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarArticulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarArticulo.setText("Registrar artículo");
        btnRegistrarArticulo.setMaximumSize(new java.awt.Dimension(175, 26));
        btnRegistrarArticulo.setMinimumSize(new java.awt.Dimension(175, 26));
        btnRegistrarArticulo.setPreferredSize(new java.awt.Dimension(175, 26));
        btnRegistrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarArticuloActionPerformed(evt);
            }
        });

        btnRegistrarDron.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarDron.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarDron.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDron.setText("Registrar dron");
        btnRegistrarDron.setMaximumSize(new java.awt.Dimension(175, 26));
        btnRegistrarDron.setMinimumSize(new java.awt.Dimension(175, 26));
        btnRegistrarDron.setPreferredSize(new java.awt.Dimension(175, 26));
        btnRegistrarDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDronActionPerformed(evt);
            }
        });

        btnRegistrarFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarFuncionario.setText("Registrar funcionario");
        btnRegistrarFuncionario.setMaximumSize(new java.awt.Dimension(175, 26));
        btnRegistrarFuncionario.setMinimumSize(new java.awt.Dimension(175, 26));
        btnRegistrarFuncionario.setPreferredSize(new java.awt.Dimension(175, 26));
        btnRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFuncionarioActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/dron.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Drone inventory");

        btnRegistrarVuelo.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarVuelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarVuelo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVuelo.setActionCommand("Registrar vuelo");
        btnRegistrarVuelo.setLabel("Registrar vuelo");
        btnRegistrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVueloActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(77, 62, 62));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnIngresoManual.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresoManual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresoManual.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresoManual.setText("Ingreso / Egreso manual de carga");
        btnIngresoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoManualActionPerformed(evt);
            }
        });

        btnEstadisticas.setBackground(new java.awt.Color(102, 102, 102));
        btnEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagen)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarDron, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarVuelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresoManual, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDron, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresoManual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarArticuloActionPerformed

        RegistrarArticulo ventanaRegistrarArticulo = new RegistrarArticulo(modelo);
        ventanaRegistrarArticulo.setVisible(true);

    }//GEN-LAST:event_btnRegistrarArticuloActionPerformed

    private void btnRegistrarDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDronActionPerformed
        RegistrarDron ventanaRegistrarDron = new RegistrarDron(modelo);
        ventanaRegistrarDron.setVisible(true);
    }//GEN-LAST:event_btnRegistrarDronActionPerformed

    private void btnRegistrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFuncionarioActionPerformed
        RegistrarFuncionario ventanaRegistrarFuncionario = new RegistrarFuncionario(modelo);
        ventanaRegistrarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarFuncionarioActionPerformed

    private void btnRegistrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVueloActionPerformed
        RegistrarVuelo ventanaRegistrarVuelo = new RegistrarVuelo(modelo);
        ventanaRegistrarVuelo.setVisible(true);
    }//GEN-LAST:event_btnRegistrarVueloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoManualActionPerformed
        IngresoManual ventanaIngresoManual = new IngresoManual(modelo);
        ventanaIngresoManual.setVisible(true);
    }//GEN-LAST:event_btnIngresoManualActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Estadisticas ventanaEstadisticas = new Estadisticas(modelo);
        ventanaEstadisticas.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing
    
    public void cerrar() {
        try {
            persistir.almacenarDatos(modelo);
            
        } catch (IOException ex) {          
            System.out.println("ERROR: no se ha podido acceder al archivo.");
            System.exit(0);
        }
        
        Object[] opciones = {"Aceptar", "Cancelar"};
        
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Seguro desea salir?", "Mensaje de Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } 
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnIngresoManual;
    private javax.swing.JButton btnRegistrarArticulo;
    private javax.swing.JButton btnRegistrarDron;
    private javax.swing.JButton btnRegistrarFuncionario;
    private javax.swing.JButton btnRegistrarVuelo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
