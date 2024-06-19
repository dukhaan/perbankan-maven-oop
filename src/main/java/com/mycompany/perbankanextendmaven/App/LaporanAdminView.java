/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.perbankanextendmaven.App;

import apotek.ui.MainFrame;
import apotek.ui.auth.LoginView;
import apotek.ui.dashboard.ApotekViewAdmin;
import apotek.ui.laporan.LaporanObatView;

/**
 *
 * @author Dukhaan
 */
public class LaporanAdminView extends javax.swing.JPanel {

    /**
     * Creates new form LaporanView
     */
    private MainFrame mainFrame;
    public LaporanAdminView(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datakonsumen1 = new javax.swing.JButton();
        datakonsumen2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 29, 43));

        jLabel2.setBackground(new java.awt.Color(241, 240, 242));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 242));
        jLabel2.setText("Laporan Admin");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/button_exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DATA OBAT");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DATA KONSUMEN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        datakonsumen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/file kuning 64px.png"))); // NOI18N
        datakonsumen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakonsumen1ActionPerformed(evt);
            }
        });
        add(datakonsumen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, 110));

        datakonsumen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/file merah 64px.png"))); // NOI18N
        datakonsumen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakonsumen2ActionPerformed(evt);
            }
        });
        add(datakonsumen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 110));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void datakonsumen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakonsumen1ActionPerformed
        mainFrame.showView(new LaporanObatView(mainFrame));
    }//GEN-LAST:event_datakonsumen1ActionPerformed

    private void datakonsumen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakonsumen2ActionPerformed
        mainFrame.showView(new LaporanKonsumenView(mainFrame));
    }//GEN-LAST:event_datakonsumen2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame.showView(new ApotekViewAdmin(mainFrame));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datakonsumen1;
    private javax.swing.JButton datakonsumen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}