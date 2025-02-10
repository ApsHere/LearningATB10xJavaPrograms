package ninetinth_ternary;
import java.util.Scanner;

public class TriangleUsingIfelseif {
    public static void main(String[] args)
    {
        System.out.println("*** Program for finding triangle type**");
        System.out.println("*** Enter three sides of triangle");
        Scanner sc = new Scanner(System.in);
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        double d3=sc.nextDouble();
        if (d1<=0 || d2<=0 || d3<=0)
        {
            System.out.println("Invalid side please enter valid ones");
        }
        else {
            if (d1==d2 && d2==d3)
            {
                System.out.println("All sides equal");
            }
            else if(d1==d2 || d2==d3 || d3==d1)
             {
            System.out.println("only Two sides are equal");
             }
        else
        {
            System.out.println("only Two sides are equal");
        }


    }
    }
}
