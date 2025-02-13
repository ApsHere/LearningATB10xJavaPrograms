package ThirtyFirstJan;

import java.util.Scanner;

public class SalaryCaalculation {
    public static void main(String[] args)
    {
        System.out.println("Enter 1.Basic Pay, 2.HRA,3.DA,4.Tax Deductions ");
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        Scanner sc4=new Scanner(System.in);
        double BP= sc1.nextDouble();
        double HRA=sc2.nextDouble();
        double DA= sc3.nextDouble();
        double TaxD= sc4.nextDouble();
        double grosssal=BP+HRA+DA;
        double Netsal= grosssal-4;
                System.out.println(Netsal+ " is the net payable");

    }
}
