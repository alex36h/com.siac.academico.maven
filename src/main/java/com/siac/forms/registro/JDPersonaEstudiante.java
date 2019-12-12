
package com.siac.forms.registro;

import com.siac.entities.Persona;
import com.siac.services.JPACrud;
import static com.siac.services.Util.ADD_ERROR;
import static com.siac.services.Util.ADD_OK;
import static com.siac.services.Util.COL_PERSONAS;
import static com.siac.services.Util.getGenero;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.getSiNo;
import static com.siac.services.Util.limpiarJTable;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JDPersonaEstudiante extends javax.swing.JDialog {
    
    JPACrud x;
    DefaultTableModel model;
    Persona obj;

    public JDPersonaEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Refrescar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        JTDireccion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTObservaviones = new javax.swing.JTextArea();
        JTCedula = new javax.swing.JFormattedTextField();
        JTNombre = new javax.swing.JTextField();
        JBGuardar = new javax.swing.JButton();
        JTApellido = new javax.swing.JFormattedTextField();
        JBNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JRMasculino = new javax.swing.JRadioButton();
        JTTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JRFemenino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTDireccion.setColumns(20);
        JTDireccion.setRows(5);
        jScrollPane5.setViewportView(JTDireccion);

        jLabel8.setText("Dirreccion");

        jLabel9.setText("Observaciones");

        JTObservaviones.setColumns(20);
        JTObservaviones.setRows(5);
        jScrollPane6.setViewportView(JTObservaviones);

        JTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNombreActionPerformed(evt);
            }
        });

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion datos colaboradores");

        jLabel4.setText("Telefono");

        jLabel2.setText("Cedula");

        JRMasculino.setText("Masculino");

        jLabel3.setText("Nombre");

        JRFemenino.setText("Femenino");

        jLabel10.setText("F: Nac");

        jLabel5.setText("Apellido");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jLabel6.setText("Correo");

        jLabel7.setText("Genero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTCorreo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel10))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(420, 420, 420)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRMasculino)
                            .addComponent(JRFemenino)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBNuevo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JRMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRFemenino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNombreActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        Clear();
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

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
                            a.getApellido().toUpperCase(),a.getFechaNacimiento().toInstant(),
                        a.getDireccion().toUpperCase(), a.getTelefono(), a.getCorreo(), 
                        a.getObservaciones().toUpperCase(),
                        getGenero(a.getGenero()),getSiNo(a.getActivo())});
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
            obj = new Persona();
            obj.setCodigo((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            obj.setIdentificacion((String)model.getValueAt(jTable1.getSelectedRow(), 1));
          
                
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione");
            }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDPersonaEstudiante dialog = new JDPersonaEstudiante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JRadioButton JRFemenino;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JFormattedTextField JTApellido;
    private javax.swing.JFormattedTextField JTCedula;
    private javax.swing.JTextField JTCorreo;
    private javax.swing.JTextArea JTDireccion;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextArea JTObservaviones;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
