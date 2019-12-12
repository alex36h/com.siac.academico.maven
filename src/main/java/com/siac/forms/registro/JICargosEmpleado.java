
package com.siac.forms.registro;

import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.JPACrud.getCredencial;

public class JICargosEmpleado extends javax.swing.JInternalFrame {
    
    JPACrud x;
    DefaultTableModel model;
    
    public JICargosEmpleado() {
        initComponents();
        Refrescar();
        getCargosEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCCargo = new javax.swing.JComboBox<>();
        JCColaborador = new javax.swing.JComboBox<>();
        JCAutorizado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setText("Cargo");

        jLabel2.setText("Colaborador");

        jLabel3.setText("Autorizado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Administracion de los Cargos Colaboradores");

        JCCargo.setBackground(new java.awt.Color(2, 136, 209));
        JCCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCCargo.setForeground(new java.awt.Color(255, 255, 255));

        JCColaborador.setBackground(new java.awt.Color(2, 136, 209));
        JCColaborador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCColaborador.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Cargo", "Colaborador", "Autorizado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(2, 136, 209));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nuevo");

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(JCCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(JCColaborador, 0, 305, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(390, 390, 390)
                                        .addComponent(jLabel4)))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JCAutorizado)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBGuardar)
                                .addGap(18, 18, 18)))
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(JCCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(JCColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(JCAutorizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(JBGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void Clear() {
        this.JCAutorizado.setSelected(false);
    }

     private void getCargosEmpleado() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCCargo = new DefaultComboBoxModel((Vector) cm.fillCargos());
        DefaultComboBoxModel modelJCColaborador = new DefaultComboBoxModel((Vector) cm.fillPersonas());
        this.JCCargo.setModel(modelJCCargo);
        this.JCColaborador.setModel(modelJCColaborador);
    }
    
    private void Save() {
        try {
            x = new JPACrud();
            Cargosempleado values = new Cargosempleado();
            values.setCargo(x.getCargo(this.JCCargo.getSelectedIndex()));
            values.setColaborador(x.getColaborador(this.JCColaborador.getSelectedIndex()));
            values.setCredencial(getCredencial());
            values.setFechaRegistro(Date.from(Instant.now()));
            values.setAutorizado(JCAutorizado.isSelected() ? 1 : 0);
            values.setActivo(true);
            x.save(values);
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
            model = getModel(Util.COL_CARGO_EMPLEADO, false);
            limpiarJTable(model);

            List<Cargosempleado> entidad = x.buscarTodo(Cargosempleado.class);
            if (entidad != null) {
                for (Cargosempleado a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getCargo().getNombre().toUpperCase(), a.getColaborador().getNombre().toUpperCase().concat("").
                            concat(a.getColaborador().getApellido().toUpperCase()),
                        getSiNo(a.getAutorizado()), getSiNo(a.getActivo())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JCheckBox JCAutorizado;
    private javax.swing.JComboBox<String> JCCargo;
    private javax.swing.JComboBox<String> JCColaborador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
