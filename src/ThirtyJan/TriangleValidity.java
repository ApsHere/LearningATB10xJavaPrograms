package ThirtyJan;

import java.util.Scanner;

//check validity of a triangle: Logic sum of two sides is >= third sides
public class TriangleValidity {
    public static void main(String[] args)
    {
        System.out.println("Enter the three sides of a triangle: ");
        Scanner sc1= new Scanner (System.in);
        Scanner sc2= new Scanner (System.in);
        Scanner sc3= new Scanner (System.in);
        int x= sc1.nextInt();
        int y= sc2.nextInt();
        int z= sc3.nextInt();
        if (x<(y+z) || y<(z+x) || z<(y+x))
            System.out.println("These sides are valid sides of a triangle");
        else
            System.out.println("Sides are invalid");
    }

}
