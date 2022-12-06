package Interfaz;

import Dominio.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class IngresoManual extends javax.swing.JFrame implements Observer{
    private int indice = 0;
    public JButton btnAnterior;
    Area areas[];
    
    public IngresoManual(Sistema unSistema) {
        
        modelo = unSistema;
        modelo.addObserver(this);

        initComponents();
        
        // centrar ventana
        this.setLocationRelativeTo(null);
        crearMatrizConBotones();
        
        areas = modelo.getListaAreas();
        ArrayList<Funcionario> lstFuns = modelo.getListaFuncionarios();
        Collections.sort(lstFuns);
        
        for (int i = 0; i < lstFuns.size(); i++) {
            System.out.println(lstFuns.get(i));
            
        }
        lstFuncionarios.setListData( lstFuns.toArray());
        lstArticulos.setListData( modelo.getListaArticulos().toArray());
    }

    private void crearMatrizConBotones() {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {

                int fila = i + 1;
                int columna = j + 1;
                JButton nuevo = new JButton(" ");

                nuevo.setMargin(new Insets(-5, -5, -5, -5));
                nuevo.setBackground(Color.GRAY);
                nuevo.setForeground(Color.WHITE);

                // A cada boton se le asigna como texto el nro de fila y columna al cual pertenece
                nuevo.setText(fila + ":" + columna);
                nuevo.addActionListener(new EspacioListener());
                pnlMatrizDeBotones.add(nuevo);
                

            }

        }

    }

    private void limpiarLabelsEgresoDeCarga(){
        lblCodigo.setText("--");
        lblArticulo.setText("--");
        lblFuncionario.setText("--");
        lblCantidad.setText("--");
    }
    
    private void verIngreso(){
        pnlIngreso.setVisible(true);
        pnlEgreso.setVisible(false);
    
    }
    
    private void verEgreso(){
        pnlIngreso.setVisible(false);
        pnlEgreso.setVisible(true);
    
    }
    
    private void mostrarDatosEnEgreso(Carga carga){
        lblCodigo.setText(carga.getCodigoManual()+"");
        lblArticulo.setText(carga.getArticulo()+"");
        lblFuncionario.setText(carga.getFuncionario()+"");
        lblCantidad.setText(carga.getCantidadDeArticulos()+"");  
    } 
    
    public class EspacioListener implements ActionListener {
        
        public static int coordX;
        public static int coordY;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(btnAnterior != null){
                btnAnterior.setBackground(Color.GRAY);
            }
            
            //Este código se ejecutará al presionar un boton de la matriz
            JButton btnPresionado = ((JButton) e.getSource());
            btnAnterior =  ((JButton) e.getSource());            
            
            String coordenada[] = btnPresionado.getText().split(":");
            
            coordX = Integer.parseInt(coordenada[0]);
            //La coordenada que tiene getText es +1 de la que se tiene en la matriz
            coordX = coordX - 1;
            
            coordY = Integer.parseInt(coordenada[1]);
            coordY = coordY - 1;            
            
            //Al boton presionado se le asigna un color diferente
            btnPresionado.setBackground(Color.BLUE);

            Area areaDeseada = areas[indice];
            Carga carga = areaDeseada.area[coordX][coordY];            
           
      
            if (carga != null && carga.getFuncionario() != null && carga.getArticulo() != null){
               verEgreso();
               mostrarDatosEnEgreso(carga);                    
                
            } else {
                verIngreso();                
                limpiarLabelsEgresoDeCarga();
            }
             
        }
    }
    /*
     * WARNING: Do NOT modify this code. The content of this method is always
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        pnlMatrizDeBotones = new javax.swing.JPanel();
        btnAreaAnterior = new javax.swing.JButton();
        btnAreaSiguiente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblAreaActual = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlEgreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        btnEgresar = new javax.swing.JButton();
        pnlIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList();
        txtCodigo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso y egreso manual");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        pnlMatrizDeBotones.setBackground(new java.awt.Color(51, 51, 51));
        pnlMatrizDeBotones.setLayout(new java.awt.GridLayout(12, 10, 2, 1));

        btnAreaAnterior.setText("<<");
        btnAreaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaAnteriorActionPerformed(evt);
            }
        });

        btnAreaSiguiente.setText(">>");
        btnAreaSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaSiguienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Área:");

        lblAreaActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAreaActual.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaActual.setText("A");

        pnlEgreso.setBackground(new java.awt.Color(102, 153, 255));
        pnlEgreso.setPreferredSize(new java.awt.Dimension(435, 268));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Egreso");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Artículo");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Funcionario");

        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("--");

        lblArticulo.setForeground(new java.awt.Color(255, 255, 255));
        lblArticulo.setText("--");

        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("--");

        lblFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblFuncionario.setText("--");

        btnEgresar.setBackground(new java.awt.Color(255, 102, 102));
        btnEgresar.setText("Egresar");
        btnEgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEgresoLayout = new javax.swing.GroupLayout(pnlEgreso);
        pnlEgreso.setLayout(pnlEgresoLayout);
        pnlEgresoLayout.setHorizontalGroup(
            pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgresoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEgresoLayout.createSequentialGroup()
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlEgresoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        pnlEgresoLayout.setVerticalGroup(
            pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgresoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblArticulo))
                .addGap(18, 18, 18)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEgresar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlIngreso.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingreso");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Funcionarios");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Articulos");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Código");

        btnAgregar1.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar1.setText("Ingresar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        lstArticulos.setBackground(java.awt.Color.lightGray);
        lstArticulos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        lstFuncionarios.setBackground(java.awt.Color.lightGray);
        lstFuncionarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstFuncionarios);

        txtCodigo.setBackground(java.awt.Color.lightGray);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout pnlIngresoLayout = new javax.swing.GroupLayout(pnlIngreso);
        pnlIngreso.setLayout(pnlIngresoLayout);
        pnlIngresoLayout.setHorizontalGroup(
            pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIngresoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlIngresoLayout.createSequentialGroup()
                        .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlIngresoLayout.setVerticalGroup(
            pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresoLayout.createSequentialGroup()
                .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlIngresoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnAgregar1))
                    .addGroup(pnlIngresoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(pnlEgreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlIngreso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("      1             2             3             4             5             6              7             8            9           10");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("1");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("2");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("3");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("4");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("8");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("5");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("6");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("7");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("12");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("9");

        jLabel23.setDisplayedMnemonic('\n');
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("10");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblAreaActual))
                    .addComponent(pnlMatrizDeBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAreaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAreaSiguiente)
                        .addGap(92, 92, 92)))
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAreaActual))
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlMatrizDeBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAreaAnterior)
                            .addComponent(btnAreaSiguiente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresarActionPerformed
        
        Area areaDeseada = areas[indice];
        
        Carga cargaSeleccionada = areaDeseada.area[EspacioListener.coordX][EspacioListener.coordY];
        cargaSeleccionada.setArticulo(null);
        cargaSeleccionada.setFuncionario(null);
        cargaSeleccionada.setCantidadDeArticulos(0);
        cargaSeleccionada.setCodigoCarga(0);
        
        limpiarLabelsEgresoDeCarga();
        verIngreso();
    }//GEN-LAST:event_btnEgresarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        try{
            Funcionario funcionario = (Funcionario) lstFuncionarios.getSelectedValue();
            Articulo articulo = (Articulo) lstArticulos.getSelectedValue();
            int cantidadArticulos = Integer.parseInt(txtCantidad.getText());
            int codigoCarga = Integer.parseInt(txtCodigo.getText());
            Area areaDeseada = areas[indice];
            
            HashMap<Integer,Integer> codigosDeCarga = modelo.getCodigosDeCarga();
            
            //Si no se seleeciona un funcionario y un articulo
            if(funcionario == null || articulo == null){
                mostrarMensajeError("Se debe seleccionar un funcionario y un artículo.");
            }else{
                //Debe de haber al menos un articulo
                if(cantidadArticulos < 1){
                    mostrarMensajeError("La cantidad de articulos no puede ser menor a 1.");
                }else{
                    
                    if(codigosDeCarga.containsKey(codigoCarga)){
                        mostrarMensajeError("El codigo de carga debe ser único.");
                    } else{
                        
                        Carga carga = new Carga (articulo,funcionario,cantidadArticulos,codigoCarga);        

                        areaDeseada.area[EspacioListener.coordX][EspacioListener.coordY]= carga;

                        txtCantidad.setText("");
                        txtCodigo.setText("");
                        mostrarDatosEnEgreso(carga);  
                        verEgreso();
                        JOptionPane.showMessageDialog(this, "La carga ha sido ingresada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                        codigosDeCarga.put(codigoCarga, 1);
                    }
                    
                }
                
            }
         //Si en cantidad de articulos o codigo de carga se ingresa un string el lugar de un int, se captura la excepcion
        }catch(NumberFormatException e){
            mostrarMensajeError("Cantidad de articulos y codigo de carga, solo aceptan numeros.");
        }
        
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    public void mostrarMensajeError(String mensaje) {
        Object[] opciones = {"Aceptar", "Cancelar"};

        JOptionPane.showOptionDialog(rootPane, mensaje, "Error",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.ERROR_MESSAGE, null, opciones, "Aceptar");
    }
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAreaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaAnteriorActionPerformed
        
        if (indice > 0){
            indice--;
        }
        
        Area areaDeseada = areas[indice];
        lblAreaActual.setText(areaDeseada.getIdArea());
        verIngreso();
    }//GEN-LAST:event_btnAreaAnteriorActionPerformed

    private void btnAreaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaSiguienteActionPerformed
                        
        if (indice < 4){
            indice++;
        }
        
        Area areaDeseada = areas[indice];
        lblAreaActual.setText(areaDeseada.getIdArea());
        verIngreso();
    }//GEN-LAST:event_btnAreaSiguienteActionPerformed
    
    @Override
    public void update (Observable o, Object arg){
        lstFuncionarios.setListData( modelo.getListaFuncionarios().toArray());
        lstArticulos.setListData( modelo.getListaArticulos().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAreaAnterior;
    private javax.swing.JButton btnAreaSiguiente;
    private javax.swing.JButton btnEgresar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAreaActual;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstFuncionarios;
    private javax.swing.JPanel pnlEgreso;
    private javax.swing.JPanel pnlIngreso;
    private javax.swing.JPanel pnlMatrizDeBotones;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
