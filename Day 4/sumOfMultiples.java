//question no 3

import java.util.Scanner;

class sumOfMultiples
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer number: ");
        int n = sc.nextInt();

        int sum = 0;
        int t;

        for (int i = 0; i < n; i++) {
           
             t = 2 * (i - 1);

            if (t % 3 == 0) {
                sum = t;
            }
        }
        System.out.println("Sum of multiples of 3: " + sum);
         
     } 
}