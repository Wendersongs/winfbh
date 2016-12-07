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
        setLocationRelativeTo(null);
        atualizaTabela();
    }

    public static void atualizaTabela() {
        DefaultTableModel tTabela = (DefaultTableModel) jTable1.getModel();
        tTabela.setNumRows(0);
        ClienteDAO dao = new ClienteDAO();
        try {
            List<Cliente> clientes = dao.listaTodosClientes();
            for (int linha = 0; linha < clientes.size(); linha++) {
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

    public static void atualizaTabelaNome(String nome) {
        DefaultTableModel tTabela = (DefaultTableModel) jTable1.getModel();
        tTabela.setNumRows(0);

        ClienteDAO dao = new ClienteDAO();
        try {
            List<Cliente> clientes = dao.listaClienteFiltradoNome(nome);
            for (int linha = 0; linha < clientes.size(); linha++) {
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
        txtFilter = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        try {
            btnFinanciamento =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "br/com/bh/view.JFrameCliente_btnFinanciamento");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/useradd.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setActionCommand("");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Pesquisa de Clientes");

        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/find.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnFinanciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanciamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinanciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNovo)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        if (linhaSelecionada >= 0) {
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o cliente selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                Cliente cliente = new Cliente();
                cliente.setId((long) jTable1.getValueAt(linhaSelecionada, 0));
                cliente.setNome((String) jTable1.getValueAt(linhaSelecionada, 1));
                try {
                    dao.deletar(cliente);

                } catch (SQLException ex) {
                    Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um Cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnRemoverActionPerformed
    // Filtro da Tabela   

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jTable1.setRowSorter(tr);
        if (query.length() == 0) {
            tr.setRowFilter(null);
        } else {
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed

    }//GEN-LAST:event_txtFilterActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased

    }//GEN-LAST:event_txtFilterKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaPrincipal x = new TelaPrincipal();
        x.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizaTabelaNome(txtFilter.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        ClienteDAO dao = new ClienteDAO();
        if (linhaSelecionada >= 0) {
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja Alterar as informações do cliente selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                Cliente cliente = new Cliente();
                cliente.setId((long) jTable1.getValueAt(linhaSelecionada, 0));
                cliente.setNome((String) jTable1.getValueAt(linhaSelecionada, 1));
                try {
                    cliente = dao.buscaCliente(cliente);
                    JFrame clientes = new JFrameCadastroCliente(cliente);
                    clientes.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
       
            JOptionPane.showMessageDialog(this, "É necessário selecionar um Cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        
        
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnFinanciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanciamentoActionPerformed
       int linhaSelecionada = jTable1.getSelectedRow();
        ClienteDAO dao = new ClienteDAO();
        if (linhaSelecionada >= 0) {
            
                Cliente cliente = new Cliente();
                cliente.setId((long) jTable1.getValueAt(linhaSelecionada, 0));
                cliente.setNome((String) jTable1.getValueAt(linhaSelecionada, 1));
                try {
                    cliente = dao.buscaCliente(cliente);
                    JFrame financiamento = new  QuitacaoEmprestimo(cliente);
                    financiamento.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            
        } else {
       
            JOptionPane.showMessageDialog(this, "É necessário selecionar um Cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        
        
        }
        
    }//GEN-LAST:event_btnFinanciamentoActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFinanciamento;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
