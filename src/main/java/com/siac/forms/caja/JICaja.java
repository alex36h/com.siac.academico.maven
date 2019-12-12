package com.siac.forms.caja;

import com.gekoware.util.Cast;
import com.siac.entities.Arancel;
import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.Documento;
import com.siac.services.FormaPagoMonedaMonto;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.getModel;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JICaja extends javax.swing.JInternalFrame {

    JPACrud x;
    Long Id;
    int tarjeta;
    private Recibo recibo;
    private Reciboarancel reciboArancel;
    private List<Documento> documentos;
    private String de, idEstudiante, observacion, referencia;
    private Banco banco;
    private Arancel arancel;
    private double monto, montoC, abono = 0;
    private Moneda moneda, monedaC, monedaA;
    private List<FormaPagoMonedaMonto> fpmms;
    private Formapago formaPago;
    private Iniciocaja iniciocaja;
    private Pagoestudiante mensualidadPagar;
    private Estudiante estudiante;
    private Beca beca;

    DefaultTableModel model;

    public JICaja() {
        initComponents();
        fillComboBox();
        this.JLErrorDetalle.setText("");
        Init();
        ocultar_columna();
    }

    
          void ocultar_columna(){
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTIdEstudiante = new javax.swing.JTextField();
        JLEstudiante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTRecibimosDe = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        JBAgregarArancel = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JCArancel = new javax.swing.JComboBox<>();
        JLESTA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JCFormaPago = new javax.swing.JComboBox<>();
        JCMondea = new javax.swing.JComboBox<>();
        JCBanco = new javax.swing.JComboBox<>();
        JTReferncia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JBAgregarFormaPago = new javax.swing.JButton();
        JTMonto = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JTTotalDol = new javax.swing.JTextField();
        JTPendienteCor = new javax.swing.JTextField();
        JTTotalCor = new javax.swing.JTextField();
        JTPendienteDol = new javax.swing.JTextField();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        JLErrorDetalle = new javax.swing.JLabel();
        JLROC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLSerie = new javax.swing.JLabel();
        JLMensualidadPagar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ROC:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Estudiante");

        JTIdEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTIdEstudianteKeyPressed(evt);
            }
        });

        jLabel4.setText("Recibimos de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(JLEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTRecibimosDe, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(JTRecibimosDe))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JTIdEstudiante)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Arancel");

        jRadioButton1.setText("Abono");

        JBAgregarArancel.setBackground(new java.awt.Color(2, 136, 209));
        JBAgregarArancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBAgregarArancel.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarArancel.setText("Agregar Arancel");
        JBAgregarArancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarArancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        JCArancel.setBackground(new java.awt.Color(2, 136, 209));
        JCArancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCArancel.setForeground(new java.awt.Color(255, 255, 255));
        JCArancel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLESTA.setForeground(new java.awt.Color(251, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCArancel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBAgregarArancel)
                        .addGap(18, 18, 18)
                        .addComponent(JLESTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jRadioButton1)
                        .addComponent(JBAgregarArancel)
                        .addComponent(JCArancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLESTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setText("Detalle Aranceles");

        jLabel7.setText("Detalle Formas De Pago");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Tipo Forma de Pago");

        jLabel9.setText("Moneda");

        jLabel10.setText("Monto");

        jLabel11.setText("Banco");

        jLabel12.setText("Autorizado");

        JCFormaPago.setBackground(new java.awt.Color(2, 136, 209));
        JCFormaPago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        JCFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Cheque", "Tarjeta" }));

        JCMondea.setBackground(new java.awt.Color(2, 136, 209));
        JCMondea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCMondea.setForeground(new java.awt.Color(255, 255, 255));
        JCMondea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cordobas", "Dolares" }));

        JCBanco.setBackground(new java.awt.Color(2, 136, 209));
        JCBanco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCBanco.setForeground(new java.awt.Color(255, 255, 255));
        JCBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bac", "Banpro", "La Fise" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Forma de Pago", "Moneda", "Monto", "Banco", "Autorizado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        JBAgregarFormaPago.setBackground(new java.awt.Color(2, 136, 209));
        JBAgregarFormaPago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBAgregarFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarFormaPago.setText("Agregar Forma de Pago");
        JBAgregarFormaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarFormaPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCFormaPago, 0, 141, Short.MAX_VALUE)
                            .addComponent(JCBanco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(JCMondea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTReferncia)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBAgregarFormaPago)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(JTMonto)))
                        .addGap(0, 237, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(JCFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCMondea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(JCBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTReferncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBAgregarFormaPago, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Total $");

        jLabel14.setText("Pagado $");

        jLabel15.setText("Total C$");

        jLabel16.setText("Pagdo C$");

        JTTotalDol.setEditable(false);

        JTPendienteCor.setEditable(false);

        JTTotalCor.setEditable(false);

        JTPendienteDol.setEditable(false);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBNuevo.setBackground(new java.awt.Color(2, 136, 209));
        JBNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JBNuevo.setText("Nuevo");

        JLErrorDetalle.setForeground(java.awt.Color.red);
        JLErrorDetalle.setText("Error detalle");

        JLROC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLROC.setForeground(new java.awt.Color(2, 136, 209));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SERIE:");

        JLSerie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLSerie.setForeground(new java.awt.Color(2, 136, 209));

        JLMensualidadPagar.setForeground(new java.awt.Color(2, 136, 209));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLErrorDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTTotalDol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTPendienteDol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(162, 162, 162)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTTotalCor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTPendienteCor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(JLROC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(JLMensualidadPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(JLMensualidadPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLROC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(JLErrorDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(JTTotalDol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTPendienteDol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTTotalCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(JTPendienteCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBAgregarArancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarArancelActionPerformed
        AgregarArancel();
    }//GEN-LAST:event_JBAgregarArancelActionPerformed

    private void JBAgregarFormaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarFormaPagoActionPerformed
        agregarDetalle();
    }//GEN-LAST:event_JBAgregarFormaPagoActionPerformed

    private void JTIdEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTIdEstudianteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getEstudiante();
            getMensualidadPagar();
        }
    }//GEN-LAST:event_JTIdEstudianteKeyPressed

    private void Init() {
        getInicioCaja();
        if (this.iniciocaja == null || this.iniciocaja.getAutorizado() == false) {
            JOptionPane.showMessageDialog(this, "No hay una apertura");
        } else {
            this.JLROC.setText("" + getNumROC());
            this.JLSerie.setText(getInicioCaja().getSerie().getNombre().toUpperCase());
        }
    }

    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelAranceles = new DefaultComboBoxModel((Vector) cm.fillAranceles());
        this.JCArancel.setModel(modelAranceles);

        DefaultComboBoxModel modelFormaPago = new DefaultComboBoxModel((Vector) cm.fillFormaDePago());
        this.JCFormaPago.setModel(modelFormaPago);

        DefaultComboBoxModel modelBanco = new DefaultComboBoxModel((Vector) cm.fillBanco());
        this.JCBanco.setModel(modelBanco);

        DefaultComboBoxModel modelMoneda = new DefaultComboBoxModel((Vector) cm.fillMonedas());
        this.JCMondea.setModel(modelMoneda);
    }

    private void AgregarArancel() {
        try {
            arancel = x.getArancelById((int) this.JCArancel.getSelectedIndex());

            float precioBase = (float) arancel.getPrecio();
            float precioBaseCord = new BigDecimal(arancel.getPrecio() * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue();
            
            if (idEstudiante.equals("0")) {
                if (documentos == null) {
                        documentos = new ArrayList<>();
                    }
                documentos.add(new Documento(arancel, Long.valueOf(0), 0, precioBase - (float) abono,
                        new BigDecimal(precioBaseCord - (float) abono * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue(), false));
            } else {
            Descuento descuento = x.getDescuentos(arancel, idEstudiante.toUpperCase());
            abono = x.getAbonoArancel(arancel, idEstudiante.toUpperCase());
                    x = new JPACrud();
                    beca = x.getBecaActiva(idEstudiante, arancel);    
                if (arancel != null) {
                    if (documentos == null) {
                        documentos = new ArrayList<>();
                    }
                    if (abono > 0) {
                        float calDolar = 0f;
                        float calCord = 0;
                        if (monedaA.getId() == 1) { //Cordobas
                            calCord = (float) abono;
                            calDolar = new BigDecimal(abono / x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue();

                        } else if (monedaA.getId() == 2) { //Dolar
                            calDolar = (float) abono;

                            calCord = new BigDecimal(abono * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue();
                        }

                        documentos.add(new Documento(arancel, Long.valueOf(0), 0, calDolar, calCord, true));
                    } else if (descuento != null) {
                        float calcDescuento = new BigDecimal(precioBase * (descuento.getPorcentaje() / 100)).setScale(4, RoundingMode.HALF_UP).floatValue();

                        float calcDescuentoCord = new BigDecimal(precioBaseCord * (descuento.getPorcentaje() / 100)).setScale(4, RoundingMode.HALF_UP).floatValue();

                        documentos.add(new Documento(arancel, descuento.getId(),
                                (float) descuento.getPorcentaje(), new BigDecimal(precioBase - calcDescuento - (float) abono).setScale(4, RoundingMode.HALF_UP).floatValue(),
                                new BigDecimal(precioBaseCord - calcDescuentoCord - (float) abono * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue(), false));
                    } 
                    
                    else if(beca != null)
                    {
                           float calcBeca = new BigDecimal(precioBase * (beca.getValor() / 100)).setScale(4, RoundingMode.HALF_UP).floatValue();
                           float calcBecaCord = new BigDecimal(precioBaseCord * (beca.getValor() / 100)).setScale(4, RoundingMode.HALF_UP).floatValue(); 
                    
                           documentos.add(new Documento(arancel, beca.getId().longValue(),
                                                (float)beca.getValor(), new BigDecimal(precioBase - calcBeca - 
                                                        (float) abono).setScale(4, RoundingMode.HALF_UP).floatValue(), new BigDecimal(precioBaseCord - calcBecaCord -
                                                                (float) abono * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue(), false));
                    
                    }
                    else {
                        documentos.add(new Documento(arancel, Long.valueOf(0), 0, precioBase - (float) abono,
                                new BigDecimal(precioBaseCord - (float) abono * x.getCambio()).setScale(4, RoundingMode.HALF_UP).floatValue(), false));
                    }  
                }
            }
            RefrescarJTableArancel();
                    this.JTTotalDol.setText("" + getTotal1());
                    this.JTTotalCor.setText("" + getTotal2());
                    this.JTPendienteCor.setText("" + getTotalCor());
                    this.JTPendienteDol.setText("" + getTotalDol());
        } catch (Exception e) {
            System.out.println("damn " + e);
        }
    }

    public void agregarDetalle() {
        monto = Double.parseDouble(this.JTMonto.getText());
        if (monto >= 0) {
            float debe = 0;
            moneda = x.getMonedasById(this.JCMondea.getSelectedIndex());
            if (moneda != null) {
                if (moneda.getId() == 1) {
                    debe = getTotal2() - getTotalCor();
                } else {
                    debe = getTotal1() - getTotalDol();
                }
            }
            if ((float)monto > debe) {
                JOptionPane.showMessageDialog(this, "El monto es superior al total a pagar");
            } else {
                boolean flg = false;
                formaPago = x.getFormaPagoById(this.JCFormaPago.getSelectedIndex());
                banco =  new Banco(1L, "", true);
                if(formaPago.getNombre().toUpperCase().contains("TAR"))
                {
                    banco = x.getBancoById(this.JCBanco.getSelectedIndex());
                }
                
                referencia = this.JTReferncia.getText();
                FormaPagoMonedaMonto tmp = new FormaPagoMonedaMonto(formaPago,
                        moneda, (float) monto, referencia, banco);
                if (fpmms == null) {
                    fpmms = new ArrayList<>();
                } else {
                    flg = tmp.existe(fpmms);
                }
                if (flg) {
                    JOptionPane.showMessageDialog(this, "La forma de pago con la moneda ya fue agregada anteriormente");
                } else {
                    fpmms.add(tmp);
                    formaPago = null;
                    moneda = null;
                    monto = 0;
                    calcular();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Monto no valido", "Error!", ERROR, frameIcon);
        }
        RefrescarJTableDetalle();
        this.JTPendienteCor.setText("" + getTotalCor());
        this.JTPendienteDol.setText("" + getTotalDol());
    }

    public void calcular() {
        if (moneda != null) {
            if (moneda.getId() == 1) {
                monto = getTotal2() - getTotalCor();
            } else {
                monto = getTotal1() - getTotalDol();
            }
        }
    }

    private void RefrescarJTableArancel() {
        try {
            model = getModel(Util.COL_ARANCEL_CAJA, false);

            for (Documento documento : documentos) {
                model.addRow(new Object[]{documento.getArancel().getId(), documento.getArancel().getNombre().toUpperCase(),
                    documento.getMonto()});
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }

    private void RefrescarJTableDetalle() {
        try {
            model = getModel(Util.COL_ARANCEL_CAJA_DETALLE, false);

            for (FormaPagoMonedaMonto documento : fpmms) {
                model.addRow(new Object[]{documento.getFormaPago().getNombre(), documento.getMoneda().getNombre(),
                    documento.getMonto(), documento.getBanco().getNombre(), documento.getReferencia()});
            }
            jTable2.setModel(model);
        } catch (Exception e) {
        }
    }

    private void getEstudiante() {
        x = new JPACrud();
        try {
            
            if(this.JTIdEstudiante.getText().equals("0"))
            {
                idEstudiante = "0";
            }
            else
            {
                this.estudiante = x.getEstudianteByCarnet(this.JTIdEstudiante.getText());
                this.idEstudiante = estudiante.getCarnet();
                String nombre = x.getEstudianteByCarnet(this.JTIdEstudiante.getText()).getPersona().getNombreCompleto();
                this.JLEstudiante.setText(nombre);
                this.JTRecibimosDe.setText(nombre);
            }
            
            
        } catch (Exception e) {
            this.JLEstudiante.setText("No se encontraron registros.."+e);
            this.JTRecibimosDe.setText("");
        }
    }

    public float getTotal1() {
        float total = 0;
        if (documentos != null) {
            for (Documento obj : documentos) {
                total += obj.getMonto();
            }
        }
        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();
    }

    //Total en C$
    public float getTotal2() {
        float total = 0;
        if (documentos != null) {
            for (Documento obj : documentos) {
                total += obj.getMontoCord();
            }
        }
        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();

    }

    public float getTotalDol() {
        float total = 0;
        if (fpmms != null) {
            for (FormaPagoMonedaMonto obj : fpmms) {
                if (obj.getMoneda().getId() == 1) {
                    total += (obj.getMonto() / x.getCambio());
                } else {
                    total += obj.getMonto();
                }
            }
        }
        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();
    }

    public float getTotalCor() {
        float total = 0;
        if (fpmms != null) {
            for (FormaPagoMonedaMonto obj : fpmms) {
                if (obj.getMoneda().getId() == 1) {
                    total += obj.getMonto();
                } else {
                    total += (obj.getMonto() * x.getCambio());
                }
            }
        }
        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();
    }

    private void Save() {
        String err = "RECIBO";
        try {

            if (this.iniciocaja == null) {
                JOptionPane.showMessageDialog(this, "No hay una apertura");
            } else {
                de = this.JTRecibimosDe.getText();
                if (getSaldo() != 0) {
                    JOptionPane.showMessageDialog(this, "El monto pagado debe ser igual al total a pagar");
                } else if (documentos == null || documentos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingrese por lo menos un arancel");
                } else {
                    if (fpmms == null) {
                        fpmms = new ArrayList<>();
                    }
                    int num = getNumROC();
                    //RECIBO
                    Recibo obj = getRecibo();
                    obj.setCredencial(x.getCredencial());
                    obj.setSerie(iniciocaja.getSerie());
                    obj.setNumero(num);
                    obj.setDe(de);
                    obj.setEstudiante(idEstudiante);
                    obj.setObservacion(observacion);
                    obj.setTotalDol(getTotalDol());
                    obj.setTotalCor(getTotalCor());
                    x.save(obj);

                    x = new JPACrud();
                    err = "getLastROCByUsr";
                    obj = x.getLastROCByUsr(x.getCredencial(), iniciocaja.getSerie(), num, idEstudiante.toUpperCase());
                    err = "FORMA DE PAGO";
                    //FORMA DE PAGO

                    for (FormaPagoMonedaMonto tmp : fpmms) {
                        x = new JPACrud();
                        Detallerecibo dr = new Detallerecibo();
                        dr.setRecibo(obj);
                        if (tarjeta == 1) {
                            formaPago = x.getFormaPago();
                            dr.setFormaPago(formaPago);
                        } else {
                            dr.setFormaPago(tmp.getFormaPago());
                        }
                        dr.setMoneda(tmp.getMoneda());
                        dr.setMonto(tmp.getMonto());
                        dr.setBanco(tmp.getBanco());
                        dr.setReferencia(tmp.getReferencia());
                        x.save(dr);
                    }

                    List<Reciboarancel> reciboArancel = new ArrayList<>();
                    err = "RECIBO ARANCEL";
                    //RECIBO ARANCEL
                    for (Documento tmp : documentos) {
                        
                        Reciboarancel ra = new Reciboarancel();
                        ra.setRecibo(obj);
                        ra.setArancel(tmp.getArancel());
                        ra.setAbono(tmp.isAbono());
                        ra.setDescuentoId(tmp.getDescuentoId().intValue());
                        ra.setMonto(tmp.getMonto());
                        ra.setPorcentajeDescuento((double) tmp.getPorcentajeDescuento());
                        ra.setTipo(Reciboarancel.NORMAL);
                        
                        if(ra.getArancel().getNombre().toUpperCase().contains("MATRICULA"))
                        {
                            x = new JPACrud();
                            x.generarMensualidades(estudiante);
                            err = "GENERAR  MENSUALIDADES";
                        }
                        
                        if(ra.getArancel().getNombre().toUpperCase().contains("MENSUALIDAD") 
                                && !ra.getArancel().getNombre().toUpperCase().contains("RECARGO")
                                && abono == 0)
                        {
                            x = new JPACrud();
                            Pagoestudiante pagoestudiante = x.getPagoEstudiante(mensualidadPagar);
                            pagoestudiante.setPagado(true);
                            pagoestudiante.setRecibo(obj);
                            pagoestudiante.setTipoCancelacion(0);
                            x.update(pagoestudiante);
                            err = "PAGO ESTUDIANTE";
                        }
                        
                        x = new JPACrud();
                        x.save(ra);
                        reciboArancel.add(ra);
                        //TODO
                    }
                    JOptionPane.showMessageDialog(this, "Guardado");
                }
            }
        } catch (Exception e) {
            System.out.println("Save: " + err + " " + e);
        }
    }

    public float getSaldo() {
        return Cast.round(getTotal1() - getTotalDol());
    }

    public int getNumROC() {
        if (iniciocaja != null) {
            return x.getNumROC(iniciocaja.getSerie()) + 1;
        } else {
            return 0;
        }
    }

    public Recibo getRecibo() {
        Recibo obj = new Recibo();
        obj.setAnulado(false);
        obj.setFecha(new Date());
        return obj;
    }
   
    public Iniciocaja getInicioCaja() {
        x = new JPACrud();
        if (iniciocaja == null) {
            iniciocaja = x.getInicioCaja(x.getCredencial());
        }
        return iniciocaja;
    }
    
    public void getMensualidadPagar()
    {
        x = new JPACrud();
        mensualidadPagar = x.getMensualidadPagar(idEstudiante);
        if(mensualidadPagar != null)
        {
            this.JLMensualidadPagar.setText("SIGUIENTE MENSUALIDAD A PAGAR: "+mensualidadPagar.getArancel().getNombre().toUpperCase());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarArancel;
    private javax.swing.JButton JBAgregarFormaPago;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCArancel;
    private javax.swing.JComboBox<String> JCBanco;
    private javax.swing.JComboBox<String> JCFormaPago;
    private javax.swing.JComboBox<String> JCMondea;
    private javax.swing.JLabel JLESTA;
    private javax.swing.JLabel JLErrorDetalle;
    private javax.swing.JLabel JLEstudiante;
    private javax.swing.JLabel JLMensualidadPagar;
    private javax.swing.JLabel JLROC;
    private javax.swing.JLabel JLSerie;
    private javax.swing.JTextField JTIdEstudiante;
    private javax.swing.JFormattedTextField JTMonto;
    private javax.swing.JTextField JTPendienteCor;
    private javax.swing.JTextField JTPendienteDol;
    private javax.swing.JTextField JTRecibimosDe;
    private javax.swing.JTextField JTReferncia;
    private javax.swing.JTextField JTTotalCor;
    private javax.swing.JTextField JTTotalDol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
