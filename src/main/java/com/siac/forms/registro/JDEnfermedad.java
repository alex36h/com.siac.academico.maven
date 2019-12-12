
package com.siac.forms.registro;

import com.siac.entities.Ciudad;
import com.siac.entities.Enfermedad;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import javax.swing.JOptionPane;

public class JDEnfermedad extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Enfermedad obj;
    
    public JDEnfermedad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
   
    public JDEnfermedad(java.awt.Frame parent, boolean modal,Enfermedad obj) {
        super(parent, modal);
        initComponents();
        init(obj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTEnfermedades = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTNivelGravedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTTratamiento = new javax.swing.JTextArea();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de las enfermedades");

        jLabel2.setText("Nombre");

        jLabel4.setText("Nivel Gravedad");

        jLabel3.setText("Descripcion");

        JTDescripcion.setColumns(20);
        JTDescripcion.setRows(3);
        jScrollPane1.setViewportView(JTDescripcion);

        jLabel5.setText("Tratamiento");

        JTTratamiento.setColumns(20);
        JTTratamiento.setRows(3);
        jScrollPane2.setViewportView(JTTratamiento);

        JBUpdate.setBackground(new java.awt.Color(2, 136, 209));
        JBUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBUpdate.setForeground(new java.awt.Color(255, 255, 255));
        JBUpdate.setText("Actualizar");
        JBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUpdateActionPerformed(evt);
            }
        });

        JBClose.setBackground(new java.awt.Color(2, 136, 209));
        JBClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBClose.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(JTEnfermedades)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addGap(197, 197, 197))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(JTNivelGravedad))
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(JBClose)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNivelGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
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

    public void init(Enfermedad obj) {
        this.Id = obj.getId();
        this.JTDescripcion.setText(obj.getDescripcion());
        this.JTEnfermedades.setText(obj.getNombre());
        this.JTNivelGravedad.setText(obj.getNivelGravedad());
        this.JTTratamiento.setText(obj.getTratamientoBasico());
    }
    
      private void Update() {
        try {
            x = new JPACrud();
            obj = new Enfermedad();
            obj.setId(this.Id);
            obj.setDescripcion(this.JTDescripcion.getText());
            obj.setNombre(this.JTEnfermedades.getText());
            obj.setNivelGravedad(this.JTNivelGravedad.getText());
            obj.setTratamientoBasico(this.JTTratamiento.getText());
            
            x.update(obj);
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
        }
    }
   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDEnfermedad dialog = new JDEnfermedad(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea JTDescripcion;
    private javax.swing.JTextField JTEnfermedades;
    private javax.swing.JTextField JTNivelGravedad;
    private javax.swing.JTextArea JTTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
