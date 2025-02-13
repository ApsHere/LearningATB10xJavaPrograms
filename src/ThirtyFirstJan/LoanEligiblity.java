package ThirtyFirstJan;

import java.util.Scanner;

//check if a person is eligible for a loan
public class LoanEligiblity {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Credit Salary:");
        Scanner sc3 = new Scanner(System.in);
        int x = sc1.nextInt();
        double y = sc2.nextDouble();
        int z = sc3.nextInt();
        if ((x >= 18) && x <= 80) {
            if (y >= 30000) { //--
                if (z >= 650 && z <= 850) {
                    System.out.println("Loan is applicable");
                } else
                    System.out.println("Based on Credit score loan is not permitted");
            } //---
        else
            System.out.println("Based on salary loan is not permitted");
    }
    else
    {
        System.out.println("Not applicable as per age");
    }
    }
}
