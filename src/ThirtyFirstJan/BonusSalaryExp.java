package ThirtyFirstJan;

import java.util.Scanner;

//Calculate Bonus Based on Salary and Years of Experience.
public class BonusSalaryExp {
    public static void main(String[] args)
    {
        System.out.println("Enter Salary: ");
        Scanner sc1= new Scanner(System.in);
        double sal= sc1.nextDouble();
        System.out.println("Enter years of Exp: ");
        Scanner sc2= new Scanner(System.in);
        double exp= sc2.nextDouble();
        double bonus=0;
        if(exp<1)
            System.out.println("No bonus for new comer!");

        else if(exp>=1 && exp<=3) {
            bonus = (sal * 5) / 100;
            System.out.println(bonus + " is the bonus!");
        }
        else if (exp>=4 && exp<=6) {
            bonus = (sal * 10) / 100;
            System.out.println(bonus + " is the bonus!");
        }
        else  //(exp>=6)
        {
            bonus = (sal * 15) / 100;
            System.out.println(bonus + " is the bonus!");
        }


    }
}
