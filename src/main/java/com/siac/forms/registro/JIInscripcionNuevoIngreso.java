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

public class JIInscripcionNuevoIngreso extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Cursos objCursos;
    Cursos objCursosAct;
    String estudiante;
    Boolean search = false;
    Persona objPersona;
    List<Cursos> entidad;
    Cursoinscripcion objCursoInscripcion;
    Estudiante objEstudiante;
    
    DefaultComboBoxModel modelAsignatura;
            
    public JIInscripcionNuevoIngreso() {
        initComponents();
        fillComboBox();
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
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTCarnet = new javax.swing.JTextField();
        JCProponer = new javax.swing.JButton();
        JdateChooseFechaNacr = new datechooser.beans.DateChooserCombo();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBAgregarAsignatura = new javax.swing.JButton();
        JBQuitarAsignatura = new javax.swing.JButton();
        JCAsignaturas = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("INSCRIPCION NUEVO INGRESO");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Fecha Nac.");

        jLabel7.setText("Telefono");

        jLabel8.setText("Correo");

        jLabel6.setText("Genero");

        jLabel10.setText("Direccion");

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

        jTextField5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Carnet");

        JTCarnet.setBackground(new java.awt.Color(204, 204, 255));
        JTCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTCarnetKeyPressed(evt);
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

        JCAsignaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JRMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JRFemenino))
                                    .addComponent(JdateChooseFechaNacr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCIdentificacion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)))
                            .addComponent(JCProponer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JCAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBAgregarAsignatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBQuitarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(JTCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(JCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(JRMasculino)
                                .addComponent(JRFemenino)
                                .addComponent(JCTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JCCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(JCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(JdateChooseFechaNacr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JCProponer))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAgregarAsignatura)
                    .addComponent(JBQuitarAsignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        modelAsignatura = new DefaultComboBoxModel((Vector) cm.fillAsignaturasEstudianteNI());
        this.JCAsignaturas.setModel(modelAsignatura);
    }
    
    private void JTCarnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCarnetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Search();
        }
    }//GEN-LAST:event_JTCarnetKeyPressed

    private void JCProponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCProponerActionPerformed
        ProponerCursos();
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
            
            x = new JPACrud();
            String curso = JCAsignaturas.getSelectedItem().toString().substring(
                    JCAsignaturas.getSelectedItem().toString().indexOf(":")+1, JCAsignaturas.getSelectedItem().toString().length());
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
            
            x = new JPACrud();
            
            if(!fechaValida(this.JdateChooseFechaNacr.getCurrent()))
            {
                JOptionPane.showMessageDialog(this,DATE_ERROR);
                return;
            }
                
            boolean genero;
            if(JRMasculino.isSelected())
                genero = true;
            else 
                genero = false;
            objPersona = new Persona();
            objPersona.setIdentificacion(this.JCIdentificacion.getText());
            objPersona.setNombre(this.JCNombre.getText());
            objPersona.setApellido(this.JCApellido.getText());
            objPersona.setDireccion(this.JCObservaciones.getText());
            objPersona.setTelefono(this.JCTelefono.getText());
            objPersona.setObservaciones(this.JCObservaciones.getText());
            objPersona.setGenero(genero);
            objPersona.setFechaNacimiento((Date.from(this.JdateChooseFechaNacr.getCurrent().toInstant())));
            objPersona.setActivo(true);
            x.save(objPersona);
             
            x = new JPACrud();
            objEstudiante = new Estudiante();
            objEstudiante.setPersona(objPersona);
            objEstudiante.setCarnet(x.getCarnet());
            objEstudiante.setTelefono(objPersona.getTelefono());
            objEstudiante.setFechaRegistro(Date.from(Instant.now()));
            objEstudiante.setCredencial(getCredencial());
            objEstudiante.setActivo(true);
            x.save(objEstudiante);
            
            for (Cursos obj : entidad) {
                x = new JPACrud();
                objCursoInscripcion = new Cursoinscripcion();
                objCursoInscripcion.setActivo(true);
                objCursoInscripcion.setCursos(obj);
                objCursoInscripcion.setEstudiante(objEstudiante);
                objCursoInscripcion.setFechaInscripcion(getDate());
                objCursoInscripcion.setEstudianteCarnet(objEstudiante.getCarnet());
                objCursoInscripcion.setCredencial(getCredencial());
                x.save(objCursoInscripcion);
            }
            x = new JPACrud();
            x.generarMensualidades(objEstudiante);
            
            JOptionPane.showMessageDialog(this, ADD_OK);
            this.JTCarnet.setText(objEstudiante.getCarnet());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, ADD_ERROR);
        }
    }
    
    private boolean Validar()
    {
        return !(this.JCNombre.getText().length() == 0 || this.JCApellido.getText().length() == 0 ||
                (this.JRFemenino.isSelected() == false && this.JRMasculino.isSelected() == false)
                || this.JCTelefono.getText().length() == 0);       
    }
    
    
    private void ProponerCursos() {
        try {
            x = new JPACrud();
            
            if (Validar()) {
                model = getModel(COL_CURSOINSCRIPCION, false);
                limpiarJTable(model);

                entidad = x.getCursosPeriodoActivoNI();
                if (entidad != null) {
                    for (Cursos a
                            : entidad) {
                        model.addRow(new Object[]{a.getId(), a.getAsignaturas().getNombre(),
                            a.getCodigo(),a.getAula().getNombre()});
                    }
                }
                jTable1.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Debe de completar la informacion del estudiante");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void Search() {
        try {
            x = new JPACrud();

            this.estudiante = this.JTCarnet.getText();
            if(estudiante.length() == 9)
            {
                    Persona obj = x.getEstudianteByCarnet(estudiante).getPersona();
                    this.JCIdentificacion.setText(obj.getIdentificacion());
                    this.JCNombre.setText(obj.getNombre());
                    this.JCApellido.setText(obj.getApellido());
                    this.JCTelefono.setText(obj.getTelefono());
                    this.JCCorreo.setText(obj.getCorreo());
                    this.JCObservaciones.setText(obj.getObservaciones());

                    this.JdateChooseFechaNacr.setCurrent(Util.toCalendar(obj.getFechaNacimiento()));
                    if (obj.getGenero() == true) {
                        this.JRMasculino.setSelected(true);
                    } else {
                        this.JRFemenino.setSelected(true);
                    }
                    
                model = getModel(COL_CURSOINSCRIPCION, false);
                limpiarJTable(model);

                entidad = x.getCursoInscripcion(estudiante);
                if (entidad != null) {
                    for (Cursos a
                            : entidad) {
                        model.addRow(new Object[]{a.getId(), a.getAsignaturas().getNombre(),
                            a.getCodigo(),a.getAula().getNombre(),a.getAnio()});
                    }
                }
                jTable1.setModel(model);
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
    private javax.swing.JTextField JCCorreo;
    private javax.swing.JTextField JCIdentificacion;
    private javax.swing.JTextField JCNombre;
    private javax.swing.JTextArea JCObservaciones;
    private javax.swing.JButton JCProponer;
    private javax.swing.JFormattedTextField JCTelefono;
    private javax.swing.JRadioButton JRFemenino;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JTextField JTCarnet;
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
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
