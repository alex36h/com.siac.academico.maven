
package com.siac.forms.caja;

import com.siac.entities.Descuento;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.ADD_ERROR;
import static com.siac.services.Util.ADD_OK;
import static com.siac.services.Util.COL_DESCUENTO;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.getSiNo;
import static com.siac.services.Util.limpiarJTable;
import java.awt.event.KeyEvent;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIDescuentos extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Descuento obj;
    
    public JIDescuentos() {
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
        JCArancel = new javax.swing.JComboBox<>();
        JTPorcentaje = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Descuentos");

        jLabel2.setText("Estudiante");

        jLabel3.setText("Arancel");

        jLabel4.setText("Porcentaje");

        JTEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTEstudianteKeyPressed(evt);
            }
        });

        JLNombreEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLNombreEstudiante.setText("Nombre Estudiante");

        JCArancel.setBackground(new java.awt.Color(2, 136, 209));
        JCArancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCArancel.setForeground(new java.awt.Color(255, 255, 255));
        JCArancel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCArancel, 0, 311, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBNuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1))
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
                    .addComponent(jLabel4)
                    .addComponent(JTEstudiante)
                    .addComponent(JLNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCArancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        } else if (JCArancel.getSelectedItem().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Seleccionare el Arancel");
            JCArancel.requestFocus();
        } 
        else if(JTPorcentaje.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingresar el Descuento");
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
            Descuento desc = new Descuento();
            desc.setPorcentaje(Integer.parseInt(this.JTPorcentaje.getText()));
            desc.setArancel(x.getArancelById(this.JCArancel.getSelectedIndex()));
            desc.setEstudiante(this.JTEstudiante.getText());
            desc.setFecha(Date.from(Instant.now()));
            desc.setUsado(false);
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
            model = getModel(COL_DESCUENTO, false);
            limpiarJTable(model);

            List<Descuento> entidad = x.buscarTodo(Descuento.class);
            if (entidad != null) {
                for (Descuento a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), x.getEstudianteById(Integer.parseInt(a.getEstudiante())).getCarnet(), x.getEstudianteById(Integer.parseInt(a.getEstudiante())).getPersona().getNombreCompleto(), 
                       a.getArancel().getNombre(),a.getFecha().toString(), a.getPorcentaje(),getSiNo(a.getUsado())});
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelAranceles = new DefaultComboBoxModel((Vector) cm.fillAranceles());
        this.JCArancel.setModel(modelAranceles);
    }
    
        private void Clear() {
        this.JTEstudiante.setText("");
        this.JTPorcentaje.setText("");
        this.JLNombreEstudiante.setText("");
        fillComboBox();
    }
    
        private void Update() {
        if (jTable1.getSelectedRow() != -1) {
            obj = new Descuento();

            obj.setId((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setEstudiante((String) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setArancel(x.getArancelById((int)model.getValueAt(jTable1.getSelectedRow(), 0)));
            obj.setFecha((Date) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setPorcentaje((Double) model.getValueAt(jTable1.getSelectedRow(), 0));     
            obj.setUsado(false);
            
            Refrescar();
            ocultar_columna();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCArancel;
    private javax.swing.JLabel JLNombreEstudiante;
    private javax.swing.JTextField JTEstudiante;
    private javax.swing.JFormattedTextField JTPorcentaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
