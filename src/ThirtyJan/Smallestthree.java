package ThirtyJan;

import java.util.Scanner;

public class Smallestthree {
    public static void main(String args[])
    {
        System.out.println("Enter three numbers");
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Scanner sc3= new Scanner(System.in);
        int n1= sc1.nextInt();
        int n2= sc2.nextInt();
        int n3= sc3.nextInt();
        if(n1<n2 && n1<n3)
            System.out.println("" +n1+ "is the smallest");
        else if(n2<n1 && n2<n3 )
            System.out.println("" +n2+ "is the smallest");
        else if(n3<n1 && n3<n2)
            System.out.println("" +n3+ "is the smallest");
        else
            System.out.println("Not valid");
    }
}
