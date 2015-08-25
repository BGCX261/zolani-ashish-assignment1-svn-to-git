package sudokugrid;
/*
 *
 * @author Ashish
 *
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class SudokuGrid extends JFrame{

    public static JTextField[][] EntryFields = new JFormattedTextField[9][9];
     Scanner input = null;
    
    public SudokuGrid() {
        setTitle("Sudoku");
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9,9));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisplayEmptyG();      
    }

    public void DisplayEmptyG(){
      MaskFormatter Format = null;

        try {
            Format = new MaskFormatter("*");
            Format.setValidCharacters(" 123456789");
        } catch (ParseException EX) {
            JOptionPane.showMessageDialog(this, "Terminating program.");
            System.exit(0);
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                EntryFields[row][col] = new JFormattedTextField(Format);
                EntryFields[row][col].setFont(new Font("Dialog", Font.BOLD, 30));
                EntryFields[row][col].setHorizontalAlignment(JTextField.CENTER);
                EntryFields[row][col].setText(" ");

                if ((row / 3 * 3 + col / 3) % 2 == 0) {
                    EntryFields[row][col].setBackground(Color.LIGHT_GRAY);
                } else {
                    EntryFields[row][col].setBackground(Color.WHITE);
                }
                add(EntryFields[row][col]);
            }
        }
    }   

    public void createSolutionGrid(){
        File file = new File("Solution.txt");
        try{
         input = new Scanner(file);   
        } catch(FileNotFoundException ex){
           // JOptionPane.showMessageDialog(this, "Terminating Program");
            System.exit(0);   
        }
       
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                addDigitToG(Integer.parseInt(input.next()), i, j);
            }
        } 
    }
    
    public void createSampleGrid(){
        File file = new File("Input.txt");
        try{
         input = new Scanner(file);   
        } catch(FileNotFoundException ex){
           // JOptionPane.showMessageDialog(this, "Terminating Program");
            System.exit(0);   
        }

         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                addDigitToG(Integer.parseInt(input.next()), i, j);
                if(EntryFields[i][j].getText().equals("0")){
                    EntryFields[i][j].setText(" ");
                }   
            }
        }        
    }
    
    public void addDigitToG(int digit, int row, int col){
       EntryFields[row][col].setText(Integer.toString(digit));
   } 
}