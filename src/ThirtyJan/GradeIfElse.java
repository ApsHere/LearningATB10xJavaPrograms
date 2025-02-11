package ThirtyJan;

import java.util.Scanner;

//Calculate Grades based on Marks
public class GradeIfElse {
    public static void main(String[] args) {
        System.out.println("Enter your marks pls");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if (d >= 0 && d <= 100) {
            if(d>=90 && d<=100)
                System.out.println("Great! your Grade is A+");
            else if(d>=80 && d<=89)
            System.out.println("Nice! your Grade is A");
            else if(d>=70 && d<=79)
            System.out.println("Your Grade is B.");
             else if(d>=60 && d<=69)
            System.out.println("Your Grade is C.");
              else if(d>=50 && d<=59)
            System.out.println("Your Grade is D.");
               else if(d>=40 && d<=49)
            System.out.println("Your Grade is E.");
               else
            System.out.println("Your Grade is F.Better luck next time!");
        }
        else
            System.out.println("Not a valid number!. Please Re try");
    }
}
