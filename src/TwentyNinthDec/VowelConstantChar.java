package TwentyNinthDec;

import java.util.Scanner;

public class VowelConstantChar {
    //Program to find if a char is vowel or constant
    public static void main(String[] args) {
       System.out.println("Enter you character if want to check or enter q if want to exit:");
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0); //reading char value, 0 indicates first char from string
        while(word !='Q' || word !='q') {
           // System.out.println("Enter you character if want to check or enter q if want to exit:");
            //Scanner sc = new Scanner(System.in);
            //char word = sc.next().charAt(0);

            if (word == 'A' || word == 'I' || word == 'O' || word == 'E' || word == 'U') {
                System.out.println(" This is Vowel char(in uppercase)");
              break;
            } else if (word == 'a' || word == 'i' || word == 'o' || word == 'e' || word == 'u') {
                System.out.println(" This is Vowel char(in lower case)");
               break;
            } else {
                System.out.println(" This is constant char");
               break;
            }

        }
        sc.close();
      System.out.println("Not executing as requested");
    }
}
