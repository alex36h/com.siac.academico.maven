package com.siac.forms.registro;

import com.siac.entities.Estudiante;
import com.siac.entities.Persona;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.JPACrud.getCredencial;
import com.siac.services.Util;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class JIEstudiante extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Estudiante obj;
    String carnet;
    Persona objPersona;
    
    String filterName = "", filterMINED = "", filterSangre = "", filterObservacion = "";
    
    public JIEstudiante() {
        initComponents();
        Refrescar();
        this.JTNombre.setText("");
        fillComboBox();
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();        
        DefaultComboBoxModel modelSerie = new DefaultComboBoxModel((Vector) cm.fillEstadoEstudiante());
        this.JComboEstado.setModel(modelSerie);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTCodMINED = new javax.swing.JTextField();
        JTelefono = new javax.swing.JFormattedTextField();
        JCTipoSangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTObservaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        JTCarnet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JComboEstado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        JTApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTFilterName = new javax.swing.JTextField();
        JTFilterMined = new javax.swing.JTextField();
        JTFilterSangre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JTFilterObs = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel2.setText("Carnet");

        jLabel3.setText("Codigo MINED");

        jLabel4.setText("Telefono");

        jLabel5.setText("Tipo Sangre");

        jLabel6.setText("Observaciones");

        JCTipoSangre.setBackground(new java.awt.Color(2, 136, 209));
        JCTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCTipoSangre.setForeground(new java.awt.Color(255, 255, 255));
        JCTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0+", "B+", "B-", "A+", "A-" }));

        JTObservaciones.setColumns(10);
        JTObservaciones.setRows(2);
        jScrollPane1.setViewportView(JTObservaciones);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Codigo MINED", "Telefono", "Tipo Sangre", "Observaciones"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Actualizar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBNuevo.setBackground(new java.awt.Color(2, 136, 209));
        JBNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JBNuevo.setText("Cancelar");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JTCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCarnetActionPerformed(evt);
            }
        });
        JTCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTCarnetKeyPressed(evt);
            }
        });

        jLabel7.setText("Nombre");

        jLabel8.setText("Estado");

        JComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        JLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Administracion de los Estudiantes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLTitulo)
                .addContainerGap())
        );

        jLabel9.setText("Apellido");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Codigo MINED");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nombre");

        JTFilterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFilterNameKeyPressed(evt);
            }
        });

        JTFilterMined.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFilterMinedKeyPressed(evt);
            }
        });

        JTFilterSangre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFilterSangreKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Tipo Sangre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Observaciones");

        JTFilterObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFilterObsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBNuevo)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTApellido)
                            .addComponent(JTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(JTCodMINED, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(JComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(JCTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(JTFilterMined, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(JTFilterSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(JTFilterObs, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JCTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTCodMINED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(JTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFilterMined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFilterSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFilterObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Update();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        Clear();
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JTCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCarnetActionPerformed
       
    }//GEN-LAST:event_JTCarnetActionPerformed

    private void JTCarnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCarnetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carnet = this.JTCarnet.getText();
            if(carnet.length() > 8)
            Find();
            else 
                JOptionPane.showMessageDialog(this, "Ingrese un carnet valido.");
        }
    }//GEN-LAST:event_JTCarnetKeyPressed

    private void JTFilterNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFilterNameKeyPressed
        this.filterName = this.JTFilterName.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTFilterNameKeyPressed

    private void JTFilterMinedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFilterMinedKeyPressed
        this.filterMINED = this.JTFilterMined.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTFilterMinedKeyPressed

    private void JTFilterSangreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFilterSangreKeyPressed
        this.filterSangre = this.JTFilterSangre.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTFilterSangreKeyPressed

    private void JTFilterObsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFilterObsKeyPressed
        this.filterObservacion = this.JTFilterObs.getText();
        filtrarRecibos();
    }//GEN-LAST:event_JTFilterObsKeyPressed

    private void Find()
    {
        try {
          x = new JPACrud();
          obj = x.getEstudianteByCarnet(carnet);
          this.JTNombre.setText(obj.getPersona().getNombre());
          this.JTApellido.setText(obj.getPersona().getApellido());
          this.JTCodMINED.setText(obj.getCodMINED());
          this.JTObservaciones.setText(obj.getObservaciones());
          this.JTelefono.setText(obj.getTelefono());
          this.JComboEstado.setSelectedIndex(obj.getEstado());
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE + e);
        }
    }
    
    private void add()
    {
        try {
                Frame f = JOptionPane.getFrameForComponent(this);
                JDPersonaEstudiante dialog = new JDPersonaEstudiante(f, true);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                Refrescar();
        } catch (Exception e) {
        }
    }
    
        private void Clear() {
        this.JTCodMINED.setText("");
        this.JTelefono.setText("");
        this.JTObservaciones.setText("");
        Refrescar();
    }
    
    private void Update() {
        try {
            x = new JPACrud();
            objPersona = obj.getPersona();
            objPersona.setNombre(this.JTNombre.getText());
            objPersona.setApellido(this.JTApellido.getText());
            obj.setCodMINED(this.JTCodMINED.getText());
            obj.setTipoSangre(this.JCTipoSangre.getSelectedItem().toString());
            obj.setTelefono(this.JTelefono.getText());
            obj.setObservaciones(this.JTObservaciones.getText());
            obj.setFechaIngreso(Date.from(Instant.now()));
            obj.setFechaRegistro(Date.from(Instant.now()));
            obj.setCredencial(getCredencial());
            obj.setEstado(this.JComboEstado.getSelectedIndex());          
            obj.setActivo(true);
            x.update(obj);
            x = new JPACrud();
            x.update(objPersona);
            
            JOptionPane.showMessageDialog(this, UPDATE_OK);
            Refrescar();
            Clear();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE+e);
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }

    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_ESTUDIANTE, false);
            limpiarJTable(model);

            List<Estudiante> entidad = x.buscarTodo(Estudiante.class);
            if (entidad != null) {
                for (Estudiante a
                        : entidad) {
                    model.addRow(new Object[]{
                        a.getId(),
                        a.getPersona().getNombreCompleto(),
                        a.getCodMINED(),
                        a.getTelefono(),
                        a.getTipoSangre(),
                        a.getObservaciones(),
                        getEstadoEstudiante(a.getEstado()),
                        getSiNo(a.getActivo())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void filtrarRecibos() {
        try {
            x = new JPACrud();
            model = getModel(COL_ESTUDIANTE, false);
            limpiarJTable(model);
            
            List<Estudiante> entidad = x.buscarTodo(Estudiante.class);

            if (entidad != null) {
                for (Estudiante a
                        : entidad) {
                        if (a.getPersona().getNombreCompleto().contains(filterName.toUpperCase()) && a.getCodMINED().contains(filterMINED.toUpperCase())
                            && a.getTipoSangre().contains(filterSangre.toUpperCase()) && a.getObservaciones().contains(filterObservacion.toUpperCase())) {
                        model.addRow(new Object[]{
                        a.getId(),
                        a.getPersona().getNombreCompleto(),
                        a.getCodMINED(),
                        a.getTelefono(),
                        a.getTipoSangre(),
                        a.getObservaciones(),
                        getEstadoEstudiante(a.getEstado()),
                        getSiNo(a.getActivo())});
                    }
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            System.out.println("filtrarRecibos " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCTipoSangre;
    private javax.swing.JComboBox<String> JComboEstado;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTApellido;
    private javax.swing.JTextField JTCarnet;
    private javax.swing.JTextField JTCodMINED;
    private javax.swing.JTextField JTFilterMined;
    private javax.swing.JTextField JTFilterName;
    private javax.swing.JTextField JTFilterObs;
    private javax.swing.JTextField JTFilterSangre;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextArea JTObservaciones;
    private javax.swing.JFormattedTextField JTelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
