package ThirtyJan;
import java.sql.SQLOutput;
import java.util.Scanner;

//Program to check if a number is a leap year: if a num is divisible by 4 its leap year if by 400
// its century num if divisible by 100,200 300 400 500 or any 600 700 etc
public class LeapYear {
 public static void main(String[] args)
 {
    System.out.println("Enter the year you want to check");
    Scanner sc= new Scanner(System.in);
    Long d= sc.nextLong();
    if(d%4==0 && d%400!=0)
        System.out.println(""+d+" is a leap year only");
    else if(d%4==0 && d%400==0)
        System.out.println(""+d+" is a leap year and also a century year");
    else
        System.out.println("Its not a leap year");
 }
}
