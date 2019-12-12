package com.siac.forms.caja;

import com.siac.entities.Beca;
import com.siac.entities.Descuento;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIBeca extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Beca obj;
    private String semestre;
    private Calendar c;
    private String sem;
    
    public JIBeca() {
        initComponents();
        fillComboBox();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTEstudiante = new javax.swing.JTextField();
        JLNombreEstudiante = new javax.swing.JLabel();
        JCTipoBeca = new javax.swing.JComboBox<>();
        JTPorcentaje = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTSemestre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Becas");

        jLabel2.setText("Estudiante");

        jLabel3.setText("Tipo Beca");

        jLabel4.setText("Porcentaje");

        JTEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTEstudianteKeyPressed(evt);
            }
        });

        JLNombreEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLNombreEstudiante.setText("Nombre Estudiante");

        JCTipoBeca.setBackground(new java.awt.Color(2, 136, 209));
        JCTipoBeca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCTipoBeca.setForeground(new java.awt.Color(255, 255, 255));
        JCTipoBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        jLabel5.setText("Semestre");

        JTSemestre.setEditable(false);
        JTSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSemestreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(457, 457, 457))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBNuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(JTSemestre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCTipoBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(253, 253, 253)))
                        .addContainerGap())))
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
                    .addComponent(JTEstudiante)
                    .addComponent(JLNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCTipoBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(JTSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
           if(JTEstudiante.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Carnet de un Estudiante");
            JTEstudiante.requestFocus();
            return;
        } else if (JCTipoBeca.getSelectedItem().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un tipo de beca");
            JCTipoBeca.requestFocus();
        } 
        else if(JTPorcentaje.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingresar el porcentaje");
            JTPorcentaje.requestFocus();
            return;
        } 
        else{
        
        Save();
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JTEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTEstudianteKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            getEstudiante();
    }//GEN-LAST:event_JTEstudianteKeyPressed

    private void JTSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSemestreActionPerformed
        
    }//GEN-LAST:event_JTSemestreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            Update();  
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void getEstudiante() {
        x = new JPACrud();
        try {
            String nombre = x.getEstudianteByCarnet(
                    this.JTEstudiante.getText()).getPersona().getNombreCompleto();
            this.JLNombreEstudiante.setText(nombre);
        } catch (Exception e) {
            this.JLNombreEstudiante.setText("No se encontraron registros..");
        }
    }
    
    private void Save() {
        try {
            x = new JPACrud();
            Beca desc = new Beca();
            desc.setValor(Integer.parseInt(this.JTPorcentaje.getText()));
            desc.setTipoBeca(x.getTipoBecaById(Util.getSelectedIndex((this.JCTipoBeca.getSelectedItem().toString()))));
            desc.setEstudiante(x.getEstudianteByCarnet(this.JTEstudiante.getText()));
            desc.setSemestre(this.JTSemestre.getText());
            desc.setActivo(true);
            desc.setApelada(false);
            x.save(desc);
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
            model = getModel(COL_BECA, false);
            limpiarJTable(model);

            List<Beca> entidad = x.buscarTodo(Beca.class);
            if (entidad != null) {
                for (Beca a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getEstudiante().getCarnet() ,a.getEstudiante().getPersona().getNombreCompleto(), a.getValor(),a.getTipoBeca().getNombre().toUpperCase(),
                    a.getSemestre(), getSiNo(a.getActivo()),getSiNo(a.getApelada())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelTipoBeca = new DefaultComboBoxModel((Vector) cm.fillTipoBeca());
        this.JCTipoBeca.setModel(modelTipoBeca);
        this.JTSemestre.setText(getSemestre());
    }
    
        private void Clear() {
        this.JTEstudiante.setText("");
        this.JTPorcentaje.setText("");
        this.JLNombreEstudiante.setText("");
        fillComboBox();
    }
    
        private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Beca();
            x = new JPACrud();

            obj.setId((int) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setEstudiante(x.getEstudianteByCarnet((String) model.getValueAt(jTable1.getSelectedRow(), 1)));
            obj.setValor((double)model.getValueAt(jTable1.getSelectedRow(), 3));
            obj.setTipoBeca(x.getTipoBecaByNombre((String) model.getValueAt(jTable1.getSelectedRow(), 4)));
            obj.setSemestre((String) model.getValueAt(jTable1.getSelectedRow(), 5));  
            obj.setActivo(getBoolean((String)model.getValueAt(jTable1.getSelectedRow(), 6)));
            obj.setApelada(getBoolean((String)model.getValueAt(jTable1.getSelectedRow(), 7)));
            
                Frame f = JOptionPane.getFrameForComponent(this);
                JDBeca dialog = new JDBeca(f, true,obj);
                dialog.setVisible(true);
                Refrescar();
            ocultar_columna();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }
        
    public Beca getNuevoObjeto() {
        Beca obj = new Beca();
        obj.setActivo(true);
        obj.setApelada(false);
        return obj;
    }
    
    public String getSemestre(){
        if (c == null) {
            c = Calendar.getInstance();
        }
        int mes = c.get(Calendar.MONTH);
        if (mes <= 6) {
            semestre = "I";
        } else {
            semestre = "II";
        }
        return semestre += "S-".concat(String.valueOf(c.get(Calendar.YEAR)));
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCTipoBeca;
    private javax.swing.JLabel JLNombreEstudiante;
    private javax.swing.JTextField JTEstudiante;
    private javax.swing.JFormattedTextField JTPorcentaje;
    private javax.swing.JTextField JTSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
