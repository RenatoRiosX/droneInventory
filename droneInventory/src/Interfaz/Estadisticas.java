package Interfaz;

import Dominio.Sistema;
import Dominio.Vuelo;
import Dominio.Dron;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.Observable;
import java.util.Observer;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class Estadisticas extends javax.swing.JFrame implements Observer {

    public static DefaultTableModel defaultTableModel = new DefaultTableModel();

    public Estadisticas(Sistema unSistema) {
        modelo = unSistema;
        modelo.addObserver(this);
        initComponents();
        // centrar ventana
        this.setLocationRelativeTo(null);
        cargarDrones();

        String[] titulosCol = new String[]{"Archivo", "Área", "Fila", "Exitoso", "Coincidencias", "Diferencias", "Líneas de carga"};
        defaultTableModel.setColumnIdentifiers(titulosCol);
        
        //Para que las celdas de la tabla no sean editables
        tblTablaComparacion.setDefaultEditor(Object.class, null);

        //Se asigna cada titulo a una columna de la tabla
        tblTablaComparacion.setModel(defaultTableModel);
    }

    private void cargarDrones() {
        ArrayList<Dron> listaDronesConVuelo = new ArrayList();
        ArrayList<Dron> listaDronesSinVuelo = new ArrayList();

        for (int i = 0; i < modelo.getListaDrones().size(); i++) {

            Dron dron = modelo.getListaDrones().get(i);

            if (dron.getListaVuelos().isEmpty()) {
                listaDronesSinVuelo.add(dron);
            } else {
                listaDronesConVuelo.add(dron);
            }

        }

        lstDronesConVuelo.setListData(listaDronesConVuelo.toArray());
        lstDronesSinVuelo.setListData(listaDronesSinVuelo.toArray());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaComparacion = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstDronesSinVuelo = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstDronesConVuelo = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadisticas");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Drones sin vuelos");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Drones con vuelos");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Datos de vuelos");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblTablaComparacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo", "Área", "Fila", "¿exito?", "Coincidencias", "Diferencias", "Lineas de carga"
            }
        ));
        tblTablaComparacion.setEnabled(false);
        tblTablaComparacion.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tblTablaComparacion);

        jScrollPane4.setViewportView(lstDronesSinVuelo);

        lstDronesConVuelo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cargarDatosDeDronEnTabla(evt);
            }
        });
        jScrollPane5.setViewportView(lstDronesConVuelo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosDeDronEnTabla(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cargarDatosDeDronEnTabla
       
        Dron dron = (Dron) lstDronesConVuelo.getSelectedValue();
        
        if (dron != null){
        defaultTableModel.setRowCount(0);
        ArrayList<Vuelo> listaVuelos = dron.getListaVuelos();

        for (int i = 0; i < listaVuelos.size(); i++) {
            String cantCargas;
            String exitoso;
            Vuelo vuelo = listaVuelos.get(i);
            if (vuelo.getVueloExitoso()) {
                cantCargas = "--";
            } else {
                cantCargas = vuelo.getCantidadDeCargas() + "";
            }

            if (vuelo.getVueloExitoso()) {
                exitoso = "Si";
            } else {
                exitoso = "No";
            }

            defaultTableModel.addRow(new Object[]{
                vuelo.getNombreDeArchivo(),
                vuelo.getArea(),
                vuelo.getNroDeFila(),
                exitoso,
                vuelo.getCoincidencias(),
                vuelo.getDiferencias(),
                cantCargas,
            });
        }
        }
    }//GEN-LAST:event_cargarDatosDeDronEnTabla

    @Override
    public void update (Observable o, Object arg){
        cargarDrones();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList lstDronesConVuelo;
    private javax.swing.JList lstDronesSinVuelo;
    private javax.swing.JTable tblTablaComparacion;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
