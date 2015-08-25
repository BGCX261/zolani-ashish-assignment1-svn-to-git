package Calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zolani
 */
public class SubtractClass extends As1Class{
    
    public SubtractClass(){
        
    }
    
    public double subtract(String vara, String varb){
        
        result = getDifference(vara, varb);
        return result;
    }
    
    private double getDifference(String vara, String varb){
        
       localresult = 0;
       num1 = Double.parseDouble(vara);
       num2 = Double.parseDouble(varb);
       localresult = num1 - num2;

       return localresult;
   }
    

    
}
