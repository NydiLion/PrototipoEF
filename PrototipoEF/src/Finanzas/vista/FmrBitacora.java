/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas.vista;
import seguridad.vista.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.BitacoraDao;

import seguridad.dominio.Bitacora;
/**
 *
 * @author PERSONAL
 */
public class FmrBitacora extends javax.swing.JInternalFrame {

    int CodigoAplicacion=200;


    

  
    /**
     * Creates new form FmrBitacora
     */
     public void llenadoDeTablas() {
        /**
 *
 * creaccion de la tabla de de titulos  
 */
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Bitacora");
        modelo.addColumn("Usuario");
        modelo.addColumn("Fecha");
          modelo.addColumn("Hora");
          modelo.addColumn("Ip");
          modelo.addColumn("host");
      
          modelo.addColumn("Accion");
        modelo.addColumn("Codigo Aplicacion");
         modelo.addColumn("Modulo");
    /**
 *
 * instaciamiento de las las  clases Bitacora y BiracoraDAO
 * intaciamiento   de la clases con el  llenado de tablas
 */
     BitacoraDao BicDAO = new BitacoraDao();
        List<Bitacora> usuario = BicDAO.select();
        JtProductos1.setModel(modelo);
        String[] dato = new String[9];
        for (int i = 0; i < usuario.size(); i++) {
            dato[0] = usuario.get(i).getId_Bitacora();
            dato[1] = usuario.get(i).getId_Usuario();
              dato[2] = usuario.get(i).getFecha();
            dato[3] = usuario.get(i).getHora();
           dato[4] = usuario.get(i).getHost();
            dato[5] = usuario.get(i).getIp();
              dato[6] = usuario.get(i).getAccion();
            dato[7] = usuario.get(i).getCodigoAplicacion();
               dato[8] = usuario.get(i).getModulo();
          
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }}
    public FmrBitacora() {
        
        initComponents();
        llenadoDeTablas();
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_usuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtCarga = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtProductos1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Bitacora\n");
        setVisible(true);

        id_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usuarioActionPerformed(evt);
            }
        });

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Bitacora");

        jLabel2.setText("ID Usuario");

        BtCarga.setText("Cargar");
        BtCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCargaActionPerformed(evt);
            }
        });

        JtProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I_Bitacora", "Id_Usuario", "Fecha", "Hora", "host", "ip", "accion", "codigoAplicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JtProductos1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtCarga)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addComponent(BtCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\help.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\help.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCargaActionPerformed
llenadoDeTablas();
        /**
        *
        * instaciamiento de la  Bitacora  y BitacoraDAO
        * llaamar a llenado de  tablas para inserta los datos de  mosttar
        */

        Bitacora Consultar = new Bitacora();
        BitacoraDao BicDAO = new  BitacoraDao();
        Consultar.setId_Usuario(id_usuario.getText());


     

    }//GEN-LAST:event_BtCargaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtCarga;
    public javax.swing.JTable JtProductos1;
    public javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
