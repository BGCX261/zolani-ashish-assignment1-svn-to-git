/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.text.*;


public class SudokuApp extends JFrame
{

   JTextField[][] entryFields = new JFormattedTextField[9][9];

   public SudokuApp()
   {

      setTitle("Sudoku");
      setSize(600, 600);
      setLocationRelativeTo(null);
      setLayout(new GridLayout(9,9));
      //getContentPane().setBackground(Color.black);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      makeFields();

      setVisible(true);
   }

   public static void main(String[]args){
       SudokuApp samplegrid = new SudokuApp();
   }
   public void makeFields()
   {

      MaskFormatter formatter = null;

      try
      {
         formatter = new MaskFormatter("*");
         formatter.setValidCharacters(" 123456789");
      }

      catch (java.text.ParseException e){}

      for(int row = 0; row < 9; row++)
      {
          int k = 1;
         for(int col = 0; col < 9; col++)
         {
             
            entryFields[row][col] = new JFormattedTextField(formatter);
            entryFields[row][col].setFont(new Font("Dialog", Font.PLAIN, 30));
            if((row/3*3 + col/3)%2==0){
                entryFields[row][col].setBackground(Color.LIGHT_GRAY);
            }
            entryFields[row][col].setHorizontalAlignment(JTextField.CENTER);
            
            System.out.print(row/3*3+col/3);  // <-----HAX FORMULA TO DENOTE SUBGRIDS
            if(k%3 == 0){
                System.out.print(" ");
            }
            if(k == 9){
                System.out.println();
            }
            k++;
            
            add(entryFields[row][col]);
         }
      }
   }

}