
package com.siac.main;

import com.siac.entities.Gruporol;
import com.siac.entities.Rol;
import com.siac.entities.Rolgrupousuario;
import com.siac.forms.caja.*;
import com.siac.forms.registro.*;
import com.siac.services.JPACrud;
import static com.siac.services.JPACrud.getCredencial;
import com.siac.services.JPAEntityManager;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class Begin extends javax.swing.JFrame {

    private JPAEntityManager usuarioSesion;
    private String usr;
    private JPACrud x;
    
    public Begin(String usuario) {
        initComponents();
        this.setLocationRelativeTo(null); 
        usr = usuario;
        //construirMenu();
    }

    public Begin() throws HeadlessException {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        JExcel = new javax.swing.JMenuItem();
        JWord = new javax.swing.JMenuItem();
        JCalc = new javax.swing.JMenuItem();
        JSesion = new javax.swing.JMenu();
        JSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JAranceles = new javax.swing.JMenu();
        JBancos = new javax.swing.JMenu();
        JMoneda = new javax.swing.JMenu();
        JFormaPago = new javax.swing.JMenu();
        JTipoCambio = new javax.swing.JMenu();
        Jcargos = new javax.swing.JMenu();
        JCargoEmpleado = new javax.swing.JMenu();
        JCiudad = new javax.swing.JMenu();
        JAlergias = new javax.swing.JMenu();
        JAsignaturas = new javax.swing.JMenu();
        JColegios = new javax.swing.JMenu();
        JEnfermedad = new javax.swing.JMenu();
        JModalidad = new javax.swing.JMenu();
        JParentesco = new javax.swing.JMenu();
        JPeriodoLectivo = new javax.swing.JMenu();
        JProfesion = new javax.swing.JMenu();
        JTurno = new javax.swing.JMenu();
        JCursos = new javax.swing.JMenu();
        JPlanesEstudio = new javax.swing.JMenu();
        JTipoColegio = new javax.swing.JMenu();
        JPais = new javax.swing.JMenu();
        JPeriodoLectivo1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        JSecretaria = new javax.swing.JMenu();
        JEstudiante = new javax.swing.JMenu();
        JAntecedenteAlergiaEst = new javax.swing.JMenu();
        JEstudiante1 = new javax.swing.JMenu();
        JResponsable = new javax.swing.JMenu();
        JFamiliar = new javax.swing.JMenu();
        JAntecedenteEnfermedad = new javax.swing.JMenu();
        JMDocentes = new javax.swing.JMenu();
        JMTrabajoAnterior = new javax.swing.JMenu();
        JMDocente = new javax.swing.JMenu();
        JMRegistroCalificaciones = new javax.swing.JMenu();
        JMDocentes1 = new javax.swing.JMenu();
        JMCurso = new javax.swing.JMenu();
        JMCursos = new javax.swing.JMenu();
        JEvalaluaciones = new javax.swing.JMenu();
        JIInscripciones = new javax.swing.JMenu();
        JIInscripcionReingreso = new javax.swing.JMenu();
        JIInscripcionNuevoIngreso = new javax.swing.JMenu();
        JTraslados = new javax.swing.JMenuItem();
        JMCaja = new javax.swing.JMenu();
        JSeries = new javax.swing.JMenu();
        JMICaja = new javax.swing.JMenu();
        JCApertura = new javax.swing.JMenu();
        JIngresos = new javax.swing.JMenuItem();
        JDeposito = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JDescuentos = new javax.swing.JMenu();
        JCCierrre = new javax.swing.JMenu();
        JMIRecibos = new javax.swing.JMenu();
        JMIRecibosReimpresion = new javax.swing.JMenu();
        JMITipoBeca = new javax.swing.JMenu();
        JMIBeca = new javax.swing.JMenu();
        JCXC = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        JControlDePagos = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        JColaborador = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        JCurso = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1375, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        jMenu3.setText("Archivos");

        jMenu10.setText("Herramientas");

        JExcel.setText("Excel");
        JExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JExcelActionPerformed(evt);
            }
        });
        jMenu10.add(JExcel);

        JWord.setText("Word");
        JWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JWordActionPerformed(evt);
            }
        });
        jMenu10.add(JWord);

        JCalc.setText("Calculadora");
        JCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCalcActionPerformed(evt);
            }
        });
        jMenu10.add(JCalc);

        jMenu3.add(jMenu10);

        JSesion.setText("Sesión");

        JSalir.setText("Cerrar Sesión");
        JSesion.add(JSalir);

        jMenu3.add(JSesion);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Catalogos");

        JAranceles.setText("Aranceles");
        JAranceles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JArancelesMouseClicked(evt);
            }
        });
        jMenu1.add(JAranceles);

        JBancos.setText("Bancos");
        JBancos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBancosMouseClicked(evt);
            }
        });
        jMenu1.add(JBancos);

        JMoneda.setText("Monedas");
        JMoneda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMonedaMouseClicked(evt);
            }
        });
        jMenu1.add(JMoneda);

        JFormaPago.setText("Forma de Pagos");
        JFormaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFormaPagoMouseClicked(evt);
            }
        });
        jMenu1.add(JFormaPago);

        JTipoCambio.setText("Tipo Cambio");
        JTipoCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTipoCambioMouseClicked(evt);
            }
        });
        jMenu1.add(JTipoCambio);

        Jcargos.setText("Cargos");
        Jcargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JcargosMouseClicked(evt);
            }
        });
        jMenu1.add(Jcargos);

        JCargoEmpleado.setText("Cargo Empleado");
        JCargoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCargoEmpleadoMouseClicked(evt);
            }
        });
        jMenu1.add(JCargoEmpleado);

        JCiudad.setText("Ciudad");
        JCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCiudadMouseClicked(evt);
            }
        });
        jMenu1.add(JCiudad);

        JAlergias.setText("Alergias");
        JAlergias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAlergiasMouseClicked(evt);
            }
        });
        jMenu1.add(JAlergias);

        JAsignaturas.setText("Asignaturas");
        JAsignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAsignaturasMouseClicked(evt);
            }
        });
        jMenu1.add(JAsignaturas);

        JColegios.setText("Colegios");
        JColegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JColegiosMouseClicked(evt);
            }
        });
        jMenu1.add(JColegios);

        JEnfermedad.setText("Enfermedad");
        JEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JEnfermedadMouseClicked(evt);
            }
        });
        jMenu1.add(JEnfermedad);

        JModalidad.setText("Modalidad");
        JModalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JModalidadMouseClicked(evt);
            }
        });
        jMenu1.add(JModalidad);

        JParentesco.setText("Parentesco");
        JParentesco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JParentescoMouseClicked(evt);
            }
        });
        jMenu1.add(JParentesco);

        JPeriodoLectivo.setText("Periodo Lectivo");
        JPeriodoLectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPeriodoLectivoMouseClicked(evt);
            }
        });
        jMenu1.add(JPeriodoLectivo);

        JProfesion.setText("Profesion");
        JProfesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JProfesionMouseClicked(evt);
            }
        });
        jMenu1.add(JProfesion);

        JTurno.setText("Turno");
        JTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTurnoMouseClicked(evt);
            }
        });
        jMenu1.add(JTurno);

        JCursos.setText("Cursos");
        JCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCursosMouseClicked(evt);
            }
        });
        jMenu1.add(JCursos);

        JPlanesEstudio.setText("Planes De Estudios");
        JPlanesEstudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPlanesEstudioMouseClicked(evt);
            }
        });
        jMenu1.add(JPlanesEstudio);

        JTipoColegio.setText("Tipo Colegio");
        JTipoColegio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTipoColegioMouseClicked(evt);
            }
        });
        jMenu1.add(JTipoColegio);

        JPais.setText("Pais");
        JPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaisMouseClicked(evt);
            }
        });
        jMenu1.add(JPais);

        JPeriodoLectivo1.setText("Años Lectivos");
        JPeriodoLectivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPeriodoLectivo1MouseClicked(evt);
            }
        });
        jMenu1.add(JPeriodoLectivo1);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Registro");

        JSecretaria.setText("Secretaría");

        JEstudiante.setText("Expediente Estudiante");
        JEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JEstudianteMouseClicked(evt);
            }
        });

        JAntecedenteAlergiaEst.setText("Antecedente Alergias");
        JAntecedenteAlergiaEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAntecedenteAlergiaEstMouseClicked(evt);
            }
        });
        JEstudiante.add(JAntecedenteAlergiaEst);

        JEstudiante1.setText("Estudiante");
        JEstudiante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JEstudiante1MouseClicked(evt);
            }
        });
        JEstudiante.add(JEstudiante1);

        JResponsable.setText("Responsable");
        JResponsable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JResponsableMouseClicked(evt);
            }
        });
        JEstudiante.add(JResponsable);

        JFamiliar.setText("Enfermedades");
        JFamiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFamiliarMouseClicked(evt);
            }
        });
        JEstudiante.add(JFamiliar);

        JAntecedenteEnfermedad.setText("Antecedente Enfermedades");
        JAntecedenteEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAntecedenteEnfermedadMouseClicked(evt);
            }
        });
        JEstudiante.add(JAntecedenteEnfermedad);

        JSecretaria.add(JEstudiante);

        JMDocentes.setText("Docentes");
        JMDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMDocentesMouseClicked(evt);
            }
        });

        JMTrabajoAnterior.setText("Trabajo Anterior Docentes");
        JMTrabajoAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMTrabajoAnteriorMouseClicked(evt);
            }
        });
        JMDocentes.add(JMTrabajoAnterior);

        JMDocente.setText("Docentes");
        JMDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMDocenteMouseClicked(evt);
            }
        });
        JMDocentes.add(JMDocente);

        JMRegistroCalificaciones.setText("Registro de Calificaciones");
        JMRegistroCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMRegistroCalificacionesMouseClicked(evt);
            }
        });
        JMDocentes.add(JMRegistroCalificaciones);

        JSecretaria.add(JMDocentes);

        JMDocentes1.setText("Cursos");
        JMDocentes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMDocentes1MouseClicked(evt);
            }
        });

        JMCurso.setText("Curso");
        JMCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMCursoMouseClicked(evt);
            }
        });
        JMDocentes1.add(JMCurso);

        JMCursos.setText("Cursos");
        JMCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMCursosMouseClicked(evt);
            }
        });
        JMDocentes1.add(JMCursos);

        JSecretaria.add(JMDocentes1);

        jMenu4.add(JSecretaria);

        JEvalaluaciones.setText("Evaluaciones");
        jMenu4.add(JEvalaluaciones);

        JIInscripciones.setText("Inscripciones");
        JIInscripciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JIInscripcionesMouseClicked(evt);
            }
        });

        JIInscripcionReingreso.setText("Reingreso");
        JIInscripcionReingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JIInscripcionReingresoMouseClicked(evt);
            }
        });
        JIInscripciones.add(JIInscripcionReingreso);

        JIInscripcionNuevoIngreso.setText("Nuevo Ingreso");
        JIInscripcionNuevoIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JIInscripcionNuevoIngresoMouseClicked(evt);
            }
        });
        JIInscripciones.add(JIInscripcionNuevoIngreso);

        jMenu4.add(JIInscripciones);

        JTraslados.setText("Traslados");
        jMenu4.add(JTraslados);

        jMenuBar1.add(jMenu4);

        JMCaja.setText("Caja");

        JSeries.setText("Series Recibo");
        JSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSeriesMouseClicked(evt);
            }
        });
        JMCaja.add(JSeries);

        JMICaja.setText("Caja");
        JMICaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMICajaMouseClicked(evt);
            }
        });
        JMCaja.add(JMICaja);

        JCApertura.setText("Apertura");
        JCApertura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCAperturaMouseClicked(evt);
            }
        });
        JMCaja.add(JCApertura);

        JIngresos.setText("Ingresos");
        JMCaja.add(JIngresos);

        JDeposito.setText("Depositos");
        JMCaja.add(JDeposito);

        jMenuItem1.setText("Egresos");
        JMCaja.add(jMenuItem1);

        JDescuentos.setText("Descuentos");
        JDescuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JDescuentosMouseClicked(evt);
            }
        });
        JMCaja.add(JDescuentos);

        JCCierrre.setText("Cierre Caja");
        JCCierrre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCCierrreMouseClicked(evt);
            }
        });
        JMCaja.add(JCCierrre);

        JMIRecibos.setText("Recibos");
        JMIRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMIRecibosMouseClicked(evt);
            }
        });
        JMCaja.add(JMIRecibos);

        JMIRecibosReimpresion.setText("Reimpresion Recibos");
        JMIRecibosReimpresion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMIRecibosReimpresionMouseClicked(evt);
            }
        });
        JMCaja.add(JMIRecibosReimpresion);

        JMITipoBeca.setText("Tipo Beca");
        JMITipoBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMITipoBecaMouseClicked(evt);
            }
        });
        JMCaja.add(JMITipoBeca);

        JMIBeca.setText("Becas");
        JMIBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMIBecaMouseClicked(evt);
            }
        });
        JMCaja.add(JMIBeca);

        jMenuBar1.add(JMCaja);

        JCXC.setText("Cuentas Por Cobrar");

        jMenuItem2.setText("Gestión de Mora");
        JCXC.add(jMenuItem2);

        jMenuItem3.setText("Arreeglos de Pago");
        JCXC.add(jMenuItem3);

        JControlDePagos.setText("Control de Pagos");
        JControlDePagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JControlDePagosMouseClicked(evt);
            }
        });
        JCXC.add(JControlDePagos);

        jMenuBar1.add(JCXC);

        jMenu7.setText("Dirección");

        JColaborador.setText("Personas");
        JColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JColaboradorMouseClicked(evt);
            }
        });
        jMenu7.add(JColaborador);

        jMenuItem4.setText("Horarios");
        jMenu7.add(jMenuItem4);

        JCurso.setText("Curso (Carga Academica)");
        JCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCursoMouseClicked(evt);
            }
        });
        jMenu7.add(JCurso);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Administración");

        jMenuItem5.setText("Respaldo");
        jMenu8.add(jMenuItem5);

        jMenuItem6.setText("Mantenimiento");
        jMenu8.add(jMenuItem6);

        jMenu5.setText("Exportar Datos");
        jMenu8.add(jMenu5);

        jMenu6.setText("Importar Datos");
        jMenu8.add(jMenu6);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Ayuda");
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void JArancelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArancelesMouseClicked
        JIArancel p = new JIArancel();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();   
    }//GEN-LAST:event_JArancelesMouseClicked

    private void JBancosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBancosMouseClicked
        JIBanco p = new JIBanco();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JBancosMouseClicked

    private void JMonedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMonedaMouseClicked
        JIMoneda p = new JIMoneda();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMonedaMouseClicked

    private void JFormaPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JFormaPagoMouseClicked
        JIFormaPago p = new JIFormaPago();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JFormaPagoMouseClicked

    private void JSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSeriesMouseClicked
        JISerieRecibo p = new JISerieRecibo();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JSeriesMouseClicked

    private void JTipoCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTipoCambioMouseClicked
        JITipoCambio p = new JITipoCambio();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JTipoCambioMouseClicked

    private void JcargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcargosMouseClicked
        JICargo p = new JICargo();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JcargosMouseClicked

    private void JCargoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCargoEmpleadoMouseClicked
        JICargosEmpleado p = new JICargosEmpleado();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCargoEmpleadoMouseClicked

    private void JCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCiudadMouseClicked
        JICiudad p = new JICiudad();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCiudadMouseClicked

    private void JAlergiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAlergiasMouseClicked
        JIAlergia p = new JIAlergia();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JAlergiasMouseClicked

    private void JAsignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAsignaturasMouseClicked
        JIAsignaturas p = new JIAsignaturas();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JAsignaturasMouseClicked

    private void JColegiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JColegiosMouseClicked
        JIColegios p = new JIColegios();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JColegiosMouseClicked

    private void JEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEnfermedadMouseClicked
        JIEnfermedad p = new JIEnfermedad();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JEnfermedadMouseClicked

    private void JEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEstudianteMouseClicked
        
    }//GEN-LAST:event_JEstudianteMouseClicked

    private void JFamiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JFamiliarMouseClicked
        JIEnfermedad p = new JIEnfermedad();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JFamiliarMouseClicked

    private void JModalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JModalidadMouseClicked
        JIModalidad p = new JIModalidad();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JModalidadMouseClicked

    private void JParentescoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JParentescoMouseClicked
        JIParentesco p = new JIParentesco();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JParentescoMouseClicked

    private void JPeriodoLectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPeriodoLectivoMouseClicked
        JIPeriodoLectivo p = new JIPeriodoLectivo();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JPeriodoLectivoMouseClicked

    private void JProfesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JProfesionMouseClicked
        JIProfesion p = new JIProfesion();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JProfesionMouseClicked

    private void JResponsableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JResponsableMouseClicked
        JIResponsableEstudiantes p = new JIResponsableEstudiantes();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JResponsableMouseClicked

    private void JColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JColaboradorMouseClicked
        JIColaborador p = new JIColaborador();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JColaboradorMouseClicked

    private void JCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCursoMouseClicked
        JICurso p = new JICurso();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCursoMouseClicked

    private void JCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCursosMouseClicked
        JICursos p = new JICursos();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCursosMouseClicked

    private void JPlanesEstudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPlanesEstudioMouseClicked
        JIPlanesDeEstudios p = new JIPlanesDeEstudios();
        panel.add(p);
        p.show();
        p.setLocation(245, 140);
    }//GEN-LAST:event_JPlanesEstudioMouseClicked

    private void JMICajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMICajaMouseClicked
        JICaja p = new JICaja();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
        
    }//GEN-LAST:event_JMICajaMouseClicked

    private void JIInscripcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JIInscripcionesMouseClicked
        
    }//GEN-LAST:event_JIInscripcionesMouseClicked

    private void JTipoColegioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTipoColegioMouseClicked
        JITipoColegio p = new JITipoColegio();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JTipoColegioMouseClicked

    private void JPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaisMouseClicked
        JIPais p = new JIPais();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JPaisMouseClicked

    private void JExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JExcelActionPerformed
        // TODO add your handling code here:
        try {
            String url = "C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.exe";
            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", url);
            p.start();
        } catch (IOException ex) {
        }
    

    }//GEN-LAST:event_JExcelActionPerformed

    private void JCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCalcActionPerformed
        // TODO add your handling code here:
            try        
    {
        Runtime rt = Runtime.getRuntime();           
        Process p = rt.exec("calc");            
        p.waitFor();        
    }        
    catch ( IOException ioe )       
    {            
        ioe.printStackTrace();
    }         
    catch ( InterruptedException ie )
    {            
        ie.printStackTrace();     
    }
    }//GEN-LAST:event_JCalcActionPerformed

    private void JWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JWordActionPerformed
        // TODO add your handling code here:
         try {
            String url = "C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.exe";
            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", url);
            p.start();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_JWordActionPerformed

    private void JAntecedenteAlergiaEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAntecedenteAlergiaEstMouseClicked
        JIAntecedenteAlergiaEstudiante p = new JIAntecedenteAlergiaEstudiante();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JAntecedenteAlergiaEstMouseClicked

    private void JMDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMDocentesMouseClicked
//        JIDocente p = new JIDocente();
//        panel.add(p);
//        Dimension desktopSize = panel.getSize();
//        Dimension FrameSize = p.getSize();
//        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
//        p.show();
    }//GEN-LAST:event_JMDocentesMouseClicked

    private void JMTrabajoAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMTrabajoAnteriorMouseClicked
        JIDocenteTrabajoAnterior p = new JIDocenteTrabajoAnterior();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMTrabajoAnteriorMouseClicked

    private void JCAperturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCAperturaMouseClicked
        JIApertura p = new JIApertura();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCAperturaMouseClicked

    private void JDescuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JDescuentosMouseClicked
        JIDescuentos p = new JIDescuentos();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JDescuentosMouseClicked

    private void JEstudiante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEstudiante1MouseClicked
        JIEstudiante p = new JIEstudiante();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JEstudiante1MouseClicked

    private void JMDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMDocenteMouseClicked
        JIDocente p = new JIDocente();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMDocenteMouseClicked

    private void JPeriodoLectivo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPeriodoLectivo1MouseClicked
        JAnnosLectivos p = new JAnnosLectivos();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JPeriodoLectivo1MouseClicked

    private void JMCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMCursoMouseClicked
        JICurso p = new JICurso();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMCursoMouseClicked

    private void JMCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMCursosMouseClicked
        JICursos p = new JICursos();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMCursosMouseClicked

    private void JMDocentes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMDocentes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMDocentes1MouseClicked

    private void JIInscripcionReingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JIInscripcionReingresoMouseClicked
        JIInscripcionReingreso p = new JIInscripcionReingreso();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JIInscripcionReingresoMouseClicked

    private void JIInscripcionNuevoIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JIInscripcionNuevoIngresoMouseClicked
        JIInscripcionNuevoIngreso p = new JIInscripcionNuevoIngreso();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JIInscripcionNuevoIngresoMouseClicked

    private void JControlDePagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JControlDePagosMouseClicked
        JICarteraCobro p = new JICarteraCobro();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JControlDePagosMouseClicked

    private void JAntecedenteEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAntecedenteEnfermedadMouseClicked
        JIAntecedenteEnfEst p = new JIAntecedenteEnfEst();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JAntecedenteEnfermedadMouseClicked

    private void JCCierrreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCCierrreMouseClicked
        JICierreCaja p = new JICierreCaja();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JCCierrreMouseClicked

    private void JMRegistroCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMRegistroCalificacionesMouseClicked
      
        Frame f = JOptionPane.getFrameForComponent(this);
        JIRegistroCalificaciones dialog = new JIRegistroCalificaciones(f, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_JMRegistroCalificacionesMouseClicked

    private void JTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTurnoMouseClicked
        JITurno p = new JITurno();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();   
    }//GEN-LAST:event_JTurnoMouseClicked

    private void JMIRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMIRecibosMouseClicked
        JIRecibos p = new JIRecibos();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMIRecibosMouseClicked

    private void JMIRecibosReimpresionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMIRecibosReimpresionMouseClicked
        JIRecibosReimpresion p = new JIRecibosReimpresion();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMIRecibosReimpresionMouseClicked

    private void JMITipoBecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMITipoBecaMouseClicked
        JITipoBeca p = new JITipoBeca();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMITipoBecaMouseClicked

    private void JMIBecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMIBecaMouseClicked
        JIBeca p = new JIBeca();
        panel.add(p);
        Dimension desktopSize = panel.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
    }//GEN-LAST:event_JMIBecaMouseClicked
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Begin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JAlergias;
    private javax.swing.JMenu JAntecedenteAlergiaEst;
    private javax.swing.JMenu JAntecedenteEnfermedad;
    private javax.swing.JMenu JAranceles;
    private javax.swing.JMenu JAsignaturas;
    private javax.swing.JMenu JBancos;
    private javax.swing.JMenu JCApertura;
    private javax.swing.JMenu JCCierrre;
    private javax.swing.JMenu JCXC;
    private javax.swing.JMenuItem JCalc;
    private javax.swing.JMenu JCargoEmpleado;
    private javax.swing.JMenu JCiudad;
    private javax.swing.JMenu JColaborador;
    private javax.swing.JMenu JColegios;
    private javax.swing.JMenu JControlDePagos;
    private javax.swing.JMenu JCurso;
    private javax.swing.JMenu JCursos;
    private javax.swing.JMenuItem JDeposito;
    private javax.swing.JMenu JDescuentos;
    private javax.swing.JMenu JEnfermedad;
    private javax.swing.JMenu JEstudiante;
    private javax.swing.JMenu JEstudiante1;
    private javax.swing.JMenu JEvalaluaciones;
    private javax.swing.JMenuItem JExcel;
    private javax.swing.JMenu JFamiliar;
    private javax.swing.JMenu JFormaPago;
    private javax.swing.JMenu JIInscripcionNuevoIngreso;
    private javax.swing.JMenu JIInscripcionReingreso;
    private javax.swing.JMenu JIInscripciones;
    private javax.swing.JMenuItem JIngresos;
    private javax.swing.JMenu JMCaja;
    private javax.swing.JMenu JMCurso;
    private javax.swing.JMenu JMCursos;
    private javax.swing.JMenu JMDocente;
    private javax.swing.JMenu JMDocentes;
    private javax.swing.JMenu JMDocentes1;
    private javax.swing.JMenu JMIBeca;
    private javax.swing.JMenu JMICaja;
    private javax.swing.JMenu JMIRecibos;
    private javax.swing.JMenu JMIRecibosReimpresion;
    private javax.swing.JMenu JMITipoBeca;
    private javax.swing.JMenu JMRegistroCalificaciones;
    private javax.swing.JMenu JMTrabajoAnterior;
    private javax.swing.JMenu JModalidad;
    private javax.swing.JMenu JMoneda;
    private javax.swing.JMenu JPais;
    private javax.swing.JMenu JParentesco;
    private javax.swing.JMenu JPeriodoLectivo;
    private javax.swing.JMenu JPeriodoLectivo1;
    private javax.swing.JMenu JPlanesEstudio;
    private javax.swing.JMenu JProfesion;
    private javax.swing.JMenu JResponsable;
    private javax.swing.JMenuItem JSalir;
    private javax.swing.JMenu JSecretaria;
    private javax.swing.JMenu JSeries;
    private javax.swing.JMenu JSesion;
    private javax.swing.JMenu JTipoCambio;
    private javax.swing.JMenu JTipoColegio;
    private javax.swing.JMenuItem JTraslados;
    private javax.swing.JMenu JTurno;
    private javax.swing.JMenuItem JWord;
    private javax.swing.JMenu Jcargos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables
}
