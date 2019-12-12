package com.siac.forms.registro;

import com.siac.entities.Antecedentealergiaestudiante;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIAntecedenteAlergiaEstudiante extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Antecedentealergiaestudiante obj;

    public JIAntecedenteAlergiaEstudiante() {
        initComponents();
        getJCDatos();
    }

       private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelAlergia = new DefaultComboBoxModel((Vector) cm.fillAlergias());
        DefaultComboBoxModel modelEstudiante = new DefaultComboBoxModel((Vector) cm.fillEstudiantes());
        this.JCAlergia.setModel(modelAlergia);
        this.JCEstudiante.setModel(modelEstudiante);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCEstudiante = new javax.swing.JComboBox<>();
        JCAlergia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFrecuiencia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTDiagnostico = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTMedicamento = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Antecedentes de Alergias");

        jLabel2.setText("Estudiante");

        jLabel3.setText("Alergia");

        jLabel4.setText("Frecuencia");

        jLabel6.setText("Diagnostico");

        JCEstudiante.setBackground(new java.awt.Color(2, 136, 209));
        JCEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        JCEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kevin Alejandro Rodriguez Perez", "MIchael Ricardo Rivera Torres" }));

        JCAlergia.setBackground(new java.awt.Color(2, 136, 209));
        JCAlergia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAlergia.setForeground(new java.awt.Color(255, 255, 255));
        JCAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rinitis Alergica" }));

        JTFrecuiencia.setColumns(20);
        JTFrecuiencia.setRows(5);
        jScrollPane1.setViewportView(JTFrecuiencia);

        JTDiagnostico.setColumns(20);
        JTDiagnostico.setRows(3);
        jScrollPane2.setViewportView(JTDiagnostico);

        jButton1.setBackground(new java.awt.Color(2, 136, 209));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JBNuevo.setBackground(new java.awt.Color(2, 136, 209));
        JBNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

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
                "Id", "Estudiante", "Alergia", "Frecuencia", "Diagnostico", "Medicamentos"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel7.setText("Medicamentos");

        JTMedicamento.setColumns(20);
        JTMedicamento.setRows(5);
        jScrollPane4.setViewportView(JTMedicamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JCEstudiante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JCAlergia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(JBNuevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            Update();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
       Clear(); 
    }//GEN-LAST:event_JBNuevoActionPerformed
    
    private void Clear() {
        this.JTDiagnostico.setText("");
        this.JTMedicamento.setText("");
        this.JTFrecuiencia.setText("");
        //getJCDatos();
        fillComboBox();
    }

    private void Save() {
        try {
            x = new JPACrud();
            Antecedentealergiaestudiante obj = new Antecedentealergiaestudiante();
            obj.setDiagnosticoAlergia(this.JTDiagnostico.getText());
            obj.setMedicamentos(this.JTMedicamento.getText());
            obj.setAlergia(x.getAlergias(this.JCAlergia.getSelectedIndex()));
            obj.setEstudiante(x.getEstudianteById(getSelectedIndex(this.JCEstudiante.getSelectedItem().toString())));
            obj.setFrecuencia(this.JTFrecuiencia.getText());
            x.save(obj);
            JOptionPane.showMessageDialog(this, ADD_OK);
            Refrescar();
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }

    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_ALERGIA_ANTECEDENTES, false);
            limpiarJTable(model);

            List<Antecedentealergiaestudiante> entidad = x.buscarTodo(Antecedentealergiaestudiante.class);
            if (entidad != null) {
                for (Antecedentealergiaestudiante a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(),a.getEstudiante().getPersona().getNombre().concat(" ").concat(a.getEstudiante().getPersona().getApellido()),
                        a.getAlergia().getNombre().toUpperCase(), a.getFrecuencia().toUpperCase(), a.getDiagnosticoAlergia(),a.getMedicamentos().toUpperCase()});
                }
            }
            jTable1.setModel(model);
            getJCDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void getJCDatos() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCEstudiante = new DefaultComboBoxModel((Vector) cm.fillEstudiantes());
        DefaultComboBoxModel modelJCAlergia = new DefaultComboBoxModel((Vector) cm.fillAlergias());
        this.JCEstudiante.setModel(modelJCEstudiante);
        this.JCAlergia.setModel(modelJCAlergia);
    }
    
    private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Antecedentealergiaestudiante();
            obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            
            obj.setDiagnosticoAlergia((String) model.getValueAt(jTable1.getSelectedRow(), 1));
            obj.setFrecuencia((String) model.getValueAt(jTable1.getSelectedRow(), 2));
            obj.setMedicamentos((String) model.getValueAt(jTable1.getSelectedRow(), 3));
            obj.setAlergia(x.getAlergias(this.JCAlergia.getSelectedIndex()));
            obj.setEstudiante(x.getEstudianteById(getSelectedIndex(this.JCEstudiante.getSelectedItem().toString())));

            Frame f = JOptionPane.getFrameForComponent(this);
            JDAntecedenteAlergiaEstudiante dialog = new JDAntecedenteAlergiaEstudiante(f, true, obj);
            dialog.setVisible(true);
            Refrescar();

        } else {
            JOptionPane.showMessageDialog(this, "Update Die");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCAlergia;
    private javax.swing.JComboBox<String> JCEstudiante;
    private javax.swing.JTextArea JTDiagnostico;
    private javax.swing.JTextArea JTFrecuiencia;
    private javax.swing.JTextArea JTMedicamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
