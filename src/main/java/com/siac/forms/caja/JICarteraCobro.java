package com.siac.forms.caja;

import com.siac.entities.Cursos;
import com.siac.entities.Estudiante;
import com.siac.entities.Pagoestudiante;
import com.siac.services.CarteraCobro;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JICarteraCobro extends javax.swing.JInternalFrame {

    Estudiante estudiante;
    Pagoestudiante pagoestudiante;
    JPACrud x;
    DefaultTableModel model;
    Cursos cursos;
    
    List<Pagoestudiante> objPagoEstudiante;
    List<Pagoestudiante> objPagoEstudianteDistinct;
    List<CarteraCobro> objCarteraCobro;
    
    int noEstudiantesInscritosIS;
    double montoRecibirIS;
    double exoneracionesIS;
    double totalIngresosIS;
    
    double montoRecibirIIS;
    double exoneracionesIIS;
    double totalIngresosIIS;
    
    double porcentaje;
    
    public JICarteraCobro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCAnioPrincipal = new javax.swing.JComboBox<>();
        JBGenerar = new javax.swing.JButton();
        JTCarnet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JTNombreCompleto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JCAño = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTPagos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTResumenConsolidado = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTResumenPagosI = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTResumenPagosI1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CARTERA Y COBRO");

        jLabel4.setText("Anio");

        JCAnioPrincipal.setBackground(new java.awt.Color(2, 136, 209));
        JCAnioPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAnioPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        JCAnioPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2028", "2029", "2030" }));

        JBGenerar.setBackground(new java.awt.Color(2, 136, 209));
        JBGenerar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGenerar.setForeground(new java.awt.Color(255, 255, 255));
        JBGenerar.setText("Generar");
        JBGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGenerarActionPerformed(evt);
            }
        });

        JTCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTCarnetKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Carnet");

        jPanel1.setBackground(new java.awt.Color(2, 119, 189));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nombre Completo");

        JTNombreCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTNombreCompletoKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Año Escolar");

        JCAño.setBackground(new java.awt.Color(2, 136, 209));
        JCAño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAño.setForeground(new java.awt.Color(255, 255, 255));
        JCAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        JTPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CARNET", "NOMBRE COMPLETO", "GRUPO", "SALDO ANTERIOR", "ESTUDIO IS ?", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO"
            }
        ));
        jScrollPane1.setViewportView(JTPagos);

        jPanel3.setBackground(new java.awt.Color(2, 136, 209));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RESUMEN CONSOLIDADO DE PAGOS ESTUDIANTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        JTResumenConsolidado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO. ESTUDIANTES INSCRITOS IS", "MONTO A RECIBIR $", "EXONERACIONES IS $", "TOTAL INGRESOS IS $", "NO. ESTUDIANTES INSCRITOS IIS", "MONTO A RECIBIR $", "EXONERACIONES IIS $", "TOTAL INGRESOS IS $"
            }
        ));
        jScrollPane2.setViewportView(JTResumenConsolidado);

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RESUMEN DE PAGOS ESTUDIANTES PRIMER SEMESTRE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("ENERO");

        JTResumenPagosI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO"
            }
        ));
        jScrollPane3.setViewportView(JTResumenPagosI);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("FEBRERO");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("MARZO");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("ABRIL");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("MAYO");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("JUNIO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("JULIO");

        JTResumenPagosI1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO", "PENDIENTE", "PAGADO"
            }
        ));
        jScrollPane4.setViewportView(JTResumenPagosI1);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("AGOSTO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("SEPTIEMBRE");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("OCTUBRE");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("NOVIEMBRE");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("DICIEMBRE");

        jPanel5.setBackground(new java.awt.Color(2, 136, 209));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RESUMEN DE PAGOS ESTUDIANTES SEGUNDO SEMESTRE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(2, 136, 209));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("IMPRIMIR");

        jButton3.setBackground(new java.awt.Color(2, 136, 209));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DESCARGAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(JTNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(JCAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel10)
                .addGap(162, 162, 162)
                .addComponent(jLabel13)
                .addGap(163, 163, 163)
                .addComponent(jLabel14)
                .addGap(174, 174, 174)
                .addComponent(jLabel15)
                .addGap(175, 175, 175)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel11)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel18)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel19)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel22)
                        .addGap(75, 75, 75)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JCAnioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBGenerar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCAnioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBGenerar))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(223, 223, 223))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGenerarActionPerformed
       Generar();
    }//GEN-LAST:event_JBGenerarActionPerformed

    private void JTCarnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCarnetKeyPressed
        FiltrarResumenConsolidado(this.JTCarnet.getText());
    }//GEN-LAST:event_JTCarnetKeyPressed

    private void JTNombreCompletoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNombreCompletoKeyPressed
        FiltrarResumenConsolidado(this.JTNombreCompleto.getText());
    }//GEN-LAST:event_JTNombreCompletoKeyPressed

    private void Generar()
    {
        RefrescarResumenConsolidado();
    }
    
    private void ResumenConsolidado()
    {
        try {
            objPagoEstudianteDistinct = x.getDistinctPagoEstudiante();
                        
            x = new JPACrud();
            model = Util.getModel(COL_CARTERA_RESUMEN_CONSOLIDADO2, false);
            noEstudiantesInscritosIS = objPagoEstudianteDistinct.size();
            montoRecibirIS = noEstudiantesInscritosIS * x.getMensualidadesPeriodoByAnioMes().getArancel().getPrecio();
            porcentaje = (x.getExoneracionesPeriodo()/100) * x.getMensualidadesPeriodoByAnioMes().getArancel().getPrecio();
            totalIngresosIS = montoRecibirIS - porcentaje;
            
            montoRecibirIIS = noEstudiantesInscritosIS * x.getMensualidadesPeriodoByAnioMes().getArancel().getPrecio();
            porcentaje = (x.getExoneracionesPeriodo()/100) * x.getMensualidadesPeriodoByAnioMes().getArancel().getPrecio();
            totalIngresosIIS = montoRecibirIIS - porcentaje;
            
            
            model.addRow(new Object[]{noEstudiantesInscritosIS,montoRecibirIS,porcentaje,totalIngresosIS,noEstudiantesInscritosIS,
            montoRecibirIIS,porcentaje,totalIngresosIIS});
            JTResumenConsolidado.setModel(model);
            RefrescarResumenPrimerSemestre();
        } catch (Exception e) {
            System.out.println("ResumenConsolidado() :"+e);
        }
    }
    
    private void RefrescarResumenConsolidado() {
        try {
            
            x = new JPACrud();
          
            model = Util.getModel(COL_CARTERA_RESUMEN_CONSOLIDADO, false);
            Util.limpiarJTable(model);
            
            objPagoEstudiante = x.buscarTodo(Pagoestudiante.class);
            objPagoEstudianteDistinct = x.getDistinctPagoEstudiante();
            objCarteraCobro = new ArrayList<>();
           
            if(objPagoEstudianteDistinct != null)
            {
                for (Object objDistict : objPagoEstudianteDistinct) 
                {
                    CarteraCobro cyc = new CarteraCobro();
                    cyc.setCarnet(objDistict.toString());
                    cyc.setNombreCompleto(x.getEstudianteByCarnet(objDistict.toString()).getPersona().getNombreCompleto());
                    
                    cursos = x.getEstudioISEM(objDistict.toString());
                    
                    cyc.setAula(cursos.getAula().getNombre());
                    
                    if(cursos != null)
                    {                                          
                        cyc.setEstudioIS("SI");
                        cyc.setAula(cursos.getAula().getNombre());
                    }
                    else
                    {
                        cyc.setEstudioIS("NO");
                        cyc.setAula(cursos.getAula().getNombre());
                    }
                    
                    for (Pagoestudiante obj : objPagoEstudiante) {
                        if(objDistict.toString().equals(obj.getEstudiante().getCarnet()))
                        {
                            switch(obj.getMes())
                            {
                                case 1:
                                    cyc.setENERO(x.getDebeMensualidades(obj));
                                    break;
                                case 2:
                                    cyc.setFEBRERO(x.getDebeMensualidades(obj));
                                    break;
                                case 3:
                                    cyc.setMARZO(x.getDebeMensualidades(obj));
                                    break;
                                case 4:
                                    cyc.setABRIL(x.getDebeMensualidades(obj));
                                    break;
                                case 5:
                                    cyc.setMAYO(x.getDebeMensualidades(obj));
                                    break;
                                case 6:
                                    cyc.setJUNIO(x.getDebeMensualidades(obj));
                                    break;       
                            }//end switch
                        }//end IF
                    }
                    objCarteraCobro.add(cyc);
                }//end for each distinct
            }
            
            for (CarteraCobro obj : objCarteraCobro) {
                model.addRow(new Object[]{obj.getCarnet(),obj.getNombreCompleto(),
                        obj.getAula(),"saldo anterior",obj.getEstudioIS(),obj.getENERO(),obj.getFEBRERO(),obj.getMARZO(),obj.getABRIL(),
                obj.getMAYO(),obj.getJUNIO()});
            }
            JTPagos.setModel(model);
            ResumenConsolidado();
        } catch (Exception e) {
            System.out.println("RefrescarResumenConsolidado "+e);
        }
    }

    private void RefrescarResumenPrimerSemestre() {
        try {
            
            x = new JPACrud();
            CarteraCobro cyc = new CarteraCobro();
            
            cyc.setPagadoEnero(x.getPagoEstudianteByEstado(1, 2019, true));
            cyc.setPagadoFebrero(x.getPagoEstudianteByEstado(2, 2019, true));
            cyc.setPagadoMarzo(x.getPagoEstudianteByEstado(3, 2019, true));
            cyc.setPagadoAbril(x.getPagoEstudianteByEstado(4, 2019, true));
            cyc.setPagadoMayo(x.getPagoEstudianteByEstado(5, 2019, true));
            cyc.setPagadoJunio(x.getPagoEstudianteByEstado(6, 2019, true));
            cyc.setPagadoJulio(x.getPagoEstudianteByEstado(7, 2019, true));
            cyc.setPagadoAgosto(x.getPagoEstudianteByEstado(8, 2019, true));
            cyc.setPagadoSeptiembre(x.getPagoEstudianteByEstado(9, 2019, true));
            cyc.setPagadoOctubre(x.getPagoEstudianteByEstado(10, 2019, true));
            cyc.setPagadoNoviembre(x.getPagoEstudianteByEstado(11, 2019, true));
            cyc.setPagadoDiciembre(x.getPagoEstudianteByEstado(12, 2019, true));
            
            cyc.setDebeEnero(x.getPagoEstudianteByEstado(1, 2019, false));
            cyc.setDebeFebrero(x.getPagoEstudianteByEstado(2, 2019, false));
            cyc.setDebeMarzo(x.getPagoEstudianteByEstado(3, 2019, false));
            cyc.setDebeAbril(x.getPagoEstudianteByEstado(4, 2019, false));
            cyc.setDebeMayo(x.getPagoEstudianteByEstado(5, 2019, false));
            cyc.setDebeJunio(x.getPagoEstudianteByEstado(6, 2019, false));
            cyc.setDebeJulio(x.getPagoEstudianteByEstado(7, 2019, false));
            cyc.setDebeAgosto(x.getPagoEstudianteByEstado(8, 2019, false));
            cyc.setDebeSeptiembre(x.getPagoEstudianteByEstado(9, 2019, false));
            cyc.setDebeOctubre(x.getPagoEstudianteByEstado(10, 2019, false));
            cyc.setDebeNoviembre(x.getPagoEstudianteByEstado(11, 2019, false));
            cyc.setDebeDiciembre(x.getPagoEstudianteByEstado(12, 2019, false));
            
            model = Util.getModel(COL_DEBE_PAGADO, false);
                model.addRow(new Object[]{cyc.getDebeEnero(),cyc.getPagadoEnero(),cyc.getDebeFebrero(),cyc.getPagadoFebrero(),
                cyc.getDebeMarzo(),cyc.getPagadoMarzo(),cyc.getDebeAbril(),cyc.getPagadoAbril(),cyc.getDebeMayo(),cyc.getPagadoMayo(),
                cyc.getDebeJunio(),cyc.getPagadoJunio()});
            
            JTResumenPagosI.setModel(model);
            
            model = Util.getModel(COL_DEBE_PAGADO, false);
                model.addRow(new Object[]{cyc.getDebeJulio(),cyc.getPagadoJulio(),cyc.getDebeAgosto(),cyc.getPagadoAgosto(),
                cyc.getDebeSeptiembre(),cyc.getPagadoSeptiembre(),cyc.getDebeOctubre(),cyc.getPagadoOctubre(),cyc.getDebeNoviembre(),cyc.getPagadoNoviembre(),
                cyc.getDebeDiciembre(),cyc.getPagadoDiciembre()});
                
            JTResumenPagosI1.setModel(model);

        } catch (Exception e) {
            System.out.println("RefrescarResumenPrimerSemestre() "+e);
        }
    }
    
    private void FiltrarResumenConsolidado(String filtro) {
        try {
            
            x = new JPACrud();
            System.out.println(estudiante);
            model = Util.getModel(COL_CARTERA_RESUMEN_CONSOLIDADO, false);   
            limpiarJTable(model);
            JTPagos.setModel(model);
            model = Util.getModel(COL_CARTERA_RESUMEN_CONSOLIDADO, false);
            
            for (CarteraCobro obj : objCarteraCobro) {
                if(obj.getCarnet().contains(filtro) || obj.getNombreCompleto().toUpperCase().contains(filtro.toUpperCase()))
                {
                    model.addRow(new Object[]{obj.getCarnet(),obj.getNombreCompleto(),
                        obj.getAula(),"saldo anterior",obj.getEstudioIS(),obj.getENERO(),obj.getFEBRERO(),obj.getMARZO(),obj.getABRIL(),
                        obj.getMAYO(),obj.getJUNIO()});
                }
            }
            JTPagos.setModel(model);
            ResumenConsolidado();
        } catch (Exception e) {
            System.out.println("RefrescarResumenConsolidado "+e);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGenerar;
    private javax.swing.JComboBox<String> JCAnioPrincipal;
    private javax.swing.JComboBox<String> JCAño;
    private javax.swing.JTextField JTCarnet;
    private javax.swing.JTextField JTNombreCompleto;
    private javax.swing.JTable JTPagos;
    private javax.swing.JTable JTResumenConsolidado;
    private javax.swing.JTable JTResumenPagosI;
    private javax.swing.JTable JTResumenPagosI1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
