/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package conexionntb;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JDialog;

/**
 *
 * @author Wiku
 */
public class PanelMostrar extends javax.swing.JPanel {
String claveforanea;
Color defaultColor = new Color(187,187,187);
    /**
     * Creates new form PanelMostrar
     */
    public PanelMostrar() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        jButton1.setText("Mostrar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jButton1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jPanel2.setToolTipText("");
        jPanel2.setLayout(new java.awt.GridLayout(10, 1));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel3.add(jLabel1);
        jPanel3.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel3.add(jLabel4);

        jPanel2.add(jPanel3);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new java.awt.GridLayout(1, 4));
        jPanel4.add(jLabel5);
        jPanel4.add(jLabel6);
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel8);

        jPanel2.add(jPanel4);

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new java.awt.GridLayout(1, 4));
        jPanel5.add(jLabel9);
        jPanel5.add(jLabel10);
        jPanel5.add(jLabel11);
        jPanel5.add(jLabel12);

        jPanel2.add(jPanel5);

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new java.awt.GridLayout(1, 4));
        jPanel6.add(jLabel13);
        jPanel6.add(jLabel14);
        jPanel6.add(jLabel15);
        jPanel6.add(jLabel16);

        jPanel2.add(jPanel6);

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new java.awt.GridLayout(1, 4));
        jPanel7.add(jLabel17);
        jPanel7.add(jLabel18);
        jPanel7.add(jLabel19);
        jPanel7.add(jLabel20);

        jPanel2.add(jPanel7);

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new java.awt.GridLayout(1, 4));
        jPanel8.add(jLabel21);
        jPanel8.add(jLabel22);
        jPanel8.add(jLabel23);
        jPanel8.add(jLabel24);

        jPanel2.add(jPanel8);

        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new java.awt.GridLayout(1, 4));
        jPanel9.add(jLabel25);
        jPanel9.add(jLabel26);
        jPanel9.add(jLabel27);
        jPanel9.add(jLabel28);

        jPanel2.add(jPanel9);

        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });
        jPanel10.setLayout(new java.awt.GridLayout(1, 4));
        jPanel10.add(jLabel29);
        jPanel10.add(jLabel30);
        jPanel10.add(jLabel31);
        jPanel10.add(jLabel32);

        jPanel2.add(jPanel10);

        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });
        jPanel11.setLayout(new java.awt.GridLayout(1, 4));
        jPanel11.add(jLabel33);
        jPanel11.add(jLabel34);
        jPanel11.add(jLabel35);
        jPanel11.add(jLabel36);

        jPanel2.add(jPanel11);

        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });
        jPanel12.setLayout(new java.awt.GridLayout(1, 4));
        jPanel12.add(jLabel37);
        jPanel12.add(jLabel38);
        jPanel12.add(jLabel39);
        jPanel12.add(jLabel40);

        jPanel2.add(jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jLabel1.setText("ID");
       jLabel2.setText("Nombre");
       jLabel3.setText("Precio");
       jLabel4.setText("Categoria");
        ArrayList<ArrayList<String>> datos =
        ConexionNTB.mostrardatos();
        
        try {
            jLabel5.setText(datos.get(0).get(0));
            jLabel6.setText(datos.get(0).get(1));
            jLabel7.setText(datos.get(0).get(2));
            jLabel8.setText(datos.get(0).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel9.setText(datos.get(1).get(0));
            jLabel10.setText(datos.get(1).get(1));
            jLabel11.setText(datos.get(1).get(2));
            jLabel12.setText(datos.get(1).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel13.setText(datos.get(2).get(0));
            jLabel14.setText(datos.get(2).get(1));
            jLabel15.setText(datos.get(2).get(2));
            jLabel16.setText(datos.get(2).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel17.setText(datos.get(3).get(0));
            jLabel18.setText(datos.get(3).get(1));
            jLabel19.setText(datos.get(3).get(2));
            jLabel20.setText(datos.get(3).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel21.setText(datos.get(4).get(0));
            jLabel22.setText(datos.get(4).get(1));
            jLabel23.setText(datos.get(4).get(2));
            jLabel24.setText(datos.get(4).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel25.setText(datos.get(5).get(0));
            jLabel26.setText(datos.get(5).get(1));
            jLabel27.setText(datos.get(5).get(2));
            jLabel28.setText(datos.get(5).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel29.setText(datos.get(6).get(0));
            jLabel30.setText(datos.get(6).get(1));
            jLabel31.setText(datos.get(6).get(2));
            jLabel32.setText(datos.get(6).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel33.setText(datos.get(7).get(0));
            jLabel34.setText(datos.get(7).get(1));
            jLabel35.setText(datos.get(7).get(2));
            jLabel36.setText(datos.get(7).get(3));
        } catch (Exception e) {
        }
        try {
            jLabel37.setText(datos.get(8).get(0));
            jLabel38.setText(datos.get(8).get(1));
            jLabel39.setText(datos.get(8).get(2));
            jLabel40.setText(datos.get(8).get(3));
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        claveforanea=jLabel5.getText();
        System.out.println(claveforanea);
        PanelBD.relacionados(claveforanea);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        claveforanea=jLabel9.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
 jPanel5.setBackground(defaultColor);    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
       claveforanea=jLabel13.getText();
               System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
              jPanel6.setBackground(Color.YELLOW);

    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
           jPanel6.setBackground(defaultColor);// TODjPanel6.setBackground(defaultColor);O add your handling code here:
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        claveforanea=jLabel17.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
         jPanel7.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
       jPanel7.setBackground(defaultColor); 
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        claveforanea=jLabel21.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
         jPanel8.setBackground(Color.YELLOW);

    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
       jPanel8.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
       claveforanea=jLabel25.getText();
               System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
         jPanel9.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
         jPanel9.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        claveforanea=jLabel29.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
         jPanel10.setBackground(Color.YELLOW);
;    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
                jPanel10.setBackground(defaultColor);

    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        claveforanea=jLabel33.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        jPanel11.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        jPanel11.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        claveforanea=jLabel37.getText();
                System.out.println(claveforanea);

    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
         jPanel12.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        jPanel12.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        
    }//GEN-LAST:event_jPanel12MousePressed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
