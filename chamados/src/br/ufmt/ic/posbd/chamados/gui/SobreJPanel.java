/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.chamados.gui;

/**
 *
 * @author edy
 */
public class SobreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SobreJPanel
     */
    public SobreJPanel() {
        initComponents();
        btnSairJButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSairJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("UFMT IC");
        jScrollPane1.setViewportView(jTextArea1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSairJButton.setText("Sair");
        btnSairJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairJButtonActionPerformed(evt);
            }
        });
        add(btnSairJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/posbd/chamados/gui/img/banco_dados.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("criada em 1970 e vinculada ao Ministério da Educação. Wikipédia.");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, 10));

        jLabel3.setText("A Universidade Federal de Mato Grosso é uma instituição de ensino superior pública federal brasileira,");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairJButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
