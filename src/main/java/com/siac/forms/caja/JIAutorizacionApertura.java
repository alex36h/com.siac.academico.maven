package com.siac.forms.caja;

import com.siac.entities.Iniciocaja;
import com.siac.services.JPACrud;
import static com.siac.services.Util.COL_AUT_APERTURA;
import static com.siac.services.Util.getModel;
import static com.siac.services.Util.getSiNo;
import static com.siac.services.Util.limpiarJTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jessica Arroliga
 */
public class JIAutorizacionApertura extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    Iniciocaja obj;
    int returnValue = 0;
    public JIAutorizacionApertura() {
        initComponents();
        Refrescar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("REPORTE DE APERTURAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
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
                .addGap(324, 324, 324)
                .addComponent(jLabel1)
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            Autorizar();
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void Refrescar()
    {
        try {
            x = new JPACrud();
            model = getModel(COL_AUT_APERTURA, false);
            limpiarJTable(model);
            
            List<Iniciocaja> entidad = x.getInicioCajaOrderById();

            if (entidad != null) {
                for (Iniciocaja a
                        : entidad) {
                    model.addRow(new Object[]{
                        a.getId(), 
                        a.getCredencial().getCredencialPK().getUsuario().toUpperCase(),
                        a.getFecha().toInstant(),
                        a.getSerie().getNombre().toUpperCase(),
                        a.getNumero(),
                        getSiNo(a.getCerrado()),
                        getSiNo(a.getAutorizado())        
                    });
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            System.out.println("La operacion fallo exitosamente en: "+e.getMessage());
        }
    }
    
    private void Autorizar()
    {
        try {
            if (jTable1.getSelectedRow() != -1) {
            x = new JPACrud();
            
            returnValue = JOptionPane.showConfirmDialog(null, "Desea autorizar esta apertura ?","Esta seguro?",JOptionPane.YES_NO_OPTION);
            
                if(returnValue == JOptionPane.YES_OPTION)
                {
                    obj = x.getInicioCajaById((Long) model.getValueAt(jTable1.getSelectedRow(), 0));
            
                    if(obj != null)
                    {
                        if(obj.getAutorizado() == false && obj.getCerrado() == false)
                        {
                            obj.setAutorizado(true);
                            x = new JPACrud();
                            x.update(obj);
                            JOptionPane.showMessageDialog(this, "Apertura autorizada con exito.");
                            Refrescar();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "La apertura ya fue aprobada / cerrada");
                    }
                }
        }
        } catch (Exception e) {
            System.out.println("La operacion fallo exitosamente en: "+e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
