
package com.siac.forms.registro;

import com.siac.entities.Responsableestudiante;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.JPACrud.getCredencial;

public class JIResponsableEstudiantes extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Responsableestudiante obj;
    
    public JIResponsableEstudiantes() {
        initComponents();
        fillComboBox();
    }

    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelFamiliar = new DefaultComboBoxModel((Vector) cm.fillFamiliar());
        DefaultComboBoxModel modelAñoLectivo = new DefaultComboBoxModel((Vector) cm.fillAñosLectivos());
        DefaultComboBoxModel modelParentesco = new DefaultComboBoxModel((Vector) cm.fillParentesco());

        this.JCFamiliar.setModel(modelFamiliar);
        this.JCParentesco.setModel(modelParentesco);
        this.JCAñoLectivo.setModel(modelAñoLectivo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JCFamiliar = new javax.swing.JComboBox<>();
        JCAñoLectivo = new javax.swing.JComboBox<>();
        JCParentesco = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        JTEstudiante = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setText("Administracion Responsable Estudiante");

        jLabel2.setText("Estudiante");

        jLabel3.setText("Familiar");

        jLabel4.setText("Año Lectivo");

        jLabel5.setText("Parentesco");

        JCFamiliar.setBackground(new java.awt.Color(2, 136, 209));
        JCFamiliar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCFamiliar.setForeground(new java.awt.Color(255, 255, 255));
        JCFamiliar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCAñoLectivo.setBackground(new java.awt.Color(2, 136, 209));
        JCAñoLectivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAñoLectivo.setForeground(new java.awt.Color(255, 255, 255));
        JCAñoLectivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCParentesco.setBackground(new java.awt.Color(2, 136, 209));
        JCParentesco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCParentesco.setForeground(new java.awt.Color(255, 255, 255));
        JCParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                "Id", "Estudiante", "Familiar", "Periodo Lectivo", "Parentesco"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBNuevo.setBackground(new java.awt.Color(2, 136, 209));
        JBNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JBNuevo.setText("Nuevo");

        JTEstudiante.setEditable(false);
        JTEstudiante.setBackground(java.awt.SystemColor.activeCaption);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1)
                        .addGap(0, 315, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(JBGuardar))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBNuevo)
                                    .addComponent(JCAñoLectivo, 0, 299, Short.MAX_VALUE)
                                    .addComponent(JTEstudiante))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCFamiliar, 0, 313, Short.MAX_VALUE)
                            .addComponent(JCParentesco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(JCFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCAñoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JCParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void Clear()
    {
        fillComboBox();
        this.JTEstudiante.setText("");
    }
    
    private void Save() {
        try {
            x = new JPACrud();
            obj = new Responsableestudiante();
            obj.setEstudiante(x.getEstudianteByCarnet(this.JTEstudiante.getText()));
            obj.setParentesco(x.getParentescoById(getSelectedIndex(this.JCParentesco.getSelectedItem().toString())));
            obj.setFamiliar(x.getFamiliarById(getSelectedIndex(this.JCFamiliar.getSelectedItem().toString())));
            obj.setActivo(true);
            obj.setFechaRegistro(getDate());
            obj.setCredencial(getCredencial());
            obj.setAnioLectivo(x.getAñioLectivoById(getSelectedIndex(this.JCAñoLectivo.getSelectedItem().toString())));
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
            model = getModel(COL_RESPONSABLE_ESTUDIANTE, false);
            limpiarJTable(model);

            List<Responsableestudiante> entidad = x.buscarTodo(Responsableestudiante.class);
            if (entidad != null) {
                for (Responsableestudiante a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getEstudiante(),
                        a.getFamiliar().getPersona().getNombreCompleto(), a.getAnioLectivo().getNombre().toUpperCase(),a.getActivo(),a.getParentesco().getParentesco().toUpperCase()});
                }
                
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            x = new JPACrud();
            obj = new Responsableestudiante();
            obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setEstudiante(x.getEstudianteById((Integer.parseInt((String)model.getValueAt(jTable1.getSelectedRow(), 1)))));
            obj.setParentesco(x.getParentescoById((int) model.getValueAt(jTable1.getSelectedRow(), 2)));
            obj.setFamiliar(x.getFamiliarById((int) model.getValueAt(jTable1.getSelectedRow(), 3)));
            obj.setAnioLectivo(x.getAñioLectivoById((int) model.getValueAt(jTable1.getSelectedRow(), 4)));
            obj.setActivo(true);
            obj.setFechaRegistro(obj.getFechaRegistro());
            obj.setCredencial(getCredencial());
            

//            Frame f = JOptionPane.getFrameForComponent(this);
//            JDCargo dialog = new JDCargo(f, true, obj);
//            dialog.setVisible(true);
            Refrescar();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCAñoLectivo;
    private javax.swing.JComboBox<String> JCFamiliar;
    private javax.swing.JComboBox<String> JCParentesco;
    private javax.swing.JTextField JTEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
