
package com.siac.forms.registro;

import com.siac.entities.Colegio;
import com.siac.entities.Docente;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import static com.siac.services.Util.getBoolean;
import java.time.Instant;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDDocente extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Docente obj;
    
    public JDDocente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDDocente(java.awt.Frame parent, boolean modal,Docente obj) {
        super(parent, modal);
        initComponents();
        fillComboBox();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDesempeño = new javax.swing.JTextArea();
        JTDuracion = new javax.swing.JTextField();
        JTCentroEstudios = new javax.swing.JTextField();
        JCProfesion = new javax.swing.JComboBox<>();
        JCColaborador = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Duracion");

        jLabel4.setText("Centro de estudios");

        jLabel3.setText("Profesion");

        jLabel2.setText("Persona");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion Docentes");

        JTDesempeño.setColumns(20);
        JTDesempeño.setRows(3);
        jScrollPane1.setViewportView(JTDesempeño);

        JCProfesion.setBackground(new java.awt.Color(2, 136, 209));
        JCProfesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCProfesion.setForeground(new java.awt.Color(255, 255, 255));
        JCProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCColaborador.setBackground(new java.awt.Color(2, 136, 209));
        JCColaborador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCColaborador.setForeground(new java.awt.Color(255, 255, 255));
        JCColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox1.setText("Activo");

        jLabel7.setText("Fecha Culminacion");

        jLabel6.setText("Desempeño");

        JBUpdate.setBackground(new java.awt.Color(2, 136, 209));
        JBUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBUpdate.setForeground(new java.awt.Color(255, 255, 255));
        JBUpdate.setText("Actualizar");
        JBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUpdateActionPerformed(evt);
            }
        });

        JBClose.setBackground(new java.awt.Color(2, 136, 209));
        JBClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBClose.setForeground(new java.awt.Color(255, 255, 255));
        JBClose.setText("Cancelar");
        JBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JBUpdate)
                                            .addGap(18, 18, 18)
                                            .addComponent(JBClose)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JTCentroEstudios)
                                                .addComponent(JCColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                                            .addGap(62, 62, 62)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JCProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTCentroEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUpdate)
                    .addComponent(JBClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdateActionPerformed
        Update();
    }//GEN-LAST:event_JBUpdateActionPerformed

    private void JBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCloseActionPerformed

    public void init(Docente obj) {
        this.Id = obj.getId();
        this.JCColaborador.setSelectedIndex(Integer.parseInt(obj.getPersona().getCodigo().toString()));
        this.JCProfesion.setSelectedIndex(Integer.parseInt(obj.getProfesion().getId().toString()));
        this.JTCentroEstudios.setText(obj.getCentroDeEstudio());
        this.JTDesempeño.setText(obj.getDesempeno());
        this.JTDuracion.setText(obj.getDuracion());
        //falta fecha culminacion
        this.jCheckBox1.setSelected(obj.getActivo());   
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCColaborador = new DefaultComboBoxModel((Vector) cm.fillPersonas());
        this.JCColaborador.setModel(modelJCColaborador);
        DefaultComboBoxModel modelJCProfesion = new DefaultComboBoxModel((Vector) cm.fillProfesion());
        this.JCProfesion.setModel(modelJCProfesion);
    }
    
      private void Update() {
        try {
            x = new JPACrud();
            obj = new Docente();
            obj.setId(Id);
            obj.setPersona(x.getColaborador(this.JCColaborador.getSelectedIndex()));
            obj.setProfesion(x.getProfesionById(this.JCProfesion.getSelectedIndex()));
            obj.setCentroDeEstudio(this.JTCentroEstudios.getText());
            obj.setDuracion(this.JTDuracion.getText());
            obj.setDesempeno(this.JTDesempeño.getText());
            obj.setFechaCulminacion(Date.from(Instant.now()));
            obj.setActivo(this.jCheckBox1.isSelected());
            
            x.update(obj);
            
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDDocente dialog = new JDDocente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBClose;
    private javax.swing.JButton JBUpdate;
    private javax.swing.JComboBox<String> JCColaborador;
    private javax.swing.JComboBox<String> JCProfesion;
    private javax.swing.JTextField JTCentroEstudios;
    private javax.swing.JTextArea JTDesempeño;
    private javax.swing.JTextField JTDuracion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
