/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author Bruno Nicoletti
 */
public class TelacentralAtendente extends javax.swing.JFrame {

    /**
     * Creates new form TelacentralAtendente
     */
    public TelacentralAtendente() {
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

        ExitjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FilaDeVacinacaoTextField = new javax.swing.JTextField();
        EntrarFilaVacinajButton = new javax.swing.JButton();
        EntrarConfirmarVacinajButton = new javax.swing.JButton();
        ConfirmarVacinaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExitjButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\5a2245b1715e40.6948349115121955054644.png")); // NOI18N
        ExitjButton1.setBorder(null);
        ExitjButton1.setBorderPainted(false);
        ExitjButton1.setContentAreaFilled(false);
        ExitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rocha\\OneDrive\\Documentos\\Estudos\\Faculdade\\1-Semestre\\Programação de So\\Projeto Java\\Projeto_Faculdade\\src\\main\\java\\br\\com\\view\\logo vaccination.png")); // NOI18N

        FilaDeVacinacaoTextField.setEditable(false);
        FilaDeVacinacaoTextField.setBackground(new java.awt.Color(204, 255, 204));
        FilaDeVacinacaoTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        FilaDeVacinacaoTextField.setText("    Fila De Vacinação ");
        FilaDeVacinacaoTextField.setBorder(new javax.swing.border.MatteBorder(null));
        FilaDeVacinacaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaDeVacinacaoTextFieldActionPerformed(evt);
            }
        });

        EntrarFilaVacinajButton.setText("Ir ");
        EntrarFilaVacinajButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EntrarFilaVacinajButton.setContentAreaFilled(false);
        EntrarFilaVacinajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarFilaVacinajButtonActionPerformed(evt);
            }
        });

        EntrarConfirmarVacinajButton.setText("Ir ");
        EntrarConfirmarVacinajButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EntrarConfirmarVacinajButton.setContentAreaFilled(false);
        EntrarConfirmarVacinajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarConfirmarVacinajButtonActionPerformed(evt);
            }
        });

        ConfirmarVacinaTextField.setEditable(false);
        ConfirmarVacinaTextField.setBackground(new java.awt.Color(204, 255, 204));
        ConfirmarVacinaTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        ConfirmarVacinaTextField.setText("  Confirmar Vacinação ");
        ConfirmarVacinaTextField.setBorder(new javax.swing.border.MatteBorder(null));
        ConfirmarVacinaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarVacinaTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 25)); // NOI18N
        jLabel1.setText("Central Atendente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(EntrarFilaVacinajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(ConfirmarVacinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(EntrarConfirmarVacinajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(FilaDeVacinacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ExitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(FilaDeVacinacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EntrarFilaVacinajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfirmarVacinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EntrarConfirmarVacinajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ExitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitjButton1ActionPerformed

    private void FilaDeVacinacaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaDeVacinacaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilaDeVacinacaoTextFieldActionPerformed

    private void EntrarFilaVacinajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarFilaVacinajButtonActionPerformed
        FilaVacinacao frame = new FilaVacinacao();
        frame.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_EntrarFilaVacinajButtonActionPerformed

    private void EntrarConfirmarVacinajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarConfirmarVacinajButtonActionPerformed
        ConfirmarVacina frame = new ConfirmarVacina();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EntrarConfirmarVacinajButtonActionPerformed

    private void ConfirmarVacinaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarVacinaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarVacinaTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelacentralAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelacentralAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelacentralAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelacentralAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelacentralAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmarVacinaTextField;
    private javax.swing.JButton EntrarConfirmarVacinajButton;
    private javax.swing.JButton EntrarFilaVacinajButton;
    private javax.swing.JButton ExitjButton1;
    private javax.swing.JTextField FilaDeVacinacaoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
