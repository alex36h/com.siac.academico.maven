package com.siac.forms.registro;

import com.siac.services.JPACrud;
import java.awt.event.KeyEvent;
import com.siac.entities.*;
import com.siac.modelos.ComboModel;
import com.siac.services.Util;
import static com.siac.services.Util.*;
import java.awt.HeadlessException;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.JPACrud.getCredencial;

public class JIInscripcionReingreso extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Cursos objCursos;
    Cursos objCursosAct;
    String estudiante;
    Boolean search = false;
    List<Cursos> entidad;

    DefaultComboBoxModel modelAsignatura;
    
    public JIInscripcionReingreso() {
        initComponents();
        fillComboBox();
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        modelAsignatura = new DefaultComboBoxModel((Vector) cm.fillAsignaturasEstudianteNI());
        this.JCAsignaturas.setModel(modelAsignatura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JCIdentificacion = new javax.swing.JTextField();
        JCNombre = new javax.swing.JTextField();
        JCApellido = new javax.swing.JTextField();
        JCTelefono = new javax.swing.JFormattedTextField();
        JCCorreo = new javax.swing.JTextField();
        JRMasculino = new javax.swing.JRadioButton();
        JRFemenino = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JCObservaciones = new javax.swing.JTextArea();
        JBGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        JTROC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JCCarnet = new javax.swing.JTextField();
        JCProponer = new javax.swing.JButton();
        JdateChooseFechaNacr = new datechooser.beans.DateChooserCombo();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JCAsignaturas = new javax.swing.JComboBox<>();
        JBAgregarAsignatura = new javax.swing.JButton();
        JBQuitarAsignatura = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("INSCRIPCION REINGRESO ");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Fecha Nac.");

        jLabel7.setText("Telefono");

        jLabel8.setText("Correo");

        jLabel6.setText("Genero");

        jLabel10.setText("Observaciones");

        buttonGroup1.add(JRMasculino);
        JRMasculino.setText("M");

        buttonGroup1.add(JRFemenino);
        JRFemenino.setText("F");

        JCObservaciones.setColumns(20);
        JCObservaciones.setRows(2);
        jScrollPane2.setViewportView(JCObservaciones);

        JBGuardar.setBackground(new java.awt.Color(2, 136, 209));
        JBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(2, 136, 209));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Imprimir");

        jButton4.setBackground(new java.awt.Color(2, 136, 209));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Nuevo");

        jLabel9.setText("No. Recibo");

        JTROC.setEditable(false);
        JTROC.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Carnet");

        JCCarnet.setBackground(new java.awt.Color(204, 204, 255));
        JCCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JCCarnetKeyPressed(evt);
            }
        });

        JCProponer.setBackground(new java.awt.Color(2, 136, 209));
        JCProponer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCProponer.setForeground(new java.awt.Color(255, 255, 255));
        JCProponer.setText("Proponer Cursos");
        JCProponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCProponerActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Identificacion", "Nombre", "Apellido", "Fecha Nac.", "Telefono", "Correo", "Genero", "Observaciones"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        JCAsignaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JBAgregarAsignatura.setBackground(new java.awt.Color(2, 136, 209));
        JBAgregarAsignatura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBAgregarAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarAsignatura.setText("Agregar Asignatura");
        JBAgregarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarAsignaturaActionPerformed(evt);
            }
        });

        JBQuitarAsignatura.setBackground(new java.awt.Color(2, 136, 209));
        JBQuitarAsignatura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBQuitarAsignatura.setText("Quitar Asignatura");
        JBQuitarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBQuitarAsignaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(JCCarnet)
                                                    .addComponent(JCIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel3))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel9))))
                                            .addComponent(JCProponer))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jScrollPane2)
                                                    .addComponent(JCNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                                    .addComponent(JCTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel8))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JCCorreo)
                                                    .addComponent(JCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTROC, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JRMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JRFemenino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(JdateChooseFechaNacr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(153, 770, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JCAsignaturas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBAgregarAsignatura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBQuitarAsignatura))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTROC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(JCCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JCIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(JCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(JCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JCTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(JRMasculino)
                            .addComponent(JRFemenino))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10))
                                    .addComponent(JdateChooseFechaNacr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JCProponer))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBQuitarAsignatura)
                        .addComponent(JBAgregarAsignatura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCCarnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCCarnetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Search();
        }
    }//GEN-LAST:event_JCCarnetKeyPressed

    private void JCProponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCProponerActionPerformed
 
        ProponerCursos();
        //JOptionPane.showMessageDialog(this, this.JdateChooseFechaNacr.getCurrent().toInstant());
    }//GEN-LAST:event_JCProponerActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        Save();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBAgregarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarAsignaturaActionPerformed
        if(JCAsignaturas.getSelectedIndex() != 0)
        {
            AddSingle();
        }
    }//GEN-LAST:event_JBAgregarAsignaturaActionPerformed

    private void JBQuitarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBQuitarAsignaturaActionPerformed
        RemoveSingle();
    }//GEN-LAST:event_JBQuitarAsignaturaActionPerformed

    private void AddSingle()
    {
        try {
            x = new JPACrud();
            String curso = JCAsignaturas.getSelectedItem().toString().substring(
                    JCAsignaturas.getSelectedItem().toString().indexOf(":")+1, JCAsignaturas.getSelectedItem().toString().length());
            if (model.getRowCount() != 0) {
                
                for (int i = 0; i < model.getRowCount(); i++) {
                    if(curso.equals(Long.toString((Long)model.getValueAt(i, 0))))
                    {
                        JOptionPane.showMessageDialog(this, "El curso ya esta fue agregado anteriormente");
                        return;
                    }
                    else
                    {
                        Cursos dato = x.getCursosById(Integer.parseInt(curso));
                        model.addRow(new Object[]{dato.getId(), dato.getAsignaturas().getNombre(),
                            dato.getCodigo(),dato.getAula().getNombre()});
                    }
                }
                
                jTable1.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Esta opcion solo es para agregar clases extra. Debe proponer primero");
            }
        } catch (Exception e) {
            System.out.println("addSingle "+e);
        }
    }
    
    private void RemoveSingle()
    {
        try {

            if (model.getRowCount() != 0) {
                              
                        model.removeRow(jTable1.getSelectedRow());
                
                jTable1.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "No hay cursos para eliminar..");
            }
            
        } catch (Exception e) {
            System.out.println("RemoveSingle "+e);
        }
    }
      
    private void Save()
    {
        try {    
            if(!fechaValida(this.JdateChooseFechaNacr.getCurrent()))
            {
                JOptionPane.showMessageDialog(this,DATE_ERROR);
                return;
            }
            
            if(entidad != null)
            {
                for (Object obj : entidad) {
                x = new JPACrud();
                Cursoinscripcion ci = new Cursoinscripcion();
                ci.setCursos(objCursos);
                ci.setEstudiante(x.getEstudianteByCarnet(estudiante));
                ci.setCredencial(getCredencial());
                ci.setFechaInscripcion(Date.from(Instant.now()));
                ci.setActivo(true);
            }
            }
            
        } catch (Exception e) {
            System.out.println("Save......"+e);
        }
    }
    
    private void ProponerCursos() {
        Boolean aprobo;
        if (search == false) {
            JOptionPane.showMessageDialog(this, "debe de ingresar un carnet antes de proponer");
            return;
        }
        try {
            x = new JPACrud();
            objCursos = x.getLastInsc(estudiante).getCursos();

            aprobo = x.getAproboSemestre(objCursos, estudiante);
            if (aprobo == true) {
                model = getModel(COL_CURSOINSCRIPCION, false);
                limpiarJTable(model);

                entidad = x.getCursosPeriodoActivoRI(objCursos,aprobo);
                if (entidad != null) {
                    for (Cursos a
                            : entidad) {
                        model.addRow(new Object[]{a.getId(), a.getAsignaturas().getNombre(),
                            a.getCodigo(),a.getAula().getNombre(),a.getAnio()});
                    }
                }
                jTable1.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "El estudiante es burro y va a repetir");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void Search() {
        search = Boolean.TRUE;
        int ROC = 0;
        try {
            x = new JPACrud();

            this.estudiante = this.JCCarnet.getText();

            if (this.estudiante.contains("" + getYear())) {
                JOptionPane.showMessageDialog(this, "Este modulo es para los nuevo ingreso");
                
            } else {
                ROC = x.getNumROCInscripcion(estudiante, "la 2019");

                if (estudiante.length() == 0) {//if(this.JCCarnet.getText().length() < 10)
                    JOptionPane.showMessageDialog(this, "Ingrese un Carnet Valido");
                    return;
                }
                if (ROC == 0) {
                    JOptionPane.showMessageDialog(this, "El estudiante no a pagado matricula");
                } else {
                    this.JTROC.setText(""+ROC);
                    Persona obj = x.getEstudianteByCarnet(estudiante).getPersona();
                    this.JCIdentificacion.setText(obj.getIdentificacion());
                    this.JCNombre.setText(obj.getNombre());
                    this.JCApellido.setText(obj.getApellido());
                    this.JCTelefono.setText(obj.getTelefono());
                    this.JCCorreo.setText(obj.getCorreo());
                    this.JCObservaciones.setText(obj.getObservaciones());

                    this.JdateChooseFechaNacr.setCurrent(Util.toCalendar(obj.getFechaNacimiento()));
//fernanda 3T1-A
                    if (obj.getGenero() == true) {
                        this.JRMasculino.setSelected(true);
                    } else {
                        this.JRFemenino.setSelected(true);
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Search() " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarAsignatura;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBQuitarAsignatura;
    private javax.swing.JTextField JCApellido;
    private javax.swing.JComboBox<String> JCAsignaturas;
    private javax.swing.JTextField JCCarnet;
    private javax.swing.JTextField JCCorreo;
    private javax.swing.JTextField JCIdentificacion;
    private javax.swing.JTextField JCNombre;
    private javax.swing.JTextArea JCObservaciones;
    private javax.swing.JButton JCProponer;
    private javax.swing.JFormattedTextField JCTelefono;
    private javax.swing.JRadioButton JRFemenino;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JTextField JTROC;
    private datechooser.beans.DateChooserCombo JdateChooseFechaNacr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
