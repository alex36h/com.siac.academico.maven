package com.siac.forms.registro;

import com.siac.entities.Colegio;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;

import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIColegios extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Colegio obj;
    
    public JIColegios() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JTNombre = new javax.swing.JTextField();
        JCTipoColegio = new javax.swing.JComboBox<>();
        JCPais = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JCCiudad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTDireccion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        JTTelefono = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo Colegio");

        jLabel3.setText("Pais");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Administracion Colegios");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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

        JCTipoColegio.setBackground(new java.awt.Color(2, 136, 209));
        JCTipoColegio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCTipoColegio.setForeground(new java.awt.Color(255, 255, 255));
        JCTipoColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Publico", "Privado", "Semi Privado" }));

        JCPais.setBackground(new java.awt.Color(2, 136, 209));
        JCPais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCPais.setForeground(new java.awt.Color(255, 255, 255));
        JCPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nicaragua", "Costa Rica", "El Salvador", "Honduras", "Guatemala" }));

        jLabel5.setText("Ciudad");

        JCCiudad.setBackground(new java.awt.Color(2, 136, 209));
        JCCiudad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCCiudad.setForeground(new java.awt.Color(255, 255, 255));
        JCCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Managua", "San Jose", "San Salvador", "Tegucigalpa" }));

        jLabel6.setText("Direccion");

        JTDireccion.setColumns(20);
        JTDireccion.setLineWrap(true);
        JTDireccion.setRows(2);
        jScrollPane2.setViewportView(JTDireccion);

        jLabel7.setText("Telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JCCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JBGuardar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCTipoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JCTipoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JCCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(JBGuardar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Update()
    {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Colegio();
                obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
                obj.setNombre((String) model.getValueAt(jTable1.getSelectedRow(), 1));
                obj.setTipoColegio(x.getTipoColegioByNombre((String)model.getValueAt(jTable1.getSelectedRow(), 2)));
                obj.setPais(x.getPaisByNombre((String)model.getValueAt(jTable1.getSelectedRow(), 3)));
                obj.setCiudad(x.getCiudadByNombre((String)model.getValueAt(jTable1.getSelectedRow(), 4)));              
                obj.setDireccion((String) model.getValueAt(jTable1.getSelectedRow(), 5));
                obj.setTelefono((String) model.getValueAt(jTable1.getSelectedRow(), 6));
                        
                Frame f = JOptionPane.getFrameForComponent(this);
                JDColegios dialog = new JDColegios(f, true,obj);
                dialog.setVisible(true);
                Refrescar();
                
            } else {
                JOptionPane.showMessageDialog(this, "JDColegios");
            }
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelTipoColegio = new DefaultComboBoxModel((Vector) cm.fillTipoColegio());
        DefaultComboBoxModel modelPais = new DefaultComboBoxModel((Vector) cm.fillPais());
        DefaultComboBoxModel modelCiudad = new DefaultComboBoxModel((Vector) cm.fillCiudad());
        this.JCCiudad.setModel(modelCiudad);
        this.JCPais.setModel(modelPais);
        this.JCTipoColegio.setModel(modelTipoColegio);
    }

    private void Clear() {
        this.JTDireccion.setText("");
        this.JTTelefono.setText("");
        this.JTNombre.setText("");
    }

    private void Save() {
        try {
            x = new JPACrud();
            Colegio values = new Colegio();
            values.setNombre(this.JTNombre.getText());
            values.setTipoColegio(x.getTipoColegioById(this.JCTipoColegio.getSelectedIndex()));
            values.setPais(x.getPaisById(this.JCPais.getSelectedIndex()));
            values.setCiudad(x.getCiudad(this.JCCiudad.getSelectedIndex()));
            values.setDireccion(this.JTDireccion.getText());
            values.setTelefono(this.JTTelefono.getText());
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
            model = getModel(COL_COLEGIO, false);
            limpiarJTable(model);

            List<Colegio> entidad = x.buscarTodo(Colegio.class);
            if (entidad != null) {
                for (Colegio a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getNombre().toUpperCase(), a.getTipoColegio().getNombre().toUpperCase(),
                        a.getPais().getNombre().toUpperCase(), a.getCiudad().getNombre().toUpperCase(), a.getDireccion().toUpperCase(), a.getTelefono().toUpperCase()});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JComboBox<String> JCCiudad;
    private javax.swing.JComboBox<String> JCPais;
    private javax.swing.JComboBox<String> JCTipoColegio;
    private javax.swing.JTextArea JTDireccion;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JButton jButton1;
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
