package com.siac.forms.caja;

import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.Documento;
import com.siac.services.FormaPagoMonedaMonto;
import com.siac.services.JPACrud;
import com.siac.services.TotalesApertura;
import com.siac.services.Util;
import static com.siac.services.Util.getModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIApertura extends javax.swing.JInternalFrame {

    private Serierecibo serie;
    private Formapago formaPago;
    private Moneda moneda;
    private float monto;
    private List<FormaPagoMonedaMonto> fp;
    private List<TotalesApertura> totales;
    private TotalesApertura moneda1 = null;
    private TotalesApertura moneda2 = null;
    private Credencial cred;
    
    JPACrud x;
    DefaultTableModel model;
    
    public JIApertura() {
        initComponents();
        Init();
        fillComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        JCFormaDePago = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JCMoneda = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBApertura = new javax.swing.JButton();
        JLCredendencial = new javax.swing.JLabel();
        JTMontoMasq = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JLFecha = new javax.swing.JLabel();
        JBAgregar = new javax.swing.JButton();
        JCSerie = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JLROC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        JCFormaDePago.setBackground(new java.awt.Color(2, 136, 209));
        JCFormaDePago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCFormaDePago.setForeground(new java.awt.Color(255, 255, 255));
        JCFormaDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Moneda");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Apertura de Caja");

        JCMoneda.setBackground(new java.awt.Color(2, 136, 209));
        JCMoneda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCMoneda.setForeground(new java.awt.Color(255, 255, 255));
        JCMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Forma de Pago", "Moneda", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Usuario");

        jLabel7.setText("Monto");

        JBApertura.setBackground(new java.awt.Color(2, 136, 209));
        JBApertura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBApertura.setForeground(new java.awt.Color(255, 255, 255));
        JBApertura.setText("Aperturar Caja");
        JBApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAperturaActionPerformed(evt);
            }
        });

        JLCredendencial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLCredendencial.setText("Credencial");

        jLabel3.setText("Fecha");

        jLabel4.setText("Serie");

        JLFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLFecha.setText("Fecha");

        JBAgregar.setBackground(new java.awt.Color(2, 136, 209));
        JBAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        JCSerie.setBackground(new java.awt.Color(2, 136, 209));
        JCSerie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCSerie.setForeground(new java.awt.Color(255, 255, 255));
        JCSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCSerie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCSerieItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MONEDA", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Forma de Pago");

        jLabel10.setText("ROC Inicial");

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(2, 136, 209));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Detalle por forma de pago");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(221, 221, 221))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Resumen por Moneda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(232, 232, 232))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JLCredendencial, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(JLFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(44, 44, 44)
                                .addComponent(JCSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(JLROC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JBApertura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBAgregar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCFormaDePago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTMontoMasq, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JLCredendencial)
                    .addComponent(jLabel4)
                    .addComponent(JCSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(JLFecha)
                        .addComponent(jLabel10))
                    .addComponent(JLROC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JCMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTMontoMasq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBAgregar)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBApertura)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        Agregar();
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JBAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAperturaActionPerformed
       Save();
    }//GEN-LAST:event_JBAperturaActionPerformed

    private void JCSerieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCSerieItemStateChanged
        this.JLROC.setText(""+getRocApertura());
    }//GEN-LAST:event_JCSerieItemStateChanged

       private void Init()
    {
        x = new JPACrud();
        this.JLCredendencial.setText(x.getCredencial().getPersona().getApellido());
        this.JLFecha.setText(Date.from(Instant.now()).toString());
        cred = x.getCredencial();
    }
    
    private void Save()
    {
        try {
            x = new JPACrud();
            if(fp == null)
                JOptionPane.showMessageDialog(this, "Debe de ingresar al menos una forma de pago");
            
            else {
            Iniciocaja obj = getApertura();
            obj.setSerie(serie);
            obj.setCredencial(cred);
            obj.setNumero(getRocApertura());
            obj.setAutorizado(Boolean.FALSE);
            List<Detalleiniciocaja> lista = new ArrayList<>();

                if (x.getInicioCajaBySerie(serie) == null) {
                    x.save(obj);
                    x = new JPACrud();
                    obj = x.getInicioCajaByCredSerie(cred, serie);
                    for (FormaPagoMonedaMonto fpmm : fp) {
                        Detalleiniciocaja dic = new Detalleiniciocaja();
                        dic.setInicioCaja(obj);
                        dic.setFormaPago(fpmm.getFormaPago());
                        dic.setMoneda(fpmm.getMoneda());
                        dic.setMonto(fpmm.getMonto());
                        x.save(dic);
                        lista.add(dic);
                    }
                    JOptionPane.showMessageDialog(this, "Se realizo la apertura con exito");
                } else {
                    JOptionPane.showMessageDialog(this, "Imposible aperturar la caja, ya existe una apertura con este usuario y serie");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    
    }
    
    private void Agregar()
    {
        x = new JPACrud();
        try {
            
            this.serie = x.getSeriereciboById(this.JCSerie.getSelectedIndex());
            this.moneda = x.getMonedasById(this.JCMoneda.getSelectedIndex());
            this.formaPago = x.getFormaPagoById(this.JCFormaDePago.getSelectedIndex());
            this.monto = Float.parseFloat(this.JTMontoMasq.getText());
            
            FormaPagoMonedaMonto fpTemp = new FormaPagoMonedaMonto(formaPago, moneda, monto, null, null);

            if(totales == null)
                totales = new ArrayList<>();
            
            if (fp == null) {
                fp = new ArrayList<>();
            } 
            
            if(fpTemp.existe(fp))
            {
                JOptionPane.showMessageDialog(this, "Ya existe una forma de pago con esa moneda");
            }else{
                fp.add(fpTemp);
               
                if(fpTemp.getMoneda().getId() == 1)
                {
                    totales.add(new TotalesApertura(fpTemp.getMoneda(), monto));
                }
                else{
                    totales.add(new TotalesApertura(fpTemp.getMoneda(), monto));
                }
            }
              RefrescarJTableResumenPorMoneda();
              RefrescarJTableDetalleFormaPago();
        } catch (Exception e) {
            System.out.println("Agregar Apertura: "+e);
        }
    }
    
    private void RefrescarJTableResumenPorMoneda() {
        try {
            model = getModel(Util.COL_RESUMEN_MONEDA, false);
            int total1 = 0;
            int total2 = 0;
            
            for (TotalesApertura fpTemp : totales) {
                if(fpTemp.getMoneda().getId() ==1)
                {
                    total1 += fpTemp.getMonto();
                    moneda1 = new TotalesApertura(fpTemp.getMoneda(), total1);               
                }  
                
                if(fpTemp.getMoneda().getId() == 2)
                {
                    total2 += fpTemp.getMonto();
                    
                    moneda2 = new TotalesApertura(fpTemp.getMoneda(), total2);
                }
            }
            
            if(moneda1 != null)
                model.addRow(new Object[]{moneda1.getMoneda().getNombre(), moneda1.getMonto()});
            if(moneda2 != null)
                model.addRow(new Object[]{moneda2.getMoneda().getNombre(), moneda2.getMonto()});
            
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private void RefrescarJTableDetalleFormaPago() {
        try {
            model = getModel(Util.COL_RESUMEN_FORMA_PAGO, false);

            for (FormaPagoMonedaMonto fpmm : fp) {

                model.addRow(new Object[]{fpmm.getFormaPago().getNombre(),fpmm.getMoneda().getNombre(), fpmm.getMonto()});
            }
            jTable2.setModel(model);
        } catch (Exception e) {
        }
    }
    
    public float getTotalDol() {
        float total = 0;
        if (fp != null) {
            for (FormaPagoMonedaMonto obj : fp) {
                if (obj.getMoneda().getId() == 2) {
                    total += obj.getMonto();
                } 
            }
        }

        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();
    }

    public float getTotalCor() {
        float total = 0;
        if (fp != null) {
            for (FormaPagoMonedaMonto obj : fp) {
                if (obj.getMoneda().getId() == 1) {
                    total += obj.getMonto();
                }
            }
        }
        return new BigDecimal(total).setScale(4, RoundingMode.HALF_UP).floatValue();
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();

        DefaultComboBoxModel modelFormaPago = new DefaultComboBoxModel((Vector) cm.fillFormaDePagoApertura());
        this.JCFormaDePago.setModel(modelFormaPago);

        DefaultComboBoxModel modelMoneda = new DefaultComboBoxModel((Vector) cm.fillMonedas());
        this.JCMoneda.setModel(modelMoneda);
        
        DefaultComboBoxModel modelSerie = new DefaultComboBoxModel((Vector) cm.fillSerie());
        this.JCSerie.setModel(modelSerie);
    }
    
    public Iniciocaja getApertura() {
        Iniciocaja obj = new Iniciocaja();
        obj.setCerrado(false);
        obj.setFecha(new Date());
        return obj;
    }
    
      public int getRocApertura() {
        return x.getNumROC(serie) + 1;

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBApertura;
    private javax.swing.JComboBox<String> JCFormaDePago;
    private javax.swing.JComboBox<String> JCMoneda;
    private javax.swing.JComboBox<String> JCSerie;
    private javax.swing.JLabel JLCredendencial;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLROC;
    private javax.swing.JFormattedTextField JTMontoMasq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
