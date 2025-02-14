package ThirtyFirstJan;

import java.util.Scanner;

// if a Person Can Travel Based on Visa Status and Age.
public class VisaStatusAgecheck {
public static void main(String[] args)
{
    System.out.println("Enter Age: ");
    Scanner sc1= new Scanner(System.in);
    int age= sc1.nextInt();
    System.out.println("Enter Visa Status(Valid/ inValid)");
    Scanner sc2= new Scanner(System.in);
    String status=sc2.next();
   // String s1=
    if(age>=18 && status.equals("Valid"))
        System.out.println("You can fly. Congrats!!!");
    else if (age>=18 && status.equals("InValid"))
        System.out.println("You visa is not approved . Cant Travel!!!");
    else
        System.out.println("not valid document!!!");
}
}
