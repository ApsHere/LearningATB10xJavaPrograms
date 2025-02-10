package TwentyNinthDec;

import java.util.Scanner;

public class PositiveNegativeNum {
    //Check if a Number
    // is Positive or Negative.
    public static void main(String[] args)
    {
        System.out.println("Enter the number\n");
        Scanner sc= new Scanner(System.in);
        double num= sc.nextDouble();
        if(num>0){
            System.out.printf("The num %.2f is positive number " , num);
           /* %d → Used for integers (int, long, short).
%f → Used for floating-point numbers (double, float).
%.2f → Formats num to 2 decimal places.
%n → Ensures a newline after printing.*/
        }
        else {
            System.out.println("The num " +num+ " is negative number " );
        }
    }
   // num.close();
}
