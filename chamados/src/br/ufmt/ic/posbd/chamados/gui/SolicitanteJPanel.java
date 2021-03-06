/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.chamados.gui;

import br.ufmt.ic.posbd.chamados.FabricaDAO;
import br.ufmt.ic.posbd.chamados.dao.SolicitanteDAO;
import br.ufmt.ic.posbd.chamados.tableModel.SolicitanteTableModel;
import br.ufmt.ic.posbd.chamadosPostgres.entidade.Solicitante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edy
 */
public class SolicitanteJPanel extends javax.swing.JPanel {

    private SolicitanteTableModel tableModel;
    private SolicitanteDAO dao = FabricaDAO.criarSolicitanteDAO();

    /**
     * Creates new form PessoaJPanel
     */
    public SolicitanteJPanel() {
        tableModel = new SolicitanteTableModel(dao.listar());
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

        idJLabel = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        NomeJTextField = new javax.swing.JTextField();
        NomeJLabel = new javax.swing.JLabel();
        CNPJLabel = new javax.swing.JLabel();
        CPFJTextField = new javax.swing.JTextField();
        ExcluirJButton = new javax.swing.JButton();
        CancelarJButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SalvarJButton = new javax.swing.JButton();
        LimparJButton = new javax.swing.JButton();
        ListarJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJTable = new javax.swing.JTable();

        idJLabel.setText("Id:");

        IDJTextField.setEnabled(false);

        NomeJLabel.setText("Nome:");

        CNPJLabel.setText("CPF:");

        ExcluirJButton.setText("Excluir");
        ExcluirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirJButtonActionPerformed(evt);
            }
        });

        CancelarJButton.setText("Cancelar");
        CancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarJButtonActionPerformed(evt);
            }
        });

        EditarjButton.setText("Editar");
        EditarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarjButtonActionPerformed(evt);
            }
        });

        SalvarJButton.setText("Salvar");
        SalvarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarJButtonActionPerformed(evt);
            }
        });

        LimparJButton.setText("Limpar");
        LimparJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparJButtonActionPerformed(evt);
            }
        });

        ListarJButton.setText("Listar");
        ListarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarJButtonActionPerformed(evt);
            }
        });

        tabelaJTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelaJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomeJLabel)
                            .addComponent(CNPJLabel)
                            .addComponent(idJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDJTextField)
                            .addComponent(NomeJTextField)
                            .addComponent(CPFJTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ListarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(SalvarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(EditarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(CancelarJButton)
                        .addGap(6, 6, 6)
                        .addComponent(ExcluirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJLabel))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SalvarJButton)
                        .addComponent(ListarJButton)
                        .addComponent(LimparJButton))
                    .addComponent(EditarjButton)
                    .addComponent(CancelarJButton)
                    .addComponent(ExcluirJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:
        if (tabelaJTable.getSelectedRowCount() == 1) {
            int[] linhas = tabelaJTable.getSelectedRows();
            if (JOptionPane.showConfirmDialog(ExcluirJButton,
                    "Deseja realmente excluir?")
                    == JOptionPane.YES_OPTION) {

                for (int i = 0; i < linhas.length; i++) {
                    Solicitante solicitante = tableModel.get(linhas[i]);
                    dao.excluir(solicitante.getId());
                }
                JOptionPane.showMessageDialog(tabelaJTable,
                        "Removidos com Sucesso!");
                tableModel.atualizar(dao.listar());
            }
        } else {
            JOptionPane.showMessageDialog(tabelaJTable,
                    "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_ExcluirJButtonActionPerformed

    private void CancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarJButtonActionPerformed
        // TODO add your handling code here:
        IDJTextField.setText("");
        NomeJTextField.setText("");
        CPFJTextField.setText("");
    }//GEN-LAST:event_CancelarJButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        //        // TODO add your handling code here:
        if (tabelaJTable.getSelectedRowCount() == 1) {
            int linha = tabelaJTable.getSelectedRow();
            Solicitante edicao = tableModel.get(linha);
            IDJTextField.setText(edicao.getId() + "");
            NomeJTextField.setText(edicao.getNome());
            CPFJTextField.setText(edicao.getCPF());

        } else {
            JOptionPane.showMessageDialog(tabelaJTable,
                    "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void SalvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarJButtonActionPerformed
        // TODO add your handling code here:
        if (!NomeJTextField.getText().equals("")) {
            Solicitante solicitante = new Solicitante();

            solicitante.setNome(NomeJTextField.getText());
            solicitante.setCPF(CPFJTextField.getText());

            if (!IDJTextField.getText().equals("")) {
                int id = Integer.parseInt(IDJTextField.getText());
                solicitante.setId(id);
                dao.alterar(solicitante);
                JOptionPane.showMessageDialog(SalvarJButton,
                        "Atualizado com Sucesso!");
            } else {
                dao.inserir(solicitante);
                JOptionPane.showMessageDialog(SalvarJButton,
                        "Inserido com Sucesso!");
            }

            tableModel.atualizar(dao.listar());

            CancelarJButtonActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(NomeJTextField,
                    "Informe o campo nome!");
            NomeJTextField.grabFocus();
        }
    }//GEN-LAST:event_SalvarJButtonActionPerformed

    private void LimparJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparJButtonActionPerformed
        // TODO add your handling code here:
        tabelaJTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_LimparJButtonActionPerformed

    private void ListarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarJButtonActionPerformed

        tabelaJTable.setModel(tableModel);
        tableModel.atualizar(dao.listar());
    }//GEN-LAST:event_ListarJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNPJLabel;
    private javax.swing.JTextField CPFJTextField;
    private javax.swing.JButton CancelarJButton;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton LimparJButton;
    private javax.swing.JButton ListarJButton;
    private javax.swing.JLabel NomeJLabel;
    private javax.swing.JTextField NomeJTextField;
    private javax.swing.JButton SalvarJButton;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaJTable;
    // End of variables declaration//GEN-END:variables
}
