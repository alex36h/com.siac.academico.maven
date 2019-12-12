
package com.siac.forms.caja;

import com.siac.entities.Banco;
import com.siac.entities.Beca;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.UPDATE_OK;
import static com.siac.services.Util.getSelectedIndex;
import static com.siac.services.Util.getSiNo;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDBeca extends javax.swing.JDialog {

    JPACrud x;
    int Id;
    Beca objBeca;
    
    public JDBeca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDBeca(java.awt.Frame parent, boolean modal, Beca objBeca) {
        super(parent, modal);
        initComponents();
        fillComboBox();
        init(objBeca);
    }
    
    public void init(Beca obj) {
        this.objBeca = obj;
        this.Id = obj.getId();
        this.JLNombreEstudiante.setText(obj.getEstudiante().getPersona().getNombreCompleto());
        this.JTEstudiante.setText(obj.getEstudiante().getCarnet());
        this.JTPorcentaje.setText(""+obj.getValor());
        this.JTSemestre.setText(obj.getSemestre());
        this.JCTipoBeca.setSelectedIndex(Integer.parseInt(obj.getTipoBeca().getId().toString()));
        this.Activo.setSelected(obj.getActivo());
        this.JCApelada.setSelected(obj.getApelada());
    }
    
        private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelTipoBeca = new DefaultComboBoxModel((Vector) cm.fillTipoBeca());
        this.JCTipoBeca.setModel(modelTipoBeca);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JTEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTSemestre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JCTipoBeca = new javax.swing.JComboBox<>();
        JTPorcentaje = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        JLNombreEstudiante = new javax.swing.JLabel();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        Activo = new javax.swing.JCheckBox();
        JCApelada = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Estudiante");

        JTEstudiante.setEditable(false);
        JTEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTEstudianteKeyPressed(evt);
            }
        });

        jLabel5.setText("Semestre");

        JTSemestre.setEditable(false);
        JTSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSemestreActionPerformed(evt);
            }
        });

        jLabel4.setText("Porcentaje");

        jLabel3.setText("Tipo Beca");

        JCTipoBeca.setBackground(new java.awt.Color(2, 136, 209));
        JCTipoBeca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCTipoBeca.setForeground(new java.awt.Color(255, 255, 255));
        JCTipoBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Becas");

        JLNombreEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLNombreEstudiante.setText("Nombre Estudiante");

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

        Activo.setText("Activo");

        JCApelada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCApelada.setText("Apelada");
        JCApelada.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTEstudiante)
                    .addComponent(JTSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(JCTipoBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JCApelada)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Activo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(JTPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Activo)
                        .addComponent(JCApelada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTEstudianteKeyPressed

    }//GEN-LAST:event_JTEstudianteKeyPressed

    private void JTSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSemestreActionPerformed
        
    }//GEN-LAST:event_JTSemestreActionPerformed

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
            Update();
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void Update() {
        try {
            x = new JPACrud();
            Beca obj = new Beca();
            obj.setId(this.Id);
            obj.setEstudiante(objBeca.getEstudiante());
            obj.setSemestre(objBeca.getSemestre());
            obj.setActivo(Activo.isSelected());
            obj.setValor(Double.parseDouble(this.JTPorcentaje.getText()));
            
            obj.setTipoBeca(x.getTipoBecaById(getSelectedIndex(this.JCTipoBeca.getSelectedItem().toString())));
            if(obj.getValor() == objBeca.getValor())
                obj.setApelada(false);
            else
                obj.setApelada(true);
            
            x.update(obj);
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDBeca dialog = new JDBeca(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox Activo;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JCheckBox JCApelada;
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
    // End of variables declaration//GEN-END:variables
}
