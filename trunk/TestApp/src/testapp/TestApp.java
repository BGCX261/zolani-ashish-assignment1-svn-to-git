/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
 */
package testapp;
import java.util.Scanner;

/**
 * @author Zolani
 */
public class TestApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter Stuff!");
       
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println(addhundred(x, y));
        
        
    }
    
    private static int addhundred(int x, int rep){
                
        for(int i = 0; i < rep; i++){
            
            x += 100;
        }
        
        return x;
    }

}
