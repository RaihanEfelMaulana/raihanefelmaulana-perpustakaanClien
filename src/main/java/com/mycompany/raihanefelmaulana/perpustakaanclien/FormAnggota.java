/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.raihanefelmaulana.perpustakaanclien;

import com.mycompany.raihanefelmaulana.perpustakaanclien.Controller.AnggotaController;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class FormAnggota extends javax.swing.JFrame {

    /**
     * Creates new form FormAnggota
     */
    AnggotaController controller;
    public FormAnggota(){
        initComponents();
        controller = new AnggotaController(this);
        controller.bersihForm();
        controller.viewTabel();
    }
   
    public JTable getTabelAnggota() {
        return tabelAnggota;
    }

    public JTextField getTxtAnggotaAddress() {
        return txtAnggotaAddress;
    }

    public JTextField getTxtAnggotaId() {
        return txtAnggotaId;
    }

    public JTextField getTxtAnggotaName() {
        return txtAnggotaName;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtAnggotaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAnggotaName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAnggotaAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAnggota = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Anggota Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 80, 16);

        txtAnggotaId.setText("jTextField1");
        getContentPane().add(txtAnggotaId);
        txtAnggotaId.setBounds(130, 20, 170, 30);

        jLabel2.setText("Nama Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 90, 16);

        txtAnggotaName.setText("jTextField1");
        txtAnggotaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnggotaNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnggotaName);
        txtAnggotaName.setBounds(130, 60, 250, 30);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 50, 20);

        txtAnggotaAddress.setText("jTextField1");
        getContentPane().add(txtAnggotaAddress);
        txtAnggotaAddress.setBounds(130, 100, 250, 30);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(10, 140, 70, 22);

        tabelAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Anggota Id", "Nama", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(tabelAnggota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 370, 220);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(310, 20, 70, 22);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(90, 140, 70, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(170, 140, 72, 22);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(313, 140, 72, 22);

        setSize(new java.awt.Dimension(413, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnggotaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnggotaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnggotaNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        controller.saveAnggota();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        controller.getAnggotaId();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updateAnggota();
         controller.viewTabel();
         controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deleteAnggota();
         controller.viewTabel();
         controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelAnggota;
    private javax.swing.JTextField txtAnggotaAddress;
    private javax.swing.JTextField txtAnggotaId;
    private javax.swing.JTextField txtAnggotaName;
    // End of variables declaration//GEN-END:variables
}
