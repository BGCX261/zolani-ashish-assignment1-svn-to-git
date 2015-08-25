package login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class LoginFrame extends LoginClass {

    public LoginFrame () {
        initComponents();
    }

    private int loginattempts = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TitleLabel.setText("ATM Machine");

        UserNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UserNameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyPressed(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(TitleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(ClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(ExitButton)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UsernameField)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 66, Short.MAX_VALUE)
                        .addComponent(UserNameLabel)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(ClearButton)
                    .addComponent(ExitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Only used when login is *successful*; priority on resetting loginattempts
    @Override
    protected void reset () {
        PasswordField.setText("");
        UsernameField.setText("");
        loginattempts = 0;

    }

    // Acts on boolean returned by checkValid()
    private void authenticate () {

        ErrorLabel.setText("");
        ErrorLabel.setForeground(Color.red);

        if (UsernameField.getText().equals("") || PasswordField.getText().equals("")) {

            ErrorLabel.setText("You forgot to enter your username or password!");
        } else if (checkValid(UsernameField.getText(), PasswordField.getText())) {

            // Destroys login frame, replaces with menu frame      
            reset();
            dispose();
            moveToMenu();
        } else {
            ErrorLabel.setText("Invalid username/password: " + (2 - loginattempts) + " attempt(s) left.");
            loginattempts++;
            PasswordField.setText("");
        }

        if (loginattempts > 2) {
            secExit();
        }
    }

    // Security exit after 2+ login attempts
    @Override
    protected void secExit () {
        JOptionPane.showMessageDialog(this, "Too many login attempts.");
        System.exit(0);
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed

        System.exit(0);

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        PasswordField.setText("");
        UsernameField.setText("");

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        authenticate();

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            authenticate();
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void UsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            authenticate();
        }
    }//GEN-LAST:event_UsernameFieldKeyPressed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run () {
                new LoginFrame().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UsernameField;
    // End of variables declaration//GEN-END:variables
}
