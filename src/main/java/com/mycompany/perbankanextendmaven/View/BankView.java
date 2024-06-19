/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.perbankanextendmaven.View;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.mycompany.perbankanextendmaven.Entity.*;
import com.mycompany.perbankanextendmaven.View.*;
import javax.swing.table.DefaultTableCellRenderer;
import com.mycompany.perbankanextendmaven.App.*;

/**
 *
 * @author Dukhaan
 */
public class BankView extends javax.swing.JPanel {

    public DefaultTableModel model;
    private boolean isTableClicked = false;
    private MainFrame mainFrame;
    private Bank bank;

    /**
     * Creates new form BankView
     */
    public BankView(MainFrame mainFrame) {
        bank = DatabaseService.getBank();
        initComponents();
        initTable();
        this.mainFrame = mainFrame;
        buttonEdit.setVisible(false);
        buttonHapus.setVisible(false);
        buttonBatal.setVisible(false);
        buttonSimpan.setVisible(true);
        buttonSimpanUang.setVisible(false);
        buttonAmbilUang.setVisible(false);

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
        buttonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNasabah = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        inputNamaAkhir = new javax.swing.JTextField();
        buttonHapus = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        buttonSimpanUang = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonAmbilUang = new javax.swing.JButton();
        inputNamaAwal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(36, 34, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSimpan.setBackground(new java.awt.Color(108, 94, 207));
        buttonSimpan.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonSimpan.setForeground(new java.awt.Color(241, 240, 242));
        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        buttonSimpan.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                buttonSimpanVetoableChange(evt);
            }
        });
        jPanel1.add(buttonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 50));

        tableNasabah.setForeground(new java.awt.Color(241, 240, 242));
        tableNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Awal", "Nama Akhir", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNasabah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNasabahMouseClicked(evt);
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        // Mengatur seluruh kolom tabel agar rata tengah
        for (int i = 0; i < tableNasabah.getColumnCount(); i++) {
            tableNasabah.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        jScrollPane1.setViewportView(tableNasabah);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 687, 312));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 240, 242));
        jLabel3.setText("Nama Akhir :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 126, 41));

        buttonEdit.setBackground(new java.awt.Color(204, 204, 0));
        buttonEdit.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonEdit.setForeground(new java.awt.Color(241, 240, 242));
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 690, 116, 49));

        inputNamaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAkhirActionPerformed(evt);
            }
        });
        inputNamaAkhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNamaAkhirKeyReleased(evt);
            }
        });
        jPanel1.add(inputNamaAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 688, 41));

        buttonHapus.setBackground(new java.awt.Color(237, 99, 99));
        buttonHapus.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(241, 240, 242));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, 116, 49));

        buttonBatal.setBackground(new java.awt.Color(153, 153, 153));
        buttonBatal.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonBatal.setForeground(new java.awt.Color(241, 240, 242));
        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, 116, 49));

        buttonSimpanUang.setBackground(new java.awt.Color(108, 94, 207));
        buttonSimpanUang.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonSimpanUang.setForeground(new java.awt.Color(241, 240, 242));
        buttonSimpanUang.setText("Simpan Uang");
        buttonSimpanUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanUangActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSimpanUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 140, 50));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 242));
        jLabel2.setText("Nama Awal :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 126, 41));

        buttonAmbilUang.setBackground(new java.awt.Color(108, 94, 207));
        buttonAmbilUang.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        buttonAmbilUang.setForeground(new java.awt.Color(241, 240, 242));
        buttonAmbilUang.setText("Ambil Uang");
        buttonAmbilUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAmbilUangActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAmbilUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, 49));

        inputNamaAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAwalActionPerformed(evt);
            }
        });
        jPanel1.add(inputNamaAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 688, 41));

        jPanel2.setBackground(new java.awt.Color(31, 29, 43));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 240, 242));
        jLabel4.setText("Tambah Nasabah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel4)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1076, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAwalActionPerformed
        String teksNamaAwal = inputNamaAwal.getText();
        Nasabah nasabah = new Nasabah(teksNamaAwal, "");
    }//GEN-LAST:event_inputNamaAwalActionPerformed

    private void buttonAmbilUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAmbilUangActionPerformed
        mainFrame.showView(new TarikUangView(mainFrame, bank.getNasabah(tableNasabah.getSelectedRow())));
    }//GEN-LAST:event_buttonAmbilUangActionPerformed

    private void buttonSimpanUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanUangActionPerformed
        mainFrame.showView(new TambahUangView(mainFrame, bank.getNasabah(tableNasabah.getSelectedRow())));
    }//GEN-LAST:event_buttonSimpanUangActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        inputNamaAwal.setText("");
        inputNamaAkhir.setText("");

        if (isTableClicked) {
            buttonEdit.setVisible(false);
            buttonHapus.setVisible(false);
            buttonBatal.setVisible(false);
            buttonSimpan.setVisible(true);
            buttonSimpanUang.setVisible(false);
            buttonAmbilUang.setVisible(false);
        }
        //        else {
        //            buttonEdit.setVisible(false);
        //            buttonHapus.setVisible(false);
        //            buttonBatal.setVisible(false);
        //            buttonSimpan.setVisible(false);
        //        }
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tableNasabah.getSelectedRow();

        // Pastikan ada baris yang dipilih sebelum mencoba menghapus
        if (selectedRow >= 0) {
            // Mendapatkan model tabel dari tableNasabah
            DefaultTableModel model = (DefaultTableModel) tableNasabah.getModel();

            // Menghapus baris yang dipilih dari model tabel
            model.removeRow(selectedRow);
        } else {
            // Jika tidak ada baris yang dipilih, tampilkan pesan kesalahan atau tindakan lain yang sesuai
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void inputNamaAkhirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNamaAkhirKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Jika tombol "Enter" ditekan, lakukan tindakan yang sama seperti tombol "Simpan"
            buttonSimpanActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, ""));
        }
    }//GEN-LAST:event_inputNamaAkhirKeyReleased

    private void inputNamaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAkhirActionPerformed
        String teksNamaAkhir = inputNamaAkhir.getText();
        Nasabah nasabah = new Nasabah("", teksNamaAkhir);
    }//GEN-LAST:event_inputNamaAkhirActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tableNasabah.getSelectedRow();

        // Pastikan ada baris yang dipilih sebelum mencoba mengedit
        if (selectedRow >= 0) {
            // Mendapatkan model tabel dari tableNasabah
            DefaultTableModel model = (DefaultTableModel) tableNasabah.getModel();

            // Mendapatkan nilai dari inputNamaAwal dan inputNamaAkhir
            String teksNamaAwal = inputNamaAwal.getText();
            String teksNamaAkhir = inputNamaAkhir.getText();

            // Memeriksa apakah inputNamaAwal atau inputNamaAkhir kosong
            if (teksNamaAwal.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama Awal harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (teksNamaAkhir.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama Akhir harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Mengganti data dalam baris yang dipilih dengan nilai inputNamaAwal dan inputNamaAkhir
                model.setValueAt(teksNamaAwal, selectedRow, 1); // Mengganti kolom "Nama Awal"
                model.setValueAt(teksNamaAkhir, selectedRow, 2); // Mengganti kolom "Nama Akhir"

                // Membersihkan inputNamaAwal dan inputNamaAkhir setelah mengedit
                inputNamaAwal.setText("");
                inputNamaAkhir.setText("");
            }
        } else {
            // Jika tidak ada baris yang dipilih, tampilkan pesan kesalahan atau tindakan lain yang sesuai
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void tableNasabahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNasabahMouseClicked
        int selectedRow = tableNasabah.getSelectedRow();
        int columnIndexSaldo = 3;

        // Pastikan ada baris yang dipilih sebelum mencoba mengisi input
        if (selectedRow >= 0) {
            // Mendapatkan model tabel dari tableNasabah
            DefaultTableModel model = (DefaultTableModel) tableNasabah.getModel();

            // Mendapatkan nilai dari kolom "Nama Awal" dan "Nama Akhir" dari baris yang dipilih
            String namaAwal = model.getValueAt(selectedRow, 1).toString();
            String namaAkhir = model.getValueAt(selectedRow, 2).toString();

            // Mengisi inputNamaAwal dan inputNamaAkhir dengan nilai yang dipilih
            inputNamaAwal.setText(namaAwal);
            inputNamaAkhir.setText(namaAkhir);
        }

        // Jika ada baris yang dipilih, atur isTableClicked menjadi true dan tampilkan tombol-tombol yang sesuai
        if (selectedRow >= 0) {
            isTableClicked = true;
            buttonEdit.setVisible(true);
            buttonHapus.setVisible(true);
            buttonBatal.setVisible(true);
            buttonSimpan.setVisible(false);
            buttonSimpanUang.setVisible(true);
            buttonAmbilUang.setVisible(true);
        } else {
            // Jika tidak ada baris yang dipilih, atur isTableClicked menjadi false dan sembunyikan tombol-tombol
            isTableClicked = false;
            buttonEdit.setVisible(false);
            buttonHapus.setVisible(false);
            buttonBatal.setVisible(false);
            buttonSimpan.setVisible(true);
            buttonSimpanUang.setVisible(false);
            buttonAmbilUang.setVisible(false);
        }


    }//GEN-LAST:event_tableNasabahMouseClicked

    private void buttonSimpanVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_buttonSimpanVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSimpanVetoableChange

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed

        String teksNamaAwal = inputNamaAwal.getText();
        String teksNamaAkhir = inputNamaAkhir.getText();

        if (teksNamaAwal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Awal tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(teksNamaAkhir.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama Akhir tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Membuat objek Nasabah dengan nilai namaAwal dan namaAkhir yang sesuai
            Nasabah nasabah = new Nasabah(teksNamaAwal, teksNamaAkhir);

            bank.tambahNasabah(teksNamaAwal, teksNamaAkhir);

            // Mendapatkan model tabel dari tableNasabah
            model = (DefaultTableModel) tableNasabah.getModel();

            // Menambahkan data nasabah ke dalam tabel sebagai baris baru
            model.addRow(new Object[]{model.getRowCount() + 1, nasabah.getNamaAwal(), nasabah.getNamaAkhir(), 0});

            // Membersihkan inputNamaAwal dan inputNamaAkhir setelah menyimpan
            inputNamaAwal.setText("");
            inputNamaAkhir.setText("");
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void initTable() {
        model = (DefaultTableModel) tableNasabah.getModel();
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            model.addRow(new Object[]{model.getRowCount() + 1, nasabah.getNamaAwal(), nasabah.getNamaAkhir(), nasabah.getTabungan().getSaldo()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAmbilUang;
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonSimpanUang;
    private javax.swing.JTextField inputNamaAkhir;
    private javax.swing.JTextField inputNamaAwal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNasabah;
    // End of variables declaration//GEN-END:variables
}