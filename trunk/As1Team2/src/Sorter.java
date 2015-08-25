import java.util.Scanner;

/**
 *
 * @author Lab4
 */
class Sorter{
    
    private int[] set;
    private String[] arraystring = new String[10];
    private int count = 0;
    private int sum = 0;
    private double average = 0;
    private int largest = 0;

    
    protected Sorter(){
        
    }
    
    // Make sort input into int-array
    protected void makeArray(String group){
        
        Scanner ScanTest = new Scanner(group);
        
        // Insert each Stirng variable into arraystring
        while(ScanTest.hasNext()){
            arraystring[count] = ScanTest.next();
            count++;    
        }
        
        set = new int[count];
        
        // Convert arraystring members into integers
        for(int i = 0; i < set.length; i++){
            set[i] = Integer.parseInt(arraystring[i]);
        }
        
    }
    
    protected int sum(){
        for(int i = 0; i < set.length; i++){
            sum += set[i];
        }
        
        return sum;
    }
    
    protected double average(){
        for(int i = 0; i < set.length; i++){
            average += set[i];}
        
            average /= set.length;
        
        return average;
    }
    
    protected int largest(){
        for(int i = 0; i < set.length; i++){
            if(set[i] > largest){
                largest = set[i];
            }
        }
        
        return largest;
    }
    
    protected int smallest(){
        
        int smallest = set[0];
        
        for(int i = 0; i < set.length; i++){
            if(set[i] < smallest){
                smallest = set[i];
            }
        }
        
        return smallest;
    }
    
    protected void clear(){
        
        count = 0;
        sum = 0;
        average = 0;
        largest = 0;
        
    }
}