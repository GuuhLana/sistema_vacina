
package br.com.view;

import br.com.dao.PacientesDAO;
import br.com.model.Pacientes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RemoverCadastroPaciente extends javax.swing.JFrame {

        public void listar(){
            PacientesDAO dao = new PacientesDAO();
            List<Pacientes> lista = dao.listarPacientes();
            DefaultTableModel dados = (DefaultTableModel) TabelaRemoverPacientejTable1.getModel();
            dados.setNumRows(0);
            
            for(Pacientes p: lista){
                dados.addRow(new Object[]{
                    p.getNome(),
                    p.getIdade(),
                    p.getEndereco()
                });
            }
    }

    public RemoverCadastroPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ExitjButton2 = new javax.swing.JButton();
        ReturnjButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaRemoverPacientejTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        NomeRemoverPacientejTextField1 = new javax.swing.JTextField();
        ConfirmarRemocaoPacientejButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 25)); // NOI18N
        jLabel1.setText("Remover Paciente");

        ExitjButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\5a2245b1715e40.6948349115121955054644.png")); // NOI18N
        ExitjButton2.setBorder(null);
        ExitjButton2.setBorderPainted(false);
        ExitjButton2.setContentAreaFilled(false);
        ExitjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjButton2ActionPerformed(evt);
            }
        });

        ReturnjButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\icone_seta_voltar.png")); // NOI18N
        ReturnjButton3.setBorderPainted(false);
        ReturnjButton3.setContentAreaFilled(false);
        ReturnjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnjButton3ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setAutoscrolls(true);

        TabelaRemoverPacientejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(TabelaRemoverPacientejTable1);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeRemoverPacientejTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 255, 51)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 13))); // NOI18N
        jPanel1.add(NomeRemoverPacientejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 328, 44));

        ConfirmarRemocaoPacientejButton4.setText("Remover");
        ConfirmarRemocaoPacientejButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        ConfirmarRemocaoPacientejButton4.setContentAreaFilled(false);
        ConfirmarRemocaoPacientejButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarRemocaoPacientejButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmarRemocaoPacientejButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 119, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\logo vaccination.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReturnjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(ExitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReturnjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitjButton2ActionPerformed

    private void ReturnjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnjButton3ActionPerformed
        RemoverCadastros frame = new  RemoverCadastros();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnjButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void ConfirmarRemocaoPacientejButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarRemocaoPacientejButton4ActionPerformed
       Pacientes p = new Pacientes();
       p.setNome(NomeRemoverPacientejTextField1.getText());
       
       PacientesDAO pd = new PacientesDAO();
       pd.excluirPacientes(p);
    }//GEN-LAST:event_ConfirmarRemocaoPacientejButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmarRemocaoPacientejButton4;
    private javax.swing.JButton ExitjButton2;
    private javax.swing.JTextField NomeRemoverPacientejTextField1;
    private javax.swing.JButton ReturnjButton3;
    private javax.swing.JTable TabelaRemoverPacientejTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
