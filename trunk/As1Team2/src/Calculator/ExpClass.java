package Calculator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zolani
 */
public class ExpClass extends As1Class{
    
    
    public double exponentiate(String vara, String varb){
        
        result = getExponent(vara, varb);
        return result;
    }
    
    private double getExponent(String vara, String varb){

      num1 = Double.parseDouble(vara);
      num2 = Double.parseDouble(varb);
      localresult = Math.pow(num1, num2);

      return localresult;

  }
    
}
