/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bh.view;

import br.com.bh.controller.FinanciamentoController;
import br.com.bh.modelo.dao.ClienteDAO;
import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.utils.Data;
import br.com.bh.utils.Mascara;
import br.com.bh.utils.ValidaCPF;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.List;

/**
 *
 * @author wenderson_s
 */
public class JFrameCadastroCliente extends javax.swing.JFrame {

    Mascara mask = new Mascara();

    public JFrameCadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);
        btnSalvar.setVisible(false);
        mascara();
        

    }

    public JFrameCadastroCliente(Cliente cliente) {
        initComponents();
        setLocationRelativeTo(null);
        mascara();
        preencheformulario(cliente);
        btnCadastrar.setVisible(false);

    }

    public void mascara() {
        Mascara mask = new Mascara();
        try {
            mask.maskData(txtData);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(JFrameCadastroCliente.this, "Data Inválida", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        try {
            mask.maskCep(txtCep);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(JFrameCadastroCliente.this, "Cep Inválido", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        try {
            mask.maskTel(txtTel);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(JFrameCadastroCliente.this, "Telefone Inválido", "Erro", JOptionPane.ERROR_MESSAGE);

        }

        try {
            mask.maskTel(txtCel);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(JFrameCadastroCliente.this, "Celular Inválido", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtCel = new javax.swing.JFormattedTextField();
        lblOcupa = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtMargem = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastro de Clientes");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concluir.png"))); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar.png"))); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("Nome");

        jLabel2.setText("RG");

        jLabel3.setText("CPF");

        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        jLabel12.setText("Email");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel5.setText("Sexo");

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel13.setText("Data de Nascimento");

        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFocusLost(evt);
            }
        });

        txtTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelFocusLost(evt);
            }
        });
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        lblOcupa.setText("Ocupação");

        jComboBox1.setMaximumRowCount(3);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aposentado", "Pensionista", "Funcionario Público" }));

        jLabel9.setText("Margem");

        txtMargem.setEditable(false);
        txtMargem.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMargem.setEnabled(false);

        txtSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalarioFocusLost(evt);
            }
        });

        jLabel8.setText("Salário");

        jLabel15.setText("Telefone");

        jLabel16.setText("Celular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(61, 61, 61)
                                        .addComponent(lblOcupa))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(txtMargem))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(26, 26, 26))
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(lblOcupa))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMargem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblOcupa.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Adicionais"));

        jLabel7.setText("Endereço");

        jLabel11.setText("CEP");

        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });

        lblInfo.setText("Informações Adicionais");

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblInfo)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concluir.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(48, 48, 48))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton2)
                    .addComponent(btnSalvar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ClienteDAO dao = new ClienteDAO();

// Validar Campos
        if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "O campo Nome está vazio");
            txtNome.requestFocus();
            return;
        }
        if (txtCpf.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo CPF está vazio");
            txtCpf.requestFocus();
            return;

        }

        if (txtRg.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo RG está vazio");
            txtRg.requestFocus();
            return;

        }

        if (txtSalario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Salário está vazio");
            txtSalario.requestFocus();
            return;

        }

        if (txtEndereco.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Endereço está vazio");
            txtEndereco.requestFocus();
            return;

        }
        if (txtTel.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Telefone está vazio");
            txtTel.requestFocus();
            return;

        }
        try {

            List<Cliente> clientes = dao.listaCliente(txtCpf.getText());
            if (!clientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Já existe um cliente cadastrado com esse cpf");
                txtCpf.requestFocus();
                txtCpf.setText("");
                return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cliente cliente = new Cliente();
        cliente.setNome(txtNome.getText());
        cliente.setRg(txtRg.getText());
        cliente.setSexo(txtSexo.getSelectedItem().toString());
        cliente.setCpf(txtCpf.getText());
        cliente.setEndereco(txtEndereco.getText());
        cliente.setTelefone(txtTel.getText());
        cliente.setCelular(txtCel.getText());
        cliente.setSalario(mask.moneyToDouble(txtSalario.getText()));
        cliente.setMargem(mask.moneyToDouble(txtMargem.getText()));
        cliente.setCep(txtCep.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setInformacoes(txtInfo.getText());
        cliente.setOcupacao(jComboBox1.getSelectedItem().toString());
        //FIZ UMA ALTERAÇÃO NESTE CAMPO COLOQUEI UM COMBOBOX 

        //cliente.setOcupacao(txtOcupa.getText());
        cliente.setData_nascimento(Data.converteCalendar(txtData.getText()));

        dao.inserir(cliente);
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
        jButton3ActionPerformed(null);

        JFrameCliente.atualizaTabela();


    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void preencheformulario(Cliente cliente) {
        txtCodigo.setText(String.valueOf(cliente.getId()));
        txtNome.setText(cliente.getNome());
        txtCel.setText(cliente.getCelular());
        txtTel.setText(cliente.getTelefone());
        txtCep.setText(cliente.getCep());
        txtCpf.setText(cliente.getCpf());
        txtData.setText(new SimpleDateFormat("dd/MM/yyyy").format(cliente.getData_nascimento().getTime()));
        txtEmail.setText(cliente.getEmail());
        txtEndereco.setText(cliente.getEndereco());
        txtSalario.setText(NumberFormat.getCurrencyInstance().format(cliente.getSalario()));
        txtInfo.setText(cliente.getInformacoes());
        txtMargem.setText(NumberFormat.getCurrencyInstance().format(cliente.getMargem()));
        txtRg.setText(cliente.getRg());
        jComboBox1.setSelectedItem(cliente.getOcupacao().toString());
        btnSalvar.setVisible(true);

    }
    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        ClienteDAO dao = new ClienteDAO();
        if (ValidaCPF.isCPF(txtCpf.getText())) {
            txtCpf.setText(ValidaCPF.imprimeCPF(txtCpf.getText()));

        } else {
            JOptionPane.showMessageDialog(null, "O Cpf passado está inválido, digite novamente");
            //txtCpf.requestFocus();
        }
          try {

            List<Cliente> clientes = dao.listaCliente(txtCpf.getText());
            if (!clientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Já existe um cliente cadastrado com esse cpf");
                txtCpf.requestFocus();
                txtCpf.setText("");
                return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton3ActionPerformed(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFocusLost

    private void txtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFocusLost

    private void txtSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFocusLost
        FinanciamentoController e = new FinanciamentoController();
        txtSalario.setText(mask.dobleToMoney(mask.moneyToDouble(txtSalario.getText())));
        txtMargem.setText(NumberFormat.getCurrencyInstance().format(e.calculaMargem(mask.moneyToDouble(txtSalario.getText()))));
        txtMargem.setEnabled(false);
    }//GEN-LAST:event_txtSalarioFocusLost

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrameCliente x = new JFrameCliente();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Validar Campos
        if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "O campo Nome está vazio");
            txtNome.requestFocus();
            return;
        }
        if (txtCpf.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo CPF está vazio");
            txtCpf.requestFocus();
            return;

        }

        if (txtRg.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo RG está vazio");
            txtRg.requestFocus();
            return;

        }

        if (txtSalario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Salário está vazio");
            txtSalario.requestFocus();
            return;

        }

        if (txtEndereco.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Endereço está vazio");
            txtEndereco.requestFocus();
            return;

        }
        if (txtTel.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Telefone está vazio");
            txtTel.requestFocus();
            return;

        }

        Cliente cliente = new Cliente();
        cliente.setId(Long.parseLong(txtCodigo.getText()));
        cliente.setNome(txtNome.getText());
        cliente.setRg(txtRg.getText());
        cliente.setSexo(txtSexo.getSelectedItem().toString());
        cliente.setCpf(txtCpf.getText());
        cliente.setEndereco(txtEndereco.getText());
        cliente.setTelefone(txtTel.getText());
        cliente.setCelular(txtCel.getText());
        cliente.setSalario(mask.moneyToDouble(txtSalario.getText()));
        cliente.setMargem(mask.moneyToDouble(txtMargem.getText()));
        cliente.setCep(txtCep.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setInformacoes(txtInfo.getText());
        cliente.setOcupacao(jComboBox1.getSelectedItem().toString());
        //FIZ UMA ALTERAÇÃO NESTE CAMPO COLOQUEI UM COMBOBOX 

        cliente.setData_nascimento(Data.converteCalendar(txtData.getText()));
        ClienteDAO dao = new ClienteDAO();
        try {
            dao.atualizar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");

            jButton3ActionPerformed(null);

        } catch (SQLException ex) {
            Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cliente", "ERRO", JOptionPane.ERROR_MESSAGE);
            jButton3ActionPerformed(null);
        }
        JFrameCliente.atualizaTabela();


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost

    }//GEN-LAST:event_txtCepFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
           if  (!Mascara.isEmailValid(txtEmail.getText())){
           JOptionPane.showMessageDialog(null, "Email inválido! ");
           
           }
    }//GEN-LAST:event_txtEmailFocusLost

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
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblOcupa;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtMargem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
