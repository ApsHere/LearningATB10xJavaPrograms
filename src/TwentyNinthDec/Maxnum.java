package TwentyNinthDec;

import java.util.Scanner;

public class Maxnum {
    //find the maximum numbers
    public static void main(String[] args)
    {
        System.out.println("Enter the numbers: ");
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        int num1= sc1.nextInt();
        int num2= sc2.nextInt();
        if(num1>num2){
            System.out.println(" num " +num1+ " is greater than " +num2 );
        }
        else
            System.out.println("num " +num2+ " is greater than " +num1 );
    }
}
