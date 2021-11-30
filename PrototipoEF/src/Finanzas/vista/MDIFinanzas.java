package Finanzas.vista;

//import Formas.Frm_Principal;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import seguridad.vista.CambioC;
//import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;
import seguridad.vista.MDI_Components;


public class MDIFinanzas extends javax.swing.JFrame {
   
    //GenerarPermisos permisos = new GenerarPermisos();
    MDI_Components mdi_Components = new MDI_Components();

    public MDIFinanzas() throws UnknownHostException {
        var modulo_nombre = "Finanzas";
        initComponents();
        this.setTitle("Usuario: " + "[" + Login.usuarioFianzas + "]" + " \t" + "IP: [" + mdi_Components.getIp() + "]");
        //permisos.getPermisos(modulo_nombre, Login.usuarioFianzas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        JDesktopFinanzas = new javax.swing.JDesktopPane()
        ;
        JMenuBarFinanzas = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMenuCerrarSesion = new javax.swing.JMenuItem();
        JMenuCatalogos = new javax.swing.JMenu();
        JMenuCatalogoContabilidad = new javax.swing.JMenu();
        JMenuClasificacionCuentas = new javax.swing.JMenuItem();
        JMenuCuentasContables = new javax.swing.JMenuItem();
        JMenuProcesos = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        JMenuInformes = new javax.swing.JMenu();
        JMenuHerramientas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        JMenuAyuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Finanzas [ip] [user]");
        setResizable(false);

        JDesktopFinanzas.setBackground(new java.awt.Color(70, 95, 50));

        javax.swing.GroupLayout JDesktopFinanzasLayout = new javax.swing.GroupLayout(JDesktopFinanzas);
        JDesktopFinanzas.setLayout(JDesktopFinanzasLayout);
        JDesktopFinanzasLayout.setHorizontalGroup(
            JDesktopFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        JDesktopFinanzasLayout.setVerticalGroup(
            JDesktopFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        JMenuArchivo.setText("Archivo");
        JMenuArchivo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        JMenuCerrarSesion.setText("Cerrar Sesión");
        JMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCerrarSesionActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuCerrarSesion);

        JMenuBarFinanzas.add(JMenuArchivo);

        JMenuCatalogos.setText("Catálogos");
        JMenuCatalogos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        JMenuCatalogoContabilidad.setText("Catálogos Contabilidad");

        JMenuClasificacionCuentas.setText("Mantenimiento de Clasificación de Cuentas");
        JMenuClasificacionCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuClasificacionCuentasActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuClasificacionCuentas);

        JMenuCuentasContables.setText("Mantenimiento de Cuentas Contables");
        JMenuCuentasContables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCuentasContablesActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuCuentasContables);

        JMenuCatalogos.add(JMenuCatalogoContabilidad);

        JMenuBarFinanzas.add(JMenuCatalogos);

        JMenuProcesos.setText("Procesos");
        JMenuProcesos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuProcesos.add(jSeparator2);
        JMenuProcesos.add(jSeparator1);

        jMenuItem4.setText("jMenuItem4");
        JMenuProcesos.add(jMenuItem4);

        JMenuBarFinanzas.add(JMenuProcesos);

        JMenuInformes.setText("Informes");
        JMenuInformes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuBarFinanzas.add(JMenuInformes);

        JMenuHerramientas.setText("Herramientas");
        JMenuHerramientas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem2.setText("Bitácora");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(jMenuItem2);

        jMenuItem3.setText("Cambio de Clave");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(jMenuItem3);

        JMenuBarFinanzas.add(JMenuHerramientas);

        JMenuAyuda.setText("Ayuda");
        JMenuAyuda.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuBarFinanzas.add(JMenuAyuda);

        setJMenuBar(JMenuBarFinanzas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDesktopFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopFinanzas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void JMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCerrarSesionActionPerformed
        /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/
        Login frmLogin = new Login();
        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_JMenuCerrarSesionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FmrBitacora frmBitacora = new FmrBitacora();
        frmBitacora.setVisible(true);
        JDesktopFinanzas.add(frmBitacora);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CambioC cambioClave = new CambioC();
        cambioClave.setVisible(true);
        JDesktopFinanzas.add(cambioClave);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JMenuCuentasContablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCuentasContablesActionPerformed
        FrmMantCuentaContable frmMantCuentaContable = new FrmMantCuentaContable();
        JDesktopFinanzas.add(frmMantCuentaContable);
        frmMantCuentaContable.setVisible(true);
    }//GEN-LAST:event_JMenuCuentasContablesActionPerformed

    private void JMenuClasificacionCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuClasificacionCuentasActionPerformed
        FrmMantClasificacionCuentas frmMantClasificacionCuentas = new FrmMantClasificacionCuentas();
        JDesktopFinanzas.add(frmMantClasificacionCuentas);
        frmMantClasificacionCuentas.setVisible(true);
    }//GEN-LAST:event_JMenuClasificacionCuentasActionPerformed

    public static void main(String args[]) {

        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDIFinanzas().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDIFinanzas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopFinanzas;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenuBar JMenuBarFinanzas;
    private javax.swing.JMenu JMenuCatalogoContabilidad;
    private javax.swing.JMenu JMenuCatalogos;
    private javax.swing.JMenuItem JMenuCerrarSesion;
    private javax.swing.JMenuItem JMenuClasificacionCuentas;
    private javax.swing.JMenuItem JMenuCuentasContables;
    private javax.swing.JMenu JMenuHerramientas;
    public static javax.swing.JMenu JMenuInformes;
    private javax.swing.JMenu JMenuProcesos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
