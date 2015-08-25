package Calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zolani
 */
public class MultiClass extends As1Class{
    
    public MultiClass(){
        
    }
    
    public double multiply(String vara, String varb){
        
        result = getProduct(vara, varb);
        return result;
    }
    
    private double getProduct(String vara, String varb){
        
       num1 = Double.parseDouble(vara);
       num2 = Double.parseDouble(varb);
       localresult = num1 * num2;
        
       return localresult;
    }
    
}
