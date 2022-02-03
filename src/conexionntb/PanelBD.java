/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionntb;
import javax.swing.*;
import javax.swing.JDialog.*;
import javax.swing.JDialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */

public class PanelBD extends javax.swing.JDialog {
    GridBagLayout dinamico = new GridBagLayout();
    PanelInsertar panelInsertar;
    PanelMostrar panelMostrar;
    ArrayList<ArrayList<String>> datosstatic = new ArrayList();    
    public PanelBD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelInsertar = new PanelInsertar();
        panelMostrar = new PanelMostrar();
        PanelDin.setLayout(dinamico);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy= 0;
        PanelDin.add(panelInsertar,c);
        c.gridx = 0;
        c.gridy= 0;
        PanelDin.add(panelMostrar,c);
        c.gridx = 0;
        c.gridy= 0;
        panelInsertar.setVisible(false);
        panelMostrar.setVisible(false);
        
        
        
        
        
        
    }
    
    
   
    

    static ArrayList<ArrayList<String>> relacionados(String claveforanea){
        String sql= "SELECT * FROM proveedores WHERE Idprod="+claveforanea;
        Statement st;
        ArrayList<ArrayList<String>> datos2 = new ArrayList();
    {for (ArrayList<String> dato : datos2) {
           datos2.add(new ArrayList());
       }
    }
        try {
            st=ConexionNTB.con.createStatement();
            ResultSet result = st.executeQuery(sql);
            int i = 0;
            while(result.next()){
            datos2.add(new ArrayList());
            datos2.get(i).add(result.getString(1));
            datos2.get(i).add(result.getString(2));
            datos2.get(i).add(result.getString(3));
            i++;
            }
            System.out.println("testrelacionado");
            
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
            System.out.println("Error");
        }
         System.out.println(datos2.get(0).get(1));
        
         PanelRelacional dialog;
         //dialog = new PanelRelacional(new javax.swing.JDialog() , rootPaneCheckingEnabled);
        dialog = new PanelRelacional(new javax.swing.JDialog(), true,datos2);
         System.out.println("testpanel");
        dialog.setVisible(true);
         
        return datos2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelDin.setBackground(new java.awt.Color(255, 255, 255));
        PanelDin.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout PanelDinLayout = new javax.swing.GroupLayout(PanelDin);
        PanelDin.setLayout(PanelDinLayout);
        PanelDinLayout.setHorizontalGroup(
            PanelDinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        PanelDinLayout.setVerticalGroup(
            PanelDinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("                                       Insertal Filas");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);

        jLabel2.setText("                                           Mostrar datos");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelDin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     panelInsertar.setVisible(true);
     panelMostrar.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
panelMostrar.setVisible(true);
panelInsertar.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PanelBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelBD dialog = new PanelBD(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelDin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
