package com.siac.forms.caja;

import com.siac.entities.Arancel;
import com.siac.entities.Persona;
import com.siac.entities.Serierecibo;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIColaborador extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Persona obj;
    
    public JIColaborador() {
        initComponents();
        this.JRMasculino.setSelected(true);
        Refrescar();
        ocultar_columna();
    }

          void ocultar_columna(){
    jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable1.getColumnModel().getColumn(0).setMinWidth(0);
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
    
     
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTCedula = new javax.swing.JFormattedTextField();
        JTNombre = new javax.swing.JTextField();
        JTApellido = new javax.swing.JFormattedTextField();
        JTCorreo = new javax.swing.JTextField();
        JRMasculino = new javax.swing.JRadioButton();
        JRFemenino = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTDireccion = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTObservaviones = new javax.swing.JTextArea();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Correo");

        jLabel7.setText("Genero");

        jLabel8.setText("Dirreccion");

        jLabel9.setText("Observaciones");

        JTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRMasculino);
        JRMasculino.setText("Masculino");

        buttonGroup1.add(JRFemenino);
        JRFemenino.setText("Femenino");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Telefono", "Correo", "Genero", "Direccion", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        JTDireccion.setColumns(20);
        JTDireccion.setRows(5);
        jScrollPane5.setViewportView(JTDireccion);

        JTObservaviones.setColumns(20);
        JTObservaviones.setRows(5);
        jScrollPane6.setViewportView(JTObservaviones);

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
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono");

        jLabel10.setText("F: Nac");

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        JLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Administracion de las Personas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JTCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(JRMasculino)
                                    .addComponent(JRFemenino)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(JTApellido)
                                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBNuevo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRFemenino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBNuevo)
                    .addComponent(JBGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNombreActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed

        
         if(JTNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Nombre de la Persona");
            JTNombre.requestFocus();
            return;
        } else if (JTApellido.getText().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Apellido de la Persona");
            JTApellido.requestFocus();
        }else if(JTTelefono.getText().equals("") ){
         JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Apellido de la Persona");
            JTTelefono.requestFocus();
               
        }
         else if(JTDireccion.getText().equals("") ){
         JOptionPane.showMessageDialog(rootPane, "Debe Ingresar Dirección   de la Persona");
            JTDireccion.requestFocus();
        
        
        }
         else{
             Save();
         }
         
         
        
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        Clear();
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed

    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (evt.getClickCount() == 2) {
            Update();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void Clear()
    {
        this.JTCedula.setText("");
        this.JTCorreo.setText("");
        this.JTDireccion.setText("");
        this.JTNombre.setText("");
        this.JTObservaviones.setText("");
        this.JTApellido.setText("");  
        this.JTTelefono.setText("");  
        this.JRFemenino.setSelected(false);
        this.JRMasculino.setSelected(false);
    }
    
    private void Save()
    {
        boolean genero;
        try {
            genero = this.JRMasculino.isSelected();
            
             x = new JPACrud();
             Persona entidad = new Persona();
             entidad.setIdentificacion(this.JTCedula.getText());
             entidad.setCorreo(this.JTCorreo.getText());
             entidad.setNombre(this.JTNombre.getText());
             entidad.setApellido(this.JTApellido.getText());
             entidad.setObservaciones(this.JTObservaviones.getText());
             entidad.setTelefono(this.JTTelefono.getText());
             entidad.setDireccion(this.JTDireccion.getText());
             entidad.setFechaNacimiento(Date.from(Instant.now()));
             entidad.setGenero(genero);
             
             entidad.setActivo(true);
             x.save(entidad);
             JOptionPane.showMessageDialog(this,ADD_OK);
             Refrescar();
             Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,ADD_ERROR);
        }
    }

    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_PERSONAS, false);
            limpiarJTable(model);
            
            List<Persona> entidad = x.buscarTodo(Persona.class);

            if (entidad != null) {
                for (Persona a
                        : entidad) {
                    model.addRow(new Object[]{a.getCodigo(), a.getNombre().toUpperCase(),
                            a.getApellido().toUpperCase(),a.getFechaNacimiento(),
                        a.getDireccion().toUpperCase(), a.getTelefono(), a.getCorreo(), 
                        a.getObservaciones().toUpperCase(),
                        getGenero(a.getGenero()),getSiNo(a.getActivo())});
                }
            }
            jTable2.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void Update()
    {
        if (jTable2.getSelectedRow() != -1) {
            obj = new Persona();
            obj.setCodigo((Long) model.getValueAt(jTable2.getSelectedRow(), 0));
            obj.setNombre((String)model.getValueAt(jTable2.getSelectedRow(), 1));
            obj.setApellido((String)model.getValueAt(jTable2.getSelectedRow(), 2));
            obj.setFechaNacimiento((Date)model.getValueAt(jTable2.getSelectedRow(), 3));
            obj.setDireccion((String)model.getValueAt(jTable2.getSelectedRow(), 4));
            obj.setTelefono((String)model.getValueAt(jTable2.getSelectedRow(), 5));
            obj.setCorreo((String)model.getValueAt(jTable2.getSelectedRow(), 6));
            obj.setObservaciones((String)model.getValueAt(jTable2.getSelectedRow(), 7));
            obj.setGenero(Util.getBoolean((String)model.getValueAt(jTable2.getSelectedRow(), 8)));
              
            Frame f = JOptionPane.getFrameForComponent(this);
            JDColaborador dialog = new JDColaborador(f, true, obj);
            dialog.setVisible(true);
            Refrescar();
            ocultar_columna();
            
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un elemento");
            }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JRadioButton JRFemenino;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JFormattedTextField JTApellido;
    private javax.swing.JFormattedTextField JTCedula;
    private javax.swing.JTextField JTCorreo;
    private javax.swing.JTextArea JTDireccion;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextArea JTObservaviones;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
