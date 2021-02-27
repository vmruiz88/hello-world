/*****
 Victor Ruiz 
 ******/


public class GitDemo{
    
    private double previousNumber;
    
    public GitDemo(){
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        
        double add = previousNumber + num; 
        System.out.print(add);
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
         
        int newNumber =1; 
          for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        System.out.println(newNumber);
        return newNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321 
     *****/
    public double reverseNumber(int num){
       
        int reversed = 0; 
        while( num!=0){
            int temp = num % 10; 
            reversed = reversed *10 + temp; 
            num /=10; 
        }
         
        return reversed;
    }
    
}

