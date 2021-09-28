
package br.com.view;

import br.com.dao.AdministradorDAO;
import br.com.dao.AtendenteDAO;
import br.com.model.Administrador;
import br.com.model.Atendente;
import br.com.viewTest.TelaAdministrador;
import br.com.viewTest.TelaAtendente;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LoginjTextField1 = new javax.swing.JTextField();
        SenhaLoginjPasswordField1 = new javax.swing.JPasswordField();
        AdmOuAtendentejComboBox1 = new javax.swing.JComboBox<>();
        LoginjButton1 = new javax.swing.JButton();
        CancelarjButton2 = new javax.swing.JButton();
        ExitjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\logo vaccination.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 25)); // NOI18N
        jLabel2.setText("Vaccination System Covid-19");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        LoginjTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 255, 51)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 13))); // NOI18N
        LoginjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginjTextField1ActionPerformed(evt);
            }
        });

        SenhaLoginjPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 255, 51)), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 13))); // NOI18N
        SenhaLoginjPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaLoginjPasswordField1ActionPerformed(evt);
            }
        });

        AdmOuAtendentejComboBox1.setBackground(new java.awt.Color(51, 255, 51));
        AdmOuAtendentejComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atendente" }));
        AdmOuAtendentejComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        AdmOuAtendentejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmOuAtendentejComboBox1ActionPerformed(evt);
            }
        });

        LoginjButton1.setBackground(new java.awt.Color(204, 255, 204));
        LoginjButton1.setText("Login");
        LoginjButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 51)));
        LoginjButton1.setContentAreaFilled(false);
        LoginjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginjButton1ActionPerformed(evt);
            }
        });

        CancelarjButton2.setBackground(new java.awt.Color(204, 255, 204));
        CancelarjButton2.setText("Cancelar");
        CancelarjButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));
        CancelarjButton2.setContentAreaFilled(false);
        CancelarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SenhaLoginjPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(LoginjTextField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(AdmOuAtendentejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(CancelarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(LoginjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LoginjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SenhaLoginjPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(AdmOuAtendentejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        ExitjButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\5a2245b1715e40.6948349115121955054644.png")); // NOI18N
        ExitjButton2.setBorder(null);
        ExitjButton2.setBorderPainted(false);
        ExitjButton2.setContentAreaFilled(false);
        ExitjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitjButton2ActionPerformed

    private void CancelarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarjButton2ActionPerformed

    private void LoginjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginjButton1ActionPerformed
        //Botão login
        String userLogin = LoginjTextField1.getText();
        String userSenha = new String(SenhaLoginjPasswordField1.getPassword());
        String escolha = AdmOuAtendentejComboBox1.getSelectedItem().toString();

        if (escolha.equals("Administrador")) {
            AdministradorDAO adao = new AdministradorDAO();
            String resultado = adao.loginAdm(userLogin, userSenha);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Bem vindo " + userLogin);

                TelaAdmCentral tela = new TelaAdmCentral();
                tela.setVisible(true);
              
            } else {
                JOptionPane.showMessageDialog(null, resultado);
            }

        } else if (escolha.equals("Atendente")) {
            AtendenteDAO atdao = new AtendenteDAO();
            String resultado = atdao.loginAtendente(userLogin, userSenha);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Bem vindo " + userLogin);
                
                TelacentralAtendente tela = new TelacentralAtendente(); 
                tela.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, resultado);
            }

        }

    }//GEN-LAST:event_LoginjButton1ActionPerformed

    private void LoginjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginjTextField1ActionPerformed

    private void SenhaLoginjPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaLoginjPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaLoginjPasswordField1ActionPerformed

    private void AdmOuAtendentejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmOuAtendentejComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdmOuAtendentejComboBox1ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AdmOuAtendentejComboBox1;
    private javax.swing.JButton CancelarjButton2;
    private javax.swing.JButton ExitjButton2;
    private javax.swing.JButton LoginjButton1;
    private javax.swing.JTextField LoginjTextField1;
    private javax.swing.JPasswordField SenhaLoginjPasswordField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
