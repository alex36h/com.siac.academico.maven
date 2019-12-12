package com.siac.forms.caja;

import com.siac.entities.Cierrecaja;
import com.siac.entities.Detallecierrecaja;
import com.siac.entities.Detallerecibo;
import com.siac.entities.Iniciocaja;
import com.siac.entities.Recibo;
import com.siac.services.FormaPagoMonedaMonto;
import com.siac.services.JPACrud;
import com.siac.services.Saldo;
import com.siac.services.Total;
import com.siac.services.TotalesApertura;
import com.siac.services.Util;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.limpiarJTable;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utilidades.DetalleCierreCajaDenominaciones;

public class JICierreCaja extends javax.swing.JInternalFrame {

    public JICierreCaja() {
        initComponents();
        load();
    }
    
    private Iniciocaja iniciocaja;
    private List<FormaPagoMonedaMonto> fpmms;
    private List<Total> totales;
    private List<Saldo> saldos;
    private List<Saldo> tarjetas;
    private List<Recibo> recibos;
    private List<Detallerecibo> detallerecibo;
    private TotalesApertura moneda1 = null;
    private TotalesApertura moneda2 = null;
    private List<DetalleCierreCajaDenominaciones> objDetalleDeniminaciones;
    
    private JPACrud x;
    DefaultTableModel model;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTCajero = new javax.swing.JTextField();
        JTApertura = new javax.swing.JTextField();
        JTSerie = new javax.swing.JTextField();
        JTROCActual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JMonedaTotal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTFormaPagoMonedaTotal = new javax.swing.JTable();
        JbCierre = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTDetalleC$ = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTDetalle$ = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arqueo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setText("Cajero");

        jLabel3.setText("Apertura");

        jLabel4.setText("Serie");

        jLabel5.setText("Recibo Actual");

        JTCajero.setEditable(false);
        JTCajero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        JTApertura.setEditable(false);
        JTApertura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        JTSerie.setEditable(false);
        JTSerie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        JTROCActual.setEditable(false);
        JTROCActual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        JMonedaTotal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JMonedaTotal);

        jPanel3.setBackground(new java.awt.Color(2, 136, 209));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Detalle por forma de pago");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(281, 281, 281))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        JTFormaPagoMonedaTotal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTFormaPagoMonedaTotal);

        JbCierre.setBackground(new java.awt.Color(2, 136, 209));
        JbCierre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JbCierre.setForeground(new java.awt.Color(255, 255, 255));
        JbCierre.setText("Liquidar Caja");
        JbCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCierreActionPerformed(evt);
            }
        });

        JTDetalleC$.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null},
                {"5", null, null},
                {"10", null, null},
                {"20", null, null},
                {"50", null, null},
                {"100", null, null},
                {"200", null, null},
                {"500", null, null},
                {"1000", null, null}
            },
            new String [] {
                "Denominacion", "Cantidad", "Total C$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTDetalleC$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTDetalleC$KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTDetalleC$KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTDetalleC$KeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(JTDetalleC$);

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalle por denominaciones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(281, 281, 281))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        JTDetalle$.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null},
                {"2", null, null},
                {"5", null, null},
                {"10", null, null},
                {"20", null, null},
                {"50", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Denominacion", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTDetalle$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTDetalle$KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(JTDetalle$);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(JTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JTROCActual, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JbCierre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(JTCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(JTApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTROCActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbCierre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCierreActionPerformed
        cerrar();
    }//GEN-LAST:event_JbCierreActionPerformed

    private void JTDetalleC$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTDetalleC$KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateJTDetalleC$();
        }
    }//GEN-LAST:event_JTDetalleC$KeyPressed

    private void JTDetalle$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTDetalle$KeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            updateJTDetalle$();
