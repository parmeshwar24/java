import java.lang.Math;

public class Engicalci {

   
    public static double add(double num1, double num2) {
       
        return num1 + num2;
    }

   
    public static double subtract(double num1, double num2) {
        
        return num1 - num2;
    }

    // Task 3: Implement multiplication functionality
    public static double multiply(double num1, double num2) {
       
        return num1 * num2;
    }

    // Task 4: Implement division functionality
    public static double divide(double num1, double num2) {
      
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        // Divide num1 by num2
        return num1 / num2;
    }

    // Task 5: Implement square root functionality
    public static double squareRoot(double num) {
        // Calculate square root
        if (num < 0) {
            throw new ArithmeticException("Cannot find square root of a negative number");
        }
        return Math.sqrt(num);
    }

    // Task 6: Implement power functionality
    public static double power(double base, double exponent) {
        // Calculate power
        return Math.pow(base, exponent);
    }

    // Task 7: Implement sine functionality
    public static double sine(double angle) {
        
        return Math.sin(angle);
    }

    // Task 8: Implement cosine functionality
    public static double cosine(double angle) {
      
        return Math.cos(angle);
    }

    public static void main(String[] args) {
        // Test addition functionality
        double resultAdd = add(5, 3);
        System.out.println("Addition Result: " + resultAdd);

        // Test subtraction functionality
        double resultSubtract = subtract(5, 3);
        System.out.println("Subtraction Result: " + resultSubtract);

        // Test multiplication functionality
        double resultMultiply = multiply(5, 3);
        System.out.println("Multiplication Result: " + resultMultiply);

        // Test division functionality
        double resultDivide = divide(10, 2);
        System.out.println("Division Result: " + resultDivide);

        // Test square root functionality
        double resultSquareRoot = squareRoot(9);
        System.out.println("Square Root Result: " + resultSquareRoot);

        // Test power functionality
        double resultPower = power(2, 3);
        System.out.println("Power Result: " + resultPower);

        // Test sine functionality
        double resultSine = sine(Math.PI / 6); 
        System.out.println("Sine Result: " + resultSine);

        // Test cosine functionality
        double resultCosine = cosine(Math.PI / 3); 
        System.out.println("Cosine Result: " + resultCosine);
    }
}


//task 9
 public static double cubeRoot(double num) {
       
        return Math.cbrt(num);
    }

    public static void main(String[] args) {
        // Test cube root functionality
        double input = 27;
        double expectedOutput = 3; 
        double result = cubeRoot(input);
        
       
        System.out.println("Cube Root Result: " + result);
        
       
        if (result == expectedOutput) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
} 

//task 10
 public static double log(double num, double base) {
       
        return Math.log(num) / Math.log(base);
    }

    public static void main(String[] args) {
        // Test logarithm functionality
        double num = 100;
        double base = 10;
        double expectedOutput = 2; 
        double result = log(num, base);
        
      
        System.out.println("Logarithm Result: " + result);
        
       
        if (result == expectedOutput) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
