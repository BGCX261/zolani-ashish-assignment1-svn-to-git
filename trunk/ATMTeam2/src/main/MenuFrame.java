package main;

class MenuFrame extends FrameController {

    public MenuFrame () {
        setTitle("Login~ Step 2");
        initComponents();
    }

    protected void reset () {
        TransactionCheckBox.setSelected(false);
        SecurityCheckBox.setSelected(false);
        PasswordCheckBox.setSelected(false);
    }

    private void excecuteMenu () {

        if (frameselect[0]) {
            transFrame.setVisible(true);
            framecount = 0;
        } else if (frameselect[1]) {
            secFrame.setVisible(true);
            framecount = 1;
        } else if (frameselect[2]) {
            passFrame.setVisible(true);
            framecount = 2;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InstructionLabel = new javax.swing.JLabel();
        TransactionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TransactionCheckBox = new javax.swing.JCheckBox();
        SecurityCheckBox = new javax.swing.JCheckBox();
        PasswordCheckBox = new javax.swing.JCheckBox();
        ContinueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InstructionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        InstructionLabel.setText("Check at least one of these boxes");

        TransactionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TransactionLabel.setText("Bank Transaction:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Security questions:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Change Password:");

        TransactionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionCheckBoxActionPerformed(evt);
            }
        });

        SecurityCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityCheckBoxActionPerformed(evt);
            }
        });

        PasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordCheckBoxActionPerformed(evt);
            }
        });

        ContinueButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        ContinueButton.setText("Continue");
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InstructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TransactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TransactionCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecurityCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(InstructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TransactionCheckBox)
                    .addComponent(TransactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SecurityCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PasswordCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(ContinueButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransactionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionCheckBoxActionPerformed
        frameselect[0] = TransactionCheckBox.isSelected();
    }//GEN-LAST:event_TransactionCheckBoxActionPerformed

    private void SecurityCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityCheckBoxActionPerformed
        frameselect[1] = SecurityCheckBox.isSelected();
    }//GEN-LAST:event_SecurityCheckBoxActionPerformed

    private void PasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordCheckBoxActionPerformed
        frameselect[2] = PasswordCheckBox.isSelected();
    }//GEN-LAST:event_PasswordCheckBoxActionPerformed

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        dispose();
        excecuteMenu();
        reset();
    }//GEN-LAST:event_ContinueButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new MenuFrame().setVisible(true);
            }

        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueButton;
    private javax.swing.JLabel InstructionLabel;
    private javax.swing.JCheckBox PasswordCheckBox;
    private javax.swing.JCheckBox SecurityCheckBox;
    private javax.swing.JCheckBox TransactionCheckBox;
    private javax.swing.JLabel TransactionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
