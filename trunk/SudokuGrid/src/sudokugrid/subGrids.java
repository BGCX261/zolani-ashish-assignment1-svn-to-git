
package sudokugrid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//import Grid.Sudoku;
/**
 *
 * @author Ashish
 */
public class subGrids extends SudokuGrid {
    private static boolean noRowDuplicateFound = true;
    private static boolean noColDuplicateFound = true;
    private static boolean noSubGridDuplicateFound = true;
    private static ArrayList<Integer> duplicateFinder = new ArrayList<>();
   
    private static ArrayList<Integer> subgridArraylist = new ArrayList<>();
    private ArrayList<Object> searched = new ArrayList<>();
    
    private static int subgridNum = 0;
    
    public subGrids(){

    }
    
   public static boolean CheckRowForRepetitions(){
       for(int i = 0; i < 9; i++){
           duplicateFinder.clear();
           for(int j = 0; j < 9; j++){
               duplicateFinder.add(Integer.parseInt(EntryFields[i][j].getText()));
           }
           Set<Integer> set = new HashSet<>(duplicateFinder);
          
           if(set.size() < 9){
               noRowDuplicateFound = false;
               break;
           }
       }
       return noRowDuplicateFound;
   }
   
   public static boolean CheckColForRepetitions(){
       for(int j = 0; j < 9; j++){
           duplicateFinder.clear();
           for(int i = 0; i < 9; i++){
               duplicateFinder.add(Integer.parseInt(EntryFields[i][j].getText()));
           }
           Set<Integer> set = new HashSet<>(duplicateFinder);
           if(set.size() < 9){
               noColDuplicateFound = false;
               break;
           }
       }
       return noColDuplicateFound;
   }
   
   public static boolean CheckSubGForRepetitions(){ // <-- This works
 
       for(int numtimes = 0; numtimes <9; numtimes++){  
           toFirstLoop:
           for(int i = 0; i < 9; i++){
               for(int j = 0; j < 9; j++){
                   if(getSubgridNum(i,j) == numtimes){
                       subgridArraylist.add(Integer.parseInt(EntryFields[i][j].getText()));
                       if(subgridArraylist.size() == 9){
                           break toFirstLoop;
                       }
                   }
               }
           }
           Set<Integer> hashSetsubGrid = new HashSet<>(subgridArraylist);
           
           if(hashSetsubGrid.size() < 9){
               noSubGridDuplicateFound = false;
               return noSubGridDuplicateFound;    
           }
           if(subgridArraylist.size() == 9){
               hashSetsubGrid.clear();
               subgridArraylist.clear();
           }
       }
       return noSubGridDuplicateFound;
   }
   
   public static int getSubgridNum(int row,int col ){
       
       subgridNum = (row/3*3 + col/3);
       return subgridNum;
   }
   
   public Object searchSG(int digit, int row, int col){ 
       searched.clear();
       
       boolean found = false;
       
       for(int i = 0; i < 9; i++){
           for(int j = 0; j < 9; j++){
               if(Integer.parseInt(EntryFields[i][j].getText()) == digit){
                   found = true;
                   searched.add(found);
                   searched.add(i);
                   searched.add(j);
               }
           }
       }
       
       if(!found){
           searched.add(found);
       }
       
       return searched;  
       
       
   }
   
   public Object SearchCol(int digit, int row, int col){
       searched.clear();
       
       boolean found = false;
       
       for(int i = 0; i < 9; i++){
           if(EntryFields[i][col].getText().equals(Integer.toString(digit))){
               found = true;
               searched.add(found);
               searched.add(i);
               searched.add(col);
           }   
       }
       if(!found){
           searched.add(found);
       }
       
       return searched;
   }
   
   public Object searchRow(int digit, int row, int col){
       
       searched.clear();
       boolean found = false;
       
       for(int j = 0; j < 9; j++){
           if(EntryFields[row][j].getText().equals(Integer.toString(digit))){
               found = true;
               searched.add(found);
               searched.add(row);
               searched.add(j);
           }
       }
       if(!found){
           searched.add(found);
       }
       
       return searched;
   }
   
   public boolean CheckSolution(){
       if(CheckRowForRepetitions() && CheckColForRepetitions() && CheckSubGForRepetitions()){
           return true;
       }else{
           return false;
       }
   }
}