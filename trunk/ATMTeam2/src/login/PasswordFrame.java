package login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class PasswordFrame extends LoginClass {

    // All mighty boolean
    private boolean valid = false;

    public PasswordFrame () {
        initComponents();
    }

    // All frames are static, so they need to be cleared after use
    @Override
    protected void reset () {
        OldPasswordField.setText(null);
        NewPasswordField.setText(null);
        RepPasswordField.setText(null);
    }

    // Check if new password satisfies rules (10-15 characters, etc.)
    private boolean checkValidChar (String string) {

        boolean number = false;
        boolean uppercase = false;
        boolean lowercase = false;

        if (string.length() < 10 || string.length() > 15) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
                number = true;
            }

            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                uppercase = true;
            }

            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                lowercase = true;
            }
        }

        if (number && uppercase && lowercase) {
            return true;
        } else {
            return false;
        }

    }

    // Check if OldPasswordField = the password; updates boolean "valid"
    private void validateOldPassword () {

        if (OldPasswordField.getText().isEmpty()) {
            OldValidLabel.setText(null);
        } else if (OldPasswordField.getText().equals(password)) {
            OldValidLabel.setForeground(Color.GREEN);
            OldValidLabel.setText("Matches!");
            valid = true;
        } else {
            OldValidLabel.setForeground(Color.RED);
            OldValidLabel.setText("Does not match");
            valid = false;
        }
    }

    // Check if passwords match; updates boolean "valid"
    private void validateNewPassword () {

        // Are both password fields empty?
        if (NewPasswordField.getText().isEmpty() && RepPasswordField.getText().isEmpty()) {

            MatchProgressBar.setValue(0);
            ValidLabel.setForeground(Color.black);
            ValidLabel.setText("Empty");
            valid = false;

            // Is one password field empty?
        } else if (NewPasswordField.getText().isEmpty() || RepPasswordField.getText().isEmpty()) {

            MatchProgressBar.setForeground(Color.BLUE);
            MatchProgressBar.setValue(35);
            ValidLabel.setForeground(Color.BLUE);
            ValidLabel.setText("Almost there!");
            valid = false;

            //Are both password fields equal?
        } else if (checkEqual(RepPasswordField.getText(), NewPasswordField.getText())) {

            // Do the passwords satisfy the character rules?  
            if (checkValidChar(RepPasswordField.getText())) {

                //Passwords match and are valid
                MatchProgressBar.setForeground(Color.GREEN);
                MatchProgressBar.setValue(100);
                ValidLabel.setForeground(Color.GREEN);
                ValidLabel.setText("Matches!");
                valid = true;

            } else {
                // Passwords match but aren't valid
                MatchProgressBar.setForeground(Color.RED);
                MatchProgressBar.setValue(50);
                ValidLabel.setForeground(Color.RED);
                ValidLabel.setText("Not Valid");
                valid = false;

            }
        } else {

            // Passwords do not match
            MatchProgressBar.setForeground(Color.RED);
            MatchProgressBar.setValue(70);
            ValidLabel.setForeground(Color.RED);
            ValidLabel.setText("Does not match");
            valid = false;

        }


    }

    @Override
    protected void secExit () {
        JOptionPane.showMessageDialog(this, "Incorrect Answers! Safety exiting..");
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitButton = new javax.swing.JButton();
        OldPasswordLabel = new javax.swing.JLabel();
        NewPasswordLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        OldPasswordField = new javax.swing.JPasswordField();
        NewPasswordField = new javax.swing.JPasswordField();
        RepPasswordLabel = new javax.swing.JLabel();
        RepPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        MatchProgressBar = new javax.swing.JProgressBar();
        ValidLabel = new javax.swing.JLabel();
        PasswordRulesLabel = new javax.swing.JLabel();
        OldValidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SubmitButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        OldPasswordLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        OldPasswordLabel.setText("Enter your old password");

        NewPasswordLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NewPasswordLabel.setText("Enter your new password ");

        OldPasswordField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                OldPasswordFieldCaretUpdate(evt);
            }
        });

        NewPasswordField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NewPasswordFieldCaretUpdate(evt);
            }
        });

        RepPasswordLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        RepPasswordLabel.setText("Repeat your new password");

        RepPasswordField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                RepPasswordFieldCaretUpdate(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Change your Password");

        MatchProgressBar.setForeground(new java.awt.Color(51, 255, 0));
        MatchProgressBar.setToolTipText("");
        MatchProgressBar.setOpaque(true);

        ValidLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ValidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PasswordRulesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PasswordRulesLabel.setText("10-15 Characters; Uppercase; Lowercase; Numbers");

        OldValidLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OldPasswordLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RepPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewPasswordField)
                            .addComponent(RepPasswordField)
                            .addComponent(OldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MatchProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValidLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(OldValidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(PasswordRulesLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(OldPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OldValidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordRulesLabel)
                .addGap(18, 18, 18)
                .addComponent(NewPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ValidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewPasswordField))
                .addGap(8, 8, 8)
                .addComponent(MatchProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(RepPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Old and new passwords must satify rules and match for (valid = true) = true
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        if (valid) {
            JOptionPane.showMessageDialog(this, "Password Changed!");
            setPassword(RepPasswordField.getText());
            confirmNextFrame();
            reset();
        } else {
            secExit();
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed
    // Caret Update is when text inside Field changes
    private void RepPasswordFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_RepPasswordFieldCaretUpdate
        validateNewPassword();
    }//GEN-LAST:event_RepPasswordFieldCaretUpdate

    private void NewPasswordFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NewPasswordFieldCaretUpdate
        validateNewPassword();
    }//GEN-LAST:event_NewPasswordFieldCaretUpdate

    private void OldPasswordFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_OldPasswordFieldCaretUpdate
        validateOldPassword();
    }//GEN-LAST:event_OldPasswordFieldCaretUpdate

    public static void main (String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run () {
                new PasswordFrame().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar MatchProgressBar;
    private javax.swing.JPasswordField NewPasswordField;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JPasswordField OldPasswordField;
    private javax.swing.JLabel OldPasswordLabel;
    private javax.swing.JLabel OldValidLabel;
    private javax.swing.JLabel PasswordRulesLabel;
    private javax.swing.JPasswordField RepPasswordField;
    private javax.swing.JLabel RepPasswordLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel ValidLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
