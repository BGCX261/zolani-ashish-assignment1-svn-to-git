package bank;

public class TransactionFrame extends BankClass {

    public TransactionFrame () {
        setTitle("Transaction Module");
        initComponents();

        BalanceTextField.setEditable(false);
        NewBalanceTextField.setEditable(false);
        BalanceTextField.setText(Double.toString(currentBalance) + " $");
        AnotherTransactionButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TransactionGroup = new javax.swing.ButtonGroup();
        BankTranLabel = new javax.swing.JLabel();
        TranTypeLabel = new javax.swing.JLabel();
        DepositButton = new javax.swing.JRadioButton();
        WithdrawButton = new javax.swing.JRadioButton();
        BalanceButton = new javax.swing.JRadioButton();
        BalanceLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        NewBalanceLabel = new javax.swing.JLabel();
        BalanceTextField = new javax.swing.JTextField();
        TransactionTextField = new javax.swing.JTextField();
        NewBalanceTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        AnotherTransactionButton = new javax.swing.JButton();
        TransactionErrorLabel = new javax.swing.JLabel();
        DollarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BankTranLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BankTranLabel.setText("Bank Transaction");

        TranTypeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TranTypeLabel.setText("Transaction Type:");

        TransactionGroup.add(DepositButton);
        DepositButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DepositButton.setText("Deposit");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        TransactionGroup.add(WithdrawButton);
        WithdrawButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WithdrawButton.setText("Withdraw");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });

        TransactionGroup.add(BalanceButton);
        BalanceButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BalanceButton.setText("Balance");
        BalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceButtonActionPerformed(evt);
            }
        });

        BalanceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BalanceLabel.setText("Current balance:");

        AmountLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AmountLabel.setText("Transaction amount:");

        NewBalanceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NewBalanceLabel.setText("New balance:");

        SubmitButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        AnotherTransactionButton.setText("Another Transaction?");
        AnotherTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnotherTransactionButtonActionPerformed(evt);
            }
        });

        TransactionErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        DollarLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DollarLabel.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TransactionErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SubmitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnotherTransactionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DepositButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(WithdrawButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(BalanceButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AmountLabel)
                                            .addComponent(NewBalanceLabel)
                                            .addComponent(BalanceLabel))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BalanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(NewBalanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(TransactionTextField))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DollarLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(BankTranLabel))
                                    .addComponent(TranTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BankTranLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TranTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositButton)
                    .addComponent(WithdrawButton)
                    .addComponent(BalanceButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TransactionTextField)
                        .addComponent(DollarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewBalanceLabel)
                    .addComponent(NewBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TransactionErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(DoneButton)
                    .addComponent(AnotherTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyAnotherTransaction () {
        NewBalanceTextField.setText(Double.toString(newBalance) + " $");
        SubmitButton.setVisible(false);
        AnotherTransactionButton.setVisible(true);
    }

    private boolean isFilled () {
        if (TransactionTextField.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void setFieldsVisible (boolean visible) {

        if (visible == false) {
            AmountLabel.setVisible(false);
            TransactionTextField.setVisible(false);
            DollarLabel.setVisible(false);
            NewBalanceLabel.setVisible(false);
            NewBalanceTextField.setVisible(false);
        } else {
            AmountLabel.setVisible(true);
            TransactionTextField.setVisible(true);
            DollarLabel.setVisible(true);
            NewBalanceLabel.setVisible(true);
            NewBalanceTextField.setVisible(true);
        }
    }

    private void authenticate () {

        TransactionErrorLabel.setText("");

        if (isFilled()) {
            if (DepositButton.isSelected()) {
                if (Double.parseDouble(TransactionTextField.getText()) >= 0 && Double.parseDouble(TransactionTextField.getText()) <= 500) {
                    newBalance = currentBalance + Double.parseDouble(TransactionTextField.getText());
                    transAmount = Double.parseDouble(TransactionTextField.getText());
                    verifyAnotherTransaction();
                    updateTable("D", "Valid");
                    currentBalance = newBalance;
                    validCount++;
                } else {
                    TransactionErrorLabel.setText("Your amount is too large or less than zero.");
                    transAmount = Double.parseDouble(TransactionTextField.getText());
                    invalidCount++;
                    updateTable("D", "Invalid");
                }
            } else if (WithdrawButton.isSelected()) {

                if (Double.parseDouble(TransactionTextField.getText()) >= 0 & Double.parseDouble(TransactionTextField.getText()) <= 500) {
                    if (Double.parseDouble(TransactionTextField.getText()) <= currentBalance) {
                        newBalance = currentBalance - Double.parseDouble(TransactionTextField.getText());
                        transAmount = Double.parseDouble(TransactionTextField.getText());
                        verifyAnotherTransaction();
                        updateTable("W", "Valid");
                        currentBalance = newBalance;
                        validCount++;
                    } else {
                        TransactionErrorLabel.setText("You can't withdraw more than the balance.");
                        transAmount = Double.parseDouble(TransactionTextField.getText());
                        invalidCount++;
                        updateTable("W", "Invalid");
                    }

                } else {
                    TransactionErrorLabel.setText("Your amount is too large or less than zero.");
                }
            } else if (BalanceButton.isSelected()) {
                BalanceTextField.setText(Double.toString(currentBalance));
                NewBalanceTextField.setText(null);
            } else {
                TransactionErrorLabel.setText("You forgot to chose a transaction type.");
            }
        } else {
            TransactionErrorLabel.setText("You didn't enter an amount!");
        }
    }

    private void updateTable (String type, String valid) {
        dataRow[0] = Double.toString(currentBalance);
        dataRow[1] = type;
        dataRow[2] = Double.toString(transAmount);
        dataRow[3] = Double.toString(newBalance);
        dataRow[4] = valid;

        bankModel.addRow(dataRow);
    }

    private void setBankReport () {
        reset();
        dispose();
        tableFrame.updateTable();
        tableFrame.setVisible(true);
    }

    private void reset () {

        BalanceTextField.setText(Double.toString(currentBalance) + " $");
        NewBalanceTextField.setText(null);
        TransactionTextField.setText(null);
        TransactionErrorLabel.setText(null);
        AnotherTransactionButton.setVisible(false);
        SubmitButton.setVisible(true);

        setFieldsVisible(true);

    }

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        authenticate();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void BalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceButtonActionPerformed
        setFieldsVisible(false);
    }//GEN-LAST:event_BalanceButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
        setFieldsVisible(true);
    }//GEN-LAST:event_WithdrawButtonActionPerformed

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        setFieldsVisible(true);
    }//GEN-LAST:event_DepositButtonActionPerformed

    private void AnotherTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnotherTransactionButtonActionPerformed
        reset();
    }//GEN-LAST:event_AnotherTransactionButtonActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        setBankReport();
    }//GEN-LAST:event_DoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new TransactionFrame().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JButton AnotherTransactionButton;
    private javax.swing.JRadioButton BalanceButton;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JTextField BalanceTextField;
    private javax.swing.JLabel BankTranLabel;
    private javax.swing.JRadioButton DepositButton;
    private javax.swing.JLabel DollarLabel;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel NewBalanceLabel;
    private javax.swing.JTextField NewBalanceTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TranTypeLabel;
    private javax.swing.JLabel TransactionErrorLabel;
    private javax.swing.ButtonGroup TransactionGroup;
    private javax.swing.JTextField TransactionTextField;
    private javax.swing.JRadioButton WithdrawButton;
    // End of variables declaration//GEN-END:variables
}
