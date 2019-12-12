package com.siac.forms.registro;

import com.siac.entities.Ciudad;
import com.siac.entities.Docente;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIDocente extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Docente obj;

    public JIDocente() {
        initComponents();
        fillComboBox();
        Refrescar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        JCColaborador = new javax.swing.JComboBox<>();
        JCProfesion = new javax.swing.JComboBox<>();
        JTCentroEstudios = new javax.swing.JTextField();
        JTDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDesempeño = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion Docentes");

        jLabel2.setText("Persona");

        jLabel3.setText("Profesion");

        jLabel4.setText("Centro de estudios");

        jLabel5.setText("Duracion");

        jLabel6.setText("Desempeño");

        jLabel7.setText("Fecha Culminacion");

        jCheckBox1.setText("Activo");

        JCColaborador.setBackground(new java.awt.Color(2, 136, 209));
        JCColaborador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCColaborador.setForeground(new java.awt.Color(255, 255, 255));
        JCColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCProfesion.setBackground(new java.awt.Color(2, 136, 209));
        JCProfesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCProfesion.setForeground(new java.awt.Color(255, 255, 255));
        JCProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JTDesempeño.setColumns(20);
        JTDesempeño.setRows(3);
        jScrollPane1.setViewportView(JTDesempeño);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Profesion", "Centro de Estudios", "Duracion", "Desempeño", "Fecha Culminacion"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(2, 136, 209));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTCentroEstudios)
                                    .addComponent(JCColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                                .addGap(62, 62, 62)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTCentroEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JBGuardar)
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            Update();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void Clear() {
        this.JTCentroEstudios.setText("");
        this.JTDesempeño.setText("");
        this.JTDuracion.setText("");
        fillComboBox();
    }

    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCColaborador = new DefaultComboBoxModel((Vector) cm.fillPersonas());
        this.JCColaborador.setModel(modelJCColaborador);
        DefaultComboBoxModel modelJCProfesion = new DefaultComboBoxModel((Vector) cm.fillProfesion());
        this.JCProfesion.setModel(modelJCProfesion);
    }

    private void Save() {
        try {
            x = new JPACrud();
            Docente values = new Docente();
            values.setPersona(x.getColaborador(this.JCColaborador.getSelectedIndex()));
            values.setProfesion(x.getProfesionById(this.JCProfesion.getSelectedIndex()));
            values.setCentroDeEstudio(this.JTCentroEstudios.getText());
            values.setDuracion(this.JTDuracion.getText());
            values.setDesempeno(this.JTDesempeño.getText());
            values.setFechaCulminacion(Date.from(Instant.now()));
            values.setActivo(this.jCheckBox1.isSelected());

            x.save(values);
            JOptionPane.showMessageDialog(this, ADD_OK);
            Refrescar();
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }

    private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Docente();
            obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setPersona(x.getColaboradorByNombre((String) model.getValueAt(jTable1.getSelectedRow(), 1), (String) model.getValueAt(jTable1.getSelectedRow(), 2)));
            obj.setProfesion(x.getProfesionByNombre((String) model.getValueAt(jTable1.getSelectedRow(), 3)));
            obj.setCentroDeEstudio((String) model.getValueAt(jTable1.getSelectedRow(), 4));
            obj.setDuracion((String) model.getValueAt(jTable1.getSelectedRow(), 5));
            obj.setDesempeno((String) model.getValueAt(jTable1.getSelectedRow(), 6));
            obj.setFechaCulminacion((Date) model.getValueAt(jTable1.getSelectedRow(), 7));
            obj.setActivo(getBoolean((String) model.getValueAt(jTable1.getSelectedRow(), 8)));

            Frame f = JOptionPane.getFrameForComponent(this);
            JDDocente dialog = new JDDocente(f, true, obj);
            dialog.setVisible(true);
            Refrescar();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }

    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(Util.COL_DOCENTE, false);
            limpiarJTable(model);
            List<Docente> entidad = x.buscarTodo(Docente.class);
            if (entidad != null) {
                entidad.forEach((a) -> {
                    model.addRow(new Object[]{a.getId(), a.getPersona().getNombre(), a.getPersona().getApellido(), a.getProfesion().getNombre(),
                        a.getCentroDeEstudio(), a.getDuracion(), a.getDesempeno(), a.getFechaCulminacion(), getSiNo(a.getActivo())});
                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JComboBox<String> JCColaborador;
    private javax.swing.JComboBox<String> JCProfesion;
    private javax.swing.JTextField JTCentroEstudios;
    private javax.swing.JTextArea JTDesempeño;
    private javax.swing.JTextField JTDuracion;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
