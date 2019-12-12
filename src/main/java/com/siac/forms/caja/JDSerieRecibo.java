
package com.siac.forms.caja;

import com.siac.entities.Serierecibo;
import com.siac.services.JPACrud;
import static com.siac.services.Util.UPDATE_OK;
import javax.swing.JOptionPane;

public class JDSerieRecibo extends javax.swing.JDialog {

    JPACrud x;
    Long Id;
    Serierecibo obj;

    public JDSerieRecibo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDSerieRecibo(java.awt.Frame parent, boolean modal,Serierecibo moneda) {
        super(parent, modal);
        initComponents();
        init(moneda);
    }
    
    public void init(Serierecibo obj) {
        this.Id = obj.getId();
        this.txtNombre.setText(obj.getNombre());
        this.txtDescrip.setText(obj.getDescripcion());
        this.Activo.setSelected(obj.getActivo());
    }
      private void Update() {
        try {
            x = new JPACrud();
            obj = new Serierecibo();
            obj.setId(this.Id);
            obj.setNombre(this.txtNombre.getText());
            obj.setDescripcion(this.txtDescrip.getText());
            obj.setActivo(Activo.isSelected());
            x.update(obj);
            JOptionPane.showMessageDialog(this,UPDATE_OK);
            this.dispose();
        } catch (Exception e) {
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        Activo = new javax.swing.JCheckBox();
        JBUpdate = new javax.swing.JButton();
        JBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Administracion de las Monedas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        txtDescrip.setColumns(20);
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        txtNombre.setName("txtNombre"); // NOI18N

        Activo.setText("Activo");

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
                    .addComponent(Activo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBClose))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBClose)
                    .addComponent(JBUpdate)
                    .addComponent(Activo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUpdateActionPerformed

    if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Nombre");
            txtNombre.requestFocus();
            return;
        } else if (txtDescrip.getText().equals("")) {
         JOptionPane.showMessageDialog(rootPane, "Debe Ingresar la Descripcion");
            txtDescrip.requestFocus();
        } else{
            Update();
        }
        
    }//GEN-LAST:event_JBUpdateActionPerformed

    private void JBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCloseActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDSerieRecibo dialog = new JDSerieRecibo(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
