/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.chamados.gui;

import br.ufmt.ic.posbd.chamados.FabricaDAO;
import br.ufmt.ic.posbd.chamados.dao.EmpresaDAO;
import br.ufmt.ic.posbd.chamados.tableModel.EmpresaTableModel;
import br.ufmt.ic.posbd.chamadosMySQL.entidade.Cidade;
import br.ufmt.ic.posbd.chamadosMySQL.entidade.Empresa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edy
 */
public class EmpresaJPanel extends javax.swing.JPanel {

    private EmpresaTableModel tableModel;
    private EmpresaDAO dao = FabricaDAO.criarEmpresaDAO();

    /**
     * Creates new form CidadeJPanel
     */
    public EmpresaJPanel() {
        tableModel = new EmpresaTableModel(dao.listar());
        this.initComponents();
         this.CarregarComboBOX();
    }
    private void CarregarComboBOX()
    {
         CidadeJComboBox.removeAllItems();
        List<Cidade> cidades  = FabricaDAO.criarCidadeDAO().listar();
        CidadeJComboBox.addItem("Selecione uma Cidade...");
        for (Cidade cidade : cidades) {
            CidadeJComboBox.addItem(cidade.getNome());           
        };
   
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
        EmpresaJLabel = new javax.swing.JLabel();
        CNPJLabel = new javax.swing.JLabel();
        CidadeJLabel = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        EmpresaJTextField = new javax.swing.JTextField();
        CNPJJTextField = new javax.swing.JTextField();
        ListarJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJTable = new javax.swing.JTable();
        LimparJButton = new javax.swing.JButton();
        CidadeJComboBox = new javax.swing.JComboBox<>();

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

        EmpresaJLabel.setText("Empresa:");

        CNPJLabel.setText("CNPJ:");

        CidadeJLabel.setText("Cidade:");

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

        CidadeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmpresaJLabel)
                            .addComponent(idJLabel))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDJTextField)
                            .addComponent(EmpresaJTextField)
                            .addComponent(CNPJJTextField)
                            .addComponent(CidadeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CNPJLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ListarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CidadeJLabel)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJLabel))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpresaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpresaJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CNPJLabel))
                    .addComponent(CNPJJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(CidadeJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CidadeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
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
        
         tabelaJTable.setModel(tableModel);
         tableModel.atualizar(dao.listar());
    }//GEN-LAST:event_ListarJButtonActionPerformed

    private void LimparJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparJButtonActionPerformed
        // TODO add your handling code here:
        tabelaJTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_LimparJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:

        int[] linhas = tabelaJTable.getSelectedRows();
        if (JOptionPane.showConfirmDialog(ExcluirJButton,
                "Deseja realmente excluir?")
                == JOptionPane.YES_OPTION) {

            for (int i = 0; i < linhas.length; i++) {
                Empresa empresa = tableModel.get(linhas[i]);
                dao.excluir(empresa.getId());
            }
            JOptionPane.showMessageDialog(tabelaJTable,
                    "Removidos com Sucesso!");
            tableModel.atualizar(dao.listar());
        }
    }//GEN-LAST:event_ExcluirJButtonActionPerformed

    private void CancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarJButtonActionPerformed
        // TODO add your handling code here:
        IDJTextField.setText("");
        EmpresaJTextField.setText("");
        CNPJJTextField.setText("");
        CidadeJComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_CancelarJButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
//        // TODO add your handling code here:
        if (tabelaJTable.getSelectedRowCount() == 1) {
            int linha = tabelaJTable.getSelectedRow();
            Empresa edicao = tableModel.get(linha);
            IDJTextField.setText(edicao.getId() + "");
            EmpresaJTextField.setText(edicao.getNome());
            CNPJJTextField.setText(edicao.getCNPJ());
            CidadeJComboBox.setSelectedItem(edicao.getCidade());

        } else {
            JOptionPane.showMessageDialog(tabelaJTable,
                    "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void SalvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarJButtonActionPerformed
        // TODO add your handling code here:
         if (!EmpresaJTextField.getText().equals("")) {
            Empresa empresa = new Empresa();

            empresa.setNome(EmpresaJTextField.getText());
            empresa.setCNPJ(CNPJJTextField.getText());
            empresa.setCidade(CidadeJComboBox.getSelectedItem().toString());

            if(!IDJTextField.getText().equals("")){
                int id = Integer.parseInt(IDJTextField.getText());
                empresa.setId(id);
                dao.alterar(empresa);
                JOptionPane.showMessageDialog(SalvarJButton,
                    "Atualizado com Sucesso!");
            }else{
                dao.inserir(empresa);
                JOptionPane.showMessageDialog(SalvarJButton,
                    "Inserido com Sucesso!");
            }

            tableModel.atualizar(dao.listar());
            
            
           CancelarJButtonActionPerformed(evt);
            
        }else{
            JOptionPane.showMessageDialog(EmpresaJTextField,
                    "Informe o campo nome!");
            EmpresaJTextField.grabFocus();
        }
    }//GEN-LAST:event_SalvarJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNPJJTextField;
    private javax.swing.JLabel CNPJLabel;
    private javax.swing.JButton CancelarJButton;
    private javax.swing.JComboBox<String> CidadeJComboBox;
    private javax.swing.JLabel CidadeJLabel;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JLabel EmpresaJLabel;
    private javax.swing.JTextField EmpresaJTextField;
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton LimparJButton;
    private javax.swing.JButton ListarJButton;
    private javax.swing.JButton SalvarJButton;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaJTable;
    // End of variables declaration//GEN-END:variables
}
