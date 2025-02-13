package ThirtyFirstJan;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args)
    {
        System.out.println("Enter unit consumed: ");
        Scanner sc= new Scanner(System.in);
        double unit= sc.nextDouble();
        if(unit>0 && unit<=100)
        {
            unit= unit*0.50;
            System.out.println(unit+ " is the amount which needs to be paid");
        }
        else if(unit>=101 && unit<=200) {
            unit= unit*0.75;
            System.out.println(unit+ " is the amount which needs to be paid");
        }
        else if(unit>=201 && unit<=300) {
            unit= unit*1.20;
            System.out.println(unit+ " is the amount which needs to be paid");
        }
        else {
            unit= unit*1.50;
            System.out.println(unit+ " is the amount which needs to be paid");
        }

    }

}
