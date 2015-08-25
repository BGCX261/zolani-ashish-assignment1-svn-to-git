package Calculator;

/**
 *
 * @author Zolani
 */

    public class AddClass extends As1Class{

        public AddClass(){

        }
    
    public double add(String vara, String varb){

        result = getSum(vara, varb);
        return result;

    }
    
    // All get methods are private
    private double getSum(String vara, String varb){
       
       localresult = 0;
      
       num1 = Double.parseDouble(vara);
       num2 = Double.parseDouble(varb);
       localresult = num1 + num2;
       
       return localresult;
        
    }
    
    
    
}
