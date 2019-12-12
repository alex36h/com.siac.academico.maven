package com.siac.forms.registro;

import com.siac.entities.Cursos;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.*;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static com.siac.services.JPACrud.getCredencial;
import static com.siac.services.Util.addInternal;

public class JICurso extends javax.swing.JInternalFrame {

    JPACrud x;
    Cursos obj;
    
    public JICurso() {
        initComponents();
        fillComboBox();
    }
    
     private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelAsignatura = new DefaultComboBoxModel((Vector) cm.fillAsignaturas());
        DefaultComboBoxModel modelDocente = new DefaultComboBoxModel((Vector) cm.fillDocentes());
        DefaultComboBoxModel modelAñoLectivo = new DefaultComboBoxModel((Vector) cm.fillAñosLectivos());
        DefaultComboBoxModel modelPlanDeEstudios = new DefaultComboBoxModel((Vector) cm.fillPlanesDeEstudio());
        DefaultComboBoxModel modelAulas = new DefaultComboBoxModel((Vector) cm.fillAulas());
        this.JCAsignatura.setModel(modelAsignatura);
        this.JCDocente.setModel(modelDocente);
        this.JCAñoLectivo.setModel(modelAñoLectivo);
        this.JCPlanDeEstudio.setModel(modelPlanDeEstudios);
        this.JCAula.setModel(modelAulas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCAñoLectivo = new javax.swing.JComboBox<>();
        JCPlanDeEstudio = new javax.swing.JComboBox<>();
        JCAsignatura = new javax.swing.JComboBox<>();
        JCDocente = new javax.swing.JComboBox<>();
        JTCupo = new javax.swing.JTextField();
        JBGuardar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JCAula = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JTAño = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de Curso");

        jLabel2.setText("Año Lectivo");

        jLabel3.setText("Plan de Estudios");

        jLabel4.setText("Asignatura");

        jLabel5.setText("Docente");

        jLabel6.setText("Cupo");

        JCAñoLectivo.setBackground(new java.awt.Color(2, 136, 209));
        JCAñoLectivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAñoLectivo.setForeground(new java.awt.Color(255, 255, 255));
        JCAñoLectivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCPlanDeEstudio.setBackground(new java.awt.Color(2, 136, 209));
        JCPlanDeEstudio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCPlanDeEstudio.setForeground(new java.awt.Color(255, 255, 255));
        JCPlanDeEstudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCAsignatura.setBackground(new java.awt.Color(2, 136, 209));
        JCAsignatura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        JCAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JCDocente.setBackground(new java.awt.Color(2, 136, 209));
        JCDocente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCDocente.setForeground(new java.awt.Color(255, 255, 255));
        JCDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel7.setText("Codigo");

        jButton1.setBackground(new java.awt.Color(2, 136, 209));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Listar de Cursos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Aula");

        JCAula.setBackground(new java.awt.Color(2, 136, 209));
        JCAula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCAula.setForeground(new java.awt.Color(255, 255, 255));
        JCAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(JTCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JCAñoLectivo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCPlanDeEstudio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCAsignatura, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTAño, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCAñoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCPlanDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JCAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JICursos obj = new JICursos();
        addInternal(obj);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Clear()
    {
        fillComboBox();
        this.JTCupo.setText("");
    }
    
    private void Save() {
        try {
            x = new JPACrud();
            obj = new Cursos();
            
            obj.setCodigo(this.JTCodigo.getText());
            obj.setAsignaturas(x.getAsignaturasById(this.JCAsignatura.getSelectedIndex()));
            obj.setDocente(x.getDocenteById(this.JCDocente.getSelectedIndex()).getPersona());
            obj.setAñoLectivo(x.getAñioLectivoById(this.JCAñoLectivo.getSelectedIndex()));
            obj.setPlanEstudios(x.getPlanestudiosById(this.JCPlanDeEstudio.getSelectedIndex()));
            obj.setCupo(Integer.parseInt(this.JTCupo.getText()));
            obj.setAula(x.getAulasById(this.JCAula.getSelectedIndex()));
            obj.setAnio(Integer.parseInt(this.JTAño.getText()));
            obj.setCredencial(getCredencial());
            x.save(obj);
            JOptionPane.showMessageDialog(this, ADD_OK);
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<String> JCAsignatura;
    private javax.swing.JComboBox<String> JCAula;
    private javax.swing.JComboBox<String> JCAñoLectivo;
    private javax.swing.JComboBox<String> JCDocente;
    private javax.swing.JComboBox<String> JCPlanDeEstudio;
    private javax.swing.JTextField JTAño;
    private javax.swing.JTextField JTCodigo;
    private javax.swing.JTextField JTCupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
