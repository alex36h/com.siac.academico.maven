
package com.siac.forms.registro;

import com.siac.entities.Ciudad;
import com.siac.entities.Colegio;
import com.siac.entities.Tipocolegio;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDColegios extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Colegio obj;
    
    public JDColegios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDColegios(java.awt.Frame parent, boolean modal,Colegio obj) {
        super(parent, modal);
        initComponents();
        fillComboBox();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTTelefono = new javax.swing.JTextField();
        JCCiudad = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTDireccion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCTipoColegio = new javax.swing.JComboBox<>();
        JCPais = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel5.setText("Ciudad");

        jLabel7.setText("Telefono");

        JCCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Managua", "San Jose", "San Salvador", "Tegucigalpa" }));

        JTDireccion.setColumns(20);
        JTDireccion.setLineWrap(true);
        JTDireccion.setRows(2);
        jScrollPane2.setViewportView(JTDireccion);

        jLabel6.setText("Direccion");

        jLabel2.setText("Tipo Colegio");

        JCTipoColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Publico", "Privado", "Semi Privado" }));

        JCPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nicaragua", "Costa Rica", "El Salvador", "Honduras", "Guatemala" }));

        jLabel3.setText("Pais");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Administracion Colegios");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14)
                                        .addComponent(JCCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JBUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(JBClose))
                                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCTipoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JCTipoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JCCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    public void init(Colegio obj) {
        this.Id = obj.getId();
        this.JTNombre.setText(obj.getNombre());
        this.JTDireccion.setText(obj.getDireccion());
        this.JTTelefono.setText(obj.getTelefono());
        this.JCPais.setSelectedIndex(Integer.parseInt(obj.getPais().getId().toString()));
        this.JCCiudad.setSelectedIndex(Integer.parseInt(obj.getCiudad().getId().toString()));
        this.JCTipoColegio.setSelectedIndex(Integer.parseInt(obj.getTipoColegio().getId().toString()));
    }
    
    private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelPais = new DefaultComboBoxModel((Vector) cm.fillPais());
        this.JCPais.setModel(modelPais);
        DefaultComboBoxModel modelCiudad = new DefaultComboBoxModel((Vector) cm.fillCiudad());
        this.JCCiudad.setModel(modelCiudad);
        DefaultComboBoxModel modelTipoColegio = new DefaultComboBoxModel((Vector) cm.fillTipoColegio());
        this.JCTipoColegio.setModel(modelTipoColegio);
    }
    
      private void Update() {
        try {
            x = new JPACrud();
            obj = new Colegio();
            obj.setId(this.Id);
            obj.setNombre(this.JTNombre.getText());
            obj.setTelefono(this.JTTelefono.getText());
            obj.setDireccion(this.JTDireccion.getText());
            obj.setPais(x.getPaisById(this.JCPais.getSelectedIndex()));
            obj.setCiudad(x.getCiudad(this.JCCiudad.getSelectedIndex()));
            obj.setTipoColegio(x.getTipoColegioById(this.JCTipoColegio.getSelectedIndex()));
            x.update(obj);
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDColegios dialog = new JDColegios(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> JCCiudad;
    private javax.swing.JComboBox<String> JCPais;
    private javax.swing.JComboBox<String> JCTipoColegio;
    private javax.swing.JTextArea JTDireccion;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
