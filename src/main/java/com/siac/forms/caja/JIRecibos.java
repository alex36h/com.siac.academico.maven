package com.siac.forms.caja;

import com.siac.entities.Iniciocaja;
import com.siac.entities.Pagoestudiante;
import com.siac.entities.Recibo;
import com.siac.entities.Reciboarancel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.COL_RECIBOS_IMPRESION;
import static com.siac.services.Util.getSiNo;
import static com.siac.services.Util.limpiarJTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIRecibos extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    List<Reciboarancel> objRecibos;
    Recibo objROC;
    private Iniciocaja iniciocaja;
    private String filtroROC ="0", filtroCarnet = "", filtroRecibimosDe = "", filtroArancel = "", filtroTotalC$, filtroTotalU$, filtroActivo;
    private List<Pagoestudiante> pagoestudiante;

    public JIRecibos() {
        initComponents();
        getRecibosDelDia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JTRoc = new javax.swing.JTextField();
        JTCarnet = new javax.swing.JTextField();
        JTEstudiante = new javax.swing.JTextField();
        JTArancel = new javax.swing.JTextField();
        JTMontoC$ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JBImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTMontoU$ = new javax.swing.JTextField();
        JBAnular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ROC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Carnet");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Estudiante");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Arancel");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JTRoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTRocKeyPressed(evt);
            }
        });

        JTCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTCarnetKeyPressed(evt);
            }
        });

        JTEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTEstudianteKeyPressed(evt);
            }
        });

        JTArancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTArancelKeyPressed(evt);
            }
        });

        JTMontoC$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTMontoC$KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Monto C$");

        JBImprimir.setBackground(new java.awt.Color(2, 136, 209));
        JBImprimir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBImprimir.setForeground(new java.awt.Color(255, 255, 255));
        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Monto U$");

        JTMontoU$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTMontoU$KeyPressed(evt);
            }
        });

        JBAnular.setBackground(new java.awt.Color(2, 136, 209));
        JBAnular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBAnular.setForeground(new java.awt.Color(255, 255, 255));
        JBAnular.setText("Anular");
        JBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnularActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        JLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Reimpresion de Recibos Oficiales de Caja del dia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTRoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(JTArancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(JTMontoC$, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTMontoU$, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBImprimir)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBAnular)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTRoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTArancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTMontoC$, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTMontoU$, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBImprimir)
                        .addComponent(JBAnular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed

    }//GEN-LAST:event_JBImprimirActionPerformed

    private void JTRocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTRocKeyPressed
        this.filtroROC = this.JTRoc.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTRocKeyPressed

    private void JTCarnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCarnetKeyPressed
        this.filtroCarnet = this.JTCarnet.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTCarnetKeyPressed

    private void JTEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTEstudianteKeyPressed
        this.filtroRecibimosDe = this.JTEstudiante.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTEstudianteKeyPressed

    private void JTArancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTArancelKeyPressed
        this.filtroArancel = this.JTArancel.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTArancelKeyPressed

    private void JTMontoC$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTMontoC$KeyPressed
        this.filtroTotalC$ = this.JTMontoC$.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTMontoC$KeyPressed

    private void JTMontoU$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTMontoU$KeyPressed
        this.filtroTotalU$ = this.JTMontoU$.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTMontoU$KeyPressed

    private void JBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnularActionPerformed
        anular();
    }//GEN-LAST:event_JBAnularActionPerformed

    public void anular() {
        try {

            Long ROC;
            String idEstudiante = "";

            if (jTable1.getSelectedRow() != -1) {
                ROC = ((long) model.getValueAt(jTable1.getSelectedRow(), 0));
                idEstudiante = ((String) model.getValueAt(jTable1.getSelectedRow(), 2));
                x = new JPACrud();

                objROC = x.getROCById(ROC.intValue());
                objROC.setAnulado(true);
                x.update(objROC);

                x = new JPACrud();
                pagoestudiante = x.getPagoEstudianteByEstudianteROC(idEstudiante, ROC.intValue());
                if (pagoestudiante != null) {
                    for (Pagoestudiante item : pagoestudiante) {
                        x = new JPACrud();
                        item.setPagado(false);
                        item.setRecibo(null);
                        item.setTipoCancelacion(null);
                        x.update(item);
                    }
                }
                getRecibosDelDia();    
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe de seleccionar un registro primero.");
            }
        } catch (Exception e) {
            System.out.println("void anular(): " + e.toString());
        }
    }

    private void filtrarRecibos() {
        try {
            x = new JPACrud();

            model = Util.getModel(COL_RECIBOS_IMPRESION, false);
            limpiarJTable(model);
            objRecibos = x.getRecibosHoy();

            if (objRecibos != null) {
                for (Reciboarancel a
                        : objRecibos) {
                    if (!filtroROC.equals("0")) {
                        if (a.getRecibo().getNumero() == Integer.parseInt(filtroROC)) {
                            model.addRow(new Object[]{a.getRecibo().getId(), a.getRecibo().getNumero(), a.getRecibo().getEstudiante(), a.getRecibo().getDe(),
                                a.getArancel().getNombre(), a.getRecibo().getTotalCor(), a.getRecibo().getTotalDol(),
                                getSiNo(a.getRecibo().getAnulado())});
                        }
                    } else if (a.getRecibo().getEstudiante().contains(filtroCarnet.toUpperCase()) && a.getRecibo().getDe().contains(filtroRecibimosDe.toUpperCase())
                            && a.getArancel().getNombre().contains(filtroArancel.toUpperCase())) {
                        model.addRow(new Object[]{a.getRecibo().getId(), a.getRecibo().getNumero(), a.getRecibo().getEstudiante(), a.getRecibo().getDe(),
                            a.getArancel().getNombre(), a.getRecibo().getTotalCor(), a.getRecibo().getTotalDol(),
                            getSiNo(a.getRecibo().getAnulado())});
                    }
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            System.out.println("filtrarRecibos " + e);
        }
    }

    private void getRecibosDelDia() {
        try {
            x = new JPACrud();

            model = Util.getModel(COL_RECIBOS_IMPRESION, false);
            limpiarJTable(model);
            objRecibos = x.getRecibosHoy();

            if (objRecibos != null) {
                for (Reciboarancel a
                        : objRecibos) {
                    model.addRow(new Object[]{a.getRecibo().getId(), a.getRecibo().getNumero(), a.getRecibo().getEstudiante(), a.getRecibo().getDe(),
                        a.getArancel().getNombre(), a.getRecibo().getTotalCor(), a.getRecibo().getTotalDol(),
                        getSiNo(a.getRecibo().getAnulado())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            System.out.println("getRecibosDelDia " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnular;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTArancel;
    private javax.swing.JTextField JTCarnet;
    private javax.swing.JTextField JTEstudiante;
    private javax.swing.JTextField JTMontoC$;
    private javax.swing.JTextField JTMontoU$;
    private javax.swing.JTextField JTRoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
