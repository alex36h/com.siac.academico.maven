package com.siac.forms.registro;

import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.ADD_ERROR;
import static com.siac.services.Util.ADD_OK;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.limpiarJTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.Util.COL_ALERGIA_ANTECEDENTES;
import static com.siac.services.Util.getSelectedIndex;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class JIAntecedenteEnfEst extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;

    public JIAntecedenteEnfEst() {
        initComponents();
        Refrescar();
        fillComboBox();
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
        JCPadecimientoAcual = new javax.swing.JCheckBox();
        JCEstudiante = new javax.swing.JComboBox<>();
        JCEnfermedad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDiagnostico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTMedicamentos = new javax.swing.JTextArea();
        JBGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JdateChooseFecha = new datechooser.beans.DateChooserCombo();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Antecedentes de enfermedades");

        jLabel2.setText("Estudiante");

        jLabel3.setText("Enfermedad");

        jLabel4.setText("Diagnostico");

        jLabel5.setText("Fecha Ultima Recaida");

        jLabel6.setText("Medicamentos");

        JCPadecimientoAcual.setText("Padecimiento Actual ?");

        JCEstudiante.setBackground(new java.awt.Color(2, 136, 209));
        JCEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        JCEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kevin Alejandro Rodriguez Perez", "MIchael Ricardo Rivera Torres" }));

        JCEnfermedad.setBackground(new java.awt.Color(2, 136, 209));
        JCEnfermedad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        JCEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asma", "Uricaria", "Sinisitis" }));

        JTDiagnostico.setColumns(20);
        JTDiagnostico.setRows(5);
        jScrollPane1.setViewportView(JTDiagnostico);

        JTMedicamentos.setColumns(20);
        JTMedicamentos.setRows(3);
        jScrollPane2.setViewportView(JTMedicamentos);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(2, 136, 209));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Nuevo");

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
                "Id", "Estudiante", "Enfermedad", "Diagnostico", "Ultima Recaida", "Medicamento", "Estado Enfermedad"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

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
                            .addComponent(JCPadecimientoAcual)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(JCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(JCEnfermedad, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JdateChooseFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
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
                    .addComponent(JCEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JdateChooseFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel6)
                            .addGap(5, 5, 5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCPadecimientoAcual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelEnfermedad = new DefaultComboBoxModel((Vector) cm.fillEnfermedades());
        DefaultComboBoxModel modelEstudiante = new DefaultComboBoxModel((Vector) cm.fillEstudiantes());
        this.JCEnfermedad.setModel(modelEnfermedad);
        this.JCEstudiante.setModel(modelEstudiante);
    }
    
    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void Clear() {
        this.JTDiagnostico.setText("");
        this.JTMedicamentos.setText("");
        this.JCPadecimientoAcual.setSelected(false);
    }

    private void Save() {
        try {
            x = new JPACrud();
            Antecedenteenfestudiante values = new Antecedenteenfestudiante();
            values.setDiagnosticoEnfermedad(this.JTDiagnostico.getText());
            values.setMedicamentos(this.JTMedicamentos.getText());
            //values.setTratamientoBasico(JTMedicamento.getText());
            values.setEstadoEnfermedad(this.JCPadecimientoAcual.isSelected());
            values.setEnfermedad(x.getEnfermedadById(getSelectedIndex(this.JCEnfermedad.getSelectedItem().toString())));
            values.setEstudiante(x.getEstudianteById(getSelectedIndex(this.JCEstudiante.getSelectedItem().toString())));
            values.setFechaUltimaRecaida((Date.from(this.JdateChooseFecha.getCurrent().toInstant())));
            x.save(values);
            JOptionPane.showMessageDialog(this, ADD_OK);
            Refrescar();
            Clear();
        } catch (Exception e) {
            System.out.println("Save() "+e);
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }

    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_ALERGIA_ANTECEDENTES, false);
            limpiarJTable(model);

            List<Antecedenteenfestudiante> entidad = x.buscarTodo(Antecedenteenfestudiante.class);
            if (entidad != null) {
                for (Antecedenteenfestudiante a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getEstudiante().getPersona().getNombre().concat(" ").concat(a.getEstudiante().getPersona().getApellido()),
                        a.getEnfermedad().getNombre().toUpperCase(), a.getDiagnosticoEnfermedad().toUpperCase(), a.getFechaUltimaRecaida().toInstant(), a.getMedicamentos().toUpperCase(),
                        Util.getSiNo(a.getEstadoEnfermedad())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JComboBox<String> JCEnfermedad;
    private javax.swing.JComboBox<String> JCEstudiante;
    private javax.swing.JCheckBox JCPadecimientoAcual;
    private javax.swing.JTextArea JTDiagnostico;
    private javax.swing.JTextArea JTMedicamentos;
    private datechooser.beans.DateChooserCombo JdateChooseFecha;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
