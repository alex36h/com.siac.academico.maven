package com.siac.admin;

import com.siac.entities.Credencial;
import com.siac.entities.CredencialPK;
import com.siac.entities.Persona;
import com.siac.entities.Rol;
import com.siac.entities.Rolcredencial;
import com.siac.entities.Rolgrupousuario;
import com.siac.modelos.ComboModel;
import com.siac.services.JPACrud;
import static com.siac.services.Util.COL_ROL_GRUPO_USUARIO;
import static com.siac.services.Util.getModel;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static com.siac.services.Util.getSelectedIndex;
import static com.siac.services.Util.limpiarJTable;
import java.util.List;
import javax.swing.JOptionPane;

public class JIAdminRol extends javax.swing.JInternalFrame {

    JPACrud x;
    DefaultTableModel model;
    int rolId;
    List<Rolgrupousuario> objRolGrupoUsuario;
    Credencial objCredencial;
    Rolcredencial objRolCredencial;
      
    public JIAdminRol() {
        initComponents();
        Init();
    }
    
    private void Init()
    {
        fillComboBox();
    }
    
        private void fillComboBox() {
        ComboModel cm = new ComboModel();
        DefaultComboBoxModel modelNombreCompleto = new DefaultComboBoxModel((Vector) cm.fillColaborador());
        this.JComboNombreCompleto.setModel(modelNombreCompleto);
        DefaultComboBoxModel modelPermisos = new DefaultComboBoxModel((Vector) cm.fillPermisos());
        this.JComboPermisos.setModel(modelPermisos);
        DefaultComboBoxModel modelRol = new DefaultComboBoxModel((Vector) cm.fillRol());
        this.JComboRol.setModel(modelRol);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JComboRol = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JComboPermisos = new javax.swing.JComboBox<>();
        JbuttonCrear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        JLTitulo1 = new javax.swing.JLabel();
        JbuttonAgregar = new javax.swing.JButton();
        JComboNombreCompleto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTClave = new javax.swing.JPasswordField();
        JTConfirmar = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);

        jPanel4.setBackground(new java.awt.Color(2, 136, 209));

        JLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Asignacion de Permisos Adicionales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre Completo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Rol");

        JComboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SA", "Cajero", "Responsable de Caja", "Tecnico Registro" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Rol", "Permisos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Permisos Adicionales");

        JComboPermisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JbuttonCrear.setBackground(new java.awt.Color(2, 136, 209));
        JbuttonCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JbuttonCrear.setForeground(new java.awt.Color(255, 255, 255));
        JbuttonCrear.setText("Crear");
        JbuttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonCrearActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(2, 136, 209));

        JLTitulo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo1.setText("Asignacion de Roles de los usuarios del sistema");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(JLTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JbuttonAgregar.setBackground(new java.awt.Color(2, 136, 209));
        JbuttonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JbuttonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        JbuttonAgregar.setText("Agregar");
        JbuttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonAgregarActionPerformed(evt);
            }
        });

        JComboNombreCompleto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Clave");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Confirmar contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JbuttonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3)
                                            .addComponent(JbuttonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(JTUsuario))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(JTClave)))
                                    .addComponent(JComboNombreCompleto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(JComboRol, 0, 220, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(JTConfirmar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboPermisos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbuttonCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(JComboPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbuttonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbuttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonCrearActionPerformed
        CrearUsuario();
    }//GEN-LAST:event_JbuttonCrearActionPerformed

    private void JbuttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonAgregarActionPerformed
       AgregarPermiso();
    }//GEN-LAST:event_JbuttonAgregarActionPerformed

    private void AgregarPermiso()
    {
        x = new JPACrud();
        if(objCredencial != null)
        {
            try {
                objRolCredencial = new Rolcredencial();
                objRolCredencial.setCredencial(objCredencial);
                objRolCredencial.setRol(x.getRolByKey(getSelectedIndex(this.JComboPermisos.getSelectedItem().toString())));
                x.save(objRolCredencial);
                Refrescar();
            } catch (Exception e) {
                System.out.println("La operacion fallo con exito en AgregarPermiso()");
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Debe de crear el usuario primero");
   
    }
    
    private void CrearUsuario()
    {
        try {
            rolId = getSelectedIndex(this.JComboRol.getSelectedItem().toString());
            x = new JPACrud();
        
        objRolGrupoUsuario = x.getRolGrupoUsuario(rolId);
        
        ///------------------ crear credencial ------------------/
        
            if(this.JTClave.getText().equals(JTConfirmar.getText()))
            {               
                Persona objPersona = new Persona();
                x = new JPACrud();
                objPersona = x.getColaborador(getSelectedIndex(this.JComboNombreCompleto.getSelectedItem().toString()));
                CredencialPK obj = new CredencialPK();
                obj.setCodigo(objPersona.getCodigo());
                obj.setUsuario(this.JTUsuario.getText());
                objCredencial = new Credencial();
                objCredencial.setCredencialPK(obj);
                objCredencial.setActivo(true);
                objCredencial.setClave(this.JTClave.getText());  
                objCredencial.setGrupo(x.getRolById(rolId));
                objCredencial.setPersona(objPersona);
                objCredencial.setPregunta(1);
                objCredencial.setRespuesta("");
                x = new JPACrud();
                x.save(objCredencial);
            }
        
        ///------------------ crear credencial ------------------/
        x = new JPACrud();
        objCredencial = x.getCred(this.JTUsuario.getText());
        
        if(objRolGrupoUsuario != null && objCredencial != null)
        {
            for (Rolgrupousuario obj : objRolGrupoUsuario) {
                x = new JPACrud();
                objRolCredencial = new Rolcredencial();
                objRolCredencial.setCredencial(objCredencial);
                objRolCredencial.setRol(obj.getRol());
                x.save(objRolCredencial);
            }
        }
        
        Refrescar();
        
        } catch (Exception e) {
            System.out.println("La operacion fallo con exito: "+e);
        }
    }
    
    private void Refrescar() {
        try {
            x = new JPACrud();
            model = getModel(COL_ROL_GRUPO_USUARIO, false);
            limpiarJTable(model);

            List<Rol> entidad = x.getForms(objCredencial);
            if (entidad != null) {
                for (Rol a
                        : entidad) {
                    model.addRow(new Object[]{
                        a.getId(),
                        a.getGrupo().getNombre(),
                        a.getNombre()
                    });
                }
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboNombreCompleto;
    private javax.swing.JComboBox<String> JComboPermisos;
    private javax.swing.JComboBox<String> JComboRol;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JLabel JLTitulo1;
    private javax.swing.JPasswordField JTClave;
    private javax.swing.JPasswordField JTConfirmar;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JButton JbuttonAgregar;
    private javax.swing.JButton JbuttonCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
