package br.com.bh.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cadastro = new javax.swing.JButton();
        SimularEmprestimo = new javax.swing.JButton();
        Sobre = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Banner.png"))); // NOI18N

        Cadastro.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        Cadastro.setText("CLIENTES");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        SimularEmprestimo.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        SimularEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/simularemp.png"))); // NOI18N
        SimularEmprestimo.setText("SIMULAR EMPRESTIMO");
        SimularEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularEmprestimoActionPerformed(evt);
            }
        });

        Sobre.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sobre.png"))); // NOI18N
        Sobre.setText("SOBRE");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar.png"))); // NOI18N
        Sair.setText("SAIR");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Cadastro)
                        .addGap(71, 71, 71)
                        .addComponent(SimularEmprestimo)
                        .addGap(69, 69, 69)
                        .addComponent(Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Sair)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SimularEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        JFrameCliente x = new JFrameCliente();
        x.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        x.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure(x);
            }
        });
        x.setVisible(true);
        dispose();

    }//GEN-LAST:event_CadastroActionPerformed
    public void exitProcedure(JFrame x) {
        x.dispose();
        TelaPrincipal y = new TelaPrincipal();
        y.setVisible(true);

    }
    private void SimularEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularEmprestimoActionPerformed
        SimuladorEmprestimo s = new SimuladorEmprestimo();
        s.setLocationRelativeTo(null);
          s.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        s.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure(s);
            }
        });
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_SimularEmprestimoActionPerformed


    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        Sobre x = new Sobre();
           x.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        x.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure(x);
            }
        });
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastro;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SimularEmprestimo;
    private javax.swing.JButton Sobre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
