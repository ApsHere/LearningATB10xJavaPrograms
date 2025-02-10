package TwentyNinthDec;
import java.util.Scanner;
//Program for odd even
public class OddEven {
    public static void main( String[] args){
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        double num= sc.nextDouble();
        if (num%2==0) {
        System.out.println("The number is even " +num);
        }
        else {
            System.out.println("The number is odd " +num);
        }
    }
}
