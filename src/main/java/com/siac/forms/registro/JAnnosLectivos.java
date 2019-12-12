package com.siac.forms.registro;

import com.siac.entities.Aniolectivo;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilidades.GestionEncabezadoTabla;
import static com.siac.services.JPACrud.getCredencial;

public class JAnnosLectivos extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Aniolectivo obj;
    
    public JAnnosLectivos() {
        initComponents();
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
        JTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        JdateChooserFechaInicio = new datechooser.beans.DateChooserCombo();
        JdateChooserFechaFin = new datechooser.beans.DateChooserCombo();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(null));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de los Años Lectivos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Fecha Inicio");

        jLabel5.setText("Fecha Fin");

        JTDescripcion.setColumns(20);
        JTDescripcion.setRows(3);
        jScrollPane1.setViewportView(JTDescripcion);

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
                "Id", "Nombre", "Descripcion", "Fecha Inicio", "Fecha Fin"
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

        JBNuevo.setBackground(new java.awt.Color(2, 136, 209));
        JBNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JBNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTNombre)
                                    .addComponent(JdateChooserFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JdateChooserFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBNuevo)
                        .addGap(0, 611, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(JdateChooserFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JdateChooserFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.JTDescripcion.setText("");
    }

    private void Save() {
        try {
            x = new JPACrud();
            Aniolectivo values = new Aniolectivo();
            values.setNombre(this.JTNombre.getText());
            values.setDescripcion(this.JTDescripcion.getText());
            values.setFechaInicio(Date.from(this.JdateChooserFechaInicio.getCurrent().toInstant()));
            values.setFechaFinal(Date.from(this.JdateChooserFechaFin.getCurrent().toInstant()));
            values.setActivo(true);
            values.setCredencial(getCredencial());
            
            x.save(values);
            JOptionPane.showMessageDialog(this, ADD_OK);
            Refrescar();
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }

    private JTableHeader tableHeader()
    {
        JTableHeader jtableHeader;
        jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        return jtableHeader;
    }
    
    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_ANNOSLECTIVOS, false);
            limpiarJTable(model);
           
            jTable1.setTableHeader(getTableHeader(jTable1));
            
            List<Aniolectivo> entidad = x.buscarTodo(Aniolectivo.class);
            if (entidad != null) {
                for (Aniolectivo a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getNombre(),
                        a.getDescripcion(), a.getFechaInicio(), a.getFechaFinal(),getSiNo(a.getActivo())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void Update()
    {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Aniolectivo();
                obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
                obj.setNombre((String) model.getValueAt(jTable1.getSelectedRow(), 1));
                obj.setDescripcion((String) model.getValueAt(jTable1.getSelectedRow(), 2));
                obj.setFechaInicio((Date) model.getValueAt(jTable1.getSelectedRow(), 3));
                obj.setFechaFinal((Date)  model.getValueAt(jTable1.getSelectedRow(), 4));
                obj.setActivo((boolean) getBoolean((String)model.getValueAt(jTable1.getSelectedRow(),5)));

                Frame f = JOptionPane.getFrameForComponent(this);
                JDAnnosLectivos dialog = new JDAnnosLectivos(f, true,obj);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                Refrescar();
                
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione");
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JTextArea JTDescripcion;
    private javax.swing.JTextField JTNombre;
    private datechooser.beans.DateChooserCombo JdateChooserFechaFin;
    private datechooser.beans.DateChooserCombo JdateChooserFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
