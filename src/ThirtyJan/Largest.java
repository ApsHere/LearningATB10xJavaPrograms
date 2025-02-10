package ThirtyJan;

import java.util.Scanner;

//Find largest of three num(user input)
public class Largest {
    public static void main(String[] args)
    {
        System.out.println("Enter your numbers");
        Scanner  sc1= new Scanner(System.in);
        Scanner  sc2= new Scanner(System.in);
        Scanner  sc3= new Scanner(System.in);
        int n1= sc1.nextInt();
        int n2= sc2.nextInt();
        int n3= sc3.nextInt();
        if(n1>n2 && n1>n3)
            System.out.println(""+n1+ "is the largest ");
        else if (n2>n3 && n2>n3)
            System.out.println(""+n2+ "is the largest ");
        else if  (n3>n1 && n3>n2)
            System.out.println(""+n3+ "is the largest ");
        else if((n1>n2 && n3>n1) || (n2>n1 && n3>n2))
            System.out.println(""+n3+ "is the largest ");
        else if((n1>n3 && n2>n1) || (n2>n3 && n2>n1))
            System.out.println(""+n2+ "is the largest ");

    }
}
