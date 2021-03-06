/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.chamados.gui;

import br.ufmt.ic.posbd.chamados.FabricaDAO;
import br.ufmt.ic.posbd.chamados.dao.CidadeDAO;
import br.ufmt.ic.posbd.chamados.tableModel.CidadeTableModel;
import br.ufmt.ic.posbd.chamadosMySQL.entidade.Cidade;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edy
 */
public class CidadeJPanel extends javax.swing.JPanel {

    private CidadeTableModel tableModel;
    private CidadeDAO dao = FabricaDAO.criarCidadeDAO();

    /**
     * Creates new form CidadeJPanel
     */
    public CidadeJPanel() {
        tableModel = new CidadeTableModel(dao.listar());
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

        SalvarJButton = new javax.swing.JButton();
        CancelarJButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        idJLabel = new javax.swing.JLabel();
        CidadeJLabel = new javax.swing.JLabel();
        EstadojLabel = new javax.swing.JLabel();
        PaisjLabel = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        CidadeJTextField = new javax.swing.JTextField();
        EstadoJTextField = new javax.swing.JTextField();
        PaisJTextField = new javax.swing.JTextField();
        ListarJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJTable = new javax.swing.JTable();
        LimparJButton = new javax.swing.JButton();

        SalvarJButton.setText("Salvar");
        SalvarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarJButtonActionPerformed(evt);
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

        ExcluirJButton.setText("Excluir");
        ExcluirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirJButtonActionPerformed(evt);
            }
        });

        idJLabel.setText("Id:");

        CidadeJLabel.setText("Nome Cidade:");

        EstadojLabel.setText("Nome Estado:");

        PaisjLabel.setText("Nome Países :");

        IDJTextField.setEnabled(false);

        ListarJButton.setText("Listar");
        ListarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarJButtonActionPerformed(evt);
            }
        });

        tabelaJTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelaJTable);

        LimparJButton.setText("Limpar");
        LimparJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDJTextField)
                            .addComponent(CidadeJTextField)
                            .addComponent(EstadoJTextField)
                            .addComponent(PaisJTextField))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(idJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CidadeJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(EstadojLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PaisjLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ListarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalvarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(EditarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(CancelarJButton)
                        .addGap(6, 6, 6)
                        .addComponent(ExcluirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(idJLabel))
                    .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CidadeJLabel))
                    .addComponent(CidadeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(EstadojLabel))
                    .addComponent(EstadoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(PaisjLabel))
                    .addComponent(PaisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ListarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarJButtonActionPerformed
        // TODO add your handling code here:

        tabelaJTable.setModel(tableModel);
        tableModel.atualizar(dao.listar());
    }//GEN-LAST:event_ListarJButtonActionPerformed

    private void LimparJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparJButtonActionPerformed
        // TODO add your handling code here:
        tabelaJTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_LimparJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:
        if (tabelaJTable.getSelectedRowCount() == 1) {

            int[] linhas = tabelaJTable.getSelectedRows();
            if (JOptionPane.showConfirmDialog(ExcluirJButton,
                    "Deseja realmente excluir?")
                    == JOptionPane.YES_OPTION) {

                for (int i = 0; i < linhas.length; i++) {
                    Cidade cidade = tableModel.get(linhas[i]);
                    dao.excluir(cidade.getId());
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
        CidadeJTextField.setText("");
        EstadoJTextField.setText("");
        PaisJTextField.setText("");

    }//GEN-LAST:event_CancelarJButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        // TODO add your handling code here:
        if (tabelaJTable.getSelectedRowCount() == 1) {
            int linha = tabelaJTable.getSelectedRow();
            Cidade edicao = tableModel.get(linha);
            IDJTextField.setText(edicao.getId() + "");
            CidadeJTextField.setText(edicao.getNome());
            EstadoJTextField.setText(edicao.getEstado());
            PaisJTextField.setText(edicao.getPais());

        } else {
            JOptionPane.showMessageDialog(tabelaJTable,
                    "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void SalvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarJButtonActionPerformed
        // TODO add your handling code here:
        if (!CidadeJTextField.getText().equals("")) {
            Cidade cidade = new Cidade();

            cidade.setNome(CidadeJTextField.getText());
            cidade.setEstado(EstadoJTextField.getText());
            cidade.setPais(PaisJTextField.getText());

            if (!IDJTextField.getText().equals("")) {
                int id = Integer.parseInt(IDJTextField.getText());
                cidade.setId(id);
                dao.alterar(cidade);
                JOptionPane.showMessageDialog(SalvarJButton,
                        "Atualizado com Sucesso!");
            } else {
                dao.inserir(cidade);
                JOptionPane.showMessageDialog(SalvarJButton,
                        "Inserido com Sucesso!");
            }

            tableModel.atualizar(dao.listar());

            CancelarJButtonActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(CidadeJTextField,
                    "Informe o campo nome!");
            CidadeJTextField.grabFocus();
        }
    }//GEN-LAST:event_SalvarJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarJButton;
    private javax.swing.JLabel CidadeJLabel;
    private javax.swing.JTextField CidadeJTextField;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JTextField EstadoJTextField;
    private javax.swing.JLabel EstadojLabel;
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton LimparJButton;
    private javax.swing.JButton ListarJButton;
    private javax.swing.JTextField PaisJTextField;
    private javax.swing.JLabel PaisjLabel;
    private javax.swing.JButton SalvarJButton;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaJTable;
    // End of variables declaration//GEN-END:variables
}
