package com.siac.forms.registro;

import com.siac.entities.Arancel;
import com.siac.entities.Ciudad;
import com.siac.forms.caja.JDArancel;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JICiudad extends javax.swing.JInternalFrame {

    public JICiudad() {
        initComponents();
        fillComboBox();
        Refrescar();
    }
    
    JPACrud x;
    DefaultTableModel model;
    Ciudad obj;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCActivo = new javax.swing.JCheckBox();
        JBGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCPais = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        JCActivo.setText("Activo");

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Id", "Nombre", "Descripcion", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("Nombre");

        JTNombre.setName("JTNombre"); // NOI18N

        jButton3.setBackground(new java.awt.Color(2, 136, 209));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NUevo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de las Ciudades");

        jLabel4.setText("Pais");

        JCPais.setBackground(new java.awt.Color(2, 136, 209));
        JCPais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCPais.setForeground(new java.awt.Color(255, 255, 255));
        JCPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(JCActivo))
                            .addComponent(jLabel4))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCActivo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBGuardar)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.JTNombre.setText("");
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelPais = new DefaultComboBoxModel((Vector) cm.fillPais());
        this.JCPais.setModel(modelPais);
    }
    
    private void Update()
    {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Ciudad();
                obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
                obj.setNombre((String) model.getValueAt(jTable1.getSelectedRow(), 1));
                obj.setPais(x.getPaisByNombre((String)model.getValueAt(jTable1.getSelectedRow(),2)));
                obj.setActivo((boolean) getBoolean((String)model.getValueAt(jTable1.getSelectedRow(),3)));
                
                Frame f = JOptionPane.getFrameForComponent(this);
                JDCiudad dialog = new JDCiudad(f, true,obj);
                dialog.setVisible(true);
                Refrescar();
                
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione");
            }
    }

    private void Save() {
        try {
            x = new JPACrud();
            Ciudad values = new Ciudad();
            values.setNombre(this.JTNombre.getText());
            values.setPais(x.getPaisById(this.JCPais.getSelectedIndex()));
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
            model = getModel(COL_CIUDAD, false);
            limpiarJTable(model);

            List<Ciudad> entidad = x.buscarTodo(Ciudad.class);
            if (entidad != null) {
                for (Ciudad a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getNombre().toUpperCase(),
                        a.getPais().getNombre().toUpperCase(), getSiNo(a.getActivo())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JCheckBox JCActivo;
    private javax.swing.JComboBox<String> JCPais;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
