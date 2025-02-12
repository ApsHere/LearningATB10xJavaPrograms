package ThirtyJan;

import java.util.Scanner;

//check if a number is a prime number
//A prime number is only divisible by 1 and itself.
public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<=1) {
            System.out.println("Number is not prime number");
        }
        else if(a==2 || a==3)
            System.out.println("Number is a prime number");
        else if(a%2==0 || a%3==0)
            System.out.println("Number is not a prime number");
        else {
            for (int i = 5; i * i <= a; i += 6) {
                if (a % i == 0 || a % (i + 2) == 0)
                    System.out.println("Not a prime number");
                //else
                  //  System.out.println("Its a prime number");
            }
        }

        }
    }
