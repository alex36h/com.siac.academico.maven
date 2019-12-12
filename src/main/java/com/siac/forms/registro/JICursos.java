
package com.siac.forms.registro;

import com.siac.entities.Aniolectivo;
import com.siac.entities.Cursoinscripcion;
import com.siac.entities.Cursos;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.getBoolean;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.getTableHeader;
import static com.siac.services.Util.limpiarJTable;
import java.awt.Frame;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JICursos extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Cursos obj;
    
    public JICursos() {
        initComponents();
        Init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de Cursos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Periodo Lectivo", "Plan de estudios", "Docente", "Asigntura"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(jLabel1)
                .addContainerGap(468, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            Update();
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    void Init()
    {
        try {
            x = new JPACrud();
            model = getModel(Util.COL_CURSOS, false);
            limpiarJTable(model);
            jTable1.setTableHeader(getTableHeader(jTable1));
            List<Cursos> entidad = x.buscarTodo(Cursos.class);
            if (entidad != null) {
                for (Cursos a
                        : entidad) {
                    model.addRow(new Object[]{a.getId(), a.getAñoLectivo().getNombre(),a.getPlanEstudios().getNombre(),a.getDocente().getNombreCompleto(),a.getAsignaturas().getNombre(),
                    a.getAula().getNombre(),a.getCodigo(),a.getAnio()});
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
            obj = new Cursos();
                obj = x.getCursosById(Integer.parseInt(""+(Long)model.getValueAt(jTable1.getSelectedRow(), 0)));
                Frame f = JOptionPane.getFrameForComponent(this);
                JIRegistroCalificaciones dialog = new JIRegistroCalificaciones(f, true,obj);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                Init ();
                
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione");
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
