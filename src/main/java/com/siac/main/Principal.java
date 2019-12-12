
package com.siac.main;

import com.siac.entities.Gruporol;
import com.siac.entities.Rol;
import com.siac.services.JPACrud;
import static com.siac.services.JPACrud.getCredencial;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends javax.swing.JFrame {

    private JPACrud x;
    
    public Principal(String usuario) {
        initComponents();
        buildJMenu();
    }

    public Principal() {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void buildJMenu() {
        x = new JPACrud();
        List<Gruporol> menus = x.getMenu(getCredencial());
        List<Rol> forms = x.getForms(getCredencial());
        if (menus != null) {
            for (Gruporol objMenus : menus) 
            {
                //  ---------------- MENUS ----------------  //
                JMenu objJMenu = new JMenu(objMenus.getNombre());
                jMenuBar1.add(objJMenu);
                
                for (Rol objForms : forms) 
                {
                    //  ---------------- FORMULARIOS ----------------  // 
                    if(objMenus.getId().intValue() == objForms.getGrupo().getId().intValue())
                    {
                        JMenuItem objJMenuItem = new JMenuItem(objForms.getNombre());
                        objJMenuItem.addActionListener(e -> {
                        try {
                            Object objInternalFrame;
                            Class objClass = Class.forName(objForms.getPaquete().concat(objForms.getAccion()));
                            objInternalFrame = objClass.newInstance();
                            addInternal((JInternalFrame) objInternalFrame);
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
                            System.out.println(ex);
                        }
                    });
                        objJMenu.add(objJMenuItem);
                    }
                    //  ---------------- FORMULARIOS ----------------  //
                }
                //  ---------------- MENUS ----------------  //
            }
        }
    }
    
    public void addInternal(JInternalFrame frameInterno) { 
            boolean temp = false; 
            try { 
                for (JInternalFrame frame : panel.getAllFrames()) 
                { 
                    frame.setIcon(true);
                    if (frame.getClass() == frameInterno.getClass()) 
                    { 
                        temp = true; frame.setIcon(false); frame.setSelected(true); 
                    } 
                } 
            } catch (PropertyVetoException ex) { System.out.println(ex); } 
            if (!temp) 
            {
                frameInterno.setVisible(true); 
                panel.add(frameInterno, JLayeredPane.MODAL_LAYER); 
                panel.setSelectedFrame(frameInterno); 
                
                Dimension desktopSize = panel.getSize();
                Dimension FrameSize = frameInterno.getSize();
                frameInterno.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            } }
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables
}
