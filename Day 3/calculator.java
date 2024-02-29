//question no 18

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (add, subtract, multiply, divide): ");
        String operator = scanner.next();
        
        double result = 0;
        
        switch(operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if(num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Error! Can't divide by zero.");
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
