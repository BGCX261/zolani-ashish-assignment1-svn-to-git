package main;
// I added the imports here because we used them more then once, so it's more efficient
import java.awt.GridLayout;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class subPanel extends MainPanel {

    private JTextField[][] fieldmax = new JTextField[3][3];
    MaskFormatter Format;

    public subPanel() {
        setLayout(new GridLayout(3, 3));
        implement();

    }

    private void implement() {

        try {
            Format = new MaskFormatter("#");
            Format.setValidCharacters(" 123456789");
        } catch (ParseException EX) {
            JOptionPane.showMessageDialog(this, "GOOD GOD MAN, WHAT WERE YOU THINKING??!");
            System.exit(0);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int ii = i;
                final int jj = j;
                
                fieldmax[i][j] = new JFormattedTextField(Format);
                fieldmax[i][j].setSize(50, 50);
                fieldmax[i][j].setFont(new Font("Dialog", 0, 25));
                fieldmax[i][j].setHorizontalAlignment(JTextField.CENTER);
                fieldmax[i][j].addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent evt) {
                        fieldmax[ii][jj].setBackground(Color.YELLOW);
                    }

                    @Override
                    public void focusLost(FocusEvent evt) {
                        fieldmax[ii][jj].setBackground(Color.WHITE);
                    }
                });
                add((fieldmax[i][j]));
            }
        }
    }
}
