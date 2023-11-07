/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Almarhum;
import model.Database;
//import model.Keluarga;


public class AlmarhumCRUD extends javax.swing.JFrame {


    public AlmarhumCRUD() {
        initComponents();
        table();
    }

    public void table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("Domisili");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Tanggal Meninggal");
        model.addColumn("Tempat Meninggal");
        model.addColumn("Penyebab Meninggal");
        model.addColumn("Tempat Pemakaman");
        model.addColumn("ID Staff");
        model.addColumn("NIK Keluarga");
        try {
            String query = "SELECT * FROM almarhum";
            Database.connect();
            Database.statement = Database.connection.createStatement();
            Database.resultSet = Database.statement.executeQuery(query);
            while(Database.resultSet.next()){
                model.addRow(new Object[]{
                    Database.resultSet.getString("nik"),
                    Database.resultSet.getString("nama"),
                    Database.resultSet.getString("domisili"),
                    Database.resultSet.getString("tanggal_lahir"),
                    Database.resultSet.getString("tanggal_meninggal"),
                    Database.resultSet.getString("tempat_meninggal"),
                    Database.resultSet.getString("penyebab_meninggal"),
                    Database.resultSet.getString("tempati_pemakaman"),
                    Database.resultSet.getString("staff_id_staff"),
                    Database.resultSet.getString("keluarga_nik_keluarga")
                });
            }
            tabel.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputnik = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        inputnama = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        inputdomisili = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        inputtlahir = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        tanggalmeninggal = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        nikkeluarga = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        tempatmeninggal = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        penyebabmeninggal = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        tempatpemakaman = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        tambahButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        idstaff = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tombolresetdata = new javax.swing.JButton();
        tombolkembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        inputnik.setText("NIK:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        inputnama.setText("Nama:");

        inputdomisili.setText("Domisili:");

        inputtlahir.setText("Tanggal Lahir:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        tanggalmeninggal.setText("Tanggal Meninggal:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        nikkeluarga.setText("NIK Keluarga:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        tempatmeninggal.setText("Tempat Meninggal:");

        penyebabmeninggal.setText("Penyebab Meninggal:");

        tempatpemakaman.setText("Tempat Pemakaman:");

        tambahButton.setText("Tambah");
        tambahButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahButtonMouseClicked(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusButtonMouseClicked(evt);
            }
        });
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        idstaff.setText("ID_Staff:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID001", "ID002" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tombolresetdata.setText("Reset");
        tombolresetdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolresetdataActionPerformed(evt);
            }
        });

        tombolkembali.setText("Kembali");
        tombolkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkembaliActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputdomisili, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(inputnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalmeninggal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombolkembali)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField5)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(tombolresetdata))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nikkeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempatpemakaman)
                            .addComponent(penyebabmeninggal)
                            .addComponent(tempatmeninggal))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tambahButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputnik)
                    .addComponent(tempatmeninggal)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputnama)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penyebabmeninggal)
                    .addComponent(hapusButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputdomisili)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempatpemakaman)
                    .addComponent(editButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputtlahir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idstaff)
                            .addComponent(jButton4))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tanggalmeninggal)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nikkeluarga)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolresetdata)
                    .addComponent(tombolkembali))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 1010, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void tambahButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahButtonMouseClicked
        // TODO add your handling code here:
        String nik = jTextField1.getText();
        String nama = jTextField2.getText();
        String domisili = jTextField3.getText();
        String tanggalLahir = jTextField4.getText();
        String tanggalMeninggal = jTextField5.getText();
        String tempatMeninggal = jTextField7.getText();
        String penyebabMeninggal = jTextField8.getText();
        String tempatPemakaman = jTextField9.getText();
        String idStaff = jComboBox1.getSelectedItem().toString();
        String nikKeluarga = jTextField6.getText();
        Almarhum almarhum = new Almarhum(nik, nama, domisili, tanggalLahir, tanggalMeninggal, tempatMeninggal, penyebabMeninggal, tempatPemakaman, idStaff, null);
        almarhum.createAlmarhum();
        table();

    }//GEN-LAST:event_tambahButtonMouseClicked

    private void hapusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusButtonMouseClicked
        // TODO add your handling code here:
        String nik = jTextField1.getText();
        Almarhum almarhum = new Almarhum(nik, null, null, null, null, null, null, null, null, null);
        almarhum.deleteAlmarhum();
        table();
    }//GEN-LAST:event_hapusButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        int row = tabel.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Pilih data yang ingin diubah!");
        } else {
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            String nik = model.getValueAt(row, 0).toString();
            String nama = jTextField2.getText();
            String domisili = jTextField3.getText();
            String tanggalLahir = jTextField4.getText();
            String tanggalMeninggal = jTextField5.getText();
            String tempatMeninggal = jTextField7.getText();
            String penyebabMeninggal = jTextField8.getText();
            String tempatPemakaman = jTextField9.getText();
            Object idStaff = tabel.getValueAt(row, 8);
            Object nikKeluarga = tabel.getValueAt(row, 9);

            // Validasi inputan (contoh validasi sederhana)
            if (nama.isEmpty() || tanggalLahir.isEmpty() || tanggalMeninggal.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Pastikan semua kolom penting terisi!");
            } else {
                // Mengatasi nikKeluarga yang kosong (null)
                String nikKeluargaStr = (nikKeluarga != null) ? nikKeluarga.toString() : null;

                // Mengubah data dalam model JTable dengan setValueAt
                model.setValueAt(nama, row, 1);
                model.setValueAt(domisili, row, 2);
                model.setValueAt(tanggalLahir, row, 3);
                model.setValueAt(tanggalMeninggal, row, 4);
                model.setValueAt(tempatMeninggal, row, 5);
                model.setValueAt(penyebabMeninggal, row, 6);
                model.setValueAt(tempatPemakaman, row, 7);

                // Simpan data yang diubah ke dalam database dengan metode updateAlmarhum()
                Almarhum almarhum = new Almarhum(nik, nama, domisili, tanggalLahir, tanggalMeninggal, tempatMeninggal, penyebabMeninggal, tempatPemakaman, String.valueOf(idStaff), nikKeluargaStr);
                if (almarhum.updateAlmarhum()) {
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal mengubah data Almarhum.");
                }
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tombolresetdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolresetdataActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(""); 
        jTextField2.setText(""); 
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jTextField5.setText(""); 
        jTextField6.setText(""); 
        jTextField7.setText(""); 
        jTextField8.setText(""); 
        jTextField9.setText(""); 
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_tombolresetdataActionPerformed

    private void tombolkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkembaliActionPerformed
        // TODO add your handling code here:
    Pilihan pilihan = new Pilihan();
    pilihan.setVisible(true);
    this.dispose(); // Menutup jendela KeluargaCRUD
    }//GEN-LAST:event_tombolkembaliActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusButtonActionPerformed


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
            java.util.logging.Logger.getLogger(AlmarhumCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlmarhumCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlmarhumCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlmarhumCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlmarhumCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel idstaff;
    private javax.swing.JLabel inputdomisili;
    private javax.swing.JLabel inputnama;
    private javax.swing.JLabel inputnik;
    private javax.swing.JLabel inputtlahir;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel nikkeluarga;
    private javax.swing.JLabel penyebabmeninggal;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel tanggalmeninggal;
    private javax.swing.JLabel tempatmeninggal;
    private javax.swing.JLabel tempatpemakaman;
    private javax.swing.JButton tombolkembali;
    private javax.swing.JButton tombolresetdata;
    // End of variables declaration//GEN-END:variables


