package TwentyNinthDec;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args)
    {
        System.out.println("Enter your age:");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age<18)
        {
            System.out.println("You are not eligible to vote as your age is " +age);
        }
        else System.out.println("Congrats! you are eligible to vote.");
    }
}
