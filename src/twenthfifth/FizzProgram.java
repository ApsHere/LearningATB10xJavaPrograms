package twenthfifth;

public class FizzProgram {
    /*Write a program that prints numbers from 1 to 100.
     However, for multiples of 3, print "Fizz" instead of the number, and
      for multiples of 5, print "Buzz."
      For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/
    public static void main(String[] args)
    {
        //System.out.println("Enter your number\n");
       // Scanner sc= new Scanner(system.in);
        //double num= sc.nextDouble();
        for(int i=0;i<=100;i++) {
            //System.out.println( i);
            if (i % 3 == 0) {
                System.out.println("The num is divisible by 3 :" + i);
                System.out.println("\nFizz!!!");

            } else if (i % 5 == 0) {
                System.out.println("The num is divisible by 5 :" + i);
                System.out.println("\nBuzz!!!");
            } else if (i%3 == 0 && i%5 == 0) {
                System.out.println("The num is %d is divisible by both 3 & 5 :" + i);
                System.out.println("\nFizzBuzz!!!");
            }
            else {
                System.out.println("\nThe num is not multiple either 3 or 5!!!" + i);
            }
            }
        }
}

