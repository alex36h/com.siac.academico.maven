
package com.siac.forms.registro;

import com.siac.entities.Alergia;
import com.siac.entities.Antecedentealergiaestudiante;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import static com.siac.services.Util.getSelectedIndex;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDAntecedenteAlergiaEstudiante extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Antecedentealergiaestudiante obj;
    
    public JDAntecedenteAlergiaEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDAntecedenteAlergiaEstudiante(java.awt.Frame parent, boolean modal, Antecedentealergiaestudiante obj) {
        super(parent, modal);
        initComponents();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCEstudiante = new javax.swing.JComboBox<>();
        JCAlergia = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTMedicamento = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTDiagnostico = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTFrecuencia = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Alergia");

        jLabel6.setText("Diagnostico");

        JCEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kevin Alejandro Rodriguez Perez", "MIchael Ricardo Rivera Torres" }));

        JCAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rinitis Alergica" }));

        JTMedicamento.setColumns(20);
        JTMedicamento.setLineWrap(true);
        JTMedicamento.setRows(3);
        jScrollPane4.setViewportView(JTMedicamento);

        jLabel5.setText("Frecuencia");

        JTDiagnostico.setColumns(20);
        JTDiagnostico.setLineWrap(true);
        JTDiagnostico.setRows(3);
        jScrollPane2.setViewportView(JTDiagnostico);

        JTFrecuencia.setColumns(20);
        JTFrecuencia.setLineWrap(true);
        JTFrecuencia.setRows(2);
        jScrollPane5.setViewportView(JTFrecuencia);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Antecedentes de enfermedades");

        jLabel7.setText("Medicamentos");

        jLabel2.setText("Estudiante");

        jCheckBox1.setText("Activo");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCEstudiante, javax.swing.GroupLayout.Alignment.LEADING, 0, 297, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCAlergia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jCheckBox1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBClose)))
                                .addGap(0, 134, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBUpdate)
                            .addComponent(JBClose))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdateActionPerformed
        Update();
    }//GEN-LAST:event_JBUpdateActionPerformed

    private void JBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCloseActionPerformed

    public void init(Antecedentealergiaestudiante obj) {
        this.Id = obj.getId();
        this.JTDiagnostico.setText(obj.getDiagnosticoAlergia());
        this.JTFrecuencia.setText(obj.getFrecuencia());
        this.JTMedicamento.setText(obj.getMedicamentos());
    }

    private void Update() {
        try {
            
            x = new JPACrud();
            obj = new Antecedentealergiaestudiante();
            obj.setId(this.Id);
            obj.setDiagnosticoAlergia(this.JTDiagnostico.getText());
            obj.setFrecuencia(this.JTFrecuencia.getText());
            obj.setMedicamentos(this.JTMedicamento.getText());
            obj.setAlergia(x.getAlergias(this.JCAlergia.getSelectedIndex()));
            obj.setEstudiante(x.getEstudianteById(getSelectedIndex(this.JCEstudiante.getSelectedItem().toString())));;
            x.update(obj);
            
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            
            this.dispose();
        } catch (Exception e) {
        }
    }

        private void getJCDatos() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCEstudiante = new DefaultComboBoxModel((Vector) cm.fillEstudiantes());
        DefaultComboBoxModel modelJCAlergia = new DefaultComboBoxModel((Vector) cm.fillAlergias());
        this.JCEstudiante.setModel(modelJCEstudiante);
        this.JCAlergia.setModel(modelJCAlergia);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAntecedenteAlergiaEstudiante dialog = new JDAntecedenteAlergiaEstudiante(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> JCAlergia;
    private javax.swing.JComboBox<String> JCEstudiante;
    private javax.swing.JTextArea JTDiagnostico;
    private javax.swing.JTextArea JTFrecuencia;
    private javax.swing.JTextArea JTMedicamento;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
