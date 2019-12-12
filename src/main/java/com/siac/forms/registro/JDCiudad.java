
package com.siac.forms.registro;

import com.siac.entities.Cargo;
import com.siac.entities.Ciudad;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDCiudad extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Ciudad obj;
    
    public JDCiudad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDCiudad(java.awt.Frame parent, boolean modal,Ciudad obj) {
        super(parent, modal);
        initComponents();
        fillComboBox();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Activo = new javax.swing.JCheckBox();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();
        JCPais = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Pais");

        txtNombre.setName("txtNombre"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion de las Cidudades");

        Activo.setText("Activo");

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

        JCPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Activo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(JBClose))
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(JCPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(Activo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    public void init(Ciudad obj) {
        this.Id = obj.getId();
        this.txtNombre.setText(obj.getNombre());
        this.JCPais.setSelectedIndex(Integer.parseInt(obj.getPais().getId().toString()));
        this.Activo.setSelected(obj.getActivo());
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelPais = new DefaultComboBoxModel((Vector) cm.fillPais());
        this.JCPais.setModel(modelPais);
    }
    
      private void Update() {
        try {
            x = new JPACrud();
            obj = new Ciudad();
            obj.setId(this.Id);
            obj.setNombre(this.txtNombre.getText());
            obj.setPais(x.getPaisById(this.JCPais.getSelectedIndex()));
            obj.setActivo(Activo.isSelected());
            x.update(obj);
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCiudad dialog = new JDCiudad(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBClose;
    private javax.swing.JButton JBUpdate;
    private javax.swing.JComboBox<String> JCPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
