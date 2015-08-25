package Calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zolani
 */
public class DivideClass extends As1Class{
    
    public DivideClass(){
        
    }
    
    public double divide(String vara, String varb){
        
        result = getDivide(vara, varb);
        return result;
    }
    
    private double getDivide(String vara, String varb){
        
        num1 = Double.parseDouble(vara);
        num2 = Double.parseDouble(varb);
        localresult = num1 / num2;
        
        return localresult;
    }
    
}
