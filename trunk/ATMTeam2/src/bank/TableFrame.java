package bank;

public class TableFrame extends BankClass {

    public TableFrame () {
        setTitle("Summary of Transactions");
        initComponents();
        bankModel.setColumnCount(5);
        bankModel.setColumnIdentifiers(new String[]{
                    "Current Balance", "Type of Transaction", "Transaction Amount", "New Balance", "Validity"
                });
    }

    protected void updateTable () {
        ValidCountLabel.setText("Valid Transactions: " + validCount);
        InvalidCountLabel.setText("Invalid Transactions: " + invalidCount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TableScrollPane = new javax.swing.JScrollPane();
        BankTable = new javax.swing.JTable();
        DoneButton = new javax.swing.JButton();
        ValidCountLabel = new javax.swing.JLabel();
        InvalidCountLabel = new javax.swing.JLabel();
        SummaryLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BankTable.setModel(bankModel);
        BankTable.setColumnSelectionAllowed(true);
        BankTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPane.setViewportView(BankTable);
        BankTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        DoneButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        SummaryLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SummaryLabel.setText("Summary:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InvalidCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DoneButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValidCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SummaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SummaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValidCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoneButton)
                    .addComponent(InvalidCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        dispose();
        confirmNextFrame();
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
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new TableFrame().setVisible(true);
            }

        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BankTable;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel InvalidCountLabel;
    private javax.swing.JLabel SummaryLabel;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel ValidCountLabel;
    // End of variables declaration//GEN-END:variables
}
