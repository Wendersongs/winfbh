
package br.com.bh.view;

import br.com.bh.modelo.dao.ClienteDAO;
import br.com.bh.modelo.entidade.Cliente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JFrameCliente extends javax.swing.JFrame {
DefaultTableModel dm;
    public JFrameCliente() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo( null );
        atualizaTabela();
    }
public static void atualizaTabela(){
        DefaultTableModel tTabela = (DefaultTableModel) jTable1.getModel();
        tTabela.setNumRows(0);
        ClienteDAO dao = new ClienteDAO();
        try {
            List<Cliente> clientes = dao.listaTodosClientes();
            for (int linha = 0; linha < clientes.size(); linha++)
                {
                    Cliente cliente = clientes.get(linha);
                    
                    tTabela.addRow(new Object[]{1});
                    jTable1.setValueAt(cliente.getId(), linha, 0);
                    jTable1.setValueAt(cliente.getNome(), linha, 1);
                    jTable1.setValueAt(cliente.getRg(), linha, 2);
                    jTable1.setValueAt(cliente.getSexo(), linha, 3);
                    jTable1.setValueAt(cliente.getTelefone(), linha, 4);
                    jTable1.setValueAt(cliente.getSalario(), linha, 5);
                    jTable1.setValueAt(cliente.getMargem(), linha, 6);
                    
            
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
 


}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filterTxt = new javax.swing.JTextField();

        btnNovo.setText("Novo");
        btnNovo.setActionCommand("");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "RG", "Sexo", "Telefone", "Salário", "Margem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Clientes");

        filterTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTxtActionPerformed(evt);
            }
        });
        filterTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover))
                            .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnRemover)
                    .addComponent(btnAlterar))
                .addGap(22, 22, 22)
                .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        JFrame clientes = new JFrameCadastroCliente();
        
        clientes.setVisible(true);       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
            int linhaSelecionada = jTable1.getSelectedRow();
            ClienteDAO dao = new ClienteDAO();
    if (linhaSelecionada >= 0){
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o cliente selecionado?");
        if (resposta == JOptionPane.YES_OPTION){
            Cliente cliente = new Cliente();
            cliente.setId((long) jTable1.getValueAt(linhaSelecionada, 0));
            cliente.setNome((String) jTable1.getValueAt(linhaSelecionada, 1));
            try {
                dao.deletar(cliente);
//            BancoDados.removeAposento(aposento);
            } catch (SQLException ex) {
                Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            atualizaTabela();
        }
    }
    else{
        JOptionPane.showMessageDialog(this, "É necessário selecionar um Cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    }//GEN-LAST:event_btnRemoverActionPerformed
     // Filtro da Tabela   
    private void filter (String query)
    {
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<>(dm);
        jTable1.setRowSorter(tr);
        if (query.length() == 0) {  
          tr.setRowFilter(null);
        }
        else{
        tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    private void filterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTxtActionPerformed
        
    }//GEN-LAST:event_filterTxtActionPerformed

    private void filterTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTxtKeyReleased
        String query = filterTxt.getText().toLowerCase();
        filter (query);
    }//GEN-LAST:event_filterTxtKeyReleased

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField filterTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
