package ThirtyJan;

import java.util.Scanner;

//ATM withdrawal functionality
public class AtmSystem {
    public static void main(String[] args) {
        double x = 10000;
        System.out.println("Enter the amount you want to withdraw:");
        Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        if (y > 0 && y % 100 == 0 && !(y>x)){
            double z = x - y;
            System.out.println(z + " is the balance remaining");
        }
        else {
            System.out.println("Withdrawal has failed as the conditions are not met! Please retry.");
        }
    }
}
