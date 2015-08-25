package main;

import javax.swing.JOptionPane;

class SecQuestionFrame extends FrameController {

    public SecQuestionFrame () {
        setTitle("Security Questions");
        initComponents();
        QuestionLabel1.setText(secQuestion1);
        QuestionLabel2.setText(secQuestion2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        QuestionLabel1 = new javax.swing.JLabel();
        QuestionLabel2 = new javax.swing.JLabel();
        AnswerField1 = new javax.swing.JTextField();
        AnswerField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SubmitButton.setText("Submit");
        SubmitButton.setToolTipText("");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Security Questions");

        QuestionLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        QuestionLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        AnswerField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnswerField1KeyPressed(evt);
            }
        });

        AnswerField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnswerField2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Please answer the security questions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QuestionLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(QuestionLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnswerField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AnswerField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuestionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AnswerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(QuestionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void reset () {
        AnswerField1.setText(null);
        AnswerField2.setText(null);
    }

    private void authenticate () {
        if (AnswerField1.getText().equalsIgnoreCase(secAnswer1) && AnswerField2.getText().equalsIgnoreCase(secAnswer2)) {
            JOptionPane.showMessageDialog(this, "Confirmed!");
            confirmNextFrame();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect answers!");
            dispose();
            loginFrame.setVisible(true);
        }
    }

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        authenticate();
        reset();

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void AnswerField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnswerField1KeyPressed
        if (evt.getKeyCode() == 10) {
            authenticate();
            reset();
        }
    }//GEN-LAST:event_AnswerField1KeyPressed

    private void AnswerField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnswerField2KeyPressed
        if (evt.getKeyCode() == 10) {
            authenticate();
            reset();
        }
    }//GEN-LAST:event_AnswerField2KeyPressed

    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(SecQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new SecQuestionFrame().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerField1;
    private javax.swing.JTextField AnswerField2;
    private javax.swing.JLabel QuestionLabel1;
    private javax.swing.JLabel QuestionLabel2;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