//        }
    }//GEN-LAST:event_JTDetalle$KeyPressed

    private void JTDetalleC$KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTDetalleC$KeyTyped
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            updateJTDetalle$();
//        }
    }//GEN-LAST:event_JTDetalleC$KeyTyped

    private void JTDetalleC$KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTDetalleC$KeyReleased
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            updateJTDetalle$();
//        }
    }//GEN-LAST:event_JTDetalleC$KeyReleased

    private void updateJTDetalleC$()
    {
        try {     
            TableModel modelTable = JTDetalleC$.getModel();
            int selectedValue = JTDetalleC$.getSelectedRow();

            if(selectedValue > 0)
                selectedValue = selectedValue - 1;
            else if(selectedValue == JTDetalleC$.getRowCount())
                selectedValue = JTDetalleC$.getSelectedRow();
            double denominacion = Double.parseDouble((String) modelTable.getValueAt(selectedValue, 0));
            double cantidad = Double.parseDouble((String) modelTable.getValueAt(selectedValue, 1));
            double total = denominacion * cantidad;
            
            modelTable.setValueAt(denominacion, selectedValue, 0);
            modelTable.setValueAt(cantidad, selectedValue, 1);
            modelTable.setValueAt(total, selectedValue, 2);
            
        } catch (Exception e) {
            System.out.println("updateJTDetalleC$() "+e);
        }
    }
    
    private void updateJTDetalle$()
    {
        try {     
            TableModel modelTable = JTDetalle$.getModel();
            int selectedValue = JTDetalle$.getSelectedRow();
        
            double denominacion = Double.parseDouble((String) modelTable.getValueAt(JTDetalle$.getSelectedRow(), 0));
            double cantidad = Double.parseDouble((String) modelTable.getValueAt(JTDetalle$.getSelectedRow(), 1));
            double total = denominacion * cantidad;
            
            modelTable.setValueAt(denominacion, selectedValue, 0);
            modelTable.setValueAt(cantidad, selectedValue, 1);
            modelTable.setValueAt(total, selectedValue, 2);
            
        } catch (Exception e) {
            System.out.println("updateJTDetalleC$() "+e);
        }
    }
    
    public void load() {
        
        int total1 = 0;
        int total2 = 0;
        
        if (iniciocaja == null) {
            x = new JPACrud();
            iniciocaja = x.getInicioCaja(x.getCredencial());
        }
        if (iniciocaja != null) {
            x = new JPACrud();
            recibos = x.getRecibosHoy(iniciocaja);
            totales = new ArrayList<>();
            saldos = new ArrayList<>();
            tarjetas = new ArrayList<>();
            
            this.JTCajero.setText(x.getCredencial().getPersona().getApellido());
            this.JTApertura.setText(iniciocaja.getId().toString());
            this.JTROCActual.setText(""+getNumero());
            this.JTSerie.setText(iniciocaja.getSerie().getNombre().toUpperCase());
            
            model = getModel(Util.COL_RESUMEN_MONEDA, false);
            
            for (Recibo rec : recibos) {
                if (!rec.getAnulado()) {
                    x = new JPACrud();
                    for (Detallerecibo obj : x.getDetalleRecibo(rec)) {
                        boolean flg1 = false;
                            for (Total tmp : totales) {
                            if (tmp.getMoneda().getId().equals(obj.getMoneda().getId())) {
                                tmp.setMonto((float) (tmp.getMonto() + obj.getMonto()));
                                flg1 = true;                               
                                break;
                            }       
                        }
                        if (!flg1) {
                            totales.add(new Total(obj.getMoneda(), (float) obj.getMonto()));
                        }
                        boolean flg2 = false;
                        for (Saldo tmp : saldos) {
                            if (tmp.getFormaPago().getId().equals(obj.getFormaPago().getId())) {
                                boolean flg3 = false;
                                for (Total total : tmp.getTotales()) {
                                    if (total.getMoneda().getId().equals(obj.getMoneda().getId())) {
                                        total.setMonto((float) (total.getMonto() + obj.getMonto()));
                                        flg3 = true;
                                        break;
                                    }
                                }
                                if (!flg3) {
                                    tmp.getTotales().add(new Total(obj.getMoneda(), (float) obj.getMonto()));
                                }
                                flg2 = true;
                                break;
                            }
                           
                        }
                        if (!flg2) {
                            List<Total> lista = new ArrayList<>();
                            lista.add(new Total(obj.getMoneda(), (float) obj.getMonto()));
                            saldos.add(new Saldo(obj.getFormaPago(), lista));
                        } 
                        
                    }
                   
                }
            }
             for (Saldo object : saldos) 
             {
                 for (Total x : object.getTotales())
                 {
                     if(x.getMoneda().getId() == 1 )
                     {
                            total1 += x.getMonto();
                            moneda1 = new TotalesApertura(x.getMoneda(), total1);               
                     }
                     
                     if(x.getMoneda().getId() == 2 )
                     {
                            total2 += x.getMonto();
                            moneda2 = new TotalesApertura(x.getMoneda(), total2);               
                     }
                 }                                                         
             }
            if(moneda1 != null)
                model.addRow(new Object[]{moneda1.getMoneda().getNombre().toUpperCase(), moneda1.getMonto()});
            if(moneda2 != null)
                model.addRow(new Object[]{moneda2.getMoneda().getNombre().toUpperCase(), moneda2.getMonto()});
            
            
            this.JMonedaTotal.setModel(model);
            RefrescarJTableDetalleFormaPago();
        }

    }
    
     private void RefrescarJTableDetalleFormaPago() {
        try {
            model = getModel(Util.COL_RESUMEN_FORMA_PAGO, false);

            fpmms = new ArrayList<>();
                    for (Saldo tmp : saldos) {
                        for (Total total : tmp.getTotales()) {
                            fpmms.add(new FormaPagoMonedaMonto(tmp.getFormaPago(), total.getMoneda(), total.getMonto(), null, null));
                        }
                    }
                    for (FormaPagoMonedaMonto fpmm : fpmms) {
                       model.addRow(new Object[]{fpmm.getFormaPago().getNombre().toUpperCase(),fpmm.getMoneda().getNombre().toUpperCase(), fpmm.getMonto()});
                    }
            JTFormaPagoMonedaTotal.setModel(model);
        } catch (Exception e) {
        }
    }

    public Iniciocaja getInicioCaja() {
        return iniciocaja;
    }
    
    public void cerrar()
    {
        try {
            if (iniciocaja == null) 
            {
                JOptionPane.showMessageDialog(this, "Debe tener una apertura de caja activa");
            }
            else
            {
                Cierrecaja obj = getNuevoObjeto();
                obj.setNumero(getNumero() - 1);
                obj.setInicioCaja(iniciocaja);
                List<Detallecierrecaja> lista = new ArrayList<>();
                try {
                    x = new JPACrud();
                    x.save(obj);
                    
                    x = new JPACrud();
                    
                    obj = x.getCierreCaja(iniciocaja);
                    fpmms = new ArrayList<>();
                    for (Saldo tmp : saldos) {
                        for (Total total : tmp.getTotales()) {
                            fpmms.add(new FormaPagoMonedaMonto(tmp.getFormaPago(), total.getMoneda(), total.getMonto(), null, null));
                        }
                    }
                    for (FormaPagoMonedaMonto fpmm : fpmms) {
                        x = new JPACrud();
                        Detallecierrecaja dcc = new Detallecierrecaja();
                        dcc.setCierreCaja(obj);
                        dcc.setFormaPago(fpmm.getFormaPago());
                        dcc.setMoneda(fpmm.getMoneda());
                        dcc.setMonto(fpmm.getMonto());
                        x.save(dcc);
                        lista.add(dcc);
                    }
			x = new JPACrud();
                        
                    iniciocaja.setCerrado(true);
                    x.update(iniciocaja);

                    JOptionPane.showMessageDialog(this, "Operacion realizada satisfactoriamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error! "+e);
                }
            }
        } catch (Exception e) {
            System.out.println("cerrar() "+e);
        }
    }
    
    public Cierrecaja getNuevoObjeto() {
        Cierrecaja obj = new Cierrecaja();
        obj.setFecha(new Date());
        return obj;
    }
    
    public int getNumero() {
        if (iniciocaja != null) {
            return x.getNumROC(iniciocaja.getSerie()) + 1;
        } else {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JMonedaTotal;
    private javax.swing.JTextField JTApertura;
    private javax.swing.JTextField JTCajero;
    private javax.swing.JTable JTDetalle$;
    private javax.swing.JTable JTDetalleC$;
    private javax.swing.JTable JTFormaPagoMonedaTotal;
    private javax.swing.JTextField JTROCActual;
    private javax.swing.JTextField JTSerie;
    private javax.swing.JButton JbCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
