
package com.siac.forms.caja;

import com.siac.entities.Tipocambio;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import com.siac.services.Util;
import static com.siac.services.Util.UPDATE_OK;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDTipoCambio extends javax.swing.JDialog {
    
    JPACrud x;
    Long Id;
    Tipocambio obj;

    public JDTipoCambio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDTipoCambio(java.awt.Frame parent, boolean modal, Tipocambio obj) {
        super(parent, modal);
        initComponents();
        getMonedas();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();
        JBUpdate1 = new javax.swing.JButton();
        JBClose1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCCambio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JCBase = new javax.swing.JComboBox<>();
        txtCambio = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBUpdate2 = new javax.swing.JButton();
        JBClose2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JdateChooserFecha = new datechooser.beans.DateChooserCombo();

        JBUpdate.setText("Actualizar");
        JBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUpdateActionPerformed(evt);
            }
        });

        JBClose.setText("Cancelar");
        JBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCloseActionPerformed(evt);
            }
        });

        JBUpdate1.setText("Actualizar");
        JBUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUpdate1ActionPerformed(evt);
            }
        });

        JBClose1.setText("Cancelar");
        JBClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClose1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de los Tipos de Cambios");

        jLabel2.setText("Moneda Base");

        jLabel5.setText("Cambio");

        jLabel4.setText("Fecha");

        JBUpdate2.setBackground(new java.awt.Color(2, 136, 209));
        JBUpdate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        JBUpdate2.setText("Actualizar");
        JBUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUpdate2ActionPerformed(evt);
            }
        });

        JBClose2.setBackground(new java.awt.Color(2, 136, 209));
        JBClose2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBClose2.setForeground(new java.awt.Color(255, 255, 255));
        JBClose2.setText("Cancelar");
        JBClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClose2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Moneda Cambio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBUpdate2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBClose2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JdateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(JCBase, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JCCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(JCBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JdateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUpdate2)
                    .addComponent(JBClose2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdateActionPerformed
        Update();
    }//GEN-LAST:event_JBUpdateActionPerformed

    private void JBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCloseActionPerformed

    private void JBUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdate1ActionPerformed
        Update();
    }//GEN-LAST:event_JBUpdate1ActionPerformed

    private void JBClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClose1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBClose1ActionPerformed

    private void JBUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdate2ActionPerformed

        if(JCBase.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar la Moneda Base");
            JCBase.requestFocus();
            return;
        } else if (JCCambio.getSelectedItem().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar la Moneda Cambio");
            JCCambio.requestFocus();
        } 
        
         else if (txtCambio.getText().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Ingresar la Tasa de Cambio");
            txtCambio.requestFocus();
        }
        
        
        else{

        Update();
        }
    }//GEN-LAST:event_JBUpdate2ActionPerformed

    private void JBClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClose2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBClose2ActionPerformed
    
    private void getMonedas() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelJCCambio = new DefaultComboBoxModel((Vector) cm.fillMonedas());
        DefaultComboBoxModel modelJCBase = new DefaultComboBoxModel((Vector) cm.fillMonedas());
        this.JCCambio.setModel(modelJCCambio);
        this.JCBase.setModel(modelJCBase);
    }
    
    public void init(Tipocambio obj) {
        this.Id = obj.getId();
        this.JCBase.setSelectedIndex(Integer.parseInt(obj.getMonedaBase().getId().toString()));
        this.JCCambio.setSelectedIndex(Integer.parseInt(obj.getMonedaCambio().getId().toString()));
        this.JdateChooserFecha.setCurrent(Util.toCalendar(obj.getFecha()));
        this.txtCambio.setText(""+obj.getCambio());
    }
      private void Update() {
        try {
            x = new JPACrud();
             Tipocambio tc = new Tipocambio();
             tc.setId(Id);
             tc.setMonedaBase(x.getMonedasById(this.JCBase.getSelectedIndex()));
             tc.setMonedaCambio(x.getMonedasById(this.JCCambio.getSelectedIndex()));
             tc.setFecha(Date.from(Instant.now()));
             tc.setCambio(Float.parseFloat(this.txtCambio.getText()));
             
             x.update(tc);
             JOptionPane.showMessageDialog(this,UPDATE_OK);
             
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
            java.util.logging.Logger.getLogger(JDTipoCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDTipoCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDTipoCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDTipoCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDTipoCambio dialog = new JDTipoCambio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBClose1;
    private javax.swing.JButton JBClose2;
    private javax.swing.JButton JBUpdate;
    private javax.swing.JButton JBUpdate1;
    private javax.swing.JButton JBUpdate2;
    private javax.swing.JComboBox<String> JCBase;
    private javax.swing.JComboBox<String> JCCambio;
    private datechooser.beans.DateChooserCombo JdateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtCambio;
    // End of variables declaration//GEN-END:variables
}
