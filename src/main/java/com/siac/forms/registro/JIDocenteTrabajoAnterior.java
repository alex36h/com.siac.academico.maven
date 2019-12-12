package com.siac.forms.registro;

import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIDocenteTrabajoAnterior extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Docentetrabajoanterior obj;

    public JIDocenteTrabajoAnterior() {
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
        JCColaborador = new javax.swing.JComboBox<>();
        JCCOlegio = new javax.swing.JComboBox<>();
        JTLabor = new javax.swing.JTextField();
        JTDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTRecomendaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTObservaciones = new javax.swing.JTextArea();
        JBGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Trabajo anterior Docentes");

        jLabel2.setText("Persona");

        jLabel3.setText("Colegio");

        jLabel4.setText("Labor Ejercida");

        jLabel5.setText("Duracion");

        jLabel6.setText("Observaciones");

        jLabel7.setText("Recomendaciones");

        JCColaborador.setBackground(new java.awt.Color(2, 136, 209));
        JCColaborador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCColaborador.setForeground(new java.awt.Color(255, 255, 255));
        JCColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCCOlegio.setBackground(new java.awt.Color(2, 136, 209));
        JCCOlegio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCCOlegio.setForeground(new java.awt.Color(255, 255, 255));
        JCCOlegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JTRecomendaciones.setColumns(20);
        JTRecomendaciones.setRows(3);
        jScrollPane1.setViewportView(JTRecomendaciones);

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
                "Id", "Nombre", "Colegio", "Labor Ejercida", "Duracion", "Observaciones", "Recomendaciones"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        JTObservaciones.setColumns(20);
        JTObservaciones.setRows(3);
        jScrollPane3.setViewportView(JTObservaciones);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(JBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTLabor)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCCOlegio, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCCOlegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBGuardar)
                            .addComponent(jButton2)))
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.JTLabor.setText("");
        this.JTDuracion.setText("");
        this.JTObservaciones.setText("");
        this.JTRecomendaciones.setText("");
        fillComboBox();
    }

    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCColaborador = new DefaultComboBoxModel((Vector) cm.fillDocentes());
        this.JCColaborador.setModel(modelJCColaborador);
        DefaultComboBoxModel modelJCColegio = new DefaultComboBoxModel((Vector) cm.fillColegios());
        this.JCCOlegio.setModel(modelJCColegio);
    }

    private void Save() {
        try {
            x = new JPACrud();
            Docentetrabajoanterior values = new Docentetrabajoanterior();
            values.setPersona(x.getColaborador(this.JCColaborador.getSelectedIndex()));
            values.setColegio(x.getColegioById(this.JCCOlegio.getSelectedIndex()));
            values.setLaborEjercida(this.JTLabor.getText());
            values.setDuracion(this.JTDuracion.getText());
            values.setObservaciones(this.JTObservaciones.getText());
            values.setRecomendaciones(this.JTRecomendaciones.getText());
            
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
            model = getModel(COL_DOCENTE_TRABAJO_ANTERIOR, false);
            limpiarJTable(model);

            List<Docentetrabajoanterior> entidad = x.buscarTodo(Docentetrabajoanterior.class);
            if (entidad != null) {
                entidad.forEach((a) -> {
                    model.addRow(new Object[]{a.getId(), a.getPersona().getNombre(),a.getPersona().getApellido(),
                        a.getColegio().getNombre().toUpperCase(), a.getLaborEjercida().toUpperCase(),
                    a.getDuracion().toUpperCase(),a.getObservaciones().toUpperCase(),a.getRecomendaciones().toUpperCase()});
                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Docentetrabajoanterior();
            obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setPersona(x.getColaboradorByNombre((String) model.getValueAt(jTable1.getSelectedRow(), 1), (String) model.getValueAt(jTable1.getSelectedRow(), 2)));
            obj.setColegio(x.getColegioByNombre((String) model.getValueAt(jTable1.getSelectedRow(), 3)));
            obj.setLaborEjercida((String) model.getValueAt(jTable1.getSelectedRow(), 4));
            obj.setDuracion((String) model.getValueAt(jTable1.getSelectedRow(), 5));
            obj.setObservaciones((String) model.getValueAt(jTable1.getSelectedRow(), 6));
            obj.setRecomendaciones((String) model.getValueAt(jTable1.getSelectedRow(), 7));

            Frame f = JOptionPane.getFrameForComponent(this);
            JDTrabajoAnteriorDocente dialog = new JDTrabajoAnteriorDocente(f, true, obj);
            dialog.setVisible(true);
            Refrescar();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JComboBox<String> JCCOlegio;
    private javax.swing.JComboBox<String> JCColaborador;
    private javax.swing.JTextField JTDuracion;
    private javax.swing.JTextField JTLabor;
    private javax.swing.JTextArea JTObservaciones;
    private javax.swing.JTextArea JTRecomendaciones;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
