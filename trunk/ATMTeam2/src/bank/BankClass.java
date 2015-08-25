package bank;

import javax.swing.table.DefaultTableModel;

class BankClass extends main.FrameController {

    protected static double currentBalance = 0;
    protected static double newBalance = 0;
    protected static int validCount = 0;
    protected static int invalidCount = 0;
    protected static double transAmount = 0;
    protected static String[] dataRow = new String[5];
    protected static DefaultTableModel bankModel = new DefaultTableModel() {
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false,};

        @Override
        public boolean isCellEditable (int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }

    };
}
