package SudokuApplet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/
//import SudokuGrid.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sudokugrid.SudokuGrid;
import sudokugrid.subGrids;
/**
 *
 * @author e1144876
 */
public class SudokuApplet extends JApplet implements ActionListener {
    
    JButton Test1= new JButton("Choice 1");
    JButton Test2= new JButton("Choice 2");
    JButton Test3= new JButton("Choice 3");
    JButton Test4= new JButton("Choice 4");
    sudokugrid.SudokuGrid Sudoku;
    
    
    public void init(){
        Container Panel = getContentPane();
        Panel.setLayout(new FlowLayout());
        Panel.add(Test1);
        Panel.add(Test2);
        Panel.add(Test3);
        Panel.add(Test4);
        
        Sudoku = new sudokugrid.SudokuGrid();
        

        Test1.addActionListener(this);
        Test2.addActionListener(this);
        Test3.addActionListener(this);
        Test4.addActionListener(this);
    }
    
    public void run(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("Choice 1")){
           JOptionPane.showMessageDialog(null, "Making empty grid");
           Sudoku.setVisible(true);
          // Sudoku.DisplayEmptyG();
           JOptionPane.showMessageDialog(null, "Creating sample Grid");
           Sudoku.createSampleGrid();
       } else if(e.getActionCommand().equals("Choice 2")){
           Sudoku.setVisible(true);
           JOptionPane.showMessageDialog(null, "Displaying sample grid");
           Sudoku.createSampleGrid();
           JOptionPane.showMessageDialog(null, "Displaying solution grid");
           Sudoku.createSolutionGrid();
       } else if(e.getActionCommand().equals("Choice 3")){
           
           
       } else if(e.getActionCommand().equals("Choice 4")){
           //clsSudokuFun play = new clsSudokuFun();
           //play.PlayVictory();
           clsSudokuFun.PlayFailure();
       }
    }
}
