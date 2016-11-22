/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.chamados.gui;

import br.ufmt.ic.posbd.chamadosMySQL.entidade.Tipo;

/**
 *
 * @author edy
 */
public class HardwareJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HardwareJPanel
     */
    public HardwareJPanel() {
        this.initComponents();
        this.CarregarComboBoxTipo();
    }
private void CarregarComboBoxTipo()
{
    TipojComboBox.removeAllItems();
    TipojComboBox.addItem("Selecione um item....");
    TipojComboBox.addItem(Tipo.Generico.toString());
    TipojComboBox.addItem(Tipo.Desktop.toString());
    TipojComboBox.addItem(Tipo.Servidor.toString());
}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CNPJLabel = new javax.swing.JLabel();
        CidadeJLabel = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        EmpresaJTextField = new javax.swing.JTextField();
        idJLabel = new javax.swing.JLabel();
        CidadeJComboBox = new javax.swing.JComboBox<>();
        EmpresaJLabel = new javax.swing.JLabel();
        TipojComboBox = new javax.swing.JComboBox<>();
        ListarjButton = new javax.swing.JButton();
        LimparjButton = new javax.swing.JButton();
        ExclurjButton = new javax.swing.JButton();
        CancelarjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        SalvarjButton = new javax.swing.JButton();

        CNPJLabel.setText("Tipo:");

        CidadeJLabel.setText("Cidade:");

        IDJTextField.setEnabled(false);

        idJLabel.setText("Id:");

        CidadeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        EmpresaJLabel.setText("Equipamento:");

        TipojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ListarjButton.setText("Listar");

        LimparjButton.setText("Limpar");

        ExclurjButton.setText("Excluir");

        CancelarjButton.setText("Cancelar");

        editarjButton.setText("Editar");

        SalvarjButton.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(CNPJLabel))
                                    .addComponent(CidadeJLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(EmpresaJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(idJLabel)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TipojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmpresaJTextField)
                            .addComponent(IDJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ListarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(SalvarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExclurjButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(idJLabel))
                    .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(EmpresaJLabel))
                    .addComponent(EmpresaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CNPJLabel))
                    .addComponent(TipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CidadeJLabel))
                    .addComponent(CidadeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ListarjButton)
                        .addComponent(LimparjButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExclurjButton)
                        .addComponent(CancelarjButton)
                        .addComponent(editarjButton)
                        .addComponent(SalvarjButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNPJLabel;
    private javax.swing.JButton CancelarjButton;
    private javax.swing.JComboBox<String> CidadeJComboBox;
    private javax.swing.JLabel CidadeJLabel;
    private javax.swing.JLabel EmpresaJLabel;
    private javax.swing.JTextField EmpresaJTextField;
    private javax.swing.JButton ExclurjButton;
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton LimparjButton;
    private javax.swing.JButton ListarjButton;
    private javax.swing.JButton SalvarjButton;
    private javax.swing.JComboBox<String> TipojComboBox;
    private javax.swing.JButton editarjButton;
    private javax.swing.JLabel idJLabel;
    // End of variables declaration//GEN-END:variables
}
