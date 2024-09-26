package J8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 12, 35, 35, 28, 35, 28, 40, 50);

        Optional<Integer> thirdMax = numbers.stream()
            .distinct()                              // Remove duplicates
            .sorted(Comparator.reverseOrder())       // Sort in descending order
            .skip(2)                                 // Skip the first two (1st and 2nd max)
            .findFirst();                            // Find the 3rd max

        thirdMax.ifPresent(max -> 
            System.out.println("The Third Maximum Value is: " + max)
        );
        
        System.out.println("finally committing the code");
        
        double x = 28;    
        double y = 4;    
        
        Double d=Double.valueOf(y);
        Double e=x;
        System.out.println(d+" "+e);
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, 2));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));  
        
        
    }
}

